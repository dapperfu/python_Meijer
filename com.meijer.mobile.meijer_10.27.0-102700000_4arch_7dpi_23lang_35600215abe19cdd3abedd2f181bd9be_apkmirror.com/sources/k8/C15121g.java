package k8;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import g8.InterfaceC14216A;
import java.util.Arrays;
import u7.EnumC17232a;

/* renamed from: k8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15121g {

    /* renamed from: a, reason: collision with root package name */
    protected static final String[] f141674a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    protected static final String[] f141675b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    protected static final EnumC17232a f141676c = EnumC17232a.f162763b;

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

    public InterfaceC14216A s() {
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
    public static C15118d a() {
        C15121g c15121g = new C15121g();
        EnumC15115a enumC15115a = EnumC15115a.SAAS;
        boolean zF = c15121g.f();
        int iK = c15121g.k();
        int iW = c15121g.w();
        boolean zR = c15121g.r();
        boolean zP = c15121g.p();
        boolean zD = c15121g.d();
        boolean zB = c15121g.b();
        boolean zG = c15121g.g();
        boolean zQ = c15121g.q();
        boolean zC = c15121g.c();
        boolean zX = c15121g.x();
        String[] strArrN = c15121g.n();
        String[] strArrO = c15121g.o();
        boolean zL = c15121g.l();
        boolean zJ = c15121g.j();
        boolean zH = c15121g.h();
        boolean zE = c15121g.e();
        boolean zV = c15121g.v();
        boolean zT = c15121g.t();
        boolean zU = c15121g.u();
        EnumC17232a enumC17232aM = c15121g.m();
        c15121g.s();
        return new C15118d("", "", "", enumC15115a, zF, null, null, iK, iW, zR, zP, zD, zB, zG, zQ, zC, zX, strArrN, strArrO, zL, zJ, zH, zE, null, zV, zT, zU, enumC17232aM, null, c15121g.y(), null, null, c15121g.i());
    }

    public int i() {
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    public int k() {
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    public EnumC17232a m() {
        return f141676c;
    }

    public String[] n() {
        return f141674a;
    }

    public String[] o() {
        return f141675b;
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
