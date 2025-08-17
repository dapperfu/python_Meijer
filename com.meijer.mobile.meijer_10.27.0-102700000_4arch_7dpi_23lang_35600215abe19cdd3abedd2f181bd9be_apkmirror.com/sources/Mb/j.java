package Mb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class j extends c {

    /* renamed from: e, reason: collision with root package name */
    protected List<a> f19094e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private d f19095f;

    /* renamed from: g, reason: collision with root package name */
    private d f19096g;

    @Override // Mb.c
    public List<a> f() {
        return this.f19094e;
    }

    public d i() {
        if (this.f19096g == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.f19094e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().j());
            }
            this.f19096g = new d(arrayList);
        }
        return this.f19096g;
    }

    public d j() {
        if (this.f19095f == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<a> it = this.f19094e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().k());
            }
            this.f19095f = new d(arrayList);
        }
        return this.f19095f;
    }

    public void k(a aVar) {
        this.f19094e.remove(aVar);
        this.f19094e.add(aVar);
        this.f19095f = null;
        this.f19096g = null;
        this.f19077c = null;
    }

    public String toString() {
        return e() + " -- " + j() + " : " + i();
    }
}
