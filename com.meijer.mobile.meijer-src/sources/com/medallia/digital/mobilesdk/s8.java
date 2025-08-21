package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes8.dex */
public class s8 implements m8 {

    /* renamed from: c, reason: collision with root package name */
    private static s8 f93862c;

    /* renamed from: a, reason: collision with root package name */
    private String f93863a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93864b;

    class a implements MDResultCallback {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError mDExternalError) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("OCQValidationRules failed ");
            sb2.append(mDExternalError != null ? mDExternalError.getMessage() : "");
            a4.c(sb2.toString());
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            a4.b("OCQValidationRules success after set user id");
        }
    }

    private void a() {
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.QuarantineRule;
        if (f1VarA.c(aVar) > 0) {
            f1.a().a(aVar);
        }
        d7.b().b(d7.a.C_UUID, (String) null);
        d7.b().b(d7.a.OCQ_UUID_URL, (String) null);
        CollectorsInfrastructure.getInstance().isOCQRulesValidCollector.a(Boolean.FALSE);
    }

    protected static s8 b() {
        if (f93862c == null) {
            f93862c = new s8();
        }
        return f93862c;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        f93862c = null;
        this.f93863a = null;
        this.f93864b = false;
    }

    private void a(String str) {
        t4.e().a(d7.a.OCQ_PREVIOUS_USER_ID, str);
        t4.e().a(d7.a.OCQ_USER_ID, this.f93863a);
        CollectorsInfrastructure.getInstance().isOCQUserSetCollector.a(Boolean.valueOf(!this.f93864b));
    }

    private void a(String str, boolean z10) {
        this.f93863a = str;
        this.f93864b = z10;
    }

    public void a(String str, boolean z10, boolean z11) {
        a(str, z10);
        a(z11, false);
    }

    private void a(boolean z10) {
        if (z10) {
            return;
        }
        p5.a().b(new a());
    }

    protected void a(boolean z10, boolean z11) {
        String str;
        if ((this.f93864b || !((str = this.f93863a) == null || str.isEmpty())) && CollectorsInfrastructure.getInstance() != null && CollectorsInfrastructure.getInstance().isInitialized() && d7.b().d() && z10) {
            String str2 = this.f93863a;
            String strA = t4.e().a(d7.a.OCQ_USER_ID);
            String strA2 = t4.e().a(d7.a.OCQ_PREVIOUS_USER_ID);
            if ((str2 != null && str2.equals(strA)) || ((str2 == null || str2.isEmpty()) && strA == null)) {
                a4.b("new user id is equal to the one is storage");
                return;
            }
            if (str2 == null || str2.isEmpty()) {
                a4.b("new user id is null or empty");
                a(strA);
            } else {
                if (strA == null && str2.equals(strA2)) {
                    a4.b("new user id is equal to previous");
                    a((String) null);
                } else if (!str2.equals(strA)) {
                    a4.b("new user id is not equal to previous");
                    a((String) null);
                    a();
                }
                a(z11);
            }
            this.f93864b = false;
            this.f93863a = null;
        }
    }
}
