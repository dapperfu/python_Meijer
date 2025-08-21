package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f144479a;

    public h(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f144479a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.s(this.f144479a, (Pair) obj);
    }
}
