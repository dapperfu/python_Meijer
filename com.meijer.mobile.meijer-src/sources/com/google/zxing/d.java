package com.google.zxing;

import java.util.List;

/* loaded from: classes8.dex */
public enum d {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(p.class),
    ALLOWED_EAN_EXTENSIONS(int[].class),
    ALSO_INVERTED(Void.class);


    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f91640a;

    public Class<?> a() {
        return this.f91640a;
    }

    d(Class cls) {
        this.f91640a = cls;
    }
}
