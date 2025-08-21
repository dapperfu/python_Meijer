package Vs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LVs/t;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f40446a = new t("REFRESH_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final t f40447b = new t("ACCESS_TOKEN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final t f40448c = new t("ID_TOKEN", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final t f40449d = new t("DEVICE_SECRET", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ t[] f40450e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f40451f;

    static {
        t[] tVarArrA = a();
        f40450e = tVarArrA;
        f40451f = EnumEntriesKt.a(tVarArrA);
    }

    private static final /* synthetic */ t[] a() {
        return new t[]{f40446a, f40447b, f40448c, f40449d};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f40450e.clone();
    }

    private t(String str, int i10) {
    }
}
