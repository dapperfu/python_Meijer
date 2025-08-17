package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC13188a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13188a f122889b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13188a f122890c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC13188a[] f122891d;

    /* renamed from: a, reason: collision with root package name */
    public final String f122892a;

    public static EnumC13188a valueOf(String str) {
        return (EnumC13188a) Enum.valueOf(EnumC13188a.class, str);
    }

    public static EnumC13188a[] values() {
        return (EnumC13188a[]) f122891d.clone();
    }

    static {
        EnumC13188a enumC13188a = new EnumC13188a("USER", 0, "user");
        f122889b = enumC13188a;
        EnumC13188a enumC13188a2 = new EnumC13188a("TIMEOUT", 1, "timeout");
        f122890c = enumC13188a2;
        EnumC13188a[] enumC13188aArr = {enumC13188a, enumC13188a2};
        f122891d = enumC13188aArr;
        EnumEntriesKt.a(enumC13188aArr);
    }

    public EnumC13188a(String str, int i10, String str2) {
        this.f122892a = str2;
    }
}
