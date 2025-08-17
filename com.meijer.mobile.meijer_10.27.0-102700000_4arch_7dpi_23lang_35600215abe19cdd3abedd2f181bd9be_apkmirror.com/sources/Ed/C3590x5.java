package Ed;

import Td.AbstractC5232j;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C6533o;
import com.google.android.gms.dynamite.DynamiteModule;
import j2.C14837e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import sg.C16958c;
import sg.C16962g;
import sg.C16969n;

/* renamed from: Ed.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3590x5 {

    /* renamed from: k, reason: collision with root package name */
    private static N5 f8898k;

    /* renamed from: l, reason: collision with root package name */
    private static final P5 f8899l = P5.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f8900a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8901b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3542q5 f8902c;

    /* renamed from: d, reason: collision with root package name */
    private final C16969n f8903d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5232j f8904e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5232j f8905f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8906g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8907h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f8908i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f8909j = new HashMap();

    private static synchronized N5 d() {
        try {
            N5 n52 = f8898k;
            if (n52 != null) {
                return n52;
            }
            j2.i iVarA = C14837e.a(Resources.getSystem().getConfiguration());
            C3521n5 c3521n5 = new C3521n5();
            for (int i10 = 0; i10 < iVarA.f(); i10++) {
                c3521n5.c(C16958c.b(iVarA.c(i10)));
            }
            N5 n5D = c3521n5.d();
            f8898k = n5D;
            return n5D;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C3590x5(Context context, final C16969n c16969n, InterfaceC3542q5 interfaceC3542q5, String str) {
        int iC;
        this.f8900a = context.getPackageName();
        this.f8901b = C16958c.a(context);
        this.f8903d = c16969n;
        this.f8902c = interfaceC3542q5;
        K5.a();
        this.f8906g = str;
        this.f8904e = C16962g.a().b(new Callable() { // from class: Ed.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8822a.a();
            }
        });
        C16962g c16962gA = C16962g.a();
        c16969n.getClass();
        this.f8905f = c16962gA.b(new Callable() { // from class: Ed.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c16969n.a();
            }
        });
        P5 p52 = f8899l;
        if (p52.containsKey(str)) {
            iC = DynamiteModule.c(context, (String) p52.get(str));
        } else {
            iC = -1;
        }
        this.f8907h = iC;
    }

    final /* synthetic */ String a() throws Exception {
        return C6533o.a().b(this.f8906g);
    }

    final /* synthetic */ void b(InterfaceC3535p5 interfaceC3535p5, F3 f32, String str) {
        String strA;
        interfaceC3535p5.a(f32);
        String strZzc = interfaceC3535p5.zzc();
        K4 k42 = new K4();
        k42.b(this.f8900a);
        k42.c(this.f8901b);
        k42.h(d());
        k42.g(Boolean.TRUE);
        k42.l(strZzc);
        k42.j(str);
        if (this.f8905f.r()) {
            strA = (String) this.f8905f.n();
        } else {
            strA = this.f8903d.a();
        }
        k42.i(strA);
        k42.d(10);
        k42.k(Integer.valueOf(this.f8907h));
        interfaceC3535p5.b(k42);
        this.f8902c.a(interfaceC3535p5);
    }

    public final void c(H5 h52, final F3 f32) {
        EnumC3553s3 enumC3553s3;
        EnumC3595y3 enumC3595y3;
        final String strB;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8908i.get(f32) != null && jElapsedRealtime - ((Long) this.f8908i.get(f32)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f8908i.put(f32, Long.valueOf(jElapsedRealtime));
        int i10 = h52.f8147a;
        int i11 = h52.f8148b;
        int i12 = h52.f8149c;
        int i13 = h52.f8150d;
        int i14 = h52.f8151e;
        long j10 = h52.f8152f;
        int i15 = h52.f8153g;
        C3588x3 c3588x3 = new C3588x3();
        if (i10 != -1) {
            if (i10 != 35) {
                if (i10 != 842094169) {
                    if (i10 != 16) {
                        if (i10 != 17) {
                            enumC3553s3 = EnumC3553s3.UNKNOWN_FORMAT;
                        } else {
                            enumC3553s3 = EnumC3553s3.NV21;
                        }
                    } else {
                        enumC3553s3 = EnumC3553s3.NV16;
                    }
                } else {
                    enumC3553s3 = EnumC3553s3.YV12;
                }
            } else {
                enumC3553s3 = EnumC3553s3.YUV_420_888;
            }
        } else {
            enumC3553s3 = EnumC3553s3.BITMAP;
        }
        c3588x3.d(enumC3553s3);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        enumC3595y3 = EnumC3595y3.ANDROID_MEDIA_IMAGE;
                    } else {
                        enumC3595y3 = EnumC3595y3.FILEPATH;
                    }
                } else {
                    enumC3595y3 = EnumC3595y3.BYTEBUFFER;
                }
            } else {
                enumC3595y3 = EnumC3595y3.BYTEARRAY;
            }
        } else {
            enumC3595y3 = EnumC3595y3.BITMAP;
        }
        c3588x3.f(enumC3595y3);
        c3588x3.c(Integer.valueOf(i12));
        c3588x3.e(Integer.valueOf(i13));
        c3588x3.g(Integer.valueOf(i14));
        c3588x3.b(Long.valueOf(j10));
        c3588x3.h(Integer.valueOf(i15));
        A3 a3J = c3588x3.j();
        G3 g32 = new G3();
        g32.d(a3J);
        final InterfaceC3535p5 interfaceC3535p5D = y5.d(g32);
        if (this.f8904e.r()) {
            strB = (String) this.f8904e.n();
        } else {
            strB = C6533o.a().b(this.f8906g);
        }
        C16962g.d().execute(new Runnable() { // from class: Ed.w5
            @Override // java.lang.Runnable
            public final void run() {
                this.f8863a.b(interfaceC3535p5D, f32, strB);
            }
        });
    }
}
