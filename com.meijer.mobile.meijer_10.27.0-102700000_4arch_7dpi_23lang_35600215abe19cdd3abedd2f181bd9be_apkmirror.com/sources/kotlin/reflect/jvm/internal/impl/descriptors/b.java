package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes13.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f143775a = new b();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(FindClassInModuleKt.e((ClassId) obj));
    }
}
