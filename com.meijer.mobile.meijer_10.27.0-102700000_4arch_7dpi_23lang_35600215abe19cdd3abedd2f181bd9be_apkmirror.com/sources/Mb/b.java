package Mb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class b extends m {

    /* renamed from: g, reason: collision with root package name */
    protected List<f> f19073g = new ArrayList();

    public i j() {
        if (this.f19073g.size() > 0) {
            return this.f19073g.get(0);
        }
        return null;
    }

    public int k() {
        return this.f19073g.size();
    }

    @Override // Mb.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(' ');
        sb2.append('[');
        Iterator<f> it = this.f19073g.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(',');
        }
        if (this.f19073g.size() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // Mb.g
    public void a(f fVar) {
        super.a(fVar);
        this.f19073g.add(fVar);
        i(null);
    }

    @Override // Mb.m
    public d h() {
        d dVarH = super.h();
        if (dVarH == null && this.f19073g.size() > 0) {
            d dVar = new d(this.f19073g);
            i(dVar);
            return dVar;
        }
        return dVarH;
    }
}
