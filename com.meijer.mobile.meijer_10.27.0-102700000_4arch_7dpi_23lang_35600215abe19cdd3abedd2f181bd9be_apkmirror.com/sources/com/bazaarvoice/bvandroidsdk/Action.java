package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum Action {
    Submit("Submit"),
    Preview("Preview"),
    Form("");

    private final String key;

    String getKey() {
        return this.key;
    }

    Action(String str) {
        this.key = str;
    }
}
