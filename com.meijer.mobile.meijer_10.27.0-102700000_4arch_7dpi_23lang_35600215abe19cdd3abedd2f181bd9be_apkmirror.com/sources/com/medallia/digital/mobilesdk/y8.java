package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.MutableContextWrapper;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.util.HashMap;

/* loaded from: classes7.dex */
final class y8 {

    /* renamed from: e, reason: collision with root package name */
    private static y8 f93632e;

    /* renamed from: a, reason: collision with root package name */
    private MedalliaWebView.f f93633a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<MedalliaWebView.f, MedalliaWebView> f93634b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private ConfigurationContract f93635c;

    /* renamed from: d, reason: collision with root package name */
    private long f93636d;

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MedalliaWebView.f f93637a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Boolean f93638b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j2 f93639c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f93640d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MedalliaWebView.e f93641e;

        a(MedalliaWebView.f fVar, Boolean bool, j2 j2Var, Boolean bool2, MedalliaWebView.e eVar) {
            this.f93637a = fVar;
            this.f93638b = bool;
            this.f93639c = j2Var;
            this.f93640d = bool2;
            this.f93641e = eVar;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            MedalliaWebView medalliaWebViewA = (MedalliaWebView) y8.this.f93634b.get(this.f93637a);
            if (this.f93638b.booleanValue()) {
                if (medalliaWebViewA != null && this.f93637a == MedalliaWebView.f.preload && medalliaWebViewA.getFormData() != null && medalliaWebViewA.getFormData().equals(this.f93639c)) {
                    return;
                }
                if (medalliaWebViewA != null) {
                    y8.this.a(this.f93637a);
                }
                if (LifeCycle.b().e()) {
                    y8 y8Var = y8.this;
                    y8Var.a(y8Var.f93633a);
                }
                medalliaWebViewA = y8.this.a(this.f93637a, this.f93639c);
                medalliaWebViewA.setConfiguration(y8.this.f93635c);
                y8.this.f93634b.put(this.f93637a, medalliaWebViewA);
                if (!this.f93640d.booleanValue()) {
                    return;
                }
            } else if (!this.f93640d.booleanValue() || medalliaWebViewA == null) {
                return;
            }
            medalliaWebViewA.load(this.f93641e);
        }
    }

    private y8() {
    }

    protected ConfigurationContract a() {
        return this.f93635c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MedalliaWebView a(MedalliaWebView.f fVar, j2 j2Var) {
        this.f93633a = fVar;
        MutableContextWrapper mutableContextWrapperD = i4.c().d();
        long j10 = 1 + this.f93636d;
        this.f93636d = j10;
        MedalliaWebView medalliaWebView = new MedalliaWebView(mutableContextWrapperD, fVar, j2Var, j10);
        FS.trackWebView(medalliaWebView);
        medalliaWebView.loadUrl("about:blank");
        return medalliaWebView;
    }

    protected static y8 b() {
        if (f93632e == null) {
            f93632e = new y8();
        }
        return f93632e;
    }

    protected MedalliaWebView c(MedalliaWebView.f fVar) {
        return this.f93634b.get(fVar);
    }

    protected void b(MedalliaWebView.f fVar) {
        MedalliaWebView medalliaWebViewC;
        if (fVar == null || (medalliaWebViewC = c(fVar)) == null) {
            return;
        }
        a(medalliaWebViewC, true);
    }

    protected HashMap<MedalliaWebView.f, MedalliaWebView> c() {
        return this.f93634b;
    }

    protected void a(ConfigurationContract configurationContract) {
        this.f93635c = configurationContract;
    }

    protected void a(MedalliaWebView.f fVar) {
        if (fVar == MedalliaWebView.f.preload) {
            return;
        }
        a(this.f93634b.get(fVar));
    }

    public void a(MedalliaWebView.f fVar, j2 j2Var, o2 o2Var, b5 b5Var, boolean z10, boolean z11, int i10, int i11, boolean z12, Integer num) {
        MedalliaWebView medalliaWebView = new MedalliaWebView(i4.c().d(), true, o2Var, MedalliaWebView.f.showForm, j2Var, 0L, b5Var, z10, z11, i10, i11, z12, num);
        FS.trackWebView(medalliaWebView);
        medalliaWebView.loadUrl("about:blank");
        medalliaWebView.load(null);
        medalliaWebView.setType(fVar);
        this.f93633a = fVar;
        this.f93634b.put(fVar, medalliaWebView);
    }

    protected void a(MedalliaWebView medalliaWebView) {
        a(medalliaWebView, false);
    }

    protected void a(MedalliaWebView medalliaWebView, boolean z10) {
        MedalliaWebView medalliaWebView2;
        if (medalliaWebView == null || z10 || medalliaWebView.isPreload() || (medalliaWebView2 = this.f93634b.get(medalliaWebView.getWebViewType())) == null || medalliaWebView2.getWebViewId() != medalliaWebView.getWebViewId()) {
            return;
        }
        medalliaWebView2.clearAndDestroy();
        this.f93634b.remove(medalliaWebView.getWebViewType());
    }

    protected void a(j2 j2Var, MedalliaWebView.e eVar, MedalliaWebView.f fVar, Boolean bool, Boolean bool2) {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new a(fVar, bool, j2Var, bool2, eVar));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
