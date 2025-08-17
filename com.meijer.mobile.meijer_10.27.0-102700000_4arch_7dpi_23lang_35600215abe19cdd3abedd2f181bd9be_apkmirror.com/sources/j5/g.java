package j5;

import android.graphics.Bitmap;
import j5.InterfaceC14857c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002\t\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0003R2\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u001f\u0010'\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b$0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lj5/g;", "Lj5/i;", "<init>", "()V", "", "f", "Lj5/c$b;", "key", "Lj5/c$c;", "b", "(Lj5/c$b;)Lj5/c$c;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", "extras", "", "size", "d", "(Lj5/c$b;Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "level", "a", "(I)V", "e", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lj5/g$b;", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", "I", "operationsSinceCleanUp", "", "Lkotlin/jvm/internal/EnhancedNullability;", "c", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<InterfaceC14857c.Key, ArrayList<b>> cache = new LinkedHashMap<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int operationsSinceCleanUp;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"Lj5/g$b;", "", "", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "a", "I", "c", "()I", "b", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int identityHashCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final WeakReference<Bitmap> bitmap;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> extras;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int size;

        public final WeakReference<Bitmap> a() {
            return this.bitmap;
        }

        public final Map<String, Object> b() {
            return this.extras;
        }

        /* renamed from: c, reason: from getter */
        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        /* renamed from: d, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public b(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.identityHashCode = i10;
            this.bitmap = weakReference;
            this.extras = map;
            this.size = i11;
        }
    }

    @Override // j5.i
    public synchronized void a(int level) {
        if (level >= 10 && level != 20) {
            e();
        }
    }

    @Override // j5.i
    public synchronized InterfaceC14857c.Value b(InterfaceC14857c.Key key) {
        try {
            ArrayList<b> arrayList = this.cache.get(key);
            InterfaceC14857c.Value value = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar = arrayList.get(i10);
                Bitmap bitmap = bVar.a().get();
                InterfaceC14857c.Value value2 = bitmap != null ? new InterfaceC14857c.Value(bitmap, bVar.b()) : null;
                if (value2 != null) {
                    value = value2;
                    break;
                }
                i10++;
            }
            f();
            return value;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // j5.i
    public synchronized Set<InterfaceC14857c.Key> c() {
        return CollectionsKt.o1(this.cache.keySet());
    }

    @Override // j5.i
    public synchronized void d(InterfaceC14857c.Key key, Bitmap bitmap, Map<String, ? extends Object> extras, int size) {
        try {
            LinkedHashMap<InterfaceC14857c.Key, ArrayList<b>> linkedHashMap = this.cache;
            ArrayList<b> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<b> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), extras, size);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = arrayList2.get(i10);
                if (size < bVar2.getSize()) {
                    i10++;
                } else if (bVar2.getIdentityHashCode() == iIdentityHashCode && bVar2.a().get() == bitmap) {
                    arrayList2.set(i10, bVar);
                } else {
                    arrayList2.add(i10, bVar);
                }
            }
            f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e() {
        WeakReference<Bitmap> weakReferenceA;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<b>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) CollectionsKt.u0(next);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).a().get() == null) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    private final void f() {
        int i10 = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i10 + 1;
        if (i10 >= 10) {
            e();
        }
    }
}
