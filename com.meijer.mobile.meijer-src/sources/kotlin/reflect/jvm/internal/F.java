package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class F implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f143899a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl.Data f143900b;

    public F(KClassImpl kClassImpl, KClassImpl.Data data) {
        this.f143899a = kClassImpl;
        this.f143900b = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.W(this.f143899a, this.f143900b);
    }
}
