package Mc;

import com.google.android.gms.internal.ads.C7270Vh;
import com.google.android.gms.internal.ads.C7303Wh;
import com.google.android.gms.internal.ads.C9107pp;
import com.google.android.gms.internal.ads.C9210qn;
import java.util.Random;

/* renamed from: Mc.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4169y {

    /* renamed from: f, reason: collision with root package name */
    private static final C4169y f19362f = new C4169y();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f19363g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Qc.g f19364a;

    /* renamed from: b, reason: collision with root package name */
    private final C4163w f19365b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19366c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f19367d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f19368e;

    protected C4169y() {
        Qc.g gVar = new Qc.g();
        C4163w c4163w = new C4163w(new W1(), new U1(), new C4165w1(), new C7270Vh(), new C9107pp(), new C9210qn(), new C7303Wh(), new X1());
        String strG = Qc.g.g();
        Qc.a aVar = new Qc.a(0, 244410000, true);
        Random random = new Random();
        this.f19364a = gVar;
        this.f19365b = c4163w;
        this.f19366c = strG;
        this.f19367d = aVar;
        this.f19368e = random;
    }

    public static C4163w a() {
        return f19362f.f19365b;
    }

    public static Qc.g b() {
        return f19362f.f19364a;
    }

    public static Qc.a c() {
        return f19362f.f19367d;
    }

    public static String d() {
        return f19362f.f19366c;
    }

    public static Random e() {
        return f19362f.f19368e;
    }
}
