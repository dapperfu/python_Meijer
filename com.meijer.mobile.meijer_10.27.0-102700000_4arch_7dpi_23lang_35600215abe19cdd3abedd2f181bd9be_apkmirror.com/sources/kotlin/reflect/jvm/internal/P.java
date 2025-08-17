package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes13.dex */
class P implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final P f143130a = new P();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KDeclarationContainerImpl.E((PropertyDescriptor) obj);
    }
}
