package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;

/* loaded from: classes14.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    public R n(DeclarationDescriptor declarationDescriptor, D d10) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R a(ClassDescriptor classDescriptor, D d10) {
        return n(classDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R b(PackageViewDescriptor packageViewDescriptor, D d10) {
        return n(packageViewDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R c(PropertyDescriptor propertyDescriptor, D d10) {
        return o(propertyDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R d(TypeAliasDescriptor typeAliasDescriptor, D d10) {
        return n(typeAliasDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R e(PropertySetterDescriptor propertySetterDescriptor, D d10) {
        return i(propertySetterDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R f(ValueParameterDescriptor valueParameterDescriptor, D d10) {
        return o(valueParameterDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R g(PropertyGetterDescriptor propertyGetterDescriptor, D d10) {
        return i(propertyGetterDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R h(PackageFragmentDescriptor packageFragmentDescriptor, D d10) {
        return n(packageFragmentDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R i(FunctionDescriptor functionDescriptor, D d10) {
        return n(functionDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R j(ConstructorDescriptor constructorDescriptor, D d10) {
        return i(constructorDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R k(ModuleDescriptor moduleDescriptor, D d10) {
        return n(moduleDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R l(ReceiverParameterDescriptor receiverParameterDescriptor, D d10) {
        return n(receiverParameterDescriptor, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public R m(TypeParameterDescriptor typeParameterDescriptor, D d10) {
        return n(typeParameterDescriptor, d10);
    }

    public R o(VariableDescriptor variableDescriptor, D d10) {
        return n(variableDescriptor, d10);
    }
}
