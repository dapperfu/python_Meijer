package com.scandit.datacapture.barcode.internal.module.ui.popover;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.ui.popover.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC13390j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13390j f124348a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13390j f124349b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC13390j[] f124350c;

    public static EnumC13390j valueOf(String str) {
        return (EnumC13390j) Enum.valueOf(EnumC13390j.class, str);
    }

    public static EnumC13390j[] values() {
        return (EnumC13390j[]) f124350c.clone();
    }

    static {
        EnumC13390j enumC13390j = new EnumC13390j("HORIZONTAL", 0);
        f124348a = enumC13390j;
        EnumC13390j enumC13390j2 = new EnumC13390j("VERTICAL", 1);
        f124349b = enumC13390j2;
        EnumC13390j[] enumC13390jArr = {enumC13390j, enumC13390j2};
        f124350c = enumC13390jArr;
        EnumEntriesKt.a(enumC13390jArr);
    }

    public EnumC13390j(String str, int i10) {
    }
}
