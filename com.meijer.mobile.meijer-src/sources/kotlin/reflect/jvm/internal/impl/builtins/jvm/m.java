package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes14.dex */
class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f144485a;

    public m(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f144485a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.G(this.f144485a, (CallableMemberDescriptor) obj);
    }
}
