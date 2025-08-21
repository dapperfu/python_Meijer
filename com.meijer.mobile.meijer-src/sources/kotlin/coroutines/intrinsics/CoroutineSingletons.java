package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@PublishedApi
/* loaded from: classes8.dex */
public final class CoroutineSingletons {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineSingletons f143557a = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final CoroutineSingletons f143558b = new CoroutineSingletons("UNDECIDED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final CoroutineSingletons f143559c = new CoroutineSingletons("RESUMED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ CoroutineSingletons[] f143560d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143561e;

    private static final /* synthetic */ CoroutineSingletons[] a() {
        return new CoroutineSingletons[]{f143557a, f143558b, f143559c};
    }

    static {
        CoroutineSingletons[] coroutineSingletonsArrA = a();
        f143560d = coroutineSingletonsArrA;
        f143561e = EnumEntriesKt.a(coroutineSingletonsArrA);
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f143560d.clone();
    }

    private CoroutineSingletons(String str, int i10) {
    }
}
