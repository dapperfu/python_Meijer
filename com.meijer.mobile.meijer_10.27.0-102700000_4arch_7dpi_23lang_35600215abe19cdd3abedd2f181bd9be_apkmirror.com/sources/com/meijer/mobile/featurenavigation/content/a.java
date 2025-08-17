package com.meijer.mobile.featurenavigation.content;

import Au.c;
import Au.f;
import android.app.IntentService;
import xu.i;

/* loaded from: classes9.dex */
public abstract class a extends IntentService implements c {

    /* renamed from: a, reason: collision with root package name */
    private volatile i f97408a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f97409b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f97410c;

    @Override // Au.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i componentManager() {
        if (this.f97408a == null) {
            synchronized (this.f97409b) {
                try {
                    if (this.f97408a == null) {
                        this.f97408a = b();
                    }
                } finally {
                }
            }
        }
        return this.f97408a;
    }

    protected i b() {
        return new i(this);
    }

    protected void c() {
        if (this.f97410c) {
            return;
        }
        this.f97410c = true;
        ((Cl.a) generatedComponent()).a((DailyAlarmService) f.a(this));
    }

    a(String str) {
        super(str);
        this.f97409b = new Object();
        this.f97410c = false;
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        c();
        super.onCreate();
    }
}
