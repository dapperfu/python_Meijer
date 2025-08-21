package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* loaded from: classes14.dex */
class k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f144482a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassDescriptor f144483b;

    public k(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        this.f144482a = lazyJavaClassDescriptor;
        this.f144483b = classDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.u(this.f144482a, this.f144483b);
    }
}
