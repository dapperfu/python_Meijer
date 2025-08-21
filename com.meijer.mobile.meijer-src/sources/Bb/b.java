package Bb;

import Db.e;
import Db.k;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class b implements k {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f2623c = C13785b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    e f2624a;

    /* renamed from: b, reason: collision with root package name */
    Db.b f2625b;

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (str == "Communicate_Enabled" || str == "Push_Properties" || str == "allowCommunicate" || str == "sendPlaceStateToServer") {
            this.f2624a.B(this.f2624a.J() && this.f2624a.M() && this.f2625b.s() && this.f2625b.u());
        }
    }

    public b(e eVar, Db.b bVar) {
        this.f2624a = eVar;
        this.f2625b = bVar;
        eVar.h(this, "Communicate_Enabled", "Push_Properties");
        this.f2625b.g(this, "allowCommunicate", "sendPlaceStateToServer");
    }
}
