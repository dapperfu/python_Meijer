package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes14.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    protected abstract void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void b(CallableMemberDescriptor first, CallableMemberDescriptor second) {
        Intrinsics.j(first, "first");
        Intrinsics.j(second, "second");
        e(first, second);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void c(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
        Intrinsics.j(fromSuper, "fromSuper");
        Intrinsics.j(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }
}
