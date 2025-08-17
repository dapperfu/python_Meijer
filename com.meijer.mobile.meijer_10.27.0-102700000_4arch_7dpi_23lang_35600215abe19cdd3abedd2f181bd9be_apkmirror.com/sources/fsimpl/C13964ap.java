package fsimpl;

import android.content.Context;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.rust.RustInterface;
import java.nio.ByteBuffer;

/* renamed from: fsimpl.ap, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13964ap {

    /* renamed from: a, reason: collision with root package name */
    private final Context f131671a;

    /* renamed from: b, reason: collision with root package name */
    private final C14013ck f131672b;

    /* renamed from: c, reason: collision with root package name */
    private final C14070eo f131673c;

    /* renamed from: d, reason: collision with root package name */
    private final E f131674d;

    /* renamed from: e, reason: collision with root package name */
    private final aB f131675e;

    /* renamed from: f, reason: collision with root package name */
    private final C14115m f131676f;

    /* renamed from: g, reason: collision with root package name */
    private final RustInterface f131677g;

    /* renamed from: h, reason: collision with root package name */
    private final C13968at f131678h;

    /* renamed from: i, reason: collision with root package name */
    private final V f131679i;

    /* renamed from: j, reason: collision with root package name */
    private final WebViewTracker f131680j;

    /* renamed from: k, reason: collision with root package name */
    private final aL f131681k;

    /* renamed from: l, reason: collision with root package name */
    private final bC f131682l;

    /* renamed from: m, reason: collision with root package name */
    private final bA f131683m;

    /* renamed from: n, reason: collision with root package name */
    private final F f131684n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f131685o;

    public C13964ap(Context context, C14013ck c14013ck, C14070eo c14070eo, E e10, aB aBVar, C14115m c14115m, RustInterface rustInterface, C13968at c13968at, V v10, WebViewTracker webViewTracker, aL aLVar, bC bCVar, bA bAVar, F f10, boolean z10) {
        this.f131671a = context;
        this.f131672b = c14013ck;
        this.f131673c = c14070eo;
        this.f131674d = e10;
        this.f131675e = aBVar;
        this.f131676f = c14115m;
        this.f131677g = rustInterface;
        this.f131678h = c13968at;
        this.f131679i = v10;
        this.f131680j = webViewTracker;
        this.f131681k = aLVar;
        this.f131682l = bCVar;
        this.f131683m = bAVar;
        this.f131684n = f10;
        this.f131685o = z10;
    }

    public C13961am a(C13966ar c13966ar, bS bSVar) {
        if (!this.f131672b.b(this.f131671a) || !this.f131683m.a(this.f131671a, this.f131672b)) {
            return null;
        }
        C13989bn c13989bn = new C13989bn();
        C13977bb c13977bb = new C13977bb(new aT());
        aO aOVar = new aO();
        aZ aZVar = new aZ();
        C14060ee c14060ee = new C14060ee(this.f131681k, this.f131682l, this.f131683m, this.f131672b);
        this.f131681k.a(c14060ee);
        C14124v c14124v = new C14124v(this.f131672b, c13966ar, c14060ee);
        C14123u c14123u = new C14123u();
        aG.a();
        G g10 = new G(this.f131672b, this.f131676f, this.f131677g, c14060ee, c14124v);
        N n10 = new N(this.f131677g, g10, c14123u);
        C14064ei c14064ei = new C14064ei(this.f131677g, c13966ar, this.f131673c);
        C13967as c13967as = new C13967as(n10, g10, c14064ei);
        c13967as.a();
        bU bUVar = new bU();
        bV bVVar = new bV(this.f131672b);
        C13984bi c13984bi = new C13984bi();
        dG dGVar = new dG(ByteBuffer.allocate(10240));
        aV aVVar = new aV(new aP(c13966ar, this.f131673c, bUVar, c14064ei, this.f131674d), bVVar, bUVar, c13984bi, bSVar);
        C13981bf c13981bf = new C13981bf(this.f131677g);
        return new C13961am(this.f131677g, c13966ar, this.f131671a, new C13971aw(bUVar, this.f131675e, this.f131680j, c14123u, c14124v, new C13959ak(this.f131672b, bUVar, aOVar, this.f131678h, aZVar, dGVar, bVVar, this.f131685o), c14060ee, c13966ar.u(), c13966ar.v(), this.f131672b, this.f131684n.getFragmentSupport()), c13989bn, c13977bb, aVVar, c13981bf, c13967as, this.f131679i, this.f131680j, c14060ee, this.f131678h, this.f131672b.u());
    }
}
