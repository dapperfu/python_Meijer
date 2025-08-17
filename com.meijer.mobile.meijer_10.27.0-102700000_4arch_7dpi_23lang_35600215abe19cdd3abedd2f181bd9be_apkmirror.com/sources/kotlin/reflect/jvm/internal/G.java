package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes13.dex */
class G implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f142994a;

    public G(KClassImpl kClassImpl) {
        this.f142994a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.U(this.f142994a);
    }
}
