package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ContractsDsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@ContractsDsl
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalContracts
/* loaded from: classes6.dex */
public final class InvocationKind {

    /* renamed from: a, reason: collision with root package name */
    @ContractsDsl
    public static final InvocationKind f142631a = new InvocationKind("AT_MOST_ONCE", 0);

    /* renamed from: b, reason: collision with root package name */
    @ContractsDsl
    public static final InvocationKind f142632b = new InvocationKind("AT_LEAST_ONCE", 1);

    /* renamed from: c, reason: collision with root package name */
    @ContractsDsl
    public static final InvocationKind f142633c = new InvocationKind("EXACTLY_ONCE", 2);

    /* renamed from: d, reason: collision with root package name */
    @ContractsDsl
    public static final InvocationKind f142634d = new InvocationKind("UNKNOWN", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ InvocationKind[] f142635e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f142636f;

    private static final /* synthetic */ InvocationKind[] a() {
        return new InvocationKind[]{f142631a, f142632b, f142633c, f142634d};
    }

    static {
        InvocationKind[] invocationKindArrA = a();
        f142635e = invocationKindArrA;
        f142636f = EnumEntriesKt.a(invocationKindArrA);
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) f142635e.clone();
    }

    private InvocationKind(String str, int i10) {
    }
}
