package gd;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.m;
import androidx.fragment.app.FragmentActivity;
import com.fullstory.FS;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dd.C13503a;
import dd.C13504b;
import hd.InterfaceC14408i;
import hd.N;
import hd.O;
import qd.C16516c;
import wd.InterfaceC17812d;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {InterfaceC17812d.class, wd.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: gd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14247f extends C14248g {

    /* renamed from: c, reason: collision with root package name */
    private String f133316c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f133314e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final C14247f f133315f = new C14247f();

    /* renamed from: d, reason: collision with root package name */
    public static final int f133313d = C14248g.f133317a;

    public void o(Context context, int i10) throws Resources.NotFoundException {
        t(context, i10, null, d(context, i10, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog p(Context context, int i10, com.google.android.gms.common.internal.H h10, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) throws Resources.NotFoundException {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.E.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = com.google.android.gms.common.internal.E.b(context, i10);
        if (strB != null) {
            if (h10 == null) {
                h10 = onClickListener;
            }
            builder.setPositiveButton(strB, h10);
        }
        String strF = com.google.android.gms.common.internal.E.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        FS.log_w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public static C14247f m() {
        return f133315f;
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, com.google.android.gms.common.internal.H.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.E.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        s(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final O r(Context context, N n10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        O o10 = new O(n10);
        wd.h.q(context, o10, intentFilter);
        o10.a(context);
        if (i(context, "com.google.android.gms")) {
            return o10;
        }
        n10.a();
        o10.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.A0(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void u(Context context) {
        new l(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean v(Activity activity, InterfaceC14408i interfaceC14408i, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) throws Resources.NotFoundException {
        Dialog dialogP = p(activity, i10, com.google.android.gms.common.internal.H.c(interfaceC14408i, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogP == null) {
            return false;
        }
        s(activity, dialogP, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Override // gd.C14248g
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // gd.C14248g
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // gd.C14248g
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // gd.C14248g
    @ResultIgnorabilityUnspecified
    public int g(Context context) {
        return super.g(context);
    }

    @Override // gd.C14248g
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // gd.C14248g
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public PendingIntent l(Context context, C14243b c14243b) {
        if (c14243b.q0()) {
            return c14243b.c0();
        }
        return c(context, c14243b.B(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogK = k(activity, i10, i11, onCancelListener);
        if (dialogK == null) {
            return false;
        }
        s(activity, dialogK, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @TargetApi(20)
    final void t(Context context, int i10, String str, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i11;
        String str2;
        FS.log_w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                FS.log_w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = com.google.android.gms.common.internal.E.e(context, i10);
        String strD = com.google.android.gms.common.internal.E.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) com.google.android.gms.common.internal.r.l(context.getSystemService("notification"));
        m.e eVarA = new m.e(context).s(true).f(true).k(strE).A(new m.c().h(strD));
        if (com.google.android.gms.common.util.j.f(context)) {
            com.google.android.gms.common.internal.r.p(com.google.android.gms.common.util.n.c());
            eVarA.y(context.getApplicationInfo().icon).v(2);
            if (com.google.android.gms.common.util.j.g(context)) {
                eVarA.a(C13503a.f127351a, resources.getString(C13504b.f127366o), pendingIntent);
            } else {
                eVarA.i(pendingIntent);
            }
        } else {
            eVarA.y(R.drawable.stat_sys_warning).B(resources.getString(C13504b.f127359h)).F(System.currentTimeMillis()).i(pendingIntent).j(strD);
        }
        if (com.google.android.gms.common.util.n.g()) {
            com.google.android.gms.common.internal.r.p(com.google.android.gms.common.util.n.g());
            synchronized (f133314e) {
                str2 = this.f133316c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C13504b.f127358g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(com.adobe.marketing.mobile.u.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarA.g(str2);
        }
        Notification notificationC = eVarA.c();
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i11 = 39789;
        } else {
            C14250i.f133321b.set(false);
            i11 = 10436;
        }
        notificationManager.notify(i11, notificationC);
    }

    public final boolean w(Context context, C14243b c14243b, int i10) throws Resources.NotFoundException {
        PendingIntent pendingIntentL;
        if (C16516c.a(context) || (pendingIntentL = l(context, c14243b)) == null) {
            return false;
        }
        t(context, c14243b.B(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentL, i10, true), wd.i.f166037a | 134217728));
        return true;
    }
}
