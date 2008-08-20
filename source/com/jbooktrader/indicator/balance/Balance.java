package com.jbooktrader.indicator.balance;

import com.jbooktrader.platform.indicator.*;

/**
 * Mid depth balance for the last 1-second bar
 */
public class Balance extends Indicator {

    public Balance() {
    }

    @Override
    public double calculate() {
        value = marketBook.getLastMarketDepth().getMidBalance();
        return value;
    }
}
