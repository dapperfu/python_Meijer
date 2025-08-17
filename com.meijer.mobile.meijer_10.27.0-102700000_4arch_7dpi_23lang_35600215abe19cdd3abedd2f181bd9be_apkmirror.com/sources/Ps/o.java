package Ps;

import Fq.ShoppingListItem;
import Fq.ShoppingListStore;
import Js.WeeklyAdItem;
import Js.WeeklyAdPrintPage;
import Js.WeeklyAdPublication;
import Ls.a;
import Oj.a;
import Ps.o;
import Ra.z;
import Ta.a;
import ak.AbstractC5607a;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import androidx.view.c0;
import androidx.view.d0;
import cl.C6412d;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.InterfaceC14261a;
import hi.AbstractC14481h;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import j$.time.LocalDate;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;
import vk.C17590a;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004^UZBBC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00172\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0014H\u0002¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0014H\u0002¢\u0006\u0004\b)\u0010\u0019J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u001aH\u0002¢\u0006\u0004\b/\u0010\u001dJ'\u00105\u001a\u00020\u00172\u0006\u00101\u001a\u0002002\u0006\u0010.\u001a\u0002022\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u00172\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\u00172\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020\u00172\u000e\u0010A\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00172\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\u00172\u0006\u0010.\u001a\u00020H¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010WR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020Y0]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020d0h8\u0006¢\u0006\f\n\u0004\bF\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020D0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010fR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u00020D0h8\u0006¢\u0006\f\n\u0004\bo\u0010i\u001a\u0004\bp\u0010kR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020r0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010fR\u001d\u0010w\u001a\b\u0012\u0004\u0012\u00020r0h8\u0006¢\u0006\f\n\u0004\bu\u0010i\u001a\u0004\bv\u0010kR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006}"}, d2 = {"LPs/o;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LTa/a$b;", "LCs/b;", "userProvider", "Lgi/a;", "analyticsEngine", "LEq/b;", "shoppingListRepository", "Lcl/d;", "couponsRepository", "LLs/a;", "getFlippWeeklyAdPrintInfoCall", "LTq/j;", "storeProvider", "Lqv/K;", "ioDispatcher", "<init>", "(LCs/b;Lgi/a;LEq/b;Lcl/d;LLs/a;LTq/j;Lqv/K;)V", "", "LOj/a;", "loadingStates", "", "onLoadingStates", "(Ljava/util/List;)V", "", "sfmlUrl", "I", "(Ljava/lang/String;)V", "LLs/a$a;", "weeklyAdPrintInfo", "N", "(LLs/a$a;)V", "LFq/c;", "shoppingList", "M", "O", "()V", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse$AdBlockWithCoupons;", "adBlockWithCouponsList", "L", "", "itemId", "K", "(I)V", "action", "R", "LJs/b;", "weeklyAdItem", "Lhi/h$a;", "Lhi/i$e;", "section", "P", "(LJs/b;Lhi/h$a;Lhi/i$e;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "LJs/e;", "weeklyAdPublication", "H", "(LJs/e;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p0", "g", "(Ljava/lang/Exception;)V", "LRa/z;", "storeFront", "k", "(LRa/z;)V", "LPs/o$f;", "J", "(LPs/o$f;)V", "a", "LCs/b;", "b", "Lgi/a;", "c", "LEq/b;", "d", "Lcl/d;", "e", "LLs/a;", "f", "LTq/j;", "Lqv/K;", "Ltv/B;", "LPs/o$i;", "h", "Ltv/B;", "_viewState", "Ltv/P;", "i", "Ltv/P;", "G", "()Ltv/P;", "viewState", "Ltv/A;", "LPs/o$h;", "j", "Ltv/A;", "_effectsFlow", "Ltv/F;", "Ltv/F;", "D", "()Ltv/F;", "effectsFlow", "l", "_storeFrontFlow", "m", "F", "storeFrontFlow", "LPs/o$g$a;", "n", "_errorLoadingFlow", "o", "E", "errorLoadingFlow", "LOj/c;", "p", "LOj/c;", "loadingStateManager", "q", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class o extends c0 implements InterfaceC6015f, a.b {

    /* renamed from: r, reason: collision with root package name */
    public static final int f29224r = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ls.a getFlippWeeklyAdPrintInfoCall;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<h> _effectsFlow;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<h> effectsFlow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<z> _storeFrontFlow;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<z> storeFrontFlow;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<Companion.a> _errorLoadingFlow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<Companion.a> errorLoadingFlow;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Oj.c loadingStateManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<List<? extends Oj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, o.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Oj.a> list, Continuation<? super Unit> continuation) {
            return o.o((o) this.f142801a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "LOj/a;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$2", f = "WeeklyAdViewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends Oj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29241a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29242b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super List<? extends Oj.a>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f29242b = th2;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f29241a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f29242b, "Caught exception in loadingStatesStream", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFq/e;", "it", "", "<anonymous>", "(LFq/e;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$3", f = "WeeklyAdViewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<ShoppingListStore, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29243a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29244b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = o.this.new c(continuation);
            cVar.f29244b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ShoppingListStore shoppingListStore, Continuation<? super Unit> continuation) {
            return ((c) create(shoppingListStore, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f29243a == 0) {
                ResultKt.b(obj);
                o.this.M(((ShoppingListStore) this.f29244b).c());
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LFq/e;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$4", f = "WeeklyAdViewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function3<InterfaceC17153g<? super ShoppingListStore>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29246a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29247b;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super ShoppingListStore> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(continuation);
            dVar.f29247b = th2;
            return dVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f29246a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f29247b, "Error fetching data from shopping list.", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$5", f = "WeeklyAdViewViewModel.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29248a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPs/o$i;", "viewState", "", "<anonymous>", "(LPs/o$i;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$5$1", f = "WeeklyAdViewViewModel.kt", l = {102, 104, 105}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<ViewState, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29250a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29251b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ o f29252c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29252c = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f29252c, continuation);
                aVar.f29251b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ViewState viewState, Continuation<? super Unit> continuation) {
                return ((a) create(viewState, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
            
                if (r1.emit(r2, r5) == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
            
                if (r1.emit(r2, r5) == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
            
                if (r1.emit(r3, r5) == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
            
                return r0;
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
                    int r1 = r5.f29250a
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r4) goto L1a
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1a:
                    java.lang.Object r0 = r5.f29251b
                    Ps.o$i r0 = (Ps.o.ViewState) r0
                    kotlin.ResultKt.b(r6)
                    goto L6e
                L22:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f29251b
                    Ps.o$i r6 = (Ps.o.ViewState) r6
                    boolean r1 = r6.getShowError()
                    if (r1 == 0) goto L42
                    Ps.o r1 = r5.f29252c
                    tv.A r1 = Ps.o.w(r1)
                    Ps.o$g$a r2 = Ps.o.Companion.a.f29260b
                    r5.f29251b = r6
                    r5.f29250a = r4
                    java.lang.Object r6 = r1.emit(r2, r5)
                    if (r6 != r0) goto L6e
                    goto L6d
                L42:
                    boolean r1 = r6.getIsLoading()
                    if (r1 == 0) goto L5b
                    Ps.o r1 = r5.f29252c
                    tv.A r1 = Ps.o.w(r1)
                    Ps.o$g$a r2 = Ps.o.Companion.a.f29259a
                    r5.f29251b = r6
                    r5.f29250a = r3
                    java.lang.Object r6 = r1.emit(r2, r5)
                    if (r6 != r0) goto L6e
                    goto L6d
                L5b:
                    Ps.o r1 = r5.f29252c
                    tv.A r1 = Ps.o.w(r1)
                    Ps.o$g$a r3 = Ps.o.Companion.a.f29261c
                    r5.f29251b = r6
                    r5.f29250a = r2
                    java.lang.Object r6 = r1.emit(r3, r5)
                    if (r6 != r0) goto L6e
                L6d:
                    return r0
                L6e:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Ps.o.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29248a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                P<ViewState> pG = o.this.G();
                a aVar = new a(o.this, null);
                this.f29248a = 1;
                if (C17154h.k(pG, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LPs/o$f;", "", "<init>", "()V", "b", "c", "d", "f", "e", "a", "LPs/o$f$a;", "LPs/o$f$b;", "LPs/o$f$c;", "LPs/o$f$d;", "LPs/o$f$e;", "LPs/o$f$f;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPs/o$f$a;", "LPs/o$f;", "", "scrollStateOrdinal", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$f$a, reason: from toString */
        public static final /* data */ class BottomSheetScrollStateChange extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int scrollStateOrdinal;

            public BottomSheetScrollStateChange(int i10) {
                super(null);
                this.scrollStateOrdinal = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BottomSheetScrollStateChange) && this.scrollStateOrdinal == ((BottomSheetScrollStateChange) other).scrollStateOrdinal;
            }

            /* renamed from: a, reason: from getter */
            public final int getScrollStateOrdinal() {
                return this.scrollStateOrdinal;
            }

            public int hashCode() {
                return Integer.hashCode(this.scrollStateOrdinal);
            }

            public String toString() {
                return "BottomSheetScrollStateChange(scrollStateOrdinal=" + this.scrollStateOrdinal + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPs/o$f$b;", "LPs/o$f;", "", "itemId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$f$b, reason: from toString */
        public static final /* data */ class FlyerClicked extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int itemId;

            public FlyerClicked(int i10) {
                super(null);
                this.itemId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FlyerClicked) && this.itemId == ((FlyerClicked) other).itemId;
            }

            /* renamed from: a, reason: from getter */
            public final int getItemId() {
                return this.itemId;
            }

            public int hashCode() {
                return Integer.hashCode(this.itemId);
            }

            public String toString() {
                return "FlyerClicked(itemId=" + this.itemId + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/o$f$c;", "LPs/o$f;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$f$c, reason: from toString */
        public static final /* data */ class HybridListItemClicked extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public HybridListItemClicked(WeeklyAdItem weeklyAdItem) {
                super(null);
                this.weeklyAdItem = weeklyAdItem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HybridListItemClicked) && Intrinsics.e(this.weeklyAdItem, ((HybridListItemClicked) other).weeklyAdItem);
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                WeeklyAdItem weeklyAdItem = this.weeklyAdItem;
                if (weeklyAdItem == null) {
                    return 0;
                }
                return weeklyAdItem.hashCode();
            }

            public String toString() {
                return "HybridListItemClicked(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/o$f$d;", "LPs/o$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final d f29256a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "LeftArrowClicked";
            }

            public int hashCode() {
                return 1648639527;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPs/o$f$e;", "LPs/o$f;", "", "pageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$f$e, reason: from toString */
        public static final /* data */ class PagerSwipe extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int pageIndex;

            public PagerSwipe(int i10) {
                super(null);
                this.pageIndex = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PagerSwipe) && this.pageIndex == ((PagerSwipe) other).pageIndex;
            }

            /* renamed from: a, reason: from getter */
            public final int getPageIndex() {
                return this.pageIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.pageIndex);
            }

            public String toString() {
                return "PagerSwipe(pageIndex=" + this.pageIndex + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPs/o$f$f;", "LPs/o$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$f$f, reason: collision with other inner class name */
        public static final /* data */ class C0680f extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final C0680f f29258a = new C0680f();

            private C0680f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0680f);
            }

            public String toString() {
                return "RightArrowClicked";
            }

            public int hashCode() {
                return 1823672;
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LPs/o$h;", "", "<init>", "()V", "b", "d", "a", "c", "LPs/o$h$a;", "LPs/o$h$b;", "LPs/o$h$c;", "LPs/o$h$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class h {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/o$h$a;", "LPs/o$h;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$h$a, reason: from toString */
        public static final /* data */ class AdTapped extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AdTapped) && Intrinsics.e(this.weeklyAdItem, ((AdTapped) other).weeklyAdItem);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdTapped(WeeklyAdItem weeklyAdItem) {
                super(null);
                Intrinsics.j(weeklyAdItem, "weeklyAdItem");
                this.weeklyAdItem = weeklyAdItem;
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                return this.weeklyAdItem.hashCode();
            }

            public String toString() {
                return "AdTapped(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LPs/o$h$b;", "LPs/o$h;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$h$b, reason: from toString */
        public static final /* data */ class ExternalUrlTapped extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExternalUrlTapped) && Intrinsics.e(this.url, ((ExternalUrlTapped) other).url);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExternalUrlTapped(String url) {
                super(null);
                Intrinsics.j(url, "url");
                this.url = url;
            }

            /* renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return "ExternalUrlTapped(url=" + this.url + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPs/o$h$c;", "LPs/o$h;", "LJs/b;", "weeklyAdItem", "<init>", "(LJs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJs/b;", "()LJs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$h$c, reason: from toString */
        public static final /* data */ class ShowDetails extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final WeeklyAdItem weeklyAdItem;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowDetails) && Intrinsics.e(this.weeklyAdItem, ((ShowDetails) other).weeklyAdItem);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowDetails(WeeklyAdItem weeklyAdItem) {
                super(null);
                Intrinsics.j(weeklyAdItem, "weeklyAdItem");
                this.weeklyAdItem = weeklyAdItem;
            }

            /* renamed from: a, reason: from getter */
            public final WeeklyAdItem getWeeklyAdItem() {
                return this.weeklyAdItem;
            }

            public int hashCode() {
                return this.weeklyAdItem.hashCode();
            }

            public String toString() {
                return "ShowDetails(weeklyAdItem=" + this.weeklyAdItem + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LPs/o$h$d;", "LPs/o$h;", "", "isYoutube", "", "url", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ps.o$h$d, reason: from toString */
        public static final /* data */ class VideoTapped extends h {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isYoutube;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoTapped)) {
                    return false;
                }
                VideoTapped videoTapped = (VideoTapped) other;
                return this.isYoutube == videoTapped.isYoutube && Intrinsics.e(this.url, videoTapped.url);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoTapped(boolean z10, String url) {
                super(null);
                Intrinsics.j(url, "url");
                this.isYoutube = z10;
                this.url = url;
            }

            /* renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsYoutube() {
                return this.isYoutube;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isYoutube) * 31) + this.url.hashCode();
            }

            public String toString() {
                return "VideoTapped(isYoutube=" + this.isYoutube + ", url=" + this.url + ')';
            }
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private h() {
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b.\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0014038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00104R/\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\r060\r8\u0006¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b9\u00102R\u0017\u0010<\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b;\u0010)R\u0017\u0010?\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b>\u0010)R\u0014\u0010@\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0014\u0010B\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0018R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002070\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u00102R\u0014\u0010F\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0018R\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010\u001fR\u0011\u0010I\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b8\u0010\u0018R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00140\r8F¢\u0006\u0006\u001a\u0004\b=\u00102R\u0011\u0010M\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bL\u0010)R\u0011\u0010O\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bN\u0010)¨\u0006P"}, d2 = {"LPs/o$i;", "", "Lak/a;", "validThruDate", "LJs/e;", "weeklyAdPublication", "", "currentPage", "", "hasFlyerItems", "LLs/a$a;", "weeklyAdPrintInfo", "drawerExpanded", "", "LOj/a;", "loadingStates", "<init>", "(Lak/a;LJs/e;IZLLs/a$a;ZLjava/util/List;)V", "c", "(Lak/a;LJs/e;IZLLs/a$a;ZLjava/util/List;)LPs/o$i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "getValidThruDate", "()Lak/a;", "b", "LJs/e;", "v", "()LJs/e;", "I", "f", "d", "Z", "j", "()Z", "e", "LLs/a$a;", "u", "()LLs/a$a;", "h", "g", "Ljava/util/List;", "n", "()Ljava/util/List;", "", "Ljava/util/Set;", "categories", "Lkotlin/Pair;", "LJs/b;", "i", "q", "sectionsWithItems", "w", "isLoading", "k", "r", "showError", "currentPageOneBased", "p", "maxPagesOneBased", "m", "itemsOnCurrentPage", "o", "maxPages", "l", "indicatorText", "drawerTitle", "adDates", "imagesForPage", "s", "showLeftArrow", "t", "showRightArrow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ps.o$i, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a validThruDate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final WeeklyAdPublication weeklyAdPublication;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int currentPage;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasFlyerItems;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final a.WeeklyAdPrintInfo weeklyAdPrintInfo;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean drawerExpanded;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Oj.a> loadingStates;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Set<String> categories;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final List<Pair<String, List<WeeklyAdItem>>> sectionsWithItems;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final boolean isLoading;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final boolean showError;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ps.o$i$a */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Locale locale = Locale.ROOT;
                String lowerCase = ((String) t10).toLowerCase(locale);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((String) t11).toLowerCase(locale);
                Intrinsics.i(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt.d(lowerCase, lowerCase2);
            }
        }

        public ViewState() {
            this(null, null, 0, false, null, false, null, l3.f92485d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.validThruDate, viewState.validThruDate) && Intrinsics.e(this.weeklyAdPublication, viewState.weeklyAdPublication) && this.currentPage == viewState.currentPage && this.hasFlyerItems == viewState.hasFlyerItems && Intrinsics.e(this.weeklyAdPrintInfo, viewState.weeklyAdPrintInfo) && this.drawerExpanded == viewState.drawerExpanded && Intrinsics.e(this.loadingStates, viewState.loadingStates);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(AbstractC5607a validThruDate, WeeklyAdPublication weeklyAdPublication, int i10, boolean z10, a.WeeklyAdPrintInfo weeklyAdPrintInfo, boolean z11, List<? extends Oj.a> loadingStates) {
            Object next;
            Intrinsics.j(validThruDate, "validThruDate");
            Intrinsics.j(weeklyAdPublication, "weeklyAdPublication");
            Intrinsics.j(weeklyAdPrintInfo, "weeklyAdPrintInfo");
            Intrinsics.j(loadingStates, "loadingStates");
            this.validThruDate = validThruDate;
            this.weeklyAdPublication = weeklyAdPublication;
            this.currentPage = i10;
            this.hasFlyerItems = z10;
            this.weeklyAdPrintInfo = weeklyAdPrintInfo;
            this.drawerExpanded = z11;
            this.loadingStates = loadingStates;
            Set<String> setY = SequencesKt.Y(SequencesKt.S(SequencesKt.p(SequencesKt.M(CollectionsKt.f0(m()), new Function1() { // from class: Ps.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return o.ViewState.b((WeeklyAdItem) obj);
                }
            })), new a()));
            this.categories = setY;
            Set<String> set = setY;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(set, 10));
            for (String str : set) {
                List<WeeklyAdItem> listM = m();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listM) {
                    if (((WeeklyAdItem) obj).d().contains(str)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.add(TuplesKt.a(str, arrayList2));
            }
            this.sectionsWithItems = arrayList;
            List<Oj.a> list = this.loadingStates;
            boolean z12 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Oj.a) it.next()) instanceof a.Loading) {
                            z12 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.isLoading = z12;
            Iterator<T> it2 = this.loadingStates.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.e(((Oj.a) next).getKey(), "WeeklyAdView SFML LoadingState")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            this.showError = next instanceof a.Failed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List b(WeeklyAdItem it) {
            Intrinsics.j(it, "it");
            return it.d();
        }

        public static /* synthetic */ ViewState d(ViewState viewState, AbstractC5607a abstractC5607a, WeeklyAdPublication weeklyAdPublication, int i10, boolean z10, a.WeeklyAdPrintInfo weeklyAdPrintInfo, boolean z11, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                abstractC5607a = viewState.validThruDate;
            }
            if ((i11 & 2) != 0) {
                weeklyAdPublication = viewState.weeklyAdPublication;
            }
            if ((i11 & 4) != 0) {
                i10 = viewState.currentPage;
            }
            if ((i11 & 8) != 0) {
                z10 = viewState.hasFlyerItems;
            }
            if ((i11 & 16) != 0) {
                weeklyAdPrintInfo = viewState.weeklyAdPrintInfo;
            }
            if ((i11 & 32) != 0) {
                z11 = viewState.drawerExpanded;
            }
            if ((i11 & 64) != 0) {
                list = viewState.loadingStates;
            }
            boolean z12 = z11;
            List list2 = list;
            a.WeeklyAdPrintInfo weeklyAdPrintInfo2 = weeklyAdPrintInfo;
            int i12 = i10;
            return viewState.c(abstractC5607a, weeklyAdPublication, i12, z10, weeklyAdPrintInfo2, z12, list2);
        }

        private final int g() {
            return this.currentPage + 1;
        }

        private final List<WeeklyAdItem> m() {
            List<WeeklyAdItem> listD = this.weeklyAdPrintInfo.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                WeeklyAdItem weeklyAdItem = (WeeklyAdItem) obj;
                if (weeklyAdItem.getPage() == g() && weeklyAdItem.getItemType() == Js.d.f16106b) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final int o() {
            return RangesKt.f(CollectionsKt.o(this.weeklyAdPrintInfo.c()), 0);
        }

        public final ViewState c(AbstractC5607a validThruDate, WeeklyAdPublication weeklyAdPublication, int currentPage, boolean hasFlyerItems, a.WeeklyAdPrintInfo weeklyAdPrintInfo, boolean drawerExpanded, List<? extends Oj.a> loadingStates) {
            Intrinsics.j(validThruDate, "validThruDate");
            Intrinsics.j(weeklyAdPublication, "weeklyAdPublication");
            Intrinsics.j(weeklyAdPrintInfo, "weeklyAdPrintInfo");
            Intrinsics.j(loadingStates, "loadingStates");
            return new ViewState(validThruDate, weeklyAdPublication, currentPage, hasFlyerItems, weeklyAdPrintInfo, drawerExpanded, loadingStates);
        }

        public final AbstractC5607a e() {
            OffsetDateTime startDate = this.weeklyAdPublication.getStartDate();
            OffsetDateTime endDate = this.weeklyAdPublication.getEndDate();
            if (startDate == null || endDate == null) {
                return AbstractC5607a.INSTANCE.a();
            }
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = com.meijer.mobile.weeklyad.c.f119291p;
            DateTimeFormatter dateTimeFormatter = C17590a.DATE_SLASHES_SHORT;
            return companion.d(i10, startDate.format(dateTimeFormatter), endDate.format(dateTimeFormatter));
        }

        /* renamed from: f, reason: from getter */
        public final int getCurrentPage() {
            return this.currentPage;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getDrawerExpanded() {
            return this.drawerExpanded;
        }

        public int hashCode() {
            return (((((((((((this.validThruDate.hashCode() * 31) + this.weeklyAdPublication.hashCode()) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasFlyerItems)) * 31) + this.weeklyAdPrintInfo.hashCode()) * 31) + Boolean.hashCode(this.drawerExpanded)) * 31) + this.loadingStates.hashCode();
        }

        public final int i() {
            return this.drawerExpanded ? com.meijer.mobile.weeklyad.c.f119284i : com.meijer.mobile.weeklyad.c.f119283h;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getHasFlyerItems() {
            return this.hasFlyerItems;
        }

        public final List<String> k() {
            List<WeeklyAdPrintPage> listC = this.weeklyAdPrintInfo.c();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                String image = ((WeeklyAdPrintPage) it.next()).getImage();
                if (image != null) {
                    arrayList.add(image);
                }
            }
            return arrayList;
        }

        public final AbstractC5607a l() {
            return AbstractC5607a.INSTANCE.d(com.meijer.mobile.weeklyad.c.f119289n, Integer.valueOf(g()), Integer.valueOf(p()));
        }

        public final List<Oj.a> n() {
            return this.loadingStates;
        }

        public final List<Pair<String, List<WeeklyAdItem>>> q() {
            return this.sectionsWithItems;
        }

        /* renamed from: r, reason: from getter */
        public final boolean getShowError() {
            return this.showError;
        }

        public final boolean s() {
            return this.currentPage > 0;
        }

        public final boolean t() {
            return this.currentPage < o();
        }

        public String toString() {
            return "ViewState(validThruDate=" + this.validThruDate + ", weeklyAdPublication=" + this.weeklyAdPublication + ", currentPage=" + this.currentPage + ", hasFlyerItems=" + this.hasFlyerItems + ", weeklyAdPrintInfo=" + this.weeklyAdPrintInfo + ", drawerExpanded=" + this.drawerExpanded + ", loadingStates=" + this.loadingStates + ')';
        }

        /* renamed from: u, reason: from getter */
        public final a.WeeklyAdPrintInfo getWeeklyAdPrintInfo() {
            return this.weeklyAdPrintInfo;
        }

        /* renamed from: v, reason: from getter */
        public final WeeklyAdPublication getWeeklyAdPublication() {
            return this.weeklyAdPublication;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        private final int p() {
            return o() + 1;
        }

        public /* synthetic */ ViewState(AbstractC5607a abstractC5607a, WeeklyAdPublication weeklyAdPublication, int i10, boolean z10, a.WeeklyAdPrintInfo weeklyAdPrintInfo, boolean z11, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? AbstractC5607a.INSTANCE.c("") : abstractC5607a, (i11 & 2) != 0 ? new WeeklyAdPublication(null, null, 0, 0, 0, null, null, null, null, null, 1023, null) : weeklyAdPublication, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? new a.WeeklyAdPrintInfo(CollectionsKt.m(), new ArrayList()) : weeklyAdPrintInfo, (i11 & 32) == 0 ? z11 : false, (i11 & 64) != 0 ? CollectionsKt.m() : list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onAction$1$1", f = "WeeklyAdViewViewModel.kt", l = {318}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29280a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29282c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(WeeklyAdItem weeklyAdItem, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f29282c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new j(this.f29282c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29280a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = o.this._effectsFlow;
                h.ShowDetails showDetails = new h.ShowDetails(this.f29282c);
                this.f29280a = 1;
                if (interfaceC17139A.emit(showDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onFlyerActionClicked$1$1$1", f = "WeeklyAdViewViewModel.kt", l = {270}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29283a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(WeeklyAdItem weeklyAdItem, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f29285c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new k(this.f29285c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29283a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = o.this._effectsFlow;
                String webUrl = this.f29285c.getWebUrl();
                Intrinsics.g(webUrl);
                h.ExternalUrlTapped externalUrlTapped = new h.ExternalUrlTapped(webUrl);
                this.f29283a = 1;
                if (interfaceC17139A.emit(externalUrlTapped, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onFlyerActionClicked$1$1$2", f = "WeeklyAdViewViewModel.kt", l = {276}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29286a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(WeeklyAdItem weeklyAdItem, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f29288c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new l(this.f29288c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29286a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = o.this._effectsFlow;
                if (this.f29288c.getVideoType() == Js.f.f16125b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String videoUrl = this.f29288c.getVideoUrl();
                Intrinsics.g(videoUrl);
                h.VideoTapped videoTapped = new h.VideoTapped(z10, videoUrl);
                this.f29286a = 1;
                if (interfaceC17139A.emit(videoTapped, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onFlyerActionClicked$1$1$3", f = "WeeklyAdViewViewModel.kt", l = {287}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29289a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeeklyAdItem f29291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(WeeklyAdItem weeklyAdItem, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f29291c = weeklyAdItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new m(this.f29291c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29289a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = o.this._effectsFlow;
                h.AdTapped adTapped = new h.AdTapped(this.f29291c);
                this.f29289a = 1;
                if (interfaceC17139A.emit(adTapped, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onProductsInfoRetrieved$2", f = "WeeklyAdViewViewModel.kt", l = {195}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29292a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29292a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Eq.b bVar = o.this.shoppingListRepository;
                this.f29292a = 1;
                if (bVar.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onResume$1$3", f = "WeeklyAdViewViewModel.kt", l = {122}, m = "invokeSuspend")
    /* renamed from: Ps.o$o, reason: collision with other inner class name */
    static final class C0681o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29294a;

        C0681o(Continuation<? super C0681o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new C0681o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C0681o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29294a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Eq.b bVar = o.this.shoppingListRepository;
                this.f29294a = 1;
                if (bVar.i(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onStorefrontLoaded$1", f = "WeeklyAdViewViewModel.kt", l = {157}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29296a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f29298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(z zVar, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f29298c = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new p(this.f29298c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29296a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = o.this._storeFrontFlow;
                z zVar = this.f29298c;
                this.f29296a = 1;
                if (interfaceC17139A.emit(zVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$onStorefrontLoaded$2", f = "WeeklyAdViewViewModel.kt", l = {162}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29299a;

        /* renamed from: b, reason: collision with root package name */
        Object f29300b;

        /* renamed from: c, reason: collision with root package name */
        Object f29301c;

        /* renamed from: d, reason: collision with root package name */
        Object f29302d;

        /* renamed from: e, reason: collision with root package name */
        int f29303e;

        /* renamed from: f, reason: collision with root package name */
        int f29304f;

        /* renamed from: g, reason: collision with root package name */
        int f29305g;

        /* renamed from: h, reason: collision with root package name */
        int f29306h;

        /* renamed from: i, reason: collision with root package name */
        int f29307i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29308j;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = o.this.new q(continuation);
            qVar.f29308j = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29307i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29308j;
                    o oVar = o.this;
                    Result.Companion companion = Result.INSTANCE;
                    oVar.loadingStateManager.b(new a.Loading("WeeklyAdView Ad LoadingState", null, 2, null));
                    Ls.a aVar = oVar.getFlippWeeklyAdPrintInfoCall;
                    int flyerID = oVar.G().getValue().getWeeklyAdPublication().getFlyerID();
                    this.f29308j = interfaceC16622O;
                    this.f29299a = interfaceC16622O;
                    this.f29300b = this;
                    this.f29301c = this;
                    this.f29302d = interfaceC16622O;
                    this.f29303e = 0;
                    this.f29304f = 0;
                    this.f29305g = 0;
                    this.f29306h = 0;
                    this.f29307i = 1;
                    obj = aVar.c(flyerID, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            o oVar2 = o.this;
            if (Result.h(objB)) {
                oVar2.loadingStateManager.b(new a.NotLoading("WeeklyAdView Ad LoadingState"));
                oVar2.N((a.WeeklyAdPrintInfo) objB);
            }
            o oVar3 = o.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Unable to retrieve product info at this time from WeeklyAdViewViewModel", new Object[0]);
                oVar3.loadingStateManager.b(new a.Failed("WeeklyAdView Ad LoadingState", null, 2, null));
                InterfaceC17140B interfaceC17140B = oVar3._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.d((ViewState) value, null, null, 0, false, null, false, null, 119, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.viewmodel.WeeklyAdViewViewModel$refreshCoupons$1$1", f = "WeeklyAdViewViewModel.kt", l = {222}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29310a;

        /* renamed from: b, reason: collision with root package name */
        Object f29311b;

        /* renamed from: c, reason: collision with root package name */
        Object f29312c;

        /* renamed from: d, reason: collision with root package name */
        Object f29313d;

        /* renamed from: e, reason: collision with root package name */
        int f29314e;

        /* renamed from: f, reason: collision with root package name */
        int f29315f;

        /* renamed from: g, reason: collision with root package name */
        int f29316g;

        /* renamed from: h, reason: collision with root package name */
        int f29317h;

        /* renamed from: i, reason: collision with root package name */
        int f29318i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f29319j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ OffsetDateTime f29321l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(OffsetDateTime offsetDateTime, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f29321l = offsetDateTime;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            r rVar = o.this.new r(this.f29321l, continuation);
            rVar.f29319j = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f29318i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f29319j;
                    o oVar = o.this;
                    OffsetDateTime offsetDateTime = this.f29321l;
                    Result.Companion companion = Result.INSTANCE;
                    C6412d c6412d = oVar.couponsRepository;
                    LocalDate localDate = offsetDateTime.toLocalDate();
                    Intrinsics.i(localDate, "toLocalDate(...)");
                    int iB = oVar.storeProvider.b();
                    this.f29319j = interfaceC16622O;
                    this.f29310a = interfaceC16622O;
                    this.f29311b = this;
                    this.f29312c = this;
                    this.f29313d = interfaceC16622O;
                    this.f29314e = 0;
                    this.f29315f = 0;
                    this.f29316g = 0;
                    this.f29317h = 0;
                    this.f29318i = 1;
                    obj = c6412d.s(localDate, iB, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            o oVar2 = o.this;
            if (Result.h(objB)) {
                oVar2.L((List) objB);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Error loading weekly ad related coupons", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    public o(Cs.b userProvider, InterfaceC14261a analyticsEngine, Eq.b shoppingListRepository, C6412d couponsRepository, Ls.a getFlippWeeklyAdPrintInfoCall, Tq.j storeProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(getFlippWeeklyAdPrintInfoCall, "getFlippWeeklyAdPrintInfoCall");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userProvider = userProvider;
        this.analyticsEngine = analyticsEngine;
        this.shoppingListRepository = shoppingListRepository;
        this.couponsRepository = couponsRepository;
        this.getFlippWeeklyAdPrintInfoCall = getFlippWeeklyAdPrintInfoCall;
        this.storeProvider = storeProvider;
        this.ioDispatcher = ioDispatcher;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, 0, false, null, false, null, l3.f92485d, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<h> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC17139AB;
        this.effectsFlow = C17154h.b(interfaceC17139AB);
        InterfaceC17139A<z> interfaceC17139AB2 = C17146H.b(0, 0, null, 7, null);
        this._storeFrontFlow = interfaceC17139AB2;
        this.storeFrontFlow = C17154h.b(interfaceC17139AB2);
        InterfaceC17139A<Companion.a> interfaceC17139AB3 = C17146H.b(0, 0, null, 7, null);
        this._errorLoadingFlow = interfaceC17139AB3;
        this.errorLoadingFlow = C17154h.b(interfaceC17139AB3);
        Oj.c cVar = new Oj.c();
        this.loadingStateManager = cVar;
        C17154h.J(C17154h.g(C17154h.O(cVar.a(), new a(this)), new b(null)), d0.a(this));
        if (userProvider.b()) {
            C17154h.J(C17154h.g(C17154h.O(shoppingListRepository.h(), new c(null)), new d(null)), d0.a(this));
        }
        C16648k.d(d0.a(this), null, null, new e(null), 3, null);
    }

    private final void I(String sfmlUrl) {
        this.loadingStateManager.b(new a.Loading("WeeklyAdView SFML LoadingState", null, 2, null));
        new com.meijer.mobile.weeklyad.d(this, sfmlUrl).execute(new Void[0]);
    }

    private final void K(int itemId) {
        Object next;
        String videoUrl;
        String webUrl;
        Iterator<T> it = this.viewState.getValue().getWeeklyAdPrintInfo().d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((WeeklyAdItem) next).getItemId() == itemId) {
                    break;
                }
            }
        }
        WeeklyAdItem weeklyAdItem = (WeeklyAdItem) next;
        if (weeklyAdItem != null) {
            P(weeklyAdItem, C14476c.a("WeeklyAd Open Item"), C14476c.g("weekly ad"));
            if (weeklyAdItem.getItemType() == Js.d.f16108d && (webUrl = weeklyAdItem.getWebUrl()) != null && !StringsKt.r0(webUrl)) {
                C16648k.d(d0.a(this), null, null, new k(weeklyAdItem, null), 3, null);
                return;
            }
            if (weeklyAdItem.getItemType() == Js.d.f16107c && (videoUrl = weeklyAdItem.getVideoUrl()) != null && !StringsKt.r0(videoUrl)) {
                C16648k.d(d0.a(this), null, null, new l(weeklyAdItem, null), 3, null);
            } else if (weeklyAdItem.getItemType() == Js.d.f16106b) {
                C16648k.d(d0.a(this), null, null, new m(weeklyAdItem, null), 3, null);
            } else {
                weeklyAdItem.getItemType();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(List<WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons> adBlockWithCouponsList) {
        ViewState value;
        ViewState viewState;
        a.WeeklyAdPrintInfo weeklyAdPrintInfo;
        ArrayList arrayList;
        if (adBlockWithCouponsList.isEmpty()) {
            return;
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            weeklyAdPrintInfo = viewState.getWeeklyAdPrintInfo();
            List<WeeklyAdItem> listD = viewState.getWeeklyAdPrintInfo().d();
            arrayList = new ArrayList(CollectionsKt.x(listD, 10));
            for (WeeklyAdItem weeklyAdItem : listD) {
                WeeklyAdItem weeklyAdItemB = weeklyAdItem;
                for (WeeklyAdRelatedCouponsResponse.AdBlockWithCoupons adBlockWithCoupons : adBlockWithCouponsList) {
                    if (adBlockWithCoupons.getAdBlockId() == weeklyAdItem.getAdBlockId()) {
                        weeklyAdItemB = WeeklyAdItem.b(weeklyAdItemB, 0, 0, null, null, null, 0, 0, null, null, null, 0L, null, CollectionsKt.m1(adBlockWithCoupons.b()), null, null, null, null, null, false, null, null, null, 4190207, null);
                    }
                }
                arrayList.add(weeklyAdItemB);
            }
        } while (!interfaceC17140B.e(value, ViewState.d(viewState, null, null, 0, false, a.WeeklyAdPrintInfo.b(weeklyAdPrintInfo, null, CollectionsKt.m1(arrayList), 1, null), false, null, 111, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(List<ShoppingListItem> shoppingList) {
        ViewState value;
        ViewState viewState;
        a.WeeklyAdPrintInfo weeklyAdPrintInfo;
        ArrayList arrayList;
        boolean z10;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            weeklyAdPrintInfo = viewState.getWeeklyAdPrintInfo();
            List<WeeklyAdItem> listD = viewState.getWeeklyAdPrintInfo().d();
            arrayList = new ArrayList(CollectionsKt.x(listD, 10));
            for (WeeklyAdItem weeklyAdItem : listD) {
                List<ShoppingListItem> listM = shoppingList == null ? CollectionsKt.m() : shoppingList;
                if ((listM instanceof Collection) && listM.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator<T> it = listM.iterator();
                    while (it.hasNext()) {
                        if (Fq.d.a((ShoppingListItem) it.next(), weeklyAdItem)) {
                            z10 = true;
                            break;
                        }
                    }
                    z10 = false;
                }
                arrayList.add(WeeklyAdItem.b(weeklyAdItem, 0, 0, null, null, null, 0, 0, null, null, null, 0L, null, null, null, null, null, null, null, z10, null, null, null, 3932159, null));
            }
        } while (!interfaceC17140B.e(value, ViewState.d(viewState, null, null, 0, false, a.WeeklyAdPrintInfo.b(weeklyAdPrintInfo, null, CollectionsKt.m1(arrayList), 1, null), false, null, 111, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(a.WeeklyAdPrintInfo weeklyAdPrintInfo) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            ViewState viewState = value;
            List<WeeklyAdItem> listD = weeklyAdPrintInfo.d();
            ArrayList<Js.d> arrayList = new ArrayList(CollectionsKt.x(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(((WeeklyAdItem) it.next()).getItemType());
            }
            boolean z10 = false;
            if (!arrayList.isEmpty()) {
                for (Js.d dVar : arrayList) {
                    if (dVar == Js.d.f16106b || dVar == Js.d.f16108d || dVar == Js.d.f16107c) {
                        z10 = true;
                        break;
                    }
                }
            }
            a.WeeklyAdPrintInfo weeklyAdPrintInfo2 = weeklyAdPrintInfo;
            if (interfaceC17140B.e(value, ViewState.d(viewState, null, null, 0, z10, weeklyAdPrintInfo2, false, null, 103, null))) {
                break;
            } else {
                weeklyAdPrintInfo = weeklyAdPrintInfo2;
            }
        }
        if (this.viewState.getValue().getHasFlyerItems()) {
            C16648k.d(d0.a(this), null, null, new n(null), 3, null);
            O();
        }
    }

    private final void O() {
        OffsetDateTime startDate = this.viewState.getValue().getWeeklyAdPublication().getStartDate();
        if (startDate != null) {
            C16648k.d(d0.a(this), this.ioDispatcher, null, new r(startDate, null), 2, null);
        }
    }

    private final void P(final WeeklyAdItem weeklyAdItem, AbstractC14481h.Action action, final AbstractC14482i.Section section) {
        final WeeklyAdPublication weeklyAdPublication = this.viewState.getValue().getWeeklyAdPublication();
        this.analyticsEngine.h(action, new Function1() { // from class: Ps.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.Q(section, weeklyAdItem, weeklyAdPublication, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(AbstractC14482i.Section section, WeeklyAdItem weeklyAdItem, WeeklyAdPublication weeklyAdPublication, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.u(section);
        track.n(null);
        track.h("mperkscoupons", weeklyAdItem.j() ? "Y" : "N");
        track.h("adblockid", String.valueOf(weeklyAdItem.getAdBlockId()));
        track.h("flyerTypeName", weeklyAdPublication.getTitle());
        track.h("flyerInternalRunName", String.valueOf(weeklyAdPublication.getFlyerRunId()));
        return Unit.f142422a;
    }

    private final void R(String action) {
        this.analyticsEngine.h(C14476c.a(action), new Function1() { // from class: Ps.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.S((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("weekly ad hybrid");
        track.v("weekly ad hybrid");
        return Unit.f142422a;
    }

    private final void onLoadingStates(List<? extends Oj.a> loadingStates) {
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            List<? extends Oj.a> list = loadingStates;
            if (interfaceC17140B.e(value, ViewState.d(value, null, null, 0, false, null, false, list, 63, null))) {
                return;
            } else {
                loadingStates = list;
            }
        }
    }

    public final InterfaceC17144F<h> D() {
        return this.effectsFlow;
    }

    public final InterfaceC17144F<Companion.a> E() {
        return this.errorLoadingFlow;
    }

    public final InterfaceC17144F<z> F() {
        return this.storeFrontFlow;
    }

    public final P<ViewState> G() {
        return this.viewState;
    }

    public final void H(WeeklyAdPublication weeklyAdPublication) {
        WeeklyAdPublication weeklyAdPublication2;
        Intrinsics.j(weeklyAdPublication, "weeklyAdPublication");
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            weeklyAdPublication2 = weeklyAdPublication;
            if (interfaceC17140B.e(value, ViewState.d(value, null, weeklyAdPublication2, 0, false, null, false, null, 125, null))) {
                break;
            } else {
                weeklyAdPublication = weeklyAdPublication2;
            }
        }
        String sfmlUrl = weeklyAdPublication2.getSfmlUrl();
        if (sfmlUrl != null) {
            I(sfmlUrl);
        }
    }

    public final void J(f action) {
        ViewState value;
        ViewState value2;
        ViewState value3;
        ViewState viewState;
        ViewState value4;
        Intrinsics.j(action, "action");
        if (action instanceof f.FlyerClicked) {
            K(((f.FlyerClicked) action).getItemId());
            return;
        }
        if (action instanceof f.HybridListItemClicked) {
            WeeklyAdItem weeklyAdItem = ((f.HybridListItemClicked) action).getWeeklyAdItem();
            if (weeklyAdItem != null) {
                P(weeklyAdItem, C14476c.a("event: list view ad block"), C14476c.g("weekly ad hybrid"));
                C16648k.d(d0.a(this), null, null, new j(weeklyAdItem, null), 3, null);
                return;
            }
            return;
        }
        if (Intrinsics.e(action, f.d.f29256a)) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value4 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value4, ViewState.d(value4, null, null, r2.getCurrentPage() - 1, false, null, false, null, 123, null)));
            R("event: weekly ad hybrid: previous page");
            return;
        }
        if (Intrinsics.e(action, f.C0680f.f29258a)) {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._viewState;
            do {
                value3 = interfaceC17140B2.getValue();
                viewState = value3;
            } while (!interfaceC17140B2.e(value3, ViewState.d(viewState, null, null, viewState.getCurrentPage() + 1, false, null, false, null, 123, null)));
            R("event: weekly ad hybrid: next page");
            return;
        }
        if (action instanceof f.PagerSwipe) {
            InterfaceC17140B<ViewState> interfaceC17140B3 = this._viewState;
            do {
                value2 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value2, ViewState.d(value2, null, null, ((f.PagerSwipe) action).getPageIndex() - 1, false, null, false, null, 123, null)));
        } else {
            if (!(action instanceof f.BottomSheetScrollStateChange)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<ViewState> interfaceC17140B4 = this._viewState;
            do {
                value = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value, ViewState.d(value, null, null, 0, false, null, ((f.BottomSheetScrollStateChange) action).getScrollStateOrdinal() != 0, null, 95, null)));
        }
    }

    @Override // Ta.a.b
    public void g(Exception p02) {
        this.loadingStateManager.b(new a.Failed("WeeklyAdView SFML LoadingState", null, 2, null));
    }

    @Override // Ta.a.b
    public void k(z storeFront) {
        Intrinsics.j(storeFront, "storeFront");
        C16648k.d(d0.a(this), null, null, new p(storeFront, null), 3, null);
        this.loadingStateManager.b(new a.NotLoading("WeeklyAdView SFML LoadingState"));
        C16648k.d(d0.a(this), null, null, new q(null), 3, null);
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Object next;
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        ViewState value = this.viewState.getValue();
        Iterator<T> it = value.n().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.e(((Oj.a) next).getKey(), "WeeklyAdView SFML LoadingState")) {
                    break;
                }
            }
        }
        if (next instanceof a.Failed) {
            String sfmlUrl = value.getWeeklyAdPublication().getSfmlUrl();
            if (sfmlUrl != null) {
                I(sfmlUrl);
                return;
            }
            return;
        }
        if (value.getHasFlyerItems()) {
            C16648k.d(d0.a(this), null, null, new C0681o(null), 3, null);
            O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object o(o oVar, List list, Continuation continuation) {
        oVar.onLoadingStates(list);
        return Unit.f142422a;
    }
}
