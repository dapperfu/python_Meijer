package com.meijer.mobile.reviews.ux.rateandreview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/reviews/ux/rateandreview/s0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.reviews.ux.rateandreview.s0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC12795s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC12795s0 f116445a = new EnumC12795s0("Unchecked", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC12795s0 f116446b = new EnumC12795s0("CheckedYes", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC12795s0 f116447c = new EnumC12795s0("CheckedNo", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC12795s0[] f116448d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f116449e;

    private static final /* synthetic */ EnumC12795s0[] a() {
        return new EnumC12795s0[]{f116445a, f116446b, f116447c};
    }

    static {
        EnumC12795s0[] enumC12795s0ArrA = a();
        f116448d = enumC12795s0ArrA;
        f116449e = EnumEntriesKt.a(enumC12795s0ArrA);
    }

    public static EnumC12795s0 valueOf(String str) {
        return (EnumC12795s0) Enum.valueOf(EnumC12795s0.class, str);
    }

    public static EnumC12795s0[] values() {
        return (EnumC12795s0[]) f116448d.clone();
    }

    private EnumC12795s0(String str, int i10) {
    }
}
