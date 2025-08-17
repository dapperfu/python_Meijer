package com.meijer.mobile.meijer.activity.checkout.review;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/r;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f105015a = new r("ITEM1", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final r f105016b = new r("ITEM2", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final r f105017c = new r("ITEM3", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ r[] f105018d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f105019e;

    private static final /* synthetic */ r[] a() {
        return new r[]{f105015a, f105016b, f105017c};
    }

    public static EnumEntries<r> b() {
        return f105019e;
    }

    static {
        r[] rVarArrA = a();
        f105018d = rVarArrA;
        f105019e = EnumEntriesKt.a(rVarArrA);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f105018d.clone();
    }

    private r(String str, int i10) {
    }
}
