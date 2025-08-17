package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class XV implements InterfaceC8323iT {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8535kT f71338a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8963oT f71339b;

    /* renamed from: c, reason: collision with root package name */
    private final B80 f71340c;

    /* renamed from: d, reason: collision with root package name */
    private final Xj0 f71341d;

    public XV(B80 b80, Xj0 xj0, InterfaceC8535kT interfaceC8535kT, InterfaceC8963oT interfaceC8963oT) {
        this.f71340c = b80;
        this.f71341d = xj0;
        this.f71339b = interfaceC8963oT;
        this.f71338a = interfaceC8535kT;
    }

    static final String e(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final boolean a(C8608l60 c8608l60, Z50 z50) {
        return !z50.f72059t.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8323iT
    public final com.google.common.util.concurrent.q b(final C8608l60 c8608l60, final Z50 z50) {
        final C8642lT c8642lTA;
        Iterator it = z50.f72059t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8642lTA = null;
                break;
            }
            try {
                c8642lTA = this.f71338a.a((String) it.next(), z50.f72063v);
                break;
            } catch (zzfcq unused) {
            }
        }
        if (c8642lTA == null) {
            return Mj0.g(new zzefy("Unable to instantiate mediation adapter class."));
        }
        C7145Rq c7145Rq = new C7145Rq();
        c8642lTA.f75827c.a2(new WV(this, c8642lTA, c7145Rq));
        if (z50.f72007M) {
            Bundle bundle = c8608l60.f75748a.f74605a.f78738d.f19179m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        B80 b80 = this.f71340c;
        return C8505k80.d(new InterfaceC7972f80() { // from class: com.google.android.gms.internal.ads.UV
            @Override // com.google.android.gms.internal.ads.InterfaceC7972f80
            public final void zza() throws Exception {
                this.f70625a.d(c8608l60, z50, c8642lTA);
            }
        }, this.f71341d, EnumC9681v80.ADAPTER_LOAD_AD_SYN, b80).b(EnumC9681v80.ADAPTER_LOAD_AD_ACK).d(c7145Rq).b(EnumC9681v80.ADAPTER_WRAP_ADAPTER).e(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.VV
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) {
                return this.f70878a.c(c8608l60, z50, c8642lTA, (Void) obj);
            }
        }).a();
    }

    final /* synthetic */ Object c(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT, Void r42) throws Exception {
        return this.f71339b.a(c8608l60, z50, c8642lT);
    }

    final /* synthetic */ void d(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws Exception {
        this.f71339b.b(c8608l60, z50, c8642lT);
    }
}
