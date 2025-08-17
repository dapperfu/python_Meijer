package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVariance;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KVariance {

    /* renamed from: a, reason: collision with root package name */
    public static final KVariance f142951a = new KVariance("INVARIANT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final KVariance f142952b = new KVariance("IN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final KVariance f142953c = new KVariance("OUT", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ KVariance[] f142954d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142955e;

    private static final /* synthetic */ KVariance[] a() {
        return new KVariance[]{f142951a, f142952b, f142953c};
    }

    static {
        KVariance[] kVarianceArrA = a();
        f142954d = kVarianceArrA;
        f142955e = EnumEntriesKt.a(kVarianceArrA);
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) f142954d.clone();
    }

    private KVariance(String str, int i10) {
    }
}
