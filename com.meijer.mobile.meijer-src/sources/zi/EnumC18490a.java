package zi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzi/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zi.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC18490a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18490a f172797a = new EnumC18490a("LOADING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18490a f172798b = new EnumC18490a("INCENTIVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC18490a f172799c = new EnumC18490a("CLIPPED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC18490a f172800d = new EnumC18490a("UNCLIPPED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC18490a f172801e = new EnumC18490a("SUCCESS", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC18490a f172802f = new EnumC18490a("ERROR", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC18490a[] f172803g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f172804h;

    static {
        EnumC18490a[] enumC18490aArrA = a();
        f172803g = enumC18490aArrA;
        f172804h = EnumEntriesKt.a(enumC18490aArrA);
    }

    private static final /* synthetic */ EnumC18490a[] a() {
        return new EnumC18490a[]{f172797a, f172798b, f172799c, f172800d, f172801e, f172802f};
    }

    public static EnumC18490a valueOf(String str) {
        return (EnumC18490a) Enum.valueOf(EnumC18490a.class, str);
    }

    public static EnumC18490a[] values() {
        return (EnumC18490a[]) f172803g.clone();
    }

    private EnumC18490a(String str, int i10) {
    }
}
