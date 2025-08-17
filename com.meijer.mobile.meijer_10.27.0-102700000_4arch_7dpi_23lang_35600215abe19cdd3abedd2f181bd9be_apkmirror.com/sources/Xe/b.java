package Xe;

import Ze.a;
import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final If.b<Ze.a> f39305a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39306b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f39307c = null;

    private void a(a.c cVar) {
        this.f39305a.get().c(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        for (a aVar : list) {
            while (arrayDeque.size() >= i10) {
                k(((a.c) arrayDeque.pollFirst()).f42627b);
            }
            a.c cVarF = aVar.f(this.f39306b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    private static List<a> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.b(it.next()));
        }
        return arrayList;
    }

    private List<a.c> f() {
        return this.f39305a.get().g(this.f39306b, "");
    }

    private ArrayList<a> g(List<a> list, List<a> list2) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<a> list, List<a> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar.f(this.f39306b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f39307c == null) {
            this.f39307c = Integer.valueOf(this.f39305a.get().e(this.f39306b));
        }
        return this.f39307c.intValue();
    }

    private void k(String str) {
        this.f39305a.get().clearConditionalUserProperty(str, null, null);
    }

    private void o() throws AbtException {
        if (this.f39305a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public b(Context context, If.b<Ze.a> bVar, String str) {
        this.f39305a = bVar;
        this.f39306b = str;
    }

    private boolean d(List<a> list, a aVar) {
        String strC = aVar.c();
        String strE = aVar.e();
        for (a aVar2 : list) {
            if (aVar2.c().equals(strC) && aVar2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private void l(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f42627b);
        }
    }

    private void n(List<a> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<a> listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    public List<a> e() throws AbtException {
        o();
        List<a.c> listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        return arrayList;
    }

    public void j() throws AbtException {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) throws AbtException {
        o();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
