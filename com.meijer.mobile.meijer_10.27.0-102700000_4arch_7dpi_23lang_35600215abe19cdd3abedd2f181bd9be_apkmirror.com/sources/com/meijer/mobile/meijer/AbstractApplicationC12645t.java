package com.meijer.mobile.meijer;

import android.app.Application;
import android.content.Context;
import com.fullstory.FS;
import xu.C18098d;
import xu.InterfaceC18100f;
import yu.C18303a;

/* renamed from: com.meijer.mobile.meijer.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractApplicationC12645t extends Application implements Au.c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f113512a = false;

    /* renamed from: b, reason: collision with root package name */
    private final C18098d f113513b = new C18098d(new a());

    /* renamed from: com.meijer.mobile.meijer.t$a */
    class a implements InterfaceC18100f {
        a() {
        }

        @Override // xu.InterfaceC18100f
        public Object get() {
            return C11682a.a().a(new C18303a(AbstractApplicationC12645t.this)).b();
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        FS.init(this, context);
        super.attachBaseContext(context);
    }

    @Override // Au.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C18098d componentManager() {
        return this.f113513b;
    }

    protected void c() {
        if (this.f113512a) {
            return;
        }
        this.f113512a = true;
        ((C) generatedComponent()).u((Meijer) Au.f.a(this));
    }

    AbstractApplicationC12645t() {
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        c();
        super.onCreate();
    }
}
