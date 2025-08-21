package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;

/* loaded from: classes14.dex */
class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeAliasConstructorDescriptorImpl f144933a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassConstructorDescriptor f144934b;

    public i(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        this.f144933a = typeAliasConstructorDescriptorImpl;
        this.f144934b = classConstructorDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeAliasConstructorDescriptorImpl.o1(this.f144933a, this.f144934b);
    }
}
