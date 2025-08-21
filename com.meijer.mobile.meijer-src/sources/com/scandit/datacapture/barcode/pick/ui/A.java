package com.scandit.datacapture.barcode.pick.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f124589a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f124590b;

    /* renamed from: c, reason: collision with root package name */
    public static final A f124591c;

    /* renamed from: d, reason: collision with root package name */
    public static final A f124592d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A[] f124593e;

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f124593e.clone();
    }

    static {
        A a10 = new A("NONE", 0);
        f124589a = a10;
        A a11 = new A("BITMAP", 1);
        f124590b = a11;
        A a12 = new A("RESOURCE", 2);
        f124591c = a12;
        A a13 = new A("SCANDIT", 3);
        f124592d = a13;
        A[] aArr = {a10, a11, a12, a13};
        f124593e = aArr;
        EnumEntriesKt.a(aArr);
    }

    public A(String str, int i10) {
    }
}
