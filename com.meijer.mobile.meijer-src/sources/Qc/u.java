package Qc;

import Nc.v;
import Oc.A;
import Rc.p0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC7119Ne0;
import com.google.android.gms.internal.ads.AbstractC7221Qe0;
import com.google.android.gms.internal.ads.AbstractC7289Se0;
import com.google.android.gms.internal.ads.AbstractC7323Te0;
import com.google.android.gms.internal.ads.AbstractC9424re0;
import com.google.android.gms.internal.ads.AbstractC9531se0;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8252gf0;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9745ue0;
import com.google.android.gms.internal.ads.InterfaceC7255Re0;
import com.google.android.gms.internal.ads.InterfaceC9133ot;
import com.google.android.gms.internal.ads.InterfaceC9638te0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC7255Re0 f28041f;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9133ot f28038c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28040e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f28036a = null;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9638te0 f28039d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f28037b = null;

    public final synchronized void a(InterfaceC9133ot interfaceC9133ot, Context context) {
        this.f28038c = interfaceC9133ot;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        e("on_play_store_bind", map);
    }

    public final synchronized boolean k(Context context) {
        if (!C8252gf0.a(context)) {
            return false;
        }
        try {
            this.f28039d = C9745ue0.a(context);
        } catch (NullPointerException e10) {
            p0.k("Error connecting LMD Overlay service");
            v.s().x(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f28039d == null) {
            this.f28040e = false;
            return false;
        }
        m();
        this.f28040e = true;
        return true;
    }

    private final void m() {
        if (this.f28041f == null) {
            this.f28041f = new t(this);
        }
    }

    public final void b() {
        InterfaceC9638te0 interfaceC9638te0;
        if (!this.f28040e || (interfaceC9638te0 = this.f28039d) == null) {
            p0.k("LastMileDelivery not connected");
        } else {
            interfaceC9638te0.a(l(), this.f28041f);
            d("onLMDOverlayCollapse");
        }
    }

    public final void c() {
        InterfaceC9638te0 interfaceC9638te0;
        if (!this.f28040e || (interfaceC9638te0 = this.f28039d) == null) {
            p0.k("LastMileDelivery not connected");
            return;
        }
        AbstractC9424re0 abstractC9424re0C = AbstractC9531se0.c();
        if (!((Boolean) A.c().a(C8784lf.f77339rb)).booleanValue() || TextUtils.isEmpty(this.f28037b)) {
            String str = this.f28036a;
            if (str != null) {
                abstractC9424re0C.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC9424re0C.a(this.f28037b);
        }
        interfaceC9638te0.c(abstractC9424re0C.c(), this.f28041f);
    }

    final void d(String str) {
        e(str, new HashMap());
    }

    final void e(final String str, final Map map) {
        C7033Kq.f69019f.execute(new Runnable() { // from class: Qc.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f28032a.h(str, map);
            }
        });
    }

    public final void g() {
        InterfaceC9638te0 interfaceC9638te0;
        if (!this.f28040e || (interfaceC9638te0 = this.f28039d) == null) {
            p0.k("LastMileDelivery not connected");
        } else {
            interfaceC9638te0.d(l(), this.f28041f);
            d("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void h(String str, Map map) {
        InterfaceC9133ot interfaceC9133ot = this.f28038c;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.L(str, map);
        }
    }

    public final void j(InterfaceC9133ot interfaceC9133ot, AbstractC7119Ne0 abstractC7119Ne0) {
        if (interfaceC9133ot == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f28038c = interfaceC9133ot;
        if (!this.f28040e && !k(interfaceC9133ot.getContext())) {
            f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) A.c().a(C8784lf.f77339rb)).booleanValue()) {
            this.f28037b = abstractC7119Ne0.h();
        }
        m();
        InterfaceC9638te0 interfaceC9638te0 = this.f28039d;
        if (interfaceC9638te0 != null) {
            interfaceC9638te0.b(abstractC7119Ne0, this.f28041f);
        }
    }

    private final AbstractC7323Te0 l() {
        AbstractC7289Se0 abstractC7289Se0C = AbstractC7323Te0.c();
        if (((Boolean) A.c().a(C8784lf.f77339rb)).booleanValue() && !TextUtils.isEmpty(this.f28037b)) {
            abstractC7289Se0C.a(this.f28037b);
        } else {
            String str = this.f28036a;
            if (str != null) {
                abstractC7289Se0C.b(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return abstractC7289Se0C.c();
    }

    final void f(String str, String str2) {
        p0.k(str);
        if (this.f28038c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            e("onError", map);
        }
    }

    final void i(AbstractC7221Qe0 abstractC7221Qe0) {
        if (!TextUtils.isEmpty(abstractC7221Qe0.b())) {
            if (!((Boolean) A.c().a(C8784lf.f77339rb)).booleanValue()) {
                this.f28036a = abstractC7221Qe0.b();
            }
        }
        switch (abstractC7221Qe0.a()) {
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
                this.f28036a = null;
                this.f28037b = null;
                this.f28040e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(abstractC7221Qe0.a()));
                e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }
}
