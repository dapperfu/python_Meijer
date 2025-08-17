package com.scandit.datacapture.barcode.pick.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f123637a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f123638b;

    /* renamed from: c, reason: collision with root package name */
    public static final A f123639c;

    /* renamed from: d, reason: collision with root package name */
    public static final A f123640d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A[] f123641e;

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f123641e.clone();
    }

    static {
        A a10 = new A("NONE", 0);
        f123637a = a10;
        A a11 = new A("BITMAP", 1);
        f123638b = a11;
        A a12 = new A("RESOURCE", 2);
        f123639c = a12;
        A a13 = new A("SCANDIT", 3);
        f123640d = a13;
        A[] aArr = {a10, a11, a12, a13};
        f123641e = aArr;
        EnumEntriesKt.a(aArr);
    }

    public A(String str, int i10) {
    }
}
