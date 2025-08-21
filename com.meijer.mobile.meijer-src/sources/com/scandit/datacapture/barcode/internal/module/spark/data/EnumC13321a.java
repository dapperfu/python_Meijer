package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC13321a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13321a f123841b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13321a f123842c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC13321a[] f123843d;

    /* renamed from: a, reason: collision with root package name */
    public final String f123844a;

    public static EnumC13321a valueOf(String str) {
        return (EnumC13321a) Enum.valueOf(EnumC13321a.class, str);
    }

    public static EnumC13321a[] values() {
        return (EnumC13321a[]) f123843d.clone();
    }

    static {
        EnumC13321a enumC13321a = new EnumC13321a("USER", 0, "user");
        f123841b = enumC13321a;
        EnumC13321a enumC13321a2 = new EnumC13321a("TIMEOUT", 1, "timeout");
        f123842c = enumC13321a2;
        EnumC13321a[] enumC13321aArr = {enumC13321a, enumC13321a2};
        f123843d = enumC13321aArr;
        EnumEntriesKt.a(enumC13321aArr);
    }

    public EnumC13321a(String str, int i10, String str2) {
        this.f123844a = str2;
    }
}
