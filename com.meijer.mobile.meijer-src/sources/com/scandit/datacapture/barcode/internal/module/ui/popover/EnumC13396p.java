package com.scandit.datacapture.barcode.internal.module.ui.popover;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC13396p {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13396p f124357a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13396p f124358b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13396p f124359c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13396p f124360d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC13396p[] f124361e;

    public static EnumC13396p valueOf(String str) {
        return (EnumC13396p) Enum.valueOf(EnumC13396p.class, str);
    }

    public static EnumC13396p[] values() {
        return (EnumC13396p[]) f124361e.clone();
    }

    static {
        EnumC13396p enumC13396p = new EnumC13396p("VERTICAL_BELOW", 0);
        f124357a = enumC13396p;
        EnumC13396p enumC13396p2 = new EnumC13396p("VERTICAL_ABOVE", 1);
        f124358b = enumC13396p2;
        EnumC13396p enumC13396p3 = new EnumC13396p("HORIZONTAL_LEFT", 2);
        f124359c = enumC13396p3;
        EnumC13396p enumC13396p4 = new EnumC13396p("HORIZONTAL_RIGHT", 3);
        f124360d = enumC13396p4;
        EnumC13396p[] enumC13396pArr = {enumC13396p, enumC13396p2, enumC13396p3, enumC13396p4};
        f124361e = enumC13396pArr;
        EnumEntriesKt.a(enumC13396pArr);
    }

    public EnumC13396p(String str, int i10) {
    }
}
