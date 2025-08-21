package qb;

import Db.e;
import Db.k;
import Nb.g;
import Nb.s;
import eb.C13786c;
import eb.C13787d;

/* renamed from: qb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16619b implements k {

    /* renamed from: e, reason: collision with root package name */
    private static final C13786c f158083e = C13787d.a(C16619b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private g f158084a;

    /* renamed from: b, reason: collision with root package name */
    private s f158085b;

    /* renamed from: c, reason: collision with root package name */
    private Db.b f158086c;

    /* renamed from: d, reason: collision with root package name */
    private e f158087d;

    private void b() {
        if (this.f158087d.v() && this.f158084a.f20765b) {
            s sVar = this.f158085b;
            if (sVar.f20788a == 19 && sVar.d() && !this.f158086c.l()) {
                f158083e.g("*************** Beacon Support on Android 4.4.3 and 4.4.4 is OFF on Gimbal Manager. *************** ", new Object[0]);
            }
        }
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (("allowKitKat".equals(str) || "Registration_Properties".equals(str)) && obj != null) {
            b();
        }
    }

    public C16619b(Db.b bVar, g gVar, s sVar, e eVar) {
        this.f158084a = gVar;
        this.f158085b = sVar;
        bVar.g(this, "allowKitKat");
        eVar.h(this, "Registration_Properties");
        this.f158086c = bVar;
        this.f158087d = eVar;
        b();
    }
}
