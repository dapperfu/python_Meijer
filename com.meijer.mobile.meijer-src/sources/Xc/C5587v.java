package Xc;

import android.util.Pair;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.Ij0;

/* renamed from: Xc.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5587v implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BinderC5588w f42035a;

    C5587v(BinderC5588w binderC5588w) {
        this.f42035a = binderC5588w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Nc.v.s().x(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        C5569c.d(this.f42035a.f42057k, null, "sgf", new Pair("sgf_reason", th2.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", Gc.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.f42035a.f42043C.get())));
        Sc.p.e("Failed to initialize webview for loading SDKCore. ", th2);
        if (!((Boolean) Oc.A.c().a(C8784lf.f76764C9)).booleanValue() || this.f42035a.f42042B.get()) {
            return;
        }
        if (this.f42035a.f42043C.getAndIncrement() < ((Integer) Oc.A.c().a(C8784lf.f76778D9)).intValue()) {
            this.f42035a.V9();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Sc.p.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) Oc.A.c().a(C8784lf.f76764C9)).booleanValue()) {
            C5569c.d(this.f42035a.f42057k, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", Gc.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.f42035a.f42043C.get())));
            this.f42035a.f42042B.set(true);
        }
    }
}
