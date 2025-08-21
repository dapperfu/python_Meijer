package Q5;

import Q5.q;
import java.util.List;

/* loaded from: classes4.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List<e> f27809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27810b;

    @Override // Q5.e
    public q a(c cVar) {
        String str = this.f27810b;
        if (str == null || str.isEmpty()) {
            return new q(q.a.MISSING_OPERATOR, "Null or empty operator for logical expression");
        }
        String str2 = this.f27810b;
        str2.getClass();
        return !str2.equals("or") ? !str2.equals("and") ? new q(q.a.MISSING_OPERATOR, String.format("Unknown conjunction operator - %s.", this.f27810b)) : b(cVar, this.f27809a) : c(cVar, this.f27809a);
    }

    public h(List<e> list, String str) {
        this.f27809a = list;
        this.f27810b = str;
    }

    private q b(c cVar, List<e> list) {
        for (e eVar : list) {
            if (eVar != null && !eVar.a(cVar).a()) {
                return new q(q.a.CONDITION_FAILED, "AND operation returned false.");
            }
        }
        return q.f27829d;
    }

    private q c(c cVar, List<e> list) {
        for (e eVar : list) {
            if (eVar != null && eVar.a(cVar).a()) {
                return q.f27829d;
            }
        }
        return new q(q.a.CONDITION_FAILED, "OR operation returned false.");
    }
}
