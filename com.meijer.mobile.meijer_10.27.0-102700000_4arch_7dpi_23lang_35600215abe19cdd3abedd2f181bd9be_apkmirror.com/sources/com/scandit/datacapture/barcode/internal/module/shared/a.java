package com.scandit.datacapture.barcode.internal.module.shared;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f122814a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f122815b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f122816c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f122817d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f122818e;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f122818e.clone();
    }

    static {
        a aVar = new a("Initialized", 0);
        f122814a = aVar;
        a aVar2 = new a("Resumed", 1);
        f122815b = aVar2;
        a aVar3 = new a("Paused", 2);
        f122816c = aVar3;
        a aVar4 = new a("Destroyed", 3);
        f122817d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f122818e = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
