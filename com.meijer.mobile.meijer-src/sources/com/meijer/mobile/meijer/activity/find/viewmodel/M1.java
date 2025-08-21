package com.meijer.mobile.meijer.activity.find.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/M1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M1 f108939a = new M1("SearchSuggestion", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final M1 f108940b = new M1("RecentSearches", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final M1 f108941c = new M1("NoRecentSearches", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ M1[] f108942d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f108943e;

    private static final /* synthetic */ M1[] a() {
        return new M1[]{f108939a, f108940b, f108941c};
    }

    static {
        M1[] m1ArrA = a();
        f108942d = m1ArrA;
        f108943e = EnumEntriesKt.a(m1ArrA);
    }

    public static M1 valueOf(String str) {
        return (M1) Enum.valueOf(M1.class, str);
    }

    public static M1[] values() {
        return (M1[]) f108942d.clone();
    }

    private M1(String str, int i10) {
    }
}
