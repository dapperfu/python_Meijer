package ob;

import Bb.e;
import Bb.k;
import Lb.g;
import Lb.s;
import cb.C6382c;
import cb.C6383d;

/* renamed from: ob.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16011b implements k {

    /* renamed from: e, reason: collision with root package name */
    private static final C6382c f153231e = C6383d.a(C16011b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private g f153232a;

    /* renamed from: b, reason: collision with root package name */
    private s f153233b;

    /* renamed from: c, reason: collision with root package name */
    private Bb.b f153234c;

    /* renamed from: d, reason: collision with root package name */
    private e f153235d;

    private void b() {
        if (this.f153235d.v() && this.f153232a.f17945b) {
            s sVar = this.f153233b;
            if (sVar.f17968a == 19 && sVar.d() && !this.f153234c.l()) {
                f153231e.g("*************** Beacon Support on Android 4.4.3 and 4.4.4 is OFF on Gimbal Manager. *************** ", new Object[0]);
            }
        }
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (("allowKitKat".equals(str) || "Registration_Properties".equals(str)) && obj != null) {
            b();
        }
    }

    public C16011b(Bb.b bVar, g gVar, s sVar, e eVar) {
        this.f153232a = gVar;
        this.f153233b = sVar;
        bVar.g(this, "allowKitKat");
        eVar.h(this, "Registration_Properties");
        this.f153234c = bVar;
        this.f153235d = eVar;
        b();
    }
}
