package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* loaded from: classes13.dex */
class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaTypeParameterResolver f144579a;

    public e(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        this.f144579a = lazyJavaTypeParameterResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaTypeParameterResolver.c(this.f144579a, (JavaTypeParameter) obj);
    }
}
