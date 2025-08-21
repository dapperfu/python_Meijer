package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15395v implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f148126a;

    public C15395v(KClassImpl kClassImpl) {
        this.f148126a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.F(this.f148126a);
    }
}
