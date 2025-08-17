package com.meijer.mobile.meijer.activity.find.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f108960a = new r("SUCCESS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final r f108961b = new r("FAILURE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final r f108962c = new r("LOADING", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final r f108963d = new r("NOT_LOADING", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ r[] f108964e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f108965f;

    private static final /* synthetic */ r[] a() {
        return new r[]{f108960a, f108961b, f108962c, f108963d};
    }

    static {
        r[] rVarArrA = a();
        f108964e = rVarArrA;
        f108965f = EnumEntriesKt.a(rVarArrA);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f108964e.clone();
    }

    private r(String str, int i10) {
    }
}
