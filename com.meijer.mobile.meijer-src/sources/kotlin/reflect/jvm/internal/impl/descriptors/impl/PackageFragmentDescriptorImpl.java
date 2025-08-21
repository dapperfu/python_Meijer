package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {

    /* renamed from: e, reason: collision with root package name */
    private final FqName f144849e;

    /* renamed from: f, reason: collision with root package name */
    private final String f144850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentDescriptorImpl(ModuleDescriptor module, FqName fqName) {
        super(module, Annotations.f144596s3.b(), fqName.g(), SourceElement.f144554a);
        Intrinsics.j(module, "module");
        Intrinsics.j(fqName, "fqName");
        this.f144849e = fqName;
        this.f144850f = "package " + fqName + " of " + module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ModuleDescriptor b() {
        DeclarationDescriptor declarationDescriptorB = super.b();
        Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (ModuleDescriptor) declarationDescriptorB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final FqName e() {
        return this.f144849e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        SourceElement NO_SOURCE = SourceElement.f144554a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return this.f144850f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.j(visitor, "visitor");
        return visitor.h(this, d10);
    }
}
