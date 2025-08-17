package P5;

import P5.q;
import java.util.List;

/* loaded from: classes4.dex */
public class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final List<e> f24779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24780b;

    @Override // P5.e
    public q a(c cVar) {
        String str = this.f24780b;
        if (str == null || str.isEmpty()) {
            return new q(q.a.MISSING_OPERATOR, "Null or empty operator for logical expression");
        }
        String str2 = this.f24780b;
        str2.getClass();
        return !str2.equals("or") ? !str2.equals("and") ? new q(q.a.MISSING_OPERATOR, String.format("Unknown conjunction operator - %s.", this.f24780b)) : b(cVar, this.f24779a) : c(cVar, this.f24779a);
    }

    public h(List<e> list, String str) {
        this.f24779a = list;
        this.f24780b = str;
    }

    private q b(c cVar, List<e> list) {
        for (e eVar : list) {
            if (eVar != null && !eVar.a(cVar).a()) {
                return new q(q.a.CONDITION_FAILED, "AND operation returned false.");
            }
        }
        return q.f24799d;
    }

    private q c(c cVar, List<e> list) {
        for (e eVar : list) {
            if (eVar != null && eVar.a(cVar).a()) {
                return q.f24799d;
            }
        }
        return new q(q.a.CONDITION_FAILED, "OR operation returned false.");
    }
}
