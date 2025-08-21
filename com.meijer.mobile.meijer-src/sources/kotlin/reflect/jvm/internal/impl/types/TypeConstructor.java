package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* loaded from: classes14.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    Collection<KotlinType> a();

    TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner);

    ClassifierDescriptor d();

    boolean e();

    List<TypeParameterDescriptor> getParameters();

    KotlinBuiltIns l();
}
