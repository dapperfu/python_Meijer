package Xc;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.Ij0;
import com.google.android.gms.internal.ads.InterfaceC6962In;
import java.util.List;

/* renamed from: Xc.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5586u implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6962In f42028a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f42029b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC5588w f42030c;

    C5586u(BinderC5588w binderC5588w, InterfaceC6962In interfaceC6962In, boolean z10) {
        this.f42028a = interfaceC6962In;
        this.f42029b = z10;
        this.f42030c = binderC5588w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f42028a.a("Internal error: " + th2.getMessage());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            BinderC5588w.J9(this.f42030c, list);
            this.f42028a.R1(list);
            if (!this.f42030c.f42060n && !this.f42029b) {
                return;
            }
            for (Uri uri : list) {
                if (this.f42030c.Q9(uri)) {
                    this.f42030c.f42058l.d(BinderC5588w.aa(uri, this.f42030c.f42068v, "1").toString(), null, null);
                } else {
                    if (((Boolean) Oc.A.c().a(C8784lf.f77265m7)).booleanValue()) {
                        this.f42030c.f42058l.d(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
