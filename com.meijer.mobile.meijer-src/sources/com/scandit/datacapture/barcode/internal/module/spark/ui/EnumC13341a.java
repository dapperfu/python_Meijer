package com.scandit.datacapture.barcode.internal.module.spark.ui;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC13341a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13341a f123993a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13341a f123994b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13341a f123995c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13341a f123996d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC13341a f123997e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC13341a f123998f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC13341a f123999g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC13341a f124000h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC13341a f124001i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC13341a f124002j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC13341a f124003k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC13341a[] f124004l;

    public static EnumC13341a valueOf(String str) {
        return (EnumC13341a) Enum.valueOf(EnumC13341a.class, str);
    }

    public static EnumC13341a[] values() {
        return (EnumC13341a[]) f124004l.clone();
    }

    static {
        EnumC13341a enumC13341a = new EnumC13341a("TOUCH_DOWN", 0);
        f123993a = enumC13341a;
        EnumC13341a enumC13341a2 = new EnumC13341a("CLICK", 1);
        f123994b = enumC13341a2;
        EnumC13341a enumC13341a3 = new EnumC13341a("DRAG_UP", 2);
        f123995c = enumC13341a3;
        EnumC13341a enumC13341a4 = new EnumC13341a("DRAG_RIGHT", 3);
        f123996d = enumC13341a4;
        EnumC13341a enumC13341a5 = new EnumC13341a("DRAG_DOWN", 4);
        f123997e = enumC13341a5;
        EnumC13341a enumC13341a6 = new EnumC13341a("DRAG_LEFT", 5);
        f123998f = enumC13341a6;
        EnumC13341a enumC13341a7 = new EnumC13341a("LONG_PRESS_STARTED", 6);
        f123999g = enumC13341a7;
        EnumC13341a enumC13341a8 = new EnumC13341a("LONG_PRESS_FINISHED", 7);
        f124000h = enumC13341a8;
        EnumC13341a enumC13341a9 = new EnumC13341a("MOVE_STARTED", 8);
        f124001i = enumC13341a9;
        EnumC13341a enumC13341a10 = new EnumC13341a("MOVE_FINISHED", 9);
        f124002j = enumC13341a10;
        EnumC13341a enumC13341a11 = new EnumC13341a("TOUCH_UP", 10);
        f124003k = enumC13341a11;
        EnumC13341a[] enumC13341aArr = {enumC13341a, enumC13341a2, enumC13341a3, enumC13341a4, enumC13341a5, enumC13341a6, enumC13341a7, enumC13341a8, enumC13341a9, enumC13341a10, enumC13341a11};
        f124004l = enumC13341aArr;
        EnumEntriesKt.a(enumC13341aArr);
    }

    public EnumC13341a(String str, int i10) {
    }
}
