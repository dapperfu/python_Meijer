package com.google.android.gms.common.api;

import Vd.AbstractC5516j;
import Vd.C5517k;
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
import com.google.android.gms.common.internal.AbstractC6646c;
import com.google.android.gms.common.internal.C6648e;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.r;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import jd.AbstractC14991n;
import jd.AbstractC14995s;
import jd.AbstractC14997u;
import jd.C14978a;
import jd.C14979b;
import jd.C14982e;
import jd.C14987j;
import jd.C14988k;
import jd.C14992o;
import jd.C15001y;
import jd.H;
import jd.InterfaceC14994q;
import jd.M;
import jd.ServiceConnectionC14989l;
import jd.g0;

/* loaded from: classes4.dex */
public abstract class d<O extends a.d> {
    protected final C14982e zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final C14979b zaf;
    private final Looper zag;
    private final int zah;
    private final e zai;
    private final InterfaceC14994q zaj;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f65591c = new C1268a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC14994q f65592a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f65593b;

        /* renamed from: com.google.android.gms.common.api.d$a$a, reason: collision with other inner class name */
        public static class C1268a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC14994q f65594a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f65595b;

            /* JADX WARN: Multi-variable type inference failed */
            public a a() {
                if (this.f65594a == null) {
                    this.f65594a = new C14978a();
                }
                if (this.f65595b == null) {
                    this.f65595b = Looper.getMainLooper();
                }
                return new a(this.f65594a, this.f65595b);
            }

            public C1268a b(Looper looper) {
                r.m(looper, "Looper must not be null.");
                this.f65595b = looper;
                return this;
            }

            public C1268a c(InterfaceC14994q interfaceC14994q) {
                r.m(interfaceC14994q, "StatusExceptionMapper must not be null.");
                this.f65594a = interfaceC14994q;
                return this;
            }
        }

        private a(InterfaceC14994q interfaceC14994q, Account account, Looper looper) {
            this.f65592a = interfaceC14994q;
            this.f65593b = looper;
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
    public <A extends a.b, T extends AbstractC14991n<A, ?>, U extends AbstractC14997u<A, ?>> AbstractC5516j<Void> doRegisterEventListener(T t10, U u10) {
        r.l(t10);
        r.l(u10);
        r.m(t10.b(), "Listener has already been released.");
        r.m(u10.a(), "Listener has already been released.");
        r.b(C6660q.a(t10.b(), u10.a()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.w(this, t10, u10, new Runnable() { // from class: com.google.android.gms.common.api.n
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    public AbstractC5516j<Boolean> doUnregisterEventListener(C14987j.a<?> aVar) {
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
    public d(Activity activity, com.google.android.gms.common.api.a<O> aVar, O o10, InterfaceC14994q interfaceC14994q) {
        a.C1268a c1268a = new a.C1268a();
        c1268a.c(interfaceC14994q);
        c1268a.b(activity.getMainLooper());
        this(activity, (com.google.android.gms.common.api.a) aVar, (a.d) o10, c1268a.a());
    }

    private final AbstractC5516j zae(int i10, AbstractC14995s abstractC14995s) {
        C5517k c5517k = new C5517k();
        this.zaa.D(this, i10, abstractC14995s, c5517k, this.zaj);
        return c5517k.a();
    }

    protected C6648e.a createClientSettingsBuilder() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        C6648e.a aVar = new C6648e.a();
        a.d dVar = this.zae;
        if (!(dVar instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) dVar).a()) == null) {
            a.d dVar2 = this.zae;
            accountB = dVar2 instanceof a.d.InterfaceC1267a ? ((a.d.InterfaceC1267a) dVar2).b() : null;
        } else {
            accountB = googleSignInAccountA2.B();
        }
        aVar.d(accountB);
        a.d dVar3 = this.zae;
        Set<Scope> setJ1 = (!(dVar3 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) dVar3).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.j1();
        aVar.c(setJ1);
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    protected AbstractC5516j<Boolean> disconnectService() {
        return this.zaa.v(this);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5516j<TResult> doBestEffortWrite(AbstractC14995s<A, TResult> abstractC14995s) {
        return zae(2, abstractC14995s);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5516j<TResult> doRead(AbstractC14995s<A, TResult> abstractC14995s) {
        return zae(0, abstractC14995s);
    }

    @ResultIgnorabilityUnspecified
    public AbstractC5516j<Boolean> doUnregisterEventListener(C14987j.a<?> aVar, int i10) {
        r.m(aVar, "Listener key cannot be null.");
        return this.zaa.x(this, aVar, i10);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5516j<TResult> doWrite(AbstractC14995s<A, TResult> abstractC14995s) {
        return zae(1, abstractC14995s);
    }

    public final C14979b<O> getApiKey() {
        return this.zaf;
    }

    public <L> C14987j<L> registerListener(L l10, String str) {
        return C14988k.a(l10, this.zag, str);
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
        C6648e c6648eA = createClientSettingsBuilder().a();
        a.f fVarBuildClient = ((a.AbstractC1266a) r.l(this.zad.a())).buildClient(this.zab, looper, c6648eA, (C6648e) this.zae, (e.a) h10, (e.b) h10);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof AbstractC6646c)) {
            ((AbstractC6646c) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (fVarBuildClient instanceof ServiceConnectionC14989l)) {
            ((ServiceConnectionC14989l) fVarBuildClient).d(contextAttributionTag);
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
        this.zag = aVar2.f65593b;
        C14979b c14979bA = C14979b.a(aVar, dVar, apiFallbackAttributionTag);
        this.zaf = c14979bA;
        this.zai = new M(this);
        C14982e c14982eT = C14982e.t(context2);
        this.zaa = c14982eT;
        this.zah = c14982eT.k();
        this.zaj = aVar2.f65592a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C15001y.u(activity, c14982eT, c14979bA);
        }
        c14982eT.H(this);
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> AbstractC5516j<Void> doRegisterEventListener(C14992o<A, ?> c14992o) {
        r.l(c14992o);
        r.m(c14992o.f140367a.b(), "Listener has already been released.");
        r.m(c14992o.f140368b.a(), "Listener has already been released.");
        return this.zaa.w(this, c14992o.f140367a, c14992o.f140368b, c14992o.f140369c);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, Looper looper, InterfaceC14994q interfaceC14994q) {
        a.C1268a c1268a = new a.C1268a();
        c1268a.b(looper);
        c1268a.c(interfaceC14994q);
        this(context, aVar, o10, c1268a.a());
    }

    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    @Deprecated
    public d(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, InterfaceC14994q interfaceC14994q) {
        a.C1268a c1268a = new a.C1268a();
        c1268a.c(interfaceC14994q);
        this(context, aVar, o10, c1268a.a());
    }
}
