package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes14.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    @SourceDebugExtension
    public static final class DefaultImpls {
        public static boolean N(ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        public static TypeVariance A(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance varianceK = ((TypeParameterDescriptor) receiver).k();
                Intrinsics.i(varianceK, "getVariance(...)");
                return TypeSystemContextKt.a(varianceK);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean B(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, FqName fqName) {
            Intrinsics.j(receiver, "$receiver");
            Intrinsics.j(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().p3(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean C(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver, TypeConstructorMarker typeConstructorMarker) {
            Intrinsics.j(receiver, "$receiver");
            if (!(receiver instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) receiver;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.r(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + typeParameterDescriptor + ", " + Reflection.b(typeParameterDescriptor.getClass())).toString());
        }

        public static boolean D(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker a10, RigidTypeMarker b10) {
            Intrinsics.j(a10, "a");
            Intrinsics.j(b10, "b");
            if (!(a10 instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a10 + ", " + Reflection.b(a10.getClass())).toString());
            }
            if (b10 instanceof SimpleType) {
                return ((SimpleType) a10).I0() == ((SimpleType) b10).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b10 + ", " + Reflection.b(b10.getClass())).toString());
        }

        public static KotlinTypeMarker E(ClassicTypeSystemContext classicTypeSystemContext, Collection<? extends KotlinTypeMarker> types) {
            Intrinsics.j(types, "types");
            return IntersectionTypeKt.a(types);
        }

        public static boolean F(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.x0((TypeConstructor) receiver, StandardNames.FqNames.f144277b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean G(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).d() instanceof ClassDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean H(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
                return (classDescriptor == null || !ModalityUtilsKt.a(classDescriptor) || classDescriptor.f() == ClassKind.f144495e || classDescriptor.f() == ClassKind.f144496f) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean I(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean J(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.a((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean K(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                ClassDescriptor classDescriptor = classifierDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorD : null;
                return (classDescriptor != null ? classDescriptor.S() : null) instanceof InlineClassRepresentation;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean L(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean M(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean O(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            return (receiver instanceof SimpleType) && ((SimpleType) receiver).L0();
        }

        public static boolean P(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            return receiver instanceof NotNullTypeParameter;
        }

        public static boolean Q(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.x0((TypeConstructor) receiver, StandardNames.FqNames.f144279c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean R(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.l((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean S(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            return receiver instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean T(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.t0((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean U(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean V(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return receiver instanceof RawType;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean W(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (KotlinTypeKt.a((KotlinType) receiver)) {
                    return false;
                }
                SimpleType simpleType = (SimpleType) receiver;
                if (simpleType.K0().d() instanceof TypeAliasDescriptor) {
                    return false;
                }
                return simpleType.K0().d() != null || (receiver instanceof CapturedType) || (receiver instanceof NewCapturedType) || (receiver instanceof DefinitelyNotNullType) || (simpleType.K0() instanceof IntegerLiteralTypeConstructor) || X(classicTypeSystemContext, (SimpleTypeMarker) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        private static boolean X(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.d(((SimpleTypeWithEnhancement) simpleTypeMarker).D0());
        }

        public static boolean Y(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean Z(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.u((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean a(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker c12, TypeConstructorMarker c22) {
            Intrinsics.j(c12, "c1");
            Intrinsics.j(c22, "c2");
            if (!(c12 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + Reflection.b(c12.getClass())).toString());
            }
            if (c22 instanceof TypeConstructor) {
                return Intrinsics.e(c12, c22);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + Reflection.b(c22.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a0(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return TypeUtilsKt.v((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static int b(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).I0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean b0(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            return (receiver instanceof UnwrappedType) && (((UnwrappedType) receiver).K0() instanceof NewTypeVariableConstructor);
        }

        public static TypeArgumentListMarker c(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static boolean c0(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                return classifierDescriptorD != null && KotlinBuiltIns.C0(classifierDescriptorD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static CapturedTypeMarker d(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.h(((SimpleTypeWithEnhancement) receiver).D0());
                }
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker d0(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).S0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static DefinitelyNotNullTypeMarker e(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker e0(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static DynamicTypeMarker f(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                if (receiver instanceof DynamicType) {
                    return (DynamicType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker f0(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, boolean z10) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof UnwrappedType) {
                return ClassicTypeSystemContextKt.b((UnwrappedType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static FlexibleTypeMarker g(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeN0 = ((KotlinType) receiver).N0();
                if (unwrappedTypeN0 instanceof FlexibleType) {
                    return (FlexibleType) unwrappedTypeN0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeCheckerState g0(ClassicTypeSystemContext classicTypeSystemContext, boolean z10, boolean z11, boolean z12) {
            return ClassicTypeCheckerStateKt.b(z10, z11, classicTypeSystemContext, null, null, 24, null);
        }

        public static SimpleTypeMarker h(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrappedTypeN0 = ((KotlinType) receiver).N0();
                if (unwrappedTypeN0 instanceof SimpleType) {
                    return (SimpleType) unwrappedTypeN0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker h0(ClassicTypeSystemContext classicTypeSystemContext, DefinitelyNotNullTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) receiver).W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeArgumentMarker i(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.d((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static int i0(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static SimpleType j(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker type, CaptureStatus status) {
            Intrinsics.j(type, "type");
            Intrinsics.j(status, "status");
            if (type instanceof SimpleType) {
                return NewCapturedTypeKt.b((SimpleType) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + Reflection.b(type.getClass())).toString());
        }

        public static Collection<KotlinTypeMarker> j0(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            TypeConstructorMarker typeConstructorMarkerF = classicTypeSystemContext.f(receiver);
            if (typeConstructorMarkerF instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructorMarkerF).j();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static CaptureStatus k(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeArgumentMarker k0(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).h0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker l(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker lowerBound, RigidTypeMarker upperBound) {
            Intrinsics.j(lowerBound, "lowerBound");
            Intrinsics.j(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.b(classicTypeSystemContext.getClass())).toString());
            }
            if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.e((SimpleType) lowerBound, (SimpleType) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.b(classicTypeSystemContext.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TypeCheckerState.SupertypesPolicy l0(final ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker type) {
            Intrinsics.j(type, "type");
            if (type instanceof SimpleType) {
                final TypeSubstitutor typeSubstitutorC = TypeConstructorSubstitution.f147669c.a((KotlinType) type).c();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public SimpleTypeMarker a(TypeCheckerState state, KotlinTypeMarker type2) {
                        Intrinsics.j(state, "state");
                        Intrinsics.j(type2, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = classicTypeSystemContext;
                        TypeSubstitutor typeSubstitutor = typeSubstitutorC;
                        Object objA0 = classicTypeSystemContext2.A0(type2);
                        Intrinsics.h(objA0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                        KotlinType kotlinTypeN = typeSubstitutor.n((KotlinType) objA0, Variance.f147703e);
                        Intrinsics.i(kotlinTypeN, "safeSubstitute(...)");
                        SimpleTypeMarker simpleTypeMarkerB = classicTypeSystemContext2.b((KotlinTypeMarker) kotlinTypeN);
                        Intrinsics.g(simpleTypeMarkerB);
                        return simpleTypeMarkerB;
                    }
                };
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + Reflection.b(type.getClass())).toString());
        }

        public static TypeArgumentMarker m(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, int i10) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).I0().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static Collection<KotlinTypeMarker> m0(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                Collection<KotlinType> collectionA = ((TypeConstructor) receiver).a();
                Intrinsics.i(collectionA, "getSupertypes(...)");
                return collectionA;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static List<TypeArgumentMarker> n(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static CapturedTypeConstructorMarker n0(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static FqNameUnsafe o(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.p((ClassDescriptor) classifierDescriptorD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeConstructorMarker o0(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeParameterMarker p(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver, int i10) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) receiver).getParameters().get(i10);
                Intrinsics.i(typeParameterDescriptor, "get(...)");
                return typeParameterDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker p0(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static List<TypeParameterMarker> q(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) receiver).getParameters();
                Intrinsics.i(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker q0(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, boolean z10) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof RigidTypeMarker) {
                return classicTypeSystemContext.a((RigidTypeMarker) receiver, z10);
            }
            if (!(receiver instanceof FlexibleTypeMarker)) {
                throw new IllegalStateException("sealed");
            }
            FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) receiver;
            return classicTypeSystemContext.a0(classicTypeSystemContext.a((RigidTypeMarker) classicTypeSystemContext.e(flexibleTypeMarker), z10), classicTypeSystemContext.a((RigidTypeMarker) classicTypeSystemContext.g(flexibleTypeMarker), z10));
        }

        public static PrimitiveType r(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.Q((ClassDescriptor) classifierDescriptorD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker r0(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker receiver, boolean z10) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).R0(z10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static PrimitiveType s(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.T((ClassDescriptor) classifierDescriptorD);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker t(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.o((TypeParameterDescriptor) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker u(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (classicTypeSystemContext.c(receiver)) {
                return null;
            }
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeParameterMarker v(ClassicTypeSystemContext classicTypeSystemContext, TypeVariableTypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) receiver).c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeParameterMarker w(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor classifierDescriptorD = ((TypeConstructor) receiver).d();
                if (classifierDescriptorD instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) classifierDescriptorD;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker x(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof KotlinType) {
                return InlineClassesUtilsKt.k((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static List<KotlinTypeMarker> y(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) receiver).getUpperBounds();
                Intrinsics.i(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }

        public static TypeVariance z(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.j(receiver, "$receiver");
            if (receiver instanceof TypeProjection) {
                Variance varianceC = ((TypeProjection) receiver).c();
                Intrinsics.i(varianceC, "getProjectionKind(...)");
                return TypeSystemContextKt.a(varianceC);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.b(receiver.getClass())).toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker a(RigidTypeMarker rigidTypeMarker, boolean z10);

    KotlinTypeMarker a0(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker b(KotlinTypeMarker kotlinTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean c(TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean d(RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker e(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    TypeConstructorMarker f(RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker g(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    CapturedTypeMarker h(SimpleTypeMarker simpleTypeMarker);
}
