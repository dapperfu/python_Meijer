package Vc;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.Ij0;
import com.google.android.gms.internal.ads.InterfaceC6837In;
import java.util.List;

/* renamed from: Vc.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5383u implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6837In f37316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f37317b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC5385w f37318c;

    C5383u(BinderC5385w binderC5385w, InterfaceC6837In interfaceC6837In, boolean z10) {
        this.f37316a = interfaceC6837In;
        this.f37317b = z10;
        this.f37318c = binderC5385w;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        try {
            this.f37316a.a("Internal error: " + th2.getMessage());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            BinderC5385w.J9(this.f37318c, list);
            this.f37316a.K1(list);
            if (!this.f37318c.f37348n && !this.f37317b) {
                return;
            }
            for (Uri uri : list) {
                if (this.f37318c.Q9(uri)) {
                    this.f37318c.f37346l.d(BinderC5385w.aa(uri, this.f37318c.f37356v, "1").toString(), null, null);
                } else {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76425m7)).booleanValue()) {
                        this.f37318c.f37346l.d(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
