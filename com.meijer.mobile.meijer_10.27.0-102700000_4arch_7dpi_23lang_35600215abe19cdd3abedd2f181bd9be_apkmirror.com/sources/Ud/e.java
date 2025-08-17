package Ud;

import Ud.b;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class e<T> implements b.InterfaceC0787b<T> {

    /* renamed from: a, reason: collision with root package name */
    private b<T> f35914a;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<c> f35915b;

    /* renamed from: c, reason: collision with root package name */
    private int f35916c;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private e<T> f35917a;

        @RecentlyNonNull
        public e<T> a() {
            return this.f35917a;
        }

        public a(@RecentlyNonNull b<T> bVar) {
            e<T> eVar = new e<>();
            this.f35917a = eVar;
            if (bVar != null) {
                ((e) eVar).f35914a = bVar;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }
    }

    public interface b<T> {
        @RecentlyNonNull
        f<T> a(@RecentlyNonNull T t10);
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private f<T> f35918a;

        /* renamed from: b, reason: collision with root package name */
        private int f35919b;

        private c(e eVar) {
            this.f35919b = 0;
        }

        static /* synthetic */ int a(c cVar, int i10) {
            cVar.f35919b = 0;
            return 0;
        }

        static /* synthetic */ int d(c cVar) {
            int i10 = cVar.f35919b;
            cVar.f35919b = i10 + 1;
            return i10;
        }
    }

    private e() {
        this.f35915b = new SparseArray<>();
        this.f35916c = 3;
    }

    @Override // Ud.b.InterfaceC0787b
    public void release() {
        for (int i10 = 0; i10 < this.f35915b.size(); i10++) {
            this.f35915b.valueAt(i10).f35918a.a();
        }
        this.f35915b.clear();
    }

    @Override // Ud.b.InterfaceC0787b
    public void a(@RecentlyNonNull b.a<T> aVar) {
        SparseArray<T> sparseArrayA = aVar.a();
        for (int i10 = 0; i10 < sparseArrayA.size(); i10++) {
            int iKeyAt = sparseArrayA.keyAt(i10);
            T tValueAt = sparseArrayA.valueAt(i10);
            if (this.f35915b.get(iKeyAt) == null) {
                c cVar = new c();
                cVar.f35918a = this.f35914a.a(tValueAt);
                cVar.f35918a.c(iKeyAt, tValueAt);
                this.f35915b.append(iKeyAt, cVar);
            }
        }
        SparseArray<T> sparseArrayA2 = aVar.a();
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.f35915b.size(); i11++) {
            int iKeyAt2 = this.f35915b.keyAt(i11);
            if (sparseArrayA2.get(iKeyAt2) == null) {
                c cVarValueAt = this.f35915b.valueAt(i11);
                c.d(cVarValueAt);
                if (cVarValueAt.f35919b >= this.f35916c) {
                    cVarValueAt.f35918a.a();
                    hashSet.add(Integer.valueOf(iKeyAt2));
                } else {
                    cVarValueAt.f35918a.b(aVar);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f35915b.delete(((Integer) it.next()).intValue());
        }
        SparseArray<T> sparseArrayA3 = aVar.a();
        for (int i12 = 0; i12 < sparseArrayA3.size(); i12++) {
            int iKeyAt3 = sparseArrayA3.keyAt(i12);
            T tValueAt2 = sparseArrayA3.valueAt(i12);
            c cVar2 = this.f35915b.get(iKeyAt3);
            c.a(cVar2, 0);
            cVar2.f35918a.d(aVar, tValueAt2);
        }
    }
}
