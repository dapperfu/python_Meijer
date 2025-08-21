package Ob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class b extends m {

    /* renamed from: g, reason: collision with root package name */
    protected List<f> f23260g = new ArrayList();

    public i j() {
        if (this.f23260g.size() > 0) {
            return this.f23260g.get(0);
        }
        return null;
    }

    public int k() {
        return this.f23260g.size();
    }

    @Override // Ob.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(' ');
        sb2.append('[');
        Iterator<f> it = this.f23260g.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(',');
        }
        if (this.f23260g.size() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // Ob.g
    public void a(f fVar) {
        super.a(fVar);
        this.f23260g.add(fVar);
        i(null);
    }

    @Override // Ob.m
    public d h() {
        d dVarH = super.h();
        if (dVarH == null && this.f23260g.size() > 0) {
            d dVar = new d(this.f23260g);
            i(dVar);
            return dVar;
        }
        return dVarH;
    }
}
