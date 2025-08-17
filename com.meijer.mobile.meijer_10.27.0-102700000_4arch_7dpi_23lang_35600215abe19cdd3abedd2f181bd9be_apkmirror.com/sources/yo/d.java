package yo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lyo/d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "persistence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f170813a = new d("HOME", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final d f170814b = new d("CART", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f170815c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f170816d;

    static {
        d[] dVarArrA = a();
        f170815c = dVarArrA;
        f170816d = EnumEntriesKt.a(dVarArrA);
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f170813a, f170814b};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f170815c.clone();
    }

    private d(String str, int i10) {
    }
}
