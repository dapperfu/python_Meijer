package com.adobe.marketing.mobile.assurance.internal;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.adobe.marketing.mobile.assurance.internal.C6545b;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6565w implements r {

    /* renamed from: a, reason: collision with root package name */
    private C6567y f63141a = null;

    /* renamed from: b, reason: collision with root package name */
    private d f63142b;

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$a */
    class a implements d {
        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.C6565w.d
        public void a(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            C6565w.this.k(byteArrayOutputStream);
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f63144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f63145b;

        b(Activity activity, d dVar) {
            this.f63144a = activity;
            this.f63145b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            View rootView = this.f63144a.getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
            d dVar = this.f63145b;
            if (dVar != null) {
                dVar.a(bitmapCreateBitmap);
            }
        }
    }

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.w$c */
    class c implements C6545b.InterfaceC1243b {
        c() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.C6545b.InterfaceC1243b
        public void a(String str) {
            HashMap map = new HashMap();
            map.put("blobId", "");
            map.put("error", str);
            C6555l c6555l = new C6555l("blob", map);
            String str2 = String.format("Error while taking screenshot - Description: %s", str);
            R5.t.b("Assurance", "AssurancePluginScreenshot", str2, new Object[0]);
            if (C6565w.this.f63141a != null) {
                C6565w.this.f63141a.o(EnumC6554k.LOW, str2);
                C6565w.this.f63141a.u(c6555l);
            }
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.C6545b.InterfaceC1243b
        public void onSuccess(String str) {
            HashMap map = new HashMap();
            map.put("blobId", str);
            map.put("mimeType", "image/png");
            C6555l c6555l = new C6555l("blob", map);
            if (C6565w.this.f63141a == null) {
                R5.t.f("Assurance", "AssurancePluginScreenshot", "Assurance Session instance is null for AssurancePluginScreenshot, Cannot send the screenshot event.", new Object[0]);
            } else {
                C6565w.this.f63141a.o(EnumC6554k.LOW, "Screenshot taken");
                C6565w.this.f63141a.u(c6555l);
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
        this.f63141a = null;
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void f(int i10) {
        this.f63142b = null;
    }

    private void j(d dVar) {
        if (this.f63141a == null) {
            R5.t.b("Assurance", "AssurancePluginScreenshot", "Unable to take screenshot, Assurance session instance unavailable.", new Object[0]);
            return;
        }
        Activity activityC = R5.K.f().a().c();
        if (activityC != null) {
            activityC.runOnUiThread(new b(activityC, dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(ByteArrayOutputStream byteArrayOutputStream) {
        if (this.f63141a == null) {
            R5.t.b("Assurance", "AssurancePluginScreenshot", "Unable to send screenshot, Assurance session instance unavailable", new Object[0]);
        } else {
            C6545b.c(byteArrayOutputStream.toByteArray(), "image/jpeg", this.f63141a, new c());
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
    public void e(C6555l c6555l) {
        a aVar = new a();
        this.f63142b = aVar;
        j(aVar);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.r
    public void g(C6567y c6567y) {
        this.f63141a = c6567y;
    }

    C6565w() {
    }
}
