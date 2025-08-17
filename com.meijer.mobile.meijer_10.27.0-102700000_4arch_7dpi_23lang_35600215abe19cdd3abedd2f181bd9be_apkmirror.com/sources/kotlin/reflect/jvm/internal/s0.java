package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* loaded from: classes13.dex */
class s0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPropertyImpl.Setter f147213a;

    public s0(KPropertyImpl.Setter setter) {
        this.f147213a = setter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Setter.b0(this.f147213a);
    }
}
