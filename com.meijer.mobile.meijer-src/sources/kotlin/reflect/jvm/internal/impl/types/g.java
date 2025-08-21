package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147907a;

    public g(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147907a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.E(this.f147907a, (KotlinType) obj);
    }
}
