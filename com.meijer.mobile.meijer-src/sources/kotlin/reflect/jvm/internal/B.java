package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class B implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143883a;

    public B(KClassImpl.Data data) {
        this.f143883a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.x(this.f143883a);
    }
}
