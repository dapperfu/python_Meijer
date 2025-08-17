package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;

/* loaded from: classes13.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotations f144431a;

    public c(LazyJavaAnnotations lazyJavaAnnotations) {
        this.f144431a = lazyJavaAnnotations;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaAnnotations.f(this.f144431a, (JavaAnnotation) obj);
    }
}
