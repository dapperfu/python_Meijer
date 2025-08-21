package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum AuthorIncludeType implements IncludeType {
    REVIEWS("Reviews"),
    QUESTIONS("Questions"),
    ANSWERS("Answers"),
    COMMENTS("Comments");

    private final String key;

    @Override // java.lang.Enum
    public String toString() {
        return this.key;
    }

    AuthorIncludeType(String str) {
        this.key = str;
    }
}
