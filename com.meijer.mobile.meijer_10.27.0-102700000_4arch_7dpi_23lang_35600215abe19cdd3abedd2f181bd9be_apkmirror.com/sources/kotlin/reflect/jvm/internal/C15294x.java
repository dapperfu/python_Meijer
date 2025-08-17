package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15294x implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f147225a;

    public C15294x(KClassImpl kClassImpl) {
        this.f147225a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.R(this.f147225a);
    }
}
