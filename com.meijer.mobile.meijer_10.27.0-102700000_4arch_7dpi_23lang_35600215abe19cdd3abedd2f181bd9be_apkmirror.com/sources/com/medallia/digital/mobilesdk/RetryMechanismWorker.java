package com.medallia.digital.mobilesdk;

import N4.O;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class RetryMechanismWorker extends Worker {

    /* renamed from: d, reason: collision with root package name */
    private static final int f91581d = 90;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<e5> f91582a;

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f91583b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a[] f91584c;

    class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e5 f91585a;

        a(e5 e5Var) {
            this.f91585a = e5Var;
        }

        private void a(e5 e5Var) throws InterruptedException {
            RetryMechanismWorker.this.f91582a.remove(e5Var);
            if (!RetryMechanismWorker.this.f91582a.isEmpty()) {
                RetryMechanismWorker retryMechanismWorker = RetryMechanismWorker.this;
                retryMechanismWorker.a((e5) retryMechanismWorker.f91582a.poll());
            } else {
                Broadcasts.h.a(Broadcasts.h.a.submitFeedback);
                RetryMechanismWorker.this.a((e5) null);
                RetryMechanismWorker.this.f91584c[0] = c.a.c();
                RetryMechanismWorker.this.f91583b.countDown();
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws InterruptedException {
            a4.c("Stored Media feedback failed to submit. MediaFeedback UUID: " + this.f91585a.b());
            a(this.f91585a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) throws InterruptedException {
            a4.b("Stored Media feedback was submitted successfully. MediaFeedback UUID: " + this.f91585a.b());
            a(this.f91585a);
        }
    }

    public RetryMechanismWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f91582a = new LinkedList();
        this.f91583b = new CountDownLatch(1);
        this.f91584c = new c.a[]{c.a.b()};
    }

    protected c.a a() throws JSONException, InterruptedException {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.MediaFeedback, new Object[0]);
        ArrayList<? extends b0> arrayListC2 = f1.a().c(b0.a.WorkerManager, new Object[0]);
        if (arrayListC != null && !arrayListC.isEmpty()) {
            if (arrayListC2 != null && !arrayListC2.isEmpty()) {
                Iterator<? extends b0> it = arrayListC.iterator();
                while (it.hasNext()) {
                    e5 e5Var = (e5) it.next();
                    Iterator<? extends b0> it2 = arrayListC2.iterator();
                    while (it2.hasNext()) {
                        if (e5Var.d().equals(((z8) it2.next()).a())) {
                            a4.b("Removed Feedback: " + ((e5) arrayListC.get(0)).d());
                            arrayListC.remove(e5Var);
                            O.h(i4.c().b()).b(getId());
                        }
                    }
                }
            }
            if (!arrayListC.isEmpty()) {
                a4.b("Loaded Feedback: " + ((e5) arrayListC.get(0)).d());
                AnalyticsBridge.getInstance().reportMediaFeedbackRetryMechanismEvent(arrayListC.size());
                this.f91582a.addAll(arrayListC);
                f1.a().a(b0.a.MediaFeedback, Long.valueOf(System.currentTimeMillis() - 7776000000L));
                return a(this.f91582a.poll());
            }
        }
        this.f91583b.countDown();
        try {
            this.f91583b.await();
        } catch (InterruptedException e10) {
            a4.c(e10.getMessage());
        }
        return c.a.c();
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.a a(e5 e5Var) throws InterruptedException {
        if (e5Var == null) {
            this.f91584c[0] = c.a.c();
            return this.f91584c[0];
        }
        f1.a().a(e5Var);
        e5Var.i();
        s4.f().a(e5Var, (b5) null, Boolean.FALSE, new a(e5Var));
        try {
            this.f91583b.await();
        } catch (InterruptedException e10) {
            a4.c(e10.getMessage());
        }
        return this.f91584c[0];
    }
}
