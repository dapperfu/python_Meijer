package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;

/* loaded from: classes13.dex */
class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeAliasConstructorDescriptorImpl f144026a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassConstructorDescriptor f144027b;

    public i(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        this.f144026a = typeAliasConstructorDescriptorImpl;
        this.f144027b = classConstructorDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeAliasConstructorDescriptorImpl.o1(this.f144026a, this.f144027b);
    }
}
