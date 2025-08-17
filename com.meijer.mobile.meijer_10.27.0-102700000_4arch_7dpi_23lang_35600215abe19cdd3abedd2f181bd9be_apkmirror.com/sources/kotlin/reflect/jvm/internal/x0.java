package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class x0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeParameterImpl f147226a;

    public x0(KTypeParameterImpl kTypeParameterImpl) {
        this.f147226a = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeParameterImpl.f(this.f147226a);
    }
}
