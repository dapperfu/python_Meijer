package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15243h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f144552a;

    public C15243h(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f144552a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassDescriptor.N0(this.f144552a);
    }
}
