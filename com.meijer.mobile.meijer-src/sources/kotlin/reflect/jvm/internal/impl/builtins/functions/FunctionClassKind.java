package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class FunctionClassKind {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144371a;

    /* renamed from: b, reason: collision with root package name */
    public static final FunctionClassKind f144372b = new FunctionClassKind("Function", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final FunctionClassKind f144373c = new FunctionClassKind("SuspendFunction", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final FunctionClassKind f144374d = new FunctionClassKind("KFunction", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final FunctionClassKind f144375e = new FunctionClassKind("KSuspendFunction", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final FunctionClassKind f144376f = new FunctionClassKind("UNKNOWN", 4);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ FunctionClassKind[] f144377g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144378h;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FunctionClassKind a(FunctionTypeKind functionTypeKind) {
            Intrinsics.j(functionTypeKind, "functionTypeKind");
            return Intrinsics.e(functionTypeKind, FunctionTypeKind.Function.f144385f) ? FunctionClassKind.f144372b : Intrinsics.e(functionTypeKind, FunctionTypeKind.SuspendFunction.f144388f) ? FunctionClassKind.f144373c : Intrinsics.e(functionTypeKind, FunctionTypeKind.KFunction.f144386f) ? FunctionClassKind.f144374d : Intrinsics.e(functionTypeKind, FunctionTypeKind.KSuspendFunction.f144387f) ? FunctionClassKind.f144375e : FunctionClassKind.f144376f;
        }
    }

    private static final /* synthetic */ FunctionClassKind[] a() {
        return new FunctionClassKind[]{f144372b, f144373c, f144374d, f144375e, f144376f};
    }

    static {
        FunctionClassKind[] functionClassKindArrA = a();
        f144377g = functionClassKindArrA;
        f144378h = EnumEntriesKt.a(functionClassKindArrA);
        f144371a = new Companion(null);
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) f144377g.clone();
    }

    private FunctionClassKind(String str, int i10) {
    }
}
