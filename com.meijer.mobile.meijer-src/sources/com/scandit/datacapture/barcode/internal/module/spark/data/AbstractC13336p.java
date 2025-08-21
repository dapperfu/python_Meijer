package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.CameraPosition;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13336p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123863a;

    static {
        int[] iArr = new int[CameraPosition.values().length];
        try {
            iArr[CameraPosition.USER_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f123863a = iArr;
    }
}
