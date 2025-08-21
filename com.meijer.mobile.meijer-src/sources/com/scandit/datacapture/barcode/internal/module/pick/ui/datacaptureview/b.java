package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.core.common.geometry.Anchor;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123438a;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.BOTTOM_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f123438a = iArr;
    }
}
