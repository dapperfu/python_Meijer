package com.google.android.gms.wallet;

import Td.AbstractC5232j;
import Td.C5233k;
import Xd.InterfaceC5417a;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C6520b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f86131a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b, reason: collision with root package name */
    static final long f86132b = SystemClock.elapsedRealtime();

    public static void a(Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Activity activity, int i10, int i11, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i10, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                FS.log_w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                pendingIntentCreatePendingResult.send(i11);
            } catch (PendingIntent.CanceledException e10) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    FS.log_e("AutoResolveHelper", "Exception sending pending result", e10);
                }
            }
        }
    }

    @Deprecated
    public static <TResult extends InterfaceC5417a> void b(AbstractC5232j<TResult> abstractC5232j, Activity activity, int i10) {
        b bVarA = b.a(abstractC5232j);
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        int i11 = bVarA.f86136a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i11);
        bundle.putInt("requestCode", i10);
        bundle.putLong("initializationElapsedRealtime", f86132b);
        zzd zzdVar = new zzd();
        zzdVar.setArguments(bundle);
        fragmentTransactionBeginTransaction.add(zzdVar, "com.google.android.gms.wallet.AutoResolveHelper" + bVarA.f86136a).commit();
    }

    public static void f(Status status, Object obj, C5233k c5233k) {
        if (status.d1()) {
            c5233k.c(obj);
        } else {
            c5233k.b(C6520b.a(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Activity activity, int i10, AbstractC5232j abstractC5232j) throws PendingIntent.CanceledException {
        int i11;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                FS.log_d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception excM = abstractC5232j.m();
        if (excM instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) excM).d(activity, i10);
                return;
            } catch (IntentSender.SendIntentException e10) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    FS.log_e("AutoResolveHelper", "Error starting pending intent!", e10);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (abstractC5232j.r()) {
            ((InterfaceC5417a) abstractC5232j.n()).h(intent);
            i11 = -1;
        } else {
            if (excM instanceof ApiException) {
                ApiException apiException = (ApiException) excM;
                a(intent, new Status(apiException.b(), apiException.getMessage(), (PendingIntent) null));
            } else {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    FS.log_e("AutoResolveHelper", "Unexpected non API exception!", excM);
                }
                a(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            i11 = 1;
        }
        g(activity, i10, i11, intent);
    }
}
