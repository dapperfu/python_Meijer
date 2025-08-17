package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintIcon;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125280a;

    static {
        int[] iArr = new int[NativeHintIcon.values().length];
        try {
            iArr[NativeHintIcon.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeHintIcon.CHECK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeHintIcon.EXCLAMATION_MARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NativeHintIcon.RESOURCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f125280a = iArr;
    }
}
