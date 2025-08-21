package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.module.source.NativeEdgeEnhancement;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.internal.module.source.NativeMacroAfMode;
import com.scandit.datacapture.core.internal.module.source.NativeNoiseReduction;
import com.scandit.datacapture.core.source.TorchState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125877a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f125878b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f125879c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f125880d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f125881e;

    static {
        int[] iArr = new int[NativeFocusStrategy.values().length];
        try {
            iArr[NativeFocusStrategy.FORCE_RETRIGGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeFocusStrategy.RETRIGGER_UNTIL_SCAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f125877a = iArr;
        int[] iArr2 = new int[NativeEdgeEnhancement.values().length];
        try {
            iArr2[NativeEdgeEnhancement.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NativeEdgeEnhancement.FAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NativeEdgeEnhancement.HIGH_QUALITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f125878b = iArr2;
        int[] iArr3 = new int[NativeNoiseReduction.values().length];
        try {
            iArr3[NativeNoiseReduction.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[NativeNoiseReduction.FAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[NativeNoiseReduction.HIGH_QUALITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f125879c = iArr3;
        int[] iArr4 = new int[NativeMacroAfMode.values().length];
        try {
            iArr4[NativeMacroAfMode.MACRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[NativeMacroAfMode.MANUAL_THEN_CONTINUOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f125880d = iArr4;
        int[] iArr5 = new int[TorchState.values().length];
        try {
            iArr5[TorchState.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr5[TorchState.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[TorchState.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        f125881e = iArr5;
    }
}
