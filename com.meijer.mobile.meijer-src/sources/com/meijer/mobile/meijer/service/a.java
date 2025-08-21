package com.meijer.mobile.meijer.service;

import Un.b;
import android.app.IntentService;
import tu.i;
import wu.InterfaceC17928c;
import wu.f;

/* loaded from: classes10.dex */
abstract class a extends IntentService implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private volatile i f114362a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f114363b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f114364c;

    @Override // wu.InterfaceC17928c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i componentManager() {
        if (this.f114362a == null) {
            synchronized (this.f114363b) {
                try {
                    if (this.f114362a == null) {
                        this.f114362a = b();
                    }
                } finally {
                }
            }
        }
        return this.f114362a;
    }

    protected i b() {
        return new i(this);
    }

    protected void c() {
        if (this.f114364c) {
            return;
        }
        this.f114364c = true;
        ((b) generatedComponent()).b((GeoFenceTransitionsIntentService) f.a(this));
    }

    a(String str) {
        super(str);
        this.f114363b = new Object();
        this.f114364c = false;
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
