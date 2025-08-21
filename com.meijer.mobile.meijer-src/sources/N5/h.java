package N5;

import M5.q;
import Q5.A;
import Q5.y;
import Q5.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LN5/h;", "", "<init>", "()V", "LQ5/y;", "transformer", "", "f", "(LQ5/y;)V", "h", "LQ5/A;", "m", "()LQ5/A;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f20677a = new h();

    private final void f(y transformer) {
        transformer.b("urlenc", new z() { // from class: N5.g
            @Override // Q5.z
            public final Object a(Object obj) {
                return h.g(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(Object obj) {
        return obj instanceof String ? q.a((String) obj) : obj;
    }

    private final void h(y transformer) {
        transformer.b("int", new z() { // from class: N5.c
            @Override // Q5.z
            public final Object a(Object obj) {
                return h.i(obj);
            }
        });
        transformer.b("string", new z() { // from class: N5.d
            @Override // Q5.z
            public final Object a(Object obj) {
                return h.j(obj);
            }
        });
        transformer.b("double", new z() { // from class: N5.e
            @Override // Q5.z
            public final Object a(Object obj) {
                return h.k(obj);
            }
        });
        transformer.b("bool", new z() { // from class: N5.f
            @Override // Q5.z
            public final Object a(Object obj) {
                return h.l(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Object value) {
        if (value instanceof String) {
            Intrinsics.i(value, "value");
            Integer numV = StringsKt.v((String) value);
            return numV == null ? value : numV;
        }
        if (value instanceof Number) {
            return Integer.valueOf(((Number) value).intValue());
        }
        if (!(value instanceof Boolean)) {
            return value;
        }
        Intrinsics.i(value, "value");
        return Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(Object value) {
        if (value instanceof String) {
            Intrinsics.i(value, "value");
            Double dT = StringsKt.t((String) value);
            return dT == null ? value : dT;
        }
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (!(value instanceof Boolean)) {
            return value;
        }
        Intrinsics.i(value, "value");
        return Double.valueOf(((Boolean) value).booleanValue() ? 1.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object l(Object obj) {
        if (obj instanceof String) {
            return Boolean.valueOf(Boolean.parseBoolean((String) obj));
        }
        if (!(obj instanceof Number)) {
            return obj;
        }
        Number number = (Number) obj;
        return Boolean.valueOf(number.longValue() == 1 && number.doubleValue() == 1.0d);
    }

    public final A m() {
        y yVar = new y();
        f(yVar);
        h(yVar);
        return yVar;
    }

    private h() {
    }
}
