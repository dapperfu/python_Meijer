package com.scandit.datacapture.barcode.internal.module.count.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f122727a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f122728b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r[] f122729c;

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f122729c.clone();
    }

    static {
        r rVar = new r("UP", 0);
        f122727a = rVar;
        r rVar2 = new r("DOWN", 1);
        f122728b = rVar2;
        r[] rVarArr = {rVar, rVar2};
        f122729c = rVarArr;
        EnumEntriesKt.a(rVarArr);
    }

    public r(String str, int i10) {
    }
}
