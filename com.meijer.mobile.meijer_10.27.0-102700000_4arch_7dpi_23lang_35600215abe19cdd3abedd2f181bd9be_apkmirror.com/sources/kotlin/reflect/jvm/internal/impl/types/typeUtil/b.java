package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes13.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f147037a = new b();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(TypeUtilsKt.h((UnwrappedType) obj));
    }
}
