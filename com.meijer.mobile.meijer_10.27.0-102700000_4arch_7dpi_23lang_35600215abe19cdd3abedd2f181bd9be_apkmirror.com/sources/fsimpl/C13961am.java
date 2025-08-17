package fsimpl;

import android.content.Context;
import com.fullstory.instrumentation.webview.WebViewTracker;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: fsimpl.am, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13961am implements InterfaceC14086fd {

    /* renamed from: a, reason: collision with root package name */
    private final C13966ar f131638a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f131639b;

    /* renamed from: c, reason: collision with root package name */
    private final C13971aw f131640c;

    /* renamed from: d, reason: collision with root package name */
    private final C13989bn f131641d;

    /* renamed from: e, reason: collision with root package name */
    private final C13977bb f131642e;

    /* renamed from: f, reason: collision with root package name */
    private final aV f131643f;

    /* renamed from: g, reason: collision with root package name */
    private C13981bf f131644g;

    /* renamed from: h, reason: collision with root package name */
    private final C13967as f131645h;

    /* renamed from: i, reason: collision with root package name */
    private final V f131646i;

    /* renamed from: j, reason: collision with root package name */
    private final WebViewTracker f131647j;

    /* renamed from: k, reason: collision with root package name */
    private final RustInterface f131648k;

    /* renamed from: l, reason: collision with root package name */
    private final C14060ee f131649l;

    /* renamed from: m, reason: collision with root package name */
    private final C13968at f131650m;

    /* renamed from: n, reason: collision with root package name */
    private final int f131651n;

    /* renamed from: o, reason: collision with root package name */
    private C13963ao f131652o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f131653p;

    /* renamed from: q, reason: collision with root package name */
    private int f131654q = 0;

    public C13961am(RustInterface rustInterface, C13966ar c13966ar, Context context, C13971aw c13971aw, C13989bn c13989bn, C13977bb c13977bb, aV aVVar, C13981bf c13981bf, C13967as c13967as, V v10, WebViewTracker webViewTracker, C14060ee c14060ee, C13968at c13968at, int i10) {
        this.f131648k = rustInterface;
        this.f131638a = c13966ar;
        this.f131639b = context;
        this.f131640c = c13971aw;
        this.f131641d = c13989bn;
        this.f131642e = c13977bb;
        this.f131643f = aVVar;
        this.f131644g = c13981bf;
        this.f131645h = c13967as;
        this.f131646i = v10;
        this.f131647j = webViewTracker;
        this.f131649l = c14060ee;
        this.f131650m = c13968at;
        this.f131651n = i10;
    }

    private int a(C13963ao c13963ao, int i10, int i11, final gh ghVar, long j10, long j11) throws Throwable {
        Map mapA = c13963ao.f131662b.a();
        Map mapA2 = c13963ao.f131663c.a();
        Map mapA3 = c13963ao.f131667g.a();
        Map mapA4 = c13963ao.f131668h.a();
        final Map mapA5 = c13963ao.f131664d.a();
        Map mapA6 = c13963ao.f131665e.a();
        int iB = c13963ao.f131666f.b();
        List listA = c13963ao.f131666f.a();
        int iA = this.f131643f.a(mapA, mapA2, mapA3, mapA4, c13963ao.f131669i.a(), c13963ao.f131670j.a(), ghVar);
        final int[] iArr = new int[1];
        this.f131640c.a().b(new Runnable() { // from class: fsimpl.am$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(iArr, mapA5, ghVar);
            }
        });
        int iA2 = this.f131642e.a(mapA6, ghVar);
        this.f131644g.a(listA, iB);
        C14048dt.a(ghVar);
        C14048dt.a(ghVar, j10);
        C14048dt.b(ghVar, iA);
        C14048dt.c(ghVar, iArr[0]);
        C14048dt.d(ghVar, iA2);
        C14048dt.a(ghVar, i10);
        C14048dt.e(ghVar, i11);
        C14048dt.b(ghVar, j11);
        return C14048dt.b(ghVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j10, long j11) {
        Log.w("Shutting down due to low memory.");
        this.f131648k.a(j10, j11);
        this.f131648k.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int[] iArr, Map map, gh ghVar) {
        iArr[0] = this.f131641d.a(map, ghVar);
    }

    private void c(boolean z10) {
        if (z10) {
            this.f131654q = 0;
        }
        if (this.f131654q == 0) {
            final long jA = fR.a();
            final long jA2 = fR.a(jA);
            if (fR.a(jA2, jA) < this.f131651n) {
                fZ.c(new Runnable() { // from class: fsimpl.am$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(jA2, jA);
                    }
                });
            }
        }
        int i10 = this.f131654q + 1;
        this.f131654q = i10;
        if (i10 > 9) {
            this.f131654q = 0;
        }
    }

    private void d() {
        this.f131649l.a();
    }

    @Override // fsimpl.InterfaceC14086fd
    public int a(int i10, Object obj) {
        return a((ByteBuffer) obj, EnumC13962an.values()[i10]);
    }

    public int a(ByteBuffer byteBuffer, EnumC13962an enumC13962an) {
        boolean z10;
        try {
            synchronized (this) {
                if (this.f131653p) {
                    return -1;
                }
                int iB = this.f131646i.b();
                if (enumC13962an == EnumC13962an.First || enumC13962an == EnumC13962an.Keyframe) {
                    this.f131652o = new C13963ao(this.f131648k);
                    z10 = true;
                } else {
                    z10 = false;
                }
                C13963ao c13963ao = this.f131652o;
                if (c13963ao == null) {
                    return -1;
                }
                gh ghVar = new gh(byteBuffer);
                long[] jArr = new long[1];
                Throwable[] thArr = new Throwable[1];
                c(z10);
                this.f131650m.a(this.f131639b.getResources());
                int iA = this.f131640c.a(this.f131638a, ghVar, c13963ao, this.f131639b, false, true, z10, iB, thArr, jArr);
                Throwable th2 = thArr[0];
                if (th2 != null) {
                    C14107fy.a(th2);
                }
                if (iA == -1) {
                    return -1;
                }
                ghVar.h(a(c13963ao, iA, this.f131640c.a(ghVar), ghVar, jArr[0], this.f131640c.j()));
                return byteBuffer.position();
            }
        } catch (Throwable th3) {
            Log.e("Unexpected error scanning view hierarchy (mode=" + enumC13962an + ")", th3);
            C14107fy.a(th3);
            return -1;
        }
    }

    @Override // fsimpl.InterfaceC14086fd
    public String a() {
        if (this.f131653p) {
            return null;
        }
        return this.f131638a.w();
    }

    @Override // fsimpl.InterfaceC14086fd
    public String a(boolean z10) {
        if (this.f131653p) {
            return null;
        }
        return this.f131638a.i(z10);
    }

    @Override // fsimpl.InterfaceC14086fd
    public C13966ar b() {
        if (this.f131653p) {
            return null;
        }
        return this.f131638a;
    }

    @Override // fsimpl.InterfaceC14086fd
    public void b(boolean z10) {
        C13966ar c13966ar = this.f131638a;
        if (c13966ar == null || c13966ar.e() == z10) {
            return;
        }
        this.f131638a.b(z10);
        d();
        this.f131647j.a(z10);
    }

    @Override // fsimpl.InterfaceC14086fd
    public void c() {
        this.f131640c.a().a();
        synchronized (this) {
            this.f131647j.a();
            this.f131653p = true;
            this.f131652o = null;
            this.f131645h.b();
        }
    }
}
