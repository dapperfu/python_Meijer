package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
enum Interest {
    LOW("LOW"),
    MEDIUM("MED"),
    HIGH("HIGH");

    private String value;

    public String getValue() {
        return this.value;
    }

    Interest(String str) {
        this.value = str;
    }
}
