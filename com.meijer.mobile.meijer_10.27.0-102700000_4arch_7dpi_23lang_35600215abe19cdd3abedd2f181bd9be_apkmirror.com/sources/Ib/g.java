package Ib;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private Bb.e f13780a;

    private static void i(StringBuilder sb2, String... strArr) {
        for (String str : strArr) {
            sb2.append(q2.f92724c);
            sb2.append(str);
        }
    }

    @Override // Ib.f
    public final String a(String... strArr) {
        Bb.e eVar = this.f13780a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f13780a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.U());
        sb2.replace(this.f13780a.U().length() - 1, this.f13780a.U().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String b(String str, String... strArr) {
        Bb.e eVar = this.f13780a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f13780a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        Eb.e eVarX = this.f13780a.x();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.U());
        sb2.append("rest");
        sb2.append(q2.f92724c);
        sb2.append(str);
        sb2.append(q2.f92724c);
        sb2.append("user");
        sb2.append(q2.f92724c);
        sb2.append(eVarX.h());
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String c(String... strArr) {
        Bb.e eVar = this.f13780a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f13780a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.b());
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String d(String str, String... strArr) {
        Bb.e eVar = this.f13780a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f13780a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        Eb.e eVarX = this.f13780a.x();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.S());
        sb2.append("rest");
        sb2.append(q2.f92724c);
        sb2.append(str);
        sb2.append(q2.f92724c);
        sb2.append("user");
        sb2.append(q2.f92724c);
        sb2.append(eVarX.h());
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String e(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.T());
        sb2.replace(this.f13780a.T().length() - 1, this.f13780a.T().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String f(String... strArr) {
        Bb.e eVar = this.f13780a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f13780a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.P());
        sb2.replace(this.f13780a.P().length() - 1, this.f13780a.P().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String g(String... strArr) {
        Bb.e eVar = this.f13780a;
        if (eVar == null) {
            throw new IllegalStateException("Persistance object not ready yet.");
        }
        if (!eVar.v() || this.f13780a.x() == null) {
            throw new com.gimbal.internal.rest.context.n();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.a());
        sb2.replace(this.f13780a.a().length() - 1, this.f13780a.a().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    @Override // Ib.f
    public final String h(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13780a.R());
        sb2.replace(this.f13780a.R().length() - 1, this.f13780a.R().length(), "");
        i(sb2, strArr);
        return sb2.toString();
    }

    public g(Bb.e eVar) {
        this.f13780a = eVar;
    }
}
