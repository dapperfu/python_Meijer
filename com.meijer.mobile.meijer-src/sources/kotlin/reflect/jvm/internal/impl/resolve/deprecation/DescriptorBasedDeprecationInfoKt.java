package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* loaded from: classes14.dex */
public final class DescriptorBasedDeprecationInfoKt {

    /* renamed from: a, reason: collision with root package name */
    private static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> f147116a = new CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1
    };

    public static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> a() {
        return f147116a;
    }
}
