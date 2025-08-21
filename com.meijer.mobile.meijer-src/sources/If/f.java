package If;

import If.j;
import Vd.AbstractC5516j;
import Vd.C5519m;
import android.content.Context;
import android.util.Base64OutputStream;
import cf.InterfaceC6504a;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.t;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final Kf.b<p> f14453a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14454b;

    /* renamed from: c, reason: collision with root package name */
    private final Kf.b<eg.i> f14455c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<g> f14456d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f14457e;

    private f(final Context context, final String str, Set<g> set, Kf.b<eg.i> bVar, Executor executor) {
        this(new t(new Kf.b() { // from class: If.e
            @Override // Kf.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                p pVar = fVar.f14453a.get();
                List<q> listG = pVar.g();
                pVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    q qVar = listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", qVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) qVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            fVar.f14453a.get().o(System.currentTimeMillis(), fVar.f14455c.get().a());
        }
        return null;
    }

    @Override // If.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVar = this.f14453a.get();
        if (!pVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        pVar.k();
        return j.a.GLOBAL;
    }

    f(Kf.b<p> bVar, Set<g> set, Executor executor, Kf.b<eg.i> bVar2, Context context) {
        this.f14453a = bVar;
        this.f14456d = set;
        this.f14457e = executor;
        this.f14455c = bVar2;
        this.f14454b = context;
    }

    public static /* synthetic */ p d(Context context, String str) {
        return new p(context, str);
    }

    public static /* synthetic */ f e(C13672A c13672a, InterfaceC13677d interfaceC13677d) {
        return new f((Context) interfaceC13677d.a(Context.class), ((com.google.firebase.f) interfaceC13677d.a(com.google.firebase.f.class)).o(), (Set<g>) interfaceC13677d.b(g.class), (Kf.b<eg.i>) interfaceC13677d.g(eg.i.class), (Executor) interfaceC13677d.c(c13672a));
    }

    public static C13676c<f> g() {
        final C13672A c13672aA = C13672A.a(InterfaceC6504a.class, Executor.class);
        return C13676c.f(f.class, i.class, j.class).b(df.q.l(Context.class)).b(df.q.l(com.google.firebase.f.class)).b(df.q.o(g.class)).b(df.q.n(eg.i.class)).b(df.q.k(c13672aA)).f(new df.g() { // from class: If.d
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return f.e(c13672aA, interfaceC13677d);
            }
        }).d();
    }

    @Override // If.i
    public AbstractC5516j<String> a() {
        return !j2.o.a(this.f14454b) ? C5519m.f("") : C5519m.c(this.f14457e, new Callable() { // from class: If.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f14449a);
            }
        });
    }

    public AbstractC5516j<Void> h() {
        return this.f14456d.size() <= 0 ? C5519m.f(null) : !j2.o.a(this.f14454b) ? C5519m.f(null) : C5519m.c(this.f14457e, new Callable() { // from class: If.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f14448a);
            }
        });
    }
}
