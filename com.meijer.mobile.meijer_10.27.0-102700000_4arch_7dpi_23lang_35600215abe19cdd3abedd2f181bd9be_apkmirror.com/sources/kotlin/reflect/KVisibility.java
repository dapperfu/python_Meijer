package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KVisibility {

    /* renamed from: a, reason: collision with root package name */
    public static final KVisibility f142956a = new KVisibility("PUBLIC", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final KVisibility f142957b = new KVisibility("PROTECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final KVisibility f142958c = new KVisibility("INTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final KVisibility f142959d = new KVisibility("PRIVATE", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ KVisibility[] f142960e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142961f;

    private static final /* synthetic */ KVisibility[] a() {
        return new KVisibility[]{f142956a, f142957b, f142958c, f142959d};
    }

    static {
        KVisibility[] kVisibilityArrA = a();
        f142960e = kVisibilityArrA;
        f142961f = EnumEntriesKt.a(kVisibilityArrA);
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) f142960e.clone();
    }

    private KVisibility(String str, int i10) {
    }
}
