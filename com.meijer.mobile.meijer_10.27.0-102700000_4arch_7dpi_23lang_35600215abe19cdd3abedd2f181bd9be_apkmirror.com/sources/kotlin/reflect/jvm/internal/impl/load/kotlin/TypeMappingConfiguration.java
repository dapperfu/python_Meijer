package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public interface TypeMappingConfiguration<T> {
    T a(ClassDescriptor classDescriptor);

    String b(ClassDescriptor classDescriptor);

    String c(ClassDescriptor classDescriptor);

    KotlinType d(KotlinType kotlinType);

    void e(KotlinType kotlinType, ClassDescriptor classDescriptor);

    KotlinType f(Collection<KotlinType> collection);
}
