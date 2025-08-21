package Cq;

import Bq.a;
import Co.Image;
import Co.ProductFullDetails;
import Cq.U;
import Fq.ShoppingListItem;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.v;
import P0.e;
import Pq.h;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5815e;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import c5.C6484c;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13590y;
import dk.C13698b;
import j0.C14903g;
import java.util.List;
import ki.C15161c;
import ki.InterfaceC15148Q;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16335d;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a_\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aZ\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00052!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aM\u0010\u001b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\u000e\u0010\u001d\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LFq/c;", "item", "Landroidx/compose/ui/Modifier;", "modifier", "", "isInEditMode", "isShoppingListIterationTwoEnabled", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LBq/a;", "onShoppingListItemAction", "l", "(LKi/M;LFq/c;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isStepperVisible", "Lkotlin/ParameterName;", "name", "isVisible", "onStepperVisibilityChanged", "i", "(LKi/M;LFq/c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/focus/o;", "focusManager", "", "checkboxContentDescription", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/o;LFq/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "itemTitle", "isBoxChecked", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class U {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5510b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f5511c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f5512d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f5513e;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, InterfaceC5914o interfaceC5914o, Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem) {
            this.f5509a = localThemeScope;
            this.f5510b = str;
            this.f5511c = interfaceC5914o;
            this.f5512d = function1;
            this.f5513e = shoppingListItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        public final void c(InterfaceC15148Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-752523867, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListCheckBox.<anonymous>.<anonymous> (ShoppingListItemView.kt:346)");
            }
            composer.startReplaceGroup(1849434622);
            ShoppingListItem shoppingListItem = this.f5513e;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.valueOf(shoppingListItem.getIsComplete()), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f5509a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f5510b);
            final String str = this.f5510b;
            Object objB2 = composer.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Cq.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return U.a.f(str, (r1.u) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            q1.s.Checkbox checkbox = new q1.s.Checkbox(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(C16819m.d(companion2, false, (Function1) objB2, 1, null), 0.0f, 0.0f, this.f5509a.getAdsSpacing().getFour().getDp(), 0.0f, 11, null), H1.h.p(20)), false, null, new C15161c(this.f5509a.getAdsColors().getAdsColorEnabled01(), this.f5509a.getAdsColors().getAdsColorUIBorder01(), this.f5509a.getAdsColors().getAdsColorInverse(), this.f5509a.getAdsColors().getAdsColorsDisabled()), 6, null);
            boolean zD = d(interfaceC5872l0);
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(this.f5511c) | composer.V(this.f5512d) | composer.D(this.f5513e);
            final InterfaceC5914o interfaceC5914o = this.f5511c;
            final Function1<Bq.a, Unit> function1 = this.f5512d;
            final ShoppingListItem shoppingListItem2 = this.f5513e;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Cq.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return U.a.g(interfaceC5914o, function1, shoppingListItem2, interfaceC5872l0, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            wi.s.b(localThemeScope, checkbox, zD, false, false, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.s.Checkbox.f142428e << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
            c(interfaceC15148Q, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        private static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5914o interfaceC5914o, Function1 function1, ShoppingListItem shoppingListItem, InterfaceC5872l0 interfaceC5872l0, boolean z10) {
            e(interfaceC5872l0, z10);
            if (interfaceC5914o != null) {
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            }
            function1.invoke(new a.UpdateCompletion(shoppingListItem));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f5514a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5515b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f5517d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f5518e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f5519f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f5520g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ D1 f5521h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5522i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5523j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5524k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f5525l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5526a = new a();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cq.U$b$b, reason: collision with other inner class name */
        static final class C0097b implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f5527a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f5528b;

            C0097b(L1.h hVar, L1.h hVar2) {
                this.f5527a = hVar;
                this.f5528b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f5527a.getEnd(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f5528b.getStart(), 0.0f, 0.0f, 6, null);
                C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                v.Companion companion = L1.v.INSTANCE;
                constrainAs.p(companion.d());
                constrainAs.r(companion.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<InterfaceC5834y, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D1 f5529a;

            c(D1 d12) {
                this.f5529a = d12;
            }

            public final void a(InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                D1 d12 = this.f5529a;
                if (d12 != null) {
                    d12.b();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5834y interfaceC5834y) {
                a(interfaceC5834y);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<androidx.compose.ui.focus.E, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f5530a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5531b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5532c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f5533d;

            /* JADX WARN: Multi-variable type inference failed */
            d(InterfaceC5872l0<Boolean> interfaceC5872l0, ShoppingListItem shoppingListItem, Function1<? super h.AbstractC4612e, Unit> function1, InterfaceC5872l0<String> interfaceC5872l02) {
                this.f5530a = interfaceC5872l0;
                this.f5531b = shoppingListItem;
                this.f5532c = function1;
                this.f5533d = interfaceC5872l02;
            }

            public final void a(androidx.compose.ui.focus.E it) {
                String itemDescription;
                Intrinsics.j(it, "it");
                if (this.f5530a.getValue().booleanValue() != it.a()) {
                    this.f5530a.setValue(Boolean.valueOf(it.a()));
                    if (it.a() || U.m(this.f5533d).length() <= 0) {
                        return;
                    }
                    String strM = U.m(this.f5533d);
                    nk.c cVarJ = this.f5531b.j();
                    if (cVarJ == null || (itemDescription = cVarJ.getName()) == null) {
                        itemDescription = this.f5531b.getItemDescription();
                    }
                    if (Intrinsics.e(strM, itemDescription)) {
                        return;
                    }
                    Function1<h.AbstractC4612e, Unit> function1 = this.f5532c;
                    ShoppingListItem shoppingListItem = this.f5531b;
                    function1.invoke(new h.AbstractC4612e.OnShoppingListItemChange(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : U.m(this.f5533d), (32511 & 32) != 0 ? shoppingListItem.quantity : 0, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : false, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : null), this.f5531b.getQuantity()));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
                a(e10);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f5534a;

            e(InterfaceC5872l0<String> interfaceC5872l0) {
                this.f5534a = interfaceC5872l0;
            }

            public final void a(String it) {
                Intrinsics.j(it, "it");
                U.p(this.f5534a, it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f5535a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f5536b;

            f(L1.h hVar, L1.h hVar2) {
                this.f5535a = hVar;
                this.f5536b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                float f10 = 12;
                D.a.a(constrainAs.getStart(), this.f5535a.getEnd(), H1.h.p(f10), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), this.f5536b.getStart(), H1.h.p(f10), 0.0f, 4, null);
                C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final g f5537a = new g();

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }

            g() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Bq.a, Unit> f5538a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5539b;

            /* JADX WARN: Multi-variable type inference failed */
            h(Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem) {
                this.f5538a = function1;
                this.f5539b = shoppingListItem;
            }

            public final void a() {
                this.f5538a.invoke(new a.Remove(this.f5539b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class i implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5540a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f5541b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function1<r1.u, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f5542a;

                a(String str) {
                    this.f5542a = str;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    r1.s.g0(semantics, this.f5542a);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f143329a;
                }
            }

            i(LocalThemeScope localThemeScope, String str) {
                this.f5540a = localThemeScope;
                this.f5541b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-137124542, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingListItemView.kt:276)");
                }
                LocalThemeScope localThemeScope = this.f5540a;
                C.a.K k10 = C.a.K.f16874e;
                String str = this.f5541b;
                Ki.T adsColorSupportError = localThemeScope.getAdsColors().getAdsColorSupportError();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f5541b);
                String str2 = this.f5541b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(str2);
                    composer.t(objB);
                }
                composer.P();
                C16671b.b(localThemeScope, new q1.h.DrawableIcon(k10, str, null, null, 0.0f, adsColorSupportError, C16819m.d(companion, false, (Function1) objB, 1, null), 28, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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
        static final class j implements Function1<Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f5543a;

            j(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f5543a = interfaceC5872l0;
            }

            public final void a(boolean z10) {
                U.r(this.f5543a, z10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                a(bool.booleanValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class k extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f5544f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(L1.A a10) {
                super(1);
                this.f5544f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f5544f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f5545f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f5546g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f5547h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5548i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f5549j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f5550k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5551l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function1 f5552m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f5553n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f5554o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ D1 f5555p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Function1 f5556q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f5557r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f5558s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f5559t;

            public final void a(Composer composer, int i10) {
                L1.h hVar;
                L1.h hVar2;
                int i11;
                L1.n nVar;
                L1.h hVar3;
                int i12;
                Modifier.Companion companion;
                C5800d c5800d;
                Composer composer2;
                int i13;
                L1.h hVar4;
                Modifier.Companion companion2;
                C5800d c5800d2;
                L1.n nVar2;
                L1.h hVar5;
                boolean z10;
                L1.n nVar3;
                L1.h hVar6;
                Modifier.Companion companion3;
                ProductFullDetails productDetails;
                List<Image> listJ;
                Image imageA;
                String url;
                L1.n nVar4;
                String altText;
                List<Image> listJ2;
                Image imageA2;
                List<Image> listJ3;
                Image imageA3;
                boolean z11;
                Ki.T adsColorText01;
                Ki.T adsColorsDisabled;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f5546g.getHelpersHashCode();
                this.f5546g.i();
                L1.n nVar5 = this.f5546g;
                composer.startReplaceGroup(-1831288187);
                n.b bVarM = nVar5.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion4, this.f5548i.getAdsSpacing().getFive().getDp(), this.f5548i.getAdsSpacing().getTwo().getDp());
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objB == companion5.a()) {
                    objB = a.f5526a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar5.k(modifierJ, hVarA, (Function1) objB);
                C5800d c5800d3 = C5800d.f48779a;
                C5800d.m mVarH = c5800d3.h();
                e.Companion companion6 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion6.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5953g.Companion companion7 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion7.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion7.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion7.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion7.f());
                C14903g c14903g = C14903g.f139698a;
                if (this.f5549j) {
                    composer.startReplaceGroup(-1251576871);
                    hVar3 = hVarC;
                    i12 = 0;
                    i11 = helpersHashCode;
                    hVar = hVarE;
                    companion = companion4;
                    nVar = nVar5;
                    c5800d = c5800d3;
                    hVar2 = hVarD;
                    C13590y.a(C16335d.c(Aq.a.f1948a, composer, 0), C16338g.c(Aq.b.f1992p, composer, 0), null, null, null, 0.0f, null, composer, 0, 124);
                    composer2 = composer;
                    composer2.P();
                } else {
                    hVar = hVarE;
                    hVar2 = hVarD;
                    i11 = helpersHashCode;
                    nVar = nVar5;
                    hVar3 = hVarC;
                    i12 = 0;
                    companion = companion4;
                    c5800d = c5800d3;
                    composer.startReplaceGroup(-1251568349);
                    U.g(this.f5548i, null, this.f5550k, this.f5551l, C16338g.d(Aq.b.f1983g, new Object[]{U.m(this.f5553n)}, composer, 0), this.f5552m, composer, LocalThemeScope.f17314g, 1);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.v();
                C5800d.f fVarO = c5800d.o(H1.h.p(2));
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(companion, 0.0f, this.f5548i.getAdsSpacing().getFive().getDp(), 1, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zV = composer2.V(hVarA) | composer2.V(hVar2);
                Object objB2 = composer2.B();
                if (zV || objB2 == companion5.a()) {
                    objB2 = new C0097b(hVarA, hVar2);
                    composer2.t(objB2);
                }
                composer2.P();
                L1.n nVar6 = nVar;
                L1.h hVar7 = hVar3;
                Modifier modifierK3 = nVar6.k(modifierK2, hVar7, (Function1) objB2);
                MeasurePolicy measurePolicyA2 = C5807k.a(fVarO, companion6.k(), composer2, 6);
                int iA2 = C5859f.a(composer2, i12);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierK3);
                Function0<InterfaceC5953g> function0A2 = companion7.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion7.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion7.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion7.f());
                if ((this.f5551l.v() || this.f5551l.s() || this.f5551l.x()) && this.f5554o) {
                    composer2.startReplaceGroup(618208836);
                    LocalThemeScope localThemeScope = this.f5548i;
                    si.j.h(localThemeScope, new q1.Label(null, U.q(this.f5557r) ? this.f5548i.getAdsColors().getAdsColorsDisabled() : this.f5548i.getAdsColors().getAdsColorText01(), null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getBody().getOne(), null, HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, null), U.m(this.f5553n), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    composer2.P();
                    i13 = i11;
                    hVar4 = hVar2;
                    companion2 = companion;
                    c5800d2 = c5800d;
                    nVar2 = nVar6;
                    hVar5 = hVar7;
                } else {
                    composer2.startReplaceGroup(618804067);
                    String strM = U.m(this.f5553n);
                    KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zV2 = composer2.V(this.f5555p);
                    Object objB3 = composer2.B();
                    if (zV2 || objB3 == companion5.a()) {
                        objB3 = new c(this.f5555p);
                        composer2.t(objB3);
                    }
                    composer2.P();
                    C5835z c5835z = new C5835z((Function1) objB3, null, null, null, null, null, 62, null);
                    boolean z12 = !U.q(this.f5557r);
                    TextStyle textStyleC = TextStyle.c(this.f5548i.getAdsTypography().getBody().getOne().getStyle(), U.q(this.f5557r) ? this.f5548i.getAdsColors().getAdsColorsDisabled().getColor() : this.f5548i.getAdsColors().getAdsColorText01().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zV3 = composer2.V(this.f5553n) | composer2.D(this.f5551l) | composer2.V(this.f5556q);
                    Object objB4 = composer2.B();
                    if (zV3 || objB4 == companion5.a()) {
                        objB4 = new d(this.f5558s, this.f5551l, this.f5556q, this.f5553n);
                        composer2.t(objB4);
                    }
                    composer2.P();
                    Modifier modifierA = C5903d.a(companion, (Function1) objB4);
                    composer2.startReplaceGroup(5004770);
                    boolean zV4 = composer2.V(this.f5553n);
                    Object objB5 = composer2.B();
                    if (zV4 || objB5 == companion5.a()) {
                        objB5 = new e(this.f5553n);
                        composer2.t(objB5);
                    }
                    composer2.P();
                    c5800d2 = c5800d;
                    i13 = i11;
                    hVar4 = hVar2;
                    companion2 = companion;
                    nVar2 = nVar6;
                    hVar5 = hVar7;
                    C5815e.a(strM, (Function1) objB5, modifierA, z12, false, textStyleC, keyboardOptionsC, c5835z, false, 0, 0, null, null, null, null, null, composer, 0, 0, 65296);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.startReplaceGroup(1682598186);
                if (!this.f5554o || Gq.a.a(this.f5551l) == null) {
                    z10 = true;
                } else {
                    LocalThemeScope localThemeScope2 = this.f5548i;
                    Ki.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                    if (U.q(this.f5557r)) {
                        adsColorsDisabled = this.f5548i.getAdsColors().getAdsColorsDisabled();
                        z11 = true;
                    } else {
                        ProductFullDetails productDetails2 = this.f5551l.getProductDetails();
                        if (productDetails2 != null) {
                            z11 = true;
                            if (productDetails2.getIsSale()) {
                                adsColorText01 = this.f5548i.getAdsColors().getAdsColorSavings();
                            }
                            adsColorsDisabled = adsColorText01;
                        } else {
                            z11 = true;
                        }
                        adsColorText01 = this.f5548i.getAdsColors().getAdsColorText01();
                        adsColorsDisabled = adsColorText01;
                    }
                    z10 = z11;
                    si.j.h(localThemeScope2, new q1.Label(null, adsColorsDisabled, null, null, 0, false, 0, eight, null, 381, null), C13698b.a(Gq.a.a(this.f5551l), composer2, AbstractC6392a.f60445b), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                }
                composer2.P();
                composer2.v();
                composer2.startReplaceGroup(-1633490746);
                L1.h hVar8 = hVar5;
                L1.h hVar9 = hVar;
                boolean zV5 = composer2.V(hVar8) | composer2.V(hVar9);
                Object objB6 = composer2.B();
                if (zV5 || objB6 == companion5.a()) {
                    objB6 = new f(hVar8, hVar9);
                    composer2.t(objB6);
                }
                composer2.P();
                L1.n nVar7 = nVar2;
                Modifier.Companion companion8 = companion2;
                Modifier modifierK4 = nVar7.k(companion8, hVar4, (Function1) objB6);
                MeasurePolicy measurePolicyA3 = C5807k.a(c5800d2.h(), companion6.k(), composer2, 0);
                int iA3 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierK4);
                Function0<InterfaceC5953g> function0A3 = companion7.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A3);
                } else {
                    composer2.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA3, companion7.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion7.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion7.f());
                composer2.startReplaceGroup(858694370);
                if (!this.f5554o || (productDetails = this.f5551l.getProductDetails()) == null || (listJ = productDetails.j()) == null || (imageA = Co.f.a(listJ)) == null || (url = imageA.getUrl()) == null || url.length() <= 0) {
                    nVar3 = nVar7;
                    hVar6 = hVar9;
                    companion3 = companion8;
                } else {
                    C15669h.a aVar = new C15669h.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    ProductFullDetails productDetails3 = this.f5551l.getProductDetails();
                    String url2 = (productDetails3 == null || (listJ3 = productDetails3.j()) == null || (imageA3 = Co.f.a(listJ3)) == null) ? null : imageA3.getUrl();
                    if (url2 == null) {
                        url2 = "";
                    }
                    C15669h c15669hC = aVar.f(url2).e(z10).c();
                    a5.h hVarA2 = a5.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
                    ProductFullDetails productDetails4 = this.f5551l.getProductDetails();
                    if (productDetails4 == null || (listJ2 = productDetails4.j()) == null || (imageA2 = Co.f.a(listJ2)) == null) {
                        nVar4 = nVar7;
                        altText = null;
                    } else {
                        nVar4 = nVar7;
                        altText = imageA2.getAltText();
                    }
                    nVar3 = nVar4;
                    hVar6 = hVar9;
                    companion3 = companion8;
                    C6484c.e(c15669hC, altText, hVarA2, androidx.compose.foundation.layout.J.v(companion8, H1.h.p(48)), null, null, null, interfaceC5926kE, 0.0f, null, 0, false, null, composer, 12585984, 0, 8048);
                    composer2 = composer;
                }
                composer2.P();
                composer2.v();
                Modifier modifierK5 = androidx.compose.foundation.layout.D.k(companion3, 0.0f, this.f5548i.getAdsSpacing().getFive().getDp(), 1, null);
                composer2.startReplaceGroup(1849434622);
                Object objB7 = composer2.B();
                if (objB7 == companion5.a()) {
                    objB7 = g.f5537a;
                    composer2.t(objB7);
                }
                composer2.P();
                Modifier modifierK6 = nVar3.k(modifierK5, hVar6, (Function1) objB7);
                MeasurePolicy measurePolicyA4 = C5807k.a(c5800d2.h(), companion6.k(), composer2, 0);
                int iA4 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR4 = composer2.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierK6);
                Function0<InterfaceC5953g> function0A4 = companion7.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A4);
                } else {
                    composer2.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyA4, companion7.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion7.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion7.f());
                if (this.f5549j) {
                    composer2.startReplaceGroup(1081409272);
                    float fP = H1.h.p(0);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV6 = composer2.V(this.f5552m) | composer2.D(this.f5551l);
                    Object objB8 = composer2.B();
                    if (zV6 || objB8 == companion5.a()) {
                        objB8 = new h(this.f5552m, this.f5551l);
                        composer2.t(objB8);
                    }
                    composer2.P();
                    C18051y.b((Function0) objB8, null, false, null, 0L, 0L, null, fP, null, ComposableLambdaKt.c(-137124542, true, new i(this.f5548i, this.f5559t), composer2, 54), composer, 817889280, 382);
                    composer.P();
                } else {
                    composer2.startReplaceGroup(1082236352);
                    boolean zQ = U.q(this.f5557r);
                    LocalThemeScope localThemeScope3 = this.f5548i;
                    ShoppingListItem shoppingListItem = this.f5551l;
                    composer2.startReplaceGroup(5004770);
                    Object objB9 = composer2.B();
                    if (objB9 == companion5.a()) {
                        objB9 = new j(this.f5557r);
                        composer2.t(objB9);
                    }
                    composer2.P();
                    U.i(localThemeScope3, shoppingListItem, zQ, (Function1) objB9, this.f5556q, composer, LocalThemeScope.f17314g | 3072);
                    composer.P();
                }
                composer.v();
                composer.P();
                if (this.f5546g.getHelpersHashCode() != i13) {
                    this.f5547h.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, InterfaceC5914o interfaceC5914o, ShoppingListItem shoppingListItem, Function1 function1, InterfaceC5872l0 interfaceC5872l0, boolean z11, D1 d12, Function1 function12, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, String str) {
                super(2);
                this.f5546g = nVar;
                this.f5547h = function0;
                this.f5548i = localThemeScope;
                this.f5549j = z10;
                this.f5550k = interfaceC5914o;
                this.f5551l = shoppingListItem;
                this.f5552m = function1;
                this.f5553n = interfaceC5872l0;
                this.f5554o = z11;
                this.f5555p = d12;
                this.f5556q = function12;
                this.f5557r = interfaceC5872l02;
                this.f5558s = interfaceC5872l03;
                this.f5559t = str;
                this.f5545f = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(ShoppingListItem shoppingListItem, LocalThemeScope localThemeScope, boolean z10, InterfaceC5914o interfaceC5914o, Function1<? super Bq.a, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0, boolean z11, D1 d12, Function1<? super h.AbstractC4612e, Unit> function12, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, String str) {
            this.f5514a = shoppingListItem;
            this.f5515b = localThemeScope;
            this.f5516c = z10;
            this.f5517d = interfaceC5914o;
            this.f5518e = function1;
            this.f5519f = interfaceC5872l0;
            this.f5520g = z11;
            this.f5521h = d12;
            this.f5522i = function12;
            this.f5523j = interfaceC5872l02;
            this.f5524k = interfaceC5872l03;
            this.f5525l = str;
        }

        public final void a(Composer composer, int i10) {
            Modifier modifier;
            Object obj;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2031000839, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemView.<anonymous> (ShoppingListItemView.kt:121)");
            }
            ShoppingListItem shoppingListItem = this.f5514a;
            LocalThemeScope localThemeScope = this.f5515b;
            boolean z10 = this.f5516c;
            InterfaceC5914o interfaceC5914o = this.f5517d;
            Function1<Bq.a, Unit> function1 = this.f5518e;
            InterfaceC5872l0<String> interfaceC5872l0 = this.f5519f;
            boolean z11 = this.f5520g;
            D1 d12 = this.f5521h;
            Function1<h.AbstractC4612e, Unit> function12 = this.f5522i;
            InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f5523j;
            InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f5524k;
            String str = this.f5525l;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.b.d(companion, shoppingListItem.getIsComplete() ? localThemeScope.getAdsColors().getAdsColorActiveTransparent().getColor() : localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), 0.0f, 1, null);
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion3.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion3.a()) {
                modifier = modifierH;
                obj = null;
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            } else {
                modifier = modifierH;
                obj = null;
            }
            composer.U();
            Object obj2 = obj;
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifier, false, new k(a10), 1, obj2), ComposableLambdaKt.composableLambda(composer, -819894182, true, new l(nVar, 0, pairH.b(), localThemeScope, z10, interfaceC5914o, shoppingListItem, function1, interfaceC5872l0, z11, d12, function12, interfaceC5872l02, interfaceC5872l03, str)), pairH.a(), composer, 48, 0);
            composer.U();
            C17983Z.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, obj2), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 390, 8);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.ui.focus.InterfaceC5914o r18, final Fq.ShoppingListItem r19, final java.lang.String r20, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.U.g(Ki.M, androidx.compose.ui.Modifier, androidx.compose.ui.focus.o, Fq.c, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, InterfaceC5914o interfaceC5914o, ShoppingListItem shoppingListItem, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, interfaceC5914o, shoppingListItem, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void i(final LocalThemeScope localThemeScope, final ShoppingListItem item, final boolean z10, final Function1<? super Boolean, Unit> onStepperVisibilityChanged, final Function1<? super h.AbstractC4612e, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(item, "item");
        Intrinsics.j(onStepperVisibilityChanged, "onStepperVisibilityChanged");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1970188492);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(item) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onStepperVisibilityChanged) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1970188492, i11, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemQuantity (ShoppingListItemView.kt:313)");
            }
            if (item.getIsComplete()) {
                composerStartRestartGroup.startReplaceGroup(-1137449405);
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.d(Aq.b.f1997u, new Object[]{Integer.valueOf(item.getQuantity())}, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1137255283);
                int quantity = item.getQuantity();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD = ((i11 & 57344) == 16384) | composerStartRestartGroup.D(item);
                Object objB = composerStartRestartGroup.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Cq.P
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return U.j(onAction, item, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                int i12 = LocalThemeScope.f17314g | (i11 & 14);
                int i13 = i11 << 3;
                C3093t.o(localThemeScope, quantity, (Function1) objB, z10, onStepperVisibilityChanged, composerStartRestartGroup, i12 | (i13 & 7168) | (57344 & i13));
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Cq.Q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return U.k(localThemeScope, item, z10, onStepperVisibilityChanged, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, ShoppingListItem shoppingListItem, int i10) {
        function1.invoke(new h.AbstractC4612e.OnShoppingListItemChange(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : null, (32511 & 32) != 0 ? shoppingListItem.quantity : i10, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : false, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : null), shoppingListItem.getQuantity()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, boolean z10, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        i(localThemeScope, shoppingListItem, z10, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r29, final Fq.ShoppingListItem r30, androidx.compose.ui.Modifier r31, boolean r32, final boolean r33, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r34, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.U.l(Ki.M, Fq.c, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z10, Function1 function1, ShoppingListItem shoppingListItem) {
        if (z10) {
            function1.invoke(new h.AbstractC4612e.ShoppingListItemClicked(shoppingListItem));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Modifier modifier, boolean z10, boolean z11, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, shoppingListItem, modifier, z10, z11, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(float f10, X0.c drawWithContent) {
        Intrinsics.j(drawWithContent, "$this$drawWithContent");
        float fI1 = drawWithContent.I1(f10);
        float f11 = -fI1;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.b() >> 32)) + fI1;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.b() & 4294967295L)) + fI1;
        int iB = androidx.compose.ui.graphics.b.INSTANCE.b();
        X0.d drawContext = drawWithContent.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            drawContext.getTransform().c(f11, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iB);
            drawWithContent.a2();
            drawContext.g().i();
            drawContext.h(jB);
            return Unit.f143329a;
        } catch (Throwable th2) {
            drawContext.g().i();
            drawContext.h(jB);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
