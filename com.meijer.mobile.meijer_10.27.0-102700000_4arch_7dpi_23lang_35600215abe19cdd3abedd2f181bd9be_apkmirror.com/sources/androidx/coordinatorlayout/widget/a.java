package androidx.coordinatorlayout.widget;

import Z.n0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o2.f;
import o2.g;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final f<ArrayList<T>> f53651a = new g(10);

    /* renamed from: b, reason: collision with root package name */
    private final n0<T, ArrayList<T>> f53652b = new n0<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f53653c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f53654d = new HashSet<>();

    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f53651a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    public void a(T t10, T t11) {
        if (!this.f53652b.containsKey(t10) || !this.f53652b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f53652b.get(t10);
        if (arrayListF == null) {
            arrayListF = f();
            this.f53652b.put(t10, arrayListF);
        }
        arrayListF.add(t11);
    }

    public void b(T t10) {
        if (this.f53652b.containsKey(t10)) {
            return;
        }
        this.f53652b.put(t10, null);
    }

    public void c() {
        int size = this.f53652b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f53652b.k(i10);
            if (arrayListK != null) {
                l(arrayListK);
            }
        }
        this.f53652b.clear();
    }

    public boolean d(T t10) {
        return this.f53652b.containsKey(t10);
    }

    ArrayList<T> h(T t10) {
        return this.f53652b.get(t10);
    }

    public List<T> i(T t10) {
        int size = this.f53652b.getSize();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f53652b.k(i10);
            if (arrayListK != null && arrayListK.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f53652b.g(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> j() {
        this.f53653c.clear();
        this.f53654d.clear();
        int size = this.f53652b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f53652b.g(i10), this.f53653c, this.f53654d);
        }
        return this.f53653c;
    }

    public boolean k(T t10) {
        int size = this.f53652b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListK = this.f53652b.k(i10);
            if (arrayListK != null && arrayListK.contains(t10)) {
                return true;
            }
        }
        return false;
    }

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (!hashSet.contains(t10)) {
            hashSet.add(t10);
            ArrayList<T> arrayList2 = this.f53652b.get(t10);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(t10);
            arrayList.add(t10);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    private void l(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f53651a.a(arrayList);
    }

    public List<T> g(T t10) {
        ArrayList<T> arrayListH = h(t10);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }
}
