package com.scandit.datacapture.barcode.internal.module.count.ui;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.M;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.N;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121581a;

    static {
        int[] iArr = new int[NativeBarcodeCountNotInListStatus.values().length];
        try {
            iArr[NativeBarcodeCountNotInListStatus.ACCEPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeBarcodeCountNotInListStatus.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121581a = iArr;
        int[] iArr2 = new int[M.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            M m10 = M.f121395a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            M m11 = M.f121395a;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[N.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            N n10 = N.f121399a;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            N n11 = N.f121399a;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
