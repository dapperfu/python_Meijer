package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f122347a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f122348b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f122349c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ M[] f122350d;

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f122350d.clone();
    }

    static {
        M m10 = new M("NOT_USING_LIST", 0);
        f122347a = m10;
        M m11 = new M("IN_LIST", 1);
        f122348b = m11;
        M m12 = new M("NOT_IN_LIST", 2);
        f122349c = m12;
        M[] mArr = {m10, m11, m12};
        f122350d = mArr;
        EnumEntriesKt.a(mArr);
    }

    public M(String str, int i10) {
    }
}
