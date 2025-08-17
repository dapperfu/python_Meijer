package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import com.fullstory.FS;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import gd.C14248g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import rd.C16752e;

/* loaded from: classes4.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f65002h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f65003i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f65004j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f65005k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f65006l;

    /* renamed from: q, reason: collision with root package name */
    private static m f65011q;

    /* renamed from: r, reason: collision with root package name */
    private static n f65012r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f65013a;

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f65007m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f65008n = new b();

    /* renamed from: o, reason: collision with root package name */
    private static final a.InterfaceC1261a f65009o = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final a f64996b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final a f64997c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final a f64998d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final a f64999e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final a f65000f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final a f65001g = new i();

    /* renamed from: p, reason: collision with root package name */
    public static final a f65010p = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, C16752e c16752e) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th2, C16752e c16752e) {
            super(str, th2);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        public interface InterfaceC1261a {
            int a(Context context, String str, boolean z10) throws LoadingException;

            int b(Context context, String str);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f65014a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f65015b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f65016c = 0;
        }

        b a(Context context, String str, InterfaceC1261a interfaceC1261a) throws LoadingException;
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0144: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:325), block:B:93:0x0144 */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void i(ClassLoader classLoader) throws LoadingException {
        n nVar;
        C16752e c16752e = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f65012r = nVar;
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new LoadingException("Failed to instantiate dynamite loader", e, c16752e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new LoadingException("Failed to instantiate dynamite loader", e, c16752e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new LoadingException("Failed to instantiate dynamite loader", e, c16752e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new LoadingException("Failed to instantiate dynamite loader", e, c16752e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new LoadingException("Failed to instantiate dynamite loader", e, c16752e);
        }
    }

    public Context b() {
        return this.f65013a;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (C6535q.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            FS.log_e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            FS.log_w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            FS.log_e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #7 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:126:0x0265, B:127:0x027c, B:110:0x020f, B:112:0x022d, B:114:0x023c, B:124:0x025c, B:125:0x0264, B:128:0x027d, B:129:0x02ad), top: B:149:0x0040, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r21, com.google.android.gms.dynamite.DynamiteModule.a r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x017d A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00ec, blocks: (B:3:0x0002, B:64:0x00e1, B:66:0x00e7, B:74:0x010d, B:102:0x016f, B:106:0x017d, B:124:0x01d2, B:125:0x01d5, B:119:0x01c9, B:72:0x00f2, B:127:0x01d7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00de, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00e0, B:61:0x00c2), top: B:134:0x0002, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:141:0x0026, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c7 -> B:135:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01c9 -> B:135:0x01cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f65007m.get();
        if (kVar == null || kVar.f65017a != null) {
            return false;
        }
        kVar.f65017a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f65006l)) {
            return true;
        }
        boolean z10 = false;
        if (f65006l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.n.i() ? 0 : 268435456);
            if (C14248g.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f65006l = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                FS.log_i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f65004j = true;
            }
        }
        if (!z10) {
            FS.log_e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f65011q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f65011q = mVar;
                    return mVar;
                }
            } catch (Exception e10) {
                FS.log_e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public IBinder d(String str) throws LoadingException {
        try {
            return (IBinder) this.f65013a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }

    private DynamiteModule(Context context) {
        r.l(context);
        this.f65013a = context;
    }

    private static DynamiteModule h(Context context, String str) {
        FS.log_i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }
}
