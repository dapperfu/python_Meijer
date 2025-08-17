package Vc;

import android.util.Pair;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.Ij0;

/* renamed from: Vc.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5384v implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC5385w f37323a;

    C5384v(BinderC5385w binderC5385w) {
        this.f37323a = binderC5385w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Lc.v.s().x(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        C5366c.d(this.f37323a.f37345k, null, "sgf", new Pair("sgf_reason", th2.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", Ec.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.f37323a.f37331C.get())));
        Qc.p.e("Failed to initialize webview for loading SDKCore. ", th2);
        if (!((Boolean) Mc.A.c().a(C8659lf.f75924C9)).booleanValue() || this.f37323a.f37330B.get()) {
            return;
        }
        if (this.f37323a.f37331C.getAndIncrement() < ((Integer) Mc.A.c().a(C8659lf.f75938D9)).intValue()) {
            this.f37323a.V9();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Qc.p.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) Mc.A.c().a(C8659lf.f75924C9)).booleanValue()) {
            C5366c.d(this.f37323a.f37345k, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", Ec.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.f37323a.f37331C.get())));
            this.f37323a.f37330B.set(true);
        }
    }
}
