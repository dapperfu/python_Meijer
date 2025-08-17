package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15289s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f147212a;

    public C15289s(KClassImpl kClassImpl) {
        this.f147212a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.V(this.f147212a);
    }
}
