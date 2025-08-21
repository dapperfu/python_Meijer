package com.meijer.mobile.featurenavigation.content;

import android.app.IntentService;
import tu.i;
import wu.InterfaceC17928c;
import wu.f;

/* loaded from: classes10.dex */
public abstract class a extends IntentService implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private volatile i f98266a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f98267b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f98268c;

    @Override // wu.InterfaceC17928c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i componentManager() {
        if (this.f98266a == null) {
            synchronized (this.f98267b) {
                try {
                    if (this.f98266a == null) {
                        this.f98266a = b();
                    }
                } finally {
                }
            }
        }
        return this.f98266a;
    }

    protected i b() {
        return new i(this);
    }

    protected void c() {
        if (this.f98268c) {
            return;
        }
        this.f98268c = true;
        ((Dl.a) generatedComponent()).a((DailyAlarmService) f.a(this));
    }

    a(String str) {
        super(str);
        this.f98267b = new Object();
        this.f98268c = false;
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        c();
        super.onCreate();
    }
}
