package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15291u implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f147216a;

    public C15291u(KClassImpl kClassImpl) {
        this.f147216a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.E(this.f147216a);
    }
}
