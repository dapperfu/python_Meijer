package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15396w implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl f148128a;

    public C15396w(KClassImpl kClassImpl) {
        this.f148128a = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.Q(this.f148128a);
    }
}
