package jg;

import android.app.Application;
import android.content.Context;
import cf.InterfaceC6504a;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljg/l;", "", "Lcom/google/firebase/f;", "firebaseApp", "Lmg/j;", "settings", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Ljg/Q;", "sessionsActivityLifecycleCallbacks", "<init>", "(Lcom/google/firebase/f;Lmg/j;Lkotlin/coroutines/CoroutineContext;Ljg/Q;)V", "a", "Lcom/google/firebase/f;", "b", "Lmg/j;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15018l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.f firebaseApp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mg.j settings;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: jg.l$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f140613a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f140615c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Q q10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f140615c = q10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C15018l.this.new a(this.f140615c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r6.f(r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f140613a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.ResultKt.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.ResultKt.b(r6)
                goto L2e
            L20:
                kotlin.ResultKt.b(r6)
                kg.b r6 = kg.C15124b.f141827a
                r5.f140613a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                goto L68
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L92
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r6.next()
                kg.c r1 = (kg.InterfaceC15125c) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L48
                jg.l r6 = jg.C15018l.this
                mg.j r6 = jg.C15018l.b(r6)
                r5.f140613a = r3
                java.lang.Object r6 = r6.f(r5)
                if (r6 != r0) goto L69
            L68:
                return r0
            L69:
                jg.l r6 = jg.C15018l.this
                mg.j r6 = jg.C15018l.b(r6)
                boolean r6 = r6.c()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r6 = com.fullstory.FS.log_d(r2, r6)
                kotlin.coroutines.jvm.internal.Boxing.d(r6)
                goto L9b
            L7f:
                jg.l r6 = jg.C15018l.this
                com.google.firebase.f r6 = jg.C15018l.a(r6)
                jg.Q r0 = r5.f140615c
                jg.k r1 = new jg.k
                r1.<init>()
                r6.h(r1)
                kotlin.Unit r6 = kotlin.Unit.f143329a
                goto L9b
            L92:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = com.fullstory.FS.log_d(r2, r6)
                kotlin.coroutines.jvm.internal.Boxing.d(r6)
            L9b:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.C15018l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C15018l(com.google.firebase.f firebaseApp, mg.j settings, @InterfaceC6504a CoroutineContext backgroundDispatcher, Q sessionsActivityLifecycleCallbacks) {
        Intrinsics.j(firebaseApp, "firebaseApp");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.j(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        FS.log_d("FirebaseSessions", "Initializing Firebase Sessions 3.0.0.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            C15809k.d(C15784P.a(backgroundDispatcher), null, null, new a(sessionsActivityLifecycleCallbacks, null), 3, null);
            return;
        }
        FS.log_e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
