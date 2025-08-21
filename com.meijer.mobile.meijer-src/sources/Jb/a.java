package Jb;

import Db.e;
import Db.k;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class a implements k {

    /* renamed from: a, reason: collision with root package name */
    private final C13784a f15682a = C13785b.a(a.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    public e f15683b;

    /* renamed from: c, reason: collision with root package name */
    public String f15684c;

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            if (obj == null) {
                this.f15684c = null;
            } else {
                this.f15684c = ((Gb.e) obj).e();
            }
        }
    }

    public final String b(String str) {
        return String.format("%s%s%s", this.f15683b.V(), "v10/", str);
    }

    public a(e eVar) {
        this.f15683b = eVar;
        if (eVar.x() != null) {
            this.f15684c = eVar.x().e();
        }
        this.f15683b.h(this, "Registration_Properties");
    }
}
