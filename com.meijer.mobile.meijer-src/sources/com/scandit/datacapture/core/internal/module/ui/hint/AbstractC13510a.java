package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.internal.module.ui.NativeHintAlignment;
import com.scandit.datacapture.core.internal.module.ui.NativeHintCornerStyle;
import com.scandit.datacapture.core.internal.module.ui.NativeHintFont;
import com.scandit.datacapture.core.internal.module.ui.NativeHintHeight;
import com.scandit.datacapture.core.internal.module.ui.NativeHintWidth;

/* renamed from: com.scandit.datacapture.core.internal.module.ui.hint.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class AbstractC13510a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126203a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f126204b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f126205c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f126206d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f126207e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int[] f126208f;

    static {
        int[] iArr = new int[Anchor.values().length];
        try {
            iArr[Anchor.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Anchor.TOP_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Anchor.TOP_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Anchor.CENTER_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Anchor.CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Anchor.CENTER_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Anchor.BOTTOM_LEFT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Anchor.BOTTOM_CENTER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f126203a = iArr;
        int[] iArr2 = new int[NativeHintWidth.values().length];
        try {
            iArr2[NativeHintWidth.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[NativeHintWidth.WIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[NativeHintWidth.FIT_TEXT.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        f126204b = iArr2;
        int[] iArr3 = new int[NativeHintHeight.values().length];
        try {
            iArr3[NativeHintHeight.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[NativeHintHeight.TALLER.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        f126205c = iArr3;
        int[] iArr4 = new int[NativeHintFont.values().length];
        try {
            iArr4[NativeHintFont.BODY.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[NativeHintFont.FOOTNOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        f126206d = iArr4;
        int[] iArr5 = new int[NativeHintAlignment.values().length];
        try {
            iArr5[NativeHintAlignment.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[NativeHintAlignment.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[NativeHintAlignment.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        f126207e = iArr5;
        int[] iArr6 = new int[NativeHintCornerStyle.values().length];
        try {
            iArr6[NativeHintCornerStyle.ROUNDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr6[NativeHintCornerStyle.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        f126208f = iArr6;
    }
}
