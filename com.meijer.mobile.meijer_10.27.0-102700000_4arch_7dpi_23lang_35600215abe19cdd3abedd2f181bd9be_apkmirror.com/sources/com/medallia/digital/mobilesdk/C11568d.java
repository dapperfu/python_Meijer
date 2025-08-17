package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.f2;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C11568d {

    /* renamed from: com.medallia.digital.mobilesdk.d$a */
    class a implements n6<u0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f91745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f91746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f91747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f91748d;

        a(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
            this.f91745a = str;
            this.f91746b = nVar;
            this.f91747c = nVar2;
            this.f91748d = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Migration getConfiguration Error: ");
            sb2.append(h4Var != null ? h4Var.getMessage() : "");
            a4.c(sb2.toString());
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(u0 u0Var) {
            s4.f().a(u0Var.a());
            C11568d.c(this.f91745a, this.f91746b, this.f91747c, this.f91748d);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.d$b */
    class b implements f2.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f91749a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f91750b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f91751c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f91752d;

        b(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
            this.f91749a = str;
            this.f91750b = nVar;
            this.f91751c = nVar2;
            this.f91752d = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void a() {
            a4.c("Migration Submit Stored feedbacks Error");
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void onSuccess() {
            a4.e("Migration Stored feedbacks have been submitted successfully");
            C11568d.a(this.f91749a, this.f91750b, this.f91751c, this.f91752d);
        }
    }

    C11568d() {
    }

    protected static void a(String str, MDResultCallback mDResultCallback) {
        n nVarCreateApiToken = ModelFactory.getInstance().createApiToken(t4.e().a(d7.a.API_TOKEN));
        n nVarCreateApiToken2 = ModelFactory.getInstance().createApiToken(str);
        if (nVarCreateApiToken == null || nVarCreateApiToken2 == null) {
            return;
        }
        a4.e("Migration between accounts has started from propertyId " + nVarCreateApiToken.c() + " to propertyId " + nVarCreateApiToken2.c());
        w2.c().a(nVarCreateApiToken);
        b(str, nVarCreateApiToken, nVarCreateApiToken2, mDResultCallback);
    }

    private static void b(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.Feedback, new Object[0]);
        if (arrayListC == null || arrayListC.isEmpty()) {
            a(str, nVar, nVar2, mDResultCallback);
        } else if (x8.b()) {
            s4.f().a("2.0.0", new a(str, nVar, nVar2, mDResultCallback));
        } else {
            a4.c("Migration Error: there are feedbacks to submit but no internet connection");
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_12));
        }
    }

    protected static void c(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
        MedalliaDigital.getMedalliaDigitalBrain().c().a(new b(str, nVar, nVar2, mDResultCallback));
    }

    protected static void a(String str, n nVar, n nVar2, MDResultCallback mDResultCallback) {
        a4.e("Migration between accounts has ended from propertyId " + nVar.c() + " to propertyId " + nVar2.c());
        MDLogLevel mDLogLevelB = a4.a().b();
        MedalliaDigital.getMedalliaDigitalBrain().clearAndDisconnect();
        a4.a().a(mDLogLevelB);
        MedalliaDigital.updateBrainOnMigration();
        MedalliaDigital.getMedalliaDigitalBrain().b(str, mDResultCallback);
    }

    protected static boolean a(String str) {
        n nVarCreateApiToken = ModelFactory.getInstance().createApiToken(t4.e().a(d7.a.API_TOKEN));
        return (nVarCreateApiToken == null || TextUtils.isEmpty(nVarCreateApiToken.a()) || str == null || str.isEmpty() || nVarCreateApiToken.a().equals(str) || nVarCreateApiToken.c() == new n(str).c()) ? false : true;
    }
}
