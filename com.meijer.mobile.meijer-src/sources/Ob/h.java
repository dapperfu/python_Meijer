package Ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class h extends c {

    /* renamed from: e, reason: collision with root package name */
    private d f23277e;

    /* renamed from: f, reason: collision with root package name */
    protected List<m> f23278f;

    public h() {
        this.f23278f = new ArrayList();
    }

    @Override // Ob.c
    public List<m> f() {
        return this.f23278f;
    }

    public d i() {
        if (this.f23277e == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<m> it = this.f23278f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().h());
            }
            this.f23277e = new d(arrayList);
        }
        return this.f23277e;
    }

    public List<m> j() {
        return this.f23278f;
    }

    public void k(m mVar) {
        this.f23278f.remove(mVar);
        this.f23278f.add(new m(mVar));
        this.f23277e = null;
        this.f23264c = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e());
        sb2.append(" -- ");
        sb2.append(this.f23278f.size() == 0 ? "NO VISITS" : i());
        sb2.append(" visits: ");
        sb2.append(this.f23278f.size());
        sb2.append(" duration: ");
        sb2.append((d() / 1000.0d) / 60.0d);
        sb2.append(" minutes   score: ");
        sb2.append(g());
        return sb2.toString();
    }

    public h(h hVar) {
        super(hVar);
        this.f23278f = new ArrayList();
    }
}
