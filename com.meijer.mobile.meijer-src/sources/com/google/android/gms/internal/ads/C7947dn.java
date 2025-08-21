package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7947dn {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f74319a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74320b;

    public C7947dn(InterfaceC9133ot interfaceC9133ot, String str) {
        this.f74319a = interfaceC9133ot;
        this.f74320b = str;
    }

    public final void b(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.f74319a.j("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while dispatching default position.", e10);
        }
    }

    public final void c(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f74320b);
            InterfaceC9133ot interfaceC9133ot = this.f74319a;
            if (interfaceC9133ot != null) {
                interfaceC9133ot.j("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while dispatching error event.", e10);
        }
    }

    public final void d(String str) throws JSONException {
        try {
            this.f74319a.j("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void e(int i10, int i11, int i12, int i13, float f10, int i14) throws JSONException {
        try {
            this.f74319a.j("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while obtaining screen information.", e10);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.f74319a.j("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while dispatching size change.", e10);
        }
    }

    public final void g(String str) throws JSONException {
        try {
            this.f74319a.j("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e10) {
            Sc.p.e("Error occurred while dispatching state change.", e10);
        }
    }
}
