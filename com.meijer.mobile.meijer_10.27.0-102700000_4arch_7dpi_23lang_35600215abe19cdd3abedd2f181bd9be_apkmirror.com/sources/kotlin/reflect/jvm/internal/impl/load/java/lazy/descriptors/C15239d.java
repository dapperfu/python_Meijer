package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15239d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f144548a;

    public C15239d(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f144548a = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.s(this.f144548a);
    }
}
