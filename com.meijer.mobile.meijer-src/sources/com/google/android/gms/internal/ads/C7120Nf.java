package com.google.android.gms.internal.ads;

import Xc.C5569c;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7120Nf extends androidx.browser.customtabs.b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f69773a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final List f69774b = Arrays.asList(((String) Oc.A.c().a(C8784lf.f76904M9)).split(","));

    /* renamed from: c, reason: collision with root package name */
    private final C7222Qf f69775c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.browser.customtabs.b f69776d;

    /* renamed from: e, reason: collision with root package name */
    private final CN f69777e;

    private final void m(String str) {
        C5569c.d(this.f69777e, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.b
    public final void a(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            bVar.a(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle b(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            return bVar.b(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void d(int i10, int i11, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            bVar.d(i10, i11, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void e(Bundle bundle) {
        this.f69773a.set(false);
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            bVar.e(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void g(int i10, Bundle bundle) {
        List list;
        this.f69773a.set(false);
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            bVar.g(i10, bundle);
        }
        this.f69775c.i(Nc.v.c().a());
        if (this.f69775c == null || (list = this.f69774b) == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        this.f69775c.f();
        m("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.b
    public final void h(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f69773a.set(true);
                m("pact_con");
                this.f69775c.h(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            Rc.p0.l("Message is not in JSON format: ", e10);
        }
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            bVar.h(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void i(int i10, Uri uri, boolean z10, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f69776d;
        if (bVar != null) {
            bVar.i(i10, uri, z10, bundle);
        }
    }

    public final Boolean l() {
        return Boolean.valueOf(this.f69773a.get());
    }

    C7120Nf(C7222Qf c7222Qf, androidx.browser.customtabs.b bVar, CN cn2) {
        this.f69776d = bVar;
        this.f69775c = c7222Qf;
        this.f69777e = cn2;
    }
}
