package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f121382a;

    /* renamed from: b, reason: collision with root package name */
    public static final J f121383b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f121384c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ J[] f121385d;

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f121385d.clone();
    }

    static {
        J j10 = new J("ShowStatusView", 0);
        f121382a = j10;
        J j11 = new J("ShowNormalView", 1);
        f121383b = j11;
        J j12 = new J("ShowNothing", 2);
        f121384c = j12;
        J[] jArr = {j10, j11, j12};
        f121385d = jArr;
        EnumEntriesKt.a(jArr);
    }

    public J(String str, int i10) {
    }
}
