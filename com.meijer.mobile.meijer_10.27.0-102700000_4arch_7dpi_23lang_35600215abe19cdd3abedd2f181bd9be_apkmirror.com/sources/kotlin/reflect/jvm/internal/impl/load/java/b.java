package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* loaded from: classes13.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleFunctionDescriptor f144316a;

    public b(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        this.f144316a = simpleFunctionDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.l(this.f144316a, (CallableMemberDescriptor) obj));
    }
}
