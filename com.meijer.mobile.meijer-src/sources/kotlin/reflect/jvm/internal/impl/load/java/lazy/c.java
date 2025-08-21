package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;

/* loaded from: classes14.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotations f145338a;

    public c(LazyJavaAnnotations lazyJavaAnnotations) {
        this.f145338a = lazyJavaAnnotations;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaAnnotations.f(this.f145338a, (JavaAnnotation) obj);
    }
}
