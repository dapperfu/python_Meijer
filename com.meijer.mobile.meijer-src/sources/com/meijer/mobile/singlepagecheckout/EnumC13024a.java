package com.meijer.mobile.singlepagecheckout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC13024a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13024a f119130a = new EnumC13024a("None", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13024a f119131b = new EnumC13024a("OutOfStock", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13024a f119132c = new EnumC13024a("DeliveryPartnerInfo", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13024a f119133d = new EnumC13024a("AddEbtCard", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC13024a f119134e = new EnumC13024a("AddNewCreditCard", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC13024a f119135f = new EnumC13024a("AddWicCard", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC13024a f119136g = new EnumC13024a("DisplayAdjustEbtSheet", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC13024a f119137h = new EnumC13024a("InformationBottomSheetContent", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC13024a f119138i = new EnumC13024a("ExtendedDeliveryFee", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC13024a f119139j = new EnumC13024a("TermsAndConditions", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC13024a f119140k = new EnumC13024a("EbtPinPadPlaceOrder", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC13024a f119141l = new EnumC13024a("ChangeCard", 11);

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC13024a[] f119142m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f119143n;

    private static final /* synthetic */ EnumC13024a[] a() {
        return new EnumC13024a[]{f119130a, f119131b, f119132c, f119133d, f119134e, f119135f, f119136g, f119137h, f119138i, f119139j, f119140k, f119141l};
    }

    static {
        EnumC13024a[] enumC13024aArrA = a();
        f119142m = enumC13024aArrA;
        f119143n = EnumEntriesKt.a(enumC13024aArrA);
    }

    public static EnumC13024a valueOf(String str) {
        return (EnumC13024a) Enum.valueOf(EnumC13024a.class, str);
    }

    public static EnumC13024a[] values() {
        return (EnumC13024a[]) f119142m.clone();
    }

    private EnumC13024a(String str, int i10) {
    }
}
