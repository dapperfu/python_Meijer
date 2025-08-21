package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15399z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f148136a;

    public C15399z(KClassImpl.Data data) {
        this.f148136a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.z(this.f148136a);
    }
}
