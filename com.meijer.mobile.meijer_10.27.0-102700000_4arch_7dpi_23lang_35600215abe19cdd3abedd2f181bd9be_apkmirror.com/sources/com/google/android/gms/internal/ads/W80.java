package com.google.android.gms.internal.ads;

import Vc.C5366c;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class W80 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final Z80 f71011b;

    /* renamed from: c, reason: collision with root package name */
    private String f71012c;

    /* renamed from: e, reason: collision with root package name */
    private String f71014e;

    /* renamed from: f, reason: collision with root package name */
    private C8394j60 f71015f;

    /* renamed from: g, reason: collision with root package name */
    private Mc.W0 f71016g;

    /* renamed from: h, reason: collision with root package name */
    private Future f71017h;

    /* renamed from: a, reason: collision with root package name */
    private final List f71010a = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private int f71018i = 2;

    /* renamed from: d, reason: collision with root package name */
    private EnumC7548b90 f71013d = EnumC7548b90.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public final synchronized W80 a(K80 k80) {
        try {
            if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
                List list = this.f71010a;
                k80.zzj();
                list.add(k80);
                Future future = this.f71017h;
                if (future != null) {
                    future.cancel(false);
                }
                this.f71017h = C6908Kq.f68177d.schedule(this, ((Integer) Mc.A.c().a(C8659lf.f75993H8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized W80 b(String str) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue() && V80.e(str)) {
            this.f71012c = str;
        }
        return this;
    }

    public final synchronized W80 c(Mc.W0 w02) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            this.f71016g = w02;
        }
        return this;
    }

    public final synchronized W80 d(ArrayList arrayList) {
        try {
            if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(Ec.b.BANNER.name())) {
                    this.f71018i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(Ec.b.INTERSTITIAL.name())) {
                    this.f71018i = 4;
                } else if (arrayList.contains("native") || arrayList.contains(Ec.b.NATIVE.name())) {
                    this.f71018i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(Ec.b.REWARDED.name())) {
                    this.f71018i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.f71018i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(Ec.b.REWARDED_INTERSTITIAL.name())) {
                    this.f71018i = 6;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final synchronized W80 e(String str) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            this.f71014e = str;
        }
        return this;
    }

    public final synchronized W80 f(Bundle bundle) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            this.f71013d = C5366c.a(bundle);
        }
        return this;
    }

    public final synchronized W80 g(C8394j60 c8394j60) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            this.f71015f = c8394j60;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
                Future future = this.f71017h;
                if (future != null) {
                    future.cancel(false);
                }
                for (K80 k80 : this.f71010a) {
                    int i10 = this.f71018i;
                    if (i10 != 2) {
                        k80.b(i10);
                    }
                    if (!TextUtils.isEmpty(this.f71012c)) {
                        k80.a(this.f71012c);
                    }
                    if (!TextUtils.isEmpty(this.f71014e) && !k80.zzl()) {
                        k80.L(this.f71014e);
                    }
                    C8394j60 c8394j60 = this.f71015f;
                    if (c8394j60 != null) {
                        k80.d(c8394j60);
                    } else {
                        Mc.W0 w02 = this.f71016g;
                        if (w02 != null) {
                            k80.i(w02);
                        }
                    }
                    k80.c(this.f71013d);
                    this.f71011b.b(k80.zzm());
                }
                this.f71010a.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized W80 i(int i10) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            this.f71018i = i10;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }

    W80(Z80 z80) {
        this.f71011b = z80;
    }
}
