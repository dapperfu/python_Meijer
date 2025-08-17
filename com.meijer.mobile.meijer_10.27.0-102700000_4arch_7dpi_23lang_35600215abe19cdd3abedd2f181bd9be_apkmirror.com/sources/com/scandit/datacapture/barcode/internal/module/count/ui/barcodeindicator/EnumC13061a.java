package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC13061a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13061a f121426a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13061a f121427b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13061a f121428c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC13061a[] f121429d;

    public static EnumC13061a valueOf(String str) {
        return (EnumC13061a) Enum.valueOf(EnumC13061a.class, str);
    }

    public static EnumC13061a[] values() {
        return (EnumC13061a[]) f121429d.clone();
    }

    static {
        EnumC13061a enumC13061a = new EnumC13061a("BRUSH", 0);
        f121426a = enumC13061a;
        EnumC13061a enumC13061a2 = new EnumC13061a("RESOURCE", 1);
        f121427b = enumC13061a2;
        EnumC13061a enumC13061a3 = new EnumC13061a("BRUSHABLE_RESOURCE", 2);
        f121428c = enumC13061a3;
        EnumC13061a[] enumC13061aArr = {enumC13061a, enumC13061a2, enumC13061a3};
        f121429d = enumC13061aArr;
        EnumEntriesKt.a(enumC13061aArr);
    }

    public EnumC13061a(String str, int i10) {
    }
}
