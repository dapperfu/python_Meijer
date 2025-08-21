package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintAlignment;
import com.scandit.datacapture.core.internal.module.ui.NativeHintIcon;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class A {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126185a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f126186b;

    static {
        int[] iArr = new int[NativeHintAlignment.values().length];
        try {
            iArr[NativeHintAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeHintAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeHintAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f126185a = iArr;
        int[] iArr2 = new int[NativeHintIcon.values().length];
        try {
            iArr2[NativeHintIcon.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NativeHintIcon.RESOURCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f126186b = iArr2;
    }
}
