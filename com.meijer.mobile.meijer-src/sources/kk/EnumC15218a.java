package kk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lkk/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kk.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC15218a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15218a f142567a = new EnumC15218a("BUY_AGAIN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15218a f142568b = new EnumC15218a("FAVORITES_ON_SALE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15218a f142569c = new EnumC15218a("CURATED_CAROUSEL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC15218a f142570d = new EnumC15218a("SPECIAL_OFFERS", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC15218a f142571e = new EnumC15218a("RECOMMENDATIONS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC15218a f142572f = new EnumC15218a("NONE", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC15218a[] f142573g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142574h;

    static {
        EnumC15218a[] enumC15218aArrA = a();
        f142573g = enumC15218aArrA;
        f142574h = EnumEntriesKt.a(enumC15218aArrA);
    }

    private static final /* synthetic */ EnumC15218a[] a() {
        return new EnumC15218a[]{f142567a, f142568b, f142569c, f142570d, f142571e, f142572f};
    }

    public static EnumC15218a valueOf(String str) {
        return (EnumC15218a) Enum.valueOf(EnumC15218a.class, str);
    }

    public static EnumC15218a[] values() {
        return (EnumC15218a[]) f142573g.clone();
    }

    private EnumC15218a(String str, int i10) {
    }
}
