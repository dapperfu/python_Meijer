package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.MutableContextWrapper;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class y8 {

    /* renamed from: e, reason: collision with root package name */
    private static y8 f94471e;

    /* renamed from: a, reason: collision with root package name */
    private MedalliaWebView.f f94472a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<MedalliaWebView.f, MedalliaWebView> f94473b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private ConfigurationContract f94474c;

    /* renamed from: d, reason: collision with root package name */
    private long f94475d;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MedalliaWebView.f f94476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Boolean f94477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j2 f94478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f94479d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MedalliaWebView.e f94480e;

        a(MedalliaWebView.f fVar, Boolean bool, j2 j2Var, Boolean bool2, MedalliaWebView.e eVar) {
            this.f94476a = fVar;
            this.f94477b = bool;
            this.f94478c = j2Var;
            this.f94479d = bool2;
            this.f94480e = eVar;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            MedalliaWebView medalliaWebViewA = (MedalliaWebView) y8.this.f94473b.get(this.f94476a);
            if (this.f94477b.booleanValue()) {
                if (medalliaWebViewA != null && this.f94476a == MedalliaWebView.f.preload && medalliaWebViewA.getFormData() != null && medalliaWebViewA.getFormData().equals(this.f94478c)) {
                    return;
                }
                if (medalliaWebViewA != null) {
                    y8.this.a(this.f94476a);
                }
                if (LifeCycle.b().e()) {
                    y8 y8Var = y8.this;
                    y8Var.a(y8Var.f94472a);
                }
                medalliaWebViewA = y8.this.a(this.f94476a, this.f94478c);
                medalliaWebViewA.setConfiguration(y8.this.f94474c);
                y8.this.f94473b.put(this.f94476a, medalliaWebViewA);
                if (!this.f94479d.booleanValue()) {
                    return;
                }
            } else if (!this.f94479d.booleanValue() || medalliaWebViewA == null) {
                return;
            }
            medalliaWebViewA.load(this.f94480e);
        }
    }

    private y8() {
    }

    protected ConfigurationContract a() {
        return this.f94474c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MedalliaWebView a(MedalliaWebView.f fVar, j2 j2Var) {
        this.f94472a = fVar;
        MutableContextWrapper mutableContextWrapperD = i4.c().d();
        long j10 = 1 + this.f94475d;
        this.f94475d = j10;
        MedalliaWebView medalliaWebView = new MedalliaWebView(mutableContextWrapperD, fVar, j2Var, j10);
        FS.trackWebView(medalliaWebView);
        medalliaWebView.loadUrl("about:blank");
        return medalliaWebView;
    }

    protected static y8 b() {
        if (f94471e == null) {
            f94471e = new y8();
        }
        return f94471e;
    }

    protected MedalliaWebView c(MedalliaWebView.f fVar) {
        return this.f94473b.get(fVar);
    }

    protected void b(MedalliaWebView.f fVar) {
        MedalliaWebView medalliaWebViewC;
        if (fVar == null || (medalliaWebViewC = c(fVar)) == null) {
            return;
        }
        a(medalliaWebViewC, true);
    }

    protected HashMap<MedalliaWebView.f, MedalliaWebView> c() {
        return this.f94473b;
    }

    protected void a(ConfigurationContract configurationContract) {
        this.f94474c = configurationContract;
    }

    protected void a(MedalliaWebView.f fVar) {
        if (fVar == MedalliaWebView.f.preload) {
            return;
        }
        a(this.f94473b.get(fVar));
    }

    public void a(MedalliaWebView.f fVar, j2 j2Var, o2 o2Var, b5 b5Var, boolean z10, boolean z11, int i10, int i11, boolean z12, Integer num) {
        MedalliaWebView medalliaWebView = new MedalliaWebView(i4.c().d(), true, o2Var, MedalliaWebView.f.showForm, j2Var, 0L, b5Var, z10, z11, i10, i11, z12, num);
        FS.trackWebView(medalliaWebView);
        medalliaWebView.loadUrl("about:blank");
        medalliaWebView.load(null);
        medalliaWebView.setType(fVar);
        this.f94472a = fVar;
        this.f94473b.put(fVar, medalliaWebView);
    }

    protected void a(MedalliaWebView medalliaWebView) {
        a(medalliaWebView, false);
    }

    protected void a(MedalliaWebView medalliaWebView, boolean z10) {
        MedalliaWebView medalliaWebView2;
        if (medalliaWebView == null || z10 || medalliaWebView.isPreload() || (medalliaWebView2 = this.f94473b.get(medalliaWebView.getWebViewType())) == null || medalliaWebView2.getWebViewId() != medalliaWebView.getWebViewId()) {
            return;
        }
        medalliaWebView2.clearAndDestroy();
        this.f94473b.remove(medalliaWebView.getWebViewType());
    }

    protected void a(j2 j2Var, MedalliaWebView.e eVar, MedalliaWebView.f fVar, Boolean bool, Boolean bool2) {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new a(fVar, bool, j2Var, bool2, eVar));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
