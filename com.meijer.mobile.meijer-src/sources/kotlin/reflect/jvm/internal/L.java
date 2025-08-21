package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* loaded from: classes14.dex */
class L implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f144031a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl f144032b;

    public L(KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f144031a = data;
        this.f144032b = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.X(this.f144031a, this.f144032b);
    }
}
