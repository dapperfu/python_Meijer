package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JavaTargetAnnotationDescriptor f144356a;

    public e(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        this.f144356a = javaTargetAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaTargetAnnotationDescriptor.i(this.f144356a);
    }
}
