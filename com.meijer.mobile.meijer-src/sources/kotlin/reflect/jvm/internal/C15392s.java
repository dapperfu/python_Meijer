package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15392s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f148119a;

    public C15392s(KClassImpl kClassImpl) {
        this.f148119a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.V(this.f148119a);
    }
}
