package com.scandit.datacapture.core.internal.module.source.api2;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f124868a;

    /* renamed from: b, reason: collision with root package name */
    public static final Y f124869b;

    /* renamed from: c, reason: collision with root package name */
    public static final Y f124870c;

    /* renamed from: d, reason: collision with root package name */
    public static final Y f124871d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Y[] f124872e;

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f124872e.clone();
    }

    static {
        Y y10 = new Y("TORCH_OFF", 0);
        f124868a = y10;
        Y y11 = new Y("TORCH_ON", 1);
        f124869b = y11;
        Y y12 = new Y("TORCH_ON_DELAY_TO_OFF", 2);
        f124870c = y12;
        Y y13 = new Y("TORCH_OFF_DELAY_TO_ON", 3);
        f124871d = y13;
        Y[] yArr = {y10, y11, y12, y13};
        f124872e = yArr;
        EnumEntriesKt.a(yArr);
    }

    public Y(String str, int i10) {
    }
}
