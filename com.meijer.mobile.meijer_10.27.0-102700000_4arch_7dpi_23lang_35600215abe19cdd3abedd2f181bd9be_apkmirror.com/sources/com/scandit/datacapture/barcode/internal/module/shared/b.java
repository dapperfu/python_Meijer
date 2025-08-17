package com.scandit.datacapture.barcode.internal.module.shared;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f122819a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f122820b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f122821c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f122822d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f122823e;

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f122823e.clone();
    }

    static {
        b bVar = new b("Initialized", 0);
        f122819a = bVar;
        b bVar2 = new b("Started", 1);
        f122820b = bVar2;
        b bVar3 = new b("Stopped", 2);
        f122821c = bVar3;
        b bVar4 = new b("Frozen", 3);
        f122822d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f122823e = bVarArr;
        EnumEntriesKt.a(bVarArr);
    }

    public b(String str, int i10) {
    }
}
