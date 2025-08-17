package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* loaded from: classes13.dex */
class z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144576a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaField f144577b;

    /* renamed from: c, reason: collision with root package name */
    private final Ref.ObjectRef f144578c;

    public z(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f144576a = lazyJavaScope;
        this.f144577b = javaField;
        this.f144578c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.b0(this.f144576a, this.f144577b, this.f144578c);
    }
}
