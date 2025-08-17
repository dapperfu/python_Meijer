package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7392Zc {

    /* renamed from: a, reason: collision with root package name */
    private final C8015fd f72207a;

    /* renamed from: b, reason: collision with root package name */
    private final C6824Ie f72208b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f72209c;

    private C7392Zc() {
        this.f72208b = C6858Je.v0();
        this.f72209c = false;
        this.f72207a = new C8015fd();
    }

    private final synchronized String d(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f72208b.D(), Long.valueOf(Lc.v.c().c()), Integer.valueOf(i10 - 1), Base64.encodeToString(this.f72208b.p().j(), 3));
    }

    private final synchronized void e(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(C8977od0.a(C8870nd0.a(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(d(i10).getBytes());
                } catch (IOException unused) {
                    Pc.p0.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        Pc.p0.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    Pc.p0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            Pc.p0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i10) {
        C6824Ie c6824Ie = this.f72208b;
        c6824Ie.H();
        c6824Ie.G(Pc.D0.I());
        C7802dd c7802dd = new C7802dd(this.f72207a, this.f72208b.p().j(), null);
        int i11 = i10 - 1;
        c7802dd.a(i11);
        c7802dd.c();
        Pc.p0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void b(InterfaceC7359Yc interfaceC7359Yc) {
        if (this.f72209c) {
            try {
                interfaceC7359Yc.a(this.f72208b);
            } catch (NullPointerException e10) {
                Lc.v.s().x(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i10) {
        if (this.f72209c) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76213X4)).booleanValue()) {
                e(i10);
            } else {
                f(i10);
            }
        }
    }

    public static C7392Zc a() {
        return new C7392Zc();
    }

    public C7392Zc(C8015fd c8015fd) {
        this.f72208b = C6858Je.v0();
        this.f72207a = c8015fd;
        this.f72209c = ((Boolean) Mc.A.c().a(C8659lf.f76199W4)).booleanValue();
    }
}
