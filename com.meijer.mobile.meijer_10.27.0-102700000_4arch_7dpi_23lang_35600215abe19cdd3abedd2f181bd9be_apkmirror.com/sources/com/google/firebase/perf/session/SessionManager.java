package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import bg.d;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
/* loaded from: classes7.dex */
public class SessionManager extends b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<Yf.b>> clients;
    private final GaugeManager gaugeManager;
    private Yf.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), Yf.a.c(UUID.randomUUID().toString()), a.b());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, Yf.a aVar) {
        sessionManager.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.e()) {
            sessionManager.gaugeManager.logGaugeMetadata(aVar.h(), d.FOREGROUND);
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

    public final Yf.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<Yf.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final Yf.a aVar = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: Yf.c
            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.b(this.f40259a, context, aVar);
            }
        });
    }

    public void setPerfSession(Yf.a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<Yf.b> weakReference) {
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
            updatePerfSession(Yf.a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(Yf.a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public void updatePerfSession(Yf.a aVar) {
        if (aVar.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = aVar;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<Yf.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    Yf.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(aVar);
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

    public SessionManager(GaugeManager gaugeManager, Yf.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
