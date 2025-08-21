package oi;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Loi/N1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    public static final N1 f154001a = new N1("CLASSIC", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final N1 f154002b = new N1("DARK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final N1 f154003c = new N1("TEST", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ N1[] f154004d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f154005e;

    static {
        N1[] n1ArrA = a();
        f154004d = n1ArrA;
        f154005e = EnumEntriesKt.a(n1ArrA);
    }

    private static final /* synthetic */ N1[] a() {
        return new N1[]{f154001a, f154002b, f154003c};
    }

    public static N1 valueOf(String str) {
        return (N1) Enum.valueOf(N1.class, str);
    }

    public static N1[] values() {
        return (N1[]) f154004d.clone();
    }

    private N1(String str, int i10) {
    }
}
