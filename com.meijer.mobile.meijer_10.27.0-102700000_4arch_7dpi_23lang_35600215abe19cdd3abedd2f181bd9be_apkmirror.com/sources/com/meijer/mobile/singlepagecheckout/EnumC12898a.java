package com.meijer.mobile.singlepagecheckout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC12898a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC12898a f118135a = new EnumC12898a("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12898a f118136b = new EnumC12898a("OutOfStock", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12898a f118137c = new EnumC12898a("DeliveryPartnerInfo", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC12898a f118138d = new EnumC12898a("AddEbtCard", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC12898a f118139e = new EnumC12898a("AddNewCreditCard", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC12898a f118140f = new EnumC12898a("AddWicCard", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC12898a f118141g = new EnumC12898a("DisplayAdjustEbtSheet", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC12898a f118142h = new EnumC12898a("InformationBottomSheetContent", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC12898a f118143i = new EnumC12898a("ExtendedDeliveryFee", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC12898a f118144j = new EnumC12898a("TermsAndConditions", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC12898a f118145k = new EnumC12898a("EbtPinPadPlaceOrder", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC12898a f118146l = new EnumC12898a("ChangeCard", 11);

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC12898a[] f118147m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f118148n;

    private static final /* synthetic */ EnumC12898a[] a() {
        return new EnumC12898a[]{f118135a, f118136b, f118137c, f118138d, f118139e, f118140f, f118141g, f118142h, f118143i, f118144j, f118145k, f118146l};
    }

    static {
        EnumC12898a[] enumC12898aArrA = a();
        f118147m = enumC12898aArrA;
        f118148n = EnumEntriesKt.a(enumC12898aArrA);
    }

    public static EnumC12898a valueOf(String str) {
        return (EnumC12898a) Enum.valueOf(EnumC12898a.class, str);
    }

    public static EnumC12898a[] values() {
        return (EnumC12898a[]) f118147m.clone();
    }

    private EnumC12898a(String str, int i10) {
    }
}
