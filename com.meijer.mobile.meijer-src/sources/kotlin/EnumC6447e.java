package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc0/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6447e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6447e f60858a = new EnumC6447e("BoundReached", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6447e f60859b = new EnumC6447e("Finished", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC6447e[] f60860c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60861d;

    static {
        EnumC6447e[] enumC6447eArrA = a();
        f60860c = enumC6447eArrA;
        f60861d = EnumEntriesKt.a(enumC6447eArrA);
    }

    private static final /* synthetic */ EnumC6447e[] a() {
        return new EnumC6447e[]{f60858a, f60859b};
    }

    public static EnumC6447e valueOf(String str) {
        return (EnumC6447e) Enum.valueOf(EnumC6447e.class, str);
    }

    public static EnumC6447e[] values() {
        return (EnumC6447e[]) f60860c.clone();
    }

    private EnumC6447e(String str, int i10) {
    }
}
