package d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: d3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13611m<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f127928a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f127929b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Set<E> f127930c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private List<E> f127931d = Collections.EMPTY_LIST;

    public Set<E> V1() {
        Set<E> set;
        synchronized (this.f127928a) {
            set = this.f127930c;
        }
        return set;
    }

    public void a(E e10) {
        synchronized (this.f127928a) {
            try {
                ArrayList arrayList = new ArrayList(this.f127931d);
                arrayList.add(e10);
                this.f127931d = Collections.unmodifiableList(arrayList);
                Integer num = this.f127929b.get(e10);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f127930c);
                    hashSet.add(e10);
                    this.f127930c = Collections.unmodifiableSet(hashSet);
                }
                this.f127929b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int e(E e10) {
        int iIntValue;
        synchronized (this.f127928a) {
            try {
                iIntValue = this.f127929b.containsKey(e10) ? this.f127929b.get(e10).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void f(E e10) {
        synchronized (this.f127928a) {
            try {
                Integer num = this.f127929b.get(e10);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f127931d);
                arrayList.remove(e10);
                this.f127931d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f127929b.remove(e10);
                    HashSet hashSet = new HashSet(this.f127930c);
                    hashSet.remove(e10);
                    this.f127930c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f127929b.put(e10, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f127928a) {
            it = this.f127931d.iterator();
        }
        return it;
    }
}
