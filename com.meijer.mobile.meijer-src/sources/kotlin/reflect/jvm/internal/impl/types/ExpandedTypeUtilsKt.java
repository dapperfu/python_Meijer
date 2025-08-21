package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* loaded from: classes14.dex */
public final class ExpandedTypeUtilsKt {
    public static final KotlinTypeMarker a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker inlineClassType) {
        Intrinsics.j(typeSystemCommonBackendContext, "<this>");
        Intrinsics.j(inlineClassType, "inlineClassType");
        return b(typeSystemCommonBackendContext, inlineClassType, new HashSet());
    }

    private static final KotlinTypeMarker b(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet<TypeConstructorMarker> hashSet) {
        KotlinTypeMarker kotlinTypeMarkerB;
        boolean z10;
        TypeConstructorMarker typeConstructorMarkerH0 = typeSystemCommonBackendContext.h0(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerH0)) {
            return null;
        }
        TypeParameterMarker typeParameterMarkerU = typeSystemCommonBackendContext.u(typeConstructorMarkerH0);
        if (typeParameterMarkerU != null) {
            KotlinTypeMarker kotlinTypeMarkerB0 = typeSystemCommonBackendContext.b0(typeParameterMarkerU);
            KotlinTypeMarker kotlinTypeMarkerB2 = b(typeSystemCommonBackendContext, kotlinTypeMarkerB0, hashSet);
            if (kotlinTypeMarkerB2 == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.F(typeSystemCommonBackendContext.h0(kotlinTypeMarkerB0)) && (!(kotlinTypeMarkerB0 instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.V((SimpleTypeMarker) kotlinTypeMarkerB0))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((kotlinTypeMarkerB2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.V((SimpleTypeMarker) kotlinTypeMarkerB2) && typeSystemCommonBackendContext.O(kotlinTypeMarker) && z10) {
                return typeSystemCommonBackendContext.L0(kotlinTypeMarkerB0);
            }
            if (!typeSystemCommonBackendContext.O(kotlinTypeMarkerB2) && typeSystemCommonBackendContext.E0(kotlinTypeMarker)) {
                return typeSystemCommonBackendContext.L0(kotlinTypeMarkerB2);
            }
            return kotlinTypeMarkerB2;
        }
        if (typeSystemCommonBackendContext.F(typeConstructorMarkerH0)) {
            KotlinTypeMarker kotlinTypeMarkerX0 = typeSystemCommonBackendContext.x0(kotlinTypeMarker);
            if (kotlinTypeMarkerX0 == null || (kotlinTypeMarkerB = b(typeSystemCommonBackendContext, kotlinTypeMarkerX0, hashSet)) == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.O(kotlinTypeMarker)) {
                return kotlinTypeMarkerB;
            }
            if (!typeSystemCommonBackendContext.O(kotlinTypeMarkerB) && (!(kotlinTypeMarkerB instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.V((SimpleTypeMarker) kotlinTypeMarkerB))) {
                return typeSystemCommonBackendContext.L0(kotlinTypeMarkerB);
            }
        }
        return kotlinTypeMarker;
    }
}
