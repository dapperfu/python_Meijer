package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltIns f144475a;

    public e(JvmBuiltIns jvmBuiltIns) {
        this.f144475a = jvmBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.K0(this.f144475a);
    }
}
