package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final IntegerLiteralTypeConstructor f146198a;

    public b(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        this.f146198a = integerLiteralTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return IntegerLiteralTypeConstructor.n(this.f146198a);
    }
}
