package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes14.dex */
class L implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final L f145366a = new L();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaStaticClassScope.o0((MemberScope) obj);
    }
}
