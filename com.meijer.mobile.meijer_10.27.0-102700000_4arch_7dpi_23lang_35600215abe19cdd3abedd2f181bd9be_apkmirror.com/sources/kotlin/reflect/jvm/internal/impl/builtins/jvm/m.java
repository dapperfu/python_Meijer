package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes13.dex */
class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f143578a;

    public m(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f143578a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.G(this.f143578a, (CallableMemberDescriptor) obj);
    }
}
