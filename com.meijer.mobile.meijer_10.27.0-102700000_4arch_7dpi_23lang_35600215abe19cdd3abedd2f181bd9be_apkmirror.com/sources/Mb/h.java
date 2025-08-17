package Mb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class h extends c {

    /* renamed from: e, reason: collision with root package name */
    private d f19090e;

    /* renamed from: f, reason: collision with root package name */
    protected List<m> f19091f;

    public h() {
        this.f19091f = new ArrayList();
    }

    @Override // Mb.c
    public List<m> f() {
        return this.f19091f;
    }

    public d i() {
        if (this.f19090e == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<m> it = this.f19091f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().h());
            }
            this.f19090e = new d(arrayList);
        }
        return this.f19090e;
    }

    public List<m> j() {
        return this.f19091f;
    }

    public void k(m mVar) {
        this.f19091f.remove(mVar);
        this.f19091f.add(new m(mVar));
        this.f19090e = null;
        this.f19077c = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e());
        sb2.append(" -- ");
        sb2.append(this.f19091f.size() == 0 ? "NO VISITS" : i());
        sb2.append(" visits: ");
        sb2.append(this.f19091f.size());
        sb2.append(" duration: ");
        sb2.append((d() / 1000.0d) / 60.0d);
        sb2.append(" minutes   score: ");
        sb2.append(g());
        return sb2.toString();
    }

    public h(h hVar) {
        super(hVar);
        this.f19091f = new ArrayList();
    }
}
