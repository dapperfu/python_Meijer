package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final NewCapturedTypeConstructor f146853a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinTypeRefiner f146854b;

    public d(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f146853a = newCapturedTypeConstructor;
        this.f146854b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.r(this.f146853a, this.f146854b);
    }
}
