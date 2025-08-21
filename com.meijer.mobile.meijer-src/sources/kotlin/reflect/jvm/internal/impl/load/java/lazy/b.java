package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes14.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145336a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotations f145337b;

    public b(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        this.f145336a = lazyJavaResolverContext;
        this.f145337b = annotations;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.l(this.f145336a, this.f145337b);
    }
}
