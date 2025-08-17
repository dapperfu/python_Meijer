package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes13.dex */
class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeConstructor.a f147003a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractTypeConstructor f147004b;

    public j(AbstractTypeConstructor.a aVar, AbstractTypeConstructor abstractTypeConstructor) {
        this.f147003a = aVar;
        this.f147004b = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractTypeConstructor.a.i(this.f147003a, this.f147004b);
    }
}
