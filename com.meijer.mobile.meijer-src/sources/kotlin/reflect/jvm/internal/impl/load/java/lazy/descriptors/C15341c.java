package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15341c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f145454a;

    public C15341c(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f145454a = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.i(this.f145454a);
    }
}
