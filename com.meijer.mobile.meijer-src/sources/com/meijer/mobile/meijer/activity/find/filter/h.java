package com.meijer.mobile.meijer.activity.find.filter;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f107564a = new h("SEARCH", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h f107565b = new h("DEPARTMENT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h f107566c = new h("COLLECTION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f107567d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f107568e;

    private static final /* synthetic */ h[] a() {
        return new h[]{f107564a, f107565b, f107566c};
    }

    static {
        h[] hVarArrA = a();
        f107567d = hVarArrA;
        f107568e = EnumEntriesKt.a(hVarArrA);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f107567d.clone();
    }

    private h(String str, int i10) {
    }
}
