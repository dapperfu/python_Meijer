package Yf;

import android.content.Context;
import cg.m;
import dg.h;
import io.constructor.BuildConfig;
import java.net.URI;

/* loaded from: classes8.dex */
final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    private static final Wf.a f43050d = Wf.a.e();

    /* renamed from: b, reason: collision with root package name */
    private final h f43051b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f43052c;

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f43050d.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || BuildConfig.SERVICE_SCHEME.equalsIgnoreCase(str);
    }

    @Override // Yf.e
    public boolean c() {
        if (j(this.f43051b.B0())) {
            f43050d.j("URL is missing:" + this.f43051b.B0());
            return false;
        }
        URI uriG = g(this.f43051b.B0());
        if (uriG == null) {
            f43050d.j("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f43052c)) {
            f43050d.j("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f43050d.j("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f43050d.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f43050d.j("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f43050d.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f43051b.D0() ? this.f43051b.s0() : null)) {
            f43050d.j("HTTP Method is null or invalid: " + this.f43051b.s0());
            return false;
        }
        if (this.f43051b.E0() && !m(this.f43051b.t0())) {
            f43050d.j("HTTP ResponseCode is a negative value:" + this.f43051b.t0());
            return false;
        }
        if (this.f43051b.F0() && !n(this.f43051b.v0())) {
            f43050d.j("Request Payload is a negative value:" + this.f43051b.v0());
            return false;
        }
        if (this.f43051b.G0() && !n(this.f43051b.x0())) {
            f43050d.j("Response Payload is a negative value:" + this.f43051b.x0());
            return false;
        }
        if (!this.f43051b.C0() || this.f43051b.q0() <= 0) {
            f43050d.j("Start time of the request is null, or zero, or a negative value:" + this.f43051b.q0());
            return false;
        }
        if (this.f43051b.H0() && !q(this.f43051b.y0())) {
            f43050d.j("Time to complete the request is a negative value:" + this.f43051b.y0());
            return false;
        }
        if (this.f43051b.J0() && !q(this.f43051b.A0())) {
            f43050d.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f43051b.A0());
            return false;
        }
        if (this.f43051b.I0() && this.f43051b.z0() > 0) {
            if (this.f43051b.E0()) {
                return true;
            }
            f43050d.j("Did not receive a HTTP Response Code");
            return false;
        }
        f43050d.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f43051b.z0());
        return false;
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }

    c(h hVar, Context context) {
        this.f43052c = context;
        this.f43051b = hVar;
    }

    private boolean j(String str) {
        return i(str);
    }
}
