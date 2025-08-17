package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f146724a;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean a() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public StarProjectionForAbsentTypeParameter(KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.j(kotlinBuiltIns, "kotlinBuiltIns");
        SimpleType simpleTypeJ = kotlinBuiltIns.J();
        Intrinsics.i(simpleTypeJ, "getNullableAnyType(...)");
        this.f146724a = simpleTypeJ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance c() {
        return Variance.f146798g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return this.f146724a;
    }
}
