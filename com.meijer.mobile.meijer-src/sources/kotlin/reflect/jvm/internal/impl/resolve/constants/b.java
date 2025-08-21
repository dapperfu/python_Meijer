package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final IntegerLiteralTypeConstructor f147105a;

    public b(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        this.f147105a = integerLiteralTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return IntegerLiteralTypeConstructor.n(this.f147105a);
    }
}
