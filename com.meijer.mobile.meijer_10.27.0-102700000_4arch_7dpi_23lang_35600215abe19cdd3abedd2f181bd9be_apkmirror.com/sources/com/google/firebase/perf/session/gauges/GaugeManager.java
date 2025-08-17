package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import bf.t;
import bg.g;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes7.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private bg.d applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final t<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final t<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final t<l> memoryGaugeCollector;
    private String sessionId;
    private final Zf.k transportManager;
    private static final Uf.a logger = Uf.a.e();
    private static final GaugeManager instance = new GaugeManager();

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new t(new If.b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // If.b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), Zf.k.k(), com.google.firebase.perf.config.a.g(), null, new t(new If.b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // If.b
            public final Object get() {
                return GaugeManager.c();
            }
        }), new t(new If.b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // If.b
            public final Object get() {
                return GaugeManager.b();
            }
        }));
    }

    public void collectGaugeMetricOnce(ag.l lVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), lVar);
    }

    public void startCollectingGauges(Yf.a aVar, final bg.d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(dVar, aVar.d());
        if (jStartCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strH = aVar.h();
        this.sessionId = strH;
        this.applicationProcessState = dVar;
        try {
            long j10 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89123a.syncFlush(strH, dVar);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89107a;

        static {
            int[] iArr = new int[bg.d.values().length];
            f89107a = iArr;
            try {
                iArr[bg.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89107a[bg.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ l b() {
        return new l();
    }

    public static /* synthetic */ c c() {
        return new c();
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, ag.l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    private long getCpuGaugeCollectionFrequencyMs(bg.d dVar) {
        int i10 = a.f89107a[dVar.ordinal()];
        long jZ = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.z() : this.configResolver.y();
        if (c.f(jZ)) {
            return -1L;
        }
        return jZ;
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(bg.d dVar) {
        int i10 = a.f89107a[dVar.ordinal()];
        long jC = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.C() : this.configResolver.B();
        if (l.e(jC)) {
            return -1L;
        }
        return jC;
    }

    private boolean startCollectingCpuMetrics(long j10, ag.l lVar) {
        if (j10 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().i(j10, lVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, ag.l lVar) {
        if (j10 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().h(j10, lVar);
        return true;
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, bg.d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.v(bg.g.o0().J(str).I(getGaugeMetadata()).build(), dVar);
        return true;
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final bg.d dVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().j();
        this.memoryGaugeCollector.get().i();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f89120a.syncFlush(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = bg.d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private bg.f getGaugeMetadata() {
        return bg.f.f0().G(this.gaugeMetadataManager.a()).H(this.gaugeMetadataManager.b()).I(this.gaugeMetadataManager.c()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncFlush(String str, bg.d dVar) {
        g.b bVarO0 = bg.g.o0();
        while (!this.cpuGaugeCollector.get().f89114a.isEmpty()) {
            bVarO0.H(this.cpuGaugeCollector.get().f89114a.poll());
        }
        while (!this.memoryGaugeCollector.get().f89137b.isEmpty()) {
            bVarO0.G(this.memoryGaugeCollector.get().f89137b.poll());
        }
        bVarO0.J(str);
        this.transportManager.v(bVarO0.build(), dVar);
    }

    GaugeManager(t<ScheduledExecutorService> tVar, Zf.k kVar, com.google.firebase.perf.config.a aVar, i iVar, t<c> tVar2, t<l> tVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = bg.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = tVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = tVar2;
        this.memoryGaugeCollector = tVar3;
    }

    private long startCollectingGauges(bg.d dVar, ag.l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
