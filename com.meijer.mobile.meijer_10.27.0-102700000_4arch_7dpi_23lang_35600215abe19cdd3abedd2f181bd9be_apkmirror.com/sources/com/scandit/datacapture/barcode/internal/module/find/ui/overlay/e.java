package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f122258a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f122259b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f122260c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f122261d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f122262e;

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f122262e.clone();
    }

    static {
        e eVar = new e("INITIAL", 0);
        f122258a = eVar;
        e eVar2 = new e("MOVE_CLOSER", 1);
        f122259b = eVar2;
        e eVar3 = new e("TAP_TO_PAUSE", 2);
        f122260c = eVar3;
        e eVar4 = new e("TAP_TO_RESUME", 3);
        f122261d = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        f122262e = eVarArr;
        EnumEntriesKt.a(eVarArr);
    }

    public e(String str, int i10) {
    }
}
