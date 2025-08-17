package com.scandit.datacapture.core.internal.module.ui.hint;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f125285a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f125286b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f125287c;

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f125287c.clone();
    }

    static {
        x xVar = new x("IDLE", 0);
        f125285a = xVar;
        x xVar2 = new x("EXECUTING", 1);
        f125286b = xVar2;
        x[] xVarArr = {xVar, xVar2};
        f125287c = xVarArr;
        EnumEntriesKt.a(xVarArr);
    }

    public x(String str, int i10) {
    }
}
