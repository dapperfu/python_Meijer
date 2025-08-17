package hl;

import ej.CartChanges;
import ej.EntryChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.C16671v0;
import qv.InterfaceC16622O;
import rj.C16794c;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.S;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001*B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0081@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0081@¢\u0006\u0004\b!\u0010\"J\u001e\u0010$\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0080@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00105\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b8\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0@8\u0006¢\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\b=\u0010CR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0H8F¢\u0006\u0006\u001a\u0004\bA\u0010I¨\u0006K"}, d2 = {"Lhl/b;", "", "Lrj/c;", "cartEntryDataSource", "LTq/j;", "storeProvider", "Lqv/O;", "coroutineScope", "", "debounceTimeoutMillis", "<init>", "(Lrj/c;LTq/j;Lqv/O;J)V", "(Lrj/c;LTq/j;)V", "Lej/e;", "changes", "", "k", "(Lej/e;)V", "", "throwable", "m", "(Ljava/lang/Throwable;)V", "", "Lmk/i;", "entries", "g", "(Ljava/util/List;)V", "Lhl/z;", "changeRequest", "l", "(Lhl/z;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(Lej/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productQuantities", "q", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lrj/c;", "b", "LTq/j;", "c", "Lqv/O;", "Ltv/B;", "d", "Ltv/B;", "requestStore", "e", "submittedStore", "", "f", "Ljava/lang/String;", "lock", "Lhl/z;", "_pendingChanges", "h", "_submittedChanges", "Ltv/A;", "Ltk/c;", "Lej/j;", "i", "Ltv/A;", "_entryChangeFlow", "Ltv/F;", "j", "Ltv/F;", "()Ltv/F;", "entryChangeFlow", "", "_totalUnitCount", "totalUnitCount", "Ltv/f;", "()Ltv/f;", "unconfirmedChangesStream", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hl.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14490b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16794c cartEntryDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProductChangeRequest> requestStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProductChangeRequest> submittedStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ProductChangeRequest _pendingChanges;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ProductChangeRequest _submittedChanges;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<tk.c<EntryChange>> _entryChangeFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<tk.c<EntryChange>> entryChangeFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<Integer> _totalUnitCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<Integer> totalUnitCount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hl.b$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<CartChanges, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, C14490b.class, "onSubmitResult", "onSubmitResult$digitalshopping_release(Lcom/meijer/mobile/cart/model/common/CartChanges;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CartChanges cartChanges, Continuation<? super Unit> continuation) {
            return ((C14490b) this.receiver).n(cartChanges, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lej/e;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$4", f = "CartEntriesRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hl.b$b, reason: collision with other inner class name */
    static final class C2135b extends SuspendLambda implements Function3<InterfaceC17153g<? super CartChanges>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135214a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135215b;

        C2135b(Continuation<? super C2135b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super CartChanges> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            C2135b c2135b = C14490b.this.new C2135b(continuation);
            c2135b.f135215b = th2;
            return c2135b.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f135214a == 0) {
                ResultKt.b(obj);
                C14490b.this.m((Throwable) this.f135215b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$confirmEntries$1$2", f = "CartEntriesRepository.kt", l = {164, 165}, m = "invokeSuspend")
    /* renamed from: hl.b$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135217a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14490b.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
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
                int r1 = r5.f135217a
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r6)
                goto L54
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.ResultKt.b(r6)
                goto L3b
            L1f:
                kotlin.ResultKt.b(r6)
                hl.b r6 = hl.C14490b.this
                tv.B r6 = hl.C14490b.c(r6)
                hl.b r1 = hl.C14490b.this
                hl.z r1 = hl.C14490b.e(r1)
                hl.z r1 = hl.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f135217a = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L3b
                goto L53
            L3b:
                hl.b r6 = hl.C14490b.this
                tv.B r6 = hl.C14490b.b(r6)
                hl.b r1 = hl.C14490b.this
                hl.z r1 = hl.C14490b.d(r1)
                hl.z r1 = hl.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f135217a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hl.C14490b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$migrateSubmittedChanges$1$3", f = "CartEntriesRepository.kt", l = {142, 143}, m = "invokeSuspend")
    /* renamed from: hl.b$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135219a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14490b.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
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
                int r1 = r5.f135219a
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r6)
                goto L54
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                kotlin.ResultKt.b(r6)
                goto L3b
            L1f:
                kotlin.ResultKt.b(r6)
                hl.b r6 = hl.C14490b.this
                tv.B r6 = hl.C14490b.b(r6)
                hl.b r1 = hl.C14490b.this
                hl.z r1 = hl.C14490b.d(r1)
                hl.z r1 = hl.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f135219a = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L3b
                goto L53
            L3b:
                hl.b r6 = hl.C14490b.this
                tv.B r6 = hl.C14490b.c(r6)
                hl.b r1 = hl.C14490b.this
                hl.z r1 = hl.C14490b.e(r1)
                hl.z r1 = hl.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f135219a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hl.C14490b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository", f = "CartEntriesRepository.kt", l = {193, 195}, m = "onSubmitResult$digitalshopping_release")
    /* renamed from: hl.b$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f135221a;

        /* renamed from: b, reason: collision with root package name */
        Object f135222b;

        /* renamed from: c, reason: collision with root package name */
        Object f135223c;

        /* renamed from: d, reason: collision with root package name */
        Object f135224d;

        /* renamed from: e, reason: collision with root package name */
        Object f135225e;

        /* renamed from: f, reason: collision with root package name */
        int f135226f;

        /* renamed from: g, reason: collision with root package name */
        int f135227g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f135228h;

        /* renamed from: j, reason: collision with root package name */
        int f135230j;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f135228h = obj;
            this.f135230j |= Integer.MIN_VALUE;
            return C14490b.this.n(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.b$g */
    public static final class g implements InterfaceC17152f<ProductChangeRequest> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135231a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.b$g$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135232a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$special$$inlined$filter$1$2", f = "CartEntriesRepository.kt", l = {50}, m = "emit")
            /* renamed from: hl.b$g$a$a, reason: collision with other inner class name */
            public static final class C2136a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135233a;

                /* renamed from: b, reason: collision with root package name */
                int f135234b;

                /* renamed from: c, reason: collision with root package name */
                Object f135235c;

                /* renamed from: d, reason: collision with root package name */
                Object f135236d;

                /* renamed from: f, reason: collision with root package name */
                Object f135238f;

                /* renamed from: g, reason: collision with root package name */
                Object f135239g;

                /* renamed from: h, reason: collision with root package name */
                int f135240h;

                public C2136a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135233a = obj;
                    this.f135234b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g) {
                this.f135232a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hl.C14490b.g.a.C2136a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hl.b$g$a$a r0 = (hl.C14490b.g.a.C2136a) r0
                    int r1 = r0.f135234b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135234b = r1
                    goto L18
                L13:
                    hl.b$g$a$a r0 = new hl.b$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f135233a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135234b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f135239g
                    tv.g r5 = (tv.InterfaceC17153g) r5
                    java.lang.Object r5 = r0.f135236d
                    hl.b$g$a$a r5 = (hl.C14490b.g.a.C2136a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    tv.g r6 = r4.f135232a
                    r2 = r5
                    hl.z r2 = (hl.ProductChangeRequest) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L5b
                    r0.f135235c = r5
                    r0.f135236d = r0
                    r0.f135238f = r5
                    r0.f135239g = r6
                    r2 = 0
                    r0.f135240h = r2
                    r0.f135234b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14490b.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC17152f interfaceC17152f) {
            this.f135231a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super ProductChangeRequest> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135231a.collect(new a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hl.b$h */
    public static final class h implements InterfaceC17152f<CartChanges> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f135241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14490b f135242b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hl.b$h$a */
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f135243a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14490b f135244b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$special$$inlined$map$1$2", f = "CartEntriesRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: hl.b$h$a$a, reason: collision with other inner class name */
            public static final class C2137a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f135245a;

                /* renamed from: b, reason: collision with root package name */
                int f135246b;

                /* renamed from: c, reason: collision with root package name */
                Object f135247c;

                /* renamed from: e, reason: collision with root package name */
                Object f135249e;

                /* renamed from: f, reason: collision with root package name */
                Object f135250f;

                /* renamed from: g, reason: collision with root package name */
                Object f135251g;

                /* renamed from: h, reason: collision with root package name */
                Object f135252h;

                /* renamed from: i, reason: collision with root package name */
                Object f135253i;

                /* renamed from: j, reason: collision with root package name */
                Object f135254j;

                /* renamed from: k, reason: collision with root package name */
                int f135255k;

                /* renamed from: l, reason: collision with root package name */
                int f135256l;

                public C2137a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f135245a = obj;
                    this.f135246b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, C14490b c14490b) {
                this.f135243a = interfaceC17153g;
                this.f135244b = c14490b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof hl.C14490b.h.a.C2137a
                    if (r0 == 0) goto L13
                    r0 = r11
                    hl.b$h$a$a r0 = (hl.C14490b.h.a.C2137a) r0
                    int r1 = r0.f135246b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f135246b = r1
                    goto L18
                L13:
                    hl.b$h$a$a r0 = new hl.b$h$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f135245a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f135246b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f135251g
                    tv.g r10 = (tv.InterfaceC17153g) r10
                    java.lang.Object r10 = r0.f135249e
                    hl.b$h$a$a r10 = (hl.C14490b.h.a.C2137a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f135255k
                    java.lang.Object r2 = r0.f135254j
                    hl.z r2 = (hl.ProductChangeRequest) r2
                    java.lang.Object r2 = r0.f135253i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f135252h
                    tv.g r2 = (tv.InterfaceC17153g) r2
                    java.lang.Object r4 = r0.f135251g
                    tv.g r4 = (tv.InterfaceC17153g) r4
                    java.lang.Object r5 = r0.f135250f
                    java.lang.Object r6 = r0.f135249e
                    hl.b$h$a$a r6 = (hl.C14490b.h.a.C2137a) r6
                    java.lang.Object r7 = r0.f135247c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    tv.g r2 = r9.f135243a
                    r11 = r10
                    hl.z r11 = (hl.ProductChangeRequest) r11
                    hl.b r5 = r9.f135244b
                    r0.f135247c = r10
                    r0.f135249e = r0
                    r0.f135250f = r10
                    r0.f135251g = r2
                    r0.f135252h = r2
                    r0.f135253i = r0
                    r0.f135254j = r11
                    r6 = 0
                    r0.f135255k = r6
                    r0.f135256l = r6
                    r0.f135246b = r4
                    java.lang.Object r11 = r5.l(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f135247c = r10
                    r0.f135249e = r7
                    r0.f135250f = r5
                    r0.f135251g = r4
                    r10 = 0
                    r0.f135252h = r10
                    r0.f135253i = r10
                    r0.f135254j = r10
                    r0.f135255k = r6
                    r0.f135246b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f142422a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: hl.C14490b.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public h(InterfaceC17152f interfaceC17152f, C14490b c14490b) {
            this.f135241a = interfaceC17152f;
            this.f135242b = c14490b;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super CartChanges> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f135241a.collect(new a(interfaceC17153g, this.f135242b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhl/z;", "pending", "submitted", "<anonymous>", "(Lhl/z;Lhl/z;)Lhl/z;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$unconfirmedChangesStream$1", f = "CartEntriesRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hl.b$i */
    static final class i extends SuspendLambda implements Function3<ProductChangeRequest, ProductChangeRequest, Continuation<? super ProductChangeRequest>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f135257a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f135258b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f135259c;

        i(Continuation<? super i> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProductChangeRequest productChangeRequest, ProductChangeRequest productChangeRequest2, Continuation<? super ProductChangeRequest> continuation) {
            i iVar = new i(continuation);
            iVar.f135258b = productChangeRequest;
            iVar.f135259c = productChangeRequest2;
            return iVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f135257a == 0) {
                ResultKt.b(obj);
                return ((ProductChangeRequest) this.f135259c).v((ProductChangeRequest) this.f135258b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14490b(C16794c cartEntryDataSource, Tq.j storeProvider, InterfaceC16622O coroutineScope, long j10) {
        Intrinsics.j(cartEntryDataSource, "cartEntryDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.cartEntryDataSource = cartEntryDataSource;
        this.storeProvider = storeProvider;
        this.coroutineScope = coroutineScope;
        InterfaceC17140B<ProductChangeRequest> interfaceC17140BA = S.a(new ProductChangeRequest(null, 1, null));
        this.requestStore = interfaceC17140BA;
        this.submittedStore = S.a(new ProductChangeRequest(null, 1, null));
        this.lock = "LOCK";
        this._pendingChanges = new ProductChangeRequest(null, 1, null);
        this._submittedChanges = new ProductChangeRequest(null, 1, null);
        InterfaceC17139A<tk.c<EntryChange>> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._entryChangeFlow = interfaceC17139AB;
        this.entryChangeFlow = C17154h.b(interfaceC17139AB);
        InterfaceC17139A<Integer> interfaceC17139AB2 = C17146H.b(0, 0, null, 7, null);
        this._totalUnitCount = interfaceC17139AB2;
        this.totalUnitCount = C17154h.b(interfaceC17139AB2);
        C17154h.J(C17154h.g(C17154h.O(new h(C17154h.q(C17154h.r(new g(C17154h.b(interfaceC17140BA))), j10), this), new a(this)), new C2135b(null)), coroutineScope);
    }

    private final synchronized void k(CartChanges changes) {
        synchronized (this.lock) {
            try {
                ProductChangeRequest productChangeRequest = this._pendingChanges;
                List<EntryChange> listC = changes.c();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    mk.i productQuantity = ((EntryChange) it.next()).getProductQuantity();
                    if (productQuantity != null) {
                        arrayList.add(productQuantity);
                    }
                }
                ProductChangeRequest productChangeRequestK = productChangeRequest.k(arrayList, false);
                this._pendingChanges = this._pendingChanges.s(productChangeRequestK);
                this._submittedChanges = this._submittedChanges.v(productChangeRequestK);
                C16648k.d(this.coroutineScope, null, null, new e(null), 3, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange o(EntryChange entryChange) {
        return entryChange;
    }

    public final synchronized void g(List<? extends mk.i> entries) {
        Intrinsics.j(entries, "entries");
        synchronized (this.lock) {
            ProductChangeRequest productChangeRequestK = this._submittedChanges.k(entries, true);
            this._pendingChanges = this._pendingChanges.s(productChangeRequestK);
            this._submittedChanges = this._submittedChanges.s(productChangeRequestK);
            C16648k.d(this.coroutineScope, null, null, new d(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Throwable throwable) {
        uw.a.INSTANCE.f(throwable, "Cart entries failed to update", new Object[0]);
    }

    public final InterfaceC17144F<tk.c<EntryChange>> h() {
        return this.entryChangeFlow;
    }

    public final InterfaceC17144F<Integer> i() {
        return this.totalUnitCount;
    }

    public final InterfaceC17152f<ProductChangeRequest> j() {
        return C17154h.F(this.requestStore, this.submittedStore, new i(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(ej.CartChanges r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.C14490b.n(ej.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object p(Continuation<? super CartChanges> continuation) {
        return l(ProductChangeRequest.h(this._pendingChanges, null, 1, null), continuation);
    }

    public final Object q(List<? extends mk.i> list, Continuation<? super CartChanges> continuation) {
        return C16794c.d(this.cartEntryDataSource, list, this.storeProvider.g(), null, continuation, 4, null);
    }

    public final Object l(ProductChangeRequest productChangeRequest, Continuation<? super CartChanges> continuation) {
        return q(productChangeRequest.o(), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14490b(C16794c cartEntryDataSource, Tq.j storeProvider) {
        this(cartEntryDataSource, storeProvider, C16671v0.f157699a, 3000L);
        Intrinsics.j(cartEntryDataSource, "cartEntryDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
    }
}
