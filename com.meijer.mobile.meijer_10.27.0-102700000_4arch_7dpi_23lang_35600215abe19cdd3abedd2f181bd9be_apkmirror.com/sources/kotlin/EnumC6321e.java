package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc0/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6321e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6321e f61059a = new EnumC6321e("BoundReached", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6321e f61060b = new EnumC6321e("Finished", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC6321e[] f61061c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61062d;

    static {
        EnumC6321e[] enumC6321eArrA = a();
        f61061c = enumC6321eArrA;
        f61062d = EnumEntriesKt.a(enumC6321eArrA);
    }

    private static final /* synthetic */ EnumC6321e[] a() {
        return new EnumC6321e[]{f61059a, f61060b};
    }

    public static EnumC6321e valueOf(String str) {
        return (EnumC6321e) Enum.valueOf(EnumC6321e.class, str);
    }

    public static EnumC6321e[] values() {
        return (EnumC6321e[]) f61061c.clone();
    }

    private EnumC6321e(String str, int i10) {
    }
}
