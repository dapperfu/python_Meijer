package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes14.dex */
class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor.a f147910a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractTypeConstructor f147911b;

    public j(AbstractTypeConstructor.a aVar, AbstractTypeConstructor abstractTypeConstructor) {
        this.f147910a = aVar;
        this.f147911b = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractTypeConstructor.a.i(this.f147910a, this.f147911b);
    }
}
