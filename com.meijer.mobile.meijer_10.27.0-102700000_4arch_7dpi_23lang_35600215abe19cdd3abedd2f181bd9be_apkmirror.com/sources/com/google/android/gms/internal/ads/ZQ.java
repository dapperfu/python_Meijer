package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class ZQ {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f72165a;

    /* renamed from: b, reason: collision with root package name */
    private final EQ f72166b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7738cy0 f72167c;

    public ZQ(Xj0 xj0, EQ eq2, InterfaceC7738cy0 interfaceC7738cy0) {
        this.f72165a = xj0;
        this.f72166b = eq2;
        this.f72167c = interfaceC7738cy0;
    }

    private final com.google.common.util.concurrent.q g(final C9853wo c9853wo, YQ yq2, final YQ yq3, final InterfaceC9416sj0 interfaceC9416sj0) {
        String str = c9853wo.f79529d;
        Lc.v.t();
        return (Cj0) Mj0.f((Cj0) Mj0.n((Cj0) Mj0.n(Cj0.D(Pc.D0.d(str) ? Mj0.g(new zzdyh(1)) : Mj0.f(yq2.a(c9853wo), ExecutionException.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.XQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return Mj0.g(cause);
            }
        }, this.f72165a)), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.VQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(((OQ) obj).b());
            }
        }, this.f72165a), interfaceC9416sj0, this.f72165a), zzdyh.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.WQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f71081a.b(yq3, c9853wo, interfaceC9416sj0, (zzdyh) obj);
            }
        }, this.f72165a);
    }

    public final com.google.common.util.concurrent.q a(final C9853wo c9853wo) {
        InterfaceC9416sj0 interfaceC9416sj0 = new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.SQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                String str = new String(C9735vi0.b((InputStream) obj), StandardCharsets.UTF_8);
                C9853wo c9853wo2 = c9853wo;
                c9853wo2.f79535j = str;
                return Mj0.h(c9853wo2);
            }
        };
        final EQ eq2 = this.f72166b;
        Objects.requireNonNull(eq2);
        return g(c9853wo, new YQ() { // from class: com.google.android.gms.internal.ads.TQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9853wo c9853wo2) {
                return eq2.c(c9853wo2);
            }
        }, new YQ() { // from class: com.google.android.gms.internal.ads.UQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9853wo c9853wo2) {
                return this.f70613a.c(c9853wo2);
            }
        }, interfaceC9416sj0);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(YQ yq2, C9853wo c9853wo, InterfaceC9416sj0 interfaceC9416sj0, zzdyh zzdyhVar) throws Exception {
        return Mj0.n(yq2.a(c9853wo), interfaceC9416sj0, this.f72165a);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(C9853wo c9853wo) {
        return ((BinderC9388sR) this.f72167c.zzb()).B9(c9853wo, Binder.getCallingUid());
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(C9853wo c9853wo) {
        return this.f72166b.d(c9853wo.f79533h);
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(C9853wo c9853wo) {
        return ((BinderC9388sR) this.f72167c.zzb()).E9(c9853wo.f79533h);
    }

    public final com.google.common.util.concurrent.q f(C9853wo c9853wo) {
        return g(c9853wo, new YQ() { // from class: com.google.android.gms.internal.ads.QQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9853wo c9853wo2) {
                return this.f69565a.d(c9853wo2);
            }
        }, new YQ() { // from class: com.google.android.gms.internal.ads.RQ
            @Override // com.google.android.gms.internal.ads.YQ
            public final com.google.common.util.concurrent.q a(C9853wo c9853wo2) {
                return this.f69869a.e(c9853wo2);
            }
        }, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.PQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(null);
            }
        });
    }
}
