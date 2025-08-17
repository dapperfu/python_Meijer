package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8901nt extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f77155a;

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        InterfaceC9008ot interfaceC9008ot;
        Lc.b bVarZzd;
        try {
            interfaceC9008ot = this.f77155a;
        } catch (WindowManager.BadTokenException e10) {
            Qc.p.h("Fail to display Dialog.", e10);
        }
        if (interfaceC9008ot != null && interfaceC9008ot.zzN() != null && this.f77155a.zzN().zzd() != null && (bVarZzd = this.f77155a.zzN().zzd()) != null && !bVarZzd.c()) {
            bVarZzd.b("window." + str + "('" + str3 + "')");
            return false;
        }
        Lc.v.t();
        AlertDialog.Builder builderL = Pc.D0.l(context);
        builderL.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builderL.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC8687lt(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC8580kt(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC8473jt(jsPromptResult)).create().show();
        } else {
            builderL.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC8261ht(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC8154gt(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC8047ft(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.h hVarL = this.f77155a.l();
        if (hVarL == null) {
            Qc.p.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            hVarL.D9(view, customViewCallback);
            hVarL.C9(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC9008ot)) {
            return webView.getContext();
        }
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) webView;
        Activity activityZzi = interfaceC9008ot.zzi();
        return activityZzi != null ? activityZzi : interfaceC9008ot.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC9008ot)) {
            Qc.p.g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.h hVarL = ((InterfaceC9008ot) webView).l();
        if (hVarL == null) {
            Qc.p.g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            hVarL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f77155a.f() != null) {
            com.fullstory.FS.setWebViewClient(webView2, this.f77155a.f());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2b
            com.google.android.gms.internal.ads.ot r0 = r3.f77155a
            Lc.v.t()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = Pc.D0.b(r0, r1)
            r1 = 1
            if (r0 != 0) goto L25
            com.google.android.gms.internal.ads.ot r0 = r3.f77155a
            Lc.v.t()
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = Pc.D0.b(r0, r2)
            if (r0 == 0) goto L27
        L25:
            r0 = r1
            goto L28
        L27:
            r0 = 0
        L28:
            r5.invoke(r4, r0, r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8901nt.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.h hVarL = this.f77155a.l();
        if (hVarL == null) {
            Qc.p.g("Could not get ad overlay when hiding custom view.");
        } else {
            hVarL.zzg();
        }
    }

    public C8901nt(InterfaceC9008ot interfaceC9008ot) {
        this.f77155a = interfaceC9008ot;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = C8794mt.f76914a[consoleMessage.messageLevel().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 != 5) {
                    Qc.p.f(str);
                } else {
                    Qc.p.b(str);
                }
            } else {
                Qc.p.g(str);
            }
        } else {
            Qc.p.d(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(131072L, j13), 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
