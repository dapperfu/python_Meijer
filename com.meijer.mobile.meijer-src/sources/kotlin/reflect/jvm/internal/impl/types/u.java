package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class u implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final StarProjectionImpl f147952a;

    public u(StarProjectionImpl starProjectionImpl) {
        this.f147952a = starProjectionImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return StarProjectionImpl.d(this.f147952a);
    }
}
