package hj;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lhj/p;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f135752a = new p("FAILED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final p f135753b = new p("SUCCESS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final p f135754c = new p("PAYMENT_AUTH_FAILED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final p f135755d = new p("PAYMENT_CAPTURE_FAILED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final p f135756e = new p("EMPTY", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final p f135757f = new p("INITIATED", 5);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ p[] f135758g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f135759h;

    static {
        p[] pVarArrA = a();
        f135758g = pVarArrA;
        f135759h = EnumEntriesKt.a(pVarArrA);
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f135752a, f135753b, f135754c, f135755d, f135756e, f135757f};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f135758g.clone();
    }

    private p(String str, int i10) {
    }
}
