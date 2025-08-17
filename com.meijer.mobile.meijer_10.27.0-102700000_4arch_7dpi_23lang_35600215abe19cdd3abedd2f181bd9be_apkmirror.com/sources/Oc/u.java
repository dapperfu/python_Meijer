package Oc;

import Lc.v;
import Mc.A;
import Pc.p0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC6994Ne0;
import com.google.android.gms.internal.ads.AbstractC7096Qe0;
import com.google.android.gms.internal.ads.AbstractC7164Se0;
import com.google.android.gms.internal.ads.AbstractC7198Te0;
import com.google.android.gms.internal.ads.AbstractC9299re0;
import com.google.android.gms.internal.ads.AbstractC9406se0;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C8127gf0;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9620ue0;
import com.google.android.gms.internal.ads.InterfaceC7130Re0;
import com.google.android.gms.internal.ads.InterfaceC9008ot;
import com.google.android.gms.internal.ads.InterfaceC9513te0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC7130Re0 f23553f;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9008ot f23550c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23552e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f23548a = null;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9513te0 f23551d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f23549b = null;

    public final synchronized void a(InterfaceC9008ot interfaceC9008ot, Context context) {
        this.f23550c = interfaceC9008ot;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        e("on_play_store_bind", map);
    }

    public final synchronized boolean k(Context context) {
        if (!C8127gf0.a(context)) {
            return false;
        }
        try {
            this.f23551d = C9620ue0.a(context);
        } catch (NullPointerException e10) {
            p0.k("Error connecting LMD Overlay service");
            v.s().x(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f23551d == null) {
            this.f23552e = false;
            return false;
        }
        m();
        this.f23552e = true;
        return true;
    }

    private final void m() {
        if (this.f23553f == null) {
            this.f23553f = new t(this);
        }
    }

    public final void b() {
        InterfaceC9513te0 interfaceC9513te0;
        if (!this.f23552e || (interfaceC9513te0 = this.f23551d) == null) {
            p0.k("LastMileDelivery not connected");
        } else {
            interfaceC9513te0.a(l(), this.f23553f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        InterfaceC9513te0 interfaceC9513te0;
        if (!this.f23552e || (interfaceC9513te0 = this.f23551d) == null) {
            p0.k("LastMileDelivery not connected");
            return;
        }
        AbstractC9299re0 abstractC9299re0C = AbstractC9406se0.c();
        if (!((Boolean) A.c().a(C8659lf.f76499rb)).booleanValue() || TextUtils.isEmpty(this.f23549b)) {
            String str = this.f23548a;
            if (str != null) {
                abstractC9299re0C.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC9299re0C.a(this.f23549b);
        }
        interfaceC9513te0.c(abstractC9299re0C.c(), this.f23553f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        C6908Kq.f68179f.execute(new Runnable() { // from class: Oc.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f23544a.h(str, map);
            }
        });
    }

    public final void g() {
        InterfaceC9513te0 interfaceC9513te0;
        if (!this.f23552e || (interfaceC9513te0 = this.f23551d) == null) {
            p0.k("LastMileDelivery not connected");
        } else {
            interfaceC9513te0.d(l(), this.f23553f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(String str, Map map) {
        InterfaceC9008ot interfaceC9008ot = this.f23550c;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.L(str, map);
        }
    }

    public final void j(InterfaceC9008ot interfaceC9008ot, AbstractC6994Ne0 abstractC6994Ne0) {
        if (interfaceC9008ot == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f23550c = interfaceC9008ot;
        if (!this.f23552e && !k(interfaceC9008ot.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) A.c().a(C8659lf.f76499rb)).booleanValue()) {
            this.f23549b = abstractC6994Ne0.h();
        }
        m();
        InterfaceC9513te0 interfaceC9513te0 = this.f23551d;
        if (interfaceC9513te0 != null) {
            interfaceC9513te0.b(abstractC6994Ne0, this.f23553f);
        }
    }

    private final AbstractC7198Te0 l() {
        AbstractC7164Se0 abstractC7164Se0C = AbstractC7198Te0.c();
        if (((Boolean) A.c().a(C8659lf.f76499rb)).booleanValue() && !TextUtils.isEmpty(this.f23549b)) {
            abstractC7164Se0C.a(this.f23549b);
        } else {
            String str = this.f23548a;
            if (str != null) {
                abstractC7164Se0C.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return abstractC7164Se0C.c();
    }

    final void f(String str, String str2) {
        p0.k(str);
        if (this.f23550c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            e("onError", map);
        }
    }

    final void i(AbstractC7096Qe0 abstractC7096Qe0) {
        if (!TextUtils.isEmpty(abstractC7096Qe0.b())) {
            if (!((Boolean) A.c().a(C8659lf.f76499rb)).booleanValue()) {
                this.f23548a = abstractC7096Qe0.b();
            }
        }
        switch (abstractC7096Qe0.a()) {
            case 8152:
                d("onLMDOverlayOpened");
                break;
            case 8153:
                d("onLMDOverlayClicked");
                break;
            case 8155:
                d("onLMDOverlayClose");
                break;
            case 8157:
                this.f23548a = null;
                this.f23549b = null;
                this.f23552e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(abstractC7096Qe0.a()));
                e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}
