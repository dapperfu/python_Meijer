package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* loaded from: classes14.dex */
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    int A(TypeArgumentListMarker typeArgumentListMarker);

    RigidTypeMarker A0(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker B(Collection<? extends KotlinTypeMarker> collection);

    TypeVariance B0(TypeArgumentMarker typeArgumentMarker);

    RigidTypeMarker C(KotlinTypeMarker kotlinTypeMarker);

    List<TypeArgumentMarker> D(KotlinTypeMarker kotlinTypeMarker);

    TypeParameterMarker D0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    boolean E(KotlinTypeMarker kotlinTypeMarker);

    boolean E0(KotlinTypeMarker kotlinTypeMarker);

    DefinitelyNotNullTypeMarker F0(RigidTypeMarker rigidTypeMarker);

    boolean G0(TypeConstructorMarker typeConstructorMarker);

    TypeArgumentMarker H(KotlinTypeMarker kotlinTypeMarker);

    CapturedTypeConstructorMarker I(CapturedTypeMarker capturedTypeMarker);

    KotlinTypeMarker I0(TypeArgumentMarker typeArgumentMarker);

    boolean J(RigidTypeMarker rigidTypeMarker);

    DynamicTypeMarker J0(FlexibleTypeMarker flexibleTypeMarker);

    TypeArgumentMarker K(KotlinTypeMarker kotlinTypeMarker, int i10);

    boolean K0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    boolean M(RigidTypeMarker rigidTypeMarker);

    boolean N(TypeConstructorMarker typeConstructorMarker);

    boolean O(KotlinTypeMarker kotlinTypeMarker);

    boolean P(TypeConstructorMarker typeConstructorMarker);

    boolean R(RigidTypeMarker rigidTypeMarker);

    boolean S(KotlinTypeMarker kotlinTypeMarker);

    boolean T(KotlinTypeMarker kotlinTypeMarker);

    List<KotlinTypeMarker> U(TypeParameterMarker typeParameterMarker);

    boolean V(SimpleTypeMarker simpleTypeMarker);

    int W(TypeConstructorMarker typeConstructorMarker);

    SimpleTypeMarker X(RigidTypeMarker rigidTypeMarker);

    CapturedTypeMarker Y(RigidTypeMarker rigidTypeMarker);

    RigidTypeMarker a(RigidTypeMarker rigidTypeMarker, boolean z10);

    RigidTypeMarker b(KotlinTypeMarker kotlinTypeMarker);

    boolean c(TypeArgumentMarker typeArgumentMarker);

    boolean c0(TypeConstructorMarker typeConstructorMarker);

    boolean d(RigidTypeMarker rigidTypeMarker);

    Collection<KotlinTypeMarker> d0(RigidTypeMarker rigidTypeMarker);

    RigidTypeMarker e(FlexibleTypeMarker flexibleTypeMarker);

    boolean e0(CapturedTypeMarker capturedTypeMarker);

    TypeConstructorMarker f(RigidTypeMarker rigidTypeMarker);

    boolean f0(KotlinTypeMarker kotlinTypeMarker);

    RigidTypeMarker g(FlexibleTypeMarker flexibleTypeMarker);

    Collection<KotlinTypeMarker> g0(TypeConstructorMarker typeConstructorMarker);

    CapturedTypeMarker h(SimpleTypeMarker simpleTypeMarker);

    TypeConstructorMarker h0(KotlinTypeMarker kotlinTypeMarker);

    boolean i0(TypeConstructorMarker typeConstructorMarker);

    int j(KotlinTypeMarker kotlinTypeMarker);

    boolean j0(KotlinTypeMarker kotlinTypeMarker);

    boolean k(CapturedTypeMarker capturedTypeMarker);

    TypeCheckerState.SupertypesPolicy k0(RigidTypeMarker rigidTypeMarker);

    RigidTypeMarker l(RigidTypeMarker rigidTypeMarker, CaptureStatus captureStatus);

    boolean l0(KotlinTypeMarker kotlinTypeMarker);

    boolean m(KotlinTypeMarker kotlinTypeMarker);

    boolean n(RigidTypeMarker rigidTypeMarker);

    boolean n0(RigidTypeMarker rigidTypeMarker);

    boolean o(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker);

    FlexibleTypeMarker o0(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentMarker p(RigidTypeMarker rigidTypeMarker, int i10);

    KotlinTypeMarker p0(KotlinTypeMarker kotlinTypeMarker, boolean z10);

    TypeArgumentListMarker q(RigidTypeMarker rigidTypeMarker);

    CaptureStatus q0(CapturedTypeMarker capturedTypeMarker);

    TypeArgumentMarker r(TypeArgumentListMarker typeArgumentListMarker, int i10);

    KotlinTypeMarker r0(KotlinTypeMarker kotlinTypeMarker);

    boolean s(KotlinTypeMarker kotlinTypeMarker);

    TypeArgumentMarker s0(CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    TypeParameterMarker t(TypeConstructorMarker typeConstructorMarker, int i10);

    List<SimpleTypeMarker> t0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker);

    TypeParameterMarker u(TypeConstructorMarker typeConstructorMarker);

    KotlinTypeMarker u0(CapturedTypeMarker capturedTypeMarker);

    KotlinTypeMarker v(KotlinTypeMarker kotlinTypeMarker, boolean z10);

    boolean v0(TypeConstructorMarker typeConstructorMarker);

    SimpleTypeMarker w(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker);

    boolean w0(TypeConstructorMarker typeConstructorMarker);

    boolean x(KotlinTypeMarker kotlinTypeMarker);

    TypeVariance y(TypeParameterMarker typeParameterMarker);

    List<TypeParameterMarker> y0(TypeConstructorMarker typeConstructorMarker);

    boolean z(KotlinTypeMarker kotlinTypeMarker);

    boolean z0(KotlinTypeMarker kotlinTypeMarker);
}
