package Kp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LKp/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17595a = new a("REPORT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f17596b = new a("POSITIVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f17597c = new a("NEGATIVE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f17598d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f17599e;

    static {
        a[] aVarArrA = a();
        f17598d = aVarArrA;
        f17599e = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f17595a, f17596b, f17597c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17598d.clone();
    }

    private a(String str, int i10) {
    }
}
