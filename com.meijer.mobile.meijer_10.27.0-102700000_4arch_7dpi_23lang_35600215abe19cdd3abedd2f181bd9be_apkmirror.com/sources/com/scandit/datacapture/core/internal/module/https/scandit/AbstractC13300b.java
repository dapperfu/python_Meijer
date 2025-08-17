package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC13300b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124705a;

    static {
        int[] iArr = new int[NativeHttpsMethod.values().length];
        try {
            iArr[NativeHttpsMethod.GET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeHttpsMethod.POST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f124705a = iArr;
    }
}
