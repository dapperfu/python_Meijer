package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes14.dex */
public final class FunctionsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<Object, Object> f148072a = kotlin.reflect.jvm.internal.impl.utils.a.f148094a;

    /* renamed from: b, reason: collision with root package name */
    private static final Function1<Object, Boolean> f148073b = b.f148096a;

    /* renamed from: c, reason: collision with root package name */
    private static final Function1<Object, Object> f148074c = a.f148078a;

    /* renamed from: d, reason: collision with root package name */
    private static final Function1<Object, Unit> f148075d = c.f148097a;

    /* renamed from: e, reason: collision with root package name */
    private static final Function2<Object, Object, Unit> f148076e = d.f148098a;

    /* renamed from: f, reason: collision with root package name */
    private static final Function3<Object, Object, Object, Unit> f148077f = e.f148099a;

    static final class a implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f148078a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Object obj) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Object obj, Object obj2) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Object obj, Object obj2, Object obj3) {
        return Unit.f143329a;
    }

    public static final <T> Function1<T, Boolean> k() {
        return (Function1<T, Boolean>) f148073b;
    }

    public static final Function3<Object, Object, Object, Unit> l() {
        return f148077f;
    }
}
