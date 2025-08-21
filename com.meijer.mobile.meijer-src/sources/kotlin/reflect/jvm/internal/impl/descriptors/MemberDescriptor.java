package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes14.dex */
public interface MemberDescriptor extends DeclarationDescriptorNonRoot, DeclarationDescriptorWithVisibility {
    boolean V();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    DescriptorVisibility getVisibility();

    boolean h0();

    boolean isExternal();

    Modality q();
}
