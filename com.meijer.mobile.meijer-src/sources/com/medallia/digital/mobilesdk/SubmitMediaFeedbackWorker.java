package com.medallia.digital.mobilesdk;

import O4.C4362j;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.m;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class SubmitMediaFeedbackWorker extends Worker {

    /* renamed from: e, reason: collision with root package name */
    private static final String f92426e = "1002";

    /* renamed from: a, reason: collision with root package name */
    private final Context f92427a;

    /* renamed from: b, reason: collision with root package name */
    private final c.a[] f92428b;

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f92429c;

    /* renamed from: d, reason: collision with root package name */
    private final NotificationManager f92430d;

    class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f92431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f92432b;

        a(Boolean bool, z8 z8Var) {
            this.f92431a = bool;
            this.f92432b = z8Var;
        }

        private void a() {
            SubmitMediaFeedbackWorker.this.f92428b[0] = c.a.c();
            SubmitMediaFeedbackWorker.this.f92429c.countDown();
            SubmitMediaFeedbackWorker.this.a(this.f92432b);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("LivingLens Submit Media Feedback failed" + h4Var.getMessage());
            a();
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            a4.e("LivingLens Submit Media Feedback successfully sent ");
            if (!this.f92431a.booleanValue()) {
                Broadcasts.h.a(Broadcasts.h.a.submitFeedback);
            }
            a4.e("LivingLens Media capture response: " + str);
            a();
        }
    }

    public SubmitMediaFeedbackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f92428b = new c.a[]{c.a.b()};
        this.f92429c = new CountDownLatch(1);
        this.f92427a = context;
        this.f92430d = (NotificationManager) context.getSystemService("notification");
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            com.adobe.marketing.mobile.v.a();
            NotificationChannel notificationChannelA = com.adobe.marketing.mobile.u.a(f92426e, this.f92427a.getString(R.string.channel_name), 3);
            notificationChannelA.setDescription(this.f92427a.getString(R.string.channel_desc));
            this.f92430d.createNotificationChannel(notificationChannelA);
        }
    }

    private C4362j b() {
        if (Build.VERSION.SDK_INT >= 26) {
            a();
        }
        return new C4362j(0, new m.e(this.f92427a, f92426e).k(this.f92427a.getString(R.string.upload_media_file)).B(this.f92427a.getString(R.string.upload_media_file)).y(R.drawable.ic_black).u(false).v(-2).c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.medallia.digital.mobilesdk.b5] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.medallia.digital.mobilesdk.b5] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.medallia.digital.mobilesdk.s4] */
    protected c.a c() throws InterruptedException {
        e5 e5Var;
        e5 e5Var2;
        ?? r12;
        androidx.work.b inputData = getInputData();
        Boolean boolValueOf = Boolean.FALSE;
        if (inputData != null) {
            try {
                e5Var2 = inputData.e("mediaData") != null ? new e5(new JSONObject(inputData.e("mediaData"))) : null;
            } catch (JSONException e10) {
                e = e10;
                e5Var = null;
            }
            try {
                b5Var = inputData.e("mediaCaptureConfig") != null ? new b5(new JSONObject(inputData.e("mediaCaptureConfig"))) : null;
                boolValueOf = Boolean.valueOf(inputData.c("isPreviewsApp", false));
                r12 = b5Var;
                b5Var = e5Var2;
            } catch (JSONException e11) {
                e = e11;
                e5Var = b5Var;
                b5Var = e5Var2;
                a4.c("LivingLens Error getting data from getInputData()" + e.getMessage());
                r12 = e5Var;
                z8 z8Var = new z8(b5Var.d(), getId().toString());
                b(z8Var);
                s4.f().a(b5Var, r12, boolValueOf, new a(boolValueOf, z8Var));
                this.f92429c.await();
                a4.b("LivingLens Return from Submit Media Feedback Worker");
                return this.f92428b[0];
            }
        } else {
            r12 = 0;
        }
        z8 z8Var2 = new z8(b5Var.d(), getId().toString());
        b(z8Var2);
        s4.f().a(b5Var, r12, boolValueOf, new a(boolValueOf, z8Var2));
        try {
            this.f92429c.await();
        } catch (InterruptedException e12) {
            a4.c(e12.getMessage());
        }
        a4.b("LivingLens Return from Submit Media Feedback Worker");
        return this.f92428b[0];
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        setForegroundAsync(b());
        return c();
    }

    protected void a(z8 z8Var) {
        if (z8Var == null) {
            return;
        }
        a4.b("Worker Manager Data Delete from DB? " + f1.a().a(z8Var) + " " + z8Var.a());
    }

    protected boolean b(z8 z8Var) {
        if (z8Var == null) {
            return false;
        }
        a4.b("Worker Manager Data Saved in DB: " + z8Var.a());
        return f1.a().c(z8Var);
    }
}
