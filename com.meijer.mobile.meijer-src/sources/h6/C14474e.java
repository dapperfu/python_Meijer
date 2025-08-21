package h6;

import android.content.Context;
import java.io.File;
import m6.InterfaceC15681b;
import s6.C17022b;
import s6.C17027g;
import s6.InterfaceC17025e;
import s6.InterfaceC17026f;

/* renamed from: h6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14474e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f135091a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f135092b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f135093c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f135094d = true;

    /* renamed from: f, reason: collision with root package name */
    private static InterfaceC17026f f135096f;

    /* renamed from: g, reason: collision with root package name */
    private static InterfaceC17025e f135097g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile s6.h f135098h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile C17027g f135099i;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadLocal<v6.i> f135100j;

    /* renamed from: e, reason: collision with root package name */
    private static EnumC14470a f135095e = EnumC14470a.AUTOMATIC;

    /* renamed from: k, reason: collision with root package name */
    private static InterfaceC15681b f135101k = new m6.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f135092b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f135092b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static EnumC14470a d() {
        return f135095e;
    }

    public static boolean e() {
        return f135094d;
    }

    public static InterfaceC15681b f() {
        return f135101k;
    }

    private static v6.i g() {
        v6.i iVar = f135100j.get();
        if (iVar != null) {
            return iVar;
        }
        v6.i iVar2 = new v6.i();
        f135100j.set(iVar2);
        return iVar2;
    }

    public static boolean h() {
        return f135092b;
    }

    public static C17027g i(Context context) {
        C17027g c17027g;
        if (!f135093c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        C17027g c17027g2 = f135099i;
        if (c17027g2 != null) {
            return c17027g2;
        }
        synchronized (C17027g.class) {
            try {
                c17027g = f135099i;
                if (c17027g == null) {
                    InterfaceC17025e interfaceC17025e = f135097g;
                    if (interfaceC17025e == null) {
                        interfaceC17025e = new InterfaceC17025e() { // from class: h6.d
                            @Override // s6.InterfaceC17025e
                            public final File G() {
                                return C14474e.a(applicationContext);
                            }
                        };
                    }
                    c17027g = new C17027g(interfaceC17025e);
                    f135099i = c17027g;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c17027g;
    }

    public static s6.h j(Context context) {
        s6.h hVar;
        s6.h hVar2 = f135098h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (s6.h.class) {
            try {
                hVar = f135098h;
                if (hVar == null) {
                    C17027g c17027gI = i(context);
                    InterfaceC17026f c17022b = f135096f;
                    if (c17022b == null) {
                        c17022b = new C17022b();
                    }
                    hVar = new s6.h(c17027gI, c17022b);
                    f135098h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
