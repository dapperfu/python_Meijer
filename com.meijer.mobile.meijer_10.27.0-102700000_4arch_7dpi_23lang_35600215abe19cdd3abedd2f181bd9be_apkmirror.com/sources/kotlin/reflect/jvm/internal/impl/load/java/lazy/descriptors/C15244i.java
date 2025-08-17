package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15244i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f144553a;

    public C15244i(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f144553a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassDescriptor.a.M(this.f144553a);
    }
}
