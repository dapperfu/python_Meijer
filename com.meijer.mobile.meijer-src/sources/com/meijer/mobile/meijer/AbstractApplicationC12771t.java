package com.meijer.mobile.meijer;

import android.app.Application;
import android.content.Context;
import com.fullstory.FS;
import tu.C17290d;
import tu.InterfaceC17292f;
import uu.C17482a;
import wu.InterfaceC17928c;

/* renamed from: com.meijer.mobile.meijer.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
abstract class AbstractApplicationC12771t extends Application implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f114365a = false;

    /* renamed from: b, reason: collision with root package name */
    private final C17290d f114366b = new C17290d(new a());

    /* renamed from: com.meijer.mobile.meijer.t$a */
    class a implements InterfaceC17292f {
        a() {
        }

        @Override // tu.InterfaceC17292f
        public Object get() {
            return C11807a.a().a(new C17482a(AbstractApplicationC12771t.this)).b();
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        FS.init(this, context);
        super.attachBaseContext(context);
    }

    @Override // wu.InterfaceC17928c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C17290d componentManager() {
        return this.f114366b;
    }

    protected void c() {
        if (this.f114365a) {
            return;
        }
        this.f114365a = true;
        ((C) generatedComponent()).u((Meijer) wu.f.a(this));
    }

    AbstractApplicationC12771t() {
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        c();
        super.onCreate();
    }
}
