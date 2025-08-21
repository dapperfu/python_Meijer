package com.scandit.datacapture.barcode.internal.module.count.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f122653a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f122654b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f122655c;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f122655c.clone();
    }

    static {
        m mVar = new m("FIXED", 0);
        f122653a = mVar;
        m mVar2 = new m("FLOATING", 1);
        f122654b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f122655c = mVarArr;
        EnumEntriesKt.a(mVarArr);
    }

    public m(String str, int i10) {
    }
}
