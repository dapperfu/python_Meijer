package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.j2;
import com.medallia.digital.mobilesdk.m6;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes8.dex */
class l2 {

    /* renamed from: a, reason: collision with root package name */
    private final j2 f93311a;

    /* renamed from: b, reason: collision with root package name */
    private final n2 f93312b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f93313c;

    /* renamed from: d, reason: collision with root package name */
    protected ArrayList<ResourceContract> f93314d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private long f93315e;

    class a implements n6<p7> {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            l2 l2Var = l2.this;
            l2Var.f93313c = false;
            l2Var.a(l2Var.f93311a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(p7 p7Var) throws JSONException {
            l2 l2Var = l2.this;
            l2Var.f93313c = false;
            l2Var.f93311a.c(p7Var.a());
            l2 l2Var2 = l2.this;
            l2Var2.a(l2Var2.f93311a);
        }
    }

    class b implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93317a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n6 f93318b;

        b(String str, n6 n6Var) {
            this.f93317a = str;
            this.f93318b = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.b(this.f93317a + " download failed");
            l2.this.f93311a.a(j2.a.FAILED);
            this.f93318b.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) {
            if (file == null) {
                a4.b(this.f93317a + " download failed");
                l2.this.f93311a.a(j2.a.FAILED);
                this.f93318b.a((h4) null);
                return;
            }
            a4.b(this.f93317a + " downloaded download complete");
            p7 p7Var = new p7(file.getAbsolutePath(), this.f93317a);
            f1.a().b(p7Var);
            this.f93318b.a((n6) p7Var);
        }
    }

    class c implements m6.b {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void a(ResourceContract resourceContract) throws JSONException {
            l2.this.f93314d.remove(resourceContract);
            int i10 = 0;
            while (true) {
                if (i10 >= l2.this.f93311a.f().size()) {
                    break;
                }
                if (l2.this.f93311a.f().get(i10).getRemoteUrl().equals(resourceContract.getRemoteUrl())) {
                    l2.this.f93311a.f().set(i10, resourceContract);
                    break;
                }
                i10++;
            }
            l2 l2Var = l2.this;
            l2Var.a(l2Var.f93311a);
        }

        @Override // com.medallia.digital.mobilesdk.m6.b
        public void b(ResourceContract resourceContract) throws JSONException {
            l2.this.f93314d.remove(resourceContract);
            l2.this.f93311a.a(j2.a.FAILED);
            l2 l2Var = l2.this;
            l2Var.a(l2Var.f93311a);
        }
    }

    protected l2(j2 j2Var, n2 n2Var) {
        this.f93311a = j2Var;
        this.f93312b = n2Var;
    }

    private void d() throws JSONException {
        this.f93315e = System.currentTimeMillis();
        a4.b("execute form: " + this.f93311a.getFormId());
        if (this.f93311a.c() == j2.a.AVAILABLE) {
            n2 n2Var = this.f93312b;
            if (n2Var != null) {
                n2Var.a(this.f93311a);
                return;
            }
            return;
        }
        this.f93311a.a(j2.a.IN_PROGRESS);
        p7 p7Var = (p7) f1.a().b(b0.a.Template, this.f93311a.h());
        boolean z10 = false;
        boolean z11 = (p7Var != null && this.f93311a.h().equals(p7Var.b()) && this.f93311a.g().equals(p7Var.a()) && this.f93311a.n()) ? false : true;
        if (!TextUtils.isEmpty(this.f93311a.h()) && z11) {
            z10 = true;
        }
        this.f93313c = z10;
        if (b() || z11) {
            a(new a());
        } else {
            a(this.f93311a);
        }
    }

    j2 a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return null;
        }
        return (j2) f1.a().b(b0.a.FormData, sDKConfigurationFormContract.getFormId());
    }

    boolean b() {
        if (this.f93311a.f() == null || this.f93311a.f().isEmpty()) {
            return false;
        }
        for (ResourceContract resourceContract : this.f93311a.f()) {
            resourceContract.setFormId(this.f93311a.getFormId());
            this.f93314d.add(resourceContract);
        }
        if (!this.f93314d.isEmpty()) {
            a(this.f93314d);
        }
        a4.b("Resources downloading finished for form: " + this.f93311a.getFormId());
        return true;
    }

    boolean c() {
        return this.f93313c || !this.f93314d.isEmpty();
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
        n2 n2Var = this.f93312b;
        if (n2Var != null) {
            n2Var.a(j2Var);
        }
        a4.b("Form: " + j2Var.getFormId() + " was preloaded");
        AnalyticsBridge.getInstance().reportPreloadMechanismEvent(this.f93315e, System.currentTimeMillis(), j2Var.getFormId(), j2Var.c());
    }

    void a(n6<p7> n6Var) {
        String templateDebugRemoteUrl = this.f93311a.n() ? this.f93311a.getTemplateDebugRemoteUrl() : this.f93311a.h();
        if (this.f93311a.n()) {
            f1.a().a(b0.a.Template, this.f93311a.h());
        } else {
            f1.a().a(b0.a.Template, this.f93311a.getTemplateDebugRemoteUrl());
        }
        p7 p7Var = (p7) f1.a().b(b0.a.Template, templateDebugRemoteUrl);
        if (p7Var != null) {
            n6Var.a((n6<p7>) p7Var);
        } else {
            s4.f().a(templateDebugRemoteUrl, this.f93311a.g(), new b(templateDebugRemoteUrl, n6Var));
        }
    }

    void a(List<ResourceContract> list) {
        new m6(list, new c());
    }
}
