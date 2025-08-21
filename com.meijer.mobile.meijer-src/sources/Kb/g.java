package Kb;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private Db.e f16526a;

    private static void i(StringBuilder sb2, String... strArr) {
        for (String str : strArr) {
            sb2.append(q2.f93563c);
            sb2.append(str);
        }
    }

    @Override // Kb.f
    public final String a(String... strArr) {
        Db.e eVar = this.f16526a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f16526a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.U());
        sb2.replace(this.f16526a.U().length() - 1, this.f16526a.U().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String b(String str, String... strArr) {
        Db.e eVar = this.f16526a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f16526a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        Gb.e eVarX = this.f16526a.x();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.U());
        sb2.append("rest");
        sb2.append(q2.f93563c);
        sb2.append(str);
        sb2.append(q2.f93563c);
        sb2.append("user");
        sb2.append(q2.f93563c);
        sb2.append(eVarX.h());
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String c(String... strArr) {
        Db.e eVar = this.f16526a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f16526a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.b());
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String d(String str, String... strArr) {
        Db.e eVar = this.f16526a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f16526a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        Gb.e eVarX = this.f16526a.x();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.S());
        sb2.append("rest");
        sb2.append(q2.f93563c);
        sb2.append(str);
        sb2.append(q2.f93563c);
        sb2.append("user");
        sb2.append(q2.f93563c);
        sb2.append(eVarX.h());
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String e(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.T());
        sb2.replace(this.f16526a.T().length() - 1, this.f16526a.T().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String f(String... strArr) {
        Db.e eVar = this.f16526a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f16526a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.P());
        sb2.replace(this.f16526a.P().length() - 1, this.f16526a.P().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String g(String... strArr) {
        Db.e eVar = this.f16526a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f16526a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.a());
        sb2.replace(this.f16526a.a().length() - 1, this.f16526a.a().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Kb.f
    public final String h(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16526a.R());
        sb2.replace(this.f16526a.R().length() - 1, this.f16526a.R().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    public g(Db.e eVar) {
        this.f16526a = eVar;
    }
}
