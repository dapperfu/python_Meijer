package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class K implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143018a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl f143019b;

    public K(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f143018a = data;
        this.f143019b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.a0(this.f143018a, this.f143019b);
    }
}
