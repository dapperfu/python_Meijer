package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* loaded from: classes14.dex */
class r0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KPropertyImpl.Setter f148118a;

    public r0(KPropertyImpl.Setter setter) {
        this.f148118a = setter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KPropertyImpl.Setter.c0(this.f148118a);
    }
}
