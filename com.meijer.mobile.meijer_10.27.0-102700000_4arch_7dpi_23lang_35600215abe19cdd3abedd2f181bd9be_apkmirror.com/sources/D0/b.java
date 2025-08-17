package D0;

import Z.T;
import Z.W;
import Z.c0;
import Z.d0;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010!\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006,"}, d2 = {"LD0/b;", "", "K", "V", "LZ/W;", "map", "d", "(LZ/W;)LZ/W;", "key", "value", "", "a", "(LZ/W;Ljava/lang/Object;Ljava/lang/Object;)V", "c", "(LZ/W;)V", "", "f", "(LZ/W;Ljava/lang/Object;)Z", "LZ/c0;", "h", "(LZ/W;Ljava/lang/Object;)LZ/c0;", "j", "(LZ/W;)Z", "k", "m", "(LZ/W;Ljava/lang/Object;)Ljava/lang/Object;", "l", "q", "(LZ/W;)LZ/c0;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "condition", "n", "(LZ/W;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "o", "(LZ/W;)Ljava/lang/String;", "", "i", "(LZ/W;)I", "other", "g", "LZ/W;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W<Object, Object> map;

    public static <K, V> W<Object, Object> d(W<Object, Object> w10) {
        return w10;
    }

    public static /* synthetic */ W e(W w10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            w10 = new W(0, i11, null);
        }
        return d(w10);
    }

    public static final /* synthetic */ b b(W w10) {
        return new b(w10);
    }

    public static boolean g(W<Object, Object> w10, Object obj) {
        return (obj instanceof b) && Intrinsics.e(w10, ((b) obj).getMap());
    }

    public static String o(W<Object, Object> w10) {
        return "MultiValueMap(map=" + w10 + ')';
    }

    public boolean equals(Object obj) {
        return g(this.map, obj);
    }

    public int hashCode() {
        return i(this.map);
    }

    /* renamed from: p, reason: from getter */
    public final /* synthetic */ W getMap() {
        return this.map;
    }

    public String toString() {
        return o(this.map);
    }

    private /* synthetic */ b(W w10) {
        this.map = w10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(W<Object, Object> w10, K k10, V v10) {
        boolean z10;
        Object obj;
        int iN = w10.n(k10);
        if (iN < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj = null;
        } else {
            obj = w10.values[iN];
        }
        TypeIntrinsics.n(obj);
        if (obj != null) {
            if (obj instanceof T) {
                Intrinsics.h(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                T t10 = (T) obj;
                t10.n(v10);
                v10 = t10;
            } else {
                v10 = (V) d0.h(obj, v10);
            }
        }
        if (z10) {
            int i10 = ~iN;
            w10.keys[i10] = k10;
            w10.values[i10] = v10;
            return;
        }
        w10.values[iN] = v10;
    }

    public static final void c(W<Object, Object> w10) {
        w10.k();
    }

    public static final boolean f(W<Object, Object> w10, K k10) {
        return w10.b(k10);
    }

    public static final c0<V> h(W<Object, Object> w10, K k10) {
        Object objE = w10.e(k10);
        if (objE == null) {
            return d0.f();
        }
        if (objE instanceof T) {
            return (c0) objE;
        }
        return d0.i(objE);
    }

    public static int i(W<Object, Object> w10) {
        return w10.hashCode();
    }

    public static final boolean j(W<Object, Object> w10) {
        return w10.h();
    }

    public static final boolean k(W<Object, Object> w10) {
        return w10.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V l(W<Object, Object> w10, K k10) {
        V v10 = (V) w10.e(k10);
        if (v10 == 0) {
            return null;
        }
        if (v10 instanceof T) {
            T t10 = (T) v10;
            V v11 = (V) t10.A(0);
            if (t10.g()) {
                w10.u(k10);
            }
            if (t10.get_size() == 1) {
                w10.x(k10, t10.c());
            }
            return v11;
        }
        w10.u(k10);
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V m(W<Object, Object> w10, K k10) {
        V v10 = (V) w10.e(k10);
        if (v10 == 0) {
            return null;
        }
        if (v10 instanceof T) {
            T t10 = (T) v10;
            V v11 = (V) a.b(t10);
            Intrinsics.h(v11, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            if (t10.g()) {
                w10.u(k10);
            }
            if (t10.get_size() == 1) {
                w10.x(k10, t10.c());
            }
            return v11;
        }
        w10.u(k10);
        return v10;
    }

    public static final void n(W<Object, Object> w10, K k10, Function1<? super V, Boolean> function1) {
        Object objE = w10.e(k10);
        if (objE != null) {
            if (objE instanceof T) {
                T t10 = (T) objE;
                int i10 = t10._size;
                Object[] objArr = t10.content;
                int i11 = 0;
                IntRange intRangeX = RangesKt.x(0, i10);
                int first = intRangeX.getFirst();
                int last = intRangeX.getLast();
                if (first <= last) {
                    while (true) {
                        objArr[first - i11] = objArr[first];
                        if (function1.invoke(objArr[first]).booleanValue()) {
                            i11++;
                        }
                        if (first == last) {
                            break;
                        } else {
                            first++;
                        }
                    }
                }
                ArraysKt.B(objArr, null, i10 - i11, i10);
                t10._size -= i11;
                if (t10.g()) {
                    w10.u(k10);
                }
                if (t10.get_size() == 0) {
                    w10.x(k10, t10.c());
                    return;
                }
                return;
            }
            if (function1.invoke(objE).booleanValue()) {
                w10.u(k10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final Z.c0<V> q(Z.W<java.lang.Object, java.lang.Object> r14) {
        /*
            boolean r0 = r14.h()
            if (r0 == 0) goto Lb
            Z.c0 r14 = Z.d0.f()
            return r14
        Lb:
            Z.T r0 = new Z.T
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            java.lang.Object[] r1 = r14.values
            long[] r14 = r14.metadata
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L64
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L62
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof Z.T
            if (r11 == 0) goto L56
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            kotlin.jvm.internal.Intrinsics.h(r10, r11)
            Z.T r10 = (Z.T) r10
            r0.p(r10)
            goto L5e
        L56:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.Intrinsics.h(r10, r11)
            r0.n(r10)
        L5e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L62:
            if (r7 != r8) goto L69
        L64:
            if (r4 == r3) goto L69
            int r4 = r4 + 1
            goto L1d
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.b.q(Z.W):Z.c0");
    }
}
