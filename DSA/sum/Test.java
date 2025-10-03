package sum;

public class Test {
    public static void runTests() {
        int result1 = Solution.sum(2, 3);
        assert result1 == 5 : "Test 1 failed";
        int result2 = Solution.sum(-1, 1);
        assert result2 == 0 : "Test 2 failed";
        System.out.println("All sum tests passed.");
    }

    public static void main(String[] args) {
        runTests();
    }
}
