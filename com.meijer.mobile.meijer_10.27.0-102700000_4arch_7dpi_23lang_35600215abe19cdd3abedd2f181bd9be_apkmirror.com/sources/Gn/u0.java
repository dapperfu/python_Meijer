package Gn;

import Fq.FavoriteListItem;
import Go.Suggestion;
import Go.SuggestionResult;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jv.C15079b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tm.AbstractC17122a;
import tm.InterfaceC17124c;
import um.C17279b;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u00012B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"LGn/u0;", "Ltm/a;", "Lum/b;", "appBackgroundManager", "LRo/c;", "productsRepository", "", "showFavoriteItems", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(Lum/b;LRo/c;ZI)V", "", "Q", "()V", "P", "S", "", "LFq/a;", "favoritesList", "C0", "(Ljava/util/List;)V", "", "query", "A0", "(Ljava/lang/String;)V", "LGo/d;", "typeAheadResponse", "D0", "(LGo/d;)V", "d", "LRo/c;", "e", "Z", "f", "I", "", "g", "Ljava/util/List;", "Ljv/b;", "h", "Ljv/b;", "textChangeSubject", "i", "Ljava/lang/String;", "LNu/a;", "j", "LNu/a;", "disposables", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class u0 extends AbstractC17122a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean showFavoriteItems;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int storeId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<FavoriteListItem> favoritesList;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C15079b<String> textChangeSubject;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String query;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LGn/u0$a;", "Ltm/c;", "", "LGn/v0;", "typeAheadResults", "", "f0", "(Ljava/util/List;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends InterfaceC17124c {
        void f0(List<ShoppingListTypeAheadResultItem> typeAheadResults);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LGo/d;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListTypeAheadItem$onViewResumed$3", f = "ShoppingListTypeAheadItem.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<sv.t<? super SuggestionResult>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11786a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return u0.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sv.t<? super SuggestionResult> tVar, Continuation<? super Unit> continuation) {
            return ((b) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f11786a == 0) {
                ResultKt.b(obj);
                u0.this.productsRepository.t();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // tm.AbstractC17122a
    public void S() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(C17279b c17279b, Ro.c productsRepository, boolean z10, int i10) {
        super(c17279b);
        Intrinsics.j(productsRepository, "productsRepository");
        this.productsRepository = productsRepository;
        this.showFavoriteItems = z10;
        this.storeId = i10;
        this.favoritesList = new ArrayList();
        C15079b<String> c15079bE = C15079b.e();
        Intrinsics.i(c15079bE, "create(...)");
        this.textChangeSubject = c15079bE;
        this.disposables = new Nu.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(u0 u0Var, Set set, Set set2, Suggestion suggestion) {
        Intrinsics.j(suggestion, "<destruct>");
        String value = suggestion.getValue();
        boolean z10 = false;
        if (u0Var.showFavoriteItems) {
            List<FavoriteListItem> list = u0Var.favoritesList;
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            for (Object obj : list) {
                FavoriteListItem favoriteListItem = (FavoriteListItem) obj;
                z11 = z11 || StringsKt.H(favoriteListItem.b(), value, true);
                String strB = favoriteListItem.b();
                if (strB != null && StringsKt.a0(strB, value, true)) {
                    arrayList.add(obj);
                }
            }
            set2.addAll(arrayList);
            z10 = z11;
        }
        if (!z10) {
            set.add(value);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(Throwable th2) {
        uw.a.INSTANCE.f(th2, "Error processing shopping list type ahead results", new Object[0]);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(u0 u0Var, Set set, List list, Set set2) {
        if (u0Var.showFavoriteItems && u0Var.query != null) {
            List<FavoriteListItem> list2 = u0Var.favoritesList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                String itemDescription = ((FavoriteListItem) obj).getItemDescription();
                String str = u0Var.query;
                Intrinsics.g(str);
                if (StringsKt.H(itemDescription, StringsKt.y1(str).toString(), true)) {
                    arrayList.add(obj);
                }
            }
            set.addAll(arrayList);
            Set set3 = set;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(set3, 10));
            Iterator it = set3.iterator();
            while (it.hasNext()) {
                arrayList2.add(new ShoppingListTypeAheadResultItem((FavoriteListItem) it.next(), null, false, 6, null));
            }
            list.addAll(arrayList2);
        }
        Set set4 = set2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(set4, 10));
        Iterator it2 = set4.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new ShoppingListTypeAheadResultItem((String) it2.next()));
        }
        list.addAll(arrayList3);
        InterfaceC17124c interfaceC17124cM = u0Var.M();
        a aVar = interfaceC17124cM instanceof a ? (a) interfaceC17124cM : null;
        if (aVar != null) {
            aVar.f0(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p0(String query) {
        Intrinsics.j(query, "query");
        return !StringsKt.r0(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q0(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(u0 u0Var, String query) {
        Intrinsics.j(query, "query");
        u0Var.productsRepository.v(query);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(u0 u0Var, SuggestionResult typeAheadResponse) {
        Intrinsics.j(typeAheadResponse, "typeAheadResponse");
        u0Var.D0(typeAheadResponse);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        uw.a.INSTANCE.f(throwable, "Error processing type ahead", new Object[0]);
        return Unit.f142422a;
    }

    public final void A0(String query) {
        Intrinsics.j(query, "query");
        this.textChangeSubject.onNext(StringsKt.y1(query).toString());
        this.query = query;
    }

    public final void C0(List<FavoriteListItem> favoritesList) {
        Intrinsics.j(favoritesList, "favoritesList");
        this.favoritesList.clear();
        this.favoritesList.addAll(favoritesList);
    }

    public final void D0(SuggestionResult typeAheadResponse) {
        Intrinsics.j(typeAheadResponse, "typeAheadResponse");
        final ArrayList arrayList = new ArrayList();
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        io.reactivex.l lVarObserveOn = io.reactivex.l.fromIterable(typeAheadResponse.a()).subscribeOn(C14764a.a()).observeOn(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: Gn.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u0.E0(this.f11773a, linkedHashSet, linkedHashSet2, (Suggestion) obj);
            }
        };
        Pu.g gVar = new Pu.g() { // from class: Gn.t0
            @Override // Pu.g
            public final void accept(Object obj) {
                u0.G0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Gn.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u0.H0((Throwable) obj);
            }
        };
        Ck.a.a(lVarObserveOn.subscribe(gVar, new Pu.g() { // from class: Gn.j0
            @Override // Pu.g
            public final void accept(Object obj) {
                u0.I0(function12, obj);
            }
        }, new Pu.a() { // from class: Gn.k0
            @Override // Pu.a
            public final void run() {
                u0.K0(this.f11756a, linkedHashSet2, arrayList, linkedHashSet);
            }
        }), this.disposables);
    }

    @Override // tm.AbstractC17122a
    public void P() {
        this.disposables.d();
        super.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // tm.AbstractC17122a
    public void Q() {
        super.Q();
        C15079b<String> c15079b = this.textChangeSubject;
        final Function1 function1 = new Function1() { // from class: Gn.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u0.p0((String) obj));
            }
        };
        io.reactivex.l<String> lVarFilter = c15079b.filter(new Pu.q() { // from class: Gn.l0
            @Override // Pu.q
            public final boolean test(Object obj) {
                return u0.q0(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: Gn.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u0.s0(this.f11763a, (String) obj);
            }
        };
        Ck.a.a(lVarFilter.subscribe(new Pu.g() { // from class: Gn.n0
            @Override // Pu.g
            public final void accept(Object obj) {
                u0.t0(function12, obj);
            }
        }), this.disposables);
        io.reactivex.l lVarObserveOn = xv.k.c(null, new b(null), 1, null).subscribeOn(C14764a.b()).observeOn(Mu.a.a());
        final Function1 function13 = new Function1() { // from class: Gn.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u0.u0(this.f11766a, (SuggestionResult) obj);
            }
        };
        Pu.g gVar = new Pu.g() { // from class: Gn.p0
            @Override // Pu.g
            public final void accept(Object obj) {
                u0.v0(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: Gn.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u0.w0((Throwable) obj);
            }
        };
        Ck.a.a(lVarObserveOn.subscribe(gVar, new Pu.g() { // from class: Gn.r0
            @Override // Pu.g
            public final void accept(Object obj) {
                u0.x0(function14, obj);
            }
        }), this.disposables);
    }
}
