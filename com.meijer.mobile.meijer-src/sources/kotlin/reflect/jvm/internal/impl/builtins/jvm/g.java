package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f144478a;

    public g(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f144478a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.I(this.f144478a);
    }
}
