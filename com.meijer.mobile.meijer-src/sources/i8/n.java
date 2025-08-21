package i8;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import i8.y;
import o8.InterfaceC16087b;
import org.json.JSONException;
import org.json.JSONObject;
import w7.EnumC17849a;

/* loaded from: classes4.dex */
public class n implements InterfaceC16087b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f137317c = x.f137411a + "CrashReporter";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f137318d = false;

    /* renamed from: a, reason: collision with root package name */
    private final o8.h f137319a = new o8.h();

    /* renamed from: b, reason: collision with root package name */
    protected g f137320b;

    @Override // o8.InterfaceC16087b
    public synchronized void a(String str, String str2, String str3, String str4) {
    }

    @Override // o8.InterfaceC16087b
    public synchronized void b(Thread thread, Throwable th2) {
        try {
            p8.b bVarC = p8.b.c(true);
            int i10 = C14695b.e().f137219c;
            this.f137320b.K();
            if (bVarC.m()) {
                d(thread, th2, bVarC, i10);
            }
            l.w(5000L);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    protected void d(final Thread thread, final Throwable th2, final p8.b bVar, int i10) {
        final long jA = C14693B.a();
        if (x.f137412b) {
            z8.f.x(f137317c, String.format("Processing exception (in thread %s) ...", thread != null ? thread.getName() : zzbz.UNKNOWN_CONTENT_TYPE), th2);
        }
        if (!bVar.f().e(w.f137400q)) {
            l.j("a crash");
            return;
        }
        EnumC17849a enumC17849a = C14695b.e().c().f150760A;
        o8.f fVarA = this.f137319a.a(th2, enumC17849a).a();
        String strA = fVarA.a();
        if (enumC17849a == EnumC17849a.f166976f && strA != null && strA.contains("JavascriptException")) {
            l.j("a crash");
            return;
        }
        z8.f.a("dtxEventGeneration", "reportCrash, thread: " + thread + ", throwable: " + th2 + ", serverId: " + i10);
        l.f137293g.a(bVar, new y.a() { // from class: i8.m
            @Override // i8.y.a
            public final void a(u7.h hVar) throws JSONException {
                n.c(th2, thread, bVar, jA, hVar);
            }
        });
        o oVar = new o(strA, fVarA.b(), fVarA.c(), bVar, i10, fVarA.d().b(), bVar.o() ^ true);
        l.j("a crash");
        int i11 = bVar.f156196e;
        int i12 = i11 != -1 ? i11 : 1;
        if (!bVar.m()) {
            if (x.f137412b) {
                z8.f.w(f137317c, "Session state changed to inactive while processing crash: abort.");
            }
        } else {
            if (this.f137320b.E(oVar, i10, bVar, i12)) {
                return;
            }
            oVar.D(false);
            l.t(oVar);
        }
    }

    public n(g gVar) {
        this.f137320b = gVar;
    }

    public static /* synthetic */ void c(Throwable th2, Thread thread, p8.b bVar, long j10, u7.h hVar) throws JSONException {
        Object[] objArr = {th2, thread};
        JSONObject jSONObjectA = P7.a.a(th2);
        if (jSONObjectA != null) {
            hVar.a(jSONObjectA, j10, 0L, x8.f.a(bVar), false, objArr);
        }
    }
}
