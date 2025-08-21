package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15393t implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f148121a;

    public C15393t(KClassImpl kClassImpl) {
        this.f148121a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.G(this.f148121a);
    }
}
