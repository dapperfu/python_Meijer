package Xc;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.Ij0;
import com.google.android.gms.internal.ads.InterfaceC6962In;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Xc.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5585t implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6962In f42021a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f42022b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC5588w f42023c;

    C5585t(BinderC5588w binderC5588w, InterfaceC6962In interfaceC6962In, boolean z10) {
        this.f42021a = interfaceC6962In;
        this.f42022b = z10;
        this.f42023c = binderC5588w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f42021a.a("Internal error: " + th2.getMessage());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f42021a.R1(arrayList);
            if (!this.f42023c.f42059m && !this.f42022b) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (this.f42023c.R9(uri)) {
                    this.f42023c.f42058l.d(BinderC5588w.aa(uri, this.f42023c.f42068v, "1").toString(), null, null);
                } else {
                    if (((Boolean) Oc.A.c().a(C8784lf.f77265m7)).booleanValue()) {
                        this.f42023c.f42058l.d(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
