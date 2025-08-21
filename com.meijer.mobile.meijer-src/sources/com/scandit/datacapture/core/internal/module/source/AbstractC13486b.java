package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.TorchState;

/* renamed from: com.scandit.datacapture.core.internal.module.source.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13486b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125965a;

    static {
        int[] iArr = new int[TorchState.values().length];
        try {
            iArr[TorchState.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TorchState.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f125965a = iArr;
    }
}
