package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15242g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f144551a;

    public C15242g(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f144551a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassDescriptor.U0(this.f144551a, (KotlinTypeRefiner) obj);
    }
}
