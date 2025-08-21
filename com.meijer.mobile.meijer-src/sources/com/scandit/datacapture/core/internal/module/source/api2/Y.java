package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f125820a;

    /* renamed from: b, reason: collision with root package name */
    public static final Y f125821b;

    /* renamed from: c, reason: collision with root package name */
    public static final Y f125822c;

    /* renamed from: d, reason: collision with root package name */
    public static final Y f125823d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Y[] f125824e;

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f125824e.clone();
    }

    static {
        Y y10 = new Y("TORCH_OFF", 0);
        f125820a = y10;
        Y y11 = new Y("TORCH_ON", 1);
        f125821b = y11;
        Y y12 = new Y("TORCH_ON_DELAY_TO_OFF", 2);
        f125822c = y12;
        Y y13 = new Y("TORCH_OFF_DELAY_TO_ON", 3);
        f125823d = y13;
        Y[] yArr = {y10, y11, y12, y13};
        f125824e = yArr;
        EnumEntriesKt.a(yArr);
    }

    public Y(String str, int i10) {
    }
}
