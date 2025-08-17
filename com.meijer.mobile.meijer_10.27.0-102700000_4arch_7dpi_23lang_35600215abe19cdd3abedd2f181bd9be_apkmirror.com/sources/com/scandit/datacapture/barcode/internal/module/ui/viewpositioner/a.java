package com.scandit.datacapture.barcode.internal.module.ui.viewpositioner;

import com.scandit.datacapture.core.common.geometry.Anchor;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123423a;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.TOP_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.BOTTOM_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Anchor.CENTER_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Anchor.CENTER_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f123423a = iArr;
    }
}
