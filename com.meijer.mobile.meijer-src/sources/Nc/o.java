package Nc;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.V60;

/* loaded from: classes4.dex */
final class o extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f20833a;

    o(u uVar) {
        this.f20833a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        u uVar = this.f20833a;
        if (uVar.f20849g != null) {
            try {
                uVar.f20849g.b(V60.d(1, null, null));
            } catch (RemoteException e10) {
                Sc.p.i("#007 Could not call remote method.", e10);
            }
        }
        u uVar2 = this.f20833a;
        if (uVar2.f20849g != null) {
            try {
                uVar2.f20849g.zze(0);
            } catch (RemoteException e11) {
                Sc.p.i("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f20833a.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            u uVar = this.f20833a;
            if (uVar.f20849g != null) {
                try {
                    uVar.f20849g.b(V60.d(3, null, null));
                } catch (RemoteException e10) {
                    Sc.p.i("#007 Could not call remote method.", e10);
                }
            }
            u uVar2 = this.f20833a;
            if (uVar2.f20849g != null) {
                try {
                    uVar2.f20849g.zze(3);
                } catch (RemoteException e11) {
                    Sc.p.i("#007 Could not call remote method.", e11);
                }
            }
            this.f20833a.B9(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            u uVar3 = this.f20833a;
            if (uVar3.f20849g != null) {
                try {
                    uVar3.f20849g.b(V60.d(1, null, null));
                } catch (RemoteException e12) {
                    Sc.p.i("#007 Could not call remote method.", e12);
                }
            }
            u uVar4 = this.f20833a;
            if (uVar4.f20849g != null) {
                try {
                    uVar4.f20849g.zze(0);
                } catch (RemoteException e13) {
                    Sc.p.i("#007 Could not call remote method.", e13);
                }
            }
            this.f20833a.B9(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            u uVar5 = this.f20833a;
            if (uVar5.f20849g != null) {
                try {
                    uVar5.f20849g.zzi();
                } catch (RemoteException e14) {
                    Sc.p.i("#007 Could not call remote method.", e14);
                }
            }
            this.f20833a.B9(this.f20833a.d(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        u uVar6 = this.f20833a;
        if (uVar6.f20849g != null) {
            try {
                uVar6.f20849g.zzc();
                this.f20833a.f20849g.zzh();
            } catch (RemoteException e15) {
                Sc.p.i("#007 Could not call remote method.", e15);
            }
        }
        u.K9(this.f20833a, u.H9(this.f20833a, str));
        return true;
    }
}
