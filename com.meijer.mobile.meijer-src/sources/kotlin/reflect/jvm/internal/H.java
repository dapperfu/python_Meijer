package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class H implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f143902a;

    public H(KClassImpl kClassImpl) {
        this.f143902a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.C(this.f143902a);
    }
}
