package fsimpl;

import android.content.Context;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.rust.RustInterface;
import java.nio.ByteBuffer;

/* renamed from: fsimpl.ap, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14089ap {

    /* renamed from: a, reason: collision with root package name */
    private final Context f132921a;

    /* renamed from: b, reason: collision with root package name */
    private final C14138ck f132922b;

    /* renamed from: c, reason: collision with root package name */
    private final C14195eo f132923c;

    /* renamed from: d, reason: collision with root package name */
    private final E f132924d;

    /* renamed from: e, reason: collision with root package name */
    private final aB f132925e;

    /* renamed from: f, reason: collision with root package name */
    private final C14240m f132926f;

    /* renamed from: g, reason: collision with root package name */
    private final RustInterface f132927g;

    /* renamed from: h, reason: collision with root package name */
    private final C14093at f132928h;

    /* renamed from: i, reason: collision with root package name */
    private final V f132929i;

    /* renamed from: j, reason: collision with root package name */
    private final WebViewTracker f132930j;

    /* renamed from: k, reason: collision with root package name */
    private final aL f132931k;

    /* renamed from: l, reason: collision with root package name */
    private final bC f132932l;

    /* renamed from: m, reason: collision with root package name */
    private final bA f132933m;

    /* renamed from: n, reason: collision with root package name */
    private final F f132934n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f132935o;

    public C14089ap(Context context, C14138ck c14138ck, C14195eo c14195eo, E e10, aB aBVar, C14240m c14240m, RustInterface rustInterface, C14093at c14093at, V v10, WebViewTracker webViewTracker, aL aLVar, bC bCVar, bA bAVar, F f10, boolean z10) {
        this.f132921a = context;
        this.f132922b = c14138ck;
        this.f132923c = c14195eo;
        this.f132924d = e10;
        this.f132925e = aBVar;
        this.f132926f = c14240m;
        this.f132927g = rustInterface;
        this.f132928h = c14093at;
        this.f132929i = v10;
        this.f132930j = webViewTracker;
        this.f132931k = aLVar;
        this.f132932l = bCVar;
        this.f132933m = bAVar;
        this.f132934n = f10;
        this.f132935o = z10;
    }

    public C14086am a(C14091ar c14091ar, bS bSVar) {
        if (!this.f132922b.b(this.f132921a) || !this.f132933m.a(this.f132921a, this.f132922b)) {
            return null;
        }
        C14114bn c14114bn = new C14114bn();
        C14102bb c14102bb = new C14102bb(new aT());
        aO aOVar = new aO();
        aZ aZVar = new aZ();
        C14185ee c14185ee = new C14185ee(this.f132931k, this.f132932l, this.f132933m, this.f132922b);
        this.f132931k.a(c14185ee);
        C14249v c14249v = new C14249v(this.f132922b, c14091ar, c14185ee);
        C14248u c14248u = new C14248u();
        aG.a();
        G g10 = new G(this.f132922b, this.f132926f, this.f132927g, c14185ee, c14249v);
        N n10 = new N(this.f132927g, g10, c14248u);
        C14189ei c14189ei = new C14189ei(this.f132927g, c14091ar, this.f132923c);
        C14092as c14092as = new C14092as(n10, g10, c14189ei);
        c14092as.a();
        bU bUVar = new bU();
        bV bVVar = new bV(this.f132922b);
        C14109bi c14109bi = new C14109bi();
        dG dGVar = new dG(ByteBuffer.allocate(10240));
        aV aVVar = new aV(new aP(c14091ar, this.f132923c, bUVar, c14189ei, this.f132924d), bVVar, bUVar, c14109bi, bSVar);
        C14106bf c14106bf = new C14106bf(this.f132927g);
        return new C14086am(this.f132927g, c14091ar, this.f132921a, new C14096aw(bUVar, this.f132925e, this.f132930j, c14248u, c14249v, new C14084ak(this.f132922b, bUVar, aOVar, this.f132928h, aZVar, dGVar, bVVar, this.f132935o), c14185ee, c14091ar.u(), c14091ar.v(), this.f132922b, this.f132934n.getFragmentSupport()), c14114bn, c14102bb, aVVar, c14106bf, c14092as, this.f132929i, this.f132930j, c14185ee, this.f132928h, this.f132922b.u());
    }
}
