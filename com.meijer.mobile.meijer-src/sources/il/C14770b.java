package il;

import fj.CartChanges;
import fj.EntryChange;
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
import mv.C15809k;
import mv.C15832v0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.S;
import sj.C17079c;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001*B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0081@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0081@¢\u0006\u0004\b!\u0010\"J\u001e\u0010$\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0080@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00105\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b8\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020E0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0@8\u0006¢\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\b=\u0010CR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0H8F¢\u0006\u0006\u001a\u0004\bA\u0010I¨\u0006K"}, d2 = {"Lil/b;", "", "Lsj/c;", "cartEntryDataSource", "LTq/j;", "storeProvider", "Lmv/O;", "coroutineScope", "", "debounceTimeoutMillis", "<init>", "(Lsj/c;LTq/j;Lmv/O;J)V", "(Lsj/c;LTq/j;)V", "Lfj/e;", "changes", "", "k", "(Lfj/e;)V", "", "throwable", "m", "(Ljava/lang/Throwable;)V", "", "Lnk/i;", "entries", "g", "(Ljava/util/List;)V", "Lil/z;", "changeRequest", "l", "(Lil/z;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "(Lfj/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productQuantities", "q", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lsj/c;", "b", "LTq/j;", "c", "Lmv/O;", "Lpv/B;", "d", "Lpv/B;", "requestStore", "e", "submittedStore", "", "f", "Ljava/lang/String;", "lock", "Lil/z;", "_pendingChanges", "h", "_submittedChanges", "Lpv/A;", "Luk/c;", "Lfj/j;", "i", "Lpv/A;", "_entryChangeFlow", "Lpv/F;", "j", "Lpv/F;", "()Lpv/F;", "entryChangeFlow", "", "_totalUnitCount", "totalUnitCount", "Lpv/f;", "()Lpv/f;", "unconfirmedChangesStream", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: il.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14770b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17079c cartEntryDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProductChangeRequest> requestStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProductChangeRequest> submittedStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String lock;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private ProductChangeRequest _pendingChanges;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ProductChangeRequest _submittedChanges;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<uk.c<EntryChange>> _entryChangeFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<uk.c<EntryChange>> entryChangeFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<Integer> _totalUnitCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<Integer> totalUnitCount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: il.b$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<CartChanges, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, C14770b.class, "onSubmitResult", "onSubmitResult$digitalshopping_release(Lcom/meijer/mobile/cart/model/common/CartChanges;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CartChanges cartChanges, Continuation<? super Unit> continuation) {
            return ((C14770b) this.receiver).n(cartChanges, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lfj/e;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$4", f = "CartEntriesRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: il.b$b, reason: collision with other inner class name */
    static final class C2178b extends SuspendLambda implements Function3<InterfaceC16562g<? super CartChanges>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137854a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f137855b;

        C2178b(Continuation<? super C2178b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super CartChanges> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C2178b c2178b = C14770b.this.new C2178b(continuation);
            c2178b.f137855b = th2;
            return c2178b.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f137854a == 0) {
                ResultKt.b(obj);
                C14770b.this.m((Throwable) this.f137855b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$confirmEntries$1$2", f = "CartEntriesRepository.kt", l = {164, 165}, m = "invokeSuspend")
    /* renamed from: il.b$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137857a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14770b.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f137857a
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
                il.b r6 = il.C14770b.this
                pv.B r6 = il.C14770b.c(r6)
                il.b r1 = il.C14770b.this
                il.z r1 = il.C14770b.e(r1)
                il.z r1 = il.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f137857a = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L3b
                goto L53
            L3b:
                il.b r6 = il.C14770b.this
                pv.B r6 = il.C14770b.b(r6)
                il.b r1 = il.C14770b.this
                il.z r1 = il.C14770b.d(r1)
                il.z r1 = il.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f137857a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: il.C14770b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$migrateSubmittedChanges$1$3", f = "CartEntriesRepository.kt", l = {142, 143}, m = "invokeSuspend")
    /* renamed from: il.b$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137859a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14770b.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f137859a
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
                il.b r6 = il.C14770b.this
                pv.B r6 = il.C14770b.b(r6)
                il.b r1 = il.C14770b.this
                il.z r1 = il.C14770b.d(r1)
                il.z r1 = il.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f137859a = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L3b
                goto L53
            L3b:
                il.b r6 = il.C14770b.this
                pv.B r6 = il.C14770b.c(r6)
                il.b r1 = il.C14770b.this
                il.z r1 = il.C14770b.e(r1)
                il.z r1 = il.ProductChangeRequest.h(r1, r3, r4, r3)
                r5.f137859a = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: il.C14770b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository", f = "CartEntriesRepository.kt", l = {193, 195}, m = "onSubmitResult$digitalshopping_release")
    /* renamed from: il.b$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f137861a;

        /* renamed from: b, reason: collision with root package name */
        Object f137862b;

        /* renamed from: c, reason: collision with root package name */
        Object f137863c;

        /* renamed from: d, reason: collision with root package name */
        Object f137864d;

        /* renamed from: e, reason: collision with root package name */
        Object f137865e;

        /* renamed from: f, reason: collision with root package name */
        int f137866f;

        /* renamed from: g, reason: collision with root package name */
        int f137867g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f137868h;

        /* renamed from: j, reason: collision with root package name */
        int f137870j;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f137868h = obj;
            this.f137870j |= Integer.MIN_VALUE;
            return C14770b.this.n(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.b$g */
    public static final class g implements InterfaceC16561f<ProductChangeRequest> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137871a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.b$g$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137872a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$special$$inlined$filter$1$2", f = "CartEntriesRepository.kt", l = {50}, m = "emit")
            /* renamed from: il.b$g$a$a, reason: collision with other inner class name */
            public static final class C2179a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137873a;

                /* renamed from: b, reason: collision with root package name */
                int f137874b;

                /* renamed from: c, reason: collision with root package name */
                Object f137875c;

                /* renamed from: d, reason: collision with root package name */
                Object f137876d;

                /* renamed from: f, reason: collision with root package name */
                Object f137878f;

                /* renamed from: g, reason: collision with root package name */
                Object f137879g;

                /* renamed from: h, reason: collision with root package name */
                int f137880h;

                public C2179a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137873a = obj;
                    this.f137874b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f137872a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof il.C14770b.g.a.C2179a
                    if (r0 == 0) goto L13
                    r0 = r6
                    il.b$g$a$a r0 = (il.C14770b.g.a.C2179a) r0
                    int r1 = r0.f137874b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137874b = r1
                    goto L18
                L13:
                    il.b$g$a$a r0 = new il.b$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f137873a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137874b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f137879g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f137876d
                    il.b$g$a$a r5 = (il.C14770b.g.a.C2179a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5b
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f137872a
                    r2 = r5
                    il.z r2 = (il.ProductChangeRequest) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L5b
                    r0.f137875c = r5
                    r0.f137876d = r0
                    r0.f137878f = r5
                    r0.f137879g = r6
                    r2 = 0
                    r0.f137880h = r2
                    r0.f137874b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14770b.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public g(InterfaceC16561f interfaceC16561f) {
            this.f137871a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super ProductChangeRequest> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137871a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: il.b$h */
    public static final class h implements InterfaceC16561f<CartChanges> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f137881a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C14770b f137882b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: il.b$h$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f137883a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14770b f137884b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$special$$inlined$map$1$2", f = "CartEntriesRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: il.b$h$a$a, reason: collision with other inner class name */
            public static final class C2180a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f137885a;

                /* renamed from: b, reason: collision with root package name */
                int f137886b;

                /* renamed from: c, reason: collision with root package name */
                Object f137887c;

                /* renamed from: e, reason: collision with root package name */
                Object f137889e;

                /* renamed from: f, reason: collision with root package name */
                Object f137890f;

                /* renamed from: g, reason: collision with root package name */
                Object f137891g;

                /* renamed from: h, reason: collision with root package name */
                Object f137892h;

                /* renamed from: i, reason: collision with root package name */
                Object f137893i;

                /* renamed from: j, reason: collision with root package name */
                Object f137894j;

                /* renamed from: k, reason: collision with root package name */
                int f137895k;

                /* renamed from: l, reason: collision with root package name */
                int f137896l;

                public C2180a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f137885a = obj;
                    this.f137886b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, C14770b c14770b) {
                this.f137883a = interfaceC16562g;
                this.f137884b = c14770b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof il.C14770b.h.a.C2180a
                    if (r0 == 0) goto L13
                    r0 = r11
                    il.b$h$a$a r0 = (il.C14770b.h.a.C2180a) r0
                    int r1 = r0.f137886b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f137886b = r1
                    goto L18
                L13:
                    il.b$h$a$a r0 = new il.b$h$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f137885a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f137886b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f137891g
                    pv.g r10 = (pv.InterfaceC16562g) r10
                    java.lang.Object r10 = r0.f137889e
                    il.b$h$a$a r10 = (il.C14770b.h.a.C2180a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f137895k
                    java.lang.Object r2 = r0.f137894j
                    il.z r2 = (il.ProductChangeRequest) r2
                    java.lang.Object r2 = r0.f137893i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f137892h
                    pv.g r2 = (pv.InterfaceC16562g) r2
                    java.lang.Object r4 = r0.f137891g
                    pv.g r4 = (pv.InterfaceC16562g) r4
                    java.lang.Object r5 = r0.f137890f
                    java.lang.Object r6 = r0.f137889e
                    il.b$h$a$a r6 = (il.C14770b.h.a.C2180a) r6
                    java.lang.Object r7 = r0.f137887c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    pv.g r2 = r9.f137883a
                    r11 = r10
                    il.z r11 = (il.ProductChangeRequest) r11
                    il.b r5 = r9.f137884b
                    r0.f137887c = r10
                    r0.f137889e = r0
                    r0.f137890f = r10
                    r0.f137891g = r2
                    r0.f137892h = r2
                    r0.f137893i = r0
                    r0.f137894j = r11
                    r6 = 0
                    r0.f137895k = r6
                    r0.f137896l = r6
                    r0.f137886b = r4
                    java.lang.Object r11 = r5.l(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f137887c = r10
                    r0.f137889e = r7
                    r0.f137890f = r5
                    r0.f137891g = r4
                    r10 = 0
                    r0.f137892h = r10
                    r0.f137893i = r10
                    r0.f137894j = r10
                    r0.f137895k = r6
                    r0.f137886b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f143329a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: il.C14770b.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public h(InterfaceC16561f interfaceC16561f, C14770b c14770b) {
            this.f137881a = interfaceC16561f;
            this.f137882b = c14770b;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super CartChanges> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f137881a.collect(new a(interfaceC16562g, this.f137882b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lil/z;", "pending", "submitted", "<anonymous>", "(Lil/z;Lil/z;)Lil/z;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.cart.CartEntriesRepository$unconfirmedChangesStream$1", f = "CartEntriesRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: il.b$i */
    static final class i extends SuspendLambda implements Function3<ProductChangeRequest, ProductChangeRequest, Continuation<? super ProductChangeRequest>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f137897a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f137898b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f137899c;

        i(Continuation<? super i> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProductChangeRequest productChangeRequest, ProductChangeRequest productChangeRequest2, Continuation<? super ProductChangeRequest> continuation) {
            i iVar = new i(continuation);
            iVar.f137898b = productChangeRequest;
            iVar.f137899c = productChangeRequest2;
            return iVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f137897a == 0) {
                ResultKt.b(obj);
                return ((ProductChangeRequest) this.f137899c).u((ProductChangeRequest) this.f137898b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14770b(C17079c cartEntryDataSource, Tq.j storeProvider, InterfaceC15783O coroutineScope, long j10) {
        Intrinsics.j(cartEntryDataSource, "cartEntryDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.cartEntryDataSource = cartEntryDataSource;
        this.storeProvider = storeProvider;
        this.coroutineScope = coroutineScope;
        InterfaceC16549B<ProductChangeRequest> interfaceC16549BA = S.a(new ProductChangeRequest(null, 1, null));
        this.requestStore = interfaceC16549BA;
        this.submittedStore = S.a(new ProductChangeRequest(null, 1, null));
        this.lock = "LOCK";
        this._pendingChanges = new ProductChangeRequest(null, 1, null);
        this._submittedChanges = new ProductChangeRequest(null, 1, null);
        InterfaceC16548A<uk.c<EntryChange>> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._entryChangeFlow = interfaceC16548AB;
        this.entryChangeFlow = C16563h.b(interfaceC16548AB);
        InterfaceC16548A<Integer> interfaceC16548AB2 = C16555H.b(0, 0, null, 7, null);
        this._totalUnitCount = interfaceC16548AB2;
        this.totalUnitCount = C16563h.b(interfaceC16548AB2);
        C16563h.J(C16563h.g(C16563h.O(new h(C16563h.q(C16563h.r(new g(C16563h.b(interfaceC16549BA))), j10), this), new a(this)), new C2178b(null)), coroutineScope);
    }

    private final synchronized void k(CartChanges changes) {
        synchronized (this.lock) {
            try {
                ProductChangeRequest productChangeRequest = this._pendingChanges;
                List<EntryChange> listC = changes.c();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    nk.i productQuantity = ((EntryChange) it.next()).getProductQuantity();
                    if (productQuantity != null) {
                        arrayList.add(productQuantity);
                    }
                }
                ProductChangeRequest productChangeRequestK = productChangeRequest.k(arrayList, false);
                this._pendingChanges = this._pendingChanges.s(productChangeRequestK);
                this._submittedChanges = this._submittedChanges.u(productChangeRequestK);
                C15809k.d(this.coroutineScope, null, null, new e(null), 3, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EntryChange o(EntryChange entryChange) {
        return entryChange;
    }

    public final synchronized void g(List<? extends nk.i> entries) {
        Intrinsics.j(entries, "entries");
        synchronized (this.lock) {
            ProductChangeRequest productChangeRequestK = this._submittedChanges.k(entries, true);
            this._pendingChanges = this._pendingChanges.s(productChangeRequestK);
            this._submittedChanges = this._submittedChanges.s(productChangeRequestK);
            C15809k.d(this.coroutineScope, null, null, new d(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Throwable throwable) {
        qw.a.INSTANCE.f(throwable, "Cart entries failed to update", new Object[0]);
    }

    public final InterfaceC16553F<uk.c<EntryChange>> h() {
        return this.entryChangeFlow;
    }

    public final InterfaceC16553F<Integer> i() {
        return this.totalUnitCount;
    }

    public final InterfaceC16561f<ProductChangeRequest> j() {
        return C16563h.F(this.requestStore, this.submittedStore, new i(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(fj.CartChanges r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il.C14770b.n(fj.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object p(Continuation<? super CartChanges> continuation) {
        return l(ProductChangeRequest.h(this._pendingChanges, null, 1, null), continuation);
    }

    public final Object q(List<? extends nk.i> list, Continuation<? super CartChanges> continuation) {
        return C17079c.d(this.cartEntryDataSource, list, this.storeProvider.g(), null, continuation, 4, null);
    }

    public final Object l(ProductChangeRequest productChangeRequest, Continuation<? super CartChanges> continuation) {
        return q(productChangeRequest.o(), continuation);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14770b(C17079c cartEntryDataSource, Tq.j storeProvider) {
        this(cartEntryDataSource, storeProvider, C15832v0.f151773a, 3000L);
        Intrinsics.j(cartEntryDataSource, "cartEntryDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
    }
}
