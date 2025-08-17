package com.scandit.datacapture.barcode.internal.module.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f123339a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f123340b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f123341c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f123342d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f123343e;

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f123343e.clone();
    }

    static {
        j jVar = new j("Hidden", 0);
        f123339a = jVar;
        j jVar2 = new j("MoveAway", 1);
        f123340b = jVar2;
        j jVar3 = new j("MoveCloser", 2);
        f123341c = jVar3;
        j jVar4 = new j("TextOnly", 3);
        f123342d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f123343e = jVarArr;
        EnumEntriesKt.a(jVarArr);
    }

    public j(String str, int i10) {
    }
}
