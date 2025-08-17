package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final BuiltInAnnotationDescriptor f143772a;

    public b(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        this.f143772a = builtInAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return BuiltInAnnotationDescriptor.c(this.f143772a);
    }
}
