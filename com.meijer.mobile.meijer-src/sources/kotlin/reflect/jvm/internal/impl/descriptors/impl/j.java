package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;

/* loaded from: classes14.dex */
class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ValueParameterDescriptorImpl.WithDestructuringDeclaration f144935a;

    public j(ValueParameterDescriptorImpl.WithDestructuringDeclaration withDestructuringDeclaration) {
        this.f144935a = withDestructuringDeclaration;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ValueParameterDescriptorImpl.WithDestructuringDeclaration.M0(this.f144935a);
    }
}
