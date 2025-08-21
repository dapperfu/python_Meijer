package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147909a;

    public i(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147909a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.G(this.f147909a, (KotlinType) obj);
    }
}
