package Lc;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.V60;

/* loaded from: classes4.dex */
final class o extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f18013a;

    o(u uVar) {
        this.f18013a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        u uVar = this.f18013a;
        if (uVar.f18029g != null) {
            try {
                uVar.f18029g.b(V60.d(1, null, null));
            } catch (RemoteException e10) {
                Qc.p.i("#007 Could not call remote method.", e10);
            }
        }
        u uVar2 = this.f18013a;
        if (uVar2.f18029g != null) {
            try {
                uVar2.f18029g.zze(0);
            } catch (RemoteException e11) {
                Qc.p.i("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f18013a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            u uVar = this.f18013a;
            if (uVar.f18029g != null) {
                try {
                    uVar.f18029g.b(V60.d(3, null, null));
                } catch (RemoteException e10) {
                    Qc.p.i("#007 Could not call remote method.", e10);
                }
            }
            u uVar2 = this.f18013a;
            if (uVar2.f18029g != null) {
                try {
                    uVar2.f18029g.zze(3);
                } catch (RemoteException e11) {
                    Qc.p.i("#007 Could not call remote method.", e11);
                }
            }
            this.f18013a.B9(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            u uVar3 = this.f18013a;
            if (uVar3.f18029g != null) {
                try {
                    uVar3.f18029g.b(V60.d(1, null, null));
                } catch (RemoteException e12) {
                    Qc.p.i("#007 Could not call remote method.", e12);
                }
            }
            u uVar4 = this.f18013a;
            if (uVar4.f18029g != null) {
                try {
                    uVar4.f18029g.zze(0);
                } catch (RemoteException e13) {
                    Qc.p.i("#007 Could not call remote method.", e13);
                }
            }
            this.f18013a.B9(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            u uVar5 = this.f18013a;
            if (uVar5.f18029g != null) {
                try {
                    uVar5.f18029g.zzi();
                } catch (RemoteException e14) {
                    Qc.p.i("#007 Could not call remote method.", e14);
                }
            }
            this.f18013a.B9(this.f18013a.d(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        u uVar6 = this.f18013a;
        if (uVar6.f18029g != null) {
            try {
                uVar6.f18029g.zzc();
                this.f18013a.f18029g.zzh();
            } catch (RemoteException e15) {
                Qc.p.i("#007 Could not call remote method.", e15);
            }
        }
        u.K9(this.f18013a, u.H9(this.f18013a, str));
        return true;
    }
}
