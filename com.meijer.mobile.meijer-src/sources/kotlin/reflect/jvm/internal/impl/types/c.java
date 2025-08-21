package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147720a;

    public c(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147720a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractTypeConstructor.A(this.f147720a);
    }
}
