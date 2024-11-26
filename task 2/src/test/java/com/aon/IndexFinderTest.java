package com.aon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexFinderTest {

    @Test
    public void testSubarrayFound() {
        assertEquals(2, IndexFinder.findStartingIndex(new int[]{4, 9, 3, 7, 8}, new int[]{3, 7}));
    }

    @Test
    public void testSubarrayNotFound() {
        assertEquals(-1, IndexFinder.findStartingIndex(new int[]{4, 9, 3, 7, 8}, new int[]{7, 3}));
    }

    @Test
    public void testSubarrayAtStart() {
        assertEquals(0, IndexFinder.findStartingIndex(new int[]{4, 9, 3, 7, 8}, new int[]{4, 9}));
    }

    @Test
    public void testSubarrayAtEnd() {
        assertEquals(3, IndexFinder.findStartingIndex(new int[]{4, 9, 3, 7, 8}, new int[]{7, 8}));
    }

    @Test
    public void testEmptySubarray() {
        assertEquals(0, IndexFinder.findStartingIndex(new int[]{4, 9, 3, 7, 8}, new int[]{}));
    }

    @Test
    public void testSubarrayLargerThanArray() {
        assertEquals(-1, IndexFinder.findStartingIndex(new int[]{4, 9}, new int[]{4, 9, 3}));
    }

}