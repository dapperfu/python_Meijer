package Q5;

import java.util.List;

/* loaded from: classes4.dex */
public class m<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    private final i f27821a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f27822b;

    @Override // Q5.j
    public T a(c cVar) {
        i iVar = this.f27821a;
        if (iVar == null) {
            return null;
        }
        try {
            return this.f27822b.cast(iVar.a(cVar.f27804a, cVar.f27806c));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public m(String str, Class<T> cls) {
        i iVarB;
        List<r> listA = w.a(str);
        if (listA.size() > 0 && (listA.get(0) instanceof t)) {
            iVarB = ((t) listA.get(0)).b();
        } else {
            iVarB = null;
        }
        this.f27821a = iVarB;
        this.f27822b = cls;
    }
}
