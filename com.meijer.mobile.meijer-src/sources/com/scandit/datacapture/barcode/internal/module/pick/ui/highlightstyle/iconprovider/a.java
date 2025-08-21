package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123725a;

    static {
        int[] iArr = new int[BarcodePickState.values().length];
        try {
            iArr[BarcodePickState.IGNORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BarcodePickState.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BarcodePickState.TO_PICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BarcodePickState.PICKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f123725a = iArr;
    }
}
