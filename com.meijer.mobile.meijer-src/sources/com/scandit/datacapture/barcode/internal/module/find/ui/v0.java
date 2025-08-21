package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f123259a;

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f123260b;

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f123261c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v0[] f123262d;

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f123262d.clone();
    }

    static {
        v0 v0Var = new v0("Started", 0);
        f123259a = v0Var;
        v0 v0Var2 = new v0("Paused", 1);
        f123260b = v0Var2;
        v0 v0Var3 = new v0("Stopped", 2);
        f123261c = v0Var3;
        v0[] v0VarArr = {v0Var, v0Var2, v0Var3};
        f123262d = v0VarArr;
        EnumEntriesKt.a(v0VarArr);
    }

    public v0(String str, int i10) {
    }
}
