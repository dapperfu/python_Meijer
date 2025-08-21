package Xq;

import Jr.IndicatorIcon;
import Ki.LocalThemeScope;
import Kr.PermissionRequestDecorator;
import P0.e;
import Xq.o;
import Yq.StoreMapItem;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.List;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.InterfaceC15433c;
import oi.C16208z0;
import oi.P0;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import yr.C18370z;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aÅ\u0001\u0010\u001b\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172#\u0010\u001a\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00150\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a³\u0001\u0010\u001e\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172#\u0010\u001a\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00150\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a`\u0010 \u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0011H\u0007¢\u0006\u0004\b \u0010!\u001aR\u0010%\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\t2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00150\u0011H\u0007¢\u0006\u0004\b%\u0010&\u001aZ\u0010'\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00150\u0011H\u0007¢\u0006\u0004\b'\u0010(¨\u0006.²\u0006\u000e\u0010*\u001a\u00020)8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lbk/a;", "resultLabel", "", "LYq/d;", "stores", "currentStores", "", "isPickUpMode", "Ll0/A;", "storeListState", "isNewAddressQualifier", "LKr/b;", "LKr/a;", "permissionRequest", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "storeMapItem", "", "onItemClick", "Lkotlin/Function0;", "onViewMoreButtonClicked", "resolution", "onPermissionRequestClick", "u", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Ljava/util/List;Ljava/util/List;ZLl0/A;ZLKr/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "currentStoreList", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Ll0/A;Ljava/util/List;Ljava/util/List;ZLKr/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Ll0/A;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showMarkerIds", PlaceTypes.STORE, "onClick", "r", "(LKi/M;LYq/d;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "w", "(LKi/M;LYq/d;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "itemsToShow", "", "lastAction", "isNewAddressQualifierUI", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f42564b;

        a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f42563a = localThemeScope;
            this.f42564b = abstractC6392a;
        }

        public final void a(InterfaceC15433c stickyHeader, int i10, Composer composer, int i11) {
            Intrinsics.j(stickyHeader, "$this$stickyHeader");
            if ((i11 & 129) == 128 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1756047767, i11, -1, "com.meijer.mobile.store.ux.compose.LegacyStoreListView.<anonymous>.<anonymous>.<anonymous> (StoreListView.kt:180)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierD = androidx.compose.foundation.b.d(J.h(C18370z.f(companion, "list_title", null, 2, null), 0.0f, 1, null), this.f42563a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f42563a;
            AbstractC6392a abstractC6392a = this.f42564b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            composer.v();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f42565f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(StoreMapItem storeMapItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f42566f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f42567g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f42566f = function1;
            this.f42567g = list;
        }

        public final Object a(int i10) {
            return this.f42566f.invoke(this.f42567g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f42568f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42569g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f42570h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f42571i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1, List list2) {
            super(4);
            this.f42568f = list;
            this.f42569g = localThemeScope;
            this.f42570h = function1;
            this.f42571i = list2;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
            StoreMapItem storeMapItem = (StoreMapItem) this.f42568f.get(i10);
            composer.startReplaceGroup(-1726499981);
            o.r(this.f42569g, storeMapItem, C18370z.f(J.h(Modifier.INSTANCE, 0.0f, 1, null), "store_list_item", null, 2, null), false, this.f42570h, composer, LocalThemeScope.f17314g, 4);
            composer.startReplaceGroup(-194233502);
            if (storeMapItem.getIndex() != CollectionsKt.o(this.f42571i)) {
                C17983Z.a(null, this.f42569g.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            }
            composer.P();
            composer.P();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PermissionRequestDecorator<Kr.a> f42572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Kr.a, Unit> f42574c;

        /* JADX WARN: Multi-variable type inference failed */
        e(PermissionRequestDecorator<? extends Kr.a> permissionRequestDecorator, LocalThemeScope localThemeScope, Function1<? super Kr.a, Unit> function1) {
            this.f42572a = permissionRequestDecorator;
            this.f42573b = localThemeScope;
            this.f42574c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, Kr.a it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f143329a;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(966680657, i10, -1, "com.meijer.mobile.store.ux.compose.NewStoreListView.<anonymous>.<anonymous>.<anonymous> (StoreListView.kt:134)");
            }
            PermissionRequestDecorator<Kr.a> permissionRequestDecorator = this.f42572a;
            if (permissionRequestDecorator != null) {
                LocalThemeScope localThemeScope = this.f42573b;
                final Function1<Kr.a, Unit> function1 = this.f42574c;
                Modifier modifierM = D.m(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function1);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Xq.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return o.e.c(function1, (Kr.a) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Kr.f.b(localThemeScope, permissionRequestDecorator, modifierM, (Function1) objB, composer, LocalThemeScope.f17314g | (PermissionRequestDecorator.f17669e << 3), 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42575a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f42576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<StoreMapItem> f42577c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42578d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f42579e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<StoreMapItem> f42580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f42581b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f42582c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f42583d;

            public final void b(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer.V(AdsColumn) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1909498032, i11, -1, "com.meijer.mobile.store.ux.compose.NewStoreListView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StoreListView.kt:152)");
                }
                if (o.n(this.f42583d) < this.f42580a.size()) {
                    Modifier modifierC = AdsColumn.c(Modifier.INSTANCE, P0.e.INSTANCE.g());
                    C16208z0 c16208z0 = C16208z0.f154285a;
                    String strC = C16338g.c(Vq.c.f40166e0, composer, 0);
                    String strC2 = C16338g.c(Vq.c.f40168f0, composer, 0);
                    LocalThemeScope localThemeScope = this.f42581b;
                    composer.startReplaceGroup(-1633490746);
                    boolean zV = composer.V(this.f42582c);
                    final Function0<Unit> function0 = this.f42582c;
                    final InterfaceC5868j0 interfaceC5868j0 = this.f42583d;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Xq.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return o.f.a.c(function0, interfaceC5868j0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    P0.k(localThemeScope, c16208z0, strC, (Function0) objB, modifierC, strC2, false, 0L, false, composer, LocalThemeScope.f17314g | (C16208z0.f154286b << 3), 224);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(List<StoreMapItem> list, LocalThemeScope localThemeScope, Function0<Unit> function0, InterfaceC5868j0 interfaceC5868j0) {
                this.f42580a = list;
                this.f42581b = localThemeScope;
                this.f42582c = function0;
                this.f42583d = interfaceC5868j0;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                b(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0, InterfaceC5868j0 interfaceC5868j0) {
                o.o(interfaceC5868j0, o.n(interfaceC5868j0) + 5);
                function0.invoke();
                return Unit.f143329a;
            }
        }

        f(LocalThemeScope localThemeScope, Modifier modifier, List<StoreMapItem> list, Function0<Unit> function0, InterfaceC5868j0 interfaceC5868j0) {
            this.f42575a = localThemeScope;
            this.f42576b = modifier;
            this.f42577c = list;
            this.f42578d = function0;
            this.f42579e = interfaceC5868j0;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2138192454, i10, -1, "com.meijer.mobile.store.ux.compose.NewStoreListView.<anonymous>.<anonymous>.<anonymous> (StoreListView.kt:149)");
            }
            C16453n.e(this.f42575a, new q1.Column(D.m(this.f42576b, 0.0f, 0.0f, 0.0f, this.f42575a.getAdsSpacing().getFive().getDp(), 7, null), null, null, 6, null), ComposableLambdaKt.c(1909498032, true, new a(this.f42577c, this.f42575a, this.f42578d, this.f42579e), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f42584f = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(StoreMapItem storeMapItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f42585f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f42586g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, List list) {
            super(1);
            this.f42585f = function1;
            this.f42586g = list;
        }

        public final Object a(int i10) {
            return this.f42585f.invoke(this.f42586g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class i extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f42587f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42588g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f42589h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f42590i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f42591j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List list, LocalThemeScope localThemeScope, boolean z10, Function1 function1, List list2) {
            super(4);
            this.f42587f = list;
            this.f42588g = localThemeScope;
            this.f42589h = z10;
            this.f42590i = function1;
            this.f42591j = list2;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
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
            StoreMapItem storeMapItem = (StoreMapItem) this.f42587f.get(i10);
            composer.startReplaceGroup(-219731500);
            o.w(this.f42588g, storeMapItem, C18370z.f(J.h(Modifier.INSTANCE, 0.0f, 1, null), "store_list_item", null, 2, null), false, this.f42589h, this.f42590i, composer, LocalThemeScope.f17314g, 4);
            composer.startReplaceGroup(-7079278);
            if (storeMapItem.getIndex() != CollectionsKt.o(this.f42591j)) {
                C17983Z.a(null, this.f42588g.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
            }
            composer.P();
            composer.P();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class j implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f42593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ StoreMapItem f42594c;

        j(LocalThemeScope localThemeScope, boolean z10, StoreMapItem storeMapItem) {
            this.f42592a = localThemeScope;
            this.f42593b = z10;
            this.f42594c = storeMapItem;
        }

        public final void a(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            int i11;
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(677387640, i10, -1, "com.meijer.mobile.store.ux.compose.StoreListItem.<anonymous> (StoreListView.kt:224)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f42592a.getAdsSpacing().getFive().getDp());
            boolean z10 = this.f42593b;
            LocalThemeScope localThemeScope2 = this.f42592a;
            StoreMapItem storeMapItem = this.f42594c;
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion2.l(), composer2, 0);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            composer2.startReplaceGroup(-1067071119);
            if (z10) {
                Modifier modifierW = J.w(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), localThemeScope2.getAdsSpacing().getSeven().getDp());
                MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierW);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyG, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C5806j c5806j = C5806j.f48836a;
                C18054z0.a(C16335d.c(Vq.b.f40126a, composer2, 0), C16338g.d(Vq.c.f40164d0, new Object[]{storeMapItem.getMarkerId()}, composer2, 0), J.f(companion, 0.0f, 1, null), storeMapItem.getIsPreferredStore() ? localThemeScope2.getAdsColors().getAdsColorSupportSuccess().getColor() : localThemeScope2.getAdsColors().getAdsColorHoverDanger().getColor(), composer, 384, 0);
                composer2 = composer;
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(c5806j.g(D.k(J.f(companion, 0.0f, 1, null), 0.0f, localThemeScope2.getAdsSpacing().getOne().getDp(), 1, null), companion2.e()), localThemeScope2.getAdsColors().getAdsColorUIBackground01(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 372, null), storeMapItem.getMarkerId(), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2.v();
                i11 = 0;
                C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer2, 0);
            } else {
                localThemeScope = localThemeScope2;
                i11 = 0;
            }
            composer2.P();
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer2, i11);
            int iA3 = C5859f.a(composer2, i11);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A3);
            } else {
                composer2.s();
            }
            Composer composerA3 = D1.a(composer2);
            D1.c(composerA3, measurePolicyA, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 383, null);
            AbstractC6392a name = storeMapItem.getName();
            int i12 = AbstractC6392a.f60445b;
            String strA = C13698b.a(name, composer2, i12);
            int i13 = LocalThemeScope.f17314g;
            int i14 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer2, i13 | (i14 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer2, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C13698b.a(storeMapItem.getAddressLine1(), composer2, i12), null, composer2, i13 | (i14 << 3), 4);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C13698b.a(storeMapItem.getAddressLine2(), composer2, i12), null, composer2, i13 | (i14 << 3), 4);
            LocalThemeScope localThemeScope3 = localThemeScope;
            Composer composer3 = composer2;
            composer3.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer3, 0);
            IndicatorIcon indicatorIcon = storeMapItem.getIndicatorIcon();
            composer3.startReplaceGroup(-1066991968);
            if (indicatorIcon != null) {
                C16671b.b(localThemeScope3, new q1.h.DrawableIcon(indicatorIcon.getIcon(), C13698b.a(indicatorIcon.getContentDescription(), composer3, i12), null, null, 0.0f, null, null, 124, null), null, null, composer3, i13 | (q1.h.DrawableIcon.f142322h << 3), 6);
            }
            composer.P();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class k implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f42595a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f42596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ StoreMapItem f42597c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f42598d;

        k(LocalThemeScope localThemeScope, boolean z10, StoreMapItem storeMapItem, boolean z11) {
            this.f42595a = localThemeScope;
            this.f42596b = z10;
            this.f42597c = storeMapItem;
            this.f42598d = z11;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2;
            LocalThemeScope localThemeScope;
            StoreMapItem storeMapItem;
            C5800d c5800d;
            int i11;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1203623852, i10, -1, "com.meijer.mobile.store.ux.compose.StoreNewListItem.<anonymous> (StoreListView.kt:304)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f42595a.getAdsSpacing().getThree().getDp());
            boolean z10 = this.f42596b;
            LocalThemeScope localThemeScope2 = this.f42595a;
            StoreMapItem storeMapItem2 = this.f42597c;
            boolean z11 = this.f42598d;
            C5800d c5800d2 = C5800d.f48779a;
            C5800d.e eVarG = c5800d2.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion2.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            composer.startReplaceGroup(-1156294287);
            if (z10) {
                Modifier modifierD = c14889j.d(J.z(J.d(companion, 0.0f, 1, null), localThemeScope2.getAdsSpacing().getSeven().getDp()), companion2.i());
                MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierD);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyG, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C5806j c5806j = C5806j.f48836a;
                Z0.c cVarC = C16335d.c(Vq.b.f40128c, composer, 0);
                long color = (z11 && storeMapItem2.getIsPreferredStore()) ? localThemeScope2.getAdsColors().getAdsColorSupportSuccess().getColor() : localThemeScope2.getAdsColors().getAdsColorHoverDanger().getColor();
                c5800d = c5800d2;
                storeMapItem = storeMapItem2;
                C18054z0.a(cVarC, C16338g.d(Vq.c.f40164d0, new Object[]{storeMapItem2.getMarkerId()}, composer, 0), J.f(companion, 0.0f, 1, null), color, composer, 384, 0);
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(c5806j.g(D.k(J.f(companion, 0.0f, 1, null), 0.0f, localThemeScope2.getAdsSpacing().getOne().getDp(), 1, null), companion2.e()), localThemeScope2.getAdsColors().getAdsColorUIBackground01(), null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getNine(), null, 372, null), storeMapItem.getMarkerId(), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2 = composer;
                composer2.v();
                i11 = 0;
                C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
            } else {
                composer2 = composer;
                localThemeScope = localThemeScope2;
                storeMapItem = storeMapItem2;
                c5800d = c5800d2;
                i11 = 0;
            }
            composer2.P();
            Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer2, i11);
            int iA3 = C5859f.a(composer2, i11);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierB);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A3);
            } else {
                composer2.s();
            }
            Composer composerA3 = D1.a(composer2);
            D1.c(composerA3, measurePolicyA, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null);
            String strValueOf = String.valueOf(storeMapItem.getStore().getName());
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            Composer composer3 = composer2;
            si.j.h(localThemeScope, label, strValueOf, null, composer3, i12 | (i13 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer3, 0);
            q1.Label label2 = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 381, null);
            AbstractC6392a addressLine1 = storeMapItem.getAddressLine1();
            int i14 = AbstractC6392a.f60445b;
            si.j.h(localThemeScope, label2, CollectionsKt.B0(CollectionsKt.r(C13698b.a(addressLine1, composer3, i14), C13698b.a(storeMapItem.getAddressLine2(), composer3, i14)), " ", null, null, 0, null, null, 62, null), null, composer3, i12 | (i13 << 3), 4);
            composer3.v();
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer3, 0);
            q1.Label label3 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null);
            AbstractC6392a.Companion companion4 = AbstractC6392a.INSTANCE;
            int i15 = Vq.c.f40160b0;
            Double milesFrom = storeMapItem.getStore().getMilesFrom();
            si.j.h(localThemeScope, label3, C13698b.a(companion4.d(i15, Double.valueOf(milesFrom != null ? milesFrom.doubleValue() : 0.0d)), composer3, i14), null, composer3, i12 | (i13 << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ki.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final bk.AbstractC6392a r25, java.util.List<Yq.StoreMapItem> r26, java.util.List<Yq.StoreMapItem> r27, final boolean r28, l0.C15429A r29, final boolean r30, final Kr.PermissionRequestDecorator<? extends Kr.a> r31, final kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r32, final kotlin.jvm.functions.Function0<kotlin.Unit> r33, final kotlin.jvm.functions.Function1<? super Kr.a, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.o.u(Ki.M, androidx.compose.ui.Modifier, bk.a, java.util.List, java.util.List, boolean, l0.A, boolean, Kr.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r18, final androidx.compose.ui.Modifier r19, final bk.AbstractC6392a r20, l0.C15429A r21, java.util.List<Yq.StoreMapItem> r22, final kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.o.j(Ki.M, androidx.compose.ui.Modifier, bk.a, l0.A, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(List list, LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.d(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1756047767, true, new a(localThemeScope, abstractC6392a)), 3, null);
        LazyColumn.i(list.size(), null, new c(b.f42565f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, localThemeScope, function1, list)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, C15429A c15429a, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, abstractC6392a, c15429a, list, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r23, final androidx.compose.ui.Modifier r24, l0.C15429A r25, java.util.List<Yq.StoreMapItem> r26, java.util.List<Yq.StoreMapItem> r27, final boolean r28, final Kr.PermissionRequestDecorator<? extends Kr.a> r29, final kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r30, final kotlin.jvm.functions.Function0<kotlin.Unit> r31, final kotlin.jvm.functions.Function1<? super Kr.a, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.o.m(Ki.M, androidx.compose.ui.Modifier, l0.A, java.util.List, java.util.List, boolean, Kr.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list, InterfaceC5868j0 interfaceC5868j0, LocalThemeScope localThemeScope, boolean z10, Function1 function1, List list2, PermissionRequestDecorator permissionRequestDecorator, Function1 function12, Modifier modifier, Function0 function0, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        List listB1 = CollectionsKt.b1(list, n(interfaceC5868j0));
        LazyColumn.i(listB1.size(), null, new h(g.f42584f, listB1), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new i(listB1, localThemeScope, z10, function1, list2)));
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(966680657, true, new e(permissionRequestDecorator, localThemeScope, function12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2138192454, true, new f(localThemeScope, modifier, list, function0, interfaceC5868j0)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, C15429A c15429a, List list, List list2, boolean z10, PermissionRequestDecorator permissionRequestDecorator, Function1 function1, Function0 function0, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, c15429a, list, list2, z10, permissionRequestDecorator, function1, function0, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ki.LocalThemeScope r22, final Yq.StoreMapItem r23, androidx.compose.ui.Modifier r24, boolean r25, final kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.o.r(Ki.M, Yq.d, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, StoreMapItem storeMapItem, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, storeMapItem, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, List list, List list2, boolean z10, C15429A c15429a, boolean z11, PermissionRequestDecorator permissionRequestDecorator, Function1 function1, Function0 function0, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) {
        u(localThemeScope, modifier, abstractC6392a, list, list2, z10, c15429a, z11, permissionRequestDecorator, function1, function0, function12, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ki.LocalThemeScope r23, final Yq.StoreMapItem r24, androidx.compose.ui.Modifier r25, boolean r26, final boolean r27, final kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.o.w(Ki.M, Yq.d, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, StoreMapItem storeMapItem, Modifier modifier, boolean z10, boolean z11, Function1 function1, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, storeMapItem, modifier, z10, z11, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, StoreMapItem storeMapItem) {
        function1.invoke(storeMapItem);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1, StoreMapItem storeMapItem) {
        function1.invoke(storeMapItem);
        return Unit.f143329a;
    }
}
