package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes6.dex */
final class Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7425Wf0 f69030a;

    /* renamed from: b, reason: collision with root package name */
    private final Iy0 f69031b;

    /* renamed from: c, reason: collision with root package name */
    private Jy0 f69032c;

    /* renamed from: e, reason: collision with root package name */
    private float f69034e = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f69033d = 0;

    static /* bridge */ /* synthetic */ void c(Ky0 ky0, int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2) {
                ky0.g(4);
                return;
            } else {
                ky0.f(0);
                ky0.g(3);
                return;
            }
        }
        if (i10 == -1) {
            ky0.f(-1);
            ky0.e();
            ky0.g(1);
        } else if (i10 == 1) {
            ky0.g(2);
            ky0.f(1);
        } else {
            C10042xL.f("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    public final float a() {
        return this.f69034e;
    }

    public final void d() {
        this.f69032c = null;
        e();
        g(0);
    }

    private final void e() {
        int i10 = this.f69033d;
        if (i10 == 1 || i10 == 0 || OV.f69931a >= 26) {
            return;
        }
        ((AudioManager) this.f69030a.zza()).abandonAudioFocus(this.f69031b);
    }

    private final void f(int i10) {
        Jy0 jy0 = this.f69032c;
        if (jy0 != null) {
            int iX = Kz0.x(i10);
            Kz0 kz0 = ((Gz0) jy0).f68156a;
            kz0.J(kz0.zzu(), i10, iX);
        }
    }

    private final void g(int i10) {
        if (this.f69033d == i10) {
            return;
        }
        this.f69033d = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f69034e != f10) {
            this.f69034e = f10;
            Jy0 jy0 = this.f69032c;
            if (jy0 != null) {
                ((Gz0) jy0).f68156a.G();
            }
        }
    }

    public Ky0(final Context context, Handler handler, Jy0 jy0) {
        this.f69030a = C7614ag0.a(new InterfaceC7425Wf0() { // from class: com.google.android.gms.internal.ads.Gy0
            @Override // com.google.android.gms.internal.ads.InterfaceC7425Wf0
            public final Object zza() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            }
        });
        this.f69032c = jy0;
        this.f69031b = new Iy0(this, handler);
    }

    public final int b(boolean z10, int i10) {
        e();
        g(0);
        return 1;
    }
}
