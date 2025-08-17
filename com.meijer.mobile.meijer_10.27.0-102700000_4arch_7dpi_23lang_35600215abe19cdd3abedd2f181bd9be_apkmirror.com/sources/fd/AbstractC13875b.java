package fd;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5227e;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pd.ThreadFactoryC16289b;
import xd.C18037e;

/* renamed from: fd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC13875b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static SoftReference f130952a;

    /* renamed from: b, reason: collision with root package name */
    private static SoftReference f130953b;

    protected abstract int b(Context context, C13874a c13874a);

    protected void c(Context context, Bundle bundle) {
    }

    private final int e(Context context, Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                FS.log_e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        FS.log_e("CloudMessagingReceiver", "Unknown notification action");
        return HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
    }

    protected Executor a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (AbstractC13875b.class) {
            try {
                SoftReference softReference = f130952a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    C18037e.a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC16289b("firebase-iid-executor")));
                    f130952a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    final /* synthetic */ void d(Intent intent, final Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iE;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iE = e(context, intent2);
            } else if (intent.getExtras() == null) {
                iE = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
            } else {
                final C13874a c13874a = new C13874a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC13875b.class) {
                    try {
                        SoftReference softReference = f130953b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            C18037e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC16289b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f130953b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } finally {
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: fd.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC5232j abstractC5232jC;
                        C13874a c13874a2 = c13874a;
                        if (TextUtils.isEmpty(c13874a2.T())) {
                            abstractC5232jC = C5235m.f(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c13874a2.T());
                            Integer numC0 = c13874a2.c0();
                            if (numC0 != null) {
                                bundle.putInt("google.product_id", numC0.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            abstractC5232jC = com.google.android.gms.cloudmessaging.l.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        abstractC5232jC.d(new Executor() { // from class: fd.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC5227e() { // from class: fd.n
                            @Override // Td.InterfaceC5227e
                            public final void onComplete(AbstractC5232j abstractC5232j) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iB = b(context, c13874a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        FS.log_w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e10) {
                    FS.log_w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                }
                iE = iB;
            }
            if (z10 && pendingResult != null) {
                pendingResult.setResultCode(iE);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th2) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: fd.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f130978a.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
