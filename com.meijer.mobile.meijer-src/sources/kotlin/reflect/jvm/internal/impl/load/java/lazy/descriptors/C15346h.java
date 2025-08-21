package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15346h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f145459a;

    public C15346h(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f145459a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassDescriptor.N0(this.f145459a);
    }
}
