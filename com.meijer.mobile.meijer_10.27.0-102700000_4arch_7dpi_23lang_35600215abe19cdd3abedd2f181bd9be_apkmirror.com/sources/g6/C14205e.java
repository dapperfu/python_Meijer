package g6;

import android.content.Context;
import java.io.File;
import l6.InterfaceC15384b;
import r6.C16725b;

/* renamed from: g6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14205e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f132915a = false;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f132916b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f132917c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f132918d = true;

    /* renamed from: f, reason: collision with root package name */
    private static r6.f f132920f;

    /* renamed from: g, reason: collision with root package name */
    private static r6.e f132921g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile r6.h f132922h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile r6.g f132923i;

    /* renamed from: j, reason: collision with root package name */
    private static ThreadLocal<u6.i> f132924j;

    /* renamed from: e, reason: collision with root package name */
    private static EnumC14201a f132919e = EnumC14201a.AUTOMATIC;

    /* renamed from: k, reason: collision with root package name */
    private static InterfaceC15384b f132925k = new l6.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f132916b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f132916b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static EnumC14201a d() {
        return f132919e;
    }

    public static boolean e() {
        return f132918d;
    }

    public static InterfaceC15384b f() {
        return f132925k;
    }

    private static u6.i g() {
        u6.i iVar = f132924j.get();
        if (iVar != null) {
            return iVar;
        }
        u6.i iVar2 = new u6.i();
        f132924j.set(iVar2);
        return iVar2;
    }

    public static boolean h() {
        return f132916b;
    }

    public static r6.g i(Context context) {
        r6.g gVar;
        if (!f132917c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        r6.g gVar2 = f132923i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (r6.g.class) {
            try {
                gVar = f132923i;
                if (gVar == null) {
                    r6.e eVar = f132921g;
                    if (eVar == null) {
                        eVar = new r6.e() { // from class: g6.d
                            @Override // r6.e
                            public final File G() {
                                return C14205e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new r6.g(eVar);
                    f132923i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static r6.h j(Context context) {
        r6.h hVar;
        r6.h hVar2 = f132922h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (r6.h.class) {
            try {
                hVar = f132922h;
                if (hVar == null) {
                    r6.g gVarI = i(context);
                    r6.f c16725b = f132920f;
                    if (c16725b == null) {
                        c16725b = new C16725b();
                    }
                    hVar = new r6.h(gVarI, c16725b);
                    f132922h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
