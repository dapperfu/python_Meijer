package com.meijer.mobile.meijer.service;

import Au.c;
import Au.f;
import Tn.b;
import android.app.IntentService;
import xu.i;

/* loaded from: classes9.dex */
abstract class a extends IntentService implements c {

    /* renamed from: a, reason: collision with root package name */
    private volatile i f113509a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f113510b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f113511c;

    @Override // Au.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i componentManager() {
        if (this.f113509a == null) {
            synchronized (this.f113510b) {
                try {
                    if (this.f113509a == null) {
                        this.f113509a = b();
                    }
                } finally {
                }
            }
        }
        return this.f113509a;
    }

    protected i b() {
        return new i(this);
    }

    protected void c() {
        if (this.f113511c) {
            return;
        }
        this.f113511c = true;
        ((b) generatedComponent()).b((GeoFenceTransitionsIntentService) f.a(this));
    }

    a(String str) {
        super(str);
        this.f113510b = new Object();
        this.f113511c = false;
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
