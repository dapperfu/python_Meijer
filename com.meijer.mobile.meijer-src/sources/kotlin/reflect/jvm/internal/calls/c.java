package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes14.dex */
class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Class f144115a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f144116b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f144117c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f144118d;

    /* renamed from: e, reason: collision with root package name */
    private final List f144119e;

    public c(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f144115a = cls;
        this.f144116b = map;
        this.f144117c = lazy;
        this.f144118d = lazy2;
        this.f144119e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AnnotationConstructorCallerKt.o(this.f144115a, this.f144116b, this.f144117c, this.f144118d, this.f144119e, obj, method, objArr);
    }
}
