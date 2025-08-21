package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;

/* loaded from: classes14.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f144684a;

    public d(NotFoundClasses notFoundClasses) {
        this.f144684a = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NotFoundClasses.c(this.f144684a, (NotFoundClasses.a) obj);
    }
}
