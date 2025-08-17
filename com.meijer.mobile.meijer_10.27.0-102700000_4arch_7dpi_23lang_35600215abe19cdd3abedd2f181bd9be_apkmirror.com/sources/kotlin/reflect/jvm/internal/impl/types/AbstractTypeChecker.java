package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AbstractTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractTypeChecker f146670a = new AbstractTypeChecker();

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static boolean f146671b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.f147015d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.f147014c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.f147013b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.f146754a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.f146755b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.f146756c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @JvmOverloads
    public final boolean t(TypeCheckerState state, KotlinTypeMarker subType, KotlinTypeMarker superType) {
        Intrinsics.j(state, "state");
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return v(this, state, subType, superType, false, 8, null);
    }

    private static final boolean d(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker kotlinTypeMarkerI0;
        RigidTypeMarker rigidTypeMarkerC;
        return (rigidTypeMarker instanceof CapturedTypeMarker) && (kotlinTypeMarkerI0 = typeSystemContext.I0(typeSystemContext.s0(typeSystemContext.I((CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerC = typeSystemContext.C(kotlinTypeMarkerI0)) != null && typeSystemContext.n0(rigidTypeMarkerC);
    }

    public static /* synthetic */ boolean v(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return abstractTypeChecker.u(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean w(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r18, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r19, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.w(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeCheckerState.ForkPointContext runForkingPoint) {
        Intrinsics.j(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new b(typeCheckerState, typeSystemContext, (RigidTypeMarker) it.next(), rigidTypeMarker));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return f146670a.s(typeCheckerState, typeSystemContext.q(rigidTypeMarker), rigidTypeMarker2);
    }

    public final TypeVariance l(TypeVariance declared, TypeVariance useSite) {
        Intrinsics.j(declared, "declared");
        Intrinsics.j(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.f147015d;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean m(TypeCheckerState state, KotlinTypeMarker a10, KotlinTypeMarker b10) {
        Intrinsics.j(state, "state");
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        TypeSystemContext typeSystemContextJ = state.j();
        if (a10 == b10) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = f146670a;
        if (abstractTypeChecker.q(typeSystemContextJ, a10) && abstractTypeChecker.q(typeSystemContextJ, b10)) {
            KotlinTypeMarker kotlinTypeMarkerP = state.p(state.q(a10));
            KotlinTypeMarker kotlinTypeMarkerP2 = state.p(state.q(b10));
            RigidTypeMarker rigidTypeMarkerA0 = typeSystemContextJ.A0(kotlinTypeMarkerP);
            if (!typeSystemContextJ.K0(typeSystemContextJ.h0(kotlinTypeMarkerP), typeSystemContextJ.h0(kotlinTypeMarkerP2))) {
                return false;
            }
            if (typeSystemContextJ.j(rigidTypeMarkerA0) == 0) {
                return typeSystemContextJ.j0(kotlinTypeMarkerP) || typeSystemContextJ.j0(kotlinTypeMarkerP2) || typeSystemContextJ.E0(rigidTypeMarkerA0) == typeSystemContextJ.E0(typeSystemContextJ.A0(kotlinTypeMarkerP2));
            }
        }
        return v(abstractTypeChecker, state, a10, b10, false, 8, null) && v(abstractTypeChecker, state, b10, a10, false, 8, null);
    }

    public final List<RigidTypeMarker> n(TypeCheckerState state, RigidTypeMarker subType, TypeConstructorMarker superConstructor) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        Intrinsics.j(state, "state");
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superConstructor, "superConstructor");
        TypeSystemContext typeSystemContextJ = state.j();
        if (typeSystemContextJ.R(subType)) {
            return f146670a.j(state, subType, superConstructor);
        }
        if (!typeSystemContextJ.v0(superConstructor) && !typeSystemContextJ.P(superConstructor)) {
            return f146670a.i(state, subType, superConstructor);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        state.k();
        ArrayDeque<RigidTypeMarker> arrayDequeH = state.h();
        Intrinsics.g(arrayDequeH);
        Set<RigidTypeMarker> setI = state.i();
        Intrinsics.g(setI);
        arrayDequeH.push(subType);
        while (!arrayDequeH.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeH.pop();
            Intrinsics.g(rigidTypeMarkerPop);
            if (setI.add(rigidTypeMarkerPop)) {
                if (typeSystemContextJ.R(rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.f146760a;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f146759a;
                }
                if (Intrinsics.e(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.f146760a)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContextJ2 = state.j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextJ2.g0(typeSystemContextJ2.f(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(supertypesPolicy.a(state, it.next()));
                    }
                }
            }
        }
        state.e();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker : smartList) {
            AbstractTypeChecker abstractTypeChecker = f146670a;
            Intrinsics.g(rigidTypeMarker);
            CollectionsKt.C(arrayList, abstractTypeChecker.j(state, rigidTypeMarker, superConstructor));
        }
        return arrayList;
    }

    public final boolean s(TypeCheckerState typeCheckerState, TypeArgumentListMarker capturedSubArguments, RigidTypeMarker superType) {
        boolean zM;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        Intrinsics.j(typeCheckerState2, "<this>");
        Intrinsics.j(capturedSubArguments, "capturedSubArguments");
        Intrinsics.j(superType, "superType");
        TypeSystemContext typeSystemContextJ = typeCheckerState2.j();
        TypeConstructorMarker typeConstructorMarkerF = typeSystemContextJ.f(superType);
        int iA = typeSystemContextJ.A(capturedSubArguments);
        int iW = typeSystemContextJ.W(typeConstructorMarkerF);
        if (iA != iW || iA != typeSystemContextJ.j(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iW; i10++) {
            TypeArgumentMarker typeArgumentMarkerK = typeSystemContextJ.K(superType, i10);
            KotlinTypeMarker kotlinTypeMarkerI0 = typeSystemContextJ.I0(typeArgumentMarkerK);
            if (kotlinTypeMarkerI0 != null) {
                TypeArgumentMarker typeArgumentMarkerR = typeSystemContextJ.r(capturedSubArguments, i10);
                typeSystemContextJ.B0(typeArgumentMarkerR);
                TypeVariance typeVariance = TypeVariance.f147015d;
                KotlinTypeMarker kotlinTypeMarkerI02 = typeSystemContextJ.I0(typeArgumentMarkerR);
                Intrinsics.g(kotlinTypeMarkerI02);
                AbstractTypeChecker abstractTypeChecker = f146670a;
                TypeVariance typeVarianceL = abstractTypeChecker.l(typeSystemContextJ.y(typeSystemContextJ.t(typeConstructorMarkerF, i10)), typeSystemContextJ.B0(typeArgumentMarkerK));
                if (typeVarianceL == null) {
                    return typeCheckerState2.n();
                }
                if (typeVarianceL != typeVariance || (!abstractTypeChecker.z(typeSystemContextJ, kotlinTypeMarkerI02, kotlinTypeMarkerI0, typeConstructorMarkerF) && !abstractTypeChecker.z(typeSystemContextJ, kotlinTypeMarkerI0, kotlinTypeMarkerI02, typeConstructorMarkerF))) {
                    if (typeCheckerState2.f146749h > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + kotlinTypeMarkerI02).toString());
                    }
                    typeCheckerState2.f146749h++;
                    int i11 = WhenMappings.$EnumSwitchMapping$0[typeVarianceL.ordinal()];
                    if (i11 == 1) {
                        zM = abstractTypeChecker.m(typeCheckerState2, kotlinTypeMarkerI02, kotlinTypeMarkerI0);
                    } else if (i11 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        zM = v(abstractTypeChecker, typeCheckerState2, kotlinTypeMarkerI02, kotlinTypeMarkerI0, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM = v(abstractTypeChecker, typeCheckerState2, kotlinTypeMarkerI0, kotlinTypeMarkerI02, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    typeCheckerState2.f146749h--;
                    if (!zM) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @JvmOverloads
    public final boolean u(TypeCheckerState state, KotlinTypeMarker subType, KotlinTypeMarker superType, boolean z10) {
        Intrinsics.j(state, "state");
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.f(subType, superType)) {
            return k(state, subType, superType, z10);
        }
        return false;
    }

    private AbstractTypeChecker() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<RigidTypeMarker> A(TypeCheckerState typeCheckerState, List<? extends RigidTypeMarker> list) {
        FlexibleTypeMarker flexibleTypeMarkerO0;
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TypeArgumentListMarker typeArgumentListMarkerQ = typeSystemContextJ.q((RigidTypeMarker) obj);
                int iA = typeSystemContextJ.A(typeArgumentListMarkerQ);
                int i10 = 0;
                while (true) {
                    if (i10 < iA) {
                        KotlinTypeMarker kotlinTypeMarkerI0 = typeSystemContextJ.I0(typeSystemContextJ.r(typeArgumentListMarkerQ, i10));
                        if (kotlinTypeMarkerI0 != null) {
                            flexibleTypeMarkerO0 = typeSystemContextJ.o0(kotlinTypeMarkerI0);
                        } else {
                            flexibleTypeMarkerO0 = null;
                        }
                        if (flexibleTypeMarkerO0 == null) {
                            i10++;
                        }
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    private final Boolean c(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        if (!typeSystemContextJ.n0(rigidTypeMarker) && !typeSystemContextJ.n0(rigidTypeMarker2)) {
            return null;
        }
        if (f(typeSystemContextJ, rigidTypeMarker) && f(typeSystemContextJ, rigidTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (typeSystemContextJ.n0(rigidTypeMarker)) {
            if (g(typeSystemContextJ, typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (typeSystemContextJ.n0(rigidTypeMarker2) && (e(typeSystemContextJ, rigidTypeMarker) || g(typeSystemContextJ, typeCheckerState, rigidTypeMarker2, rigidTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean e(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerF = typeSystemContext.f(rigidTypeMarker);
        if (typeConstructorMarkerF instanceof IntersectionTypeConstructorMarker) {
            Collection<KotlinTypeMarker> collectionG0 = typeSystemContext.g0(typeConstructorMarkerF);
            if (!(collectionG0 instanceof Collection) || !collectionG0.isEmpty()) {
                Iterator<T> it = collectionG0.iterator();
                while (it.hasNext()) {
                    RigidTypeMarker rigidTypeMarkerB = typeSystemContext.b((KotlinTypeMarker) it.next());
                    if (rigidTypeMarkerB != null && typeSystemContext.n0(rigidTypeMarkerB)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static final boolean f(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        if (!typeSystemContext.n0(rigidTypeMarker) && !d(typeSystemContext, rigidTypeMarker)) {
            return false;
        }
        return true;
    }

    private static final boolean g(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z10) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> collectionD0 = typeSystemContext.d0(rigidTypeMarker);
        if ((collectionD0 instanceof Collection) && collectionD0.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionD0) {
            if (!Intrinsics.e(typeSystemContext.h0(kotlinTypeMarker), typeSystemContext.f(rigidTypeMarker2))) {
                if (z10) {
                    typeCheckerState2 = typeCheckerState;
                    rigidTypeMarker3 = rigidTypeMarker2;
                    if (v(f146670a, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
                        return true;
                    }
                } else {
                    typeCheckerState2 = typeCheckerState;
                    rigidTypeMarker3 = rigidTypeMarker2;
                }
                typeCheckerState = typeCheckerState2;
                rigidTypeMarker2 = rigidTypeMarker3;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean h(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r13, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r14, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.h(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker):java.lang.Boolean");
    }

    private final List<RigidTypeMarker> i(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicyK0;
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        List<SimpleTypeMarker> listT0 = typeSystemContextJ.t0(rigidTypeMarker, typeConstructorMarker);
        if (listT0 != null) {
            return listT0;
        }
        if (!typeSystemContextJ.v0(typeConstructorMarker) && typeSystemContextJ.R(rigidTypeMarker)) {
            return CollectionsKt.m();
        }
        if (typeSystemContextJ.G0(typeConstructorMarker)) {
            if (typeSystemContextJ.K0(typeSystemContextJ.f(rigidTypeMarker), typeConstructorMarker)) {
                RigidTypeMarker rigidTypeMarkerL = typeSystemContextJ.l(rigidTypeMarker, CaptureStatus.f147008a);
                if (rigidTypeMarkerL != null) {
                    rigidTypeMarker = rigidTypeMarkerL;
                }
                return CollectionsKt.e(rigidTypeMarker);
            }
            return CollectionsKt.m();
        }
        SmartList smartList = new SmartList();
        typeCheckerState.k();
        ArrayDeque<RigidTypeMarker> arrayDequeH = typeCheckerState.h();
        Intrinsics.g(arrayDequeH);
        Set<RigidTypeMarker> setI = typeCheckerState.i();
        Intrinsics.g(setI);
        arrayDequeH.push(rigidTypeMarker);
        while (!arrayDequeH.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeH.pop();
            Intrinsics.g(rigidTypeMarkerPop);
            if (setI.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerL2 = typeSystemContextJ.l(rigidTypeMarkerPop, CaptureStatus.f147008a);
                if (rigidTypeMarkerL2 == null) {
                    rigidTypeMarkerL2 = rigidTypeMarkerPop;
                }
                if (typeSystemContextJ.K0(typeSystemContextJ.f(rigidTypeMarkerL2), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerL2);
                    supertypesPolicyK0 = TypeCheckerState.SupertypesPolicy.None.f146760a;
                } else if (typeSystemContextJ.j(rigidTypeMarkerL2) == 0) {
                    supertypesPolicyK0 = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f146759a;
                } else {
                    supertypesPolicyK0 = typeCheckerState.j().k0(rigidTypeMarkerL2);
                }
                if (Intrinsics.e(supertypesPolicyK0, TypeCheckerState.SupertypesPolicy.None.f146760a)) {
                    supertypesPolicyK0 = null;
                }
                if (supertypesPolicyK0 != null) {
                    TypeSystemContext typeSystemContextJ2 = typeCheckerState.j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextJ2.g0(typeSystemContextJ2.f(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeH.add(supertypesPolicyK0.a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.e();
        return smartList;
    }

    private final List<RigidTypeMarker> j(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return A(typeCheckerState, i(typeCheckerState, rigidTypeMarker, typeConstructorMarker));
    }

    private final boolean k(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z10) {
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        KotlinTypeMarker kotlinTypeMarkerP = typeCheckerState.p(typeCheckerState.q(kotlinTypeMarker));
        KotlinTypeMarker kotlinTypeMarkerP2 = typeCheckerState.p(typeCheckerState.q(kotlinTypeMarker2));
        if (typeCheckerState.m() && typeSystemContextJ.T(kotlinTypeMarkerP) && typeSystemContextJ.l0(kotlinTypeMarkerP2)) {
            AbstractTypeChecker abstractTypeChecker = f146670a;
            FlexibleTypeMarker flexibleTypeMarkerO0 = typeSystemContextJ.o0(kotlinTypeMarkerP);
            Intrinsics.g(flexibleTypeMarkerO0);
            RigidTypeMarker rigidTypeMarkerE = typeSystemContextJ.e(flexibleTypeMarkerO0);
            RigidTypeMarker rigidTypeMarkerB = typeSystemContextJ.b(kotlinTypeMarkerP2);
            Intrinsics.g(rigidTypeMarkerB);
            return abstractTypeChecker.k(typeCheckerState, rigidTypeMarkerE, typeSystemContextJ.X(rigidTypeMarkerB), z10);
        }
        AbstractTypeChecker abstractTypeChecker2 = f146670a;
        Boolean boolH = abstractTypeChecker2.h(typeCheckerState, typeSystemContextJ.A0(kotlinTypeMarkerP), typeSystemContextJ.C(kotlinTypeMarkerP2));
        if (boolH != null) {
            boolean zBooleanValue = boolH.booleanValue();
            typeCheckerState.c(kotlinTypeMarkerP, kotlinTypeMarkerP2, z10);
            return zBooleanValue;
        }
        Boolean boolC = typeCheckerState.c(kotlinTypeMarkerP, kotlinTypeMarkerP2, z10);
        if (boolC != null) {
            return boolC.booleanValue();
        }
        return abstractTypeChecker2.w(typeCheckerState, typeSystemContextJ.A0(kotlinTypeMarkerP), typeSystemContextJ.C(kotlinTypeMarkerP2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return r7.t(r7.h0(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker o(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r7, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r8, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r9) {
        /*
            r6 = this;
            int r0 = r7.j(r8)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5e
            kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker r4 = r7.K(r8, r2)
            boolean r5 = r7.c(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r3 = r7.I0(r3)
            if (r3 != 0) goto L1d
            goto L5b
        L1d:
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r4 = r7.A0(r3)
            boolean r4 = r7.s(r4)
            if (r4 == 0) goto L33
            kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker r4 = r7.A0(r9)
            boolean r4 = r7.s(r4)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r1
        L34:
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r3, r9)
            if (r5 != 0) goto L52
            if (r4 == 0) goto L4b
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r4 = r7.h0(r3)
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r5 = r7.h0(r9)
            boolean r4 = kotlin.jvm.internal.Intrinsics.e(r4, r5)
            if (r4 == 0) goto L4b
            goto L52
        L4b:
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r3 = r6.o(r7, r3, r9)
            if (r3 == 0) goto L5b
            return r3
        L52:
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker r8 = r7.h0(r8)
            kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker r7 = r7.t(r8, r2)
            return r7
        L5b:
            int r2 = r2 + 1
            goto L6
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.o(kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker):kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker");
    }

    private final boolean p(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        TypeConstructorMarker typeConstructorMarkerF = typeSystemContextJ.f(rigidTypeMarker);
        if (typeSystemContextJ.v0(typeConstructorMarkerF)) {
            return typeSystemContextJ.c0(typeConstructorMarkerF);
        }
        if (typeSystemContextJ.c0(typeSystemContextJ.f(rigidTypeMarker))) {
            return true;
        }
        typeCheckerState.k();
        ArrayDeque<RigidTypeMarker> arrayDequeH = typeCheckerState.h();
        Intrinsics.g(arrayDequeH);
        Set<RigidTypeMarker> setI = typeCheckerState.i();
        Intrinsics.g(setI);
        arrayDequeH.push(rigidTypeMarker);
        while (!arrayDequeH.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeH.pop();
            Intrinsics.g(rigidTypeMarkerPop);
            if (setI.add(rigidTypeMarkerPop)) {
                if (typeSystemContextJ.R(rigidTypeMarkerPop)) {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.f146760a;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f146759a;
                }
                if (Intrinsics.e(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.f146760a)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextJ2 = typeCheckerState.j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextJ2.g0(typeSystemContextJ2.f(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerA = supertypesPolicy.a(typeCheckerState, it.next());
                        if (typeSystemContextJ.c0(typeSystemContextJ.f(rigidTypeMarkerA))) {
                            typeCheckerState.e();
                            return true;
                        }
                        arrayDequeH.add(rigidTypeMarkerA);
                    }
                }
            }
        }
        typeCheckerState.e();
        return false;
    }

    private final boolean q(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        if (typeSystemContext.i0(typeSystemContext.h0(kotlinTypeMarker)) && !typeSystemContext.f0(kotlinTypeMarker) && !typeSystemContext.l0(kotlinTypeMarker) && !typeSystemContext.x(kotlinTypeMarker) && !typeSystemContext.m(kotlinTypeMarker)) {
            return true;
        }
        return false;
    }

    private final boolean r(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.f(rigidTypeMarker) != typeSystemContext.f(rigidTypeMarker2)) {
            return false;
        }
        if (!typeSystemContext.n(rigidTypeMarker) && typeSystemContext.n(rigidTypeMarker2)) {
            return false;
        }
        if (typeSystemContext.E0(rigidTypeMarker) && !typeSystemContext.E0(rigidTypeMarker2)) {
            return false;
        }
        return true;
    }

    private final boolean z(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker;
        TypeParameterMarker typeParameterMarkerD0;
        RigidTypeMarker rigidTypeMarkerB = typeSystemContext.b(kotlinTypeMarker);
        if (rigidTypeMarkerB instanceof CapturedTypeMarker) {
            CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerB;
            if (typeSystemContext.e0(capturedTypeMarker) || !typeSystemContext.c(typeSystemContext.s0(typeSystemContext.I(capturedTypeMarker))) || typeSystemContext.q0(capturedTypeMarker) != CaptureStatus.f147008a) {
                return false;
            }
            TypeConstructorMarker typeConstructorMarkerH0 = typeSystemContext.h0(kotlinTypeMarker2);
            if (typeConstructorMarkerH0 instanceof TypeVariableTypeConstructorMarker) {
                typeVariableTypeConstructorMarker = (TypeVariableTypeConstructorMarker) typeConstructorMarkerH0;
            } else {
                typeVariableTypeConstructorMarker = null;
            }
            if (typeVariableTypeConstructorMarker != null && (typeParameterMarkerD0 = typeSystemContext.D0(typeVariableTypeConstructorMarker)) != null && typeSystemContext.o(typeParameterMarkerD0, typeConstructorMarker)) {
                return true;
            }
        }
        return false;
    }
}
