package com.google.firebase.perf.application;

import com.google.firebase.perf.application.a;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public abstract class b implements a.b {
    private final WeakReference<a.b> appStateCallback;
    private final a appStateMonitor;
    private dg.d currentAppState;
    private boolean isRegisteredForAppState;

    protected b() {
        this(a.b());
    }

    protected b(a aVar) {
        this.isRegisteredForAppState = false;
        this.currentAppState = dg.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = aVar;
        this.appStateCallback = new WeakReference<>(this);
    }

    public dg.d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int i10) {
        this.appStateMonitor.e(i10);
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(dg.d dVar) {
        dg.d dVar2 = this.currentAppState;
        dg.d dVar3 = dg.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 == dVar3) {
            this.currentAppState = dVar;
        } else {
            if (dVar2 == dVar || dVar == dVar3) {
                return;
            }
            this.currentAppState = dg.d.FOREGROUND_BACKGROUND;
        }
    }

    protected void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.a();
        this.appStateMonitor.k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.p(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }
}
