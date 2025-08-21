package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.source.FrameSourceState;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13465e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125847a;

    static {
        int[] iArr = new int[FrameSourceState.values().length];
        try {
            iArr[FrameSourceState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FrameSourceState.STANDBY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f125847a = iArr;
    }
}
