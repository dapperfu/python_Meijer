package yf;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5515i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import qf.C16649i;
import qf.E;
import qf.F;
import qf.G;
import qf.K;
import qf.b0;
import vf.C17669b;
import yf.g;

/* loaded from: classes8.dex */
public class g implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f171403a;

    /* renamed from: b, reason: collision with root package name */
    private final k f171404b;

    /* renamed from: c, reason: collision with root package name */
    private final h f171405c;

    /* renamed from: d, reason: collision with root package name */
    private final E f171406d;

    /* renamed from: e, reason: collision with root package name */
    private final C18308a f171407e;

    /* renamed from: f, reason: collision with root package name */
    private final l f171408f;

    /* renamed from: g, reason: collision with root package name */
    private final F f171409g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<C18311d> f171410h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<C5517k<C18311d>> f171411i;

    class a implements InterfaceC5515i<Void, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ rf.i f171412a;

        a(rf.i iVar) {
            this.f171412a = iVar;
        }

        @Override // Vd.InterfaceC5515i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5516j<Void> then(Void r52) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f171412a.network.c().submit(new Callable() { // from class: yf.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    g.a aVar = this.f171402a;
                    return g.this.f171408f.a(g.this.f171404b, true);
                }
            }).get();
            if (jSONObject != null) {
                C18311d c18311dB = g.this.f171405c.b(jSONObject);
                g.this.f171407e.c(c18311dB.f171387c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                gVar.r(gVar.f171404b.f171420f);
                g.this.f171410h.set(c18311dB);
                ((C5517k) g.this.f171411i.get()).e(c18311dB);
            }
            return C5519m.f(null);
        }
    }

    private C18311d m(EnumC18312e enumC18312e) throws Throwable {
        C18311d c18311d = null;
        try {
            if (!EnumC18312e.SKIP_CACHE_LOOKUP.equals(enumC18312e)) {
                JSONObject jSONObjectB = this.f171407e.b();
                if (jSONObjectB != null) {
                    C18311d c18311dB = this.f171405c.b(jSONObjectB);
                    if (c18311dB == null) {
                        nf.g.f().e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    q(jSONObjectB, "Loaded cached settings: ");
                    long jA = this.f171406d.a();
                    if (!EnumC18312e.IGNORE_CACHE_EXPIRATION.equals(enumC18312e) && c18311dB.a(jA)) {
                        nf.g.f().i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        nf.g.f().i("Returning cached settings.");
                        return c18311dB;
                    } catch (Exception e10) {
                        e = e10;
                        c18311d = c18311dB;
                        nf.g.f().e("Failed to get cached settings", e);
                        return c18311d;
                    }
                }
                nf.g.f().b("No cached settings data found.");
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    private String n() {
        return C16649i.q(this.f171403a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = C16649i.q(this.f171403a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // yf.j
    public AbstractC5516j<C18311d> a() {
        return this.f171411i.get().a();
    }

    @Override // yf.j
    public C18311d b() {
        return this.f171410h.get();
    }

    public AbstractC5516j<Void> o(rf.i iVar) {
        return p(EnumC18312e.USE_CACHE, iVar);
    }

    g(Context context, k kVar, E e10, h hVar, C18308a c18308a, l lVar, F f10) {
        AtomicReference<C18311d> atomicReference = new AtomicReference<>();
        this.f171410h = atomicReference;
        this.f171411i = new AtomicReference<>(new C5517k());
        this.f171403a = context;
        this.f171404b = kVar;
        this.f171406d = e10;
        this.f171405c = hVar;
        this.f171407e = c18308a;
        this.f171408f = lVar;
        this.f171409g = f10;
        atomicReference.set(C18309b.b(e10));
    }

    public static g l(Context context, String str, K k10, C17669b c17669b, String str2, String str3, wf.g gVar, F f10) {
        String strG = k10.g();
        b0 b0Var = new b0();
        return new g(context, new k(str, k10.h(), k10.i(), k10.j(), k10, C16649i.h(C16649i.m(context), str, str3, str2), str3, str2, G.b(strG).e()), b0Var, new h(b0Var), new C18308a(gVar), new C18310c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c17669b), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        nf.g.f().b(str + jSONObject.toString());
    }

    boolean k() {
        return !n().equals(this.f171404b.f171420f);
    }

    public AbstractC5516j<Void> p(EnumC18312e enumC18312e, rf.i iVar) throws Throwable {
        C18311d c18311dM;
        if (!k() && (c18311dM = m(enumC18312e)) != null) {
            this.f171410h.set(c18311dM);
            this.f171411i.get().e(c18311dM);
            return C5519m.f(null);
        }
        C18311d c18311dM2 = m(EnumC18312e.IGNORE_CACHE_EXPIRATION);
        if (c18311dM2 != null) {
            this.f171410h.set(c18311dM2);
            this.f171411i.get().e(c18311dM2);
        }
        return this.f171409g.k().t(iVar.common, new a(iVar));
    }
}
