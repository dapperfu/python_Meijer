package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum Feature {
    INVIEW("InView"),
    SCROLLED("Scrolled"),
    SWIPE("Swipe"),
    CONTENT_CLICK("ContentClick");

    private String value;

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    Feature(String str) {
        this.value = str;
    }
}
