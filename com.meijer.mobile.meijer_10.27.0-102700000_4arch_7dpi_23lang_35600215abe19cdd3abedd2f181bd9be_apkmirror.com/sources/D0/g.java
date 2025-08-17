package D0;

import Z.W;
import Z.X;
import Z.i0;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u001d"}, d2 = {"LD0/g;", "", "Key", "Scope", "LZ/W;", "map", "c", "(LZ/W;)LZ/W;", "key", "scope", "", "a", "(LZ/W;Ljava/lang/Object;Ljava/lang/Object;)V", "value", "i", "element", "", "e", "(LZ/W;Ljava/lang/Object;)Z", "b", "(LZ/W;)V", "g", "(LZ/W;Ljava/lang/Object;Ljava/lang/Object;)Z", "h", "(LZ/W;Ljava/lang/Object;)V", "", "f", "(LZ/W;)I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g<Key, Scope> {
    public static <Key, Scope> W<Object, Object> c(W<Object, Object> w10) {
        return w10;
    }

    public static /* synthetic */ W d(W w10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            w10 = i0.c();
        }
        return c(w10);
    }

    public static final void h(W<Object, Object> w10, Scope scope) {
        boolean zD;
        long[] jArr = w10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = w10.keys[i13];
                        Object obj2 = w10.values[i13];
                        if (obj2 instanceof X) {
                            Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            X x10 = (X) obj2;
                            x10.y(scope);
                            zD = x10.d();
                        } else {
                            zD = obj2 == scope;
                        }
                        if (zD) {
                            w10.v(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [Z.X] */
    public static final void a(W<Object, Object> w10, Key key, Scope scope) {
        boolean z10;
        Scope scope2;
        int iN = w10.n(key);
        if (iN < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            scope2 = null;
        } else {
            scope2 = w10.values[iN];
        }
        if (scope2 != null) {
            if (scope2 instanceof X) {
                Intrinsics.h(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((X) scope2).h(scope);
            } else if (scope2 != scope) {
                ?? x10 = new X(0, 1, null);
                Intrinsics.h(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                x10.h(scope2);
                x10.h(scope);
                scope = x10;
            }
            scope = scope2;
        }
        if (z10) {
            int i10 = ~iN;
            w10.keys[i10] = key;
            w10.values[i10] = scope;
            return;
        }
        w10.values[iN] = scope;
    }

    public static final void b(W<Object, Object> w10) {
        w10.k();
    }

    public static final boolean e(W<Object, Object> w10, Key key) {
        return w10.c(key);
    }

    public static final int f(W<Object, Object> w10) {
        return w10.get_size();
    }

    public static final boolean g(W<Object, Object> w10, Key key, Scope scope) {
        Object objE = w10.e(key);
        if (objE == null) {
            return false;
        }
        if (objE instanceof X) {
            X x10 = (X) objE;
            boolean zY = x10.y(scope);
            if (zY && x10.d()) {
                w10.u(key);
            }
            return zY;
        }
        if (!Intrinsics.e(objE, scope)) {
            return false;
        }
        w10.u(key);
        return true;
    }

    public static final void i(W<Object, Object> w10, Key key, Scope scope) {
        w10.x(key, scope);
    }
}
