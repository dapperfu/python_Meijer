package Gd;

import Vd.AbstractC5516j;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C6658o;
import com.google.android.gms.dynamite.DynamiteModule;
import j2.C14925e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ug.C17405c;
import ug.C17409g;
import ug.C17416n;

/* renamed from: Gd.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3782x5 {

    /* renamed from: k, reason: collision with root package name */
    private static N5 f12450k;

    /* renamed from: l, reason: collision with root package name */
    private static final P5 f12451l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f12452a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12453b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3734q5 f12454c;

    /* renamed from: d, reason: collision with root package name */
    private final C17416n f12455d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5516j f12456e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5516j f12457f;

    /* renamed from: g, reason: collision with root package name */
    private final String f12458g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12459h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f12460i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f12461j = new HashMap();

    private static synchronized N5 d() {
        try {
            N5 n52 = f12450k;
            if (n52 != null) {
                return n52;
            }
            j2.i iVarA = C14925e.a(Resources.getSystem().getConfiguration());
            C3713n5 c3713n5 = new C3713n5();
            for (int i10 = 0; i10 < iVarA.f(); i10++) {
                c3713n5.c(C17405c.b(iVarA.c(i10)));
            }
            N5 n5D = c3713n5.d();
            f12450k = n5D;
            return n5D;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C3782x5(Context context, final C17416n c17416n, InterfaceC3734q5 interfaceC3734q5, String str) {
        int iC;
        this.f12452a = context.getPackageName();
        this.f12453b = C17405c.a(context);
        this.f12455d = c17416n;
        this.f12454c = interfaceC3734q5;
        K5.a();
        this.f12458g = str;
        this.f12456e = C17409g.a().b(new Callable() { // from class: Gd.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12374a.a();
            }
        });
        C17409g c17409gA = C17409g.a();
        c17416n.getClass();
        this.f12457f = c17409gA.b(new Callable() { // from class: Gd.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c17416n.a();
            }
        });
        P5 p52 = f12451l;
        if (p52.containsKey(str)) {
            iC = DynamiteModule.c(context, (String) p52.get(str));
        } else {
            iC = -1;
        }
        this.f12459h = iC;
    }

    final /* synthetic */ String a() throws Exception {
        return C6658o.a().b(this.f12458g);
    }

    final /* synthetic */ void b(InterfaceC3727p5 interfaceC3727p5, F3 f32, String str) {
        String strA;
        interfaceC3727p5.c(f32);
        String strZzc = interfaceC3727p5.zzc();
        K4 k42 = new K4();
        k42.b(this.f12452a);
        k42.c(this.f12453b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(strZzc);
        k42.j(str);
        if (this.f12457f.r()) {
            strA = (String) this.f12457f.n();
        } else {
            strA = this.f12455d.a();
        }
        k42.i(strA);
        k42.d(10);
        k42.k(Integer.valueOf(this.f12459h));
        interfaceC3727p5.b(k42);
        this.f12454c.a(interfaceC3727p5);
    }

    public final void c(H5 h52, final F3 f32) {
        EnumC3745s3 enumC3745s3;
        EnumC3787y3 enumC3787y3;
        final String strB;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12460i.get(f32) != null && jElapsedRealtime - ((Long) this.f12460i.get(f32)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f12460i.put(f32, Long.valueOf(jElapsedRealtime));
        int i10 = h52.f11699a;
        int i11 = h52.f11700b;
        int i12 = h52.f11701c;
        int i13 = h52.f11702d;
        int i14 = h52.f11703e;
        long j10 = h52.f11704f;
        int i15 = h52.f11705g;
        C3780x3 c3780x3 = new C3780x3();
        if (i10 != -1) {
            if (i10 != 35) {
                if (i10 != 842094169) {
                    if (i10 != 16) {
                        if (i10 != 17) {
                            enumC3745s3 = EnumC3745s3.UNKNOWN_FORMAT;
                        } else {
                            enumC3745s3 = EnumC3745s3.NV21;
                        }
                    } else {
                        enumC3745s3 = EnumC3745s3.NV16;
                    }
                } else {
                    enumC3745s3 = EnumC3745s3.YV12;
                }
            } else {
                enumC3745s3 = EnumC3745s3.YUV_420_888;
            }
        } else {
            enumC3745s3 = EnumC3745s3.BITMAP;
        }
        c3780x3.d(enumC3745s3);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        enumC3787y3 = EnumC3787y3.ANDROID_MEDIA_IMAGE;
                    } else {
                        enumC3787y3 = EnumC3787y3.FILEPATH;
                    }
                } else {
                    enumC3787y3 = EnumC3787y3.BYTEBUFFER;
                }
            } else {
                enumC3787y3 = EnumC3787y3.BYTEARRAY;
            }
        } else {
            enumC3787y3 = EnumC3787y3.BITMAP;
        }
        c3780x3.f(enumC3787y3);
        c3780x3.c(Integer.valueOf(i12));
        c3780x3.e(Integer.valueOf(i13));
        c3780x3.g(Integer.valueOf(i14));
        c3780x3.b(Long.valueOf(j10));
        c3780x3.h(Integer.valueOf(i15));
        A3 a3J = c3780x3.j();
        G3 g32 = new G3();
        g32.d(a3J);
        final InterfaceC3727p5 interfaceC3727p5D = y5.d(g32);
        if (this.f12456e.r()) {
            strB = (String) this.f12456e.n();
        } else {
            strB = C6658o.a().b(this.f12458g);
        }
        C17409g.d().execute(new Runnable() { // from class: Gd.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f12415a.b(interfaceC3727p5D, f32, strB);
            }
        });
    }
}
