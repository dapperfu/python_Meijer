package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f121958a;

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f121959b;

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f121960c;

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f121961d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a1[] f121962e;

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f121962e.clone();
    }

    static {
        a1 a1Var = new a1("AUDIO", 0);
        f121958a = a1Var;
        a1 a1Var2 = new a1("HAPTIC", 1);
        f121959b = a1Var2;
        a1 a1Var3 = new a1("STRAP_MODE", 2);
        f121960c = a1Var3;
        a1 a1Var4 = new a1("COLOR_SCHEME", 3);
        f121961d = a1Var4;
        a1[] a1VarArr = {a1Var, a1Var2, a1Var3, a1Var4};
        f121962e = a1VarArr;
        EnumEntriesKt.a(a1VarArr);
    }

    public a1(String str, int i10) {
    }
}
