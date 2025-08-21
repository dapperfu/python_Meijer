package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final NewCapturedTypeConstructor f147760a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinTypeRefiner f147761b;

    public d(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f147760a = newCapturedTypeConstructor;
        this.f147761b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.r(this.f147760a, this.f147761b);
    }
}
