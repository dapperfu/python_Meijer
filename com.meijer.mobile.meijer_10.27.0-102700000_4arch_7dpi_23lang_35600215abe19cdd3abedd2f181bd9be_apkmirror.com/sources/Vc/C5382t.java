package Vc;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.Ij0;
import com.google.android.gms.internal.ads.InterfaceC6837In;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Vc.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5382t implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6837In f37309a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f37310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC5385w f37311c;

    C5382t(BinderC5385w binderC5385w, InterfaceC6837In interfaceC6837In, boolean z10) {
        this.f37309a = interfaceC6837In;
        this.f37310b = z10;
        this.f37311c = binderC5385w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f37309a.a("Internal error: " + th2.getMessage());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f37309a.K1(arrayList);
            if (!this.f37311c.f37347m && !this.f37310b) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (this.f37311c.R9(uri)) {
                    this.f37311c.f37346l.d(BinderC5385w.aa(uri, this.f37311c.f37356v, "1").toString(), null, null);
                } else {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76425m7)).booleanValue()) {
                        this.f37311c.f37346l.d(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
