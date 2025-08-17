package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes13.dex */
class A implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144434a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaField f144435b;

    /* renamed from: c, reason: collision with root package name */
    private final Ref.ObjectRef f144436c;

    public A(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f144434a = lazyJavaScope;
        this.f144435b = javaField;
        this.f144436c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.c0(this.f144434a, this.f144435b, this.f144436c);
    }
}
