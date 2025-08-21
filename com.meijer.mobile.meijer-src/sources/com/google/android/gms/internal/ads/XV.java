package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class XV implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8660kT f72178a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9088oT f72179b;

    /* renamed from: c, reason: collision with root package name */
    private final B80 f72180c;

    /* renamed from: d, reason: collision with root package name */
    private final Xj0 f72181d;

    public XV(B80 b80, Xj0 xj0, InterfaceC8660kT interfaceC8660kT, InterfaceC9088oT interfaceC9088oT) {
        this.f72180c = b80;
        this.f72181d = xj0;
        this.f72179b = interfaceC9088oT;
        this.f72178a = interfaceC8660kT;
    }

    static final String e(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        return !z50.f72899t.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        final C8767lT c8767lTA;
        Iterator it = z50.f72899t.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8767lTA = null;
                break;
            }
            try {
                c8767lTA = this.f72178a.a((String) it.next(), z50.f72903v);
                break;
            } catch (zzfcq unused) {
            }
        }
        if (c8767lTA == null) {
            return Mj0.g(new zzefy("Unable to instantiate mediation adapter class."));
        }
        C7270Rq c7270Rq = new C7270Rq();
        c8767lTA.f76667c.a2(new WV(this, c8767lTA, c7270Rq));
        if (z50.f72847M) {
            Bundle bundle = c8733l60.f76588a.f75445a.f79578d.f23366m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        B80 b80 = this.f72180c;
        return C8630k80.d(new InterfaceC8097f80() { // from class: com.google.android.gms.internal.ads.UV
            @Override // com.google.android.gms.internal.ads.InterfaceC8097f80
            public final void zza() throws Exception {
                this.f71465a.d(c8733l60, z50, c8767lTA);
            }
        }, this.f72181d, EnumC9806v80.ADAPTER_LOAD_AD_SYN, b80).b(EnumC9806v80.ADAPTER_LOAD_AD_ACK).d(c7270Rq).b(EnumC9806v80.ADAPTER_WRAP_ADAPTER).e(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.VV
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) {
                return this.f71718a.c(c8733l60, z50, c8767lTA, (Void) obj);
            }
        }).a();
    }

    final /* synthetic */ Object c(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT, Void r42) throws Exception {
        return this.f72179b.a(c8733l60, z50, c8767lT);
    }

    final /* synthetic */ void d(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws Exception {
        this.f72179b.b(c8733l60, z50, c8767lT);
    }
}
