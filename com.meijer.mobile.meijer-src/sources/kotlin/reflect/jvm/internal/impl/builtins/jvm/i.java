package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f144480a;

    public i(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f144480a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.r(this.f144480a);
    }
}
