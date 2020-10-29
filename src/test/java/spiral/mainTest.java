package spiral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    main cut;

    @BeforeEach
    void setup() {
        cut = new main();
    }

    @Test
    void spiral() {
        int[][] matrix = {
            {1,2,3,4,5,6},
            {2,3,4,5,6,7},
            {3,4,5,6,7,8}
        };

        int[] expectedSpiral = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,3,4,5,6};
        int[] actualSpiral = cut.spiral(matrix);

        assertArrayEquals(expectedSpiral, actualSpiral);
    }

    @Test
    void spiral2() {
        int[][] matrix = {
            {1},
            {2},
            {3}
        };

        int[] expectedSpiral = {1,2,3};
        int[] actualSpiral = cut.spiral(matrix);

        assertArrayEquals(expectedSpiral, actualSpiral);
    }

    @Test
    void spiral3() {
        int[][] matrix = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6},
                {4,5,6,7}
        };

        int[] expectedSpiral = {1,2,3,4,5,6,7,6,5,4,3,2,3,4,5,4};
        int[] actualSpiral = cut.spiral(matrix);

        assertArrayEquals(expectedSpiral, actualSpiral);
    }

    @Test
    void spiral4() {
        int[][] matrix = {};

        int[] expectedSpiral = {};
        int[] actualSpiral = cut.spiral(matrix);

        assertArrayEquals(expectedSpiral, actualSpiral);
    }

    @Test
    void spiral5() {
        int[][] matrix = {
                {1,2,3},
                {2,3,4},
                {3,4,5},
                {4,5,6},
                {5,6,7},
                {6,7,8}
        };

        int[] expectedSpiral = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,3,4,5,6};
        int[] actualSpiral = cut.spiral(matrix);

        assertArrayEquals(expectedSpiral, actualSpiral);
    }
}