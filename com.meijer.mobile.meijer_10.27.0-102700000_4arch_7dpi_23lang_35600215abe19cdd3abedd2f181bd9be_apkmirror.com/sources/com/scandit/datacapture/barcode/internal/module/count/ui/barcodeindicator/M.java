package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f121395a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f121396b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f121397c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ M[] f121398d;

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f121398d.clone();
    }

    static {
        M m10 = new M("NOT_USING_LIST", 0);
        f121395a = m10;
        M m11 = new M("IN_LIST", 1);
        f121396b = m11;
        M m12 = new M("NOT_IN_LIST", 2);
        f121397c = m12;
        M[] mArr = {m10, m11, m12};
        f121398d = mArr;
        EnumEntriesKt.a(mArr);
    }

    public M(String str, int i10) {
    }
}
