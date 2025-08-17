package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC13208a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13208a f123041a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13208a f123042b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13208a f123043c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13208a f123044d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC13208a f123045e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC13208a f123046f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC13208a f123047g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC13208a f123048h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC13208a f123049i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC13208a f123050j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC13208a f123051k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC13208a[] f123052l;

    public static EnumC13208a valueOf(String str) {
        return (EnumC13208a) Enum.valueOf(EnumC13208a.class, str);
    }

    public static EnumC13208a[] values() {
        return (EnumC13208a[]) f123052l.clone();
    }

    static {
        EnumC13208a enumC13208a = new EnumC13208a("TOUCH_DOWN", 0);
        f123041a = enumC13208a;
        EnumC13208a enumC13208a2 = new EnumC13208a("CLICK", 1);
        f123042b = enumC13208a2;
        EnumC13208a enumC13208a3 = new EnumC13208a("DRAG_UP", 2);
        f123043c = enumC13208a3;
        EnumC13208a enumC13208a4 = new EnumC13208a("DRAG_RIGHT", 3);
        f123044d = enumC13208a4;
        EnumC13208a enumC13208a5 = new EnumC13208a("DRAG_DOWN", 4);
        f123045e = enumC13208a5;
        EnumC13208a enumC13208a6 = new EnumC13208a("DRAG_LEFT", 5);
        f123046f = enumC13208a6;
        EnumC13208a enumC13208a7 = new EnumC13208a("LONG_PRESS_STARTED", 6);
        f123047g = enumC13208a7;
        EnumC13208a enumC13208a8 = new EnumC13208a("LONG_PRESS_FINISHED", 7);
        f123048h = enumC13208a8;
        EnumC13208a enumC13208a9 = new EnumC13208a("MOVE_STARTED", 8);
        f123049i = enumC13208a9;
        EnumC13208a enumC13208a10 = new EnumC13208a("MOVE_FINISHED", 9);
        f123050j = enumC13208a10;
        EnumC13208a enumC13208a11 = new EnumC13208a("TOUCH_UP", 10);
        f123051k = enumC13208a11;
        EnumC13208a[] enumC13208aArr = {enumC13208a, enumC13208a2, enumC13208a3, enumC13208a4, enumC13208a5, enumC13208a6, enumC13208a7, enumC13208a8, enumC13208a9, enumC13208a10, enumC13208a11};
        f123052l = enumC13208aArr;
        EnumEntriesKt.a(enumC13208aArr);
    }

    public EnumC13208a(String str, int i10) {
    }
}
