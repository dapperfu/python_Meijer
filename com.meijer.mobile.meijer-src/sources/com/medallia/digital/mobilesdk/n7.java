package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.x7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes8.dex */
class n7 implements LifeCycle.h, m8, x7.b<u1.b>, j7 {

    /* renamed from: c, reason: collision with root package name */
    protected boolean f93457c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f93458d;

    /* renamed from: e, reason: collision with root package name */
    protected l7 f93459e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f93460f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f93461g;

    /* renamed from: i, reason: collision with root package name */
    private Long f93463i;

    /* renamed from: j, reason: collision with root package name */
    private Long f93464j;

    /* renamed from: b, reason: collision with root package name */
    protected x7 f93456b = new x7(500, this);

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<t1> f93462h = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private final Handler f93465k = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    private final v4 f93466l = new a();

    /* renamed from: m, reason: collision with root package name */
    private final v4 f93467m = new b();

    /* renamed from: n, reason: collision with root package name */
    private final BroadcastReceiver f93468n = new c();

    /* renamed from: a, reason: collision with root package name */
    private final o7 f93455a = new o7();

    class a extends v4 {

        /* renamed from: com.medallia.digital.mobilesdk.n7$a$a, reason: collision with other inner class name */
        class C1321a extends v4 {
            C1321a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                n7.this.a(u1.b.evaluationTimerFG);
            }
        }

        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C1321a());
        }
    }

    class b extends v4 {

        class a extends v4 {
            a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                n7.this.a(u1.b.evaluationTimerBG);
            }
        }

        b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new a());
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.EvaluateReceiverInitiator")) {
                        u1.b bVar = (u1.b) intent.getSerializableExtra("com.medallia.digital.mobilesdk.EvaluateReceiverInitiator");
                        a4.b("Evaluate Receiver initiator: " + bVar);
                        n7.this.a(bVar);
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93474a;

        static {
            int[] iArr = new int[u1.d.values().length];
            f93474a = iArr;
            try {
                iArr[u1.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93474a[u1.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected n7() {
    }

    private void c(u1.d dVar) {
        a4.b("Evaluation timer stopped for type " + dVar.toString());
        int i10 = d.f93474a[dVar.ordinal()];
        if (i10 == 1) {
            this.f93465k.removeCallbacks(this.f93467m);
        } else if (i10 != 2) {
            return;
        }
        this.f93465k.removeCallbacks(this.f93466l);
    }

    private void d() {
        List<EvaluationResult> list;
        EvaluationResult evaluationResult;
        l7 l7Var = this.f93459e;
        HashMap<u1.c, List<EvaluationResult>> mapA = l7Var != null ? this.f93455a.a(l7Var) : null;
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.LocalNotification;
        if (f1VarA.c(aVar) > 0) {
            f1.a().a(aVar);
        }
        if (mapA == null || mapA.isEmpty()) {
            return;
        }
        v3.f().i();
        u1.c cVar = u1.c.TRIGGER_RULES;
        if (!mapA.containsKey(cVar)) {
            u1.c cVar2 = u1.c.NEXT_EVALUATION;
            if (!mapA.containsKey(cVar2) || (list = mapA.get(cVar2)) == null || list.isEmpty() || (evaluationResult = list.get(0)) == null) {
                return;
            }
            Long nextEvaluationTime = evaluationResult.getNextEvaluationTime();
            this.f93464j = nextEvaluationTime;
            if (nextEvaluationTime.longValue() > 0) {
                a(u1.d.BACKGROUND);
                return;
            }
            return;
        }
        List<EvaluationResult> list2 = mapA.get(cVar);
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator<EvaluationResult> it = list2.iterator();
        while (it.hasNext()) {
            j2 j2VarC = r2.e().c(it.next().getEngagementId());
            if (j2VarC != null && j2VarC.getInviteData() != null && j2VarC.getInviteData().getLocalNotificationData() != null) {
                t3 localNotificationData = j2VarC.getInviteData().getLocalNotificationData();
                if (localNotificationData == null) {
                    a4.c("Local Notification Data is null");
                    return;
                }
                f1.a().b(localNotificationData);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public i7 a() {
        return i7.V2;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public ArrayList<t1> b() {
        return this.f93462h;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        f();
    }

    protected void e() {
        try {
            q4.a(i4.c().b()).a(this.f93468n, new IntentFilter("com.medallia.digital.mobilesdk.EvaluateReceiverFilter"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void f() {
        try {
            q4.a(i4.c().b()).a(this.f93468n);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        c(u1.d.FOREGROUND);
        c(u1.d.BACKGROUND);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        if (this.f93463i != null) {
            this.f93463i = Long.valueOf((CollectorsInfrastructure.getInstance() == null || CollectorsInfrastructure.getInstance().getTimeInBackground() == null || this.f93463i.longValue() <= CollectorsInfrastructure.getInstance().getTimeInBackground().longValue()) ? 1000L : this.f93463i.longValue() - CollectorsInfrastructure.getInstance().getTimeInBackground().longValue());
        }
        a(u1.d.FOREGROUND);
    }

    private void a(long j10, u1.b bVar) throws JSONException {
        if (!this.f93457c) {
            a4.b("Intercept is not enabled, FG evaluate won't run");
            return;
        }
        if (this.f93461g && this.f93460f) {
            a4.b("Skip FG evaluation intercept was already shown in session");
            return;
        }
        EvaluationResult evaluationResultB = this.f93455a.b(this.f93459e);
        a4.b("End of FG evaluation: " + evaluationResultB.toJsonString());
        this.f93463i = evaluationResultB.getNextEvaluationTime();
        if (evaluationResultB.getEngagementId() != null) {
            this.f93460f = true;
            c3.d().b(evaluationResultB.getEngagementId(), evaluationResultB.getEngagementType(), System.currentTimeMillis());
        } else if (this.f93463i != null) {
            a(u1.d.FOREGROUND);
        }
        a(evaluationResultB.getEngagementId(), evaluationResultB.toJsonString(), j10, bVar);
    }

    @Override // com.medallia.digital.mobilesdk.x7.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(u1.b bVar) throws JSONException {
        ArrayList<u1.d> arrayListA = u1.a(bVar);
        if (this.f93458d) {
            a4.e("Evaluate can’t be trigger because of stop sdk");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a4.b("Start evaluation");
        this.f93455a.a();
        if (arrayListA.contains(u1.d.FOREGROUND)) {
            a(jCurrentTimeMillis, bVar);
        }
        if (arrayListA.contains(u1.d.BACKGROUND)) {
            d();
        }
        a4.b("End of evaluation");
    }

    protected void c(boolean z10) {
        boolean z11 = this.f93457c;
        if (z11 == z10) {
            a4.e("Intercept already " + (z11 ? "enabled" : "disabled"));
            return;
        }
        this.f93457c = z10;
        if (z10) {
            a4.e("Intercept enabled");
            CollectorsInfrastructure.getInstance().interceptEnabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportEnableInterceptEvent();
        } else {
            a4.e("Intercept disabled");
            CollectorsInfrastructure.getInstance().interceptDisabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportDisableInterceptEvent();
        }
        if (!z11 || this.f93457c) {
            a(u1.b.enableIntercept);
        } else {
            c(u1.d.FOREGROUND);
        }
    }

    private void b(u1.d dVar) {
        int i10 = d.f93474a[dVar.ordinal()];
        if (i10 == 1) {
            Long l10 = this.f93464j;
            if (l10 != null && l10.longValue() > 0) {
                this.f93465k.postDelayed(this.f93467m, this.f93464j.longValue());
            }
        } else if (i10 != 2) {
            return;
        }
        Long l11 = this.f93463i;
        if (l11 != null) {
            this.f93465k.postDelayed(this.f93466l, l11.longValue());
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(ConfigurationContract configurationContract) throws JSONException {
        AnalyticsBridge.getInstance().setTreResourceReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
        if (configurationContract == null || configurationContract.getTargetEvaluatorContract() == null) {
            return;
        }
        this.f93460f = false;
        if (configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.f93461g = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isCanBlockAfterOneSuccess();
        }
        this.f93459e = configurationContract.getTargetEvaluatorContract();
        a(u1.b.updateConfiguration);
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public boolean c() {
        return this.f93457c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.medallia.digital.mobilesdk.j7
    public void a(u1.b bVar) {
        ArrayList<u1.d> arrayListA = u1.a(bVar);
        if (arrayListA != null && arrayListA.size() == 1 && arrayListA.contains(u1.d.FOREGROUND)) {
            if (!this.f93457c) {
                a4.b("Intercept is not enabled, evaluate won't run");
                return;
            } else if (this.f93461g && this.f93460f) {
                a4.b("Skip evaluation intercept was already shown in session");
                return;
            }
        }
        if (this.f93459e == null) {
            a4.c("Target evaluator json is missing");
            return;
        }
        x7 x7Var = this.f93456b;
        if (x7Var == null) {
            a4.c("Throttle is null");
        } else {
            x7Var.a((x7) bVar);
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void b(boolean z10) {
        c(z10);
    }

    private void a(u1.d dVar) {
        c(dVar);
        b(dVar);
    }

    private void a(String str, String str2, long j10, u1.b bVar) throws JSONException {
        j2 j2VarC = r2.e().c(str);
        AnalyticsBridge.getInstance().reportNativeTargetEvaluatorEvent(j10, System.currentTimeMillis(), j2VarC != null ? str : null, j2VarC != null ? j2VarC.c() : null, str2, bVar.name());
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z10) {
        this.f93458d = z10;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z10, boolean z11) {
        this.f93457c = z10;
        this.f93458d = z11;
        e();
    }
}
