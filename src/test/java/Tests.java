import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Tests {
    private static final String TESTS_FOLDER = "tests/";

    private static int getTestsCount() throws IOException {
        String inp = CharStreams.fromFileName(TESTS_FOLDER + "/tests_count.txt").toString();
        return Integer.parseInt(inp);
    }

    private static CharStream getTestInput(int pos) throws IOException {
        return CharStreams.fromFileName(String.format("%s/test%d_input.txt", TESTS_FOLDER, pos));
    }

    private static String getTestExpectedResult(int pos) throws IOException {
        return CharStreams.fromFileName(String.format("%s/test%d_expected_result.txt", TESTS_FOLDER, pos))
                .toString()
                .replaceAll("\r", "");
    }

    @Test
    public void all_tests() throws IOException {
        System.setErr(new PrintStream(new OutputStream() {public void write(int b) throws IOException {}}));

        int testsCount = getTestsCount();
        boolean[] passed = new boolean[testsCount];
        int passedCount = 0;
        for (int i = 1; i <= testsCount; i++) {
            String result = Main.parse(getTestInput(i));
            String expected = getTestExpectedResult(i);

            passed[i - 1] = result.equals(expected);
            if (passed[i - 1]) passedCount++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("\nPassed %d tests out of %d\n", passedCount, testsCount));
        for (int i = 0; i < testsCount; i++) {
            stringBuilder.append(String.format("Test #%d: %s\n", i + 1, passed[i] ? "passed" : "failed"));
        }
        System.out.println(stringBuilder.toString());

        Assert.assertEquals(testsCount, passedCount);
    }
}
