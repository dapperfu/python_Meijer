package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes13.dex */
class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f143208a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f143209b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f143210c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f143211d;

    /* renamed from: e, reason: collision with root package name */
    private final List f143212e;

    public c(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f143208a = cls;
        this.f143209b = map;
        this.f143210c = lazy;
        this.f143211d = lazy2;
        this.f143212e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AnnotationConstructorCallerKt.o(this.f143208a, this.f143209b, this.f143210c, this.f143211d, this.f143212e, obj, method, objArr);
    }
}
