package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15292v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f147219a;

    public C15292v(KClassImpl kClassImpl) {
        this.f147219a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.F(this.f147219a);
    }
}
