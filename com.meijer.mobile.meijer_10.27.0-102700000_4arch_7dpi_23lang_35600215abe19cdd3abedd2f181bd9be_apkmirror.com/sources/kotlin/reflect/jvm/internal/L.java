package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class L implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143124a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl f143125b;

    public L(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f143124a = data;
        this.f143125b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.X(this.f143124a, this.f143125b);
    }
}
