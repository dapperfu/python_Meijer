package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;

/* loaded from: classes14.dex */
public final class VisibilityUtilKt {
    public static final CallableMemberDescriptor a(Collection<? extends CallableMemberDescriptor> descriptors) {
        Integer numD;
        Intrinsics.j(descriptors, "descriptors");
        descriptors.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : descriptors) {
            if (callableMemberDescriptor == null || ((numD = DescriptorVisibilities.d(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numD.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        Intrinsics.g(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
