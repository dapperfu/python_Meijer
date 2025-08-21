package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class G implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f143901a;

    public G(KClassImpl kClassImpl) {
        this.f143901a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.U(this.f143901a);
    }
}
