package Ci;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LCi/o;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f4629a = new o("LOADING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final o f4630b = new o("ERROR", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final o f4631c = new o("SUCCESS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final o f4632d = new o("COMPLETED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final o f4633e = new o("DEFAULT", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ o[] f4634f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f4635g;

    static {
        o[] oVarArrA = a();
        f4634f = oVarArrA;
        f4635g = EnumEntriesKt.a(oVarArrA);
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f4629a, f4630b, f4631c, f4632d, f4633e};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f4634f.clone();
    }

    private o(String str, int i10) {
    }
}
