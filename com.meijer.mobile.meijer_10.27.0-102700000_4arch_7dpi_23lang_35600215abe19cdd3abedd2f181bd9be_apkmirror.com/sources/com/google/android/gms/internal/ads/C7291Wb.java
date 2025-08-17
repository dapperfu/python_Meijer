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
public final class C7291Wb extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private boolean f71119a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f71120b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f71121c;

    /* renamed from: d, reason: collision with root package name */
    private final C6987Nb f71122d;

    /* renamed from: e, reason: collision with root package name */
    private final int f71123e;

    /* renamed from: f, reason: collision with root package name */
    private final int f71124f;

    /* renamed from: g, reason: collision with root package name */
    private final int f71125g;

    /* renamed from: h, reason: collision with root package name */
    private final int f71126h;

    /* renamed from: i, reason: collision with root package name */
    private final int f71127i;

    /* renamed from: j, reason: collision with root package name */
    private final int f71128j;

    /* renamed from: k, reason: collision with root package name */
    private final int f71129k;

    /* renamed from: l, reason: collision with root package name */
    private final int f71130l;

    /* renamed from: m, reason: collision with root package name */
    private final String f71131m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f71132n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f71133o;

    final C7258Vb a(View view, C6920Lb c6920Lb) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    c6920Lb.h(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new C7258Vb(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof InterfaceC9008ot)) {
                WebView webView = (WebView) view;
                if (com.google.android.gms.common.util.n.b()) {
                    c6920Lb.f();
                    webView.post(new RunnableC7225Ub(this, c6920Lb, webView, globalVisibleRect));
                    return new C7258Vb(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    C7258Vb c7258VbA = a(viewGroup.getChildAt(i12), c6920Lb);
                    i10 += c7258VbA.f70889a;
                    i11 += c7258VbA.f70890b;
                }
                return new C7258Vb(this, i10, i11);
            }
        }
        return new C7258Vb(this, 0, 0);
    }

    public C7291Wb() {
        C6987Nb c6987Nb = new C6987Nb();
        this.f71119a = false;
        this.f71120b = false;
        this.f71122d = c6987Nb;
        this.f71121c = new Object();
        this.f71124f = ((Long) C7808dg.f73453d.e()).intValue();
        this.f71125g = ((Long) C7808dg.f73450a.e()).intValue();
        this.f71126h = ((Long) C7808dg.f73454e.e()).intValue();
        this.f71127i = ((Long) C7808dg.f73452c.e()).intValue();
        this.f71128j = ((Integer) Mc.A.c().a(C8659lf.f76306e0)).intValue();
        this.f71129k = ((Integer) Mc.A.c().a(C8659lf.f76320f0)).intValue();
        this.f71130l = ((Integer) Mc.A.c().a(C8659lf.f76334g0)).intValue();
        this.f71123e = ((Long) C7808dg.f73455f.e()).intValue();
        this.f71131m = (String) Mc.A.c().a(C8659lf.f76362i0);
        this.f71132n = ((Boolean) Mc.A.c().a(C8659lf.f76376j0)).booleanValue();
        this.f71133o = ((Boolean) Mc.A.c().a(C8659lf.f76390k0)).booleanValue();
        ((Boolean) Mc.A.c().a(C8659lf.f76404l0)).getClass();
        setName("ContentFetchTask");
    }

    final void b(View view) {
        try {
            C6920Lb c6920Lb = new C6920Lb(this.f71124f, this.f71125g, this.f71126h, this.f71127i, this.f71128j, this.f71129k, this.f71130l, this.f71133o);
            Context contextB = Lc.v.e().b();
            if (contextB != null && !TextUtils.isEmpty(this.f71131m)) {
                String str = (String) view.getTag(contextB.getResources().getIdentifier((String) Mc.A.c().a(C8659lf.f76348h0), PreferencesHelper.PREF_ID, contextB.getPackageName()));
                if (str != null && str.equals(this.f71131m)) {
                    return;
                }
            }
            C7258Vb c7258VbA = a(view, c6920Lb);
            c6920Lb.j();
            if (c7258VbA.f70889a == 0 && c7258VbA.f70890b == 0) {
                return;
            }
            int i10 = c7258VbA.f70890b;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.f71122d.a(c6920Lb);
            } else if (c6920Lb.b() == 0) {
                return;
            }
            if (this.f71122d.c(c6920Lb)) {
                return;
            }
            this.f71122d.a(c6920Lb);
        } catch (Exception e10) {
            Qc.p.e("Exception in fetchContentOnUIThread", e10);
            Lc.v.s().x(e10, "ContentFetchTask.fetchContent");
        }
    }

    public final void e() {
        synchronized (this.f71121c) {
            try {
                if (this.f71119a) {
                    Qc.p.b("Content hash thread already started, quitting...");
                } else {
                    this.f71119a = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f71121c) {
            this.f71120b = true;
            Qc.p.b("ContentFetchThread: paused, pause = true");
        }
    }

    final void c(C6920Lb c6920Lb, WebView webView, String str, boolean z10) {
        C6920Lb c6920Lb2;
        c6920Lb.e();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (!this.f71132n && !TextUtils.isEmpty(webView.getTitle())) {
                    c6920Lb.i(webView.getTitle() + "\n" + strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    c6920Lb2 = c6920Lb;
                } else {
                    c6920Lb2 = c6920Lb;
                    c6920Lb2.i(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            } else {
                c6920Lb2 = c6920Lb;
            }
            if (c6920Lb2.l()) {
                this.f71122d.b(c6920Lb2);
            }
        } catch (JSONException unused) {
            Qc.p.b("Json string may be malformed.");
        } catch (Throwable th2) {
            Qc.p.c("Failed to get webview content.", th2);
            Lc.v.s().x(th2, "ContentFetchTask.processWebViewContent");
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
    
        r0 = Lc.v.e().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        Qc.p.b("ContentFetchThread: no activity. Sleeping.");
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
    
        Lc.v.s().x(r0, "ContentFetchTask.extractContent");
        Qc.p.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        Qc.p.e("Error in ContentFetchTask", r0);
        Lc.v.s().x(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        Qc.p.e("Error in ContentFetchTask", r0);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7291Wb.run():void");
    }
}
