package P5;

import java.util.List;

/* loaded from: classes4.dex */
public class m<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    private final i f24791a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f24792b;

    @Override // P5.j
    public T a(c cVar) {
        i iVar = this.f24791a;
        if (iVar == null) {
            return null;
        }
        try {
            return this.f24792b.cast(iVar.a(cVar.f24774a, cVar.f24776c));
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
        this.f24791a = iVarB;
        this.f24792b = cls;
    }
}
