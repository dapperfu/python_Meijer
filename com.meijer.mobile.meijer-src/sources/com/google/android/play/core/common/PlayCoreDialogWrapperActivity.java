package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes4.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private ResultReceiver f88855a;

    private final void a() {
        ResultReceiver resultReceiver = this.f88855a;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f88855a);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && (resultReceiver = this.f88855a) != null) {
            if (i11 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i11 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle == null) {
            this.f88855a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                a();
                finish();
            }
            try {
                try {
                    startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
                } catch (IntentSender.SendIntentException unused) {
                    a();
                    finish();
                }
            } catch (IntentSender.SendIntentException unused2) {
            }
        } else {
            this.f88855a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }
}
