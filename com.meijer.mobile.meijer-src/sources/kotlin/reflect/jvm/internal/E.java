package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class E implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143897a;

    public E(KClassImpl.Data data) {
        this.f143897a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.A(this.f143897a);
    }
}
