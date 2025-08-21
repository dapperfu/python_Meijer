package Hi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LHi/r;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f13620a = new r("Dismissed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final r f13621b = new r("ActionPerformed", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ r[] f13622c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13623d;

    static {
        r[] rVarArrA = a();
        f13622c = rVarArrA;
        f13623d = EnumEntriesKt.a(rVarArrA);
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{f13620a, f13621b};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f13622c.clone();
    }

    private r(String str, int i10) {
    }
}
