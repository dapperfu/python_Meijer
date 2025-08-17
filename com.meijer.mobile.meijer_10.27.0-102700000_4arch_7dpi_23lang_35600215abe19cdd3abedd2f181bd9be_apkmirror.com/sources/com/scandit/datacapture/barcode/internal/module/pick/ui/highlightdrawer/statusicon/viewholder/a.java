package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f122710a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f122711b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f122712c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f122713d;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f122713d.clone();
    }

    static {
        a aVar = new a("Collapsed", 0);
        f122710a = aVar;
        a aVar2 = new a("Expanded", 1);
        f122711b = aVar2;
        a aVar3 = new a("Animating", 2);
        f122712c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f122713d = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
