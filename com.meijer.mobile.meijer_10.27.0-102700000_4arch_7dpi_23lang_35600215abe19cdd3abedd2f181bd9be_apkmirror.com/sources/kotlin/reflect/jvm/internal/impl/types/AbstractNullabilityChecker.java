package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class AbstractNullabilityChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractNullabilityChecker f146664a = new AbstractNullabilityChecker();

    public final boolean a(TypeCheckerState typeCheckerState, RigidTypeMarker type, TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        Intrinsics.j(typeCheckerState, "<this>");
        Intrinsics.j(type, "type");
        Intrinsics.j(supertypesPolicy, "supertypesPolicy");
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        if ((typeSystemContextJ.R(type) && !typeSystemContextJ.E0(type)) || typeSystemContextJ.n(type)) {
            return true;
        }
        typeCheckerState.k();
        ArrayDeque<RigidTypeMarker> arrayDequeH = typeCheckerState.h();
        Intrinsics.g(arrayDequeH);
        Set<RigidTypeMarker> setI = typeCheckerState.i();
        Intrinsics.g(setI);
        arrayDequeH.push(type);
        while (!arrayDequeH.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeH.pop();
            Intrinsics.g(rigidTypeMarkerPop);
            if (setI.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = typeSystemContextJ.E0(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.f146760a : supertypesPolicy;
                if (Intrinsics.e(supertypesPolicy2, TypeCheckerState.SupertypesPolicy.None.f146760a)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextJ2 = typeCheckerState.j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextJ2.g0(typeSystemContextJ2.f(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerA = supertypesPolicy2.a(typeCheckerState, it.next());
                        if ((typeSystemContextJ.R(rigidTypeMarkerA) && !typeSystemContextJ.E0(rigidTypeMarkerA)) || typeSystemContextJ.n(rigidTypeMarkerA)) {
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

    public final boolean b(TypeCheckerState state, RigidTypeMarker start, TypeConstructorMarker end) {
        Intrinsics.j(state, "state");
        Intrinsics.j(start, "start");
        Intrinsics.j(end, "end");
        TypeSystemContext typeSystemContextJ = state.j();
        if (f146664a.c(state, start, end)) {
            return true;
        }
        state.k();
        ArrayDeque<RigidTypeMarker> arrayDequeH = state.h();
        Intrinsics.g(arrayDequeH);
        Set<RigidTypeMarker> setI = state.i();
        Intrinsics.g(setI);
        arrayDequeH.push(start);
        while (!arrayDequeH.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = arrayDequeH.pop();
            Intrinsics.g(rigidTypeMarkerPop);
            if (setI.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContextJ.E0(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.f146760a : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f146759a;
                if (Intrinsics.e(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.f146760a)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContextJ2 = state.j();
                    Iterator<KotlinTypeMarker> it = typeSystemContextJ2.g0(typeSystemContextJ2.f(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerA = supertypesPolicy.a(state, it.next());
                        if (f146664a.c(state, rigidTypeMarkerA, end)) {
                            state.e();
                            return true;
                        }
                        arrayDequeH.add(rigidTypeMarkerA);
                    }
                }
            }
        }
        state.e();
        return false;
    }

    public final boolean d(TypeCheckerState state, RigidTypeMarker subType, RigidTypeMarker superType) {
        Intrinsics.j(state, "state");
        Intrinsics.j(subType, "subType");
        Intrinsics.j(superType, "superType");
        return e(state, subType, superType);
    }

    private AbstractNullabilityChecker() {
    }

    private final boolean c(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        if (typeSystemContextJ.z0(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContextJ.E0(rigidTypeMarker)) {
            return false;
        }
        if (typeCheckerState.o() && typeSystemContextJ.J(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContextJ.K0(typeSystemContextJ.f(rigidTypeMarker), typeConstructorMarker);
    }

    private final boolean e(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContextJ = typeCheckerState.j();
        if (AbstractTypeChecker.f146671b) {
            if (!typeSystemContextJ.d(rigidTypeMarker) && !typeSystemContextJ.w0(typeSystemContextJ.f(rigidTypeMarker))) {
                typeCheckerState.l(rigidTypeMarker);
            }
            if (!typeSystemContextJ.d(rigidTypeMarker2)) {
                typeCheckerState.l(rigidTypeMarker2);
            }
        }
        if (typeSystemContextJ.E0(rigidTypeMarker2) || typeSystemContextJ.n(rigidTypeMarker) || typeSystemContextJ.x(rigidTypeMarker)) {
            return true;
        }
        if ((rigidTypeMarker instanceof CapturedTypeMarker) && typeSystemContextJ.k((CapturedTypeMarker) rigidTypeMarker)) {
            return true;
        }
        AbstractNullabilityChecker abstractNullabilityChecker = f146664a;
        if (abstractNullabilityChecker.a(typeCheckerState, rigidTypeMarker, TypeCheckerState.SupertypesPolicy.LowerIfFlexible.f146759a)) {
            return true;
        }
        if (typeSystemContextJ.n(rigidTypeMarker2) || abstractNullabilityChecker.a(typeCheckerState, rigidTypeMarker2, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.f146761a) || typeSystemContextJ.R(rigidTypeMarker)) {
            return false;
        }
        return abstractNullabilityChecker.b(typeCheckerState, rigidTypeMarker, typeSystemContextJ.f(rigidTypeMarker2));
    }
}
