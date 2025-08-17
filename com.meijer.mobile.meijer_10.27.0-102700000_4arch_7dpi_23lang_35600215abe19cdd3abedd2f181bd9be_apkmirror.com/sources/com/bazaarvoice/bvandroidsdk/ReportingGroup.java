package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum ReportingGroup {
    RECYCLERVIEW("recyclerView"),
    CUSTOM("custom");

    private String value;

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    ReportingGroup(String str) {
        this.value = str;
    }
}
