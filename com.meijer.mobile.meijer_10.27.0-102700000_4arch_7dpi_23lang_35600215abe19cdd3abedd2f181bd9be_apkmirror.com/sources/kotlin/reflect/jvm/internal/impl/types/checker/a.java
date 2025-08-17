package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final NewCapturedTypeConstructor f146850a;

    public a(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f146850a = newCapturedTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.g(this.f146850a);
    }
}
