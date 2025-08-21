package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* loaded from: classes14.dex */
public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    Contract a();

    Result b(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor);
}
