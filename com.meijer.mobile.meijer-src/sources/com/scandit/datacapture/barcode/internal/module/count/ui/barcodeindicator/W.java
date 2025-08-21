package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final W f122368b;

    /* renamed from: c, reason: collision with root package name */
    public static final W f122369c;

    /* renamed from: d, reason: collision with root package name */
    public static final W f122370d;

    /* renamed from: e, reason: collision with root package name */
    public static final W f122371e;

    /* renamed from: f, reason: collision with root package name */
    public static final W f122372f;

    /* renamed from: g, reason: collision with root package name */
    public static final W f122373g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ W[] f122374h;

    /* renamed from: a, reason: collision with root package name */
    public final int f122375a;

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f122374h.clone();
    }

    static {
        W w10 = new W("Recognized", 0, 0);
        f122368b = w10;
        W w11 = new W("Accepted", 1, 1);
        f122369c = w11;
        W w12 = new W("Rejected", 2, 2);
        f122370d = w12;
        W w13 = new W("NotInList", 3, 3);
        f122371e = w13;
        W w14 = new W("UnScanned", 4, 4);
        f122372f = w14;
        W w15 = new W("FilteredOut", 5, 5);
        f122373g = w15;
        W[] wArr = {w10, w11, w12, w13, w14, w15};
        f122374h = wArr;
        EnumEntriesKt.a(wArr);
    }

    public W(String str, int i10, int i11) {
        this.f122375a = i11;
    }
}
