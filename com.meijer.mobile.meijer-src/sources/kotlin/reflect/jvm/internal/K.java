package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class K implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143925a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl f143926b;

    public K(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f143925a = data;
        this.f143926b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.a0(this.f143925a, this.f143926b);
    }
}
