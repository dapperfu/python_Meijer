package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8346hY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f75580a;

    /* renamed from: b, reason: collision with root package name */
    private final C8653kM f75581b;

    /* renamed from: c, reason: collision with root package name */
    private final EO f75582c;

    /* renamed from: d, reason: collision with root package name */
    private final C8558jY f75583d;

    public C8346hY(Xj0 xj0, C8653kM c8653kM, EO eo2, C8558jY c8558jY) {
        this.f75580a = xj0;
        this.f75581b = c8653kM;
        this.f75582c = eo2;
        this.f75583d = c8558jY;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 1;
    }

    final /* synthetic */ C8453iY a() throws Exception {
        List<String> listAsList = Arrays.asList(((String) Oc.A.c().a(C8784lf.f77441z1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                S60 s60C = this.f75581b.c(str, new JSONObject());
                s60C.c();
                boolean zT = this.f75582c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) Oc.A.c().a(C8784lf.f77437yb)).booleanValue() || zT) {
                    try {
                        C7130Nm c7130NmK = s60C.k();
                        if (c7130NmK != null) {
                            bundle2.putString("sdk_version", c7130NmK.toString());
                        }
                    } catch (zzfcq unused) {
                    }
                }
                try {
                    C7130Nm c7130NmJ = s60C.j();
                    if (c7130NmJ != null) {
                        bundle2.putString("adapter_version", c7130NmJ.toString());
                    }
                } catch (zzfcq unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcq unused3) {
            }
        }
        C8453iY c8453iY = new C8453iY(bundle);
        if (((Boolean) Oc.A.c().a(C8784lf.f77437yb)).booleanValue()) {
            this.f75583d.b(c8453iY);
        }
        return c8453iY;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        AbstractC7718bf abstractC7718bf = C8784lf.f77437yb;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue() && this.f75583d.a() != null) {
            C8453iY c8453iYA = this.f75583d.a();
            c8453iYA.getClass();
            return Mj0.h(c8453iYA);
        }
        if (C7392Vf0.d((String) Oc.A.c().a(C8784lf.f77441z1)) || (!((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue() && (this.f75583d.d() || !this.f75582c.t()))) {
            return Mj0.h(new C8453iY(new Bundle()));
        }
        this.f75583d.c(true);
        return this.f75580a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.gY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75169a.a();
            }
        });
    }
}
