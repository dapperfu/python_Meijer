package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class o0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPropertyImpl f147204a;

    public o0(KPropertyImpl kPropertyImpl) {
        this.f147204a = kPropertyImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.X(this.f147204a);
    }
}
