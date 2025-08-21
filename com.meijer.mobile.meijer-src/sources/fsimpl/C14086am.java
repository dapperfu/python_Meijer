package fsimpl;

import android.content.Context;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: fsimpl.am, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14086am implements InterfaceC14211fd {

    /* renamed from: a, reason: collision with root package name */
    private final C14091ar f132888a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f132889b;

    /* renamed from: c, reason: collision with root package name */
    private final C14096aw f132890c;

    /* renamed from: d, reason: collision with root package name */
    private final C14114bn f132891d;

    /* renamed from: e, reason: collision with root package name */
    private final C14102bb f132892e;

    /* renamed from: f, reason: collision with root package name */
    private final aV f132893f;

    /* renamed from: g, reason: collision with root package name */
    private C14106bf f132894g;

    /* renamed from: h, reason: collision with root package name */
    private final C14092as f132895h;

    /* renamed from: i, reason: collision with root package name */
    private final V f132896i;

    /* renamed from: j, reason: collision with root package name */
    private final WebViewTracker f132897j;

    /* renamed from: k, reason: collision with root package name */
    private final RustInterface f132898k;

    /* renamed from: l, reason: collision with root package name */
    private final C14185ee f132899l;

    /* renamed from: m, reason: collision with root package name */
    private final C14093at f132900m;

    /* renamed from: n, reason: collision with root package name */
    private final int f132901n;

    /* renamed from: o, reason: collision with root package name */
    private C14088ao f132902o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f132903p;

    /* renamed from: q, reason: collision with root package name */
    private int f132904q = 0;

    public C14086am(RustInterface rustInterface, C14091ar c14091ar, Context context, C14096aw c14096aw, C14114bn c14114bn, C14102bb c14102bb, aV aVVar, C14106bf c14106bf, C14092as c14092as, V v10, WebViewTracker webViewTracker, C14185ee c14185ee, C14093at c14093at, int i10) {
        this.f132898k = rustInterface;
        this.f132888a = c14091ar;
        this.f132889b = context;
        this.f132890c = c14096aw;
        this.f132891d = c14114bn;
        this.f132892e = c14102bb;
        this.f132893f = aVVar;
        this.f132894g = c14106bf;
        this.f132895h = c14092as;
        this.f132896i = v10;
        this.f132897j = webViewTracker;
        this.f132899l = c14185ee;
        this.f132900m = c14093at;
        this.f132901n = i10;
    }

    private int a(C14088ao c14088ao, int i10, int i11, final gh ghVar, long j10, long j11) throws Throwable {
        Map mapA = c14088ao.f132912b.a();
        Map mapA2 = c14088ao.f132913c.a();
        Map mapA3 = c14088ao.f132917g.a();
        Map mapA4 = c14088ao.f132918h.a();
        final Map mapA5 = c14088ao.f132914d.a();
        Map mapA6 = c14088ao.f132915e.a();
        int iB = c14088ao.f132916f.b();
        List listA = c14088ao.f132916f.a();
        int iA = this.f132893f.a(mapA, mapA2, mapA3, mapA4, c14088ao.f132919i.a(), c14088ao.f132920j.a(), ghVar);
        final int[] iArr = new int[1];
        this.f132890c.a().b(new Runnable() { // from class: fsimpl.am$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(iArr, mapA5, ghVar);
            }
        });
        int iA2 = this.f132892e.a(mapA6, ghVar);
        this.f132894g.a(listA, iB);
        C14173dt.a(ghVar);
        C14173dt.a(ghVar, j10);
        C14173dt.b(ghVar, iA);
        C14173dt.c(ghVar, iArr[0]);
        C14173dt.d(ghVar, iA2);
        C14173dt.a(ghVar, i10);
        C14173dt.e(ghVar, i11);
        C14173dt.b(ghVar, j11);
        return C14173dt.b(ghVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, long j11) {
        Log.w("Shutting down due to low memory.");
        this.f132898k.a(j10, j11);
        this.f132898k.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int[] iArr, Map map, gh ghVar) {
        iArr[0] = this.f132891d.a(map, ghVar);
    }

    private void c(boolean z10) {
        if (z10) {
            this.f132904q = 0;
        }
        if (this.f132904q == 0) {
            final long jA = fR.a();
            final long jA2 = fR.a(jA);
            if (fR.a(jA2, jA) < this.f132901n) {
                fZ.c(new Runnable() { // from class: fsimpl.am$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(jA2, jA);
                    }
                });
            }
        }
        int i10 = this.f132904q + 1;
        this.f132904q = i10;
        if (i10 > 9) {
            this.f132904q = 0;
        }
    }

    private void d() {
        this.f132899l.a();
    }

    @Override // fsimpl.InterfaceC14211fd
    public int a(int i10, Object obj) {
        return a((ByteBuffer) obj, EnumC14087an.values()[i10]);
    }

    public int a(ByteBuffer byteBuffer, EnumC14087an enumC14087an) {
        boolean z10;
        try {
            synchronized (this) {
                if (this.f132903p) {
                    return -1;
                }
                int iB = this.f132896i.b();
                if (enumC14087an == EnumC14087an.First || enumC14087an == EnumC14087an.Keyframe) {
                    this.f132902o = new C14088ao(this.f132898k);
                    z10 = true;
                } else {
                    z10 = false;
                }
                C14088ao c14088ao = this.f132902o;
                if (c14088ao == null) {
                    return -1;
                }
                gh ghVar = new gh(byteBuffer);
                long[] jArr = new long[1];
                Throwable[] thArr = new Throwable[1];
                c(z10);
                this.f132900m.a(this.f132889b.getResources());
                int iA = this.f132890c.a(this.f132888a, ghVar, c14088ao, this.f132889b, false, true, z10, iB, thArr, jArr);
                Throwable th2 = thArr[0];
                if (th2 != null) {
                    C14232fy.a(th2);
                }
                if (iA == -1) {
                    return -1;
                }
                ghVar.h(a(c14088ao, iA, this.f132890c.a(ghVar), ghVar, jArr[0], this.f132890c.j()));
                return byteBuffer.position();
            }
        } catch (Throwable th3) {
            Log.e("Unexpected error scanning view hierarchy (mode=" + enumC14087an + ")", th3);
            C14232fy.a(th3);
            return -1;
        }
    }

    @Override // fsimpl.InterfaceC14211fd
    public String a() {
        if (this.f132903p) {
            return null;
        }
        return this.f132888a.w();
    }

    @Override // fsimpl.InterfaceC14211fd
    public String a(boolean z10) {
        if (this.f132903p) {
            return null;
        }
        return this.f132888a.i(z10);
    }

    @Override // fsimpl.InterfaceC14211fd
    public C14091ar b() {
        if (this.f132903p) {
            return null;
        }
        return this.f132888a;
    }

    @Override // fsimpl.InterfaceC14211fd
    public void b(boolean z10) {
        C14091ar c14091ar = this.f132888a;
        if (c14091ar == null || c14091ar.e() == z10) {
            return;
        }
        this.f132888a.b(z10);
        d();
        this.f132897j.a(z10);
    }

    @Override // fsimpl.InterfaceC14211fd
    public void c() {
        this.f132890c.a().a();
        synchronized (this) {
            this.f132897j.a();
            this.f132903p = true;
            this.f132902o = null;
            this.f132895h.b();
        }
    }
}
