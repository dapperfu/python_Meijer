package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;

/* loaded from: classes13.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f143777a;

    public d(NotFoundClasses notFoundClasses) {
        this.f143777a = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NotFoundClasses.c(this.f143777a, (NotFoundClasses.a) obj);
    }
}
