package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f122770a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f122771b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f122772c;

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f122772c.clone();
    }

    static {
        n nVar = new n("OnDemand", 0);
        f122770a = nVar;
        n nVar2 = new n("Always", 1);
        f122771b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f122772c = nVarArr;
        EnumEntriesKt.a(nVarArr);
    }

    public n(String str, int i10) {
    }
}
