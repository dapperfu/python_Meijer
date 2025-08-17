package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.Rc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7126Rc0 {

    /* renamed from: a, reason: collision with root package name */
    private final File f69899a;

    /* renamed from: b, reason: collision with root package name */
    final File f69900b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f69901c;

    /* renamed from: d, reason: collision with root package name */
    private final int f69902d;

    final C8544kb b(int i10) throws IllegalArgumentException {
        String string = i10 == 1 ? this.f69901c.getString(f(), null) : this.f69901c.getString(e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrC = com.google.android.gms.common.util.k.c(string);
            Zt0 zt0 = Zt0.f72282b;
            C8544kb c8544kbH0 = C8544kb.h0(Zt0.z(bArrC, 0, bArrC.length));
            String strK0 = c8544kbH0.k0();
            File fileB = C7160Sc0.b(strK0, "pcam.jar", d());
            if (!fileB.exists()) {
                fileB = C7160Sc0.b(strK0, "pcam", d());
            }
            File fileB2 = C7160Sc0.b(strK0, "pcbc", d());
            if (fileB.exists()) {
                if (fileB2.exists()) {
                    return c8544kbH0;
                }
            }
        } catch (zzgyg unused) {
        }
        return null;
    }

    public final C7092Qc0 c(int i10) throws IllegalArgumentException {
        C8544kb c8544kbB = b(1);
        if (c8544kbB == null) {
            return null;
        }
        String strK0 = c8544kbB.k0();
        File fileB = C7160Sc0.b(strK0, "pcam.jar", d());
        if (!fileB.exists()) {
            fileB = C7160Sc0.b(strK0, "pcam", d());
        }
        return new C7092Qc0(c8544kbB, fileB, C7160Sc0.b(strK0, "pcbc", d()), C7160Sc0.b(strK0, "pcopt", d()));
    }

    private final File d() {
        File file = new File(this.f69899a, Integer.toString(this.f69902d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FBAMTD");
        sb2.append(this.f69902d - 1);
        return sb2.toString();
    }

    private final String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LATMTD");
        sb2.append(this.f69902d - 1);
        return sb2.toString();
    }

    public C7126Rc0(Context context, int i10) {
        this.f69901c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        C7160Sc0.a(dir, false);
        this.f69899a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        C7160Sc0.a(dir2, true);
        this.f69900b = dir2;
        this.f69902d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.gms.internal.ads.C8225hb r8, com.google.android.gms.internal.ads.InterfaceC7327Xc0 r9) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7126Rc0.a(com.google.android.gms.internal.ads.hb, com.google.android.gms.internal.ads.Xc0):boolean");
    }
}
