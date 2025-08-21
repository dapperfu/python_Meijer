package Pq;

import Bq.a;
import Bq.b;
import Co.ProductFullDetails;
import Fq.ShoppingListItem;
import Go.SearchSuggestions;
import Pj.a;
import Pk.Coupon;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import dl.C13702d;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0004uogkB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001fH\u0002¢\u0006\u0004\b(\u0010#J(\u0010.\u001a\u00020\u00112\u0006\u0010)\u001a\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00112\u0006\u0010)\u001a\u00020&H\u0082@¢\u0006\u0004\b0\u00101J,\u00105\u001a\u00020\u00112\u0006\u0010)\u001a\u00020&2\u0006\u00103\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H\u0082@¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00112\u0006\u00107\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b:\u0010;J\"\u0010>\u001a\u00020\u00112\u0006\u0010<\u001a\u00020&2\b\u0010=\u001a\u0004\u0018\u00010&H\u0082@¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00112\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010E\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010D\u001a\u000202H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bG\u00109J/\u0010H\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010&2\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020\u00112\u0006\u00107\u001a\u00020&H\u0082@¢\u0006\u0004\bJ\u00101J\u001e\u0010L\u001a\u00020\u00112\f\u0010K\u001a\b\u0012\u0004\u0012\u00020&0\u001fH\u0082@¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0011H\u0082@¢\u0006\u0004\bN\u0010%J\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020@H\u0002¢\u0006\u0004\bP\u0010CJ\u000f\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0011H\u0082@¢\u0006\u0004\bS\u0010%J\u001d\u0010U\u001a\u00020\u00112\f\u0010T\u001a\b\u0012\u0004\u0012\u00020&0\u001fH\u0002¢\u0006\u0004\bU\u0010#J'\u0010X\u001a\u00020\u00112\f\u0010V\u001a\b\u0012\u0004\u0012\u00020&0\u001f2\b\b\u0002\u0010W\u001a\u000202H\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00112\u0006\u0010)\u001a\u00020&H\u0002¢\u0006\u0004\bZ\u00109J\u0017\u0010]\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00020j0n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020,0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001d\u0010}\u001a\b\u0012\u0004\u0012\u00020,0x8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\"\u0010\u0085\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, d2 = {"LPq/h;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LEq/b;", "shoppingListRepository", "LRo/c;", "productsRepository", "Lzl/k;", "featureManager", "Lhi/a;", "analyticsEngine", "Ldl/d;", "couponsRepository", "<init>", "(LEq/b;LRo/c;Lzl/k;Lhi/a;Ldl/d;)V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "LBq/a;", "action", "b0", "(LBq/a;)V", "LBq/b;", "e0", "(LBq/b;)V", "LPq/h$e;", "W", "(LPq/h$e;)V", "", "LPj/a;", "loadingStates", "onLoadingStates", "(Ljava/util/List;)V", "U", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LFq/c;", "shoppingList", "T", "item", "", "initialQuantity", "LPq/h$g;", "errorEvent", "c0", "(LFq/c;ILPq/h$g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Y", "(LFq/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isItemRemoved", "quantity", "f0", "(LFq/c;ZLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shoppingListItem", "s0", "(LFq/c;)V", "q0", "(LFq/c;I)V", "itemToMove", "itemBelow", "h0", "(LFq/c;LFq/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "searchTerm", "Z", "(Ljava/lang/String;)V", "isBarcodeScanner", "l0", "(LFq/c;Z)V", "o0", "w0", "(LFq/c;ZLjava/lang/Integer;)V", "R", "shoppingListItems", "Q", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "S", "optionSelected", "u0", "j0", "()V", "X", "inProgressList", "a0", "list", "updateLoadingState", "y0", "(Ljava/util/List;Z)V", "d0", "", "offerId", "i0", "(J)V", "a", "LEq/b;", "b", "LRo/c;", "c", "Lzl/k;", "d", "Lhi/a;", "e", "Ldl/d;", "Lpv/B;", "LPq/h$h;", "f", "Lpv/B;", "_stateFlow", "Lpv/P;", "g", "Lpv/P;", "V", "()Lpv/P;", "stateFlow", "Lpv/A;", "h", "Lpv/A;", "_events", "Lpv/F;", "i", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "LPj/c;", "j", "LPj/c;", "loadingStateManager", "LPk/a;", "k", "Ljava/util/List;", "clippedOffersList", "Lwv/a;", "l", "Lwv/a;", "mutex", "m", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class h extends c0 implements InterfaceC6157f {

    /* renamed from: n, reason: collision with root package name */
    public static final int f26261n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ShoppingListState> _stateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<ShoppingListState> stateFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC4614g> _events;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<AbstractC4614g> events;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStateManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<Coupon> clippedOffersList;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$3", f = "ShoppingListViewModel.kt", l = {678}, m = "invokeSuspend")
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26274a;

        A(Continuation<? super A> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new A(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26274a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                this.f26274a = 1;
                if (hVar.U(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$4", f = "ShoppingListViewModel.kt", l = {680}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26276a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bq.a f26278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(Bq.a aVar, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f26278c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new B(this.f26278c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26276a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                ShoppingListItem item = ((a.Remove) this.f26278c).getItem();
                this.f26276a = 1;
                if (h.g0(hVar, item, true, null, this, 4, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$5", f = "ShoppingListViewModel.kt", l = {683}, m = "invokeSuspend")
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26279a;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26279a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                this.f26279a = 1;
                if (hVar.X(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$6", f = "ShoppingListViewModel.kt", l = {685}, m = "invokeSuspend")
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26281a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bq.a f26283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(Bq.a aVar, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f26283c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new D(this.f26283c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26281a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                ShoppingListItem item = ((a.UpdateCompletion) this.f26283c).getItem();
                this.f26281a = 1;
                if (hVar.Y(item, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$7", f = "ShoppingListViewModel.kt", l = {689}, m = "invokeSuspend")
    static final class E extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26284a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bq.a f26286c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(Bq.a aVar, Continuation<? super E> continuation) {
            super(2, continuation);
            this.f26286c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new E(this.f26286c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26284a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                ShoppingListItem itemToMove = ((a.MoveItem) this.f26286c).getItemToMove();
                ShoppingListItem itemOnBottom = ((a.MoveItem) this.f26286c).getItemOnBottom();
                this.f26284a = 1;
                if (hVar.h0(itemToMove, itemOnBottom, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {214, 220}, m = "onShoppingListItemChange")
    static final class F extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26287a;

        /* renamed from: b, reason: collision with root package name */
        Object f26288b;

        /* renamed from: c, reason: collision with root package name */
        Object f26289c;

        /* renamed from: d, reason: collision with root package name */
        Object f26290d;

        /* renamed from: e, reason: collision with root package name */
        Object f26291e;

        /* renamed from: f, reason: collision with root package name */
        Object f26292f;

        /* renamed from: g, reason: collision with root package name */
        int f26293g;

        /* renamed from: h, reason: collision with root package name */
        int f26294h;

        /* renamed from: i, reason: collision with root package name */
        int f26295i;

        /* renamed from: j, reason: collision with root package name */
        int f26296j;

        /* renamed from: k, reason: collision with root package name */
        int f26297k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f26298l;

        /* renamed from: n, reason: collision with root package name */
        int f26300n;

        F(Continuation<? super F> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26298l = obj;
            this.f26300n |= Integer.MIN_VALUE;
            return h.this.c0(null, 0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemChange$4$1", f = "ShoppingListViewModel.kt", l = {234}, m = "invokeSuspend")
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26301a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4614g f26303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(AbstractC4614g abstractC4614g, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f26303c = abstractC4614g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new G(this.f26303c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26301a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g abstractC4614g = this.f26303c;
                this.f26301a = 1;
                if (interfaceC16548A.emit(abstractC4614g, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemClicked$1", f = "ShoppingListViewModel.kt", l = {605, 615, 628}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class H extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26304a;

        /* renamed from: b, reason: collision with root package name */
        Object f26305b;

        /* renamed from: c, reason: collision with root package name */
        int f26306c;

        /* renamed from: d, reason: collision with root package name */
        int f26307d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f26308e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h f26309f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(ShoppingListItem shoppingListItem, h hVar, Continuation<? super H> continuation) {
            super(2, continuation);
            this.f26308e = shoppingListItem;
            this.f26309f = hVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(ShoppingListItem shoppingListItem, TrackingData trackingData) {
            trackingData.n("Shopping List");
            trackingData.v("shopping list");
            trackingData.h("couponId", String.valueOf(shoppingListItem.getCouponId()));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(ShoppingListItem shoppingListItem, TrackingData trackingData) {
            trackingData.n("Shopping List");
            trackingData.v("shopping list");
            trackingData.h("listingId", shoppingListItem.getListingId());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(ShoppingListItem shoppingListItem, TrackingData trackingData) {
            trackingData.n("Shopping List");
            trackingData.v("shopping list");
            nk.c cVarJ = shoppingListItem.j();
            trackingData.h("ProductSKU", cVarJ != null ? cVarJ.getCode() : null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(TrackingData trackingData) {
            trackingData.n("Shopping List");
            trackingData.v("shopping list");
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new H(this.f26308e, this.f26309f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0127, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0129, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Pq.h.H.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListSearchAction$2", f = "ShoppingListViewModel.kt", l = {705}, m = "invokeSuspend")
    static final class I extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26310a;

        I(Continuation<? super I> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new I(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26310a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.C0485g c0485g = AbstractC4614g.C0485g.f26391a;
                this.f26310a = 1;
                if (interfaceC16548A.emit(c0485g, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {294}, m = "removeItem")
    static final class J extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26312a;

        /* renamed from: b, reason: collision with root package name */
        Object f26313b;

        /* renamed from: c, reason: collision with root package name */
        Object f26314c;

        /* renamed from: d, reason: collision with root package name */
        Object f26315d;

        /* renamed from: e, reason: collision with root package name */
        Object f26316e;

        /* renamed from: f, reason: collision with root package name */
        Object f26317f;

        /* renamed from: g, reason: collision with root package name */
        boolean f26318g;

        /* renamed from: h, reason: collision with root package name */
        int f26319h;

        /* renamed from: i, reason: collision with root package name */
        int f26320i;

        /* renamed from: j, reason: collision with root package name */
        int f26321j;

        /* renamed from: k, reason: collision with root package name */
        int f26322k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f26323l;

        /* renamed from: n, reason: collision with root package name */
        int f26325n;

        J(Continuation<? super J> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26323l = obj;
            this.f26325n |= Integer.MIN_VALUE;
            return h.this.f0(null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$removeItem$4$1", f = "ShoppingListViewModel.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED}, m = "invokeSuspend")
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26326a;

        K(Continuation<? super K> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new K(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26326a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.ShowSnackbarFailureAlert showSnackbarFailureAlert = new AbstractC4614g.ShowSnackbarFailureAlert(Aq.b.f1960H);
                this.f26326a = 1;
                if (interfaceC16548A.emit(showSnackbarFailureAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {354}, m = "reorderItem")
    static final class L extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26328a;

        /* renamed from: b, reason: collision with root package name */
        Object f26329b;

        /* renamed from: c, reason: collision with root package name */
        Object f26330c;

        /* renamed from: d, reason: collision with root package name */
        Object f26331d;

        /* renamed from: e, reason: collision with root package name */
        Object f26332e;

        /* renamed from: f, reason: collision with root package name */
        Object f26333f;

        /* renamed from: g, reason: collision with root package name */
        int f26334g;

        /* renamed from: h, reason: collision with root package name */
        int f26335h;

        /* renamed from: i, reason: collision with root package name */
        int f26336i;

        /* renamed from: j, reason: collision with root package name */
        int f26337j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f26338k;

        /* renamed from: m, reason: collision with root package name */
        int f26340m;

        L(Continuation<? super L> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26338k = obj;
            this.f26340m |= Integer.MIN_VALUE;
            return h.this.h0(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$showCoupon$1", f = "ShoppingListViewModel.kt", l = {785, 645, 651, 661, 662}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class M extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26341a;

        /* renamed from: b, reason: collision with root package name */
        Object f26342b;

        /* renamed from: c, reason: collision with root package name */
        Object f26343c;

        /* renamed from: d, reason: collision with root package name */
        Object f26344d;

        /* renamed from: e, reason: collision with root package name */
        Object f26345e;

        /* renamed from: f, reason: collision with root package name */
        Object f26346f;

        /* renamed from: g, reason: collision with root package name */
        Object f26347g;

        /* renamed from: h, reason: collision with root package name */
        long f26348h;

        /* renamed from: i, reason: collision with root package name */
        int f26349i;

        /* renamed from: j, reason: collision with root package name */
        int f26350j;

        /* renamed from: k, reason: collision with root package name */
        int f26351k;

        /* renamed from: l, reason: collision with root package name */
        int f26352l;

        /* renamed from: m, reason: collision with root package name */
        int f26353m;

        /* renamed from: n, reason: collision with root package name */
        int f26354n;

        /* renamed from: o, reason: collision with root package name */
        int f26355o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f26356p;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f26358r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(long j10, Continuation<? super M> continuation) {
            super(2, continuation);
            this.f26358r = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            M m10 = h.this.new M(this.f26358r, continuation);
            m10.f26356p = obj;
            return m10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((M) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0194 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:27:0x009e, B:44:0x0169, B:52:0x018e, B:54:0x0194, B:55:0x01a1, B:57:0x01a7, B:59:0x01c0, B:61:0x01c7, B:60:0x01c5), top: B:102:0x009e }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01a7 A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:27:0x009e, B:44:0x0169, B:52:0x018e, B:54:0x0194, B:55:0x01a1, B:57:0x01a7, B:59:0x01c0, B:61:0x01c7, B:60:0x01c5), top: B:102:0x009e }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x027d  */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v15, types: [wv.a] */
        /* JADX WARN: Type inference failed for: r2v2, types: [wv.a] */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 663
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Pq.h.M.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class N implements InterfaceC16561f<SearchSuggestions> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f26359a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f26360a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$special$$inlined$map$1$2", f = "ShoppingListViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Pq.h$N$a$a, reason: collision with other inner class name */
            public static final class C0482a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f26361a;

                /* renamed from: b, reason: collision with root package name */
                int f26362b;

                /* renamed from: c, reason: collision with root package name */
                Object f26363c;

                /* renamed from: e, reason: collision with root package name */
                Object f26365e;

                /* renamed from: f, reason: collision with root package name */
                Object f26366f;

                /* renamed from: g, reason: collision with root package name */
                Object f26367g;

                /* renamed from: h, reason: collision with root package name */
                int f26368h;

                public C0482a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f26361a = obj;
                    this.f26362b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f26360a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Pq.h.N.a.C0482a
                    if (r0 == 0) goto L13
                    r0 = r7
                    Pq.h$N$a$a r0 = (Pq.h.N.a.C0482a) r0
                    int r1 = r0.f26362b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f26362b = r1
                    goto L18
                L13:
                    Pq.h$N$a$a r0 = new Pq.h$N$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f26361a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f26362b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f26367g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f26365e
                    Pq.h$N$a$a r6 = (Pq.h.N.a.C0482a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5e
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f26360a
                    r2 = r6
                    Go.d r2 = (Go.SuggestionResult) r2
                    Go.a r4 = new Go.a
                    java.util.List r2 = r2.a()
                    r4.<init>(r2)
                    r0.f26363c = r6
                    r0.f26365e = r0
                    r0.f26366f = r6
                    r0.f26367g = r7
                    r6 = 0
                    r0.f26368h = r6
                    r0.f26362b = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L5e
                    return r1
                L5e:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Pq.h.N.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public N(InterfaceC16561f interfaceC16561f) {
            this.f26359a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super SearchSuggestions> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f26359a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGo/a;", "suggestions", "", "<anonymous>", "(LGo/a;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$2", f = "ShoppingListViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Pq.h$a, reason: case insensitive filesystem */
    static final class C4608a extends SuspendLambda implements Function2<SearchSuggestions, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26369a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26370b;

        C4608a(Continuation<? super C4608a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4608a c4608a = h.this.new C4608a(continuation);
            c4608a.f26370b = obj;
            return c4608a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SearchSuggestions searchSuggestions, Continuation<? super Unit> continuation) {
            return ((C4608a) create(searchSuggestions, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f26369a == 0) {
                ResultKt.b(obj);
                SearchSuggestions searchSuggestions = (SearchSuggestions) this.f26370b;
                InterfaceC16549B interfaceC16549B = h.this._stateFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ShoppingListState.b((ShoppingListState) value, null, null, false, null, searchSuggestions, null, false, 111, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LGo/a;", "", "error", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$3", f = "ShoppingListViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Pq.h$b, reason: case insensitive filesystem */
    static final class C4609b extends SuspendLambda implements Function3<InterfaceC16562g<? super SearchSuggestions>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26372a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26373b;

        C4609b(Continuation<? super C4609b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super SearchSuggestions> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C4609b c4609b = new C4609b(continuation);
            c4609b.f26373b = th2;
            return c4609b.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f26372a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.e((Throwable) this.f26373b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pq.h$c, reason: case insensitive filesystem */
    /* synthetic */ class C4610c extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C4610c(Object obj) {
            super(2, obj, h.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return h.t((h) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$5", f = "ShoppingListViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Pq.h$d, reason: case insensitive filesystem */
    static final class C4611d extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26374a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26375b;

        C4611d(Continuation<? super C4611d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C4611d c4611d = new C4611d(continuation);
            c4611d.f26375b = th2;
            return c4611d.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f26374a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f26375b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LPq/h$e;", "", "<init>", "()V", "b", "f", "c", "a", "g", "h", "e", "d", "LPq/h$e$a;", "LPq/h$e$b;", "LPq/h$e$c;", "LPq/h$e$d;", "LPq/h$e$e;", "LPq/h$e$f;", "LPq/h$e$g;", "LPq/h$e$h;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pq.h$e, reason: case insensitive filesystem */
    public static abstract class AbstractC4612e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$e$a;", "LPq/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$a */
        public static final /* data */ class a extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f26376a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "ClearShoppingList";
            }

            public int hashCode() {
                return -41765012;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$e$b;", "LPq/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$b */
        public static final /* data */ class b extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f26377a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "OnClearClicked";
            }

            public int hashCode() {
                return -1399886624;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$e$c;", "LPq/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$c */
        public static final /* data */ class c extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f26378a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "OnListMoving";
            }

            public int hashCode() {
                return 1647856594;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$e$d;", "LPq/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$d */
        public static final /* data */ class d extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name */
            public static final d f26379a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "OnMenuClearClicked";
            }

            public int hashCode() {
                return -1232704289;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$e$e;", "LPq/h$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$e, reason: collision with other inner class name */
        public static final /* data */ class C0483e extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name */
            public static final C0483e f26380a = new C0483e();

            private C0483e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0483e);
            }

            public String toString() {
                return "OnMenuEditClicked";
            }

            public int hashCode() {
                return -925404584;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, d2 = {"LPq/h$e$f;", "LPq/h$e;", "LFq/c;", "shoppingListItem", "", "initialQuantity", "<init>", "(LFq/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "b", "()LFq/c;", "I", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$f, reason: from toString */
        public static final /* data */ class OnShoppingListItemChange extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShoppingListItem shoppingListItem;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int initialQuantity;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnShoppingListItemChange)) {
                    return false;
                }
                OnShoppingListItemChange onShoppingListItemChange = (OnShoppingListItemChange) other;
                return Intrinsics.e(this.shoppingListItem, onShoppingListItemChange.shoppingListItem) && this.initialQuantity == onShoppingListItemChange.initialQuantity;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnShoppingListItemChange(ShoppingListItem shoppingListItem, int i10) {
                super(null);
                Intrinsics.j(shoppingListItem, "shoppingListItem");
                this.shoppingListItem = shoppingListItem;
                this.initialQuantity = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getInitialQuantity() {
                return this.initialQuantity;
            }

            /* renamed from: b, reason: from getter */
            public final ShoppingListItem getShoppingListItem() {
                return this.shoppingListItem;
            }

            public int hashCode() {
                return (this.shoppingListItem.hashCode() * 31) + Integer.hashCode(this.initialQuantity);
            }

            public String toString() {
                return "OnShoppingListItemChange(shoppingListItem=" + this.shoppingListItem + ", initialQuantity=" + this.initialQuantity + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LPq/h$e$g;", "LPq/h$e;", "", "LFq/c;", "inProgressList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$g, reason: from toString */
        public static final /* data */ class ShareList extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ShoppingListItem> inProgressList;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShareList) && Intrinsics.e(this.inProgressList, ((ShareList) other).inProgressList);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareList(List<ShoppingListItem> inProgressList) {
                super(null);
                Intrinsics.j(inProgressList, "inProgressList");
                this.inProgressList = inProgressList;
            }

            public final List<ShoppingListItem> a() {
                return this.inProgressList;
            }

            public int hashCode() {
                return this.inProgressList.hashCode();
            }

            public String toString() {
                return "ShareList(inProgressList=" + this.inProgressList + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPq/h$e$h;", "LPq/h$e;", "LFq/c;", "shoppingListItem", "<init>", "(LFq/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "()LFq/c;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$e$h, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShoppingListItemClicked extends AbstractC4612e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShoppingListItem shoppingListItem;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShoppingListItemClicked) && Intrinsics.e(this.shoppingListItem, ((ShoppingListItemClicked) other).shoppingListItem);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShoppingListItemClicked(ShoppingListItem shoppingListItem) {
                super(null);
                Intrinsics.j(shoppingListItem, "shoppingListItem");
                this.shoppingListItem = shoppingListItem;
            }

            /* renamed from: a, reason: from getter */
            public final ShoppingListItem getShoppingListItem() {
                return this.shoppingListItem;
            }

            public int hashCode() {
                return this.shoppingListItem.hashCode();
            }

            public String toString() {
                return "ShoppingListItemClicked(shoppingListItem=" + this.shoppingListItem + ')';
            }
        }

        public /* synthetic */ AbstractC4612e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC4612e() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LPq/h$g;", "", "<init>", "()V", "f", "g", "d", "e", "b", "i", "h", "a", "j", "c", "LPq/h$g$a;", "LPq/h$g$b;", "LPq/h$g$c;", "LPq/h$g$d;", "LPq/h$g$e;", "LPq/h$g$f;", "LPq/h$g$g;", "LPq/h$g$h;", "LPq/h$g$i;", "LPq/h$g$j;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pq.h$g, reason: case insensitive filesystem */
    public static abstract class AbstractC4614g {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPq/h$g$a;", "LPq/h$g;", "LFq/c;", "item", "<init>", "(LFq/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "()LFq/c;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$a, reason: from toString */
        public static final /* data */ class ProductSearch extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShoppingListItem item;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductSearch) && Intrinsics.e(this.item, ((ProductSearch) other).item);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProductSearch(ShoppingListItem item) {
                super(null);
                Intrinsics.j(item, "item");
                this.item = item;
            }

            /* renamed from: a, reason: from getter */
            public final ShoppingListItem getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "ProductSearch(item=" + this.item + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LPq/h$g$b;", "LPq/h$g;", "", "shoppingList", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$b, reason: from toString */
        public static final /* data */ class ShareShoppingList extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String shoppingList;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShareShoppingList) && Intrinsics.e(this.shoppingList, ((ShareShoppingList) other).shoppingList);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareShoppingList(String shoppingList) {
                super(null);
                Intrinsics.j(shoppingList, "shoppingList");
                this.shoppingList = shoppingList;
            }

            /* renamed from: a, reason: from getter */
            public final String getShoppingList() {
                return this.shoppingList;
            }

            public int hashCode() {
                return this.shoppingList.hashCode();
            }

            public String toString() {
                return "ShareShoppingList(shoppingList=" + this.shoppingList + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPq/h$g$c;", "LPq/h$g;", "", "errorResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$c, reason: from toString */
        public static final /* data */ class ShowAlertError extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int errorResId;

            public ShowAlertError(int i10) {
                super(null);
                this.errorResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowAlertError) && this.errorResId == ((ShowAlertError) other).errorResId;
            }

            /* renamed from: a, reason: from getter */
            public final int getErrorResId() {
                return this.errorResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.errorResId);
            }

            public String toString() {
                return "ShowAlertError(errorResId=" + this.errorResId + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$g$d;", "LPq/h$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$d */
        public static final /* data */ class d extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name */
            public static final d f26388a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "ShowOkAlert";
            }

            public int hashCode() {
                return 1020572318;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPq/h$g$e;", "LPq/h$g;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$e, reason: from toString */
        public static final /* data */ class ShowSnackbarFailureAlert extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public ShowSnackbarFailureAlert(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowSnackbarFailureAlert) && this.messageResId == ((ShowSnackbarFailureAlert) other).messageResId;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ShowSnackbarFailureAlert(messageResId=" + this.messageResId + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$g$f;", "LPq/h$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$f */
        public static final /* data */ class f extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name */
            public static final f f26390a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "ShowUpdateAlertError";
            }

            public int hashCode() {
                return -1905854537;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPq/h$g$g;", "LPq/h$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$g, reason: collision with other inner class name */
        public static final /* data */ class C0485g extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name */
            public static final C0485g f26391a = new C0485g();

            private C0485g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0485g);
            }

            public String toString() {
                return "StartBarcodeScanner";
            }

            public int hashCode() {
                return -88625445;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPq/h$g$h;", "LPq/h$g;", "LPk/a;", "coupon", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$h, reason: collision with other inner class name and from toString */
        public static final /* data */ class ViewCouponDetails extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewCouponDetails) && Intrinsics.e(this.coupon, ((ViewCouponDetails) other).coupon);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewCouponDetails(Coupon coupon) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
            }

            /* renamed from: a, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }

            public int hashCode() {
                return this.coupon.hashCode();
            }

            public String toString() {
                return "ViewCouponDetails(coupon=" + this.coupon + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPq/h$g$i;", "LPq/h$g;", "Lnk/f;", "productId", "<init>", "(Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/f;", "()Lnk/f;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$i, reason: from toString */
        public static final /* data */ class ViewProductDetails extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.f productId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewProductDetails) && Intrinsics.e(this.productId, ((ViewProductDetails) other).productId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewProductDetails(nk.f productId) {
                super(null);
                Intrinsics.j(productId, "productId");
                this.productId = productId;
            }

            /* renamed from: a, reason: from getter */
            public final nk.f getProductId() {
                return this.productId;
            }

            public int hashCode() {
                return this.productId.hashCode();
            }

            public String toString() {
                return "ViewProductDetails(productId=" + this.productId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPq/h$g$j;", "LPq/h$g;", "", "listingId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pq.h$g$j, reason: from toString */
        public static final /* data */ class ViewWeeklyAd extends AbstractC4614g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int listingId;

            public ViewWeeklyAd(int i10) {
                super(null);
                this.listingId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewWeeklyAd) && this.listingId == ((ViewWeeklyAd) other).listingId;
            }

            /* renamed from: a, reason: from getter */
            public final int getListingId() {
                return this.listingId;
            }

            public int hashCode() {
                return Integer.hashCode(this.listingId);
            }

            public String toString() {
                return "ViewWeeklyAd(listingId=" + this.listingId + ')';
            }
        }

        public /* synthetic */ AbstractC4614g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC4614g() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010\"¨\u0006."}, d2 = {"LPq/h$h;", "", "", "LFq/c;", "inProgressList", "completedList", "", "isListMoving", "LPj/a;", "loadingState", "LGo/a;", "searchSuggestions", "", "searchTerm", "querySubmitted", "<init>", "(Ljava/util/List;Ljava/util/List;ZLPj/a;LGo/a;Ljava/lang/String;Z)V", "a", "(Ljava/util/List;Ljava/util/List;ZLPj/a;LGo/a;Ljava/lang/String;Z)LPq/h$h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "Z", "i", "()Z", "LPj/a;", "e", "()LPj/a;", "LGo/a;", "f", "()LGo/a;", "Ljava/lang/String;", "g", "getQuerySubmitted", "h", "isEmpty", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pq.h$h, reason: collision with other inner class name and from toString */
    public static final /* data */ class ShoppingListState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ShoppingListItem> inProgressList;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ShoppingListItem> completedList;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isListMoving;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a loadingState;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchSuggestions searchSuggestions;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean querySubmitted;

        public ShoppingListState() {
            this(null, null, false, null, null, null, false, l3.f93324d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShoppingListState)) {
                return false;
            }
            ShoppingListState shoppingListState = (ShoppingListState) other;
            return Intrinsics.e(this.inProgressList, shoppingListState.inProgressList) && Intrinsics.e(this.completedList, shoppingListState.completedList) && this.isListMoving == shoppingListState.isListMoving && Intrinsics.e(this.loadingState, shoppingListState.loadingState) && Intrinsics.e(this.searchSuggestions, shoppingListState.searchSuggestions) && Intrinsics.e(this.searchTerm, shoppingListState.searchTerm) && this.querySubmitted == shoppingListState.querySubmitted;
        }

        public ShoppingListState(List<ShoppingListItem> inProgressList, List<ShoppingListItem> completedList, boolean z10, Pj.a aVar, SearchSuggestions searchSuggestions, String searchTerm, boolean z11) {
            Intrinsics.j(inProgressList, "inProgressList");
            Intrinsics.j(completedList, "completedList");
            Intrinsics.j(searchSuggestions, "searchSuggestions");
            Intrinsics.j(searchTerm, "searchTerm");
            this.inProgressList = inProgressList;
            this.completedList = completedList;
            this.isListMoving = z10;
            this.loadingState = aVar;
            this.searchSuggestions = searchSuggestions;
            this.searchTerm = searchTerm;
            this.querySubmitted = z11;
        }

        public static /* synthetic */ ShoppingListState b(ShoppingListState shoppingListState, List list, List list2, boolean z10, Pj.a aVar, SearchSuggestions searchSuggestions, String str, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = shoppingListState.inProgressList;
            }
            if ((i10 & 2) != 0) {
                list2 = shoppingListState.completedList;
            }
            if ((i10 & 4) != 0) {
                z10 = shoppingListState.isListMoving;
            }
            if ((i10 & 8) != 0) {
                aVar = shoppingListState.loadingState;
            }
            if ((i10 & 16) != 0) {
                searchSuggestions = shoppingListState.searchSuggestions;
            }
            if ((i10 & 32) != 0) {
                str = shoppingListState.searchTerm;
            }
            if ((i10 & 64) != 0) {
                z11 = shoppingListState.querySubmitted;
            }
            String str2 = str;
            boolean z12 = z11;
            SearchSuggestions searchSuggestions2 = searchSuggestions;
            boolean z13 = z10;
            return shoppingListState.a(list, list2, z13, aVar, searchSuggestions2, str2, z12);
        }

        public final ShoppingListState a(List<ShoppingListItem> inProgressList, List<ShoppingListItem> completedList, boolean isListMoving, Pj.a loadingState, SearchSuggestions searchSuggestions, String searchTerm, boolean querySubmitted) {
            Intrinsics.j(inProgressList, "inProgressList");
            Intrinsics.j(completedList, "completedList");
            Intrinsics.j(searchSuggestions, "searchSuggestions");
            Intrinsics.j(searchTerm, "searchTerm");
            return new ShoppingListState(inProgressList, completedList, isListMoving, loadingState, searchSuggestions, searchTerm, querySubmitted);
        }

        public final List<ShoppingListItem> c() {
            return this.completedList;
        }

        public final List<ShoppingListItem> d() {
            return this.inProgressList;
        }

        /* renamed from: e, reason: from getter */
        public final Pj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: f, reason: from getter */
        public final SearchSuggestions getSearchSuggestions() {
            return this.searchSuggestions;
        }

        /* renamed from: g, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public final boolean h() {
            Pj.a aVar;
            return this.inProgressList.isEmpty() && this.completedList.isEmpty() && (aVar = this.loadingState) != null && !aVar.getIsLoading();
        }

        public int hashCode() {
            int iHashCode = ((((this.inProgressList.hashCode() * 31) + this.completedList.hashCode()) * 31) + Boolean.hashCode(this.isListMoving)) * 31;
            Pj.a aVar = this.loadingState;
            return ((((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.searchSuggestions.hashCode()) * 31) + this.searchTerm.hashCode()) * 31) + Boolean.hashCode(this.querySubmitted);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsListMoving() {
            return this.isListMoving;
        }

        public String toString() {
            return "ShoppingListState(inProgressList=" + this.inProgressList + ", completedList=" + this.completedList + ", isListMoving=" + this.isListMoving + ", loadingState=" + this.loadingState + ", searchSuggestions=" + this.searchSuggestions + ", searchTerm=" + this.searchTerm + ", querySubmitted=" + this.querySubmitted + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ShoppingListState(java.util.List r3, java.util.List r4, boolean r5, Pj.a r6, Go.SearchSuggestions r7, java.lang.String r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r2 = this;
                r11 = r10 & 1
                if (r11 == 0) goto L8
                java.util.List r3 = kotlin.collections.CollectionsKt.m()
            L8:
                r11 = r10 & 2
                if (r11 == 0) goto L10
                java.util.List r4 = kotlin.collections.CollectionsKt.m()
            L10:
                r11 = r10 & 4
                r0 = 0
                if (r11 == 0) goto L16
                r5 = r0
            L16:
                r11 = r10 & 8
                r1 = 0
                if (r11 == 0) goto L1c
                r6 = r1
            L1c:
                r11 = r10 & 16
                if (r11 == 0) goto L26
                Go.a r7 = new Go.a
                r11 = 1
                r7.<init>(r1, r11, r1)
            L26:
                r11 = r10 & 32
                if (r11 == 0) goto L2c
                java.lang.String r8 = ""
            L2c:
                r10 = r10 & 64
                if (r10 == 0) goto L39
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L41
            L39:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L41:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pq.h.ShoppingListState.<init>(java.util.List, java.util.List, boolean, Pj.a, Go.a, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {455}, m = "addItemsToShoppingList")
    /* renamed from: Pq.h$i, reason: case insensitive filesystem */
    static final class C4615i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26402a;

        /* renamed from: b, reason: collision with root package name */
        Object f26403b;

        /* renamed from: c, reason: collision with root package name */
        Object f26404c;

        /* renamed from: d, reason: collision with root package name */
        Object f26405d;

        /* renamed from: e, reason: collision with root package name */
        Object f26406e;

        /* renamed from: f, reason: collision with root package name */
        int f26407f;

        /* renamed from: g, reason: collision with root package name */
        int f26408g;

        /* renamed from: h, reason: collision with root package name */
        int f26409h;

        /* renamed from: i, reason: collision with root package name */
        int f26410i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f26411j;

        /* renamed from: l, reason: collision with root package name */
        int f26413l;

        C4615i(Continuation<? super C4615i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26411j = obj;
            this.f26413l |= Integer.MIN_VALUE;
            return h.this.Q(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$addItemsToShoppingList$4$1", f = "ShoppingListViewModel.kt", l = {466}, m = "invokeSuspend")
    /* renamed from: Pq.h$j, reason: case insensitive filesystem */
    static final class C4616j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26414a;

        C4616j(Continuation<? super C4616j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new C4616j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C4616j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26414a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.ShowSnackbarFailureAlert showSnackbarFailureAlert = new AbstractC4614g.ShowSnackbarFailureAlert(Aq.b.f1979c);
                this.f26414a = 1;
                if (interfaceC16548A.emit(showSnackbarFailureAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {444}, m = "addToShoppingList")
    /* renamed from: Pq.h$k, reason: case insensitive filesystem */
    static final class C4617k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26416a;

        /* renamed from: b, reason: collision with root package name */
        Object f26417b;

        /* renamed from: c, reason: collision with root package name */
        Object f26418c;

        /* renamed from: d, reason: collision with root package name */
        Object f26419d;

        /* renamed from: e, reason: collision with root package name */
        Object f26420e;

        /* renamed from: f, reason: collision with root package name */
        int f26421f;

        /* renamed from: g, reason: collision with root package name */
        int f26422g;

        /* renamed from: h, reason: collision with root package name */
        int f26423h;

        /* renamed from: i, reason: collision with root package name */
        int f26424i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f26425j;

        /* renamed from: l, reason: collision with root package name */
        int f26427l;

        C4617k(Continuation<? super C4617k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26425j = obj;
            this.f26427l |= Integer.MIN_VALUE;
            return h.this.R(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$addToShoppingList$4$1", f = "ShoppingListViewModel.kt", l = {450}, m = "invokeSuspend")
    /* renamed from: Pq.h$l, reason: case insensitive filesystem */
    static final class C4618l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26428a;

        C4618l(Continuation<? super C4618l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new C4618l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C4618l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26428a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.ShowSnackbarFailureAlert showSnackbarFailureAlert = new AbstractC4614g.ShowSnackbarFailureAlert(Aq.b.f1979c);
                this.f26428a = 1;
                if (interfaceC16548A.emit(showSnackbarFailureAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {471}, m = "clearShoppingList")
    /* renamed from: Pq.h$m, reason: case insensitive filesystem */
    static final class C4619m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26430a;

        /* renamed from: b, reason: collision with root package name */
        Object f26431b;

        /* renamed from: c, reason: collision with root package name */
        Object f26432c;

        /* renamed from: d, reason: collision with root package name */
        Object f26433d;

        /* renamed from: e, reason: collision with root package name */
        int f26434e;

        /* renamed from: f, reason: collision with root package name */
        int f26435f;

        /* renamed from: g, reason: collision with root package name */
        int f26436g;

        /* renamed from: h, reason: collision with root package name */
        int f26437h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f26438i;

        /* renamed from: k, reason: collision with root package name */
        int f26440k;

        C4619m(Continuation<? super C4619m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26438i = obj;
            this.f26440k |= Integer.MIN_VALUE;
            return h.this.S(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$fetchProductDetails$1", f = "ShoppingListViewModel.kt", l = {163}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Pq.h$n, reason: case insensitive filesystem */
    static final class C4620n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f26441a;

        /* renamed from: b, reason: collision with root package name */
        Object f26442b;

        /* renamed from: c, reason: collision with root package name */
        Object f26443c;

        /* renamed from: d, reason: collision with root package name */
        Object f26444d;

        /* renamed from: e, reason: collision with root package name */
        int f26445e;

        /* renamed from: f, reason: collision with root package name */
        int f26446f;

        /* renamed from: g, reason: collision with root package name */
        int f26447g;

        /* renamed from: h, reason: collision with root package name */
        int f26448h;

        /* renamed from: i, reason: collision with root package name */
        int f26449i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f26450j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<String> f26452l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f26453m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4620n(List<String> list, List<ShoppingListItem> list2, Continuation<? super C4620n> continuation) {
            super(2, continuation);
            this.f26452l = list;
            this.f26453m = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4620n c4620n = h.this.new C4620n(this.f26452l, this.f26453m, continuation);
            c4620n.f26450j = obj;
            return c4620n;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C4620n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object objJ;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26449i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f26450j;
                    h hVar = h.this;
                    List<String> list = this.f26452l;
                    Result.Companion companion = Result.INSTANCE;
                    Ro.c cVar = hVar.productsRepository;
                    this.f26450j = interfaceC15783O;
                    this.f26441a = interfaceC15783O;
                    this.f26442b = this;
                    this.f26443c = this;
                    this.f26444d = interfaceC15783O;
                    this.f26445e = 0;
                    this.f26446f = 0;
                    this.f26447g = 0;
                    this.f26448h = 0;
                    this.f26449i = 1;
                    objJ = cVar.j(list, this);
                    if (objJ == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objJ = obj;
                }
                objB = Result.b(objJ);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            List<ShoppingListItem> list2 = this.f26453m;
            h hVar2 = h.this;
            if (Result.h(objB)) {
                List<ProductFullDetails> list3 = (List) objB;
                List<ShoppingListItem> list4 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list4, 10));
                for (ShoppingListItem shoppingListItem : list4) {
                    ShoppingListItem shoppingListItemA = shoppingListItem;
                    for (ProductFullDetails productFullDetails : list3) {
                        if (Fq.d.c(shoppingListItem, productFullDetails)) {
                            shoppingListItemA = shoppingListItemA.a((32511 & 1) != 0 ? shoppingListItemA.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItemA.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItemA.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItemA.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItemA.itemDescription : null, (32511 & 32) != 0 ? shoppingListItemA.quantity : 0, (32511 & 64) != 0 ? shoppingListItemA.storeId : 0, (32511 & 128) != 0 ? shoppingListItemA.notes : null, (32511 & 256) != 0 ? shoppingListItemA.isComplete : false, (32511 & 512) != 0 ? shoppingListItemA.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItemA.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItemA.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItemA.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItemA.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItemA.productDetails : productFullDetails);
                        }
                    }
                    arrayList.add(shoppingListItemA);
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((ShoppingListItem) obj2).getIsComplete()) {
                        arrayList3.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List list5 = (List) pair.a();
                List list6 = (List) pair.b();
                InterfaceC16549B interfaceC16549B = hVar2._stateFlow;
                do {
                    value2 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value2, ShoppingListState.b((ShoppingListState) value2, list5, list6, false, null, null, null, false, 124, null)));
                hVar2.loadingStateManager.b(new a.NotLoading("products"));
            }
            List<ShoppingListItem> list7 = this.f26453m;
            h hVar3 = h.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch products for shopping list", new Object[0]);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list7) {
                    if (((ShoppingListItem) obj3).getIsComplete()) {
                        arrayList5.add(obj3);
                    } else {
                        arrayList4.add(obj3);
                    }
                }
                Pair pair2 = new Pair(arrayList4, arrayList5);
                List list8 = (List) pair2.a();
                List list9 = (List) pair2.b();
                InterfaceC16549B interfaceC16549B2 = hVar3._stateFlow;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, ShoppingListState.b((ShoppingListState) value, list8, list9, false, null, null, null, false, 124, null)));
                hVar3.loadingStateManager.b(new a.NotLoading("products"));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {135}, m = "fetchShoppingList")
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26454a;

        /* renamed from: b, reason: collision with root package name */
        Object f26455b;

        /* renamed from: c, reason: collision with root package name */
        Object f26456c;

        /* renamed from: d, reason: collision with root package name */
        Object f26457d;

        /* renamed from: e, reason: collision with root package name */
        int f26458e;

        /* renamed from: f, reason: collision with root package name */
        int f26459f;

        /* renamed from: g, reason: collision with root package name */
        int f26460g;

        /* renamed from: h, reason: collision with root package name */
        int f26461h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f26462i;

        /* renamed from: k, reason: collision with root package name */
        int f26464k;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26462i = obj;
            this.f26464k |= Integer.MIN_VALUE;
            return h.this.U(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onAction$1", f = "ShoppingListViewModel.kt", l = {715}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26465a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26465a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.d dVar = AbstractC4614g.d.f26388a;
                this.f26465a = 1;
                if (interfaceC16548A.emit(dVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onAction$2", f = "ShoppingListViewModel.kt", l = {727}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26467a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4612e f26469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(AbstractC4612e abstractC4612e, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f26469c = abstractC4612e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new q(this.f26469c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26467a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                ShoppingListItem shoppingListItem = ((AbstractC4612e.OnShoppingListItemChange) this.f26469c).getShoppingListItem();
                int initialQuantity = ((AbstractC4612e.OnShoppingListItemChange) this.f26469c).getInitialQuantity();
                AbstractC4614g.f fVar = AbstractC4614g.f.f26390a;
                this.f26467a = 1;
                if (hVar.c0(shoppingListItem, initialQuantity, fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onAction$4", f = "ShoppingListViewModel.kt", l = {738}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26470a;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26470a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                this.f26470a = 1;
                if (hVar.S(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {498}, m = "onCompletedListClearConfirmed")
    static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26472a;

        /* renamed from: b, reason: collision with root package name */
        Object f26473b;

        /* renamed from: c, reason: collision with root package name */
        Object f26474c;

        /* renamed from: d, reason: collision with root package name */
        Object f26475d;

        /* renamed from: e, reason: collision with root package name */
        int f26476e;

        /* renamed from: f, reason: collision with root package name */
        int f26477f;

        /* renamed from: g, reason: collision with root package name */
        int f26478g;

        /* renamed from: h, reason: collision with root package name */
        int f26479h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f26480i;

        /* renamed from: k, reason: collision with root package name */
        int f26482k;

        s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26480i = obj;
            this.f26482k |= Integer.MIN_VALUE;
            return h.this.X(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onCompletedListClearConfirmed$4$1", f = "ShoppingListViewModel.kt", l = {HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26483a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26483a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.f fVar = AbstractC4614g.f.f26390a;
                this.f26483a = 1;
                if (interfaceC16548A.emit(fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onCreate$1", f = "ShoppingListViewModel.kt", l = {124}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26485a;

        u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26485a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                this.f26485a = 1;
                if (hVar.U(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel", f = "ShoppingListViewModel.kt", l = {249, 251}, m = "onItemCompletedChange")
    static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f26487a;

        /* renamed from: b, reason: collision with root package name */
        Object f26488b;

        /* renamed from: c, reason: collision with root package name */
        Object f26489c;

        /* renamed from: d, reason: collision with root package name */
        Object f26490d;

        /* renamed from: e, reason: collision with root package name */
        Object f26491e;

        /* renamed from: f, reason: collision with root package name */
        int f26492f;

        /* renamed from: g, reason: collision with root package name */
        int f26493g;

        /* renamed from: h, reason: collision with root package name */
        int f26494h;

        /* renamed from: i, reason: collision with root package name */
        int f26495i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f26496j;

        /* renamed from: l, reason: collision with root package name */
        int f26498l;

        v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f26496j = obj;
            this.f26498l |= Integer.MIN_VALUE;
            return h.this.Y(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onItemCompletedChange$4$1", f = "ShoppingListViewModel.kt", l = {284}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26499a;

        w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26499a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.ShowSnackbarFailureAlert showSnackbarFailureAlert = new AbstractC4614g.ShowSnackbarFailureAlert(Aq.b.f1976X);
                this.f26499a = 1;
                if (interfaceC16548A.emit(showSnackbarFailureAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShareListTapped$1", f = "ShoppingListViewModel.kt", l = {HttpResponseStatus.ERROR_HTTP_VERSION_NOT_SUPPORTED}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26501a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f26503c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(List<ShoppingListItem> list, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f26503c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new x(this.f26503c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26501a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = h.this._events;
                AbstractC4614g.ShareShoppingList shareShoppingList = new AbstractC4614g.ShareShoppingList(Eq.d.b(this.f26503c));
                this.f26501a = 1;
                if (interfaceC16548A.emit(shareShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$1", f = "ShoppingListViewModel.kt", l = {673}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26504a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bq.a f26506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Bq.a aVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f26506c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new y(this.f26506c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26504a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                ShoppingListItem item = ((a.Add) this.f26506c).getItem();
                this.f26504a = 1;
                if (hVar.R(item, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.viewmodel.ShoppingListViewModel$onShoppingListItemAction$2", f = "ShoppingListViewModel.kt", l = {675}, m = "invokeSuspend")
    static final class z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f26507a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bq.a f26509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Bq.a aVar, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f26509c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new z(this.f26509c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f26507a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                h hVar = h.this;
                List<ShoppingListItem> listA = ((a.AddItems) this.f26509c).a();
                this.f26507a = 1;
                if (hVar.Q(listA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public h(Eq.b shoppingListRepository, Ro.c productsRepository, zl.k featureManager, InterfaceC14523a analyticsEngine, C13702d couponsRepository) {
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(couponsRepository, "couponsRepository");
        this.shoppingListRepository = shoppingListRepository;
        this.productsRepository = productsRepository;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.couponsRepository = couponsRepository;
        InterfaceC16549B<ShoppingListState> interfaceC16549BA = S.a(new ShoppingListState(null, null, false, null, null, null, false, l3.f93324d, null));
        this._stateFlow = interfaceC16549BA;
        this.stateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<AbstractC4614g> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._events = interfaceC16548AB;
        this.events = C16563h.b(interfaceC16548AB);
        Pj.c cVar = new Pj.c();
        this.loadingStateManager = cVar;
        this.mutex = wv.g.b(false, 1, null);
        C16563h.J(C16563h.g(C16563h.O(new N(productsRepository.t()), new C4608a(null)), new C4609b(null)), d0.a(this));
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new C4610c(this)), new C4611d(null)), d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.util.List<Fq.ShoppingListItem> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.Q(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(Fq.ShoppingListItem r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Pq.h.C4617k
            if (r0 == 0) goto L14
            r0 = r11
            Pq.h$k r0 = (Pq.h.C4617k) r0
            int r1 = r0.f26427l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26427l = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            Pq.h$k r0 = new Pq.h$k
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r0 = r11.f26425j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r11.f26427l
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r10 = r11.f26420e
            Pq.h r10 = (Pq.h) r10
            java.lang.Object r10 = r11.f26419d
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
            java.lang.Object r10 = r11.f26418c
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
            java.lang.Object r10 = r11.f26417b
            Pq.h r10 = (Pq.h) r10
            java.lang.Object r10 = r11.f26416a
            Fq.c r10 = (Fq.ShoppingListItem) r10
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L40
            goto L6e
        L40:
            r0 = move-exception
            goto L73
        L42:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L4a:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L40
            Eq.b r0 = G(r9)     // Catch: java.lang.Exception -> L40
            r11.f26416a = r10     // Catch: java.lang.Exception -> L40
            r11.f26417b = r9     // Catch: java.lang.Exception -> L40
            r11.f26418c = r11     // Catch: java.lang.Exception -> L40
            r11.f26419d = r11     // Catch: java.lang.Exception -> L40
            r11.f26420e = r9     // Catch: java.lang.Exception -> L40
            r11.f26421f = r4     // Catch: java.lang.Exception -> L40
            r11.f26422g = r4     // Catch: java.lang.Exception -> L40
            r11.f26423h = r4     // Catch: java.lang.Exception -> L40
            r11.f26424i = r4     // Catch: java.lang.Exception -> L40
            r11.f26427l = r3     // Catch: java.lang.Exception -> L40
            java.lang.Object r0 = r0.d(r10, r11)     // Catch: java.lang.Exception -> L40
            if (r0 != r1) goto L6e
            return r1
        L6e:
            java.lang.Object r11 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L40
            goto L84
        L73:
            kotlin.coroutines.CoroutineContext r11 = r11.getContext()
            mv.E0.i(r11)
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Object r11 = kotlin.ResultKt.a(r0)
            java.lang.Object r11 = kotlin.Result.b(r11)
        L84:
            boolean r0 = kotlin.Result.h(r11)
            r1 = 0
            if (r0 == 0) goto Lb2
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            r2 = 2
            z0(r9, r0, r4, r2, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L98:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r0.next()
            r5 = r3
            Fq.c r5 = (Fq.ShoppingListItem) r5
            boolean r5 = r5.w(r10)
            if (r5 == 0) goto L98
            goto Lad
        Lac:
            r3 = r1
        Lad:
            Fq.c r3 = (Fq.ShoppingListItem) r3
            m0(r9, r3, r4, r2, r1)
        Lb2:
            java.lang.Throwable r10 = kotlin.Result.e(r11)
            if (r10 == 0) goto Ld1
            qw.a$a r11 = qw.a.INSTANCE
            java.lang.String r0 = "Add to shopping list failed."
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r11.f(r10, r0, r2)
            mv.O r3 = androidx.view.d0.a(r9)
            Pq.h$l r6 = new Pq.h$l
            r6.<init>(r1)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            mv.C15805i.d(r3, r4, r5, r6, r7, r8)
        Ld1:
            kotlin.Unit r10 = kotlin.Unit.f143329a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.R(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof Pq.h.C4619m
            if (r2 == 0) goto L17
            r2 = r0
            Pq.h$m r2 = (Pq.h.C4619m) r2
            int r3 = r2.f26440k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f26440k = r3
            goto L1c
        L17:
            Pq.h$m r2 = new Pq.h$m
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f26438i
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f26440k
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L48
            if (r4 != r5) goto L40
            java.lang.Object r3 = r2.f26433d
            Pq.h r3 = (Pq.h) r3
            java.lang.Object r3 = r2.f26432c
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f26431b
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r3 = r2.f26430a
            Pq.h r3 = (Pq.h) r3
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L3e
            goto L6a
        L3e:
            r0 = move-exception
            goto L6f
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L48:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
            Eq.b r0 = G(r1)     // Catch: java.lang.Exception -> L3e
            r2.f26430a = r1     // Catch: java.lang.Exception -> L3e
            r2.f26431b = r2     // Catch: java.lang.Exception -> L3e
            r2.f26432c = r2     // Catch: java.lang.Exception -> L3e
            r2.f26433d = r1     // Catch: java.lang.Exception -> L3e
            r2.f26434e = r6     // Catch: java.lang.Exception -> L3e
            r2.f26435f = r6     // Catch: java.lang.Exception -> L3e
            r2.f26436g = r6     // Catch: java.lang.Exception -> L3e
            r2.f26437h = r6     // Catch: java.lang.Exception -> L3e
            r2.f26440k = r5     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r0.l(r2)     // Catch: java.lang.Exception -> L3e
            if (r0 != r3) goto L6a
            return r3
        L6a:
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3e
            goto L80
        L6f:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            mv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r0 = kotlin.ResultKt.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L80:
            boolean r2 = kotlin.Result.h(r0)
            if (r2 == 0) goto La9
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            pv.B<Pq.h$h> r2 = r1._stateFlow
        L8b:
            java.lang.Object r3 = r2.getValue()
            r7 = r3
            Pq.h$h r7 = (Pq.h.ShoppingListState) r7
            java.util.List r9 = kotlin.collections.CollectionsKt.m()
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            Pq.h$h r4 = Pq.h.ShoppingListState.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r3 = r2.e(r3, r4)
            if (r3 == 0) goto L8b
        La9:
            java.lang.Throwable r0 = kotlin.Result.e(r0)
            if (r0 == 0) goto Lb8
            qw.a$a r2 = qw.a.INSTANCE
            java.lang.String r3 = "Failure while clearing shopping list"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r2.f(r0, r3, r4)
        Lb8:
            kotlin.Unit r0 = kotlin.Unit.f143329a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.S(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void T(List<ShoppingListItem> shoppingList) {
        ShoppingListState value;
        List<ShoppingListItem> list = shoppingList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ShoppingListItem) obj).v()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String itemPartNumber = ((ShoppingListItem) it.next()).getItemPartNumber();
            if (itemPartNumber != null) {
                arrayList2.add(itemPartNumber);
            }
        }
        this.loadingStateManager.b(new a.Loading("products", null, 2, null));
        if (!arrayList2.isEmpty()) {
            C15809k.d(d0.a(this), null, null, new C4620n(arrayList2, shoppingList, null), 3, null);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (((ShoppingListItem) obj2).getIsComplete()) {
                arrayList4.add(obj2);
            } else {
                arrayList3.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        List list2 = (List) pair.a();
        List list3 = (List) pair.b();
        InterfaceC16549B<ShoppingListState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ShoppingListState.b(value, list2, list3, false, null, null, null, false, 124, null)));
        this.loadingStateManager.b(new a.NotLoading("products"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.U(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof Pq.h.s
            if (r0 == 0) goto L14
            r0 = r9
            Pq.h$s r0 = (Pq.h.s) r0
            int r1 = r0.f26482k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26482k = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            Pq.h$s r0 = new Pq.h$s
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.f26480i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r9.f26482k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r1 = r9.f26475d
            Pq.h r1 = (Pq.h) r1
            java.lang.Object r1 = r9.f26474c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r9.f26473b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r9.f26472a
            Pq.h r1 = (Pq.h) r1
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L3c
            goto L68
        L3c:
            r0 = move-exception
            goto L6d
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L46:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3c
            Eq.b r0 = G(r8)     // Catch: java.lang.Exception -> L3c
            r9.f26472a = r8     // Catch: java.lang.Exception -> L3c
            r9.f26473b = r9     // Catch: java.lang.Exception -> L3c
            r9.f26474c = r9     // Catch: java.lang.Exception -> L3c
            r9.f26475d = r8     // Catch: java.lang.Exception -> L3c
            r9.f26476e = r4     // Catch: java.lang.Exception -> L3c
            r9.f26477f = r4     // Catch: java.lang.Exception -> L3c
            r9.f26478g = r4     // Catch: java.lang.Exception -> L3c
            r9.f26479h = r4     // Catch: java.lang.Exception -> L3c
            r9.f26482k = r3     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = r0.m(r9)     // Catch: java.lang.Exception -> L3c
            if (r0 != r1) goto L68
            return r1
        L68:
            java.lang.Object r9 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3c
            goto L7e
        L6d:
            kotlin.coroutines.CoroutineContext r9 = r9.getContext()
            mv.E0.i(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.a(r0)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L7e:
            boolean r0 = kotlin.Result.h(r9)
            r1 = 0
            if (r0 == 0) goto L8c
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r2 = 2
            z0(r8, r0, r4, r2, r1)
        L8c:
            java.lang.Throwable r9 = kotlin.Result.e(r9)
            if (r9 == 0) goto La2
            mv.O r2 = androidx.view.d0.a(r8)
            Pq.h$t r5 = new Pq.h$t
            r5.<init>(r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            mv.C15805i.d(r2, r3, r4, r5, r6, r7)
        La2:
            kotlin.Unit r9 = kotlin.Unit.f143329a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.X(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r0 == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(Fq.ShoppingListItem r34, kotlin.coroutines.Continuation<? super kotlin.Unit> r35) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.Y(Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void Z(String searchTerm) {
        ShoppingListState value;
        ShoppingListState value2;
        ShoppingListState shoppingListState;
        if (StringsKt.s0(searchTerm)) {
            InterfaceC16549B<ShoppingListState> interfaceC16549B = this._stateFlow;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShoppingListState.b(value, null, null, false, null, new SearchSuggestions(null, 1, null), "", false, 15, null)));
            this.productsRepository.v(searchTerm);
            return;
        }
        InterfaceC16549B<ShoppingListState> interfaceC16549B2 = this._stateFlow;
        do {
            value2 = interfaceC16549B2.getValue();
            shoppingListState = value2;
        } while (!interfaceC16549B2.e(value2, ShoppingListState.b(shoppingListState, null, null, false, null, null, searchTerm, Intrinsics.e(searchTerm, shoppingListState.getSearchTerm()), 31, null)));
        this.productsRepository.v(searchTerm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (f0(r2, false, r0, r5) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r0 == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(Fq.ShoppingListItem r20, int r21, Pq.h.AbstractC4614g r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.c0(Fq.c, int, Pq.h$g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(Fq.ShoppingListItem r9, boolean r10, java.lang.Integer r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof Pq.h.J
            if (r0 == 0) goto L14
            r0 = r12
            Pq.h$J r0 = (Pq.h.J) r0
            int r1 = r0.f26325n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26325n = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            Pq.h$J r0 = new Pq.h$J
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.f26323l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r12.f26325n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L51
            if (r2 != r3) goto L49
            boolean r10 = r12.f26318g
            java.lang.Object r9 = r12.f26317f
            Pq.h r9 = (Pq.h) r9
            java.lang.Object r9 = r12.f26316e
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r12.f26315d
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r12.f26314c
            Pq.h r9 = (Pq.h) r9
            java.lang.Object r9 = r12.f26313b
            r11 = r9
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Object r9 = r12.f26312a
            Fq.c r9 = (Fq.ShoppingListItem) r9
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L47
            goto L79
        L47:
            r0 = move-exception
            goto L7e
        L49:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L51:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L47
            Eq.b r0 = G(r8)     // Catch: java.lang.Exception -> L47
            r12.f26312a = r9     // Catch: java.lang.Exception -> L47
            r12.f26313b = r11     // Catch: java.lang.Exception -> L47
            r12.f26314c = r8     // Catch: java.lang.Exception -> L47
            r12.f26315d = r12     // Catch: java.lang.Exception -> L47
            r12.f26316e = r12     // Catch: java.lang.Exception -> L47
            r12.f26317f = r8     // Catch: java.lang.Exception -> L47
            r12.f26318g = r10     // Catch: java.lang.Exception -> L47
            r12.f26319h = r4     // Catch: java.lang.Exception -> L47
            r12.f26320i = r4     // Catch: java.lang.Exception -> L47
            r12.f26321j = r4     // Catch: java.lang.Exception -> L47
            r12.f26322k = r4     // Catch: java.lang.Exception -> L47
            r12.f26325n = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r0 = r0.n(r9, r12)     // Catch: java.lang.Exception -> L47
            if (r0 != r1) goto L79
            return r1
        L79:
            java.lang.Object r12 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L47
            goto L8f
        L7e:
            kotlin.coroutines.CoroutineContext r12 = r12.getContext()
            mv.E0.i(r12)
            kotlin.Result$Companion r12 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.a(r0)
            java.lang.Object r12 = kotlin.Result.b(r12)
        L8f:
            boolean r0 = kotlin.Result.h(r12)
            r1 = 0
            if (r0 == 0) goto La0
            r0 = r12
            java.util.List r0 = (java.util.List) r0
            r2 = 2
            z0(r8, r0, r4, r2, r1)
            r8.w0(r9, r10, r11)
        La0:
            java.lang.Throwable r9 = kotlin.Result.e(r12)
            if (r9 == 0) goto Lbb
            qw.a$a r10 = qw.a.INSTANCE
            r10.e(r9)
            mv.O r2 = androidx.view.d0.a(r8)
            Pq.h$K r5 = new Pq.h$K
            r5.<init>(r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            mv.C15805i.d(r2, r3, r4, r5, r6, r7)
        Lbb:
            kotlin.Unit r9 = kotlin.Unit.f143329a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.f0(Fq.c, boolean, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object g0(h hVar, ShoppingListItem shoppingListItem, boolean z10, Integer num, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return hVar.f0(shoppingListItem, z10, num, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(Fq.ShoppingListItem r11, Fq.ShoppingListItem r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pq.h.h0(Fq.c, Fq.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void j0() {
        this.analyticsEngine.b(C14756c.a("shopping list cleared"), new Function1() { // from class: Pq.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.k0((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f143329a;
    }

    private final void l0(final ShoppingListItem shoppingListItem, boolean isBarcodeScanner) {
        this.analyticsEngine.b(C14756c.a(isBarcodeScanner ? "product added to shopping list:barcode scanner" : "product added to shopping list:add item"), new Function1() { // from class: Pq.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.n0(shoppingListItem, (TrackingData) obj);
            }
        });
    }

    static /* synthetic */ void m0(h hVar, ShoppingListItem shoppingListItem, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        hVar.l0(shoppingListItem, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(ShoppingListItem shoppingListItem, TrackingData track) {
        nk.c cVarJ;
        Intrinsics.j(track, "$this$track");
        if (shoppingListItem == null || (cVarJ = shoppingListItem.j()) == null || track.h("productID", cVarJ.getCode()) == null) {
            track.h("itemName", shoppingListItem != null ? shoppingListItem.getItemDescription() : null);
        }
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f143329a;
    }

    private final void o0(final ShoppingListItem shoppingListItem) {
        this.analyticsEngine.b(C14756c.a("item checked off the list"), new Function1() { // from class: Pq.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.p0(shoppingListItem, (TrackingData) obj);
            }
        });
    }

    private final void onLoadingStates(List<? extends Pj.a> loadingStates) {
        ShoppingListState value;
        InterfaceC16549B<ShoppingListState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ShoppingListState.b(value, null, null, false, (Pj.b.d(loadingStates, "shopping list") || Pj.b.d(loadingStates, "products")) ? new a.Loading(null, AbstractC6392a.INSTANCE.d(Aq.b.f1953A, new Object[0]), 1, null) : Pj.b.d(loadingStates, "coupons") ? new a.Loading(null, AbstractC6392a.INSTANCE.a(), 1, null) : Pj.b.c(loadingStates, "shopping list") ? new a.Failed(null, null, 3, null) : new a.NotLoading(null, 1, null), null, null, false, 119, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(ShoppingListItem shoppingListItem, TrackingData track) {
        nk.c cVarJ;
        String code;
        Intrinsics.j(track, "$this$track");
        if (shoppingListItem == null || (cVarJ = shoppingListItem.j()) == null || (code = cVarJ.getCode()) == null || track.h("productID", code) == null) {
            track.h("itemName", shoppingListItem != null ? shoppingListItem.getItemDescription() : null);
        }
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f143329a;
    }

    private final void q0(final ShoppingListItem shoppingListItem, final int initialQuantity) {
        this.analyticsEngine.b(C14756c.a(shoppingListItem.getQuantity() > initialQuantity ? "shopping list:item quantity added" : "shopping list:item quantity removed"), new Function1() { // from class: Pq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.r0(shoppingListItem, initialQuantity, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(ShoppingListItem shoppingListItem, int i10, TrackingData track) {
        String code;
        Intrinsics.j(track, "$this$track");
        nk.c cVarJ = shoppingListItem.j();
        if (cVarJ == null || (code = cVarJ.getCode()) == null || track.h("productID", code) == null) {
            track.h("itemName", shoppingListItem.getItemDescription());
        }
        track.h("quantity", String.valueOf(Math.abs(shoppingListItem.getQuantity() - i10)));
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f143329a;
    }

    private final void s0(final ShoppingListItem shoppingListItem) {
        this.analyticsEngine.b(C14756c.a("item order changed in shopping list"), new Function1() { // from class: Pq.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.t0(shoppingListItem, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(ShoppingListItem shoppingListItem, TrackingData track) {
        nk.c cVarJ;
        String code;
        Intrinsics.j(track, "$this$track");
        if (shoppingListItem == null || (cVarJ = shoppingListItem.j()) == null || (code = cVarJ.getCode()) == null || track.h("productID", code) == null) {
            track.h("itemName", shoppingListItem != null ? shoppingListItem.getItemDescription() : null);
        }
        track.n("Shopping List edit mode");
        track.v("shopping list");
        return Unit.f143329a;
    }

    private final void u0(final String optionSelected) {
        this.analyticsEngine.b(C14756c.a("interaction with ellipsis menu"), new Function1() { // from class: Pq.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.v0(optionSelected, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        track.h("optionSelected", str);
        return Unit.f143329a;
    }

    private final void w0(final ShoppingListItem shoppingListItem, final boolean isItemRemoved, final Integer quantity) {
        this.analyticsEngine.b(C14756c.a(isItemRemoved ? "item removed from shopping list" : "shopping list:item deleted"), new Function1() { // from class: Pq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.x0(isItemRemoved, shoppingListItem, quantity, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(boolean z10, ShoppingListItem shoppingListItem, Integer num, TrackingData track) {
        nk.c cVarJ;
        Intrinsics.j(track, "$this$track");
        track.n(z10 ? "Shopping List edit mode" : "Shopping List");
        track.v("shopping list");
        if (shoppingListItem == null || (cVarJ = shoppingListItem.j()) == null || track.h("productID", cVarJ.getCode()) == null) {
            track.h("itemName", shoppingListItem != null ? shoppingListItem.getItemDescription() : null);
        }
        if (num != null) {
            track.h("quantity", String.valueOf(num.intValue()));
        }
        return Unit.f143329a;
    }

    private final void y0(List<ShoppingListItem> list, boolean updateLoadingState) {
        ShoppingListState value;
        ShoppingListState shoppingListState;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object next;
        Object next2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list) {
            if (((ShoppingListItem) obj).getIsComplete()) {
                arrayList4.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList3, arrayList4);
        List list2 = (List) pair.a();
        List list3 = (List) pair.b();
        InterfaceC16549B<ShoppingListState> interfaceC16549B = this._stateFlow;
        do {
            value = interfaceC16549B.getValue();
            shoppingListState = value;
            List list4 = list2;
            arrayList = new ArrayList(CollectionsKt.x(list4, 10));
            Iterator it = list4.iterator();
            while (true) {
                ProductFullDetails productDetails = null;
                if (!it.hasNext()) {
                    break;
                }
                ShoppingListItem shoppingListItem = (ShoppingListItem) it.next();
                Iterator<T> it2 = shoppingListState.d().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (((ShoppingListItem) next2).w(shoppingListItem)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ShoppingListItem shoppingListItem2 = (ShoppingListItem) next2;
                if (shoppingListItem2 != null) {
                    productDetails = shoppingListItem2.getProductDetails();
                }
                arrayList.add(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : null, (32511 & 32) != 0 ? shoppingListItem.quantity : 0, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : false, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : productDetails));
            }
            List<ShoppingListItem> list5 = list3;
            arrayList2 = new ArrayList(CollectionsKt.x(list5, 10));
            for (ShoppingListItem shoppingListItem3 : list5) {
                Iterator<T> it3 = shoppingListState.c().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((ShoppingListItem) next).w(shoppingListItem3)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ShoppingListItem shoppingListItem4 = (ShoppingListItem) next;
                arrayList2.add(shoppingListItem3.a((32511 & 1) != 0 ? shoppingListItem3.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem3.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem3.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem3.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem3.itemDescription : null, (32511 & 32) != 0 ? shoppingListItem3.quantity : 0, (32511 & 64) != 0 ? shoppingListItem3.storeId : 0, (32511 & 128) != 0 ? shoppingListItem3.notes : null, (32511 & 256) != 0 ? shoppingListItem3.isComplete : false, (32511 & 512) != 0 ? shoppingListItem3.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem3.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem3.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem3.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem3.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem3.productDetails : shoppingListItem4 != null ? shoppingListItem4.getProductDetails() : null));
            }
        } while (!interfaceC16549B.e(value, ShoppingListState.b(shoppingListState, arrayList, arrayList2, false, null, null, null, false, BinsView.TOTE_HEIGHT_DP, null)));
        if (updateLoadingState) {
            this.loadingStateManager.b(new a.NotLoading("shopping list"));
        }
    }

    static /* synthetic */ void z0(h hVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        hVar.y0(list, z10);
    }

    public final P<ShoppingListState> V() {
        return this.stateFlow;
    }

    public final void W(AbstractC4612e action) {
        ShoppingListState value;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC4612e.b) {
            C15809k.d(d0.a(this), null, null, new p(null), 3, null);
            return;
        }
        if (action instanceof AbstractC4612e.C0483e) {
            u0("Edit Mode");
            return;
        }
        if (action instanceof AbstractC4612e.d) {
            u0("Clear List");
            return;
        }
        if (action instanceof AbstractC4612e.OnShoppingListItemChange) {
            C15809k.d(d0.a(this), null, null, new q(action, null), 3, null);
            return;
        }
        if (action instanceof AbstractC4612e.c) {
            InterfaceC16549B<ShoppingListState> interfaceC16549B = this._stateFlow;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShoppingListState.b(value, null, null, true, null, null, null, false, 123, null)));
        } else if (action instanceof AbstractC4612e.a) {
            j0();
            C15809k.d(d0.a(this), null, null, new r(null), 3, null);
        } else if (action instanceof AbstractC4612e.ShareList) {
            u0("Share List");
            a0(((AbstractC4612e.ShareList) action).a());
        } else {
            if (!(action instanceof AbstractC4612e.ShoppingListItemClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            d0(((AbstractC4612e.ShoppingListItemClicked) action).getShoppingListItem());
        }
    }

    public final void b0(Bq.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Add) {
            C15809k.d(d0.a(this), null, null, new y(action, null), 3, null);
            return;
        }
        if (action instanceof a.AddItems) {
            C15809k.d(d0.a(this), null, null, new z(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, a.d.f3627a)) {
            C15809k.d(d0.a(this), null, null, new A(null), 3, null);
            return;
        }
        if (action instanceof a.Remove) {
            C15809k.d(d0.a(this), null, null, new B(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, a.f.f3629a)) {
            C15809k.d(d0.a(this), null, null, new C(null), 3, null);
        } else if (action instanceof a.UpdateCompletion) {
            C15809k.d(d0.a(this), null, null, new D(action, null), 3, null);
        } else {
            if (!(action instanceof a.MoveItem)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new E(action, null), 3, null);
        }
    }

    public final void e0(Bq.b action) {
        ShoppingListState value;
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, b.a.f3631a)) {
            InterfaceC16549B<ShoppingListState> interfaceC16549B = this._stateFlow;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShoppingListState.b(value, null, null, false, null, new SearchSuggestions(null, 1, null), "", false, 79, null)));
        } else if (action instanceof b.SearchTypeQuery) {
            Z(((b.SearchTypeQuery) action).getSearchTerm());
        } else {
            if (!Intrinsics.e(action, b.c.f3633a)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new I(null), 3, null);
        }
    }

    public final InterfaceC16553F<AbstractC4614g> getEvents() {
        return this.events;
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        C15809k.d(d0.a(this), null, null, new u(null), 3, null);
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        this.clippedOffersList = null;
    }

    private final void a0(List<ShoppingListItem> inProgressList) {
        C15809k.d(d0.a(this), null, null, new x(inProgressList, null), 3, null);
    }

    private final void d0(ShoppingListItem item) {
        C15809k.d(d0.a(this), null, null, new H(item, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(long offerId) {
        C15809k.d(d0.a(this), null, null, new M(offerId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object t(h hVar, List list, Continuation continuation) {
        hVar.onLoadingStates(list);
        return Unit.f143329a;
    }
}
