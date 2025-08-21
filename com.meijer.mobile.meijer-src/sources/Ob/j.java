package Ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class j extends c {

    /* renamed from: e, reason: collision with root package name */
    protected List<a> f23281e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private d f23282f;

    /* renamed from: g, reason: collision with root package name */
    private d f23283g;

    @Override // Ob.c
    public List<a> f() {
        return this.f23281e;
    }

    public d i() {
        if (this.f23283g == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.f23281e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().j());
            }
            this.f23283g = new d(arrayList);
        }
        return this.f23283g;
    }

    public d j() {
        if (this.f23282f == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.f23281e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().k());
            }
            this.f23282f = new d(arrayList);
        }
        return this.f23282f;
    }

    public void k(a aVar) {
        this.f23281e.remove(aVar);
        this.f23281e.add(aVar);
        this.f23282f = null;
        this.f23283g = null;
        this.f23264c = null;
    }

    public String toString() {
        return e() + " -- " + j() + " : " + i();
    }
}
