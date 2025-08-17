package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes13.dex */
class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final SmartSet f146220a;

    public f(SmartSet smartSet) {
        this.f146220a = smartSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return OverridingUtilsKt.c(this.f146220a, obj);
    }
}
