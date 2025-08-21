package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes14.dex */
public final class AbstractStrictEqualityTypeChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractStrictEqualityTypeChecker f147572a = new AbstractStrictEqualityTypeChecker();

    private final boolean c(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        RigidTypeMarker rigidTypeMarkerB = typeSystemContext.b(kotlinTypeMarker);
        RigidTypeMarker rigidTypeMarkerB2 = typeSystemContext.b(kotlinTypeMarker2);
        if (rigidTypeMarkerB != null && rigidTypeMarkerB2 != null) {
            return a(typeSystemContext, rigidTypeMarkerB, rigidTypeMarkerB2);
        }
        FlexibleTypeMarker flexibleTypeMarkerO0 = typeSystemContext.o0(kotlinTypeMarker);
        FlexibleTypeMarker flexibleTypeMarkerO02 = typeSystemContext.o0(kotlinTypeMarker2);
        return flexibleTypeMarkerO0 != null && flexibleTypeMarkerO02 != null && a(typeSystemContext, typeSystemContext.e(flexibleTypeMarkerO0), typeSystemContext.e(flexibleTypeMarkerO02)) && a(typeSystemContext, typeSystemContext.g(flexibleTypeMarkerO0), typeSystemContext.g(flexibleTypeMarkerO02));
    }

    public final boolean b(TypeSystemContext context, KotlinTypeMarker a10, KotlinTypeMarker b10) {
        Intrinsics.j(context, "context");
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return c(context, a10, b10);
    }

    private AbstractStrictEqualityTypeChecker() {
    }

    private final boolean a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.j(rigidTypeMarker) != typeSystemContext.j(rigidTypeMarker2) || typeSystemContext.E0(rigidTypeMarker) != typeSystemContext.E0(rigidTypeMarker2) || typeSystemContext.n(rigidTypeMarker) != typeSystemContext.n(rigidTypeMarker2) || !typeSystemContext.K0(typeSystemContext.f(rigidTypeMarker), typeSystemContext.f(rigidTypeMarker2))) {
            return false;
        }
        if (typeSystemContext.Q(rigidTypeMarker, rigidTypeMarker2)) {
            return true;
        }
        int iJ = typeSystemContext.j(rigidTypeMarker);
        for (int i10 = 0; i10 < iJ; i10++) {
            TypeArgumentMarker typeArgumentMarkerK = typeSystemContext.K(rigidTypeMarker, i10);
            TypeArgumentMarker typeArgumentMarkerK2 = typeSystemContext.K(rigidTypeMarker2, i10);
            if (typeSystemContext.c(typeArgumentMarkerK) != typeSystemContext.c(typeArgumentMarkerK2)) {
                return false;
            }
            if (!typeSystemContext.c(typeArgumentMarkerK)) {
                if (typeSystemContext.B0(typeArgumentMarkerK) != typeSystemContext.B0(typeArgumentMarkerK2)) {
                    return false;
                }
                KotlinTypeMarker kotlinTypeMarkerI0 = typeSystemContext.I0(typeArgumentMarkerK);
                Intrinsics.g(kotlinTypeMarkerI0);
                KotlinTypeMarker kotlinTypeMarkerI02 = typeSystemContext.I0(typeArgumentMarkerK2);
                Intrinsics.g(kotlinTypeMarkerI02);
                if (!c(typeSystemContext, kotlinTypeMarkerI0, kotlinTypeMarkerI02)) {
                    return false;
                }
            }
        }
        return true;
    }
}
