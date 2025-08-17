package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class F implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f142992a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl.Data f142993b;

    public F(KClassImpl kClassImpl, KClassImpl.Data data) {
        this.f142992a = kClassImpl;
        this.f142993b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.W(this.f142992a, this.f142993b);
    }
}
