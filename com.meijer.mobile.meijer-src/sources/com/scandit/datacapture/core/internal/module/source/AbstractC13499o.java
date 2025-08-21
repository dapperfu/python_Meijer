package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.CameraPosition;

/* renamed from: com.scandit.datacapture.core.internal.module.source.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13499o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126062a;

    static {
        int[] iArr = new int[CameraPosition.values().length];
        try {
            iArr[CameraPosition.USER_FACING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraPosition.WORLD_FACING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CameraPosition.UNSPECIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f126062a = iArr;
    }
}
