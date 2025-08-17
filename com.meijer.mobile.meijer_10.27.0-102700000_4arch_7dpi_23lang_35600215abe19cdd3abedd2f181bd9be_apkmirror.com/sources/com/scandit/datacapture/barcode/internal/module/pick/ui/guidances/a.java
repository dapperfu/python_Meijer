package com.scandit.datacapture.barcode.internal.module.pick.ui.guidances;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f122521a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f122522b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f122523c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f122524d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f122525e;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f122525e.clone();
    }

    static {
        a aVar = new a("None", 0);
        f122521a = aVar;
        a aVar2 = new a("Initial", 1);
        f122522b = aVar2;
        a aVar3 = new a("MoveCloser", 2);
        f122523c = aVar3;
        a aVar4 = new a("TapShutterToPause", 3);
        f122524d = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f122525e = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
