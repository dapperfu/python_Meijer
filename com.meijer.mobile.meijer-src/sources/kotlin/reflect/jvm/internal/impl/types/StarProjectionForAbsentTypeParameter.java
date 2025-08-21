package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f147631a;

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
        this.f147631a = simpleTypeJ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance c() {
        return Variance.f147705g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return this.f147631a;
    }
}
