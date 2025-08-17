package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class J implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f142997a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl f142998b;

    public J(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f142997a = data;
        this.f142998b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.T(this.f142997a, this.f142998b);
    }
}
