package c5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lc5/m;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f61493a = new m("IGNORE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final m f61494b = new m("RESPECT_PERFORMANCE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m f61495c = new m("RESPECT_ALL", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ m[] f61496d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f61497e;

    static {
        m[] mVarArrA = a();
        f61496d = mVarArrA;
        f61497e = EnumEntriesKt.a(mVarArrA);
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f61493a, f61494b, f61495c};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f61496d.clone();
    }

    private m(String str, int i10) {
    }
}
