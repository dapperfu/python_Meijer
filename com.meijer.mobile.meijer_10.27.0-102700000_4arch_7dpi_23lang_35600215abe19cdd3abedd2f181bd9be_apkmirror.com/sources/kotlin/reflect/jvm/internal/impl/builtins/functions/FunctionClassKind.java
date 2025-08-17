package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class FunctionClassKind {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f143464a;

    /* renamed from: b, reason: collision with root package name */
    public static final FunctionClassKind f143465b = new FunctionClassKind("Function", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final FunctionClassKind f143466c = new FunctionClassKind("SuspendFunction", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final FunctionClassKind f143467d = new FunctionClassKind("KFunction", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final FunctionClassKind f143468e = new FunctionClassKind("KSuspendFunction", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final FunctionClassKind f143469f = new FunctionClassKind("UNKNOWN", 4);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ FunctionClassKind[] f143470g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143471h;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FunctionClassKind a(FunctionTypeKind functionTypeKind) {
            Intrinsics.j(functionTypeKind, "functionTypeKind");
            return Intrinsics.e(functionTypeKind, FunctionTypeKind.Function.f143478f) ? FunctionClassKind.f143465b : Intrinsics.e(functionTypeKind, FunctionTypeKind.SuspendFunction.f143481f) ? FunctionClassKind.f143466c : Intrinsics.e(functionTypeKind, FunctionTypeKind.KFunction.f143479f) ? FunctionClassKind.f143467d : Intrinsics.e(functionTypeKind, FunctionTypeKind.KSuspendFunction.f143480f) ? FunctionClassKind.f143468e : FunctionClassKind.f143469f;
        }
    }

    private static final /* synthetic */ FunctionClassKind[] a() {
        return new FunctionClassKind[]{f143465b, f143466c, f143467d, f143468e, f143469f};
    }

    static {
        FunctionClassKind[] functionClassKindArrA = a();
        f143470g = functionClassKindArrA;
        f143471h = EnumEntriesKt.a(functionClassKindArrA);
        f143464a = new Companion(null);
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) f143470g.clone();
    }

    private FunctionClassKind(String str, int i10) {
    }
}
