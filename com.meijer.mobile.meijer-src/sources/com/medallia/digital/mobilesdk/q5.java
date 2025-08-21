package com.medallia.digital.mobilesdk;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.Display;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class q5 extends w1<b> {

    /* renamed from: g, reason: collision with root package name */
    private ComponentCallbacks2 f93584g;

    class a implements ComponentCallbacks2 {
        a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            q5 q5Var;
            b bVarO;
            try {
                int i10 = i4.c().b().getResources().getConfiguration().orientation;
                if (i10 == 1 || i10 == 2) {
                    q5Var = q5.this;
                    bVarO = q5Var.o();
                } else {
                    q5Var = q5.this;
                    bVarO = b.Unknown;
                }
                q5Var.a((q5) bVarO);
                a4.b(String.format(Locale.US, "Collectors > Orientation : %s", q5.this.f().toString()));
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
        }
    }

    enum b {
        Portrait(0),
        PortraitUpsidedown(2),
        LandscapeLeft(1),
        LandscapeRight(3),
        Unknown(-1);


        /* renamed from: a, reason: collision with root package name */
        private final int f93592a;

        b(int i10) {
            this.f93592a = i10;
        }

        int a() {
            return this.f93592a;
        }

        static b a(int i10) {
            for (b bVar : values()) {
                if (bVar.a() == i10) {
                    return bVar;
                }
            }
            return Unknown;
        }
    }

    protected q5(n0 n0Var) {
        super(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b o() {
        try {
            Display displayF = this.f94047f.f();
            return displayF != null ? b.a(displayF.getRotation()) : b.Unknown;
        } catch (Exception unused) {
            return b.Unknown;
        }
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93793y;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void k() {
        super.k();
        if (f() != null) {
            a4.b(String.format(Locale.US, "Collectors > Orientation : %s", f().toString()));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            this.f93584g = new a();
            i4.c().b().registerComponentCallbacks(this.f93584g);
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            if (this.f93584g != null) {
                i4.c().b().unregisterComponentCallbacks(this.f93584g);
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.w1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b j() {
        return o();
    }
}
