package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* loaded from: classes14.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    void A0(Collection<? extends CallableMemberDescriptor> collection);

    CallableMemberDescriptor M(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, Kind kind, boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableMemberDescriptor a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<? extends CallableMemberDescriptor> d();

    Kind f();
}
