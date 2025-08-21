package com.scandit.datacapture.barcode.internal.module.shared;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f123766a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f123767b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f123768c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f123769d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f123770e;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f123770e.clone();
    }

    static {
        a aVar = new a("Initialized", 0);
        f123766a = aVar;
        a aVar2 = new a("Resumed", 1);
        f123767b = aVar2;
        a aVar3 = new a("Paused", 2);
        f123768c = aVar3;
        a aVar4 = new a("Destroyed", 3);
        f123769d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f123770e = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
