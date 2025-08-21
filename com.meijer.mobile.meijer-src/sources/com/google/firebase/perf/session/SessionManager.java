package com.google.firebase.perf.session;

import ag.C5688a;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import dg.d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
/* loaded from: classes8.dex */
public class SessionManager extends b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<ag.b>> clients;
    private final GaugeManager gaugeManager;
    private C5688a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), C5688a.c(UUID.randomUUID().toString()), a.b());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, C5688a c5688a) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (c5688a.e()) {
            sessionManager.gaugeManager.logGaugeMetadata(c5688a.h(), d.FOREGROUND);
        }
    }

    public static SessionManager getInstance() {
        return instance;
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public final C5688a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<ag.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final C5688a c5688a = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ag.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(this.f45391a, context, c5688a);
            }
        });
    }

    public void setPerfSession(C5688a c5688a) {
        this.perfSession = c5688a;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<ag.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (dVar == d.FOREGROUND) {
            updatePerfSession(C5688a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(C5688a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public void updatePerfSession(C5688a c5688a) {
        if (c5688a.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = c5688a;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<ag.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    ag.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(c5688a);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }

    public SessionManager(GaugeManager gaugeManager, C5688a c5688a, a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = c5688a;
        this.appStateMonitor = aVar;
        registerForAppState();
    }
}
