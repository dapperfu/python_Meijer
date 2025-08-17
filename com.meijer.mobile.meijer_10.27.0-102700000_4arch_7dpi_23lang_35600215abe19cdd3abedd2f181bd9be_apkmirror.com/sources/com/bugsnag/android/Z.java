package com.bugsnag.android;

import Q6.ImmutableConfig;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/bugsnag/android/Z;", "LR6/c;", "LR6/b;", "contextModule", "LR6/a;", "configModule", "Lcom/bugsnag/android/A;", "dataCollectionModule", "LQ6/a;", "bgTaskService", "Lcom/bugsnag/android/f1;", "trackerModule", "LR6/d;", "systemServiceModule", "Lcom/bugsnag/android/B0;", "notifier", "Lcom/bugsnag/android/o;", "callbackState", "<init>", "(LR6/b;LR6/a;Lcom/bugsnag/android/A;LQ6/a;Lcom/bugsnag/android/f1;LR6/d;Lcom/bugsnag/android/B0;Lcom/bugsnag/android/o;)V", "LQ6/f;", "b", "LQ6/f;", "cfg", "Lcom/bugsnag/android/k0;", "c", "Lkotlin/Lazy;", "f", "()Lcom/bugsnag/android/k0;", "delegate", "Lcom/bugsnag/android/a0;", "d", "g", "()Lcom/bugsnag/android/a0;", "eventStore", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class Z extends R6.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig cfg;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy delegate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy eventStore;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/k0;", "c", "()Lcom/bugsnag/android/k0;"}, k = 3, mv = {1, 4, 2})
    static final class a extends Lambda implements Function0<C6478k0> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ R6.b f63340g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ R6.d f63341h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ A f63342i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f1 f63343j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ B0 f63344k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Q6.a f63345l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(R6.b bVar, R6.d dVar, A a10, f1 f1Var, B0 b02, Q6.a aVar) {
            super(0);
            this.f63340g = bVar;
            this.f63341h = dVar;
            this.f63342i = a10;
            this.f63343j = f1Var;
            this.f63344k = b02;
            this.f63345l = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6478k0 invoke() {
            if (Z.this.cfg.C().contains(Y0.INTERNAL_ERRORS)) {
                return new C6478k0(this.f63340g.getCtx(), Z.this.cfg.getLogger(), Z.this.cfg, this.f63341h.getStorageManager(), this.f63342i.j(), this.f63342i.k(), this.f63343j.getSessionTracker(), this.f63344k, this.f63345l);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/bugsnag/android/a0;", "c", "()Lcom/bugsnag/android/a0;"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function0<C6458a0> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B0 f63347g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Q6.a f63348h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CallbackState f63349i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B0 b02, Q6.a aVar, CallbackState callbackState) {
            super(0);
            this.f63347g = b02;
            this.f63348h = aVar;
            this.f63349i = callbackState;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C6458a0 invoke() {
            return new C6458a0(Z.this.cfg, Z.this.cfg.getLogger(), this.f63347g, this.f63348h, Z.this.f(), this.f63349i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6478k0 f() {
        return (C6478k0) this.delegate.getValue();
    }

    public final C6458a0 g() {
        return (C6458a0) this.eventStore.getValue();
    }

    public Z(R6.b bVar, R6.a aVar, A a10, Q6.a aVar2, f1 f1Var, R6.d dVar, B0 b02, CallbackState callbackState) {
        this.cfg = aVar.getConfig();
        this.delegate = b(new a(bVar, dVar, a10, f1Var, b02, aVar2));
        this.eventStore = b(new b(b02, aVar2, callbackState));
    }
}
