package com.scandit.datacapture.barcode.internal.module.count.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f121701a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f121702b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f121703c;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f121703c.clone();
    }

    static {
        m mVar = new m("FIXED", 0);
        f121701a = mVar;
        m mVar2 = new m("FLOATING", 1);
        f121702b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f121703c = mVarArr;
        EnumEntriesKt.a(mVarArr);
    }

    public m(String str, int i10) {
    }
}
