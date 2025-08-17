package g8;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import g8.y;
import m8.InterfaceC15577b;
import org.json.JSONException;
import org.json.JSONObject;
import u7.EnumC17232a;

/* loaded from: classes4.dex */
public class n implements InterfaceC15577b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f133101c = x.f133195a + "CrashReporter";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f133102d = false;

    /* renamed from: a, reason: collision with root package name */
    private final m8.h f133103a = new m8.h();

    /* renamed from: b, reason: collision with root package name */
    protected g f133104b;

    @Override // m8.InterfaceC15577b
    public synchronized void a(String str, String str2, String str3, String str4) {
    }

    @Override // m8.InterfaceC15577b
    public synchronized void b(Thread thread, Throwable th2) {
        try {
            n8.b bVarC = n8.b.c(true);
            int i10 = C14219b.e().f133003c;
            this.f133104b.K();
            if (bVarC.m()) {
                d(thread, th2, bVarC, i10);
            }
            l.w(5000L);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    protected void d(final Thread thread, final Throwable th2, final n8.b bVar, int i10) {
        final long jA = C14217B.a();
        if (x.f133196b) {
            x8.f.x(f133101c, String.format("Processing exception (in thread %s) ...", thread != null ? thread.getName() : zzbz.UNKNOWN_CONTENT_TYPE), th2);
        }
        if (!bVar.f().e(w.f133184q)) {
            l.j("a crash");
            return;
        }
        EnumC17232a enumC17232a = C14219b.e().c().f141614A;
        m8.f fVarA = this.f133103a.a(th2, enumC17232a).a();
        String strA = fVarA.a();
        if (enumC17232a == EnumC17232a.f162767f && strA != null && strA.contains("JavascriptException")) {
            l.j("a crash");
            return;
        }
        x8.f.a("dtxEventGeneration", "reportCrash, thread: " + thread + ", throwable: " + th2 + ", serverId: " + i10);
        l.f133077g.a(bVar, new y.a() { // from class: g8.m
            @Override // g8.y.a
            public final void a(s7.h hVar) throws JSONException {
                n.c(th2, thread, bVar, jA, hVar);
            }
        });
        o oVar = new o(strA, fVarA.b(), fVarA.c(), bVar, i10, fVarA.d().b(), bVar.o() ^ true);
        l.j("a crash");
        int i11 = bVar.f151065e;
        int i12 = i11 != -1 ? i11 : 1;
        if (!bVar.m()) {
            if (x.f133196b) {
                x8.f.w(f133101c, "Session state changed to inactive while processing crash: abort.");
            }
        } else {
            if (this.f133104b.E(oVar, i10, bVar, i12)) {
                return;
            }
            oVar.D(false);
            l.t(oVar);
        }
    }

    public n(g gVar) {
        this.f133104b = gVar;
    }

    public static /* synthetic */ void c(Throwable th2, Thread thread, n8.b bVar, long j10, s7.h hVar) throws JSONException {
        Object[] objArr = {th2, thread};
        JSONObject jSONObjectA = N7.a.a(th2);
        if (jSONObjectA != null) {
            hVar.b(jSONObjectA, j10, 0L, v8.f.a(bVar), false, objArr);
        }
    }
}
