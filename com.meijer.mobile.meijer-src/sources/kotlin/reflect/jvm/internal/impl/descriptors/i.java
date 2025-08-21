package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f144694a = new i();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeParameterUtilsKt.h((DeclarationDescriptor) obj));
    }
}
