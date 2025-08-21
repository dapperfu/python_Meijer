package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JavaTargetAnnotationDescriptor f145263a;

    public e(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        this.f145263a = javaTargetAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaTargetAnnotationDescriptor.i(this.f145263a);
    }
}
