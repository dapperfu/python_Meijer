package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractBinaryClassAnnotationAndConstantLoader f144851a;

    public a(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader) {
        this.f144851a = abstractBinaryClassAnnotationAndConstantLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractBinaryClassAnnotationAndConstantLoader.L(this.f144851a, (KotlinJvmBinaryClass) obj);
    }
}
