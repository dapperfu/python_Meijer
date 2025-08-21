package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC13194a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13194a f122378a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13194a f122379b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13194a f122380c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC13194a[] f122381d;

    public static EnumC13194a valueOf(String str) {
        return (EnumC13194a) Enum.valueOf(EnumC13194a.class, str);
    }

    public static EnumC13194a[] values() {
        return (EnumC13194a[]) f122381d.clone();
    }

    static {
        EnumC13194a enumC13194a = new EnumC13194a("BRUSH", 0);
        f122378a = enumC13194a;
        EnumC13194a enumC13194a2 = new EnumC13194a("RESOURCE", 1);
        f122379b = enumC13194a2;
        EnumC13194a enumC13194a3 = new EnumC13194a("BRUSHABLE_RESOURCE", 2);
        f122380c = enumC13194a3;
        EnumC13194a[] enumC13194aArr = {enumC13194a, enumC13194a2, enumC13194a3};
        f122381d = enumC13194aArr;
        EnumEntriesKt.a(enumC13194aArr);
    }

    public EnumC13194a(String str, int i10) {
    }
}
