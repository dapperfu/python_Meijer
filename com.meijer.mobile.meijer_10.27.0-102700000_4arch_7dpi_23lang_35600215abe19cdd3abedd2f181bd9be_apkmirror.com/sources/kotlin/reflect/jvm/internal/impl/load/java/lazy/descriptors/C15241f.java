package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15241f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f144550a;

    public C15241f(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f144550a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassDescriptor.T0(this.f144550a);
    }
}
