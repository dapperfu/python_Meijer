package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

/* loaded from: classes13.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    DeclarationDescriptor a();

    DeclarationDescriptor b();

    <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10);
}
