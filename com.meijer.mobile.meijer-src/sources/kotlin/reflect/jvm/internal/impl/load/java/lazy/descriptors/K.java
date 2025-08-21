package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* loaded from: classes14.dex */
class K implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final K f145365a = new K();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(LazyJavaStaticClassScope.m0((JavaMember) obj));
    }
}
