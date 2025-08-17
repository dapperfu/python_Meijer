package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LazyThreadSafetyMode {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyThreadSafetyMode f142379a = new LazyThreadSafetyMode("SYNCHRONIZED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final LazyThreadSafetyMode f142380b = new LazyThreadSafetyMode("PUBLICATION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final LazyThreadSafetyMode f142381c = new LazyThreadSafetyMode("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ LazyThreadSafetyMode[] f142382d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142383e;

    private static final /* synthetic */ LazyThreadSafetyMode[] a() {
        return new LazyThreadSafetyMode[]{f142379a, f142380b, f142381c};
    }

    static {
        LazyThreadSafetyMode[] lazyThreadSafetyModeArrA = a();
        f142382d = lazyThreadSafetyModeArrA;
        f142383e = EnumEntriesKt.a(lazyThreadSafetyModeArrA);
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f142382d.clone();
    }

    private LazyThreadSafetyMode(String str, int i10) {
    }
}
