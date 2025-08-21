package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import com.scandit.datacapture.core.source.CameraPosition;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124023a;

    static {
        int[] iArr = new int[CameraPosition.values().length];
        try {
            iArr[CameraPosition.USER_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f124023a = iArr;
    }
}
