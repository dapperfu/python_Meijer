package com.meijer.mobile.coupon.detail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/coupon/detail/P;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final P f97260a = new P("SUCCESS_SNACKBAR", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final P f97261b = new P("ERROR_SNACKBAR", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ P[] f97262c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f97263d;

    private static final /* synthetic */ P[] a() {
        return new P[]{f97260a, f97261b};
    }

    static {
        P[] pArrA = a();
        f97262c = pArrA;
        f97263d = EnumEntriesKt.a(pArrA);
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) f97262c.clone();
    }

    private P(String str, int i10) {
    }
}
