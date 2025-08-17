package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class M implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f143126a;

    public M(KClassImpl.Data data) {
        this.f143126a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.V(this.f143126a);
    }
}
