package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f123662a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f123663b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f123664c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f123665d;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f123665d.clone();
    }

    static {
        a aVar = new a("Collapsed", 0);
        f123662a = aVar;
        a aVar2 = new a("Expanded", 1);
        f123663b = aVar2;
        a aVar3 = new a("Animating", 2);
        f123664c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f123665d = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
