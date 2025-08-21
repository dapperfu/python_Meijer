package com.scandit.datacapture.core.internal.module.source;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public static final L f125740a;

    /* renamed from: b, reason: collision with root package name */
    public static final L f125741b;

    /* renamed from: c, reason: collision with root package name */
    public static final L f125742c;

    /* renamed from: d, reason: collision with root package name */
    public static final L f125743d;

    /* renamed from: e, reason: collision with root package name */
    public static final L f125744e;

    /* renamed from: f, reason: collision with root package name */
    public static final L f125745f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ L[] f125746g;

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f125746g.clone();
    }

    static {
        L l10 = new L("INACTIVE", 0);
        f125740a = l10;
        L l11 = new L("ACTIVE_SCAN", 1);
        f125741b = l11;
        L l12 = new L("FOCUSED_LOCKED", 2);
        f125742c = l12;
        L l13 = new L("NOT_FOCUSED_LOCKED", 3);
        f125743d = l13;
        L l14 = new L("FOCUS_DISTANCE_APPLIED", 4);
        f125744e = l14;
        L l15 = new L("MISSING_CAMERA_SUPPORT", 5);
        f125745f = l15;
        L[] lArr = {l10, l11, l12, l13, l14, l15};
        f125746g = lArr;
        EnumEntriesKt.a(lArr);
    }

    public L(String str, int i10) {
    }
}
