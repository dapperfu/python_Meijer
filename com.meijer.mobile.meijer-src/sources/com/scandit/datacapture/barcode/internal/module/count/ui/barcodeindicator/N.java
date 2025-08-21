package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f122351a;

    /* renamed from: b, reason: collision with root package name */
    public static final N f122352b;

    /* renamed from: c, reason: collision with root package name */
    public static final N f122353c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ N[] f122354d;

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f122354d.clone();
    }

    static {
        N n10 = new N("SCANNED", 0);
        f122351a = n10;
        N n11 = new N("UNSCANNED", 1);
        f122352b = n11;
        N n12 = new N("FILTERED_OUT", 2);
        f122353c = n12;
        N[] nArr = {n10, n11, n12};
        f122354d = nArr;
        EnumEntriesKt.a(nArr);
    }

    public N(String str, int i10) {
    }
}
