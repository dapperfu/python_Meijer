package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class ZQ {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f73005a;

    /* renamed from: b, reason: collision with root package name */
    private final EQ f73006b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7863cy0 f73007c;

    public ZQ(Xj0 xj0, EQ eq2, InterfaceC7863cy0 interfaceC7863cy0) {
        this.f73005a = xj0;
        this.f73006b = eq2;
        this.f73007c = interfaceC7863cy0;
    }

    private final com.google.common.util.concurrent.q g(final C9978wo c9978wo, YQ yq2, final YQ yq3, final InterfaceC9541sj0 interfaceC9541sj0) {
        String str = c9978wo.f80369d;
        Nc.v.t();
        return (Cj0) Mj0.f((Cj0) Mj0.n((Cj0) Mj0.n(Cj0.D(Rc.D0.d(str) ? Mj0.g(new zzdyh(1)) : Mj0.f(yq2.a(c9978wo), ExecutionException.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.XQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return Mj0.g(cause);
            }
        }, this.f73005a)), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.VQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(((OQ) obj).b());
            }
        }, this.f73005a), interfaceC9541sj0, this.f73005a), zzdyh.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.WQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f71921a.b(yq3, c9978wo, interfaceC9541sj0, (zzdyh) obj);
            }
        }, this.f73005a);
    }

    public final com.google.common.util.concurrent.q a(final C9978wo c9978wo) {
        InterfaceC9541sj0 interfaceC9541sj0 = new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.SQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                String str = new String(C9860vi0.b((InputStream) obj), StandardCharsets.UTF_8);
                C9978wo c9978wo2 = c9978wo;
                c9978wo2.f80375j = str;
                return Mj0.h(c9978wo2);
            }
        };
        final EQ eq2 = this.f73006b;
        Objects.requireNonNull(eq2);
        return g(c9978wo, new YQ() { // from class: com.google.android.gms.internal.ads.TQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9978wo c9978wo2) {
                return eq2.c(c9978wo2);
            }
        }, new YQ() { // from class: com.google.android.gms.internal.ads.UQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9978wo c9978wo2) {
                return this.f71453a.c(c9978wo2);
            }
        }, interfaceC9541sj0);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(YQ yq2, C9978wo c9978wo, InterfaceC9541sj0 interfaceC9541sj0, zzdyh zzdyhVar) throws Exception {
        return Mj0.n(yq2.a(c9978wo), interfaceC9541sj0, this.f73005a);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(C9978wo c9978wo) {
        return ((BinderC9513sR) this.f73007c.zzb()).B9(c9978wo, Binder.getCallingUid());
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(C9978wo c9978wo) {
        return this.f73006b.d(c9978wo.f80373h);
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(C9978wo c9978wo) {
        return ((BinderC9513sR) this.f73007c.zzb()).E9(c9978wo.f80373h);
    }

    public final com.google.common.util.concurrent.q f(C9978wo c9978wo) {
        return g(c9978wo, new YQ() { // from class: com.google.android.gms.internal.ads.QQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9978wo c9978wo2) {
                return this.f70405a.d(c9978wo2);
            }
        }, new YQ() { // from class: com.google.android.gms.internal.ads.RQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9978wo c9978wo2) {
                return this.f70709a.e(c9978wo2);
            }
        }, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.PQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(null);
            }
        });
    }
}
