package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor f147908a;

    public h(AbstractTypeConstructor abstractTypeConstructor) {
        this.f147908a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.F(this.f147908a, (TypeConstructor) obj);
    }
}
