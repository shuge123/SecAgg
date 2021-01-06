package edu.bjut.psecagg.entity;

public class CipherShare {
    private long uId;
    private long vId;
    private byte[] cUId;
    private byte[] cVId;
    private byte[] buNumber;
    private byte[] buShare;
    private byte[] suNumber;
    private byte[] suShare;

    public CipherShare(long uId, long vId, byte[] cUId, byte[] cVId, byte[] buNumber, byte[] buShare, byte[] suNumber, byte[] suShare) {
        this.uId = uId;
        this.vId = vId;
        this.cUId = cUId;
        this.cVId = cVId;
        this.buNumber = buNumber;
        this.buShare = buShare;
        this.suNumber = suNumber;
        this.suShare = suShare;
    }

    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    public long getvId() {
        return vId;
    }

    public void setvId(long vId) {
        this.vId = vId;
    }

    public byte[] getcUId() {
        return cUId;
    }

    public void setcUId(byte[] cUId) {
        this.cUId = cUId;
    }

    public byte[] getcVId() {
        return cVId;
    }

    public void setcVId(byte[] cVId) {
        this.cVId = cVId;
    }

    public byte[] getBuNumber() {
        return buNumber;
    }

    public void setBuNumber(byte[] buNumber) {
        this.buNumber = buNumber;
    }

    public byte[] getBuShare() {
        return buShare;
    }

    public void setBuShare(byte[] buShare) {
        this.buShare = buShare;
    }

    public byte[] getSuNumber() {
        return suNumber;
    }

    public void setSuNumber(byte[] suNumber) {
        this.suNumber = suNumber;
    }

    public byte[] getSuShare() {
        return suShare;
    }

    public void setSuShare(byte[] suShare) {
        this.suShare = suShare;
    }
}
