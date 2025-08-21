package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FlexibleTypeImpl extends FlexibleType implements CustomTypeParameter {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f147608e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static boolean f147609f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f147610d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.j(lowerBound, "lowerBound");
        Intrinsics.j(upperBound, "upperBound");
    }

    private final void W0() {
        if (!f147609f || this.f147610d) {
            return;
        }
        this.f147610d = true;
        FlexibleTypesKt.b(S0());
        FlexibleTypesKt.b(T0());
        Intrinsics.e(S0(), T0());
        KotlinTypeChecker.f147723a.d(S0(), T0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public UnwrappedType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return KotlinTypeFactory.e(S0().Q0(newAttributes), T0().Q0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String U0(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        Intrinsics.j(renderer, "renderer");
        Intrinsics.j(options, "options");
        if (!options.j()) {
            return renderer.Q(renderer.T(S0()), renderer.T(T0()), TypeUtilsKt.n(this));
        }
        return '(' + renderer.T(S0()) + ".." + renderer.T(T0()) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public FlexibleType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeA = kotlinTypeRefiner.a(S0());
        Intrinsics.h(kotlinTypeA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeA2 = kotlinTypeRefiner.a(T0());
        Intrinsics.h(kotlinTypeA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new FlexibleTypeImpl((SimpleType) kotlinTypeA, (SimpleType) kotlinTypeA2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType g0(KotlinType replacement) {
        UnwrappedType unwrappedTypeE;
        Intrinsics.j(replacement, "replacement");
        UnwrappedType unwrappedTypeN0 = replacement.N0();
        if (unwrappedTypeN0 instanceof FlexibleType) {
            unwrappedTypeE = unwrappedTypeN0;
        } else {
            if (!(unwrappedTypeN0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleType simpleType = (SimpleType) unwrappedTypeN0;
            unwrappedTypeE = KotlinTypeFactory.e(simpleType, simpleType.R0(true));
        }
        return TypeWithEnhancementKt.b(unwrappedTypeE, unwrappedTypeN0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String toString() {
        return '(' + S0() + ".." + T0() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean B0() {
        if ((S0().K0().d() instanceof TypeParameterDescriptor) && Intrinsics.e(S0().K0(), T0().K0())) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: O0 */
    public UnwrappedType R0(boolean z10) {
        return KotlinTypeFactory.e(S0().R0(z10), T0().R0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType R0() {
        W0();
        return S0();
    }
}
