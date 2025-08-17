package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15238c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f144547a;

    public C15238c(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f144547a = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.i(this.f144547a);
    }
}
