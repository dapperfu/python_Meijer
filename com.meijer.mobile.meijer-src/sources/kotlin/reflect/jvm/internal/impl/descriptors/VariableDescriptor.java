package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
public interface VariableDescriptor extends ValueDescriptor {
    boolean L();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    VariableDescriptor c(TypeSubstitutor typeSubstitutor);

    boolean isConst();

    ConstantValue<?> l0();

    boolean v0();
}
