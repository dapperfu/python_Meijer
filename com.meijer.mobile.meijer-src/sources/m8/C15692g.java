package m8;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import i8.InterfaceC14692A;
import java.util.Arrays;
import w7.EnumC17849a;

/* renamed from: m8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15692g {

    /* renamed from: a, reason: collision with root package name */
    protected static final String[] f150820a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    protected static final String[] f150821b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    protected static final EnumC17849a f150822c = EnumC17849a.f166972b;

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public boolean f() {
        return true;
    }

    public boolean g() {
        return true;
    }

    public boolean h() {
        return false;
    }

    public boolean j() {
        return true;
    }

    public boolean l() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return true;
    }

    public boolean r() {
        return true;
    }

    public InterfaceC14692A s() {
        return null;
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return false;
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return true;
    }

    @Deprecated
    public static C15689d a() {
        C15692g c15692g = new C15692g();
        EnumC15686a enumC15686a = EnumC15686a.SAAS;
        boolean zF = c15692g.f();
        int iK = c15692g.k();
        int iW = c15692g.w();
        boolean zR = c15692g.r();
        boolean zP = c15692g.p();
        boolean zD = c15692g.d();
        boolean zB = c15692g.b();
        boolean zG = c15692g.g();
        boolean zQ = c15692g.q();
        boolean zC = c15692g.c();
        boolean zX = c15692g.x();
        String[] strArrN = c15692g.n();
        String[] strArrO = c15692g.o();
        boolean zL = c15692g.l();
        boolean zJ = c15692g.j();
        boolean zH = c15692g.h();
        boolean zE = c15692g.e();
        boolean zV = c15692g.v();
        boolean zT = c15692g.t();
        boolean zU = c15692g.u();
        EnumC17849a enumC17849aM = c15692g.m();
        c15692g.s();
        return new C15689d("", "", "", enumC15686a, zF, null, null, iK, iW, zR, zP, zD, zB, zG, zQ, zC, zX, strArrN, strArrO, zL, zJ, zH, zE, null, zV, zT, zU, enumC17849aM, null, c15692g.y(), null, null, c15692g.i());
    }

    public int i() {
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    public int k() {
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    public EnumC17849a m() {
        return f150822c;
    }

    public String[] n() {
        return f150820a;
    }

    public String[] o() {
        return f150821b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ConfigurationPreset{, graceTime=");
        sb2.append(k());
        sb2.append(", waitTime=");
        sb2.append(w());
        sb2.append(", applicationMonitoring=");
        sb2.append(d());
        sb2.append(", activityMonitoring=");
        sb2.append(b());
        sb2.append(", certificateValidation=");
        sb2.append(f());
        sb2.append(", sendEmptyActions=");
        sb2.append(r());
        sb2.append(", namePrivacy=");
        sb2.append(p());
        sb2.append(", crashReporting=");
        sb2.append(g());
        sb2.append(", nativeCrashReporting=");
        sb2.append(q());
        sb2.append(", anrReporting=");
        sb2.append(c());
        sb2.append(", webRequestTiming=");
        sb2.append(x());
        sb2.append(", monitoredDomains=");
        sb2.append(Arrays.toString(n()));
        sb2.append(", monitoredHttpsDomains=");
        sb2.append(Arrays.toString(o()));
        sb2.append(", hybridApp=");
        sb2.append(l());
        sb2.append(", fileDomainCookies=");
        sb2.append(j());
        sb2.append(", debugLogLevel=");
        sb2.append(h());
        sb2.append(", autoStart=");
        sb2.append(e());
        sb2.append(", userOptIn=");
        sb2.append(v());
        sb2.append(", startupLoadBalancing=");
        sb2.append(t());
        sb2.append(", startupWithGrailEnabled=");
        sb2.append(u());
        sb2.append(", instrumentationFlavor=");
        sb2.append(m());
        sb2.append(", sessionReplayComponentProvider=");
        s();
        sb2.append((Object) null);
        sb2.append(", isRageTapDetectionEnabled=");
        sb2.append(y());
        sb2.append(", eventThrottlingLimit=");
        sb2.append(i());
        sb2.append('}');
        return sb2.toString();
    }

    public int w() {
        return 60000;
    }
}
