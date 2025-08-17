package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f146725a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f146726b;

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
        this.f146725a = typeParameter;
        this.f146726b = LazyKt.a(LazyThreadSafetyMode.f142380b, new u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(StarProjectionImpl starProjectionImpl) {
        return StarProjectionImplKt.b(starProjectionImpl.f146725a);
    }

    private final KotlinType f() {
        return (KotlinType) this.f146726b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public Variance c() {
        return Variance.f146798g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public KotlinType getType() {
        return f();
    }
}
