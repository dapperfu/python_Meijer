package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f144470a = new b();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInClassDescriptorFactory.d((ModuleDescriptor) obj);
    }
}
