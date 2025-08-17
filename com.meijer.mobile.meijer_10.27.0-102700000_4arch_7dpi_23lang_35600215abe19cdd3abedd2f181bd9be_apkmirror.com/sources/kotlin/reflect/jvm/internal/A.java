package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class A implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f142974a;

    public A(KClassImpl.Data data) {
        this.f142974a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.D(this.f142974a);
    }
}
