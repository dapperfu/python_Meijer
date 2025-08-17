package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15293w implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f147221a;

    public C15293w(KClassImpl kClassImpl) {
        this.f147221a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.Q(this.f147221a);
    }
}
