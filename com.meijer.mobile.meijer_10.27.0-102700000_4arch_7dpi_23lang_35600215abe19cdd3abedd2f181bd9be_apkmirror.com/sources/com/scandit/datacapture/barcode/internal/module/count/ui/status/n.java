package com.scandit.datacapture.barcode.internal.module.count.ui.status;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f121818a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f121819b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n[] f121820c;

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f121820c.clone();
    }

    static {
        n nVar = new n("OnDemand", 0);
        f121818a = nVar;
        n nVar2 = new n("Always", 1);
        f121819b = nVar2;
        n[] nVarArr = {nVar, nVar2};
        f121820c = nVarArr;
        EnumEntriesKt.a(nVarArr);
    }

    public n(String str, int i10) {
    }
}
