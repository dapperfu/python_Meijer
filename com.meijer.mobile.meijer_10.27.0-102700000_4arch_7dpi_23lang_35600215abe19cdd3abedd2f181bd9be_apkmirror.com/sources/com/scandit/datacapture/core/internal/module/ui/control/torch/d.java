package com.scandit.datacapture.core.internal.module.ui.control.torch;

import com.scandit.datacapture.core.source.TorchState;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125218a;

    static {
        int[] iArr = new int[TorchState.values().length];
        try {
            iArr[TorchState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TorchState.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TorchState.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f125218a = iArr;
    }
}
