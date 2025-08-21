package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f144683a;

    public c(NotFoundClasses notFoundClasses) {
        this.f144683a = notFoundClasses;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NotFoundClasses.e(this.f144683a, (FqName) obj);
    }
}
