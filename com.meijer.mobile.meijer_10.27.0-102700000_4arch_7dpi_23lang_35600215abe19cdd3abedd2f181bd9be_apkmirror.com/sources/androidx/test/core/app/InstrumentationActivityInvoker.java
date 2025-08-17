package androidx.test.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import androidx.test.internal.util.Checks;
import com.fullstory.FS;

/* loaded from: classes4.dex */
class InstrumentationActivityInvoker {

    public static class BootstrapActivity extends Activity {

        /* renamed from: c, reason: collision with root package name */
        private static final String f58799c = "androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity";

        /* renamed from: a, reason: collision with root package name */
        private final BroadcastReceiver f58800a = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.BootstrapActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BootstrapActivity.this.finishActivity(0);
                BootstrapActivity.this.finish();
            }
        };

        /* renamed from: b, reason: collision with root package name */
        private boolean f58801b;

        @Override // android.app.Activity
        protected void onActivityResult(int i10, int i11, Intent intent) {
            if (i10 == 0) {
                Intent intent2 = new Intent("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_RECEIVED");
                intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_CODE_KEY", i11);
                if (intent != null) {
                    intent2.putExtra("androidx.test.core.app.InstrumentationActivityInvoker.BOOTSTRAP_ACTIVITY_RESULT_DATA_KEY", intent);
                }
                sendBroadcast(intent2);
                finish();
            }
        }

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            boolean z10;
            super.onCreate(bundle);
            InstrumentationActivityInvoker.d(this, this.f58800a, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_BOOTSTRAP_ACTIVITY"));
            if (bundle != null && bundle.getBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f58801b = z10;
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f58800a);
        }

        @Override // android.app.Activity
        protected void onResume() throws IntentSender.SendIntentException {
            super.onResume();
            if (!this.f58801b) {
                this.f58801b = true;
                PendingIntent pendingIntent = (PendingIntent) Checks.a((PendingIntent) getIntent().getParcelableExtra("androidx.test.core.app.InstrumentationActivityInvoker.START_TARGET_ACTIVITY_INTENT_KEY"));
                Bundle bundleC = InstrumentationActivityInvoker.c(getIntent().getBundleExtra("androidx.test.core.app.InstrumentationActivityInvoker.TARGET_ACTIVITY_OPTIONS_BUNDLE_KEY"));
                try {
                    if (bundleC == null) {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0);
                    } else {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 268435456, 0, 0, bundleC);
                    }
                } catch (IntentSender.SendIntentException e10) {
                    FS.log_e(f58799c, "Failed to start target activity.", e10);
                    throw new RuntimeException(e10);
                }
            }
        }

        @Override // android.app.Activity
        protected void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("IS_TARGET_ACTIVITY_STARTED_KEY", this.f58801b);
        }
    }

    public static class EmptyActivity extends Activity {

        /* renamed from: a, reason: collision with root package name */
        private final BroadcastReceiver f58803a = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.d(this, this.f58803a, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f58803a);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_ACTIVITY_RESUMED"));
        }
    }

    public static class EmptyFloatingActivity extends Activity {

        /* renamed from: a, reason: collision with root package name */
        private final BroadcastReceiver f58805a = new BroadcastReceiver() { // from class: androidx.test.core.app.InstrumentationActivityInvoker.EmptyFloatingActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                EmptyFloatingActivity.this.finish();
            }
        };

        @Override // android.app.Activity
        public void finish() {
            super.finish();
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            InstrumentationActivityInvoker.d(this, this.f58805a, new IntentFilter("androidx.test.core.app.InstrumentationActivityInvoker.FINISH_EMPTY_ACTIVITIES"));
            overridePendingTransition(0, 0);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            unregisterReceiver(this.f58805a);
        }

        @Override // android.app.Activity
        protected void onResume() {
            super.onResume();
            sendBroadcast(new Intent("androidx.test.core.app.InstrumentationActivityInvoker.EMPTY_FLOATING_ACTIVITY_RESUMED"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle c(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 34) {
            return bundle;
        }
        Bundle bundle2 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }
}
