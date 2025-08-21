package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum PDPContentType implements IncludeType {
    Reviews("Reviews"),
    Questions("Questions"),
    Answers("Answers"),
    Authors("Authors"),
    Stories("Stories");

    private final String key;

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }

    PDPContentType(String str) {
        this.key = str;
    }
}
