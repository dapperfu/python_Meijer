package Js;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LJs/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16068a = new a("WEEKLY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f16069b = new a("PROMOTIONAL", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f16070c = new a("PULLOUT", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f16071d = new a("OPA", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f16072e = new a("UNKNOWN", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f16073f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16074g;

    static {
        a[] aVarArrA = a();
        f16073f = aVarArrA;
        f16074g = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f16068a, f16069b, f16070c, f16071d, f16072e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16073f.clone();
    }

    private a(String str, int i10) {
    }
}
