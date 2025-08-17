package Cq;

import Bq.a;
import Bq.b;
import Cq.C3066x;
import Fq.ShoppingListItem;
import Go.SearchSuggestions;
import Go.Suggestion;
import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13439f;
import d0.C13442i;
import j0.C14801J;
import j0.InterfaceC14800I;
import java.util.List;
import ji.InterfaceC14919W;
import ji.L0;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17985y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import ni.C15809M;
import ni.P0;
import p1.C16193g;
import r0.C16692i;
import yr.C18299z;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "searchTerm", "Lkotlin/Function1;", "LBq/a;", "", "onShoppingListItemAction", "LBq/b;", "onShoppingListSearchAction", "g", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LGo/a;", "searchSuggestions", "d", "(LJi/M;Landroidx/compose/ui/Modifier;LGo/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Cq.x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C3066x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cq.x$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4854a;

        a(LocalThemeScope localThemeScope) {
            this.f4854a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1957840378, i10, -1, "com.meijer.mobile.shoppinglist.compose.SearchList.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:125)");
            }
            C17917Z.a(null, this.f4854a.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p((float) 0.25d), 0.0f, composer, 384, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cq.x$b */
    static final class b implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Suggestion f4856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f4857c;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Bq.a, Unit> function1, Suggestion suggestion, Function1<? super Bq.b, Unit> function12) {
            this.f4855a = function1;
            this.f4856b = suggestion;
            this.f4857c = function12;
        }

        public final void a() {
            this.f4855a.invoke(new a.Add(new ShoppingListItem(0L, 0, 0, null, this.f4856b.b(), 0, 0, null, false, false, null, null, null, 0L, null, 32751, null)));
            this.f4857c.invoke(b.a.f3225a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cq.x$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Suggestion f4859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f4860c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cq.x$c$a */
        static final class a implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Bq.b, Unit> f4861a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Suggestion f4862b;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super Bq.b, Unit> function1, Suggestion suggestion) {
                this.f4861a = function1;
                this.f4862b = suggestion;
            }

            public final void a() {
                this.f4861a.invoke(new b.SearchTypeQuery(this.f4862b.b()));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Suggestion suggestion, Function1<? super Bq.b, Unit> function1) {
            this.f4858a = localThemeScope;
            this.f4859b = suggestion;
            this.f4860c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1203726230, i10, -1, "com.meijer.mobile.shoppinglist.compose.SearchList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:144)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), this.f4858a.getAdsSpacing().getFive().getDp(), this.f4858a.getAdsSpacing().getFour().getDp());
            LocalThemeScope localThemeScope = this.f4858a;
            Suggestion suggestion = this.f4859b;
            Function1<Bq.b, Unit> function1 = this.f4860c;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            q1.Label label = new q1.Label(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
            String strB = suggestion.b();
            int i11 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope, label, strB, null, composer, (q1.Label.f140080j << 3) | i11, 4);
            C15809M c15809m = C15809M.f151517a;
            String strC = C16193g.c(Aq.b.f1484e, composer, 0);
            C.a.C3833e c3833e = C.a.C3833e.f15338e;
            Modifier modifierF = C18299z.f(companion, "auto_fill_search_suggestion", null, 2, null);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(function1) | composer.D(suggestion);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(function1, suggestion);
                composer.t(objB);
            }
            composer.P();
            P0.i(localThemeScope, c15809m, (Function0) objB, c3833e, strC, modifierF, false, false, 0L, composer, (C15809M.f151518b << 3) | i11 | (C.a.C3833e.f15339f << 9), 224);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Cq.x$d */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f4863f = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Suggestion suggestion) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Cq.x$e */
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f4864f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f4865g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, List list) {
            super(1);
            this.f4864f = function1;
            this.f4865g = list;
        }

        public final Object a(int i10) {
            return this.f4864f.invoke(this.f4865g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: Cq.x$f */
    public static final class f extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f4866f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4867g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f4868h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f4869i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope, Function1 function1, Function1 function12) {
            super(4);
            this.f4866f = list;
            this.f4867g = localThemeScope;
            this.f4868h = function1;
            this.f4869i = function12;
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
            Suggestion suggestion = (Suggestion) this.f4866f.get(i10);
            composer.startReplaceGroup(487794394);
            Modifier modifierF = C18299z.f(androidx.compose.foundation.b.d(Modifier.INSTANCE, this.f4867g.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), "search_suggestion", null, 2, null);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f4868h) | composer.D(suggestion) | composer.V(this.f4869i);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f4868h, suggestion, this.f4869i);
                composer.t(objB);
            }
            composer.P();
            C17985y.b((Function0) objB, modifierF, false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(1203726230, true, new c(this.f4867g, suggestion, this.f4869i), composer, 54), composer, 805306368, 508);
            C17917Z.a(null, this.f4867g.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cq.x$g */
    static final class g implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f4870a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f4872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4873d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4874e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.b, Unit> f4875f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f4876g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f4877h;

        /* JADX WARN: Multi-variable type inference failed */
        g(Modifier modifier, LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, Function1<? super Bq.a, Unit> function1, String str, Function1<? super Bq.b, Unit> function12, String str2, String str3) {
            this.f4870a = modifier;
            this.f4871b = localThemeScope;
            this.f4872c = d12;
            this.f4873d = function1;
            this.f4874e = str;
            this.f4875f = function12;
            this.f4876g = str2;
            this.f4877h = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.platform.D1 d12, Function1 function1, String str, Function1 function12, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            if (d12 != null) {
                d12.b();
            }
            function1.invoke(new a.Add(new ShoppingListItem(0L, 0, 0, null, str, 0, 0, null, false, false, null, null, null, 0L, null, 32751, null)));
            function12.invoke(b.a.f3225a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(new b.SearchTypeQuery(it));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14919W interfaceC14919W, String str, LocalThemeScope localThemeScope, String str2, final Function1 function1, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            q1.h.DrawableIcon leadingIcon = interfaceC14919W.getIcons().getLeadingIcon();
            Modifier.Companion companion = Modifier.INSTANCE;
            H1.N(AdsInputField, q1.h.DrawableIcon.y(leadingIcon, null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), 63, null), C.a.C0245a.f15333e, str, null, 8, null);
            AdsInputField.t0(q1.h.DrawableIcon.y(interfaceC14919W.getIcons().getBarCodeIcon(), null, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), 63, null), C.b.h.C0259b.f15462e, str2, new Function0() { // from class: Cq.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3066x.g.l(function1);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1) {
            function1.invoke(b.c.f3227a);
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-410552201, i10, -1, "com.meijer.mobile.shoppinglist.compose.SearchTextField.<anonymous> (SearchScreen.kt:71)");
            }
            Modifier modifierA = androidx.compose.ui.focus.A.a(C13439f.e(androidx.compose.foundation.b.d(C18299z.f(this.f4870a, "search_bar", null, 2, null), this.f4871b.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), C13442i.a(this.f4871b.getAdsSpacing().getOne().getDp(), this.f4871b.getAdsColors().getAdsColorUIBackground01().getColor()), C16692i.c(this.f4871b.getAdsSpacing().getTwo().getDp())), new androidx.compose.ui.focus.y());
            q1.f.TextInput textInput = Assemble.getInputFields().getStatic();
            KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, 0, androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 119, null);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f4872c) | composer.V(this.f4873d) | composer.V(this.f4874e) | composer.V(this.f4875f);
            final androidx.compose.ui.platform.D1 d12 = this.f4872c;
            final Function1<Bq.a, Unit> function1 = this.f4873d;
            final String str = this.f4874e;
            final Function1<Bq.b, Unit> function12 = this.f4875f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Cq.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3066x.g.f(d12, function1, str, function12, (InterfaceC5692y) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInput, null, false, null, null, null, keyboardOptionsC, new C5693z((Function1) objB, null, null, null, null, null, 62, null), false, 0, null, null, null, 3999, null);
            LocalThemeScope localThemeScope = this.f4871b;
            String str2 = this.f4874e;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f4875f);
            final Function1<Bq.b, Unit> function13 = this.f4875f;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Cq.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3066x.g.g(function13, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function14 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f4876g) | composer.D(this.f4871b) | composer.V(this.f4877h) | composer.V(this.f4875f);
            final String str3 = this.f4876g;
            final LocalThemeScope localThemeScope2 = this.f4871b;
            final String str4 = this.f4877h;
            final Function1<Bq.b, Unit> function15 = this.f4875f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                Function1 function16 = new Function1() { // from class: Cq.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3066x.g.k(Assemble, str3, localThemeScope2, str4, function15, (H1) obj);
                    }
                };
                composer.t(function16);
                objB3 = function16;
            }
            composer.P();
            C18504m0.i(localThemeScope, str2, textInputY, modifierA, function14, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            e(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final Go.SearchSuggestions r22, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r23, final kotlin.jvm.functions.Function1<? super Bq.b, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.C3066x.d(Ji.M, androidx.compose.ui.Modifier, Go.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(SearchSuggestions searchSuggestions, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1957840378, true, new a(localThemeScope)), 3, null);
        List<Suggestion> listA = searchSuggestions.a();
        LazyColumn.i(listA.size(), null, new e(d.f4863f, listA), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(listA, localThemeScope, function1, function12)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, SearchSuggestions searchSuggestions, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, searchSuggestions, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void g(final LocalThemeScope localThemeScope, Modifier modifier, String str, final Function1<? super Bq.a, Unit> onShoppingListItemAction, final Function1<? super Bq.b, Unit> onShoppingListSearchAction, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final String str2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onShoppingListItemAction, "onShoppingListItemAction");
        Intrinsics.j(onShoppingListSearchAction, "onShoppingListSearchAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1389437772);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onShoppingListItemAction) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onShoppingListSearchAction) ? 16384 : 8192;
        }
        int i15 = i12;
        if ((i15 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            str2 = str;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i14 != 0) {
                str = "";
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1389437772, i15, -1, "com.meijer.mobile.shoppinglist.compose.SearchTextField (SearchScreen.kt:63)");
            }
            String str3 = str;
            Ji.Q.e(localThemeScope, L0.f139675a, ComposableLambdaKt.c(-410552201, true, new g(modifier3, localThemeScope, (androidx.compose.ui.platform.D1) composerStartRestartGroup.o(C5892t0.q()), onShoppingListItemAction, str3, onShoppingListSearchAction, C16193g.c(Aq.b.f1483d, composerStartRestartGroup, 0), C16193g.c(Aq.b.f1485f, composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i15 & 14) | (L0.f139676b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
            str2 = str3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Cq.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3066x.h(localThemeScope, modifier2, str2, onShoppingListItemAction, onShoppingListSearchAction, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, String str, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, str, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
