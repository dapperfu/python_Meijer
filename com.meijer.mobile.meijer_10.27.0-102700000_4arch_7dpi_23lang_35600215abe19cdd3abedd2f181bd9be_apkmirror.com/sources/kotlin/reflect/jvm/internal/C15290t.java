package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15290t implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f147214a;

    public C15290t(KClassImpl kClassImpl) {
        this.f147214a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.G(this.f147214a);
    }
}
