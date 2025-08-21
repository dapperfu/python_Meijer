package Wd;

import Wd.b;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class e<T> implements b.InterfaceC0880b<T> {

    /* renamed from: a, reason: collision with root package name */
    private b<T> f40939a;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray<c> f40940b;

    /* renamed from: c, reason: collision with root package name */
    private int f40941c;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private e<T> f40942a;

        @RecentlyNonNull
        public e<T> a() {
            return this.f40942a;
        }

        public a(@RecentlyNonNull b<T> bVar) {
            e<T> eVar = new e<>();
            this.f40942a = eVar;
            if (bVar != null) {
                ((e) eVar).f40939a = bVar;
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
        private f<T> f40943a;

        /* renamed from: b, reason: collision with root package name */
        private int f40944b;

        private c(e eVar) {
            this.f40944b = 0;
        }

        static /* synthetic */ int a(c cVar, int i10) {
            cVar.f40944b = 0;
            return 0;
        }

        static /* synthetic */ int d(c cVar) {
            int i10 = cVar.f40944b;
            cVar.f40944b = i10 + 1;
            return i10;
        }
    }

    private e() {
        this.f40940b = new SparseArray<>();
        this.f40941c = 3;
    }

    @Override // Wd.b.InterfaceC0880b
    public void release() {
        for (int i10 = 0; i10 < this.f40940b.size(); i10++) {
            this.f40940b.valueAt(i10).f40943a.a();
        }
        this.f40940b.clear();
    }

    @Override // Wd.b.InterfaceC0880b
    public void a(@RecentlyNonNull b.a<T> aVar) {
        SparseArray<T> sparseArrayA = aVar.a();
        for (int i10 = 0; i10 < sparseArrayA.size(); i10++) {
            int iKeyAt = sparseArrayA.keyAt(i10);
            T tValueAt = sparseArrayA.valueAt(i10);
            if (this.f40940b.get(iKeyAt) == null) {
                c cVar = new c();
                cVar.f40943a = this.f40939a.a(tValueAt);
                cVar.f40943a.c(iKeyAt, tValueAt);
                this.f40940b.append(iKeyAt, cVar);
            }
        }
        SparseArray<T> sparseArrayA2 = aVar.a();
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.f40940b.size(); i11++) {
            int iKeyAt2 = this.f40940b.keyAt(i11);
            if (sparseArrayA2.get(iKeyAt2) == null) {
                c cVarValueAt = this.f40940b.valueAt(i11);
                c.d(cVarValueAt);
                if (cVarValueAt.f40944b >= this.f40941c) {
                    cVarValueAt.f40943a.a();
                    hashSet.add(Integer.valueOf(iKeyAt2));
                } else {
                    cVarValueAt.f40943a.b(aVar);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f40940b.delete(((Integer) it.next()).intValue());
        }
        SparseArray<T> sparseArrayA3 = aVar.a();
        for (int i12 = 0; i12 < sparseArrayA3.size(); i12++) {
            int iKeyAt3 = sparseArrayA3.keyAt(i12);
            T tValueAt2 = sparseArrayA3.valueAt(i12);
            c cVar2 = this.f40940b.get(iKeyAt3);
            c.a(cVar2, 0);
            cVar2.f40943a.d(aVar, tValueAt2);
        }
    }
}
