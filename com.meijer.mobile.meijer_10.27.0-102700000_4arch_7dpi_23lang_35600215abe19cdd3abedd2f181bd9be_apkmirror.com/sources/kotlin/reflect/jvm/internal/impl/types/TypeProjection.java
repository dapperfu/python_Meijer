package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* loaded from: classes13.dex */
public interface TypeProjection extends TypeArgumentMarker {
    boolean a();

    TypeProjection b(KotlinTypeRefiner kotlinTypeRefiner);

    Variance c();

    KotlinType getType();
}
