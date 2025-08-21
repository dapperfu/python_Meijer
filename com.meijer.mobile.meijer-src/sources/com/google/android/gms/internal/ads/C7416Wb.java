package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import io.constructor.data.local.PreferencesHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Wb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7416Wb extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private boolean f71959a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71960b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f71961c;

    /* renamed from: d, reason: collision with root package name */
    private final C7112Nb f71962d;

    /* renamed from: e, reason: collision with root package name */
    private final int f71963e;

    /* renamed from: f, reason: collision with root package name */
    private final int f71964f;

    /* renamed from: g, reason: collision with root package name */
    private final int f71965g;

    /* renamed from: h, reason: collision with root package name */
    private final int f71966h;

    /* renamed from: i, reason: collision with root package name */
    private final int f71967i;

    /* renamed from: j, reason: collision with root package name */
    private final int f71968j;

    /* renamed from: k, reason: collision with root package name */
    private final int f71969k;

    /* renamed from: l, reason: collision with root package name */
    private final int f71970l;

    /* renamed from: m, reason: collision with root package name */
    private final String f71971m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f71972n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f71973o;

    final C7383Vb a(View view, C7045Lb c7045Lb) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    c7045Lb.h(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new C7383Vb(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof InterfaceC9133ot)) {
                WebView webView = (WebView) view;
                if (com.google.android.gms.common.util.n.b()) {
                    c7045Lb.f();
                    webView.post(new RunnableC7350Ub(this, c7045Lb, webView, globalVisibleRect));
                    return new C7383Vb(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    C7383Vb c7383VbA = a(viewGroup.getChildAt(i12), c7045Lb);
                    i10 += c7383VbA.f71729a;
                    i11 += c7383VbA.f71730b;
                }
                return new C7383Vb(this, i10, i11);
            }
        }
        return new C7383Vb(this, 0, 0);
    }

    public C7416Wb() {
        C7112Nb c7112Nb = new C7112Nb();
        this.f71959a = false;
        this.f71960b = false;
        this.f71962d = c7112Nb;
        this.f71961c = new Object();
        this.f71964f = ((Long) C7933dg.f74293d.e()).intValue();
        this.f71965g = ((Long) C7933dg.f74290a.e()).intValue();
        this.f71966h = ((Long) C7933dg.f74294e.e()).intValue();
        this.f71967i = ((Long) C7933dg.f74292c.e()).intValue();
        this.f71968j = ((Integer) Oc.A.c().a(C8784lf.f77146e0)).intValue();
        this.f71969k = ((Integer) Oc.A.c().a(C8784lf.f77160f0)).intValue();
        this.f71970l = ((Integer) Oc.A.c().a(C8784lf.f77174g0)).intValue();
        this.f71963e = ((Long) C7933dg.f74295f.e()).intValue();
        this.f71971m = (String) Oc.A.c().a(C8784lf.f77202i0);
        this.f71972n = ((Boolean) Oc.A.c().a(C8784lf.f77216j0)).booleanValue();
        this.f71973o = ((Boolean) Oc.A.c().a(C8784lf.f77230k0)).booleanValue();
        ((Boolean) Oc.A.c().a(C8784lf.f77244l0)).getClass();
        setName("ContentFetchTask");
    }

    final void b(View view) {
        try {
            C7045Lb c7045Lb = new C7045Lb(this.f71964f, this.f71965g, this.f71966h, this.f71967i, this.f71968j, this.f71969k, this.f71970l, this.f71973o);
            Context contextB = Nc.v.e().b();
            if (contextB != null && !TextUtils.isEmpty(this.f71971m)) {
                String str = (String) view.getTag(contextB.getResources().getIdentifier((String) Oc.A.c().a(C8784lf.f77188h0), PreferencesHelper.PREF_ID, contextB.getPackageName()));
                if (str != null && str.equals(this.f71971m)) {
                    return;
                }
            }
            C7383Vb c7383VbA = a(view, c7045Lb);
            c7045Lb.j();
            if (c7383VbA.f71729a == 0 && c7383VbA.f71730b == 0) {
                return;
            }
            int i10 = c7383VbA.f71730b;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.f71962d.a(c7045Lb);
            } else if (c7045Lb.b() == 0) {
                return;
            }
            if (this.f71962d.c(c7045Lb)) {
                return;
            }
            this.f71962d.a(c7045Lb);
        } catch (Exception e10) {
            Sc.p.e("Exception in fetchContentOnUIThread", e10);
            Nc.v.s().x(e10, "ContentFetchTask.fetchContent");
        }
    }

    public final void e() {
        synchronized (this.f71961c) {
            try {
                if (this.f71959a) {
                    Sc.p.b("Content hash thread already started, quitting...");
                } else {
                    this.f71959a = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f71961c) {
            this.f71960b = true;
            Sc.p.b("ContentFetchThread: paused, pause = true");
        }
    }

    final void c(C7045Lb c7045Lb, WebView webView, String str, boolean z10) {
        C7045Lb c7045Lb2;
        c7045Lb.e();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (!this.f71972n && !TextUtils.isEmpty(webView.getTitle())) {
                    c7045Lb.i(webView.getTitle() + "\n" + strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    c7045Lb2 = c7045Lb;
                } else {
                    c7045Lb2 = c7045Lb;
                    c7045Lb2.i(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            } else {
                c7045Lb2 = c7045Lb;
            }
            if (c7045Lb2.l()) {
                this.f71962d.b(c7045Lb2);
            }
        } catch (JSONException unused) {
            Sc.p.b("Json string may be malformed.");
        } catch (Throwable th2) {
            Sc.p.c("Failed to get webview content.", th2);
            Nc.v.s().x(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = Nc.v.e().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        Sc.p.b("ContentFetchThread: no activity. Sleeping.");
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        Nc.v.s().x(r0, "ContentFetchTask.extractContent");
        Sc.p.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        Sc.p.e("Error in ContentFetchTask", r0);
        Nc.v.s().x(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        Sc.p.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7416Wb.run():void");
    }
}
