package Wf;

import ag.m;
import android.content.Context;
import bg.h;
import io.constructor.BuildConfig;
import java.net.URI;

/* loaded from: classes7.dex */
final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    private static final Uf.a f38651d = Uf.a.e();

    /* renamed from: b, reason: collision with root package name */
    private final h f38652b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f38653c;

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f38651d.k("getResultUrl throws exception %s", e10.getMessage());
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

    @Override // Wf.e
    public boolean c() {
        if (j(this.f38652b.B0())) {
            f38651d.j("URL is missing:" + this.f38652b.B0());
            return false;
        }
        URI uriG = g(this.f38652b.B0());
        if (uriG == null) {
            f38651d.j("URL cannot be parsed");
            return false;
        }
        if (!h(uriG, this.f38653c)) {
            f38651d.j("URL fails allowlist rule: " + uriG);
            return false;
        }
        if (!k(uriG.getHost())) {
            f38651d.j("URL host is null or invalid");
            return false;
        }
        if (!p(uriG.getScheme())) {
            f38651d.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(uriG.getUserInfo())) {
            f38651d.j("URL user info is null");
            return false;
        }
        if (!o(uriG.getPort())) {
            f38651d.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f38652b.D0() ? this.f38652b.s0() : null)) {
            f38651d.j("HTTP Method is null or invalid: " + this.f38652b.s0());
            return false;
        }
        if (this.f38652b.E0() && !m(this.f38652b.t0())) {
            f38651d.j("HTTP ResponseCode is a negative value:" + this.f38652b.t0());
            return false;
        }
        if (this.f38652b.F0() && !n(this.f38652b.v0())) {
            f38651d.j("Request Payload is a negative value:" + this.f38652b.v0());
            return false;
        }
        if (this.f38652b.G0() && !n(this.f38652b.x0())) {
            f38651d.j("Response Payload is a negative value:" + this.f38652b.x0());
            return false;
        }
        if (!this.f38652b.C0() || this.f38652b.q0() <= 0) {
            f38651d.j("Start time of the request is null, or zero, or a negative value:" + this.f38652b.q0());
            return false;
        }
        if (this.f38652b.H0() && !q(this.f38652b.y0())) {
            f38651d.j("Time to complete the request is a negative value:" + this.f38652b.y0());
            return false;
        }
        if (this.f38652b.J0() && !q(this.f38652b.A0())) {
            f38651d.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f38652b.A0());
            return false;
        }
        if (this.f38652b.I0() && this.f38652b.z0() > 0) {
            if (this.f38652b.E0()) {
                return true;
            }
            f38651d.j("Did not receive a HTTP Response Code");
            return false;
        }
        f38651d.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f38652b.z0());
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
        this.f38653c = context;
        this.f38652b = hVar;
    }

    private boolean j(String str) {
        return i(str);
    }
}
