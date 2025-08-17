package Eq;

import Fq.ShoppingListStore;
import Jk.AppVersion;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.S;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0019\u0010\u0015J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0004\b\"\u0010\fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0004\b#\u0010\fJ\u0018\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b%\u0010\u0015J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b'\u0010\u0015J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b)\u0010\u0015J(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b+\u0010,J$\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000fH\u0086@¢\u0006\u0004\b/\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020=0@8\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"LEq/b;", "", "LHq/c;", "shoppingListDataSource", "LJk/a;", "appVersion", "Lqv/K;", "ioDispatcher", "<init>", "(LHq/c;LJk/a;Lqv/K;)V", "", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceUpdate", "", "LFq/c;", "f", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "d", "(LFq/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "items", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "n", "LJs/b;", "weeklyAdItem", "o", "(LJs/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/f;", "product", "p", "(Lmk/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "l", "updatedItem", "r", "completedItem", "j", "uncompletedItem", "k", "itemBelow", "q", "(LFq/c;LFq/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LFq/a;", "favoriteItems", "c", "a", "LHq/c;", "b", "Lqv/K;", "getIoDispatcher", "()Lqv/K;", "LAv/a;", "LAv/a;", "loadMutex", "", "I", "expiryMinutes", "Ltv/B;", "LFq/e;", "Ltv/B;", "shoppingListStore", "Ltv/f;", "Ltv/f;", "h", "()Ltv/f;", "shoppingListFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Hq.c shoppingListDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Av.a loadMutex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int expiryMinutes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ShoppingListStore> shoppingListStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<ShoppingListStore> shoppingListFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {166, 167}, m = "addFavoriteItemsToShoppingList")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9564a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9565b;

        /* renamed from: d, reason: collision with root package name */
        int f9567d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9565b = obj;
            this.f9567d |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {78, BinsView.LABEL_WIDTH_DP, 83, 85}, m = "addItemToList")
    /* renamed from: Eq.b$b, reason: collision with other inner class name */
    static final class C0137b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9568a;

        /* renamed from: b, reason: collision with root package name */
        Object f9569b;

        /* renamed from: c, reason: collision with root package name */
        Object f9570c;

        /* renamed from: d, reason: collision with root package name */
        Object f9571d;

        /* renamed from: e, reason: collision with root package name */
        Object f9572e;

        /* renamed from: f, reason: collision with root package name */
        Object f9573f;

        /* renamed from: g, reason: collision with root package name */
        Object f9574g;

        /* renamed from: h, reason: collision with root package name */
        Object f9575h;

        /* renamed from: i, reason: collision with root package name */
        Object f9576i;

        /* renamed from: j, reason: collision with root package name */
        int f9577j;

        /* renamed from: k, reason: collision with root package name */
        int f9578k;

        /* renamed from: l, reason: collision with root package name */
        int f9579l;

        /* renamed from: m, reason: collision with root package name */
        int f9580m;

        /* renamed from: n, reason: collision with root package name */
        int f9581n;

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f9582o;

        /* renamed from: q, reason: collision with root package name */
        int f9584q;

        C0137b(Continuation<? super C0137b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9582o = obj;
            this.f9584q |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {89, 91}, m = "addItemsToList")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9585a;

        /* renamed from: b, reason: collision with root package name */
        Object f9586b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9587c;

        /* renamed from: e, reason: collision with root package name */
        int f9589e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9587c = obj;
            this.f9589e |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {188, 62}, m = "getShoppingList")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f9590a;

        /* renamed from: b, reason: collision with root package name */
        Object f9591b;

        /* renamed from: c, reason: collision with root package name */
        Object f9592c;

        /* renamed from: d, reason: collision with root package name */
        Object f9593d;

        /* renamed from: e, reason: collision with root package name */
        Object f9594e;

        /* renamed from: f, reason: collision with root package name */
        Object f9595f;

        /* renamed from: g, reason: collision with root package name */
        Object f9596g;

        /* renamed from: h, reason: collision with root package name */
        int f9597h;

        /* renamed from: i, reason: collision with root package name */
        int f9598i;

        /* renamed from: j, reason: collision with root package name */
        int f9599j;

        /* renamed from: k, reason: collision with root package name */
        int f9600k;

        /* renamed from: l, reason: collision with root package name */
        int f9601l;

        /* renamed from: m, reason: collision with root package name */
        int f9602m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f9603n;

        /* renamed from: p, reason: collision with root package name */
        int f9605p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9603n = obj;
            this.f9605p |= Integer.MIN_VALUE;
            return b.this.f(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {54}, m = "loadList")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9606a;

        /* renamed from: b, reason: collision with root package name */
        Object f9607b;

        /* renamed from: c, reason: collision with root package name */
        Object f9608c;

        /* renamed from: d, reason: collision with root package name */
        Object f9609d;

        /* renamed from: e, reason: collision with root package name */
        int f9610e;

        /* renamed from: f, reason: collision with root package name */
        int f9611f;

        /* renamed from: g, reason: collision with root package name */
        int f9612g;

        /* renamed from: h, reason: collision with root package name */
        int f9613h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f9614i;

        /* renamed from: k, reason: collision with root package name */
        int f9616k;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9614i = obj;
            this.f9616k |= Integer.MIN_VALUE;
            return b.this.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {136}, m = "markItemComplete")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9617a;

        /* renamed from: b, reason: collision with root package name */
        Object f9618b;

        /* renamed from: c, reason: collision with root package name */
        Object f9619c;

        /* renamed from: d, reason: collision with root package name */
        Object f9620d;

        /* renamed from: e, reason: collision with root package name */
        Object f9621e;

        /* renamed from: f, reason: collision with root package name */
        int f9622f;

        /* renamed from: g, reason: collision with root package name */
        int f9623g;

        /* renamed from: h, reason: collision with root package name */
        int f9624h;

        /* renamed from: i, reason: collision with root package name */
        int f9625i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f9626j;

        /* renamed from: l, reason: collision with root package name */
        int f9628l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9626j = obj;
            this.f9628l |= Integer.MIN_VALUE;
            return b.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {142}, m = "markItemInProgress")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9629a;

        /* renamed from: b, reason: collision with root package name */
        Object f9630b;

        /* renamed from: c, reason: collision with root package name */
        Object f9631c;

        /* renamed from: d, reason: collision with root package name */
        Object f9632d;

        /* renamed from: e, reason: collision with root package name */
        Object f9633e;

        /* renamed from: f, reason: collision with root package name */
        int f9634f;

        /* renamed from: g, reason: collision with root package name */
        int f9635g;

        /* renamed from: h, reason: collision with root package name */
        int f9636h;

        /* renamed from: i, reason: collision with root package name */
        int f9637i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f9638j;

        /* renamed from: l, reason: collision with root package name */
        int f9640l;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9638j = obj;
            this.f9640l |= Integer.MIN_VALUE;
            return b.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {l3.f92485d, 128}, m = "removeAllItems")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9641a;

        /* renamed from: c, reason: collision with root package name */
        int f9643c;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9641a = obj;
            this.f9643c |= Integer.MIN_VALUE;
            return b.this.l(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {117, 118}, m = "removeCompletedItems")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9644a;

        /* renamed from: c, reason: collision with root package name */
        int f9646c;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9644a = obj;
            this.f9646c |= Integer.MIN_VALUE;
            return b.this.m(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {98, 99}, m = "removeItem")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9647a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9648b;

        /* renamed from: d, reason: collision with root package name */
        int f9650d;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9648b = obj;
            this.f9650d |= Integer.MIN_VALUE;
            return b.this.n(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {104, 105, 106}, m = "removeItem")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9651a;

        /* renamed from: b, reason: collision with root package name */
        Object f9652b;

        /* renamed from: c, reason: collision with root package name */
        Object f9653c;

        /* renamed from: d, reason: collision with root package name */
        Object f9654d;

        /* renamed from: e, reason: collision with root package name */
        int f9655e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f9656f;

        /* renamed from: h, reason: collision with root package name */
        int f9658h;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9656f = obj;
            this.f9658h |= Integer.MIN_VALUE;
            return b.this.o(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {111, 112, 113}, m = "removeItem")
    static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9659a;

        /* renamed from: b, reason: collision with root package name */
        Object f9660b;

        /* renamed from: c, reason: collision with root package name */
        Object f9661c;

        /* renamed from: d, reason: collision with root package name */
        Object f9662d;

        /* renamed from: e, reason: collision with root package name */
        int f9663e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f9664f;

        /* renamed from: h, reason: collision with root package name */
        int f9666h;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9664f = obj;
            this.f9666h |= Integer.MIN_VALUE;
            return b.this.p(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {156, 162}, m = "reorderItem")
    static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9667a;

        /* renamed from: b, reason: collision with root package name */
        Object f9668b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9669c;

        /* renamed from: e, reason: collision with root package name */
        int f9671e;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9669c = obj;
            this.f9671e |= Integer.MIN_VALUE;
            return b.this.q(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFq/e;", "it", "", "<anonymous>", "(LFq/e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository$shoppingListFlow$1", f = "ShoppingListRepository.kt", l = {49}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<ShoppingListStore, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9672a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9673b;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = b.this.new n(continuation);
            nVar.f9673b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ShoppingListStore shoppingListStore, Continuation<? super Unit> continuation) {
            return ((n) create(shoppingListStore, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f9672a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ShoppingListStore shoppingListStore = (ShoppingListStore) this.f9673b;
                if (ShoppingListStore.e(shoppingListStore, null, 1, null)) {
                    b bVar = b.this;
                    this.f9673b = shoppingListStore;
                    this.f9672a = 1;
                    if (bVar.i(this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LFq/e;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository$shoppingListFlow$2", f = "ShoppingListRepository.kt", l = {50}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function3<InterfaceC17153g<? super ShoppingListStore>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9675a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9676b;

        o(Continuation<? super o> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super ShoppingListStore> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            o oVar = b.this.new o(continuation);
            oVar.f9676b = interfaceC17153g;
            return oVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f9675a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f9676b;
                ShoppingListStore shoppingListStore = new ShoppingListStore(null, null, b.this.expiryMinutes, 3, null);
                this.f9676b = interfaceC17153g;
                this.f9675a = 1;
                if (interfaceC17153g.emit(shoppingListStore, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.ShoppingListRepository", f = "ShoppingListRepository.kt", l = {132}, m = "updateItem")
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9678a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9679b;

        /* renamed from: d, reason: collision with root package name */
        int f9681d;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9679b = obj;
            this.f9681d |= Integer.MIN_VALUE;
            return b.this.r(null, this);
        }
    }

    public static /* synthetic */ Object g(b bVar, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return bVar.f(z10, continuation);
    }

    public b(Hq.c shoppingListDataSource, AppVersion appVersion, AbstractC16618K ioDispatcher) {
        Intrinsics.j(shoppingListDataSource, "shoppingListDataSource");
        Intrinsics.j(appVersion, "appVersion");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.shoppingListDataSource = shoppingListDataSource;
        this.ioDispatcher = ioDispatcher;
        this.loadMutex = Av.g.b(false, 1, null);
        int i10 = appVersion.getIsDevMode() ? 1 : 10;
        this.expiryMinutes = i10;
        InterfaceC17140B<ShoppingListStore> interfaceC17140BA = S.a(new ShoppingListStore(null, null, i10, 3, null));
        this.shoppingListStore = interfaceC17140BA;
        this.shoppingListFlow = C17154h.r(C17154h.g(C17154h.O(C17154h.c(interfaceC17140BA), new n(null)), new o(null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List<Fq.FavoriteListItem> r8, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Eq.b.a
            if (r0 == 0) goto L13
            r0 = r9
            Eq.b$a r0 = (Eq.b.a) r0
            int r1 = r0.f9567d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9567d = r1
            goto L18
        L13:
            Eq.b$a r0 = new Eq.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9565b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9567d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f9564a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            return r9
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f9564a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            goto L76
        L40:
            kotlin.ResultKt.b(r9)
            Hq.c r9 = r7.shoppingListDataSource
            r2 = r8
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.x(r2, r6)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L57:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r2.next()
            Fq.a r6 = (Fq.FavoriteListItem) r6
            com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel r6 = Iq.a.b(r6)
            r5.add(r6)
            goto L57
        L6b:
            r0.f9564a = r8
            r0.f9567d = r4
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 != r1) goto L76
            goto L80
        L76:
            r0.f9564a = r8
            r0.f9567d = r3
            java.lang.Object r8 = r7.f(r4, r0)
            if (r8 != r1) goto L81
        L80:
            return r1
        L81:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [Eq.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(Fq.ShoppingListItem r14, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.d(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List<Fq.ShoppingListItem> r8, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Eq.b.c
            if (r0 == 0) goto L13
            r0 = r9
            Eq.b$c r0 = (Eq.b.c) r0
            int r1 = r0.f9589e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9589e = r1
            goto L18
        L13:
            Eq.b$c r0 = new Eq.b$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9587c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9589e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f9586b
            com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse r8 = (com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse) r8
            java.lang.Object r8 = r0.f9585a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            return r9
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f9585a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            goto L7a
        L44:
            kotlin.ResultKt.b(r9)
            Hq.c r9 = r7.shoppingListDataSource
            r2 = r8
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.x(r2, r6)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L5b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r2.next()
            Fq.c r6 = (Fq.ShoppingListItem) r6
            com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel r6 = Iq.b.b(r6)
            r5.add(r6)
            goto L5b
        L6f:
            r0.f9585a = r8
            r0.f9589e = r4
            java.lang.Object r9 = r9.i(r5, r0)
            if (r9 != r1) goto L7a
            goto L98
        L7a:
            com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse r9 = (com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse) r9
            java.util.List r2 = r9.a()
            int r2 = r2.size()
            int r5 = r8.size()
            if (r2 != r5) goto L9a
            r0.f9585a = r8
            r0.f9586b = r9
            r0.f9589e = r3
            r8 = 0
            r9 = 0
            java.lang.Object r8 = g(r7, r8, r0, r4, r9)
            if (r8 != r1) goto L99
        L98:
            return r1
        L99:
            return r8
        L9a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not add items"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.e(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(13:13|59|14|39|(2:42|40)|65|43|48|(2:50|(1:51))|53|54|55|56)(2:20|21))(1:22))(3:23|(1:26)|37)|(3:62|28|(1:30)(3:31|55|56))|63|35|(11:38|39|(1:40)|65|43|48|(0)|53|54|55|56)|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: all -> 0x0049, Exception -> 0x004d, LOOP:0: B:40:0x00db->B:42:0x00e1, LOOP_END, TryCatch #0 {Exception -> 0x004d, blocks: (B:14:0x0044, B:39:0x00ca, B:40:0x00db, B:42:0x00e1, B:43:0x00ef), top: B:59:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:14:0x0044, B:39:0x00ca, B:40:0x00db, B:42:0x00e1, B:43:0x00ef, B:48:0x0107, B:50:0x010d, B:51:0x0112, B:53:0x012f, B:47:0x00f6), top: B:59:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r14, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.f(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final InterfaceC17152f<ShoppingListStore> h() {
        return this.shoppingListFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Eq.b.e
            if (r0 == 0) goto L13
            r0 = r6
            Eq.b$e r0 = (Eq.b.e) r0
            int r1 = r0.f9616k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9616k = r1
            goto L18
        L13:
            Eq.b$e r0 = new Eq.b$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9614i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9616k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f9609d
            Eq.b r1 = (Eq.b) r1
            java.lang.Object r1 = r0.f9608c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f9607b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f9606a
            Eq.b r1 = (Eq.b) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L63
        L3a:
            r6 = move-exception
            goto L68
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L44:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            r0.f9606a = r5     // Catch: java.lang.Exception -> L3a
            r0.f9607b = r0     // Catch: java.lang.Exception -> L3a
            r0.f9608c = r0     // Catch: java.lang.Exception -> L3a
            r0.f9609d = r5     // Catch: java.lang.Exception -> L3a
            r0.f9610e = r4     // Catch: java.lang.Exception -> L3a
            r0.f9611f = r4     // Catch: java.lang.Exception -> L3a
            r0.f9612g = r4     // Catch: java.lang.Exception -> L3a
            r0.f9613h = r4     // Catch: java.lang.Exception -> L3a
            r0.f9616k = r3     // Catch: java.lang.Exception -> L3a
            r6 = 0
            java.lang.Object r6 = g(r5, r4, r0, r3, r6)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L63
            return r1
        L63:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L79
        L68:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L79:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L88
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "Failed to load shopping list"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.f(r6, r1, r2)
        L88:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(Fq.ShoppingListItem r23, kotlin.coroutines.Continuation<? super Fq.ShoppingListItem> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            boolean r2 = r0 instanceof Eq.b.f
            if (r2 == 0) goto L17
            r2 = r0
            Eq.b$f r2 = (Eq.b.f) r2
            int r3 = r2.f9628l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9628l = r3
            goto L1c
        L17:
            Eq.b$f r2 = new Eq.b$f
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f9626j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f9628l
            r5 = 1
            if (r4 == 0) goto L4c
            if (r4 != r5) goto L44
            java.lang.Object r3 = r2.f9621e
            Eq.b r3 = (Eq.b) r3
            java.lang.Object r3 = r2.f9620d
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f9619c
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f9618b
            Eq.b r3 = (Eq.b) r3
            java.lang.Object r3 = r2.f9617a
            Fq.c r3 = (Fq.ShoppingListItem) r3
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L41
            goto L78
        L41:
            r0 = move-exception
            r6 = r3
            goto L83
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L4c:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L80
            Hq.c r0 = b(r1)     // Catch: java.lang.Exception -> L80
            com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel r4 = Iq.b.b(r23)     // Catch: java.lang.Exception -> L80
            r6 = r23
            r2.f9617a = r6     // Catch: java.lang.Exception -> L7e
            r2.f9618b = r1     // Catch: java.lang.Exception -> L7e
            r2.f9619c = r2     // Catch: java.lang.Exception -> L7e
            r2.f9620d = r2     // Catch: java.lang.Exception -> L7e
            r2.f9621e = r1     // Catch: java.lang.Exception -> L7e
            r7 = 0
            r2.f9622f = r7     // Catch: java.lang.Exception -> L7e
            r2.f9623g = r7     // Catch: java.lang.Exception -> L7e
            r2.f9624h = r7     // Catch: java.lang.Exception -> L7e
            r2.f9625i = r7     // Catch: java.lang.Exception -> L7e
            r2.f9628l = r5     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r0.b(r4, r2)     // Catch: java.lang.Exception -> L7e
            if (r0 != r3) goto L77
            return r3
        L77:
            r3 = r6
        L78:
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L41
            r2 = r3
            goto L95
        L7e:
            r0 = move-exception
            goto L83
        L80:
            r0 = move-exception
            r6 = r23
        L83:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            qv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            r2 = r6
        L95:
            boolean r3 = kotlin.Result.h(r0)
            if (r3 == 0) goto Lb8
            retrofit2.Response r0 = (retrofit2.Response) r0
            r20 = 32511(0x7eff, float:4.5558E-41)
            r21 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            Fq.c r0 = Fq.ShoppingListItem.b(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
        Lb8:
            java.lang.Object r0 = kotlin.Result.b(r0)
            kotlin.ResultKt.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.j(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(Fq.ShoppingListItem r23, kotlin.coroutines.Continuation<? super Fq.ShoppingListItem> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            boolean r2 = r0 instanceof Eq.b.g
            if (r2 == 0) goto L17
            r2 = r0
            Eq.b$g r2 = (Eq.b.g) r2
            int r3 = r2.f9640l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9640l = r3
            goto L1c
        L17:
            Eq.b$g r2 = new Eq.b$g
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f9638j
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f9640l
            r5 = 1
            if (r4 == 0) goto L4c
            if (r4 != r5) goto L44
            java.lang.Object r3 = r2.f9633e
            Eq.b r3 = (Eq.b) r3
            java.lang.Object r3 = r2.f9632d
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f9631c
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f9630b
            Eq.b r3 = (Eq.b) r3
            java.lang.Object r3 = r2.f9629a
            Fq.c r3 = (Fq.ShoppingListItem) r3
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L41
            goto L78
        L41:
            r0 = move-exception
            r6 = r3
            goto L83
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L4c:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L80
            Hq.c r0 = b(r1)     // Catch: java.lang.Exception -> L80
            com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel r4 = Iq.b.b(r23)     // Catch: java.lang.Exception -> L80
            r6 = r23
            r2.f9629a = r6     // Catch: java.lang.Exception -> L7e
            r2.f9630b = r1     // Catch: java.lang.Exception -> L7e
            r2.f9631c = r2     // Catch: java.lang.Exception -> L7e
            r2.f9632d = r2     // Catch: java.lang.Exception -> L7e
            r2.f9633e = r1     // Catch: java.lang.Exception -> L7e
            r7 = 0
            r2.f9634f = r7     // Catch: java.lang.Exception -> L7e
            r2.f9635g = r7     // Catch: java.lang.Exception -> L7e
            r2.f9636h = r7     // Catch: java.lang.Exception -> L7e
            r2.f9637i = r7     // Catch: java.lang.Exception -> L7e
            r2.f9640l = r5     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r0.g(r4, r2)     // Catch: java.lang.Exception -> L7e
            if (r0 != r3) goto L77
            return r3
        L77:
            r3 = r6
        L78:
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L41
            r2 = r3
            goto L95
        L7e:
            r0 = move-exception
            goto L83
        L80:
            r0 = move-exception
            r6 = r23
        L83:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            qv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            r2 = r6
        L95:
            boolean r3 = kotlin.Result.h(r0)
            if (r3 == 0) goto Lb8
            retrofit2.Response r0 = (retrofit2.Response) r0
            r20 = 32511(0x7eff, float:4.5558E-41)
            r21 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            Fq.c r0 = Fq.ShoppingListItem.b(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
        Lb8:
            java.lang.Object r0 = kotlin.Result.b(r0)
            kotlin.ResultKt.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.k(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Eq.b.h
            if (r0 == 0) goto L13
            r0 = r6
            Eq.b$h r0 = (Eq.b.h) r0
            int r1 = r0.f9643c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9643c = r1
            goto L18
        L13:
            Eq.b$h r0 = new Eq.b$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9641a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9643c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            goto L46
        L38:
            kotlin.ResultKt.b(r6)
            Hq.c r6 = r5.shoppingListDataSource
            r0.f9643c = r4
            java.lang.Object r6 = r6.j(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            r0.f9643c = r3
            r6 = 0
            r2 = 0
            java.lang.Object r6 = g(r5, r6, r0, r4, r2)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Eq.b.i
            if (r0 == 0) goto L13
            r0 = r6
            Eq.b$i r0 = (Eq.b.i) r0
            int r1 = r0.f9646c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9646c = r1
            goto L18
        L13:
            Eq.b$i r0 = new Eq.b$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9644a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9646c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            goto L46
        L38:
            kotlin.ResultKt.b(r6)
            Hq.c r6 = r5.shoppingListDataSource
            r0.f9646c = r4
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            r0.f9646c = r3
            r6 = 0
            r2 = 0
            java.lang.Object r6 = g(r5, r6, r0, r4, r2)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.m(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(Fq.ShoppingListItem r6, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Eq.b.j
            if (r0 == 0) goto L13
            r0 = r7
            Eq.b$j r0 = (Eq.b.j) r0
            int r1 = r0.f9650d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9650d = r1
            goto L18
        L13:
            Eq.b$j r0 = new Eq.b$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9648b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9650d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f9647a
            Fq.c r6 = (Fq.ShoppingListItem) r6
            kotlin.ResultKt.b(r7)
            return r7
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f9647a
            Fq.c r6 = (Fq.ShoppingListItem) r6
            kotlin.ResultKt.b(r7)
            goto L54
        L40:
            kotlin.ResultKt.b(r7)
            Hq.c r7 = r5.shoppingListDataSource
            com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel r2 = Iq.b.b(r6)
            r0.f9647a = r6
            r0.f9650d = r4
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L54
            goto L60
        L54:
            r0.f9647a = r6
            r0.f9650d = r3
            r6 = 0
            r7 = 0
            java.lang.Object r6 = g(r5, r6, r0, r4, r7)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.n(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(Js.WeeklyAdItem r13, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.o(Js.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(mk.f r13, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.p(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(Fq.ShoppingListItem r10, Fq.ShoppingListItem r11, kotlin.coroutines.Continuation<? super java.util.List<Fq.ShoppingListItem>> r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof Eq.b.m
            if (r0 == 0) goto L13
            r0 = r12
            Eq.b$m r0 = (Eq.b.m) r0
            int r1 = r0.f9671e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9671e = r1
            goto L18
        L13:
            Eq.b$m r0 = new Eq.b$m
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9669c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9671e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r10 = r0.f9668b
            Fq.c r10 = (Fq.ShoppingListItem) r10
            java.lang.Object r10 = r0.f9667a
            Fq.c r10 = (Fq.ShoppingListItem) r10
            kotlin.ResultKt.b(r12)
            return r12
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.f9668b
            r11 = r10
            Fq.c r11 = (Fq.ShoppingListItem) r11
            java.lang.Object r10 = r0.f9667a
            Fq.c r10 = (Fq.ShoppingListItem) r10
            kotlin.ResultKt.b(r12)
            goto L6d
        L49:
            kotlin.ResultKt.b(r12)
            Hq.c r12 = r9.shoppingListDataSource
            com.meijer.mobile.shoppinglist.service.requests.ShoppingListItemReorderRequest r2 = new com.meijer.mobile.shoppinglist.service.requests.ShoppingListItemReorderRequest
            long r5 = r10.getListItemId()
            if (r11 == 0) goto L5b
            long r7 = r11.getListItemId()
            goto L5d
        L5b:
            r7 = 0
        L5d:
            r2.<init>(r5, r7)
            r0.f9667a = r10
            r0.f9668b = r11
            r0.f9671e = r4
            java.lang.Object r12 = r12.c(r2, r0)
            if (r12 != r1) goto L6d
            goto L79
        L6d:
            r0.f9667a = r10
            r0.f9668b = r11
            r0.f9671e = r3
            java.lang.Object r10 = r9.f(r4, r0)
            if (r10 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.q(Fq.c, Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(Fq.ShoppingListItem r5, kotlin.coroutines.Continuation<? super Fq.ShoppingListItem> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Eq.b.p
            if (r0 == 0) goto L13
            r0 = r6
            Eq.b$p r0 = (Eq.b.p) r0
            int r1 = r0.f9681d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9681d = r1
            goto L18
        L13:
            Eq.b$p r0 = new Eq.b$p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9679b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9681d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f9678a
            Fq.c r5 = (Fq.ShoppingListItem) r5
            kotlin.ResultKt.b(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            Hq.c r6 = r4.shoppingListDataSource
            com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel r2 = Iq.b.b(r5)
            r0.f9678a = r5
            r0.f9681d = r3
            java.lang.Object r6 = r6.f(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel r6 = (com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel) r6
            Fq.c r5 = Iq.b.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.b.r(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
