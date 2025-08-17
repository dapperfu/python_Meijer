package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.fullstory.FS;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.r;
import gd.C14243b;
import gd.C14247f;
import hd.C14404e;

@KeepName
/* loaded from: classes4.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected int f64731a = 0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f64731a = 0;
        setResult(0);
        finish();
    }

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f64731a);
        super.onSaveInstanceState(bundle);
    }

    private final void b() throws Resources.NotFoundException, IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            FS.log_e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            FS.log_e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                googleApiActivity = this;
                try {
                    googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    googleApiActivity.f64731a = 1;
                } catch (ActivityNotFoundException e10) {
                    e = e10;
                    if (extras.getBoolean("notify_manager", true)) {
                        C14404e.t(this).F(new C14243b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                        if (Build.FINGERPRINT.contains("generic")) {
                            strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        FS.log_e("GoogleApiActivity", strConcat, e);
                    }
                    googleApiActivity.f64731a = 1;
                    finish();
                } catch (IntentSender.SendIntentException e11) {
                    e = e11;
                    FS.log_e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            } catch (ActivityNotFoundException e12) {
                e = e12;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e13) {
                e = e13;
            }
        } else {
            C14247f.m().n(this, ((Integer) r.l(num)).intValue(), 2, this);
            this.f64731a = 1;
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) throws Resources.NotFoundException {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f64731a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C14404e c14404eT = C14404e.t(this);
                if (i11 != -1) {
                    if (i11 == 0) {
                        c14404eT.F(new C14243b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    c14404eT.G();
                }
            }
        } else if (i10 == 2) {
            this.f64731a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException, IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f64731a = bundle.getInt("resolution");
        }
        if (this.f64731a != 1) {
            b();
        }
    }
}
