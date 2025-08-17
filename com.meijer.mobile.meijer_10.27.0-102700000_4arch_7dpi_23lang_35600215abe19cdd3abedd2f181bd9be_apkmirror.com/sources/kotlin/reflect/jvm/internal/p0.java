package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* loaded from: classes13.dex */
class p0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPropertyImpl.Getter f147206a;

    public p0(KPropertyImpl.Getter getter) {
        this.f147206a = getter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Getter.c0(this.f147206a);
    }
}
