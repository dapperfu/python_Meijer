package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147000a;

    public g(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147000a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.E(this.f147000a, (KotlinType) obj);
    }
}
