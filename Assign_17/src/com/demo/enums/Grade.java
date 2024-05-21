package com.demo.enums;

public enum Grade {
	A(80, 100),
    B(65, 79),
    C(50, 64),
    D(40, 49),
    F(0, 39);

    private final int minMarks;
    private final int maxMarks;

    Grade(int minMarks, int maxMarks) {
        this.minMarks = minMarks;
        this.maxMarks = maxMarks;
    }

    public int getMinMarks() {
    	
        return minMarks;
    }

    public int getMaxMarks() {
    	
        return maxMarks;
    }
}
