package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f146999a;

    public f(AbstractTypeConstructor abstractTypeConstructor) {
        this.f146999a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.D(this.f146999a, (TypeConstructor) obj);
    }
}
