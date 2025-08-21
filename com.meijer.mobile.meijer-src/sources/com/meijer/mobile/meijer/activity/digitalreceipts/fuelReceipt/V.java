package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/V;", "", "", "drawableRes", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class V {

    /* renamed from: b, reason: collision with root package name */
    public static final V f106556b = new V("DATE", 0, com.meijer.mobile.meijer.S.f99600q);

    /* renamed from: c, reason: collision with root package name */
    public static final V f106557c = new V("TX", 1, com.meijer.mobile.meijer.S.f99608u);

    /* renamed from: d, reason: collision with root package name */
    public static final V f106558d = new V("TM", 2, com.meijer.mobile.meijer.S.f99606t);

    /* renamed from: e, reason: collision with root package name */
    public static final V f106559e = new V("STORE_NUMBER", 3, com.meijer.mobile.meijer.S.f99602r);

    /* renamed from: f, reason: collision with root package name */
    public static final V f106560f = new V("TIME", 4, com.meijer.mobile.meijer.S.f99604s);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ V[] f106561g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f106562h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int drawableRes;

    private static final /* synthetic */ V[] a() {
        return new V[]{f106556b, f106557c, f106558d, f106559e, f106560f};
    }

    static {
        V[] vArrA = a();
        f106561g = vArrA;
        f106562h = EnumEntriesKt.a(vArrA);
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f106561g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getDrawableRes() {
        return this.drawableRes;
    }

    private V(String str, int i10, int i11) {
        this.drawableRes = i11;
    }
}
