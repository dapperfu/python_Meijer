package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15397x implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f148132a;

    public C15397x(KClassImpl kClassImpl) {
        this.f148132a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.R(this.f148132a);
    }
}
