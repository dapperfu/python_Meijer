package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class w0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeImpl f148129a;

    /* renamed from: b, reason: collision with root package name */
    private final int f148130b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f148131c;

    public w0(KTypeImpl kTypeImpl, int i10, Lazy lazy) {
        this.f148129a = kTypeImpl;
        this.f148130b = i10;
        this.f148131c = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.p(this.f148129a, this.f148130b, this.f148131c);
    }
}
