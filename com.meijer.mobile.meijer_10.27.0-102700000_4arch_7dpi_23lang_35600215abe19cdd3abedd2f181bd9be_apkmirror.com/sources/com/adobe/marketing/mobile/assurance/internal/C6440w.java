package com.adobe.marketing.mobile.assurance.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.adobe.marketing.mobile.assurance.internal.C6420b;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6440w implements r {

    /* renamed from: a, reason: collision with root package name */
    private C6442y f62302a = null;

    /* renamed from: b, reason: collision with root package name */
    private d f62303b;

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$a */
    class a implements d {
        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.C6440w.d
        public void a(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            C6440w.this.k(byteArrayOutputStream);
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f62305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f62306b;

        b(Activity activity, d dVar) {
            this.f62305a = activity;
            this.f62306b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            View rootView = this.f62305a.getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
            d dVar = this.f62306b;
            if (dVar != null) {
                dVar.a(bitmapCreateBitmap);
            }
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$c */
    class c implements C6420b.InterfaceC1233b {
        c() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.C6420b.InterfaceC1233b
        public void a(String str) {
            HashMap map = new HashMap();
            map.put("blobId", "");
            map.put("error", str);
            C6430l c6430l = new C6430l("blob", map);
            String str2 = String.format("Error while taking screenshot - Description: %s", str);
            Q5.t.b("Assurance", "AssurancePluginScreenshot", str2, new Object[0]);
            if (C6440w.this.f62302a != null) {
                C6440w.this.f62302a.o(EnumC6429k.LOW, str2);
                C6440w.this.f62302a.u(c6430l);
            }
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.C6420b.InterfaceC1233b
        public void onSuccess(String str) {
            HashMap map = new HashMap();
            map.put("blobId", str);
            map.put("mimeType", "image/png");
            C6430l c6430l = new C6430l("blob", map);
            if (C6440w.this.f62302a == null) {
                Q5.t.f("Assurance", "AssurancePluginScreenshot", "Assurance Session instance is null for AssurancePluginScreenshot, Cannot send the screenshot event.", new Object[0]);
            } else {
                C6440w.this.f62302a.o(EnumC6429k.LOW, "Screenshot taken");
                C6440w.this.f62302a.u(c6430l);
            }
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$d */
    interface d {
        void a(Bitmap bitmap);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void a() {
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void b() {
        this.f62302a = null;
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void f(int i10) {
        this.f62303b = null;
    }

    private void j(d dVar) {
        if (this.f62302a == null) {
            Q5.t.b("Assurance", "AssurancePluginScreenshot", "Unable to take screenshot, Assurance session instance unavailable.", new Object[0]);
            return;
        }
        Activity activityC = Q5.K.f().a().c();
        if (activityC != null) {
            activityC.runOnUiThread(new b(activityC, dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(ByteArrayOutputStream byteArrayOutputStream) {
        if (this.f62302a == null) {
            Q5.t.b("Assurance", "AssurancePluginScreenshot", "Unable to send screenshot, Assurance session instance unavailable", new Object[0]);
        } else {
            C6420b.c(byteArrayOutputStream.toByteArray(), "image/jpeg", this.f62302a, new c());
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String c() {
        return "com.adobe.griffon.mobile";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public String d() {
        return "screenshot";
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void e(C6430l c6430l) {
        a aVar = new a();
        this.f62303b = aVar;
        j(aVar);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void g(C6442y c6442y) {
        this.f62302a = c6442y;
    }

    C6440w() {
    }
}
