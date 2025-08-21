package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JavaRetentionAnnotationDescriptor f145262a;

    public d(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        this.f145262a = javaRetentionAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaRetentionAnnotationDescriptor.i(this.f145262a);
    }
}
