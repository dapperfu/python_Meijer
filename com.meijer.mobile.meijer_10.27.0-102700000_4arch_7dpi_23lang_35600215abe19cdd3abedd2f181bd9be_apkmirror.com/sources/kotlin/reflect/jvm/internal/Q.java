package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes13.dex */
class Q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f143131a = new Q();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KDeclarationContainerImpl.z((FunctionDescriptor) obj);
    }
}
