package vv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lvv/m;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f166353a = new m("SUCCESSFUL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final m f166354b = new m("REREGISTER", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m f166355c = new m("CANCELLED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final m f166356d = new m("ALREADY_SELECTED", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ m[] f166357e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f166358f;

    static {
        m[] mVarArrA = a();
        f166357e = mVarArrA;
        f166358f = EnumEntriesKt.a(mVarArrA);
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f166353a, f166354b, f166355c, f166356d};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f166357e.clone();
    }

    private m(String str, int i10) {
    }
}
