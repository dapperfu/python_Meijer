package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
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
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* loaded from: classes14.dex */
public final class SimpleClassicTypeSystemContext implements ClassicTypeSystemContext {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleClassicTypeSystemContext f147746a = new SimpleClassicTypeSystemContext();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<SimpleTypeMarker> t0(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker constructor) {
        Intrinsics.j(rigidTypeMarker, "<this>");
        Intrinsics.j(constructor, "constructor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int A(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.j(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof RigidTypeMarker) {
            return j((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.b(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public RigidTypeMarker A0(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerE;
        Intrinsics.j(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerO0 = o0(kotlinTypeMarker);
        if (flexibleTypeMarkerO0 != null && (rigidTypeMarkerE = e(flexibleTypeMarkerO0)) != null) {
            return rigidTypeMarkerE;
        }
        RigidTypeMarker rigidTypeMarkerB = b(kotlinTypeMarker);
        Intrinsics.g(rigidTypeMarkerB);
        return rigidTypeMarkerB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public RigidTypeMarker C(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerG;
        Intrinsics.j(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerO0 = o0(kotlinTypeMarker);
        if (flexibleTypeMarkerO0 != null && (rigidTypeMarkerG = g(flexibleTypeMarkerO0)) != null) {
            return rigidTypeMarkerG;
        }
        RigidTypeMarker rigidTypeMarkerB = b(kotlinTypeMarker);
        Intrinsics.g(rigidTypeMarkerB);
        return rigidTypeMarkerB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public KotlinTypeMarker L0(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerA;
        Intrinsics.j(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerB = b(kotlinTypeMarker);
        return (rigidTypeMarkerB == null || (rigidTypeMarkerA = a(rigidTypeMarkerB, true)) == null) ? kotlinTypeMarker : rigidTypeMarkerA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean R(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.j(rigidTypeMarker, "<this>");
        return v0(f(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean T(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return o0(kotlinTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker X(RigidTypeMarker rigidTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerW;
        Intrinsics.j(rigidTypeMarker, "<this>");
        DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerF0 = F0(rigidTypeMarker);
        return (definitelyNotNullTypeMarkerF0 == null || (simpleTypeMarkerW = w(definitelyNotNullTypeMarkerF0)) == null) ? (SimpleTypeMarker) rigidTypeMarker : simpleTypeMarkerW;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CapturedTypeMarker Y(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.j(rigidTypeMarker, "<this>");
        return h(X(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker a(RigidTypeMarker rigidTypeMarker, boolean z10) {
        return ClassicTypeSystemContext.DefaultImpls.r0(this, rigidTypeMarker, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker b(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.h(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker e(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.d0(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean f0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerO0 = o0(kotlinTypeMarker);
        return (flexibleTypeMarkerO0 != null ? J0(flexibleTypeMarkerO0) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker g(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.p0(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeConstructorMarker h0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerB = b(kotlinTypeMarker);
        if (rigidTypeMarkerB == null) {
            rigidTypeMarkerB = A0(kotlinTypeMarker);
        }
        return f(rigidTypeMarkerB);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean j0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return E0(A0(kotlinTypeMarker)) != E0(C(kotlinTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean l0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerB = b(kotlinTypeMarker);
        return (rigidTypeMarkerB != null ? F0(rigidTypeMarkerB) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean m(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return !Intrinsics.e(f(A0(kotlinTypeMarker)), f(C(kotlinTypeMarker)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean n(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.j(rigidTypeMarker, "<this>");
        return F0(rigidTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean n0(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.j(rigidTypeMarker, "<this>");
        return P(f(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker p(RigidTypeMarker rigidTypeMarker, int i10) {
        Intrinsics.j(rigidTypeMarker, "<this>");
        if (i10 < 0 || i10 >= j(rigidTypeMarker)) {
            return null;
        }
        return K(rigidTypeMarker, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker r(TypeArgumentListMarker typeArgumentListMarker, int i10) {
        Intrinsics.j(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return K((KotlinTypeMarker) typeArgumentListMarker, i10);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i10);
            Intrinsics.i(typeArgumentMarker, "get(...)");
            return typeArgumentMarker;
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.b(typeArgumentListMarker.getClass())).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker r0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return p0(kotlinTypeMarker, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean s(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerB = b(kotlinTypeMarker);
        return (rigidTypeMarkerB != null ? Y(rigidTypeMarkerB) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean z0(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return c0(h0(kotlinTypeMarker)) && !O(kotlinTypeMarker);
    }

    private SimpleClassicTypeSystemContext() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker B(Collection<? extends KotlinTypeMarker> collection) {
        return ClassicTypeSystemContext.DefaultImpls.E(this, collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeVariance B0(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.z(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean C0(KotlinTypeMarker kotlinTypeMarker, FqName fqName) {
        return ClassicTypeSystemContext.DefaultImpls.B(this, kotlinTypeMarker, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<TypeArgumentMarker> D(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.n(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeParameterMarker D0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.v(this, typeVariableTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean E(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.J(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean E0(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.O(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean F(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.K(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public DefinitelyNotNullTypeMarker F0(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.e(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
    public boolean G() {
        return ClassicTypeSystemContext.DefaultImpls.N(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean G0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.H(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker H(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.i(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
    public TypeCheckerState H0(boolean z10, boolean z11, boolean z12) {
        return ClassicTypeSystemContext.DefaultImpls.g0(this, z10, z11, z12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CapturedTypeConstructorMarker I(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.n0(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker I0(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.u(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean J(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Z(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public DynamicTypeMarker J0(FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.f(this, flexibleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker K(KotlinTypeMarker kotlinTypeMarker, int i10) {
        return ClassicTypeSystemContext.DefaultImpls.m(this, kotlinTypeMarker, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean K0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.a(this, typeConstructorMarker, typeConstructorMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public PrimitiveType L(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.s(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean M(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.a0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public SimpleType l(RigidTypeMarker rigidTypeMarker, CaptureStatus captureStatus) {
        return ClassicTypeSystemContext.DefaultImpls.j(this, rigidTypeMarker, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean N(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.F(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean O(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.R(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean P(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.L(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean Q(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.D(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean S(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.b0(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<KotlinTypeMarker> U(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.y(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean V(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.T(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int W(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.i0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public PrimitiveType Z(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.r(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    public KotlinTypeMarker a0(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.l(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public KotlinTypeMarker b0(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.t(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean c(TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Y(this, typeArgumentMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean c0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.Q(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean d(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.W(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public Collection<KotlinTypeMarker> d0(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.j0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean e0(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.S(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeConstructorMarker f(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.o0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public Collection<KotlinTypeMarker> g0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.m0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CapturedTypeMarker h(SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.d(this, simpleTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean i(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.c0(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean i0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.I(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int j(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.b(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean k(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.U(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeCheckerState.SupertypesPolicy k0(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.l0(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public FqNameUnsafe m0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.o(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean o(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.C(this, typeParameterMarker, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public FlexibleTypeMarker o0(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.g(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker p0(KotlinTypeMarker kotlinTypeMarker, boolean z10) {
        return ClassicTypeSystemContext.DefaultImpls.f0(this, kotlinTypeMarker, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentListMarker q(RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.c(this, rigidTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public CaptureStatus q0(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.k(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeArgumentMarker s0(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.k0(this, capturedTypeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeParameterMarker t(TypeConstructorMarker typeConstructorMarker, int i10) {
        return ClassicTypeSystemContext.DefaultImpls.p(this, typeConstructorMarker, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeParameterMarker u(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.w(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker u0(CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.e0(this, capturedTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public KotlinTypeMarker v(KotlinTypeMarker kotlinTypeMarker, boolean z10) {
        return ClassicTypeSystemContext.DefaultImpls.q0(this, kotlinTypeMarker, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean v0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.G(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public SimpleTypeMarker w(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.h0(this, definitelyNotNullTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean w0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.M(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean x(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.P(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public KotlinTypeMarker x0(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.x(this, kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public TypeVariance y(TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.A(this, typeParameterMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public List<TypeParameterMarker> y0(TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.q(this, typeConstructorMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean z(KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.V(this, kotlinTypeMarker);
    }
}
