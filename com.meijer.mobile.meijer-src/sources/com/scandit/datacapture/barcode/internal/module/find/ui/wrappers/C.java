package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategory;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class C {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123266a;

    static {
        int[] iArr = new int[ScreenSizeCategory.values().length];
        try {
            iArr[ScreenSizeCategory.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenSizeCategory.MID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScreenSizeCategory.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f123266a = iArr;
    }
}
