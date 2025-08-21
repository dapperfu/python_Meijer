package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    ReceiverParameterDescriptor c(TypeSubstitutor typeSubstitutor);

    ReceiverValue getValue();
}
