package j8;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.medallia.digital.mobilesdk.q2;
import i8.C14695b;
import i8.D;
import i8.x;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m8.C15689d;
import m8.EnumC15686a;
import m8.q;
import m8.s;
import org.json.JSONException;
import z8.f;

/* renamed from: j8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14967e {

    /* renamed from: g, reason: collision with root package name */
    private static final String f140197g = x.f137411a + "RequestExecutor";

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f140198a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private String f140199b;

    /* renamed from: c, reason: collision with root package name */
    private String f140200c;

    /* renamed from: d, reason: collision with root package name */
    private C15689d f140201d;

    /* renamed from: e, reason: collision with root package name */
    private C14963a f140202e;

    /* renamed from: f, reason: collision with root package name */
    private s f140203f;

    public q g(q qVar, String str, int i10, long j10, int i11, boolean z10) throws Exception {
        return b(qVar, false, str, i10, j10, i11, z10);
    }

    private q b(q qVar, boolean z10, String str, int i10, long j10, int i11, boolean z11) throws Exception {
        C14965c c14965cB = this.f140202e.b(a(qVar, z10, i10, j10, i11), str, z11);
        if (c14965cB.a()) {
            return d(qVar, c14965cB);
        }
        if (c14965cB.f140191a == 404) {
            c();
        }
        throw new InvalidResponseException("invalid response code " + c14965cB.f140191a, c14965cB);
    }

    private void c() {
        if (this.f140201d.f150767d != EnumC15686a.APP_MON || "dynaTraceMonitor".equals(this.f140199b)) {
            return;
        }
        if (x.f137412b) {
            f.u(f140197g, String.format("Resetting beacon signal (%s) to (%s)", this.f140199b, "dynaTraceMonitor"));
        }
        this.f140199b = "dynaTraceMonitor";
        C14695b.e().f137220d.j();
        this.f140198a.incrementAndGet();
    }

    private void h(String str) {
        if (str == null || str.length() <= 0 || this.f140198a.get() > 3) {
            str = "dynaTraceMonitor";
        } else if (x.f137412b) {
            f.u(f140197g, String.format("Setting dtMonitor: %s attempt: %s ", str, Integer.valueOf(this.f140198a.get())));
        }
        if (str.equals(this.f140199b)) {
            return;
        }
        this.f140199b = str;
        this.f140200c = this.f140201d.a() + q2.f93563c + this.f140199b;
        C14695b.e().f137220d.m(this.f140199b);
    }

    String a(q qVar, boolean z10, int i10, long j10, int i11) {
        StringBuilder sb2 = new StringBuilder(this.f140200c);
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
        sb2.append(C14695b.f137212j);
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
        if (this.f140201d.f150767d == EnumC15686a.SAAS) {
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

    q d(q qVar, C14965c c14965c) throws InvalidResponseException {
        String str;
        if (c14965c == null || (str = c14965c.f140193c) == null) {
            throw new InvalidResponseException("no message body", c14965c);
        }
        if (str.startsWith("{")) {
            if (this.f140201d.f150767d == EnumC15686a.APP_MON) {
                throw new InvalidResponseException("invalid configuration format", c14965c);
            }
            try {
                return this.f140203f.e(qVar, c14965c.f140193c);
            } catch (InvalidConfigurationException | ClassCastException | JSONException e10) {
                throw new InvalidResponseException("invalid message protocol", e10, c14965c);
            }
        }
        Map<String, String> mapP = f.p(c14965c.f140193c);
        if (mapP == null || !"m".equals(mapP.get("type"))) {
            throw new InvalidResponseException("invalid message protocol", c14965c);
        }
        q qVarA = this.f140203f.a(mapP, this.f140201d.f150767d);
        if (this.f140201d.f150767d == EnumC15686a.APP_MON) {
            h(mapP.get("bn"));
        }
        return qVarA;
    }

    public void e() {
        this.f140198a.set(0);
    }

    public q f(q qVar, boolean z10, int i10, p8.b bVar) throws Exception {
        return b(qVar, z10, null, i10, bVar.f156193b, bVar.f156194c, false);
    }

    public C14967e(C14963a c14963a, C15689d c15689d, s sVar) {
        this.f140201d = c15689d;
        this.f140202e = c14963a;
        this.f140203f = sVar;
        if (c15689d.f150767d == EnumC15686a.SAAS) {
            this.f140200c = c15689d.a();
            return;
        }
        this.f140199b = C14695b.e().f137220d.b();
        this.f140200c = c15689d.a() + q2.f93563c + this.f140199b;
    }
}
