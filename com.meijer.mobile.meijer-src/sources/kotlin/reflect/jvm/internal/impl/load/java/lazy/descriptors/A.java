package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes14.dex */
class A implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145341a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaField f145342b;

    /* renamed from: c, reason: collision with root package name */
    private final Ref.ObjectRef f145343c;

    public A(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f145341a = lazyJavaScope;
        this.f145342b = javaField;
        this.f145343c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.c0(this.f145341a, this.f145342b, this.f145343c);
    }
}
