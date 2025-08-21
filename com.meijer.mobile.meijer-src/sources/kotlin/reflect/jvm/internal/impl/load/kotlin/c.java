package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;

/* loaded from: classes14.dex */
class c implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f145760a = new c();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return AbstractBinaryClassAnnotationAndConstantLoader.K((AnnotationsContainerWithConstants) obj, (MemberSignature) obj2);
    }
}
