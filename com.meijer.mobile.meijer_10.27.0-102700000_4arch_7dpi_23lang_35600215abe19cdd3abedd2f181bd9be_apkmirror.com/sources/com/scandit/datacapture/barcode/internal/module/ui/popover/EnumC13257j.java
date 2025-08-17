package com.scandit.datacapture.barcode.internal.module.ui.popover;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC13257j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13257j f123396a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13257j f123397b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC13257j[] f123398c;

    public static EnumC13257j valueOf(String str) {
        return (EnumC13257j) Enum.valueOf(EnumC13257j.class, str);
    }

    public static EnumC13257j[] values() {
        return (EnumC13257j[]) f123398c.clone();
    }

    static {
        EnumC13257j enumC13257j = new EnumC13257j("HORIZONTAL", 0);
        f123396a = enumC13257j;
        EnumC13257j enumC13257j2 = new EnumC13257j("VERTICAL", 1);
        f123397b = enumC13257j2;
        EnumC13257j[] enumC13257jArr = {enumC13257j, enumC13257j2};
        f123398c = enumC13257jArr;
        EnumEntriesKt.a(enumC13257jArr);
    }

    public EnumC13257j(String str, int i10) {
    }
}
