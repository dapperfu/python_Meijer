package com.meijer.mobile.meijer.activity.checkout.review;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class W1 {

    /* renamed from: a, reason: collision with root package name */
    public static final W1 f105517a = new W1("SELECTING_TIP", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final W1 f105518b = new W1("TIP_LATER", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final W1 f105519c = new W1("SELECTED_TIP", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W1[] f105520d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f105521e;

    private static final /* synthetic */ W1[] a() {
        return new W1[]{f105517a, f105518b, f105519c};
    }

    static {
        W1[] w1ArrA = a();
        f105520d = w1ArrA;
        f105521e = EnumEntriesKt.a(w1ArrA);
    }

    public static W1 valueOf(String str) {
        return (W1) Enum.valueOf(W1.class, str);
    }

    public static W1[] values() {
        return (W1[]) f105520d.clone();
    }

    private W1(String str, int i10) {
    }
}
