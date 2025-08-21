package com.meijer.mobile.meijer.activity.checkout.outofstock;

import Co.Image;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.meijer.activity.checkout.outofstock.a;
import com.meijer.mobile.meijer.activity.checkout.outofstock.l;
import ev.C13889a;
import fj.EntryChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\u00060\u0015j\u0002`)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020.068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/outofstock/o;", "Landroidx/lifecycle/c0;", "Lil/m;", "cartRepository", "Lwr/f;", "cartInteractor", "<init>", "(Lil/m;Lwr/f;)V", "Ljava/util/ArrayList;", "Lvs/b;", "Lkotlin/collections/ArrayList;", "outOfStockList", "", "r", "(Ljava/util/ArrayList;)V", "", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l$b$b;", "list", "t", "(Ljava/util/List;)V", "", "", "codes", "s", "y", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a;", "action", "x", "(Lcom/meijer/mobile/meijer/activity/checkout/outofstock/a;)V", "a", "Lil/m;", "b", "Lwr/f;", "Lkotlin/coroutines/CoroutineContext;", "c", "Lkotlin/coroutines/CoroutineContext;", "vmJob", "Lmv/O;", "d", "Lmv/O;", "viewModelIO", "Lcom/meijer/mobile/core/model/common/ResourceId;", "e", "Ljava/lang/String;", "cartId", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/checkout/outofstock/l;", "f", "Lpv/B;", "_outOfStockState", "LJu/a;", "g", "LJu/a;", "disposables", "Lpv/P;", "h", "Lpv/P;", "w", "()Lpv/P;", "stateFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext vmJob;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O viewModelIO;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<l> _outOfStockState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final P<l> stateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockViewModel$onAction$1", f = "OutOfStockViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f104376a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.meijer.mobile.meijer.activity.checkout.outofstock.a f104378c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.meijer.mobile.meijer.activity.checkout.outofstock.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f104378c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new a(this.f104378c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f104376a == 0) {
                ResultKt.b(obj);
                o.this.s(((a.Dismiss) this.f104378c).a());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.outofstock.OutOfStockViewModel$removeAllOutOfStockItem$2$1", f = "OutOfStockViewModel.kt", l = {105, 111}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f104379a;

        /* renamed from: b, reason: collision with root package name */
        Object f104380b;

        /* renamed from: c, reason: collision with root package name */
        Object f104381c;

        /* renamed from: d, reason: collision with root package name */
        Object f104382d;

        /* renamed from: e, reason: collision with root package name */
        int f104383e;

        /* renamed from: f, reason: collision with root package name */
        int f104384f;

        /* renamed from: g, reason: collision with root package name */
        int f104385g;

        /* renamed from: h, reason: collision with root package name */
        int f104386h;

        /* renamed from: i, reason: collision with root package name */
        int f104387i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f104388j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<nk.i> f104390l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends nk.i> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f104390l = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = o.this.new b(this.f104390l, continuation);
            bVar.f104388j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
        
            if (r8.m(false, false, r7) == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v16, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.outofstock.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(il.m cartRepository, wr.f cartInteractor) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        this.cartRepository = cartRepository;
        this.cartInteractor = cartInteractor;
        CoroutineContext coroutineContext = d0.a(this).getCoroutineContext();
        this.vmJob = coroutineContext;
        this.viewModelIO = C15784P.a(coroutineContext.n0(C15800f0.b()));
        this.cartId = "-1";
        InterfaceC16549B<l> interfaceC16549BA = S.a(l.c.f104363a);
        this._outOfStockState = interfaceC16549BA;
        this.disposables = new Ju.a();
        this.stateFlow = interfaceC16549BA;
    }

    private final void r(ArrayList<CartProductListDecorator> outOfStockList) {
        String url;
        ArrayList arrayList = new ArrayList();
        for (CartProductListDecorator cartProductListDecorator : outOfStockList) {
            String code = cartProductListDecorator.getProduct().getCode();
            String name = cartProductListDecorator.getProduct().getName();
            String strValueOf = String.valueOf(cartProductListDecorator.getProduct().getQuantity());
            String formattedQuantity = cartProductListDecorator.getFormattedQuantity();
            Image imageA = Co.f.a(cartProductListDecorator.getProduct().j());
            if (imageA == null || (url = imageA.getUrl()) == null) {
                Image image = (Image) CollectionsKt.u0(cartProductListDecorator.getProduct().j());
                url = image != null ? image.getUrl() : null;
                if (url == null) {
                    url = "";
                }
            }
            arrayList.add(new l.b.OutOfStockItemState(name, formattedQuantity, EntryChange.c.f131921c, url, code, strValueOf, cartProductListDecorator.getProduct()));
        }
        t(arrayList);
    }

    private final void t(final List<l.b.OutOfStockItemState> list) {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.u(this.f104365a, list, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.checkout.outofstock.n
            @Override // Lu.g
            public final void accept(Object obj) {
                o.v(function1, obj);
            }
        }), this.disposables);
    }

    private final void y(List<String> codes) {
        List<String> list = codes;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(nk.k.b(Co.l.g((String) it.next()), 0.0d));
        }
        C15809k.d(d0.a(this), null, null, new b(arrayList, null), 3, null);
    }

    public final P<l> w() {
        return this.stateFlow;
    }

    public final void x(com.meijer.mobile.meijer.activity.checkout.outofstock.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Dismiss) {
            C15809k.d(this.viewModelIO, null, null, new a(action, null), 3, null);
        } else if (action instanceof a.SearchForReplacement) {
            this._outOfStockState.setValue(new l.OpenFindSubstitution(((a.SearchForReplacement) action).getItemToSubstitute()));
        } else {
            if (!(action instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            r(((a.b) action).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(List<String> codes) {
        y(codes);
        this._outOfStockState.setValue(l.a.f104353a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(o oVar, List list, String str) {
        Intrinsics.g(str);
        oVar.cartId = str;
        oVar._outOfStockState.setValue(new l.b.OutOfStockAdapterState(list, oVar.cartId));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
