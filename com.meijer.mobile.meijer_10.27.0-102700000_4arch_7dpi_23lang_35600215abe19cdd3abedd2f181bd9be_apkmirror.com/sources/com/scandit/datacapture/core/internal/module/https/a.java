package com.scandit.datacapture.core.internal.module.https;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f124677a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f124678b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f124679c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f124680d;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f124680d.clone();
    }

    static {
        a aVar = new a("NONE", 0);
        f124677a = aVar;
        a aVar2 = new a("CELLULAR", 1);
        f124678b = aVar2;
        a aVar3 = new a("UNRESTRICTED", 2);
        f124679c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f124680d = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
