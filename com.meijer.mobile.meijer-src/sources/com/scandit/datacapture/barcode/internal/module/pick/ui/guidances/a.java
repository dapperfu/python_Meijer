package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f123473a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f123474b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f123475c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f123476d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f123477e;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f123477e.clone();
    }

    static {
        a aVar = new a("None", 0);
        f123473a = aVar;
        a aVar2 = new a("Initial", 1);
        f123474b = aVar2;
        a aVar3 = new a("MoveCloser", 2);
        f123475c = aVar3;
        a aVar4 = new a("TapShutterToPause", 3);
        f123476d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f123477e = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
