package Oc;

import com.google.android.gms.internal.ads.C7395Vh;
import com.google.android.gms.internal.ads.C7428Wh;
import com.google.android.gms.internal.ads.C9232pp;
import com.google.android.gms.internal.ads.C9335qn;
import java.util.Random;

/* renamed from: Oc.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4447y {

    /* renamed from: f, reason: collision with root package name */
    private static final C4447y f23549f = new C4447y();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f23550g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Sc.g f23551a;

    /* renamed from: b, reason: collision with root package name */
    private final C4441w f23552b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23553c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f23554d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f23555e;

    protected C4447y() {
        Sc.g gVar = new Sc.g();
        C4441w c4441w = new C4441w(new W1(), new U1(), new C4443w1(), new C7395Vh(), new C9232pp(), new C9335qn(), new C7428Wh(), new X1());
        String strG = Sc.g.g();
        Sc.a aVar = new Sc.a(0, 244410000, true);
        Random random = new Random();
        this.f23551a = gVar;
        this.f23552b = c4441w;
        this.f23553c = strG;
        this.f23554d = aVar;
        this.f23555e = random;
    }

    public static C4441w a() {
        return f23549f.f23552b;
    }

    public static Sc.g b() {
        return f23549f.f23551a;
    }

    public static Sc.a c() {
        return f23549f.f23554d;
    }

    public static String d() {
        return f23549f.f23553c;
    }

    public static Random e() {
        return f23549f.f23555e;
    }
}
