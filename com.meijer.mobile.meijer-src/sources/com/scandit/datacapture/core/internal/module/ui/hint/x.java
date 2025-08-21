package com.scandit.datacapture.core.internal.module.ui.hint;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f126237a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f126238b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f126239c;

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f126239c.clone();
    }

    static {
        x xVar = new x("IDLE", 0);
        f126237a = xVar;
        x xVar2 = new x("EXECUTING", 1);
        f126238b = xVar2;
        x[] xVarArr = {xVar, xVar2};
        f126239c = xVarArr;
        EnumEntriesKt.a(xVarArr);
    }

    public x(String str, int i10) {
    }
}
