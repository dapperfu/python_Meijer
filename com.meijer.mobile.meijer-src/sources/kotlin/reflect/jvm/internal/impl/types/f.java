package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147906a;

    public f(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147906a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.D(this.f147906a, (TypeConstructor) obj);
    }
}
