package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class k7 {

    /* renamed from: d, reason: collision with root package name */
    private static k7 f93283d;

    /* renamed from: a, reason: collision with root package name */
    private j7 f93284a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93285b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f93286c;

    private k7() {
    }

    protected static k7 b() {
        if (f93283d == null) {
            f93283d = new k7();
        }
        return f93283d;
    }

    ArrayList<t1> a() {
        j7 j7Var = this.f93284a;
        if (j7Var != null) {
            return j7Var.b();
        }
        return null;
    }

    boolean c() {
        j7 j7Var = this.f93284a;
        if (j7Var != null) {
            return j7Var.c();
        }
        return false;
    }

    void a(ConfigurationContract configurationContract) {
        MedalliaDigitalBrainConfigurationContract medalliaDigitalBrain;
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || (medalliaDigitalBrain = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain()) == null) {
            return;
        }
        boolean zIsTREV2Enabled = medalliaDigitalBrain.isTREV2Enabled();
        this.f93284a = zIsTREV2Enabled ? new n7() : new m7();
        this.f93284a.a(this.f93285b, this.f93286c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TargetEvaluator ");
        sb2.append(zIsTREV2Enabled ? "V2" : "V1");
        sb2.append(" is running");
        a4.e(sb2.toString());
    }

    void b(ConfigurationContract configurationContract) {
        j7 j7Var = this.f93284a;
        if (j7Var != null) {
            j7Var.a(configurationContract);
        }
    }

    void a(u1.b bVar) {
        j7 j7Var = this.f93284a;
        if (j7Var != null) {
            j7Var.a(bVar);
        }
    }

    void a(boolean z10) {
        j7 j7Var = this.f93284a;
        if (j7Var != null) {
            j7Var.a(z10);
        } else {
            this.f93286c = z10;
        }
    }

    void a(boolean z10, boolean z11) {
        j7 j7Var = this.f93284a;
        if (j7Var == null || !z11) {
            this.f93285b = z10;
        } else {
            j7Var.b(z10);
        }
    }
}
