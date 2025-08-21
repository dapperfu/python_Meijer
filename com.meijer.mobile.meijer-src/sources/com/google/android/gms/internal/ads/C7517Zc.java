package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7517Zc {

    /* renamed from: a, reason: collision with root package name */
    private final C8140fd f73047a;

    /* renamed from: b, reason: collision with root package name */
    private final C6949Ie f73048b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f73049c;

    private C7517Zc() {
        this.f73048b = C6983Je.v0();
        this.f73049c = false;
        this.f73047a = new C8140fd();
    }

    private final synchronized String d(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f73048b.D(), Long.valueOf(Nc.v.c().c()), Integer.valueOf(i10 - 1), Base64.encodeToString(this.f73048b.p().j(), 3));
    }

    private final synchronized void e(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(C9102od0.a(C8995nd0.a(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(d(i10).getBytes());
                } catch (IOException unused) {
                    Rc.p0.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        Rc.p0.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    Rc.p0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            Rc.p0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i10) {
        C6949Ie c6949Ie = this.f73048b;
        c6949Ie.H();
        c6949Ie.G(Rc.D0.I());
        C7927dd c7927dd = new C7927dd(this.f73047a, this.f73048b.p().j(), null);
        int i11 = i10 - 1;
        c7927dd.a(i11);
        c7927dd.c();
        Rc.p0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void b(InterfaceC7484Yc interfaceC7484Yc) {
        if (this.f73049c) {
            try {
                interfaceC7484Yc.a(this.f73048b);
            } catch (NullPointerException e10) {
                Nc.v.s().x(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i10) {
        if (this.f73049c) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77053X4)).booleanValue()) {
                e(i10);
            } else {
                f(i10);
            }
        }
    }

    public static C7517Zc a() {
        return new C7517Zc();
    }

    public C7517Zc(C8140fd c8140fd) {
        this.f73048b = C6983Je.v0();
        this.f73047a = c8140fd;
        this.f73049c = ((Boolean) Oc.A.c().a(C8784lf.f77039W4)).booleanValue();
    }
}
