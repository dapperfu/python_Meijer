package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15240e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f144549a;

    public C15240e(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f144549a = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.f(this.f144549a);
    }
}
