package com.scandit.datacapture.barcode.internal.module.shared;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f123771a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f123772b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f123773c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f123774d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f123775e;

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f123775e.clone();
    }

    static {
        b bVar = new b("Initialized", 0);
        f123771a = bVar;
        b bVar2 = new b("Started", 1);
        f123772b = bVar2;
        b bVar3 = new b("Stopped", 2);
        f123773c = bVar3;
        b bVar4 = new b("Frozen", 3);
        f123774d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f123775e = bVarArr;
        EnumEntriesKt.a(bVarArr);
    }

    public b(String str, int i10) {
    }
}
