package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f147912a;

    public k(Function1 function1) {
        this.f147912a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return IntersectionTypeConstructor.q(this.f147912a, (KotlinType) obj);
    }
}
