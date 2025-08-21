package com.bazaarvoice.bvandroidsdk;

@Deprecated
/* loaded from: classes4.dex */
public final class BVVisit {
    private final String address;
    private final String city;
    private final long dwellTimeMillis;
    private final String name;
    private final String state;
    private final String storeId;
    private final String zip;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public long getDwellTimeMillis() {
        return this.dwellTimeMillis;
    }

    public String getName() {
        return this.name;
    }

    public String getState() {
        return this.state;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getZip() {
        return this.zip;
    }

    public BVVisit(String str, String str2, String str3, String str4, String str5, String str6, long j10) {
        this.name = str;
        this.address = str2;
        this.city = str3;
        this.state = str4;
        this.zip = str5;
        this.storeId = str6;
        this.dwellTimeMillis = j10;
    }
}
