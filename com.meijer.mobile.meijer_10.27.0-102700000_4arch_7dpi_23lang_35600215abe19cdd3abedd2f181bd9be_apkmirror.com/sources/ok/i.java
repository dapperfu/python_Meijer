package ok;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lok/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f153983a = new i("GasStation", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i f153984b = new i("HomeStore", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final i f153985c = new i("AnyStore", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final i f153986d = new i("CurrentPickupStore", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final i f153987e = new i("CartStoreSelection", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ i[] f153988f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f153989g;

    static {
        i[] iVarArrA = a();
        f153988f = iVarArrA;
        f153989g = EnumEntriesKt.a(iVarArrA);
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f153983a, f153984b, f153985c, f153986d, f153987e};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f153988f.clone();
    }

    private i(String str, int i10) {
    }
}
