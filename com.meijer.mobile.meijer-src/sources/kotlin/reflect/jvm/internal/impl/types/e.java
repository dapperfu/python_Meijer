package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes14.dex */
class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147766a;

    public e(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147766a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.C(this.f147766a, (AbstractTypeConstructor.b) obj);
    }
}
