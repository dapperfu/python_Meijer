package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class I implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f142996a;

    public I(KClassImpl.Data data) {
        this.f142996a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.S(this.f142996a);
    }
}
