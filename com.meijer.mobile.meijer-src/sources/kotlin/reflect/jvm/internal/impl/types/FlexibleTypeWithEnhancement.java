package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {

    /* renamed from: d, reason: collision with root package name */
    private final FlexibleType f147611d;

    /* renamed from: e, reason: collision with root package name */
    private final KotlinType f147612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(FlexibleType origin, KotlinType enhancement) {
        super(origin.S0(), origin.T0());
        Intrinsics.j(origin, "origin");
        Intrinsics.j(enhancement, "enhancement");
        this.f147611d = origin;
        this.f147612e = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return TypeWithEnhancementKt.d(D0().Q0(newAttributes), e0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String U0(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        Intrinsics.j(renderer, "renderer");
        Intrinsics.j(options, "options");
        return options.d() ? renderer.T(e0()) : D0().U0(renderer, options);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public FlexibleType D0() {
        return this.f147611d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public FlexibleTypeWithEnhancement U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeA = kotlinTypeRefiner.a(D0());
        Intrinsics.h(kotlinTypeA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeA, kotlinTypeRefiner.a(e0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public KotlinType e0() {
        return this.f147612e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String toString() {
        return "[@EnhancedForWarnings(" + e0() + ")] " + D0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: O0 */
    public UnwrappedType R0(boolean z10) {
        return TypeWithEnhancementKt.d(D0().R0(z10), e0().N0().R0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType R0() {
        return D0().R0();
    }
}
