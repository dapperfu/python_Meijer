package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15344f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f145457a;

    public C15344f(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f145457a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassDescriptor.T0(this.f145457a);
    }
}
