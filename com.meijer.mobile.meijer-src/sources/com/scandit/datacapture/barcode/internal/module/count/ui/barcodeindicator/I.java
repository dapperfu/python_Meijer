package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f122331a;

    /* renamed from: b, reason: collision with root package name */
    public static final I f122332b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ I[] f122333c;

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f122333c.clone();
    }

    static {
        I i10 = new I("Default", 0);
        f122331a = i10;
        I i11 = new I("IndicatorOnly", 1);
        f122332b = i11;
        I[] iArr = {i10, i11};
        f122333c = iArr;
        EnumEntriesKt.a(iArr);
    }

    public I(String str, int i10) {
    }
}
