package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes14.dex */
class z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145483a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaField f145484b;

    /* renamed from: c, reason: collision with root package name */
    private final Ref.ObjectRef f145485c;

    public z(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f145483a = lazyJavaScope;
        this.f145484b = javaField;
        this.f145485c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.b0(this.f145483a, this.f145484b, this.f145485c);
    }
}
