package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8221hY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f74740a;

    /* renamed from: b, reason: collision with root package name */
    private final C8528kM f74741b;

    /* renamed from: c, reason: collision with root package name */
    private final EO f74742c;

    /* renamed from: d, reason: collision with root package name */
    private final C8433jY f74743d;

    public C8221hY(Xj0 xj0, C8528kM c8528kM, EO eo2, C8433jY c8433jY) {
        this.f74740a = xj0;
        this.f74741b = c8528kM;
        this.f74742c = eo2;
        this.f74743d = c8433jY;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 1;
    }

    final /* synthetic */ C8328iY a() throws Exception {
        List<String> listAsList = Arrays.asList(((String) Mc.A.c().a(C8659lf.f76601z1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                S60 s60C = this.f74741b.c(str, new JSONObject());
                s60C.c();
                boolean zT = this.f74742c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) Mc.A.c().a(C8659lf.f76597yb)).booleanValue() || zT) {
                    try {
                        C7005Nm c7005NmK = s60C.k();
                        if (c7005NmK != null) {
                            bundle2.putString("sdk_version", c7005NmK.toString());
                        }
                    } catch (zzfcq unused) {
                    }
                }
                try {
                    C7005Nm c7005NmJ = s60C.j();
                    if (c7005NmJ != null) {
                        bundle2.putString("adapter_version", c7005NmJ.toString());
                    }
                } catch (zzfcq unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcq unused3) {
            }
        }
        C8328iY c8328iY = new C8328iY(bundle);
        if (((Boolean) Mc.A.c().a(C8659lf.f76597yb)).booleanValue()) {
            this.f74743d.b(c8328iY);
        }
        return c8328iY;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        AbstractC7593bf abstractC7593bf = C8659lf.f76597yb;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue() && this.f74743d.a() != null) {
            C8328iY c8328iYA = this.f74743d.a();
            c8328iYA.getClass();
            return Mj0.h(c8328iYA);
        }
        if (C7267Vf0.d((String) Mc.A.c().a(C8659lf.f76601z1)) || (!((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue() && (this.f74743d.d() || !this.f74742c.t()))) {
            return Mj0.h(new C8328iY(new Bundle()));
        }
        this.f74743d.c(true);
        return this.f74740a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.gY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f74329a.a();
            }
        });
    }
}
