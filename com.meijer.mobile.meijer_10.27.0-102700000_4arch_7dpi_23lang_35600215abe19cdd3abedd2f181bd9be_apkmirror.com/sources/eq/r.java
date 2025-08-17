package eq;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import hq.ShopAndScanItemDecorator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.C15340B;
import l0.C15342b;
import l0.InterfaceC15343c;
import pq.C16352d;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\u001aÃ\u0003\u0010$\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u00142%\u0010\u0019\u001a!\u0012\u0017\u0012\u00150\u000bj\u0002`\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2%\u0010\u001c\u001a!\u0012\u0017\u0012\u00150\u000bj\u0002`\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u00142>\u0010 \u001a:\u0012\u0017\u0012\u00150\u001dj\u0002`\u001e¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001f\u0012\u0017\u0012\u00150\u000bj\u0002`\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\r2+\u0010!\u001a'\u0012\u0017\u0012\u00150\u000bj\u0002`\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\r2%\u0010\"\u001a!\u0012\u0017\u0012\u00150\u000bj\u0002`\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u00142%\u0010#\u001a!\u0012\u0017\u0012\u00150\u000bj\u0002`\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0001¢\u0006\u0004\b$\u0010%¨\u0006'²\u0006\f\u0010&\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lhq/f;", "items", "", "topOffset", "firstVisibleIndex", "firstVisibleItemScrollOffset", "previousItemCount", "", "quantityStepperSelected", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "offset", "", "onSaveScrollPosition", "Lkotlin/Function1;", "listSize", "onSavePreviousItemCount", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "localId", "onFocusQuantityStepper", "Lkotlin/Function0;", "onUnfocusedQuantityStepper", "onDismissRestriction", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "couponId", "onCouponAction", "onUpdateItemQuantity", "onRemoveItem", "onSyncItem", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;IIIILjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "currentItem", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.component.CartListComponentKt$CartListComponent$1$1", f = "CartListComponent.kt", l = {57}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f129706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f129707b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ShopAndScanItemDecorator> f129708c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C15339A f129709d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, List<ShopAndScanItemDecorator> list, C15339A c15339a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f129707b = i10;
            this.f129708c = list;
            this.f129709d = c15339a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f129707b, this.f129708c, this.f129709d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f129706a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f129707b < this.f129708c.size()) {
                    C15339A c15339a = this.f129709d;
                    this.f129706a = 1;
                    if (c15339a.I(0, 0, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f129710a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super String, Unit> function1) {
            this.f129710a = function1;
        }

        public final void a(String localId) {
            Intrinsics.j(localId, "localId");
            this.f129710a.invoke(localId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f129711a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super String, Unit> function1) {
            this.f129711a = function1;
        }

        public final void a(String localId) {
            Intrinsics.j(localId, "localId");
            this.f129711a.invoke(localId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Long, String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Long, String, Unit> f129712a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super Long, ? super String, Unit> function2) {
            this.f129712a = function2;
        }

        public final void a(long j10, String localId) {
            Intrinsics.j(localId, "localId");
            this.f129712a.invoke(Long.valueOf(j10), localId);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Long l10, String str) {
            a(l10.longValue(), str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<String, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<String, Integer, Unit> f129713a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super String, ? super Integer, Unit> function2) {
            this.f129713a = function2;
        }

        public final void a(String localId, int i10) {
            Intrinsics.j(localId, "localId");
            this.f129713a.invoke(localId, Integer.valueOf(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f129714a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super String, Unit> function1) {
            this.f129714a = function1;
        }

        public final void a(String localId) {
            Intrinsics.j(localId, "localId");
            this.f129714a.invoke(localId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f129715a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super String, Unit> function1) {
            this.f129715a = function1;
        }

        public final void a(String localId) {
            Intrinsics.j(localId, "localId");
            this.f129715a.invoke(localId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final h f129716f = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ShopAndScanItemDecorator shopAndScanItemDecorator) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f129717f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f129718g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function1 function1, List list) {
            super(1);
            this.f129717f = function1;
            this.f129718g = list;
        }

        public final Object a(int i10) {
            return this.f129717f.invoke(this.f129718g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f129719f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f129720g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function1 function1, List list) {
            super(1);
            this.f129719f = function1;
            this.f129720g = list;
        }

        public final Object a(int i10) {
            return this.f129719f.invoke(this.f129720g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class k extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f129721f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129722g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f129723h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f129724i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0 f129725j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f129726k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2 f129727l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2 f129728m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f129729n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f129730o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list, LocalThemeScope localThemeScope, String str, Function1 function1, Function0 function0, Function1 function12, Function2 function2, Function2 function22, Function1 function13, Function1 function14) {
            super(4);
            this.f129721f = list;
            this.f129722g = localThemeScope;
            this.f129723h = str;
            this.f129724i = function1;
            this.f129725j = function0;
            this.f129726k = function12;
            this.f129727l = function2;
            this.f129728m = function22;
            this.f129729n = function13;
            this.f129730o = function14;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            ShopAndScanItemDecorator shopAndScanItemDecorator = (ShopAndScanItemDecorator) this.f129721f.get(i10);
            composer.startReplaceGroup(1636718800);
            z1 z1VarP = o1.p(shopAndScanItemDecorator, composer, 0);
            LocalThemeScope localThemeScope = this.f129722g;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            ShopAndScanItemDecorator shopAndScanItemDecoratorH = r.h(z1VarP);
            String str = this.f129723h;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f129724i);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f129724i);
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            Function0 function0 = this.f129725j;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f129726k);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new c(this.f129726k);
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV3 = composer.V(this.f129727l);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new d(this.f129727l);
                composer.t(objB3);
            }
            Function2 function2 = (Function2) objB3;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV4 = composer.V(this.f129728m);
            Object objB4 = composer.B();
            if (zV4 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new e(this.f129728m);
                composer.t(objB4);
            }
            Function2 function22 = (Function2) objB4;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV5 = composer.V(this.f129729n);
            Object objB5 = composer.B();
            if (zV5 || objB5 == Composer.INSTANCE.a()) {
                objB5 = new f(this.f129729n);
                composer.t(objB5);
            }
            Function1 function13 = (Function1) objB5;
            composer.P();
            composer.startReplaceGroup(5004770);
            boolean zV6 = composer.V(this.f129730o);
            Object objB6 = composer.B();
            if (zV6 || objB6 == Composer.INSTANCE.a()) {
                objB6 = new g(this.f129730o);
                composer.t(objB6);
            }
            composer.P();
            int i13 = LocalThemeScope.f15770g;
            C16352d.d(localThemeScope, modifierH, shopAndScanItemDecoratorH, str, function1, function0, function12, function2, function22, function13, (Function1) objB6, composer, i13 | 48, 0);
            X.b(this.f129722g, shopAndScanItemDecorator.q(), shopAndScanItemDecorator.o(), shopAndScanItemDecorator.getIsLoading(), composer, i13);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"eq/r$l", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class l implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f129731a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f129732b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f129733c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f129734d;

        public l(Function2 function2, C15339A c15339a, Function1 function1, List list) {
            this.f129731a = function2;
            this.f129732b = c15339a;
            this.f129733c = function1;
            this.f129734d = list;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f129731a.invoke(Integer.valueOf(this.f129732b.s()), Integer.valueOf(this.f129732b.t()));
            this.f129733c.invoke(Integer.valueOf(this.f129734d.size()));
        }
    }

    public static final void f(final LocalThemeScope localThemeScope, final Modifier modifier, final List<ShopAndScanItemDecorator> items, final int i10, final int i11, final int i12, final int i13, final String quantityStepperSelected, final Function2<? super Integer, ? super Integer, Unit> onSaveScrollPosition, final Function1<? super Integer, Unit> onSavePreviousItemCount, final Function1<? super String, Unit> onFocusQuantityStepper, final Function0<Unit> onUnfocusedQuantityStepper, final Function1<? super String, Unit> onDismissRestriction, final Function2<? super Long, ? super String, Unit> onCouponAction, final Function2<? super String, ? super Integer, Unit> onUpdateItemQuantity, final Function1<? super String, Unit> onRemoveItem, final Function1<? super String, Unit> onSyncItem, Composer composer, final int i14, final int i15) {
        int i16;
        int i17;
        C15339A c15339a;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(items, "items");
        Intrinsics.j(quantityStepperSelected, "quantityStepperSelected");
        Intrinsics.j(onSaveScrollPosition, "onSaveScrollPosition");
        Intrinsics.j(onSavePreviousItemCount, "onSavePreviousItemCount");
        Intrinsics.j(onFocusQuantityStepper, "onFocusQuantityStepper");
        Intrinsics.j(onUnfocusedQuantityStepper, "onUnfocusedQuantityStepper");
        Intrinsics.j(onDismissRestriction, "onDismissRestriction");
        Intrinsics.j(onCouponAction, "onCouponAction");
        Intrinsics.j(onUpdateItemQuantity, "onUpdateItemQuantity");
        Intrinsics.j(onRemoveItem, "onRemoveItem");
        Intrinsics.j(onSyncItem, "onSyncItem");
        Composer composerStartRestartGroup = composer.startRestartGroup(211154539);
        if ((i14 & 6) == 0) {
            i16 = i14 | ((i14 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= composerStartRestartGroup.D(items) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= composerStartRestartGroup.d(i10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= composerStartRestartGroup.d(i11) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= composerStartRestartGroup.d(i12) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= composerStartRestartGroup.d(i13) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= composerStartRestartGroup.V(quantityStepperSelected) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= composerStartRestartGroup.D(onSaveScrollPosition) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= composerStartRestartGroup.D(onSavePreviousItemCount) ? 536870912 : 268435456;
        }
        int i18 = i16;
        if ((i15 & 6) == 0) {
            i17 = i15 | (composerStartRestartGroup.D(onFocusQuantityStepper) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= composerStartRestartGroup.D(onUnfocusedQuantityStepper) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= composerStartRestartGroup.D(onDismissRestriction) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= composerStartRestartGroup.D(onCouponAction) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= composerStartRestartGroup.D(onUpdateItemQuantity) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= composerStartRestartGroup.D(onRemoveItem) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i17 |= composerStartRestartGroup.D(onSyncItem) ? 1048576 : 524288;
        }
        int i19 = i17;
        if ((i18 & 306783379) == 306783378 && (599187 & i19) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(211154539, i18, i19, "com.meijer.mobile.shopandscan.presentation.component.CartListComponent (CartListComponent.kt:47)");
            }
            final C15339A c15339aB = C15340B.b(i11, i12, composerStartRestartGroup, (i18 >> 12) & 126, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((3670016 & i18) == 1048576) | composerStartRestartGroup.D(items) | composerStartRestartGroup.V(c15339aB);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(i13, items, c15339aB, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i20 = (i18 >> 6) & 14;
            androidx.compose.runtime.J.g(items, (Function2) objB, composerStartRestartGroup, i20);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zV = ((234881024 & i18) == 67108864) | composerStartRestartGroup.V(c15339aB) | ((1879048192 & i18) == 536870912) | composerStartRestartGroup.D(items);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: eq.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.k(onSaveScrollPosition, c15339aB, onSavePreviousItemCount, items, (androidx.compose.runtime.F) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.c(items, (Function1) objB2, composerStartRestartGroup, i20);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i18 & 7168) == 2048;
            Object objB3 = composerStartRestartGroup.B();
            if (z10 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: eq.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.l(i10, (H1.d) obj);
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            Modifier modifierA = androidx.compose.foundation.layout.A.a(modifier, (Function1) objB3);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD2 = composerStartRestartGroup.D(items) | ((i18 & 14) == 4 || ((i18 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((29360128 & i18) == 8388608) | ((i19 & 14) == 4) | ((i19 & 112) == 32) | ((i19 & 896) == 256) | ((i19 & 7168) == 2048) | ((57344 & i19) == 16384) | ((458752 & i19) == 131072) | ((i19 & 3670016) == 1048576);
            Object objB4 = composerStartRestartGroup.B();
            if (zD2 || objB4 == Composer.INSTANCE.a()) {
                c15339a = c15339aB;
                Function1 function1 = new Function1() { // from class: eq.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.g(items, localThemeScope, quantityStepperSelected, onFocusQuantityStepper, onUnfocusedQuantityStepper, onDismissRestriction, onCouponAction, onUpdateItemQuantity, onRemoveItem, onSyncItem, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(function1);
                objB4 = function1;
            } else {
                c15339a = c15339aB;
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            C15342b.a(modifierA, c15339a, null, false, null, null, null, false, null, (Function1) objB4, composer2, 0, 508);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: eq.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.j(localThemeScope, modifier, items, i10, i11, i12, i13, quantityStepperSelected, onSaveScrollPosition, onSavePreviousItemCount, onFocusQuantityStepper, onUnfocusedQuantityStepper, onDismissRestriction, onCouponAction, onUpdateItemQuantity, onRemoveItem, onSyncItem, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(List list, LocalThemeScope localThemeScope, String str, Function1 function1, Function0 function0, Function1 function12, Function2 function2, Function2 function22, Function1 function13, Function1 function14, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), new i(new Function1() { // from class: eq.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.i((ShopAndScanItemDecorator) obj);
            }
        }, list), new j(h.f129716f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new k(list, localThemeScope, str, function1, function0, function12, function2, function22, function13, function14)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(ShopAndScanItemDecorator item) {
        Intrinsics.j(item, "item");
        return item.getLocalId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, List list, int i10, int i11, int i12, int i13, String str, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Function1 function13, Function2 function22, Function2 function23, Function1 function14, Function1 function15, int i14, int i15, Composer composer, int i16) {
        f(localThemeScope, modifier, list, i10, i11, i12, i13, str, function2, function1, function12, function0, function13, function22, function23, function14, function15, composer, J0.a(i14 | 1), J0.a(i15));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E k(Function2 function2, C15339A c15339a, Function1 function1, List list, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        return new l(function2, c15339a, function1, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H1.n l(int i10, H1.d offset) {
        Intrinsics.j(offset, "$this$offset");
        return H1.n.c(H1.n.f((i10 & 4294967295L) | (0 << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShopAndScanItemDecorator h(z1<ShopAndScanItemDecorator> z1Var) {
        return z1Var.getValue();
    }
}
