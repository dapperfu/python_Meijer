package co;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lco/d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6532d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6532d f62699a = new EnumC6532d("All", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6532d f62700b = new EnumC6532d("FreeItems", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6532d f62701c = new EnumC6532d("Fuel", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6532d f62702d = new EnumC6532d("TotalPurchase", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6532d f62703e = new EnumC6532d("AutoClaim", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC6532d[] f62704f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62705g;

    static {
        EnumC6532d[] enumC6532dArrA = a();
        f62704f = enumC6532dArrA;
        f62705g = EnumEntriesKt.a(enumC6532dArrA);
    }

    private static final /* synthetic */ EnumC6532d[] a() {
        return new EnumC6532d[]{f62699a, f62700b, f62701c, f62702d, f62703e};
    }

    public static EnumC6532d valueOf(String str) {
        return (EnumC6532d) Enum.valueOf(EnumC6532d.class, str);
    }

    public static EnumC6532d[] values() {
        return (EnumC6532d[]) f62704f.clone();
    }

    private EnumC6532d(String str, int i10) {
    }
}
