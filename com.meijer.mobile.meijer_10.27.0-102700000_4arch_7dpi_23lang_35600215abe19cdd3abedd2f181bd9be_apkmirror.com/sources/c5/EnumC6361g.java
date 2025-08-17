package c5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lc5/g;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c5.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC6361g {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6361g f61478a = new EnumC6361g("MEMORY_CACHE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6361g f61479b = new EnumC6361g("MEMORY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6361g f61480c = new EnumC6361g("DISK", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6361g f61481d = new EnumC6361g("NETWORK", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC6361g[] f61482e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61483f;

    static {
        EnumC6361g[] enumC6361gArrA = a();
        f61482e = enumC6361gArrA;
        f61483f = EnumEntriesKt.a(enumC6361gArrA);
    }

    private static final /* synthetic */ EnumC6361g[] a() {
        return new EnumC6361g[]{f61478a, f61479b, f61480c, f61481d};
    }

    public static EnumC6361g valueOf(String str) {
        return (EnumC6361g) Enum.valueOf(EnumC6361g.class, str);
    }

    public static EnumC6361g[] values() {
        return (EnumC6361g[]) f61482e.clone();
    }

    private EnumC6361g(String str, int i10) {
    }
}
