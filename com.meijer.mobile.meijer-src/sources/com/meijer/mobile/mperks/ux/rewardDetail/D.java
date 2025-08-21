package com.meijer.mobile.mperks.ux.rewardDetail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/D;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f115267a = new D("SUCCESS_SNACKBAR", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final D f115268b = new D("ERROR_SNACKBAR", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ D[] f115269c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f115270d;

    private static final /* synthetic */ D[] a() {
        return new D[]{f115267a, f115268b};
    }

    static {
        D[] dArrA = a();
        f115269c = dArrA;
        f115270d = EnumEntriesKt.a(dArrA);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f115269c.clone();
    }

    private D(String str, int i10) {
    }
}
