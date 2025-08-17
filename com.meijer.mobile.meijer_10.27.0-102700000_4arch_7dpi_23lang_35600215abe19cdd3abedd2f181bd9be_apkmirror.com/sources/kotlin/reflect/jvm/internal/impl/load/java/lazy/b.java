package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144429a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotations f144430b;

    public b(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        this.f144429a = lazyJavaResolverContext;
        this.f144430b = annotations;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.l(this.f144429a, this.f144430b);
    }
}
