package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;

/* loaded from: classes14.dex */
public final class DefinitelyNotNullType extends DelegatingSimpleType implements CustomTypeParameter, DefinitelyNotNullTypeMarker {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f147594d = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final SimpleType f147595b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f147596c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DefinitelyNotNullType c(Companion companion, UnwrappedType unwrappedType, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return companion.b(unwrappedType, z10, z11);
        }

        @JvmOverloads
        public final DefinitelyNotNullType b(UnwrappedType type, boolean z10, boolean z11) {
            Intrinsics.j(type, "type");
            if (type instanceof DefinitelyNotNullType) {
                return (DefinitelyNotNullType) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z11 && !d(type, z10)) {
                return null;
            }
            if (type instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) type;
                Intrinsics.e(flexibleType.S0().K0(), flexibleType.T0().K0());
            }
            return new DefinitelyNotNullType(FlexibleTypesKt.c(type).R0(false), z10, defaultConstructorMarker);
        }

        private final boolean a(UnwrappedType unwrappedType) {
            if (!(unwrappedType.K0() instanceof NewTypeVariableConstructor) && !(unwrappedType.K0().d() instanceof TypeParameterDescriptor) && !(unwrappedType instanceof NewCapturedType) && !(unwrappedType instanceof StubTypeForBuilderInference)) {
                return false;
            }
            return true;
        }

        private final boolean d(UnwrappedType unwrappedType, boolean z10) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl;
            if (!a(unwrappedType)) {
                return false;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return TypeUtils.l(unwrappedType);
            }
            ClassifierDescriptor classifierDescriptorD = unwrappedType.K0().d();
            if (classifierDescriptorD instanceof TypeParameterDescriptorImpl) {
                typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) classifierDescriptorD;
            } else {
                typeParameterDescriptorImpl = null;
            }
            if (typeParameterDescriptorImpl != null && !typeParameterDescriptorImpl.Q0()) {
                return true;
            }
            if (z10 && (unwrappedType.K0().d() instanceof TypeParameterDescriptor)) {
                return TypeUtils.l(unwrappedType);
            }
            return !NullabilityChecker.f147744a.a(unwrappedType);
        }
    }

    public /* synthetic */ DefinitelyNotNullType(SimpleType simpleType, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return false;
    }

    private DefinitelyNotNullType(SimpleType simpleType, boolean z10) {
        this.f147595b = simpleType;
        this.f147596c = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        return z10 ? T0().R0(z10) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new DefinitelyNotNullType(T0().Q0(newAttributes), this.f147596c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType T0() {
        return this.f147595b;
    }

    public final SimpleType W0() {
        return this.f147595b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public DefinitelyNotNullType V0(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        return new DefinitelyNotNullType(delegate, this.f147596c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType g0(KotlinType replacement) {
        Intrinsics.j(replacement, "replacement");
        return SpecialTypesKt.e(replacement.N0(), this.f147596c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        return T0() + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean B0() {
        if (!(T0().K0() instanceof NewTypeVariableConstructor) && !(T0().K0().d() instanceof TypeParameterDescriptor)) {
            return false;
        }
        return true;
    }
}
