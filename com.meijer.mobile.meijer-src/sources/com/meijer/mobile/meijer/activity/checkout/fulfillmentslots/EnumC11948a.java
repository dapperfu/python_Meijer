package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class EnumC11948a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC11948a f103723a = new EnumC11948a("OutOfStock", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC11948a f103724b = new EnumC11948a("DeliveryPartnerInfo", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC11948a[] f103725c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f103726d;

    private static final /* synthetic */ EnumC11948a[] a() {
        return new EnumC11948a[]{f103723a, f103724b};
    }

    static {
        EnumC11948a[] enumC11948aArrA = a();
        f103725c = enumC11948aArrA;
        f103726d = EnumEntriesKt.a(enumC11948aArrA);
    }

    public static EnumC11948a valueOf(String str) {
        return (EnumC11948a) Enum.valueOf(EnumC11948a.class, str);
    }

    public static EnumC11948a[] values() {
        return (EnumC11948a[]) f103725c.clone();
    }

    private EnumC11948a(String str, int i10) {
    }
}
