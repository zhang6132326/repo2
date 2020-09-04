package com.zxf.bean2;

import org.springframework.stereotype.Component;

@Component
public class MathImpl implements MathI {
    public int add(int i, int j) {
        return i+j;
    }

    public int mul(int i, int j) {
        return i-j;
    }
}
