package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f121399a;

    /* renamed from: b, reason: collision with root package name */
    public static final N f121400b;

    /* renamed from: c, reason: collision with root package name */
    public static final N f121401c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ N[] f121402d;

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f121402d.clone();
    }

    static {
        N n10 = new N("SCANNED", 0);
        f121399a = n10;
        N n11 = new N("UNSCANNED", 1);
        f121400b = n11;
        N n12 = new N("FILTERED_OUT", 2);
        f121401c = n12;
        N[] nArr = {n10, n11, n12};
        f121402d = nArr;
        EnumEntriesKt.a(nArr);
    }

    public N(String str, int i10) {
    }
}
