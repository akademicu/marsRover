package org.example.userLayer;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CheckForRightInputTest {

    //Scanner sc = new Scanner(System.in);

    @Test
    void getNumberTest() {

    }

    @Test
    void onlyMLandRTest() {
        //System.out.println(CheckForRightInput.onlyMLandR("bhmhgljhgm").toString());
        assertArrayEquals(new char[] {'M','L','M'},CheckForRightInput.onlyMLandR("bhmhgljhgm"));
        assertAll(
                ()->assertArrayEquals(new char[]{'M','M','R'},CheckForRightInput.onlyMLandR("mmrsd")),
                ()->assertArrayEquals(new char[]{'M','L','M','R'},CheckForRightInput.onlyMLandR("MldsmjhR")),
                ()->assertArrayEquals(null,CheckForRightInput.onlyMLandR("asdewds"))

        );

    }
}