package com.google.android.gms.common.api;

import Td.AbstractC5232j;
import Td.C5233k;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.AbstractC6521c;
import com.google.android.gms.common.internal.C6523e;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.r;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import hd.AbstractC14413n;
import hd.AbstractC14417s;
import hd.AbstractC14419u;
import hd.C14400a;
import hd.C14401b;
import hd.C14404e;
import hd.C14409j;
import hd.C14410k;
import hd.C14414o;
import hd.C14423y;
import hd.H;
import hd.InterfaceC14416q;
import hd.M;
import hd.ServiceConnectionC14411l;
import hd.g0;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class d<O extends a.d> {
    protected final C14404e zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final C14401b zaf;
    private final Looper zag;
    private final int zah;
    private final e zai;
    private final InterfaceC14416q zaj;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f64751c = new C1259a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC14416q f64752a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f64753b;

        /* renamed from: com.google.android.gms.common.api.d$a$a, reason: collision with other inner class name */
        public static class C1259a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC14416q f64754a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f64755b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f64754a == null) {
                    this.f64754a = new C14400a();
                }
                if (this.f64755b == null) {
                    this.f64755b = Looper.getMainLooper();
                }
                return new a(this.f64754a, this.f64755b);
            }

            public C1259a b(Looper looper) {
                r.m(looper, "Looper must not be null.");
                this.f64755b = looper;
                return this;
            }

            public C1259a c(InterfaceC14416q interfaceC14416q) {
                r.m(interfaceC14416q, "StatusExceptionMapper must not be null.");
                this.f64754a = interfaceC14416q;
                return this;
            }
        }

        private a(InterfaceC14416q interfaceC14416q, Account account, Looper looper) {
            this.f64752a = interfaceC14416q;
            this.f64753b = looper;
        }
    }

    public d(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(activity, activity, aVar, o10, aVar2);
    }

    public e asGoogleApiClient() {
        return this.zai;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends AbstractC14413n<A, ?>, U extends AbstractC14419u<A, ?>> AbstractC5232j<Void> doRegisterEventListener(T t10, U u10) {
        r.l(t10);
        r.l(u10);
        r.m(t10.b(), "Listener has already been released.");
        r.m(u10.a(), "Listener has already been released.");
        r.b(C6535q.a(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.w(this, t10, u10, new Runnable() { // from class: com.google.android.gms.common.api.n
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    public AbstractC5232j<Boolean> doUnregisterEventListener(C14409j.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends k, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    protected String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public O getApiOptions() {
        return (O) this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public final int zaa() {
        return this.zah;
    }

    @Deprecated
    public d(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, InterfaceC14416q interfaceC14416q) {
        a.C1259a c1259a = new a.C1259a();
        c1259a.c(interfaceC14416q);
        c1259a.b(activity.getMainLooper());
        this(activity, (com.google.android.gms.common.api.a) aVar, (a.d) o10, c1259a.a());
    }

    private final AbstractC5232j zae(int i10, AbstractC14417s abstractC14417s) {
        C5233k c5233k = new C5233k();
        this.zaa.D(this, i10, abstractC14417s, c5233k, this.zaj);
        return c5233k.a();
    }

    protected C6523e.a createClientSettingsBuilder() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        C6523e.a aVar = new C6523e.a();
        a.d dVar = this.zae;
        if (!(dVar instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) dVar).a()) == null) {
            a.d dVar2 = this.zae;
            accountB = dVar2 instanceof a.d.InterfaceC1258a ? ((a.d.InterfaceC1258a) dVar2).b() : null;
        } else {
            accountB = googleSignInAccountA2.B();
        }
        aVar.d(accountB);
        a.d dVar3 = this.zae;
        Set<Scope> setI1 = (!(dVar3 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) dVar3).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.i1();
        aVar.c(setI1);
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    protected AbstractC5232j<Boolean> disconnectService() {
        return this.zaa.v(this);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5232j<TResult> doBestEffortWrite(AbstractC14417s<A, TResult> abstractC14417s) {
        return zae(2, abstractC14417s);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5232j<TResult> doRead(AbstractC14417s<A, TResult> abstractC14417s) {
        return zae(0, abstractC14417s);
    }

    @ResultIgnorabilityUnspecified
    public AbstractC5232j<Boolean> doUnregisterEventListener(C14409j.a<?> aVar, int i10) {
        r.m(aVar, "Listener key cannot be null.");
        return this.zaa.x(this, aVar, i10);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5232j<TResult> doWrite(AbstractC14417s<A, TResult> abstractC14417s) {
        return zae(1, abstractC14417s);
    }

    public final C14401b<O> getApiKey() {
        return this.zaf;
    }

    public <L> C14409j<L> registerListener(L l10, String str) {
        return C14410k.a(l10, this.zag, str);
    }

    public final g0 zac(Context context, Handler handler) {
        return new g0(context, handler, createClientSettingsBuilder().a());
    }

    private final com.google.android.gms.common.api.internal.a zad(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.i();
        this.zaa.C(this, i10, aVar);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, H h10) {
        C6523e c6523eA = createClientSettingsBuilder().a();
        a.f fVarBuildClient = ((a.AbstractC1257a) r.l(this.zad.a())).buildClient(this.zab, looper, c6523eA, (C6523e) this.zae, (e.a) h10, (e.b) h10);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof AbstractC6521c)) {
            ((AbstractC6521c) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (fVarBuildClient instanceof ServiceConnectionC14411l)) {
            ((ServiceConnectionC14411l) fVarBuildClient).d(contextAttributionTag);
        }
        return fVarBuildClient;
    }

    private d(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        String apiFallbackAttributionTag;
        r.m(context, "Null context is not permitted.");
        r.m(aVar, "Api must not be null.");
        r.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) r.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f64753b;
        C14401b c14401bA = C14401b.a(aVar, dVar, apiFallbackAttributionTag);
        this.zaf = c14401bA;
        this.zai = new M(this);
        C14404e c14404eT = C14404e.t(context2);
        this.zaa = c14404eT;
        this.zah = c14404eT.k();
        this.zaj = aVar2.f64752a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C14423y.u(activity, c14404eT, c14401bA);
        }
        c14404eT.H(this);
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> AbstractC5232j<Void> doRegisterEventListener(C14414o<A, ?> c14414o) {
        r.l(c14414o);
        r.m(c14414o.f134678a.b(), "Listener has already been released.");
        r.m(c14414o.f134679b.a(), "Listener has already been released.");
        return this.zaa.w(this, c14414o.f134678a, c14414o.f134679b, c14414o.f134680c);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, Looper looper, InterfaceC14416q interfaceC14416q) {
        a.C1259a c1259a = new a.C1259a();
        c1259a.b(looper);
        c1259a.c(interfaceC14416q);
        this(context, aVar, o10, c1259a.a());
    }

    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, InterfaceC14416q interfaceC14416q) {
        a.C1259a c1259a = new a.C1259a();
        c1259a.c(interfaceC14416q);
        this(context, aVar, o10, c1259a.a());
    }
}
