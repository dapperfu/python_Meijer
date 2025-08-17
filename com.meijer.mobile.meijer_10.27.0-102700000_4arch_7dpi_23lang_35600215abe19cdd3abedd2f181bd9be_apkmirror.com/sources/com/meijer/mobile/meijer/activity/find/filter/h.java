package com.meijer.mobile.meijer.activity.find.filter;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f106708a = new h("SEARCH", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h f106709b = new h("DEPARTMENT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h f106710c = new h("COLLECTION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f106711d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f106712e;

    private static final /* synthetic */ h[] a() {
        return new h[]{f106708a, f106709b, f106710c};
    }

    static {
        h[] hVarArrA = a();
        f106711d = hVarArrA;
        f106712e = EnumEntriesKt.a(hVarArrA);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f106711d.clone();
    }

    private h(String str, int i10) {
    }
}
