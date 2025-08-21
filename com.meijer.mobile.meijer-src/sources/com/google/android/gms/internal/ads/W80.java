package com.google.android.gms.internal.ads;

import Xc.C5569c;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class W80 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final Z80 f71851b;

    /* renamed from: c, reason: collision with root package name */
    private String f71852c;

    /* renamed from: e, reason: collision with root package name */
    private String f71854e;

    /* renamed from: f, reason: collision with root package name */
    private C8519j60 f71855f;

    /* renamed from: g, reason: collision with root package name */
    private Oc.W0 f71856g;

    /* renamed from: h, reason: collision with root package name */
    private Future f71857h;

    /* renamed from: a, reason: collision with root package name */
    private final List f71850a = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private int f71858i = 2;

    /* renamed from: d, reason: collision with root package name */
    private EnumC7673b90 f71853d = EnumC7673b90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public final synchronized W80 a(K80 k80) {
        try {
            if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
                List list = this.f71850a;
                k80.zzj();
                list.add(k80);
                Future future = this.f71857h;
                if (future != null) {
                    future.cancel(false);
                }
                this.f71857h = C7033Kq.f69017d.schedule(this, ((Integer) Oc.A.c().a(C8784lf.f76833H8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized W80 b(String str) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue() && V80.e(str)) {
            this.f71852c = str;
        }
        return this;
    }

    public final synchronized W80 c(Oc.W0 w02) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            this.f71856g = w02;
        }
        return this;
    }

    public final synchronized W80 d(ArrayList arrayList) {
        try {
            if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(Gc.b.BANNER.name())) {
                    this.f71858i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(Gc.b.INTERSTITIAL.name())) {
                    this.f71858i = 4;
                } else if (arrayList.contains("native") || arrayList.contains(Gc.b.NATIVE.name())) {
                    this.f71858i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(Gc.b.REWARDED.name())) {
                    this.f71858i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f71858i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(Gc.b.REWARDED_INTERSTITIAL.name())) {
                    this.f71858i = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized W80 e(String str) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            this.f71854e = str;
        }
        return this;
    }

    public final synchronized W80 f(Bundle bundle) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            this.f71853d = C5569c.a(bundle);
        }
        return this;
    }

    public final synchronized W80 g(C8519j60 c8519j60) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            this.f71855f = c8519j60;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
                Future future = this.f71857h;
                if (future != null) {
                    future.cancel(false);
                }
                for (K80 k80 : this.f71850a) {
                    int i10 = this.f71858i;
                    if (i10 != 2) {
                        k80.b(i10);
                    }
                    if (!TextUtils.isEmpty(this.f71852c)) {
                        k80.a(this.f71852c);
                    }
                    if (!TextUtils.isEmpty(this.f71854e) && !k80.zzl()) {
                        k80.L(this.f71854e);
                    }
                    C8519j60 c8519j60 = this.f71855f;
                    if (c8519j60 != null) {
                        k80.d(c8519j60);
                    } else {
                        Oc.W0 w02 = this.f71856g;
                        if (w02 != null) {
                            k80.i(w02);
                        }
                    }
                    k80.c(this.f71853d);
                    this.f71851b.b(k80.zzm());
                }
                this.f71850a.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized W80 i(int i10) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            this.f71858i = i10;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }

    W80(Z80 z80) {
        this.f71851b = z80;
    }
}
