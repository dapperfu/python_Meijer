package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategory;
import com.scandit.datacapture.core.common.geometry.Anchor;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13316f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123290a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f123291b;

    static {
        int[] iArr = new int[ScreenSizeCategory.values().length];
        try {
            iArr[ScreenSizeCategory.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenSizeCategory.MID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScreenSizeCategory.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f123290a = iArr;
        int[] iArr2 = new int[Anchor.values().length];
        try {
            iArr2[Anchor.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Anchor.TOP_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Anchor.TOP_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Anchor.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Anchor.CENTER_LEFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Anchor.BOTTOM_CENTER.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[Anchor.BOTTOM_RIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f123291b = iArr2;
    }
}
