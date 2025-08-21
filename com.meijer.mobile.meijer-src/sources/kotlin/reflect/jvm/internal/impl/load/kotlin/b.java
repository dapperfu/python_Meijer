package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;

/* loaded from: classes14.dex */
class b implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f145759a = new b();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return AbstractBinaryClassAnnotationAndConstantLoader.G((AnnotationsContainerWithConstants) obj, (MemberSignature) obj2);
    }
}
