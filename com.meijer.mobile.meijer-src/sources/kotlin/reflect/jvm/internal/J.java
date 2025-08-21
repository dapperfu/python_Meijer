package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class J implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143904a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl f143905b;

    public J(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f143904a = data;
        this.f143905b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.T(this.f143904a, this.f143905b);
    }
}
