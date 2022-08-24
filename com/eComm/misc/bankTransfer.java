package com.eComm.misc;

public class bankTransfer {
    private String bankNumber;
    private String SWIFTCODE;
    private String accountHolder;
    private String bankName;

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getSWIFTCODE() {
        return SWIFTCODE;
    }

    public void setSWIFTCODE(String SWIFTCODE) {
        this.SWIFTCODE = SWIFTCODE;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
