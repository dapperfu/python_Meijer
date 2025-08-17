package Eq;

import Fq.FavoriteListItem;
import Fq.FavoriteListStore;
import Jk.AppVersion;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.S;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0010J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0017\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u001a\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020%0(8\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"LEq/a;", "", "LHq/a;", "favoritesListService", "LJk/a;", "appVersion", "<init>", "(LHq/a;LJk/a;)V", "", "forceUpdate", "", "LFq/a;", "g", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "c", "(LFq/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmk/c;", "items", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "i", "product", "j", "(Lmk/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "a", "LHq/a;", "LAv/a;", "b", "LAv/a;", "loadMutex", "", "I", "expiryMinutes", "Ltv/B;", "LFq/b;", "Ltv/B;", "favoritesStore", "Ltv/f;", "Ltv/f;", "f", "()Ltv/f;", "favoriteItemsFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Hq.a favoritesListService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Av.a loadMutex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int expiryMinutes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<FavoriteListStore> favoritesStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<FavoriteListStore> favoriteItemsFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository", f = "FavoritesListRepository.kt", l = {65, 67}, m = "addItem")
    /* renamed from: Eq.a$a, reason: collision with other inner class name */
    static final class C0136a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9511a;

        /* renamed from: b, reason: collision with root package name */
        Object f9512b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9513c;

        /* renamed from: e, reason: collision with root package name */
        int f9515e;

        C0136a(Continuation<? super C0136a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9513c = obj;
            this.f9515e |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository", f = "FavoritesListRepository.kt", l = {84, 86}, m = "addItems")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9516a;

        /* renamed from: b, reason: collision with root package name */
        Object f9517b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9518c;

        /* renamed from: e, reason: collision with root package name */
        int f9520e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9518c = obj;
            this.f9520e |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFq/b;", "it", "", "<anonymous>", "(LFq/b;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository$favoriteItemsFlow$1", f = "FavoritesListRepository.kt", l = {42}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<FavoriteListStore, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9521a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9522b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f9522b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FavoriteListStore favoriteListStore, Continuation<? super Unit> continuation) {
            return ((c) create(favoriteListStore, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f9521a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                FavoriteListStore favoriteListStore = (FavoriteListStore) this.f9522b;
                if (FavoriteListStore.e(favoriteListStore, null, 1, null)) {
                    a aVar = a.this;
                    this.f9522b = favoriteListStore;
                    this.f9521a = 1;
                    if (a.h(aVar, false, this, 1, null) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LFq/b;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository$favoriteItemsFlow$2", f = "FavoritesListRepository.kt", l = {43}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super FavoriteListStore>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f9524a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9525b;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super FavoriteListStore> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = a.this.new d(continuation);
            dVar.f9525b = interfaceC17153g;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f9524a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f9525b;
                FavoriteListStore favoriteListStore = new FavoriteListStore(null, null, a.this.expiryMinutes, 3, null);
                this.f9525b = interfaceC17153g;
                this.f9524a = 1;
                if (interfaceC17153g.emit(favoriteListStore, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository", f = "FavoritesListRepository.kt", l = {l3.f92485d, 49}, m = "getList")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f9527a;

        /* renamed from: b, reason: collision with root package name */
        Object f9528b;

        /* renamed from: c, reason: collision with root package name */
        Object f9529c;

        /* renamed from: d, reason: collision with root package name */
        Object f9530d;

        /* renamed from: e, reason: collision with root package name */
        Object f9531e;

        /* renamed from: f, reason: collision with root package name */
        Object f9532f;

        /* renamed from: g, reason: collision with root package name */
        Object f9533g;

        /* renamed from: h, reason: collision with root package name */
        int f9534h;

        /* renamed from: i, reason: collision with root package name */
        int f9535i;

        /* renamed from: j, reason: collision with root package name */
        int f9536j;

        /* renamed from: k, reason: collision with root package name */
        int f9537k;

        /* renamed from: l, reason: collision with root package name */
        int f9538l;

        /* renamed from: m, reason: collision with root package name */
        int f9539m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f9540n;

        /* renamed from: p, reason: collision with root package name */
        int f9542p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9540n = obj;
            this.f9542p |= Integer.MIN_VALUE;
            return a.this.g(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository", f = "FavoritesListRepository.kt", l = {93, 94}, m = "removeItem")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9543a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9544b;

        /* renamed from: d, reason: collision with root package name */
        int f9546d;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9544b = obj;
            this.f9546d |= Integer.MIN_VALUE;
            return a.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository", f = "FavoritesListRepository.kt", l = {101, 102}, m = "removeItem")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9547a;

        /* renamed from: b, reason: collision with root package name */
        Object f9548b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9549c;

        /* renamed from: e, reason: collision with root package name */
        int f9551e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9549c = obj;
            this.f9551e |= Integer.MIN_VALUE;
            return a.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.domain.FavoritesListRepository", f = "FavoritesListRepository.kt", l = {109, 110}, m = "removeItems")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f9552a;

        /* renamed from: b, reason: collision with root package name */
        Object f9553b;

        /* renamed from: c, reason: collision with root package name */
        Object f9554c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9555d;

        /* renamed from: f, reason: collision with root package name */
        int f9557f;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9555d = obj;
            this.f9557f |= Integer.MIN_VALUE;
            return a.this.k(null, this);
        }
    }

    public a(Hq.a favoritesListService, AppVersion appVersion) {
        Intrinsics.j(favoritesListService, "favoritesListService");
        Intrinsics.j(appVersion, "appVersion");
        this.favoritesListService = favoritesListService;
        this.loadMutex = Av.g.b(false, 1, null);
        this.expiryMinutes = appVersion.getIsDevMode() ? 1 : 10;
        InterfaceC17140B<FavoriteListStore> interfaceC17140BA = S.a(new FavoriteListStore(null, null, 0, 7, null));
        this.favoritesStore = interfaceC17140BA;
        this.favoriteItemsFlow = C17154h.r(C17154h.g(C17154h.O(C17154h.c(interfaceC17140BA), new c(null)), new d(null)));
    }

    public static /* synthetic */ Object h(a aVar, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return aVar.g(z10, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(Fq.FavoriteListItem r6, kotlin.coroutines.Continuation<? super java.util.List<Fq.FavoriteListItem>> r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Eq.a.C0136a
            if (r0 == 0) goto L13
            r0 = r7
            Eq.a$a r0 = (Eq.a.C0136a) r0
            int r1 = r0.f9515e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9515e = r1
            goto L18
        L13:
            Eq.a$a r0 = new Eq.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9513c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9515e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f9512b
            com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse r6 = (com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse) r6
            java.lang.Object r6 = r0.f9511a
            Fq.a r6 = (Fq.FavoriteListItem) r6
            kotlin.ResultKt.b(r7)
            return r7
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f9511a
            Fq.a r6 = (Fq.FavoriteListItem) r6
            kotlin.ResultKt.b(r7)
            goto L58
        L44:
            kotlin.ResultKt.b(r7)
            Hq.a r7 = r5.favoritesListService
            com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel r2 = Iq.a.b(r6)
            r0.f9511a = r6
            r0.f9515e = r4
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L58
            goto L70
        L58:
            com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse r7 = (com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse) r7
            java.util.List r2 = r7.a()
            int r2 = r2.size()
            if (r2 != r4) goto L72
            r0.f9511a = r6
            r0.f9512b = r7
            r0.f9515e = r3
            java.lang.Object r6 = r5.g(r4, r0)
            if (r6 != r1) goto L71
        L70:
            return r1
        L71:
            return r6
        L72:
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not add: "
            r0.append(r1)
            java.lang.String r6 = r6.b()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.a.c(Fq.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List<Fq.FavoriteListItem> r8, kotlin.coroutines.Continuation<? super java.util.List<Fq.FavoriteListItem>> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Eq.a.b
            if (r0 == 0) goto L13
            r0 = r9
            Eq.a$b r0 = (Eq.a.b) r0
            int r1 = r0.f9520e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9520e = r1
            goto L18
        L13:
            Eq.a$b r0 = new Eq.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9518c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9520e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f9517b
            com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse r8 = (com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse) r8
            java.lang.Object r8 = r0.f9516a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            return r9
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f9516a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            goto L7a
        L44:
            kotlin.ResultKt.b(r9)
            Hq.a r9 = r7.favoritesListService
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
            Fq.a r6 = (Fq.FavoriteListItem) r6
            com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel r6 = Iq.a.b(r6)
            r5.add(r6)
            goto L5b
        L6f:
            r0.f9516a = r8
            r0.f9520e = r4
            java.lang.Object r9 = r9.a(r5, r0)
            if (r9 != r1) goto L7a
            goto L96
        L7a:
            com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse r9 = (com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse) r9
            java.util.List r2 = r9.a()
            int r2 = r2.size()
            int r5 = r8.size()
            if (r2 != r5) goto L98
            r0.f9516a = r8
            r0.f9517b = r9
            r0.f9520e = r3
            java.lang.Object r8 = r7.g(r4, r0)
            if (r8 != r1) goto L97
        L96:
            return r1
        L97:
            return r8
        L98:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Could not add items"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.a.d(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object e(List<? extends mk.c> list, Continuation<? super List<FavoriteListItem>> continuation) {
        List<? extends mk.c> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (mk.c cVar : list2) {
            arrayList.add(new FavoriteListItem(0L, 0, 0, cVar.getCode(), cVar.getName(), false, 39, null));
        }
        return d(arrayList, continuation);
    }

    public final InterfaceC17152f<FavoriteListStore> f() {
        return this.favoriteItemsFlow;
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
    public final java.lang.Object g(boolean r14, kotlin.coroutines.Continuation<? super java.util.List<Fq.FavoriteListItem>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.a.g(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(Fq.FavoriteListItem r8, kotlin.coroutines.Continuation<? super java.util.List<Fq.FavoriteListItem>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Eq.a.f
            if (r0 == 0) goto L13
            r0 = r9
            Eq.a$f r0 = (Eq.a.f) r0
            int r1 = r0.f9546d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9546d = r1
            goto L18
        L13:
            Eq.a$f r0 = new Eq.a$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9544b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9546d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f9543a
            Fq.a r8 = (Fq.FavoriteListItem) r8
            kotlin.ResultKt.b(r9)
            return r9
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f9543a
            Fq.a r8 = (Fq.FavoriteListItem) r8
            kotlin.ResultKt.b(r9)
            goto L61
        L40:
            kotlin.ResultKt.b(r9)
            Hq.a r9 = r7.favoritesListService
            com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest r2 = new com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest
            long r5 = r8.getListItemId()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.e(r5)
            java.util.List r5 = kotlin.collections.CollectionsKt.e(r5)
            r2.<init>(r5)
            r0.f9543a = r8
            r0.f9546d = r4
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L61
            goto L6b
        L61:
            r0.f9543a = r8
            r0.f9546d = r3
            java.lang.Object r8 = r7.g(r4, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.a.i(Fq.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(mk.c r9, kotlin.coroutines.Continuation<? super java.util.List<Fq.FavoriteListItem>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Eq.a.g
            if (r0 == 0) goto L13
            r0 = r10
            Eq.a$g r0 = (Eq.a.g) r0
            int r1 = r0.f9551e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9551e = r1
            goto L18
        L13:
            Eq.a$g r0 = new Eq.a$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9549c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9551e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f9548b
            Fq.a r9 = (Fq.FavoriteListItem) r9
            java.lang.Object r9 = r0.f9547a
            mk.c r9 = (mk.c) r9
            kotlin.ResultKt.b(r10)
            return r10
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f9548b
            Fq.a r9 = (Fq.FavoriteListItem) r9
            java.lang.Object r2 = r0.f9547a
            mk.c r2 = (mk.c) r2
            kotlin.ResultKt.b(r10)
            r10 = r9
            r9 = r2
            goto L85
        L4a:
            kotlin.ResultKt.b(r10)
            tv.B<Fq.b> r10 = r8.favoritesStore
            java.lang.Object r10 = r10.getValue()
            Fq.b r10 = (Fq.FavoriteListStore) r10
            Fq.a r10 = r10.f(r9)
            if (r10 != 0) goto L65
            Fq.a r10 = new Fq.a
            r10.<init>(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.e(r10)
            return r9
        L65:
            Hq.a r2 = r8.favoritesListService
            com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest r5 = new com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest
            long r6 = r10.getListItemId()
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.e(r6)
            java.util.List r6 = kotlin.collections.CollectionsKt.e(r6)
            r5.<init>(r6)
            r0.f9547a = r9
            r0.f9548b = r10
            r0.f9551e = r4
            java.lang.Object r2 = r2.c(r5, r0)
            if (r2 != r1) goto L85
            goto L91
        L85:
            r0.f9547a = r9
            r0.f9548b = r10
            r0.f9551e = r3
            java.lang.Object r9 = r8.g(r4, r0)
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.a.j(mk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List<Fq.FavoriteListItem> r8, kotlin.coroutines.Continuation<? super java.util.List<Fq.FavoriteListItem>> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Eq.a.h
            if (r0 == 0) goto L13
            r0 = r9
            Eq.a$h r0 = (Eq.a.h) r0
            int r1 = r0.f9557f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9557f = r1
            goto L18
        L13:
            Eq.a$h r0 = new Eq.a$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9555d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f9557f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f9554c
            com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest r8 = (com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest) r8
            java.lang.Object r8 = r0.f9553b
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r0.f9552a
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.b(r9)
            return r9
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f9554c
            com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest r8 = (com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest) r8
            java.lang.Object r2 = r0.f9553b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.f9552a
            java.util.List r5 = (java.util.List) r5
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r5
            goto L95
        L52:
            kotlin.ResultKt.b(r9)
            r9 = r8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.x(r9, r5)
            r2.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L67:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r9.next()
            Fq.a r5 = (Fq.FavoriteListItem) r5
            long r5 = r5.getListItemId()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.e(r5)
            r2.add(r5)
            goto L67
        L7f:
            com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest r9 = new com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest
            r9.<init>(r2)
            Hq.a r5 = r7.favoritesListService
            r0.f9552a = r8
            r0.f9553b = r2
            r0.f9554c = r9
            r0.f9557f = r4
            java.lang.Object r5 = r5.c(r9, r0)
            if (r5 != r1) goto L95
            goto La3
        L95:
            r0.f9552a = r8
            r0.f9553b = r2
            r0.f9554c = r9
            r0.f9557f = r3
            java.lang.Object r8 = r7.g(r4, r0)
            if (r8 != r1) goto La4
        La3:
            return r1
        La4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Eq.a.k(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
