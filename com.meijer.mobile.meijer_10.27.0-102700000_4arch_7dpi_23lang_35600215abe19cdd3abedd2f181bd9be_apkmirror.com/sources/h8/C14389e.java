package h8;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.medallia.digital.mobilesdk.q2;
import g8.C14219b;
import g8.D;
import g8.x;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k8.C15118d;
import k8.EnumC15115a;
import k8.q;
import k8.s;
import org.json.JSONException;
import x8.f;

/* renamed from: h8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14389e {

    /* renamed from: g, reason: collision with root package name */
    private static final String f134510g = x.f133195a + "RequestExecutor";

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f134511a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private String f134512b;

    /* renamed from: c, reason: collision with root package name */
    private String f134513c;

    /* renamed from: d, reason: collision with root package name */
    private C15118d f134514d;

    /* renamed from: e, reason: collision with root package name */
    private C14385a f134515e;

    /* renamed from: f, reason: collision with root package name */
    private s f134516f;

    public q g(q qVar, String str, int i10, long j10, int i11, boolean z10) throws Exception {
        return b(qVar, false, str, i10, j10, i11, z10);
    }

    private q b(q qVar, boolean z10, String str, int i10, long j10, int i11, boolean z11) throws Exception {
        C14387c c14387cB = this.f134515e.b(a(qVar, z10, i10, j10, i11), str, z11);
        if (c14387cB.a()) {
            return d(qVar, c14387cB);
        }
        if (c14387cB.f134504a == 404) {
            c();
        }
        throw new InvalidResponseException("invalid response code " + c14387cB.f134504a, c14387cB);
    }

    private void c() {
        if (this.f134514d.f141621d != EnumC15115a.APP_MON || "dynaTraceMonitor".equals(this.f134512b)) {
            return;
        }
        if (x.f133196b) {
            f.u(f134510g, String.format("Resetting beacon signal (%s) to (%s)", this.f134512b, "dynaTraceMonitor"));
        }
        this.f134512b = "dynaTraceMonitor";
        C14219b.e().f133004d.j();
        this.f134511a.incrementAndGet();
    }

    private void h(String str) {
        if (str == null || str.length() <= 0 || this.f134511a.get() > 3) {
            str = "dynaTraceMonitor";
        } else if (x.f133196b) {
            f.u(f134510g, String.format("Setting dtMonitor: %s attempt: %s ", str, Integer.valueOf(this.f134511a.get())));
        }
        if (str.equals(this.f134512b)) {
            return;
        }
        this.f134512b = str;
        this.f134513c = this.f134514d.a() + q2.f92724c + this.f134512b;
        C14219b.e().f133004d.m(this.f134512b);
    }

    String a(q qVar, boolean z10, int i10, long j10, int i11) {
        StringBuilder sb2 = new StringBuilder(this.f134513c);
        sb2.append("?");
        sb2.append("type");
        sb2.append("=");
        sb2.append("m");
        sb2.append("&");
        sb2.append("srvid");
        sb2.append("=");
        sb2.append(i10);
        sb2.append("&");
        sb2.append("app");
        sb2.append("=");
        sb2.append(C14219b.f132996j);
        sb2.append("&");
        sb2.append("va");
        sb2.append("=");
        sb2.append(f.t(D.a()));
        sb2.append("&");
        sb2.append("tt");
        sb2.append("=");
        sb2.append("maandroid");
        sb2.append("&");
        sb2.append("pt");
        sb2.append("=");
        sb2.append("0");
        if (this.f134514d.f141621d == EnumC15115a.SAAS) {
            sb2.append("&");
            sb2.append("resp");
            sb2.append("=");
            sb2.append("json");
            sb2.append("&");
            sb2.append("cts");
            sb2.append("=");
            sb2.append(qVar.A());
        }
        if (z10) {
            sb2.append("&");
            sb2.append("ns");
            sb2.append("=");
            sb2.append("1");
        }
        sb2.append("&");
        sb2.append("si");
        sb2.append("=");
        sb2.append(j10);
        sb2.append("_");
        sb2.append(i11);
        return sb2.toString();
    }

    q d(q qVar, C14387c c14387c) throws InvalidResponseException {
        String str;
        if (c14387c == null || (str = c14387c.f134506c) == null) {
            throw new InvalidResponseException("no message body", c14387c);
        }
        if (str.startsWith("{")) {
            if (this.f134514d.f141621d == EnumC15115a.APP_MON) {
                throw new InvalidResponseException("invalid configuration format", c14387c);
            }
            try {
                return this.f134516f.d(qVar, c14387c.f134506c);
            } catch (InvalidConfigurationException | ClassCastException | JSONException e10) {
                throw new InvalidResponseException("invalid message protocol", e10, c14387c);
            }
        }
        Map<String, String> mapP = f.p(c14387c.f134506c);
        if (mapP == null || !"m".equals(mapP.get("type"))) {
            throw new InvalidResponseException("invalid message protocol", c14387c);
        }
        q qVarB = this.f134516f.b(mapP, this.f134514d.f141621d);
        if (this.f134514d.f141621d == EnumC15115a.APP_MON) {
            h(mapP.get("bn"));
        }
        return qVarB;
    }

    public void e() {
        this.f134511a.set(0);
    }

    public q f(q qVar, boolean z10, int i10, n8.b bVar) throws Exception {
        return b(qVar, z10, null, i10, bVar.f151062b, bVar.f151063c, false);
    }

    public C14389e(C14385a c14385a, C15118d c15118d, s sVar) {
        this.f134514d = c15118d;
        this.f134515e = c14385a;
        this.f134516f = sVar;
        if (c15118d.f141621d == EnumC15115a.SAAS) {
            this.f134513c = c15118d.a();
            return;
        }
        this.f134512b = C14219b.e().f133004d.b();
        this.f134513c = c15118d.a() + q2.f92724c + this.f134512b;
    }
}
