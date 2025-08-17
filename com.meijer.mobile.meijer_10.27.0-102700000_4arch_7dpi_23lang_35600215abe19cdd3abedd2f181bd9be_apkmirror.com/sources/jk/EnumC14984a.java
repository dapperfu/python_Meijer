package jk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ljk/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC14984a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14984a f140312a = new EnumC14984a("BUY_AGAIN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14984a f140313b = new EnumC14984a("FAVORITES_ON_SALE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14984a f140314c = new EnumC14984a("CURATED_CAROUSEL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC14984a f140315d = new EnumC14984a("SPECIAL_OFFERS", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC14984a f140316e = new EnumC14984a("RECOMMENDATIONS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC14984a f140317f = new EnumC14984a("NONE", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC14984a[] f140318g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f140319h;

    static {
        EnumC14984a[] enumC14984aArrA = a();
        f140318g = enumC14984aArrA;
        f140319h = EnumEntriesKt.a(enumC14984aArrA);
    }

    private static final /* synthetic */ EnumC14984a[] a() {
        return new EnumC14984a[]{f140312a, f140313b, f140314c, f140315d, f140316e, f140317f};
    }

    public static EnumC14984a valueOf(String str) {
        return (EnumC14984a) Enum.valueOf(EnumC14984a.class, str);
    }

    public static EnumC14984a[] values() {
        return (EnumC14984a[]) f140318g.clone();
    }

    private EnumC14984a(String str, int i10) {
    }
}
