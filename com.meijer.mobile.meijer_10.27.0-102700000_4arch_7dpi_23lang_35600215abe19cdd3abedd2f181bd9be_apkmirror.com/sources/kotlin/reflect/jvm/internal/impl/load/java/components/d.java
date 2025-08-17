package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JavaRetentionAnnotationDescriptor f144355a;

    public d(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        this.f144355a = javaRetentionAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaRetentionAnnotationDescriptor.i(this.f144355a);
    }
}
