package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final NewCapturedTypeConstructor f147757a;

    public a(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f147757a = newCapturedTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.g(this.f147757a);
    }
}
