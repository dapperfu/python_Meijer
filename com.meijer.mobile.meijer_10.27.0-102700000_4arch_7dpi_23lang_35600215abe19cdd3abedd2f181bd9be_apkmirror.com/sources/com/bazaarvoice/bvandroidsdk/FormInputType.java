package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum FormInputType {
    BOOLEAN("BooleanInput"),
    FILE("FileInput"),
    INTEGER("IntegerInput"),
    SELECT("SelectInput"),
    TEXT_AREA("TextAreaInput"),
    TEXT_INPUT("TextInput"),
    URL("url"),
    CHOICE("choice"),
    TEXT("text");

    private final String value;

    public String getValue() {
        return this.value;
    }

    FormInputType(String str) {
        this.value = str;
    }
}
