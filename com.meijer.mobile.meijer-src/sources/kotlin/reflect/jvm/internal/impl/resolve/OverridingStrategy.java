package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes14.dex */
public abstract class OverridingStrategy {
    public abstract void a(CallableMemberDescriptor callableMemberDescriptor);

    public abstract void b(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void d(CallableMemberDescriptor member, Collection<? extends CallableMemberDescriptor> overridden) {
        Intrinsics.j(member, "member");
        Intrinsics.j(overridden, "overridden");
        member.A0(overridden);
    }
}
