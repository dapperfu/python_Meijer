package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15394u implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f148123a;

    public C15394u(KClassImpl kClassImpl) {
        this.f148123a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.E(this.f148123a);
    }
}
