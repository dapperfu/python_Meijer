package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class EnumC11823a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC11823a f102868a = new EnumC11823a("OutOfStock", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC11823a f102869b = new EnumC11823a("DeliveryPartnerInfo", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC11823a[] f102870c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f102871d;

    private static final /* synthetic */ EnumC11823a[] a() {
        return new EnumC11823a[]{f102868a, f102869b};
    }

    static {
        EnumC11823a[] enumC11823aArrA = a();
        f102870c = enumC11823aArrA;
        f102871d = EnumEntriesKt.a(enumC11823aArrA);
    }

    public static EnumC11823a valueOf(String str) {
        return (EnumC11823a) Enum.valueOf(EnumC11823a.class, str);
    }

    public static EnumC11823a[] values() {
        return (EnumC11823a[]) f102870c.clone();
    }

    private EnumC11823a(String str, int i10) {
    }
}
