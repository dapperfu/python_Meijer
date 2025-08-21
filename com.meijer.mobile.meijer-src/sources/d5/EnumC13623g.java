package d5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ld5/g;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC13623g {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13623g f128045a = new EnumC13623g("MEMORY_CACHE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13623g f128046b = new EnumC13623g("MEMORY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13623g f128047c = new EnumC13623g("DISK", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC13623g f128048d = new EnumC13623g("NETWORK", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC13623g[] f128049e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f128050f;

    static {
        EnumC13623g[] enumC13623gArrA = a();
        f128049e = enumC13623gArrA;
        f128050f = EnumEntriesKt.a(enumC13623gArrA);
    }

    private static final /* synthetic */ EnumC13623g[] a() {
        return new EnumC13623g[]{f128045a, f128046b, f128047c, f128048d};
    }

    public static EnumC13623g valueOf(String str) {
        return (EnumC13623g) Enum.valueOf(EnumC13623g.class, str);
    }

    public static EnumC13623g[] values() {
        return (EnumC13623g[]) f128049e.clone();
    }

    private EnumC13623g(String str, int i10) {
    }
}
