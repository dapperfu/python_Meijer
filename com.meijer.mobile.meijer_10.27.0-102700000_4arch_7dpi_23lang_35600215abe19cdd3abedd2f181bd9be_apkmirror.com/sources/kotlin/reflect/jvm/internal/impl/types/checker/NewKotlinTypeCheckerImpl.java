package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;

/* loaded from: classes13.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    /* renamed from: c, reason: collision with root package name */
    private final KotlinTypeRefiner f146834c;

    /* renamed from: d, reason: collision with root package name */
    private final KotlinTypePreparator f146835d;

    /* renamed from: e, reason: collision with root package name */
    private final OverridingUtil f146836e;

    public NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.j(kotlinTypePreparator, "kotlinTypePreparator");
        this.f146834c = kotlinTypeRefiner;
        this.f146835d = kotlinTypePreparator;
        OverridingUtil overridingUtilM = OverridingUtil.m(c());
        Intrinsics.i(overridingUtilM, "createWithTypeRefiner(...)");
        this.f146836e = overridingUtilM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public OverridingUtil a() {
        return this.f146836e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean b(KotlinType a10, KotlinType b10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return e(ClassicTypeCheckerStateKt.b(false, false, null, f(), c(), 6, null), a10.N0(), b10.N0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    public KotlinTypeRefiner c() {
        return this.f146834c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker
    public boolean d(KotlinType subtype, KotlinType supertype) {
        Intrinsics.j(subtype, "subtype");
        Intrinsics.j(supertype, "supertype");
        return g(ClassicTypeCheckerStateKt.b(true, false, null, f(), c(), 6, null), subtype.N0(), supertype.N0());
    }

    public final boolean e(TypeCheckerState typeCheckerState, UnwrappedType a10, UnwrappedType b10) {
        Intrinsics.j(typeCheckerState, "<this>");
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return AbstractTypeChecker.f146670a.m(typeCheckerState, a10, b10);
    }

    public KotlinTypePreparator f() {
        return this.f146835d;
    }

    public final boolean g(TypeCheckerState typeCheckerState, UnwrappedType subType, UnwrappedType superType) {
        Intrinsics.j(typeCheckerState, "<this>");
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return AbstractTypeChecker.v(AbstractTypeChecker.f146670a, typeCheckerState, subType, superType, false, 8, null);
    }

    public /* synthetic */ NewKotlinTypeCheckerImpl(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinTypeRefiner, (i10 & 2) != 0 ? KotlinTypePreparator.Default.f146817a : kotlinTypePreparator);
    }
}
