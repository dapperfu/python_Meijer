package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.CameraPosition;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123875a;

    static {
        int[] iArr = new int[CameraPosition.values().length];
        try {
            iArr[CameraPosition.USER_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f123875a = iArr;
    }
}
