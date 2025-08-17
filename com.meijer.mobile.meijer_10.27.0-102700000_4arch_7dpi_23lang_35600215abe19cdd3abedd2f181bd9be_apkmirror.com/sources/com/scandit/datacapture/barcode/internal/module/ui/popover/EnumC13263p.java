package com.scandit.datacapture.barcode.internal.module.ui.popover;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC13263p {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13263p f123405a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13263p f123406b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13263p f123407c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13263p f123408d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC13263p[] f123409e;

    public static EnumC13263p valueOf(String str) {
        return (EnumC13263p) Enum.valueOf(EnumC13263p.class, str);
    }

    public static EnumC13263p[] values() {
        return (EnumC13263p[]) f123409e.clone();
    }

    static {
        EnumC13263p enumC13263p = new EnumC13263p("VERTICAL_BELOW", 0);
        f123405a = enumC13263p;
        EnumC13263p enumC13263p2 = new EnumC13263p("VERTICAL_ABOVE", 1);
        f123406b = enumC13263p2;
        EnumC13263p enumC13263p3 = new EnumC13263p("HORIZONTAL_LEFT", 2);
        f123407c = enumC13263p3;
        EnumC13263p enumC13263p4 = new EnumC13263p("HORIZONTAL_RIGHT", 3);
        f123408d = enumC13263p4;
        EnumC13263p[] enumC13263pArr = {enumC13263p, enumC13263p2, enumC13263p3, enumC13263p4};
        f123409e = enumC13263pArr;
        EnumEntriesKt.a(enumC13263pArr);
    }

    public EnumC13263p(String str, int i10) {
    }
}
