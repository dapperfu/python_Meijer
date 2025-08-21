package androidx.collection;

import a0.C5638b;
import a0.C5639c;
import a0.C5640d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001eJ\u0019\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'¨\u00063"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)I", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "k", "g", "", "evicted", "oldValue", "newValue", "b", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "j", "c", "()V", "i", "()I", "e", "putCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "La0/c;", "La0/c;", "map", "La0/b;", "La0/b;", "lock", "size", "createCount", "evictionCount", "hitCount", "missCount", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class LruCache<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5639c<K, V> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5638b lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int putCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int createCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int evictionCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int missCount;

    protected V a(K key) {
        Intrinsics.j(key, "key");
        return null;
    }

    protected void b(boolean evicted, K key, V oldValue, V newValue) {
        Intrinsics.j(key, "key");
        Intrinsics.j(oldValue, "oldValue");
    }

    public final void c() {
        k(-1);
    }

    protected int j(K key, V value) {
        Intrinsics.j(key, "key");
        Intrinsics.j(value, "value");
        return 1;
    }

    public final V d(K key) {
        V v10;
        Intrinsics.j(key, "key");
        synchronized (this.lock) {
            V vA = this.map.a(key);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vA2 = a(key);
            if (vA2 == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v10 = (V) this.map.d(key, vA2);
                    if (v10 != null) {
                        this.map.d(key, v10);
                    } else {
                        this.size += h(key, vA2);
                        Unit unit = Unit.f143329a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v10 != null) {
                b(false, key, vA2, v10);
                return v10;
            }
            k(this.maxSize);
            return vA2;
        }
    }

    public final int e() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final V f(K key, V value) {
        V vD;
        Intrinsics.j(key, "key");
        Intrinsics.j(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += h(key, value);
                vD = this.map.d(key, value);
                if (vD != null) {
                    this.size -= h(key, vD);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vD != null) {
            b(false, key, vD, value);
        }
        k(this.maxSize);
        return vD;
    }

    public final V g(K key) {
        V vE;
        Intrinsics.j(key, "key");
        synchronized (this.lock) {
            try {
                vE = this.map.e(key);
                if (vE != null) {
                    this.size -= h(key, vE);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vE != null) {
            b(false, key, vE, null);
        }
        return vE;
    }

    public final int i() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r7) {
        /*
            r6 = this;
        L0:
            a0.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            a0.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            a0.C5640d.b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            a0.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            a0.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = kotlin.collections.CollectionsKt.t0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            a0.c<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L15
            r4.e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.size     // Catch: java.lang.Throwable -> L15
            int r5 = r6.h(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.k(int):void");
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            Iterator<T> it = this.map.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public LruCache(int i10) {
        boolean z10;
        this.maxSize = i10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5640d.a("maxSize <= 0");
        }
        this.map = new C5639c<>(0, 0.75f);
        this.lock = new C5638b();
    }

    private final int h(K key, V value) {
        boolean z10;
        int iJ = j(key, value);
        if (iJ >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5640d.b("Negative size: " + key + '=' + value);
        }
        return iJ;
    }
}
