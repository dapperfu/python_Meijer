package com.scandit.datacapture.barcode.internal.module.count.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f121775a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f121776b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f121777c;

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f121777c.clone();
    }

    static {
        r rVar = new r("UP", 0);
        f121775a = rVar;
        r rVar2 = new r("DOWN", 1);
        f121776b = rVar2;
        r[] rVarArr = {rVar, rVar2};
        f121777c = rVarArr;
        EnumEntriesKt.a(rVarArr);
    }

    public r(String str, int i10) {
    }
}
