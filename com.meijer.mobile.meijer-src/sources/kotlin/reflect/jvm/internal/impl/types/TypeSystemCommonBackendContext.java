package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes14.dex */
public interface TypeSystemCommonBackendContext extends TypeSystemContext {
    boolean C0(KotlinTypeMarker kotlinTypeMarker, FqName fqName);

    boolean F(TypeConstructorMarker typeConstructorMarker);

    PrimitiveType L(TypeConstructorMarker typeConstructorMarker);

    KotlinTypeMarker L0(KotlinTypeMarker kotlinTypeMarker);

    PrimitiveType Z(TypeConstructorMarker typeConstructorMarker);

    KotlinTypeMarker b0(TypeParameterMarker typeParameterMarker);

    boolean i(TypeConstructorMarker typeConstructorMarker);

    FqNameUnsafe m0(TypeConstructorMarker typeConstructorMarker);

    KotlinTypeMarker x0(KotlinTypeMarker kotlinTypeMarker);
}
