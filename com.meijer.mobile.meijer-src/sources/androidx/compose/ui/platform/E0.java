package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/E0;", "", "<init>", "()V", "", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "c", "sent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f52009a = new E0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean sent = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f52012d = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f52013a;

        /* renamed from: b, reason: collision with root package name */
        Object f52014b;

        /* renamed from: c, reason: collision with root package name */
        int f52015c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ov.g<Unit> f52016d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f52016d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ov.g<Unit> gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f52016d = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f52015c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f52014b
                ov.i r1 = (ov.i) r1
                java.lang.Object r3 = r5.f52013a
                ov.v r3 = (ov.v) r3
                kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                kotlin.ResultKt.b(r6)
                ov.g<kotlin.Unit> r3 = r5.f52016d
                ov.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f52013a = r3     // Catch: java.lang.Throwable -> L17
                r5.f52014b = r1     // Catch: java.lang.Throwable -> L17
                r5.f52015c = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.E0.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                androidx.compose.runtime.snapshots.g$a r6 = androidx.compose.runtime.snapshots.g.INSTANCE     // Catch: java.lang.Throwable -> L17
                r6.m()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                kotlin.Unit r6 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                ov.n.a(r3, r6)
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                ov.n.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.E0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ov.g<Unit> f52017f;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ov.g<Unit> gVar) {
            super(1);
            this.f52017f = gVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            if (E0.sent.compareAndSet(false, true)) {
                this.f52017f.k(Unit.f143329a);
            }
        }
    }

    public final void b() {
        if (started.compareAndSet(false, true)) {
            ov.g gVarB = ov.j.b(1, null, null, 6, null);
            C15809k.d(C15784P.a(P.INSTANCE.b()), null, null, new a(gVarB, null), 3, null);
            androidx.compose.runtime.snapshots.g.INSTANCE.j(new b(gVarB));
        }
    }

    private E0() {
    }
}
