package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.content.Context;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u001a\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b%\u0010*¨\u0006,"}, d2 = {"Lcom/bugsnag/android/U0;", "LR6/c;", "Landroid/content/Context;", "appContext", "LQ6/f;", "immutableConfig", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Landroid/content/Context;LQ6/f;Lcom/bugsnag/android/t0;)V", "Lcom/bugsnag/android/Q0;", "b", "Lkotlin/Lazy;", "k", "()Lcom/bugsnag/android/Q0;", "sharedPrefMigrator", "Lcom/bugsnag/android/O;", "c", "f", "()Lcom/bugsnag/android/O;", "deviceIdStore", "", "d", "e", "()Ljava/lang/String;", "deviceId", "g", "internalDeviceId", "Lcom/bugsnag/android/j1;", "l", "()Lcom/bugsnag/android/j1;", "userStore", "Lcom/bugsnag/android/q0;", "i", "()Lcom/bugsnag/android/q0;", "lastRunInfoStore", "Lcom/bugsnag/android/N0;", "h", "j", "()Lcom/bugsnag/android/N0;", "sessionStore", "Lcom/bugsnag/android/p0;", "()Lcom/bugsnag/android/p0;", "lastRunInfo", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class U0 extends R6.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy sharedPrefMigrator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceIdStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy userStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy lastRunInfoStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy sessionStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy deviceId = b(new a());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy internalDeviceId = b(new c());

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy lastRunInfo = b(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 4, 2})
    static final class a extends Lambda implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return U0.this.f().a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/O;", "c", "()Lcom/bugsnag/android/O;"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function0<O> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f63282g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6495t0 f63283h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, InterfaceC6495t0 interfaceC6495t0) {
            super(0);
            this.f63282g = context;
            this.f63283h = interfaceC6495t0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            return new O(this.f63282g, null, null, null, null, U0.this.k(), this.f63283h, 30, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/String;"}, k = 3, mv = {1, 4, 2})
    static final class c extends Lambda implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return U0.this.f().b();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/p0;", "c", "()Lcom/bugsnag/android/p0;"}, k = 3, mv = {1, 4, 2})
    static final class d extends Lambda implements Function0<LastRunInfo> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final LastRunInfo invoke() {
            LastRunInfo lastRunInfoD = U0.this.i().d();
            U0.this.i().f(new LastRunInfo(0, false, false));
            return lastRunInfoD;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/q0;", "c", "()Lcom/bugsnag/android/q0;"}, k = 3, mv = {1, 4, 2})
    static final class e extends Lambda implements Function0<C6490q0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImmutableConfig f63286f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ImmutableConfig immutableConfig) {
            super(0);
            this.f63286f = immutableConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6490q0 invoke() {
            return new C6490q0(this.f63286f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/N0;", "c", "()Lcom/bugsnag/android/N0;"}, k = 3, mv = {1, 4, 2})
    static final class f extends Lambda implements Function0<N0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImmutableConfig f63287f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6495t0 f63288g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ImmutableConfig immutableConfig, InterfaceC6495t0 interfaceC6495t0) {
            super(0);
            this.f63287f = immutableConfig;
            this.f63288g = interfaceC6495t0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final N0 invoke() {
            return new N0(this.f63287f, this.f63288g, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/Q0;", "c", "()Lcom/bugsnag/android/Q0;"}, k = 3, mv = {1, 4, 2})
    static final class g extends Lambda implements Function0<Q0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f63289f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.f63289f = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Q0 invoke() {
            return new Q0(this.f63289f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/j1;", "c", "()Lcom/bugsnag/android/j1;"}, k = 3, mv = {1, 4, 2})
    static final class h extends Lambda implements Function0<j1> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ImmutableConfig f63291g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6495t0 f63292h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ImmutableConfig immutableConfig, InterfaceC6495t0 interfaceC6495t0) {
            super(0);
            this.f63291g = immutableConfig;
            this.f63292h = interfaceC6495t0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j1 invoke() {
            return new j1(this.f63291g, U0.this.e(), null, U0.this.k(), this.f63292h, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O f() {
        return (O) this.deviceIdStore.getValue();
    }

    public final String e() {
        return (String) this.deviceId.getValue();
    }

    public final String g() {
        return (String) this.internalDeviceId.getValue();
    }

    public final LastRunInfo h() {
        return (LastRunInfo) this.lastRunInfo.getValue();
    }

    public final C6490q0 i() {
        return (C6490q0) this.lastRunInfoStore.getValue();
    }

    public final N0 j() {
        return (N0) this.sessionStore.getValue();
    }

    public final Q0 k() {
        return (Q0) this.sharedPrefMigrator.getValue();
    }

    public final j1 l() {
        return (j1) this.userStore.getValue();
    }

    public U0(Context context, ImmutableConfig immutableConfig, InterfaceC6495t0 interfaceC6495t0) {
        this.sharedPrefMigrator = b(new g(context));
        this.deviceIdStore = b(new b(context, interfaceC6495t0));
        this.userStore = b(new h(immutableConfig, interfaceC6495t0));
        this.lastRunInfoStore = b(new e(immutableConfig));
        this.sessionStore = b(new f(immutableConfig, interfaceC6495t0));
    }
}
