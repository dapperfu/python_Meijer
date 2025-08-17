package Gf;

import Gf.j;
import Td.AbstractC5232j;
import Td.C5235m;
import af.InterfaceC5598a;
import android.content.Context;
import android.util.Base64OutputStream;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.t;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final If.b<p> f11354a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11355b;

    /* renamed from: c, reason: collision with root package name */
    private final If.b<cg.i> f11356c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<g> f11357d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f11358e;

    private f(final Context context, final String str, Set<g> set, If.b<cg.i> bVar, Executor executor) {
        this(new t(new If.b() { // from class: Gf.e
            @Override // If.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                p pVar = fVar.f11354a.get();
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
            fVar.f11354a.get().o(System.currentTimeMillis(), fVar.f11356c.get().a());
        }
        return null;
    }

    @Override // Gf.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVar = this.f11354a.get();
        if (!pVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        pVar.k();
        return j.a.GLOBAL;
    }

    f(If.b<p> bVar, Set<g> set, Executor executor, If.b<cg.i> bVar2, Context context) {
        this.f11354a = bVar;
        this.f11357d = set;
        this.f11358e = executor;
        this.f11356c = bVar2;
        this.f11355b = context;
    }

    public static /* synthetic */ p d(Context context, String str) {
        return new p(context, str);
    }

    public static /* synthetic */ f e(C6241A c6241a, InterfaceC6246d interfaceC6246d) {
        return new f((Context) interfaceC6246d.a(Context.class), ((com.google.firebase.f) interfaceC6246d.a(com.google.firebase.f.class)).o(), (Set<g>) interfaceC6246d.d(g.class), (If.b<cg.i>) interfaceC6246d.f(cg.i.class), (Executor) interfaceC6246d.c(c6241a));
    }

    public static C6245c<f> g() {
        final C6241A c6241aA = C6241A.a(InterfaceC5598a.class, Executor.class);
        return C6245c.f(f.class, i.class, j.class).b(bf.q.l(Context.class)).b(bf.q.l(com.google.firebase.f.class)).b(bf.q.o(g.class)).b(bf.q.n(cg.i.class)).b(bf.q.k(c6241aA)).f(new bf.g() { // from class: Gf.d
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return f.e(c6241aA, interfaceC6246d);
            }
        }).d();
    }

    @Override // Gf.i
    public AbstractC5232j<String> a() {
        return !j2.o.a(this.f11355b) ? C5235m.f("") : C5235m.c(this.f11358e, new Callable() { // from class: Gf.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f11350a);
            }
        });
    }

    public AbstractC5232j<Void> h() {
        return this.f11357d.size() <= 0 ? C5235m.f(null) : !j2.o.a(this.f11355b) ? C5235m.f(null) : C5235m.c(this.f11358e, new Callable() { // from class: Gf.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.f(this.f11349a);
            }
        });
    }
}
