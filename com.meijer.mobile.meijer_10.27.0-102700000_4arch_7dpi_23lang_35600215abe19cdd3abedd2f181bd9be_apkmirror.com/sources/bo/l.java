package bo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lbo/l;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f60604a = new l("CURRENCY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final l f60605b = new l("STEP", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ l[] f60606c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60607d;

    static {
        l[] lVarArrA = a();
        f60606c = lVarArrA;
        f60607d = EnumEntriesKt.a(lVarArrA);
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f60604a, f60605b};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f60606c.clone();
    }

    private l(String str, int i10) {
    }
}
