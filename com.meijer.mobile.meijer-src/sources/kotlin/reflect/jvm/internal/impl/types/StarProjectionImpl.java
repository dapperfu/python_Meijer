package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f147632a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f147633b;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean a() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public TypeProjection b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public StarProjectionImpl(TypeParameterDescriptor typeParameter) {
        Intrinsics.j(typeParameter, "typeParameter");
        this.f147632a = typeParameter;
        this.f147633b = LazyKt.a(LazyThreadSafetyMode.f143287b, new u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(StarProjectionImpl starProjectionImpl) {
        return StarProjectionImplKt.b(starProjectionImpl.f147632a);
    }

    private final KotlinType f() {
        return (KotlinType) this.f147633b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance c() {
        return Variance.f147705g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return f();
    }
}
