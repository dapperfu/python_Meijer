package mk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmk/d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f150120a = new d("FAVORITES_ON_SALE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final d f150121b = new d("BUY_AGAIN", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f150122c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f150123d;

    static {
        d[] dVarArrA = a();
        f150122c = dVarArrA;
        f150123d = EnumEntriesKt.a(dVarArrA);
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f150120a, f150121b};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f150122c.clone();
    }

    private d(String str, int i10) {
    }
}
