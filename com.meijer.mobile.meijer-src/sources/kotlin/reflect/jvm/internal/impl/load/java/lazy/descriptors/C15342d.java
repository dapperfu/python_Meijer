package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15342d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f145455a;

    public C15342d(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f145455a = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.s(this.f145455a);
    }
}
