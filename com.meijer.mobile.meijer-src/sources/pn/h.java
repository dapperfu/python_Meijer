package pn;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import es.AbstractC13866b;
import es.OrderDetailStatusDayDateTimeDecorator;
import es.OrderDetailStatusDecorator;
import es.OrderHeaderDecorator;
import es.OrderSubstitutionsDetailBannerDecorator;
import hn.OrderDetailAddressDecorator;
import hn.OrderDetailContactNumberDecorator;
import hn.OrderDetailEditOrderDecorator;
import hn.OrderDetailOrderedItemsDecorator;
import hn.OrderDetailPaymentDecorator;
import hn.OrderDetailShopperInfoDecorator;
import hn.OrderDetailSummaryDecorator;
import hn.OrderDetailWhatsNextDecorator;
import in.C14784B;
import in.C14792J;
import in.C14800S;
import in.C14812e;
import in.C14816i;
import in.C14827t;
import in.OrderDetailCartItem;
import j0.C14890K;
import j0.C14903g;
import java.util.List;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.InterfaceC15433c;
import l0.w;
import sn.L;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aQ\u0010\u000e\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Ll0/A;", "state", "", "Les/b;", "decorators", "Lkotlin/Function1;", "Lsn/L$f;", "", "onAction", "Lsn/L$h;", "viewState", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Ll0/A;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lsn/L$h;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156807a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super L.f, Unit> function1) {
            this.f156807a = function1;
        }

        public final void a() {
            this.f156807a.invoke(L.f.x.f160943a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156808a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super L.f, Unit> function1) {
            this.f156808a = function1;
        }

        public final void a() {
            this.f156808a.invoke(L.f.p.f160933a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156809a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super L.f, Unit> function1) {
            this.f156809a = function1;
        }

        public final void a() {
            this.f156809a.invoke(L.f.s.f160936a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156810a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super L.f, Unit> function1) {
            this.f156810a = function1;
        }

        public final void a() {
            this.f156810a.invoke(L.f.u.f160938a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156811a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super L.f, Unit> function1) {
            this.f156811a = function1;
        }

        public final void a() {
            this.f156811a.invoke(L.f.t.f160937a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156812a;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super L.f, Unit> function1) {
            this.f156812a = function1;
        }

        public final void a() {
            this.f156812a.invoke(L.f.r.f160935a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156813a;

        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super L.f, Unit> function1) {
            this.f156813a = function1;
        }

        public final void a() {
            this.f156813a.invoke(L.f.b.f160917a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pn.h$h, reason: collision with other inner class name */
    static final class C2429h implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC13866b f156814a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156815b;

        /* JADX WARN: Multi-variable type inference failed */
        C2429h(AbstractC13866b abstractC13866b, Function1<? super L.f, Unit> function1) {
            this.f156814a = abstractC13866b;
            this.f156815b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (((OrderDetailStatusDecorator) this.f156814a).getFlyBuyOrderId() != null) {
                this.f156815b.invoke(new L.f.CustomerOnTheWay(null, 1, 0 == true ? 1 : 0));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC13866b f156816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156817b;

        /* JADX WARN: Multi-variable type inference failed */
        i(AbstractC13866b abstractC13866b, Function1<? super L.f, Unit> function1) {
            this.f156816a = abstractC13866b;
            this.f156817b = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (((OrderDetailStatusDecorator) this.f156816a).getFlyBuyOrderId() != null) {
                this.f156817b.invoke(new L.f.CustomerIsHere(null, 1, 0 == true ? 1 : 0));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC13866b f156818a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156819b;

        /* JADX WARN: Multi-variable type inference failed */
        j(AbstractC13866b abstractC13866b, Function1<? super L.f, Unit> function1) {
            this.f156818a = abstractC13866b;
            this.f156819b = function1;
        }

        public final void a() {
            if (((OrderDetailStatusDecorator) this.f156818a).getFlyBuyOrderId() != null) {
                this.f156819b.invoke(L.f.n.f160931a);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156820a;

        /* JADX WARN: Multi-variable type inference failed */
        k(Function1<? super L.f, Unit> function1) {
            this.f156820a = function1;
        }

        public final void a() {
            this.f156820a.invoke(L.f.o.f160932a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC13866b f156822b;

        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super L.f, Unit> function1, AbstractC13866b abstractC13866b) {
            this.f156821a = function1;
            this.f156822b = abstractC13866b;
        }

        public final void a() {
            this.f156821a.invoke(new L.f.ShowStoreInfo(((OrderDetailAddressDecorator) this.f156822b).getStoreId()));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156823a;

        /* JADX WARN: Multi-variable type inference failed */
        m(Function1<? super L.f, Unit> function1) {
            this.f156823a = function1;
        }

        public final void a() {
            this.f156823a.invoke(L.f.y.f160944a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<L.f, Unit> f156824a;

        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super L.f, Unit> function1) {
            this.f156824a = function1;
        }

        public final void a() {
            this.f156824a.invoke(L.f.i.f160924a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f156825f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f156826g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function1 function1, List list) {
            super(1);
            this.f156825f = function1;
            this.f156826g = list;
        }

        public final Object a(int i10) {
            return this.f156825f.invoke(this.f156826g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class p extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f156827f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f156828g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156829h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ L.OrderDetailsViewState f156830i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List list, Function1 function1, LocalThemeScope localThemeScope, L.OrderDetailsViewState hVar) {
            super(4);
            this.f156827f = list;
            this.f156828g = function1;
            this.f156829h = localThemeScope;
            this.f156830i = hVar;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            List<EntryDecorator> listC;
            Composer composer2 = composer;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer2.V(interfaceC15433c) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer2.d(i10) ? 32 : 16;
            }
            if (!composer2.p((i12 & 147) != 146, i12 & 1)) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            AbstractC13866b abstractC13866b = (AbstractC13866b) this.f156827f.get(i10);
            composer2.startReplaceGroup(61811826);
            if (abstractC13866b instanceof OrderDetailStatusDecorator) {
                composer2.startReplaceGroup(61724343);
                OrderDetailStatusDecorator c13868d = (OrderDetailStatusDecorator) abstractC13866b;
                this.f156828g.invoke(new L.f.UpdateProgressIndicator(Float.valueOf(c13868d.getOrderProgress()), null, c13868d.getProgressBarResId(), 2, null));
                OrderSubstitutionsDetailBannerDecorator orderSubstitutionsDetailBannerDecoratorC = c13868d.getDecoratorOrderSubstitutionBannerDecorator();
                LocalThemeScope localThemeScope = this.f156829h;
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(this.f156828g);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(this.f156828g);
                    composer2.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(abstractC13866b) | composer2.V(this.f156828g);
                Object objB2 = composer2.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C2429h(abstractC13866b, this.f156828g);
                    composer2.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD2 = composer2.D(abstractC13866b) | composer2.V(this.f156828g);
                Object objB3 = composer2.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new i(abstractC13866b, this.f156828g);
                    composer2.t(objB3);
                }
                Function0 function03 = (Function0) objB3;
                composer2.P();
                composer2.startReplaceGroup(-1633490746);
                boolean zD3 = composer2.D(abstractC13866b) | composer2.V(this.f156828g);
                Object objB4 = composer2.B();
                if (zD3 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new j(abstractC13866b, this.f156828g);
                    composer2.t(objB4);
                }
                Function0 function04 = (Function0) objB4;
                composer2.P();
                composer2.startReplaceGroup(5004770);
                boolean zV2 = composer2.V(this.f156828g);
                Object objB5 = composer2.B();
                if (zV2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new k(this.f156828g);
                    composer2.t(objB5);
                }
                composer2.P();
                C14827t.e(localThemeScope, null, c13868d, orderSubstitutionsDetailBannerDecoratorC, function0, function02, function03, function04, (Function0) objB5, this.f156830i, composer, LocalThemeScope.f17314g | (OrderDetailStatusDecorator.f130677z << 6) | (OrderSubstitutionsDetailBannerDecorator.f130656e << 9), 1);
                composer2 = composer;
                C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                composer2.P();
            } else if (abstractC13866b instanceof OrderHeaderDecorator) {
                composer2.startReplaceGroup(63387679);
                LocalThemeScope localThemeScope2 = this.f156829h;
                OrderHeaderDecorator orderHeaderDecorator = (OrderHeaderDecorator) abstractC13866b;
                AbstractC6392a title = orderHeaderDecorator.getTitle();
                AbstractC6392a subTitle = orderHeaderDecorator.getSubTitle();
                int i13 = LocalThemeScope.f17314g;
                int i14 = AbstractC6392a.f60445b;
                C14816i.b(localThemeScope2, title, subTitle, composer2, (i14 << 6) | i13 | (i14 << 3));
                C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                composer2.P();
            } else if (abstractC13866b instanceof OrderDetailStatusDayDateTimeDecorator) {
                composer2.startReplaceGroup(63703662);
                C14800S.k(this.f156829h, null, (OrderDetailStatusDayDateTimeDecorator) abstractC13866b, composer, LocalThemeScope.f17314g | (OrderDetailStatusDayDateTimeDecorator.f130670h << 6), 1);
                composer2 = composer;
                C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                composer2.P();
            } else if (abstractC13866b instanceof OrderDetailAddressDecorator) {
                composer2.startReplaceGroup(63907053);
                LocalThemeScope localThemeScope3 = this.f156829h;
                OrderDetailAddressDecorator orderDetailAddressDecorator = (OrderDetailAddressDecorator) abstractC13866b;
                composer2.startReplaceGroup(-1633490746);
                boolean zV3 = composer2.V(this.f156828g) | composer2.D(abstractC13866b);
                Object objB6 = composer2.B();
                if (zV3 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new l(this.f156828g, abstractC13866b);
                    composer2.t(objB6);
                }
                composer2.P();
                C14800S.g(localThemeScope3, null, orderDetailAddressDecorator, (Function0) objB6, composer, ((AbstractC6392a.f60445b | AbstractC13866b.f130668a) << 6) | LocalThemeScope.f17314g, 1);
                composer2 = composer;
                C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                composer2.P();
            } else {
                OrderDetailCartItem orderDetailCartItem = null;
                if (abstractC13866b instanceof OrderDetailOrderedItemsDecorator) {
                    composer2.startReplaceGroup(-829196788);
                    OrderDetailOrderedItemsDecorator c14549h = (OrderDetailOrderedItemsDecorator) abstractC13866b;
                    CartItemsDecorator c12122uC = c14549h.getOrder().getCartItems();
                    if (c12122uC != null && (listC = c12122uC.c()) != null) {
                        orderDetailCartItem = new OrderDetailCartItem(listC, c14549h.getOrder().getCartItems().d(), c14549h.getOrder().getCartItems().getExtraItemCount(), c14549h.getOrder().getCartItems().getError());
                    }
                    if (orderDetailCartItem != null) {
                        LocalThemeScope localThemeScope4 = this.f156829h;
                        int iA = c14549h.getStatus().getIcon();
                        int iB = c14549h.getStatus().getText();
                        AbstractC6392a abstractC6392aA = c14549h.getFormattedTotalItems();
                        composer2.startReplaceGroup(5004770);
                        boolean zV4 = composer2.V(this.f156828g);
                        Object objB7 = composer2.B();
                        if (zV4 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new m(this.f156828g);
                            composer2.t(objB7);
                        }
                        composer2.P();
                        C14800S.o(localThemeScope4, null, iA, iB, abstractC6392aA, orderDetailCartItem, (Function0) objB7, composer, (AbstractC6392a.f60445b << 12) | LocalThemeScope.f17314g, 1);
                        composer2 = composer;
                        C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                        Unit unit = Unit.f143329a;
                    }
                    composer2.P();
                } else if (abstractC13866b instanceof OrderDetailContactNumberDecorator) {
                    composer2.startReplaceGroup(65273657);
                    LocalThemeScope localThemeScope5 = this.f156829h;
                    OrderDetailContactNumberDecorator orderDetailContactNumberDecorator = (OrderDetailContactNumberDecorator) abstractC13866b;
                    composer2.startReplaceGroup(5004770);
                    boolean zV5 = composer2.V(this.f156828g);
                    Object objB8 = composer2.B();
                    if (zV5 || objB8 == Composer.INSTANCE.a()) {
                        objB8 = new n(this.f156828g);
                        composer2.t(objB8);
                    }
                    composer2.P();
                    C14800S.i(localThemeScope5, null, orderDetailContactNumberDecorator, (Function0) objB8, composer, ((AbstractC6392a.f60445b | AbstractC13866b.f130668a) << 6) | LocalThemeScope.f17314g, 1);
                    composer2 = composer;
                    C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                    composer2.P();
                } else if (abstractC13866b instanceof OrderDetailShopperInfoDecorator) {
                    composer2.startReplaceGroup(65598320);
                    OrderDetailShopperInfoDecorator c14553l = (OrderDetailShopperInfoDecorator) abstractC13866b;
                    if (c14553l.getOrderStatus() == hj.f.f135696m || c14553l.getOrderStatus() == hj.f.f135697n) {
                        LocalThemeScope localThemeScope6 = this.f156829h;
                        composer2.startReplaceGroup(5004770);
                        boolean zV6 = composer2.V(this.f156828g);
                        Object objB9 = composer2.B();
                        if (zV6 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new b(this.f156828g);
                            composer2.t(objB9);
                        }
                        composer2.P();
                        C14800S.m(localThemeScope6, null, c14553l, (Function0) objB9, composer, ((AbstractC6392a.f60445b | AbstractC13866b.f130668a) << 6) | LocalThemeScope.f17314g, 1);
                        composer2 = composer;
                        C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                    }
                    composer2.P();
                } else if (abstractC13866b instanceof OrderDetailWhatsNextDecorator) {
                    composer2.startReplaceGroup(66095653);
                    OrderDetailWhatsNextDecorator orderDetailWhatsNextDecorator = (OrderDetailWhatsNextDecorator) abstractC13866b;
                    if (orderDetailWhatsNextDecorator.getVisibility()) {
                        C14792J.j(this.f156829h, orderDetailWhatsNextDecorator, composer2, LocalThemeScope.f17314g);
                        C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                    }
                    composer2.P();
                } else if (abstractC13866b instanceof OrderDetailPaymentDecorator) {
                    composer2.startReplaceGroup(66337329);
                    LocalThemeScope localThemeScope7 = this.f156829h;
                    OrderDetailPaymentDecorator c14551j = (OrderDetailPaymentDecorator) abstractC13866b;
                    AbstractC6392a abstractC6392aH = c14551j.getTitle();
                    int i15 = LocalThemeScope.f17314g;
                    int i16 = AbstractC6392a.f60445b;
                    C14816i.b(localThemeScope7, abstractC6392aH, null, composer2, i15 | 384 | (i16 << 3));
                    C14812e.b(this.f156829h, null, c14551j, composer, i15 | ((AbstractC13866b.f130668a | i16) << 6), 1);
                    composer2 = composer;
                    C17983Z.a(null, this.f156829h.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer2, 0, 13);
                    composer2.P();
                } else if (abstractC13866b instanceof OrderDetailSummaryDecorator) {
                    composer2.startReplaceGroup(66664596);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer2, 0);
                    int iA2 = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR = composer2.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer2, companion);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer2.k() == null) {
                        C5859f.c();
                    }
                    composer2.F();
                    if (composer2.getInserting()) {
                        composer2.I(function0A);
                    } else {
                        composer2.s();
                    }
                    Composer composerA = D1.a(composer2);
                    D1.c(composerA, measurePolicyA, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA2))) {
                        composerA.t(Integer.valueOf(iA2));
                        composerA.n(Integer.valueOf(iA2), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C14903g c14903g = C14903g.f139698a;
                    LocalThemeScope localThemeScope8 = this.f156829h;
                    OrderDetailSummaryDecorator orderDetailSummaryDecorator = (OrderDetailSummaryDecorator) abstractC13866b;
                    AbstractC6392a title2 = orderDetailSummaryDecorator.getTitle();
                    AbstractC6392a subtitle = orderDetailSummaryDecorator.getSubtitle();
                    int i17 = LocalThemeScope.f17314g;
                    int i18 = AbstractC6392a.f60445b;
                    C14816i.b(localThemeScope8, title2, subtitle, composer2, (i18 << 6) | (i18 << 3) | i17);
                    LocalThemeScope localThemeScope9 = this.f156829h;
                    composer2.startReplaceGroup(5004770);
                    boolean zV7 = composer2.V(this.f156828g);
                    Object objB10 = composer2.B();
                    if (zV7 || objB10 == Composer.INSTANCE.a()) {
                        objB10 = new c(this.f156828g);
                        composer2.t(objB10);
                    }
                    Function0 function05 = (Function0) objB10;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zV8 = composer2.V(this.f156828g);
                    Object objB11 = composer2.B();
                    if (zV8 || objB11 == Composer.INSTANCE.a()) {
                        objB11 = new d(this.f156828g);
                        composer2.t(objB11);
                    }
                    Function0 function06 = (Function0) objB11;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zV9 = composer2.V(this.f156828g);
                    Object objB12 = composer2.B();
                    if (zV9 || objB12 == Composer.INSTANCE.a()) {
                        objB12 = new e(this.f156828g);
                        composer2.t(objB12);
                    }
                    Function0 function07 = (Function0) objB12;
                    composer2.P();
                    composer2.startReplaceGroup(5004770);
                    boolean zV10 = composer2.V(this.f156828g);
                    Object objB13 = composer2.B();
                    if (zV10 || objB13 == Composer.INSTANCE.a()) {
                        objB13 = new f(this.f156828g);
                        composer2.t(objB13);
                    }
                    composer2.P();
                    C14784B.p(localThemeScope9, null, orderDetailSummaryDecorator, true, function05, function06, function07, (Function0) objB13, composer, i17 | 3072, 1);
                    LocalThemeScope localThemeScope10 = this.f156829h;
                    composer.startReplaceGroup(5004770);
                    boolean zV11 = composer.V(this.f156828g);
                    Object objB14 = composer.B();
                    if (zV11 || objB14 == Composer.INSTANCE.a()) {
                        objB14 = new g(this.f156828g);
                        composer.t(objB14);
                    }
                    composer.P();
                    C14784B.n(localThemeScope10, null, orderDetailSummaryDecorator, (Function0) objB14, composer, i17, 1);
                    composer2 = composer;
                    composer2.v();
                    composer2.P();
                } else if (abstractC13866b instanceof OrderDetailEditOrderDecorator) {
                    composer2.startReplaceGroup(68059813);
                    this.f156828g.invoke(new L.f.IsOrderEditable(((OrderDetailEditOrderDecorator) abstractC13866b).getIsOrderEditable()));
                    C14890K.a(J.v(Modifier.INSTANCE, H1.h.p(0)), composer2, 6);
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(68225539);
                    composer2.P();
                }
            }
            composer2.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, l0.C15429A r23, final java.util.List<? extends es.AbstractC13866b> r24, final kotlin.jvm.functions.Function1<? super sn.L.f, kotlin.Unit> r25, final sn.L.OrderDetailsViewState r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.h.d(Ki.M, androidx.compose.ui.Modifier, l0.A, java.util.List, kotlin.jvm.functions.Function1, sn.L$h, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(List list, Function1 function1, LocalThemeScope localThemeScope, L.OrderDetailsViewState hVar, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new o(new Function1() { // from class: pn.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.f((AbstractC13866b) obj);
            }
        }, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new p(list, function1, localThemeScope, hVar)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(AbstractC13866b it) {
        Intrinsics.j(it, "it");
        return Reflection.b(it.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, C15429A c15429a, List list, Function1 function1, L.OrderDetailsViewState hVar, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, c15429a, list, function1, hVar, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
