package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class u0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeImpl f147217a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f147218b;

    public u0(KTypeImpl kTypeImpl, Function0 function0) {
        this.f147217a = kTypeImpl;
        this.f147218b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.k(this.f147217a, this.f147218b);
    }
}
