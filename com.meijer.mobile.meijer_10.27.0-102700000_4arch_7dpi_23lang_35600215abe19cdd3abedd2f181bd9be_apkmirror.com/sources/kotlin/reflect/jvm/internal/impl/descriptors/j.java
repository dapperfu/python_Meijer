package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j f144029a = new j();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.i((DeclarationDescriptor) obj));
    }
}
