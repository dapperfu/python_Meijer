package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes13.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    R a(ClassDescriptor classDescriptor, D d10);

    R b(PackageViewDescriptor packageViewDescriptor, D d10);

    R c(PropertyDescriptor propertyDescriptor, D d10);

    R d(TypeAliasDescriptor typeAliasDescriptor, D d10);

    R e(PropertySetterDescriptor propertySetterDescriptor, D d10);

    R f(ValueParameterDescriptor valueParameterDescriptor, D d10);

    R g(PropertyGetterDescriptor propertyGetterDescriptor, D d10);

    R h(PackageFragmentDescriptor packageFragmentDescriptor, D d10);

    R i(FunctionDescriptor functionDescriptor, D d10);

    R j(ConstructorDescriptor constructorDescriptor, D d10);

    R k(ModuleDescriptor moduleDescriptor, D d10);

    R l(ReceiverParameterDescriptor receiverParameterDescriptor, D d10);

    R m(TypeParameterDescriptor typeParameterDescriptor, D d10);
}
