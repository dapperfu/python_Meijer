package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f121704a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f121705b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f121706c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f121707d;

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f121707d.clone();
    }

    static {
        a aVar = new a("Splash", 0);
        f121704a = aVar;
        a aVar2 = new a("Main", 1);
        f121705b = aVar2;
        a aVar3 = new a("Final", 2);
        f121706c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f121707d = aVarArr;
        EnumEntriesKt.a(aVarArr);
    }

    public a(String str, int i10) {
    }
}
