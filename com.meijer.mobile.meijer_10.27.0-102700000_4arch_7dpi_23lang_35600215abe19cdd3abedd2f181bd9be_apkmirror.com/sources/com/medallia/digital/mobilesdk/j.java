package com.medallia.digital.mobilesdk;

import java.security.SecureRandom;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class j {

    /* renamed from: f, reason: collision with root package name */
    private static final String f92249f = "md_";

    /* renamed from: g, reason: collision with root package name */
    private static final String f92250g = "md_android_";

    /* renamed from: h, reason: collision with root package name */
    public static final int f92251h = 101;

    /* renamed from: a, reason: collision with root package name */
    private i f92252a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f92253b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f92254c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f92255d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92256e;

    j() {
    }

    k A(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().D())) {
            return null;
        }
        x1 x1VarD = this.f92252a.b().D();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().D().a(), a(jSONObject, x1VarD, groupType), groupType, Lifetime.Session);
    }

    k B(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().E())) {
            return null;
        }
        x1 x1VarE = this.f92252a.b().E();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().E().a(), a(jSONObject, x1VarE, groupType), groupType, Lifetime.Session);
    }

    k C(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().F())) {
            return null;
        }
        x1 x1VarF = this.f92252a.b().F();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().F().a(), a(jSONObject, x1VarF, groupType), groupType, Lifetime.Session);
    }

    k D(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().G())) {
            return null;
        }
        x1 x1VarG = this.f92252a.b().G();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().G().a(), a(jSONObject, x1VarG, groupType), groupType, Lifetime.Session);
    }

    k E(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().H())) {
            return null;
        }
        x1 x1VarH = this.f92252a.b().H();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().H().a(), a(jSONObject, x1VarH, groupType), groupType, Lifetime.Application);
    }

    k F(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().J())) {
            return null;
        }
        x1 x1VarJ = this.f92252a.b().J();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().J().a(), a(jSONObject, x1VarJ, groupType), groupType, Lifetime.Session);
    }

    k G(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().K())) {
            return null;
        }
        x1 x1VarK = this.f92252a.b().K();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().K().a(), a(jSONObject, x1VarK, groupType), groupType, Lifetime.Session);
    }

    k H(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().L())) {
            return null;
        }
        x1 x1VarL = this.f92252a.b().L();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().L().a(), a(jSONObject, x1VarL, groupType), groupType, Lifetime.Session);
    }

    k I(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().M())) {
            return null;
        }
        x1 x1VarM = this.f92252a.b().M();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().M().a(), a(jSONObject, x1VarM, groupType), groupType, Lifetime.Session);
    }

    k J(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().N())) {
            return null;
        }
        x1 x1VarN = this.f92252a.b().N();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().N().a(), a(jSONObject, x1VarN, groupType), groupType, Lifetime.Session);
    }

    k K(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().O())) {
            return null;
        }
        x1 x1VarO = this.f92252a.b().O();
        GroupType groupType = GroupType.appRating;
        return new k(this.f92252a.b().O().a(), a(jSONObject, x1VarO, groupType), groupType, Lifetime.Session);
    }

    k L(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().P())) {
            return null;
        }
        x1 x1VarP = this.f92252a.b().P();
        GroupType groupType = GroupType.appRating;
        return new k(this.f92252a.b().P().a(), a(jSONObject, x1VarP, groupType), groupType, Lifetime.Session);
    }

    k M(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().Q())) {
            return null;
        }
        x1 x1VarQ = this.f92252a.b().Q();
        GroupType groupType = GroupType.appRating;
        return new k(this.f92252a.b().Q().a(), a(jSONObject, x1VarQ, groupType), groupType, Lifetime.Session);
    }

    k N(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().R())) {
            return null;
        }
        x1 x1VarR = this.f92252a.b().R();
        GroupType groupType = GroupType.appRating;
        return new k(this.f92252a.b().R().a(), a(jSONObject, x1VarR, groupType), groupType, Lifetime.Session);
    }

    k O(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().S())) {
            return null;
        }
        x1 x1VarS = this.f92252a.b().S();
        GroupType groupType = GroupType.appRating;
        return new k(this.f92252a.b().S().a(), a(jSONObject, x1VarS, groupType), groupType, Lifetime.Session);
    }

    k P(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().T())) {
            return null;
        }
        x1 x1VarT = this.f92252a.b().T();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().T().a(), a(jSONObject, x1VarT, groupType), groupType, Lifetime.Session);
    }

    k Q(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().U())) {
            return null;
        }
        x1 x1VarU = this.f92252a.b().U();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().U().a(), a(jSONObject, x1VarU, groupType), groupType, Lifetime.Session);
    }

    k R(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().V())) {
            return null;
        }
        x1 x1VarV = this.f92252a.b().V();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().V().a(), a(jSONObject, x1VarV, groupType), groupType, Lifetime.Session);
    }

    k S(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().W())) {
            return null;
        }
        x1 x1VarW = this.f92252a.b().W();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().W().a(), a(jSONObject, x1VarW, groupType), groupType, Lifetime.Session);
    }

    k T(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().X())) {
            return null;
        }
        x1 x1VarX = this.f92252a.b().X();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().X().a(), a(jSONObject, x1VarX, groupType), groupType, Lifetime.Application);
    }

    k U(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().Y())) {
            return null;
        }
        x1 x1VarY = this.f92252a.b().Y();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().Y().a(), a(jSONObject, x1VarY, groupType), groupType, Lifetime.Session);
    }

    k V(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().Z())) {
            return null;
        }
        x1 x1VarZ = this.f92252a.b().Z();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().Z().a(), a(jSONObject, x1VarZ, groupType), groupType, Lifetime.Application);
    }

    k W(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().a0())) {
            return null;
        }
        x1 x1VarA0 = this.f92252a.b().a0();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().a0().a(), a(jSONObject, x1VarA0, groupType), groupType, Lifetime.Session);
    }

    k X(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().c0())) {
            return null;
        }
        x1 x1VarC0 = this.f92252a.b().c0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().c0().a(), a(jSONObject, x1VarC0, groupType), groupType, Lifetime.Application);
    }

    k Y(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().d0())) {
            return null;
        }
        x1 x1VarD0 = this.f92252a.b().d0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().d0().a(), a(jSONObject, x1VarD0, groupType), groupType, Lifetime.Application);
    }

    k Z(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().e0())) {
            return null;
        }
        x1 x1VarE0 = this.f92252a.b().e0();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().e0().a(), a(jSONObject, x1VarE0, groupType), groupType, Lifetime.Session);
    }

    k a() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().j())) {
            return null;
        }
        return new k(this.f92252a.b().j().a(), a((JSONObject) null, this.f92252a.b().j(), GroupType.feedback), GroupType.api, Lifetime.Application);
    }

    k a0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().g0())) {
            return null;
        }
        x1 x1VarG0 = this.f92252a.b().g0();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().g0().a(), a(jSONObject, x1VarG0, groupType), groupType, Lifetime.Session);
    }

    k b() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().k())) {
            return null;
        }
        x1 x1VarK = this.f92252a.b().k();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().k().a(), a((JSONObject) null, x1VarK, groupType), groupType, Lifetime.Application);
    }

    k b0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().i0())) {
            return null;
        }
        x1 x1VarI0 = this.f92252a.b().i0();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().i0().a(), a(jSONObject, x1VarI0, groupType), groupType, Lifetime.Session);
    }

    k c() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().u())) {
            return null;
        }
        x1 x1VarU = this.f92252a.b().u();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().u().a(), a((JSONObject) null, x1VarU, groupType), groupType, Lifetime.Session);
    }

    k c0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().m0())) {
            return null;
        }
        x1 x1VarM0 = this.f92252a.b().m0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().m0().a(), a(jSONObject, x1VarM0, groupType), groupType, Lifetime.Application);
    }

    k d() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().b0())) {
            return null;
        }
        x1 x1VarB0 = this.f92252a.b().b0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().b0().a(), a((JSONObject) null, x1VarB0, groupType), groupType, Lifetime.Application);
    }

    k d0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().o0())) {
            return null;
        }
        x1 x1VarO0 = this.f92252a.b().o0();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().o0().a(), a(jSONObject, x1VarO0, groupType), groupType, Lifetime.Session);
    }

    k e() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().f0())) {
            return null;
        }
        x1 x1VarF0 = this.f92252a.b().f0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().f0().a(), a((JSONObject) null, x1VarF0, groupType), groupType, Lifetime.Application);
    }

    k e0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().n0())) {
            return null;
        }
        x1 x1VarN0 = this.f92252a.b().n0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().n0().a(), a(jSONObject, x1VarN0, groupType), groupType, Lifetime.Session);
    }

    k f() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().h0())) {
            return null;
        }
        x1 x1VarH0 = this.f92252a.b().h0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().h0().a(), a((JSONObject) null, x1VarH0, groupType), groupType, Lifetime.Application);
    }

    k f0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().p0())) {
            return null;
        }
        x1 x1VarP0 = this.f92252a.b().p0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().p0().a(), a(jSONObject, x1VarP0, groupType), groupType, Lifetime.Application);
    }

    k g() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().j0())) {
            return null;
        }
        x1 x1VarJ0 = this.f92252a.b().j0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().j0().a(), a((JSONObject) null, x1VarJ0, groupType), groupType, Lifetime.Application);
    }

    k g0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().r0())) {
            return null;
        }
        x1 x1VarR0 = this.f92252a.b().r0();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().r0().a(), a(jSONObject, x1VarR0, groupType), groupType, Lifetime.Session);
    }

    k h() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().k0())) {
            return null;
        }
        x1 x1VarK0 = this.f92252a.b().k0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().k0().a(), a((JSONObject) null, x1VarK0, groupType), groupType, Lifetime.Application);
    }

    k h0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().s0())) {
            return null;
        }
        x1 x1VarS0 = this.f92252a.b().s0();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().s0().a(), a(jSONObject, x1VarS0, groupType), groupType, Lifetime.Session);
    }

    k i() throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().l0())) {
            return null;
        }
        x1 x1VarL0 = this.f92252a.b().l0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().l0().a(), a((JSONObject) null, x1VarL0, groupType), groupType, Lifetime.Application);
    }

    k i0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().q0())) {
            return null;
        }
        x1 x1VarQ0 = this.f92252a.b().q0();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().q0().a(), a(jSONObject, x1VarQ0, groupType), groupType, Lifetime.Session);
    }

    k j(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().l())) {
            return null;
        }
        x1 x1VarL = this.f92252a.b().l();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().l().a(), a(jSONObject, x1VarL, groupType), groupType, Lifetime.Session);
    }

    k j0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().t0())) {
            return null;
        }
        x1 x1VarT0 = this.f92252a.b().t0();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().t0().a(), a(jSONObject, x1VarT0, groupType), groupType, Lifetime.Session);
    }

    k k(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().m())) {
            return null;
        }
        x1 x1VarM = this.f92252a.b().m();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().m().a(), a(jSONObject, x1VarM, groupType), groupType, Lifetime.Session);
    }

    k k0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().u0())) {
            return null;
        }
        x1 x1VarU0 = this.f92252a.b().u0();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().u0().a(), a(jSONObject, x1VarU0, groupType), groupType, Lifetime.Session);
    }

    k l(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().n())) {
            return null;
        }
        x1 x1VarN = this.f92252a.b().n();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().n().a(), a(jSONObject, x1VarN, groupType), groupType, Lifetime.Session);
    }

    k l0(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().v0())) {
            return null;
        }
        x1 x1VarV0 = this.f92252a.b().v0();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().v0().a(), a(jSONObject, x1VarV0, groupType), groupType, Lifetime.Application);
    }

    k m(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().o())) {
            return null;
        }
        x1 x1VarO = this.f92252a.b().o();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().o().a(), a(jSONObject, x1VarO, groupType), groupType, Lifetime.Session);
    }

    k n(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().p())) {
            return null;
        }
        x1 x1VarP = this.f92252a.b().p();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().p().a(), a(jSONObject, x1VarP, groupType), groupType, Lifetime.Session);
    }

    k o(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().q())) {
            return null;
        }
        x1 x1VarQ = this.f92252a.b().q();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().q().a(), a(jSONObject, x1VarQ, groupType), groupType, Lifetime.Session);
    }

    k p(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().r())) {
            return null;
        }
        x1 x1VarR = this.f92252a.b().r();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().r().a(), a(jSONObject, x1VarR, groupType), groupType, Lifetime.Session);
    }

    k q(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().s())) {
            return null;
        }
        x1 x1VarS = this.f92252a.b().s();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().s().a(), a(jSONObject, x1VarS, groupType), groupType, Lifetime.Session);
    }

    k r(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().t())) {
            return null;
        }
        x1 x1VarT = this.f92252a.b().t();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().t().a(), a(jSONObject, x1VarT, groupType), groupType, Lifetime.Session);
    }

    k s(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().v())) {
            return null;
        }
        x1 x1VarV = this.f92252a.b().v();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().v().a(), a(jSONObject, x1VarV, groupType), groupType, Lifetime.Session);
    }

    k t(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().w())) {
            return null;
        }
        x1 x1VarW = this.f92252a.b().w();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().w().a(), a(jSONObject, x1VarW, groupType), groupType, Lifetime.Session);
    }

    k u(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().x())) {
            return null;
        }
        x1 x1VarX = this.f92252a.b().x();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().x().a(), a(jSONObject, x1VarX, groupType), groupType, Lifetime.Session);
    }

    k v(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().y())) {
            return null;
        }
        x1 x1VarY = this.f92252a.b().y();
        GroupType groupType = GroupType.error;
        return new k(this.f92252a.b().y().a(), a(jSONObject, x1VarY, groupType), groupType, Lifetime.Session);
    }

    k w(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().z())) {
            return null;
        }
        x1 x1VarZ = this.f92252a.b().z();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().z().a(), a(jSONObject, x1VarZ, groupType), groupType, Lifetime.Session);
    }

    k x(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().A())) {
            return null;
        }
        x1 x1VarA = this.f92252a.b().A();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().A().a(), a(jSONObject, x1VarA, groupType), groupType, Lifetime.Session);
    }

    k y(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().B())) {
            return null;
        }
        x1 x1VarB = this.f92252a.b().B();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().B().a(), a(jSONObject, x1VarB, groupType), groupType, Lifetime.Session);
    }

    k z(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().C())) {
            return null;
        }
        x1 x1VarC = this.f92252a.b().C();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().C().a(), a(jSONObject, x1VarC, groupType), groupType, Lifetime.Session);
    }

    k a(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().a())) {
            return null;
        }
        x1 x1VarA = this.f92252a.b().a();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().a().a(), a(jSONObject, x1VarA, groupType), groupType, Lifetime.Session);
    }

    k b(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().b())) {
            return null;
        }
        x1 x1VarB = this.f92252a.b().b();
        GroupType groupType = GroupType.api;
        return new k(this.f92252a.b().b().a(), a(jSONObject, x1VarB, groupType), groupType, Lifetime.Session);
    }

    k c(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().c())) {
            return null;
        }
        x1 x1VarC = this.f92252a.b().c();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().c().a(), a(jSONObject, x1VarC, groupType), groupType, Lifetime.Session);
    }

    k d(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().d())) {
            return null;
        }
        x1 x1VarD = this.f92252a.b().d();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().d().a(), a(jSONObject, x1VarD, groupType), groupType, Lifetime.Session);
    }

    k e(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().e())) {
            return null;
        }
        x1 x1VarE = this.f92252a.b().e();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().e().a(), a(jSONObject, x1VarE, groupType), groupType, Lifetime.Session);
    }

    k f(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().f())) {
            return null;
        }
        x1 x1VarF = this.f92252a.b().f();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().f().a(), a(jSONObject, x1VarF, groupType), groupType, Lifetime.Session);
    }

    k g(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().g())) {
            return null;
        }
        x1 x1VarG = this.f92252a.b().g();
        GroupType groupType = GroupType.feedback;
        return new k(this.f92252a.b().g().a(), a(jSONObject, x1VarG, groupType), groupType, Lifetime.Session);
    }

    k h(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().h())) {
            return null;
        }
        x1 x1VarH = this.f92252a.b().h();
        GroupType groupType = GroupType.callback;
        return new k(this.f92252a.b().h().a(), a(jSONObject, x1VarH, groupType), groupType, Lifetime.Session);
    }

    k i(JSONObject jSONObject) throws JSONException {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().i())) {
            return null;
        }
        x1 x1VarI = this.f92252a.b().i();
        GroupType groupType = GroupType.internalSdk;
        return new k(this.f92252a.b().i().a(), a(jSONObject, x1VarI, groupType), groupType, Lifetime.Session);
    }

    k a(JSONObject jSONObject, String str, long j10) {
        i iVar = this.f92252a;
        if (iVar == null || iVar.b() == null || !a(this.f92252a.b().I())) {
            return null;
        }
        x1 x1VarI = this.f92252a.b().I();
        GroupType groupType = GroupType.error;
        return new k(a(jSONObject, x1VarI, groupType), groupType, Lifetime.Session, this.f92252a.b().I().a(), str, j10);
    }

    private String a(JSONObject jSONObject, String str) {
        try {
            if (str.contains(f92249f) && jSONObject != null && jSONObject.has("addOsType") && jSONObject.get("addOsType") != null && (jSONObject.get("addOsType") instanceof Boolean) && jSONObject.getBoolean("addOsType")) {
                return str.replace(f92249f, f92250g);
            }
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject a(org.json.JSONObject r10, com.medallia.digital.mobilesdk.x1 r11, com.medallia.digital.mobilesdk.GroupType r12) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.j.a(org.json.JSONObject, com.medallia.digital.mobilesdk.x1, com.medallia.digital.mobilesdk.GroupType):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: JSONException -> 0x0050, TryCatch #1 {JSONException -> 0x0050, blocks: (B:11:0x0028, B:13:0x002e, B:15:0x0034, B:17:0x003c, B:19:0x0042, B:23:0x005e, B:22:0x0052), top: B:35:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject a(org.json.JSONObject r7, org.json.JSONObject r8) throws org.json.JSONException {
        /*
            r6 = this;
            java.lang.String r0 = "addOsType"
            if (r8 == 0) goto L7e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.util.Iterator r2 = r8.keys()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "md_"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L26
            java.lang.String r4 = r6.a(r7, r3)
            goto L6c
        L26:
            if (r7 == 0) goto L52
            boolean r5 = r7.has(r0)     // Catch: org.json.JSONException -> L50
            if (r5 == 0) goto L52
            java.lang.Object r5 = r7.get(r0)     // Catch: org.json.JSONException -> L50
            if (r5 == 0) goto L52
            java.lang.Object r5 = r7.get(r0)     // Catch: org.json.JSONException -> L50
            boolean r5 = r5 instanceof java.lang.Boolean     // Catch: org.json.JSONException -> L50
            if (r5 == 0) goto L52
            boolean r5 = r7.getBoolean(r0)     // Catch: org.json.JSONException -> L50
            if (r5 == 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L50
            r4.<init>()     // Catch: org.json.JSONException -> L50
            java.lang.String r5 = "md_android_"
            r4.append(r5)     // Catch: org.json.JSONException -> L50
            r4.append(r3)     // Catch: org.json.JSONException -> L50
            goto L5e
        L50:
            r4 = move-exception
            goto L63
        L52:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L50
            r5.<init>()     // Catch: org.json.JSONException -> L50
            r5.append(r4)     // Catch: org.json.JSONException -> L50
            r5.append(r3)     // Catch: org.json.JSONException -> L50
            r4 = r5
        L5e:
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L50
            goto L6c
        L63:
            java.lang.String r4 = r4.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r4)
            java.lang.String r4 = ""
        L6c:
            java.lang.Object r3 = r8.get(r3)     // Catch: org.json.JSONException -> L74
            r1.put(r4, r3)     // Catch: org.json.JSONException -> L74
            goto Ld
        L74:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.medallia.digital.mobilesdk.a4.c(r3)
            goto Ld
        L7d:
            return r1
        L7e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.j.a(org.json.JSONObject, org.json.JSONObject):org.json.JSONObject");
    }

    private void a(int i10) {
        String str;
        if (!this.f92254c) {
            this.f92255d = true;
            a4.e("Sampling events mechanism is disabled");
            return;
        }
        a4.e("Sampling events mechanism is enabled");
        if (i10 == 0) {
            this.f92255d = false;
            str = "Sampling events mechanism shouldCollectEvents:false, samplePercent:0";
        } else {
            int iNextInt = new SecureRandom().nextInt(101);
            this.f92255d = i10 >= iNextInt;
            str = "Sampling events mechanism shouldCollectEvents: " + this.f92255d + ", samplePercent: " + i10 + ", random: " + iNextInt;
        }
        a4.b(str);
        CollectorsInfrastructure.getInstance().setIsSessionSampledEventsCollector(this.f92255d);
        CollectorsInfrastructure.getInstance().setSessionPercentageSampledEventsCollector(i10);
    }

    void a(i iVar, HashMap<String, Object> map, boolean z10, r1 r1Var) {
        int iIntValue;
        this.f92252a = iVar;
        this.f92253b = map;
        this.f92256e = z10;
        if (!z10 || r1Var == null) {
            iIntValue = 0;
        } else {
            this.f92254c = r1Var.d();
            iIntValue = r1Var.c().intValue();
            a4.e("Sampling events configuration set");
        }
        a(iIntValue);
    }

    boolean a(x1 x1Var) {
        if (x1Var == null || !this.f92256e) {
            a4.e("shouldReportAnalytics: false");
            return false;
        }
        if (this.f92254c && x1Var.d()) {
            a4.e("shouldReportAnalytics event: " + x1Var.a() + " shouldCollectEvents: " + this.f92255d);
            return this.f92255d;
        }
        a4.e("shouldReportAnalytics event: " + x1Var.a() + " isAnalyticsEnabled: " + x1Var.c());
        return x1Var.c();
    }
}
