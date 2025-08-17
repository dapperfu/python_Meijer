package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Yc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7360Yc0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f71579f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f71580a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f71581b;

    /* renamed from: c, reason: collision with root package name */
    private final String f71582c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6753Gc0 f71583d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71584e;

    private final String g() {
        return "FBAMTD".concat(String.valueOf(this.f71582c));
    }

    private final String h() {
        return "LATMTD".concat(String.valueOf(this.f71582c));
    }

    private final C8544kb k(int i10) {
        String string = i10 == 1 ? this.f71581b.getString(h(), null) : this.f71581b.getString(g(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrC = com.google.android.gms.common.util.k.c(string);
            Zt0 zt0 = Zt0.f72282b;
            return C8544kb.i0(Zt0.z(bArrC, 0, bArrC.length), this.f71584e ? C9225qu0.a() : C9225qu0.b());
        } catch (zzgyg unused) {
            return null;
        } catch (NullPointerException unused2) {
            i(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i(2032, jCurrentTimeMillis);
            return null;
        }
    }

    private final File e(String str) {
        return new File(new File(this.f71580a.getDir("pccache", 0), this.f71582c), str);
    }

    private final void i(int i10, long j10) {
        this.f71583d.zza(i10, j10);
    }

    private final void j(int i10, long j10, String str) {
        this.f71583d.zzb(i10, j10, str);
    }

    public C7360Yc0(Context context, int i10, InterfaceC6753Gc0 interfaceC6753Gc0, boolean z10) {
        this.f71584e = false;
        this.f71580a = context;
        this.f71582c = Integer.toString(i10 - 1);
        this.f71581b = context.getSharedPreferences("pcvmspf", 0);
        this.f71583d = interfaceC6753Gc0;
        this.f71584e = z10;
    }

    private static String f(C8225hb c8225hb) {
        C8332ib c8332ibE0 = C8544kb.e0();
        c8332ibE0.y(c8225hb.d0().k0());
        c8332ibE0.u(c8225hb.d0().j0());
        c8332ibE0.v(c8225hb.d0().b0());
        c8332ibE0.x(c8225hb.d0().d0());
        c8332ibE0.w(c8225hb.d0().c0());
        return com.google.android.gms.common.util.k.a(((C8544kb) c8332ibE0.p()).j());
    }

    public final boolean a(C8225hb c8225hb) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f71579f) {
            try {
                if (!C7160Sc0.e(new File(e(c8225hb.d0().k0()), "pcbc"), c8225hb.e0().a())) {
                    i(4020, jCurrentTimeMillis);
                    return false;
                }
                String strF = f(c8225hb);
                SharedPreferences.Editor editorEdit = this.f71581b.edit();
                editorEdit.putString(h(), strF);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    i(5015, jCurrentTimeMillis);
                } else {
                    i(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b(C8225hb c8225hb, InterfaceC7327Xc0 interfaceC7327Xc0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f71579f) {
            try {
                C8544kb c8544kbK = k(1);
                String strK0 = c8225hb.d0().k0();
                if (c8544kbK != null && c8544kbK.k0().equals(strK0)) {
                    i(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileE = e(strK0);
                if (fileE.exists()) {
                    String str = "1";
                    if (true != fileE.isDirectory()) {
                        str = "0";
                    }
                    String str2 = "1";
                    if (true != fileE.isFile()) {
                        str2 = "0";
                    }
                    j(4023, jCurrentTimeMillis2, "d:" + str + ",f:" + str2);
                    i(4015, jCurrentTimeMillis2);
                } else if (!fileE.mkdirs()) {
                    String str3 = "1";
                    if (true != fileE.canWrite()) {
                        str3 = "0";
                    }
                    j(4024, jCurrentTimeMillis2, "cw:".concat(str3));
                    i(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileE2 = e(strK0);
                File file = new File(fileE2, "pcam.jar");
                File file2 = new File(fileE2, "pcbc");
                if (!C7160Sc0.e(file, c8225hb.f0().a())) {
                    i(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!C7160Sc0.e(file2, c8225hb.e0().a())) {
                    i(4017, jCurrentTimeMillis);
                    return false;
                }
                if (interfaceC7327Xc0 != null && !interfaceC7327Xc0.zza(file)) {
                    i(4018, jCurrentTimeMillis);
                    C7160Sc0.d(fileE2);
                    return false;
                }
                String strF = f(c8225hb);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.f71581b.getString(h(), null);
                SharedPreferences.Editor editorEdit = this.f71581b.edit();
                editorEdit.putString(h(), strF);
                if (string != null) {
                    editorEdit.putString(g(), string);
                }
                if (!editorEdit.commit()) {
                    i(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C8544kb c8544kbK2 = k(1);
                if (c8544kbK2 != null) {
                    hashSet.add(c8544kbK2.k0());
                }
                C8544kb c8544kbK3 = k(2);
                if (c8544kbK3 != null) {
                    hashSet.add(c8544kbK3.k0());
                }
                for (File file3 : new File(this.f71580a.getDir("pccache", 0), this.f71582c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        C7160Sc0.d(file3);
                    }
                }
                i(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C7092Qc0 c(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f71579f) {
            try {
                C8544kb c8544kbK = k(1);
                if (c8544kbK == null) {
                    i(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileE = e(c8544kbK.k0());
                File file = new File(fileE, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileE, "pcam");
                }
                File file2 = new File(fileE, "pcbc");
                File file3 = new File(fileE, "pcopt");
                i(5016, jCurrentTimeMillis);
                return new C7092Qc0(c8544kbK, file, file2, file3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f71579f) {
            try {
                C8544kb c8544kbK = k(1);
                if (c8544kbK == null) {
                    i(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileE = e(c8544kbK.k0());
                if (!new File(fileE, "pcam.jar").exists()) {
                    i(4026, jCurrentTimeMillis);
                    return false;
                }
                if (!new File(fileE, "pcbc").exists()) {
                    i(4027, jCurrentTimeMillis);
                    return false;
                }
                i(5019, jCurrentTimeMillis);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
