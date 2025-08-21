package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15343e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f145456a;

    public C15343e(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f145456a = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.f(this.f145456a);
    }
}
