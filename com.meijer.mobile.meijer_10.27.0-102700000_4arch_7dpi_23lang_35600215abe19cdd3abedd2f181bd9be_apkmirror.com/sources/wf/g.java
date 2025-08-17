package wf;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5231i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import of.C16041i;
import of.E;
import of.F;
import of.G;
import of.K;
import of.b0;
import org.json.JSONObject;
import tf.C17094b;
import wf.g;

/* loaded from: classes7.dex */
public class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f166081a;

    /* renamed from: b, reason: collision with root package name */
    private final k f166082b;

    /* renamed from: c, reason: collision with root package name */
    private final h f166083c;

    /* renamed from: d, reason: collision with root package name */
    private final E f166084d;

    /* renamed from: e, reason: collision with root package name */
    private final C17815a f166085e;

    /* renamed from: f, reason: collision with root package name */
    private final l f166086f;

    /* renamed from: g, reason: collision with root package name */
    private final F f166087g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<C17818d> f166088h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<C5233k<C17818d>> f166089i;

    class a implements InterfaceC5231i<Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pf.i f166090a;

        a(pf.i iVar) {
            this.f166090a = iVar;
        }

        @Override // Td.InterfaceC5231i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5232j<Void> then(Void r52) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f166090a.network.c().submit(new Callable() { // from class: wf.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f166080a;
                    return g.this.f166086f.a(g.this.f166082b, true);
                }
            }).get();
            if (jSONObject != null) {
                C17818d c17818dB = g.this.f166083c.b(jSONObject);
                g.this.f166085e.c(c17818dB.f166065c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f166082b.f166098f);
                g.this.f166088h.set(c17818dB);
                ((C5233k) g.this.f166089i.get()).e(c17818dB);
            }
            return C5235m.f(null);
        }
    }

    private C17818d m(EnumC17819e enumC17819e) throws Throwable {
        C17818d c17818d = null;
        try {
            if (!EnumC17819e.SKIP_CACHE_LOOKUP.equals(enumC17819e)) {
                JSONObject jSONObjectB = this.f166085e.b();
                if (jSONObjectB != null) {
                    C17818d c17818dB = this.f166083c.b(jSONObjectB);
                    if (c17818dB == null) {
                        lf.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long jA = this.f166084d.a();
                    if (!EnumC17819e.IGNORE_CACHE_EXPIRATION.equals(enumC17819e) && c17818dB.a(jA)) {
                        lf.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        lf.g.f().i("Returning cached settings.");
                        return c17818dB;
                    } catch (Exception e10) {
                        e = e10;
                        c17818d = c17818dB;
                        lf.g.f().e("Failed to get cached settings", e);
                        return c17818d;
                    }
                }
                lf.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private String n() {
        return C16041i.q(this.f166081a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = C16041i.q(this.f166081a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // wf.j
    public AbstractC5232j<C17818d> a() {
        return this.f166089i.get().a();
    }

    @Override // wf.j
    public C17818d b() {
        return this.f166088h.get();
    }

    public AbstractC5232j<Void> o(pf.i iVar) {
        return p(EnumC17819e.USE_CACHE, iVar);
    }

    g(Context context, k kVar, E e10, h hVar, C17815a c17815a, l lVar, F f10) {
        AtomicReference<C17818d> atomicReference = new AtomicReference<>();
        this.f166088h = atomicReference;
        this.f166089i = new AtomicReference<>(new C5233k());
        this.f166081a = context;
        this.f166082b = kVar;
        this.f166084d = e10;
        this.f166083c = hVar;
        this.f166085e = c17815a;
        this.f166086f = lVar;
        this.f166087g = f10;
        atomicReference.set(C17816b.b(e10));
    }

    public static g l(Context context, String str, K k10, C17094b c17094b, String str2, String str3, uf.g gVar, F f10) {
        String strG = k10.g();
        b0 b0Var = new b0();
        return new g(context, new k(str, k10.h(), k10.i(), k10.j(), k10, C16041i.h(C16041i.m(context), str, str3, str2), str3, str2, G.b(strG).e()), b0Var, new h(b0Var), new C17815a(gVar), new C17817c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c17094b), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        lf.g.f().b(str + jSONObject.toString());
    }

    boolean k() {
        return !n().equals(this.f166082b.f166098f);
    }

    public AbstractC5232j<Void> p(EnumC17819e enumC17819e, pf.i iVar) throws Throwable {
        C17818d c17818dM;
        if (!k() && (c17818dM = m(enumC17819e)) != null) {
            this.f166088h.set(c17818dM);
            this.f166089i.get().e(c17818dM);
            return C5235m.f(null);
        }
        C17818d c17818dM2 = m(EnumC17819e.IGNORE_CACHE_EXPIRATION);
        if (c17818dM2 != null) {
            this.f166088h.set(c17818dM2);
            this.f166089i.get().e(c17818dM2);
        }
        return this.f166087g.k().t(iVar.common, new a(iVar));
    }
}
