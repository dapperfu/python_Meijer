package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f146813a;

    public c(AbstractTypeConstructor abstractTypeConstructor) {
        this.f146813a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractTypeConstructor.A(this.f146813a);
    }
}
