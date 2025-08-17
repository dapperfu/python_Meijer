package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.j2;
import com.medallia.digital.mobilesdk.m6;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes7.dex */
class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final j2 f92472a;

    /* renamed from: b, reason: collision with root package name */
    private final n2 f92473b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f92474c;

    /* renamed from: d, reason: collision with root package name */
    protected ArrayList<ResourceContract> f92475d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private long f92476e;

    class a implements n6<p7> {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            l2 l2Var = l2.this;
            l2Var.f92474c = false;
            l2Var.a(l2Var.f92472a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(p7 p7Var) throws JSONException {
            l2 l2Var = l2.this;
            l2Var.f92474c = false;
            l2Var.f92472a.c(p7Var.a());
            l2 l2Var2 = l2.this;
            l2Var2.a(l2Var2.f92472a);
        }
    }

    class b implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92478a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f92479b;

        b(String str, n6 n6Var) {
            this.f92478a = str;
            this.f92479b = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.b(this.f92478a + " download failed");
            l2.this.f92472a.a(j2.a.FAILED);
            this.f92479b.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) {
            if (file == null) {
                a4.b(this.f92478a + " download failed");
                l2.this.f92472a.a(j2.a.FAILED);
                this.f92479b.a((h4) null);
                return;
            }
            a4.b(this.f92478a + " downloaded download complete");
            p7 p7Var = new p7(file.getAbsolutePath(), this.f92478a);
            f1.a().b(p7Var);
            this.f92479b.a((n6) p7Var);
        }
    }

    class c implements m6.b {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void a(ResourceContract resourceContract) throws JSONException {
            l2.this.f92475d.remove(resourceContract);
            int i10 = 0;
            while (true) {
                if (i10 >= l2.this.f92472a.f().size()) {
                    break;
                }
                if (l2.this.f92472a.f().get(i10).getRemoteUrl().equals(resourceContract.getRemoteUrl())) {
                    l2.this.f92472a.f().set(i10, resourceContract);
                    break;
                }
                i10++;
            }
            l2 l2Var = l2.this;
            l2Var.a(l2Var.f92472a);
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void b(ResourceContract resourceContract) throws JSONException {
            l2.this.f92475d.remove(resourceContract);
            l2.this.f92472a.a(j2.a.FAILED);
            l2 l2Var = l2.this;
            l2Var.a(l2Var.f92472a);
        }
    }

    protected l2(j2 j2Var, n2 n2Var) {
        this.f92472a = j2Var;
        this.f92473b = n2Var;
    }

    private void d() throws JSONException {
        this.f92476e = System.currentTimeMillis();
        a4.b("execute form: " + this.f92472a.getFormId());
        if (this.f92472a.c() == j2.a.AVAILABLE) {
            n2 n2Var = this.f92473b;
            if (n2Var != null) {
                n2Var.a(this.f92472a);
                return;
            }
            return;
        }
        this.f92472a.a(j2.a.IN_PROGRESS);
        p7 p7Var = (p7) f1.a().b(b0.a.Template, this.f92472a.h());
        boolean z10 = false;
        boolean z11 = (p7Var != null && this.f92472a.h().equals(p7Var.b()) && this.f92472a.g().equals(p7Var.a()) && this.f92472a.n()) ? false : true;
        if (!TextUtils.isEmpty(this.f92472a.h()) && z11) {
            z10 = true;
        }
        this.f92474c = z10;
        if (b() || z11) {
            a(new a());
        } else {
            a(this.f92472a);
        }
    }

    j2 a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return null;
        }
        return (j2) f1.a().b(b0.a.FormData, sDKConfigurationFormContract.getFormId());
    }

    boolean b() {
        if (this.f92472a.f() == null || this.f92472a.f().isEmpty()) {
            return false;
        }
        for (ResourceContract resourceContract : this.f92472a.f()) {
            resourceContract.setFormId(this.f92472a.getFormId());
            this.f92475d.add(resourceContract);
        }
        if (!this.f92475d.isEmpty()) {
            a(this.f92475d);
        }
        a4.b("Resources downloading finished for form: " + this.f92472a.getFormId());
        return true;
    }

    boolean c() {
        return this.f92474c || !this.f92475d.isEmpty();
    }

    protected void a() throws JSONException {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j2 j2Var) throws JSONException {
        if (c()) {
            return;
        }
        if (j2Var.c() != j2.a.FAILED) {
            j2Var.a(j2.a.AVAILABLE);
        }
        f1.a().c(j2Var);
        n2 n2Var = this.f92473b;
        if (n2Var != null) {
            n2Var.a(j2Var);
        }
        a4.b("Form: " + j2Var.getFormId() + " was preloaded");
        AnalyticsBridge.getInstance().reportPreloadMechanismEvent(this.f92476e, System.currentTimeMillis(), j2Var.getFormId(), j2Var.c());
    }

    void a(n6<p7> n6Var) {
        String templateDebugRemoteUrl = this.f92472a.n() ? this.f92472a.getTemplateDebugRemoteUrl() : this.f92472a.h();
        if (this.f92472a.n()) {
            f1.a().a(b0.a.Template, this.f92472a.h());
        } else {
            f1.a().a(b0.a.Template, this.f92472a.getTemplateDebugRemoteUrl());
        }
        p7 p7Var = (p7) f1.a().b(b0.a.Template, templateDebugRemoteUrl);
        if (p7Var != null) {
            n6Var.a((n6<p7>) p7Var);
        } else {
            s4.f().a(templateDebugRemoteUrl, this.f92472a.g(), new b(templateDebugRemoteUrl, n6Var));
        }
    }

    void a(List<ResourceContract> list) {
        new m6(list, new c());
    }
}
