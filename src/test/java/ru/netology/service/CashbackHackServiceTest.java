package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain600() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 600;
        int actual = bonus.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2000() {
        CashbackHackService bonus = new CashbackHackService();
        int amount = 2000;
        int actual = bonus.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}