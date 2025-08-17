package Cq;

import Bq.a;
import Co.Image;
import Co.ProductFullDetails;
import Cq.U;
import Fq.ShoppingListItem;
import Ji.C;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.v;
import P0.e;
import Pq.h;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5673e;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import b5.C6197c;
import ck.C6408b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13457y;
import j0.C14815g;
import java.util.List;
import ji.C14927c;
import ji.InterfaceC14914Q;
import ji.q1;
import kotlin.C17917Z;
import kotlin.C17985y;
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
import l5.C15372h;
import p1.C16190d;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a_\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aZ\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00052!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aM\u0010\u001b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\u000e\u0010\u001d\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LFq/c;", "item", "Landroidx/compose/ui/Modifier;", "modifier", "", "isInEditMode", "isShoppingListIterationTwoEnabled", "Lkotlin/Function1;", "LPq/h$e;", "", "onAction", "LBq/a;", "onShoppingListItemAction", "l", "(LJi/M;LFq/c;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isStepperVisible", "Lkotlin/ParameterName;", "name", "isVisible", "onStepperVisibilityChanged", "i", "(LJi/M;LFq/c;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/focus/o;", "focusManager", "", "checkboxContentDescription", "g", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/o;LFq/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "itemTitle", "isBoxChecked", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class U {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4549a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4550b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f4551c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4552d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f4553e;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, InterfaceC5772o interfaceC5772o, Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem) {
            this.f4549a = localThemeScope;
            this.f4550b = str;
            this.f4551c = interfaceC5772o;
            this.f4552d = function1;
            this.f4553e = shoppingListItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void c(InterfaceC14914Q Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-752523867, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListCheckBox.<anonymous>.<anonymous> (ShoppingListItemView.kt:346)");
            }
            composer.startReplaceGroup(1849434622);
            ShoppingListItem shoppingListItem = this.f4553e;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.valueOf(shoppingListItem.getIsComplete()), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f4549a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f4550b);
            final String str = this.f4550b;
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
            q1.s.Checkbox checkbox = new q1.s.Checkbox(androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(C16705m.d(companion2, false, (Function1) objB2, 1, null), 0.0f, 0.0f, this.f4549a.getAdsSpacing().getFour().getDp(), 0.0f, 11, null), H1.h.p(20)), false, null, new C14927c(this.f4549a.getAdsColors().getAdsColorEnabled01(), this.f4549a.getAdsColors().getAdsColorUIBorder01(), this.f4549a.getAdsColors().getAdsColorInverse(), this.f4549a.getAdsColors().getAdsColorsDisabled()), 6, null);
            boolean zD = d(interfaceC5730l0);
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(this.f4551c) | composer.V(this.f4552d) | composer.D(this.f4553e);
            final InterfaceC5772o interfaceC5772o = this.f4551c;
            final Function1<Bq.a, Unit> function1 = this.f4552d;
            final ShoppingListItem shoppingListItem2 = this.f4553e;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Cq.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return U.a.g(interfaceC5772o, function1, shoppingListItem2, interfaceC5730l0, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            vi.s.b(localThemeScope, checkbox, zD, false, false, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.s.Checkbox.f140173e << 3), 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
            c(interfaceC14914Q, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        private static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5772o interfaceC5772o, Function1 function1, ShoppingListItem shoppingListItem, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
            e(interfaceC5730l0, z10);
            if (interfaceC5772o != null) {
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            }
            function1.invoke(new a.UpdateCompletion(shoppingListItem));
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f4554a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4555b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4556c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f4557d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f4558e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f4559f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f4560g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ D1 f4561h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4562i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4563j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4564k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f4565l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4566a = new a();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cq.U$b$b, reason: collision with other inner class name */
        static final class C0081b implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f4567a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f4568b;

            C0081b(L1.h hVar, L1.h hVar2) {
                this.f4567a = hVar;
                this.f4568b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f4567a.getEnd(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f4568b.getStart(), 0.0f, 0.0f, 6, null);
                C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                v.Companion companion = L1.v.INSTANCE;
                constrainAs.p(companion.d());
                constrainAs.r(companion.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<InterfaceC5692y, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D1 f4569a;

            c(D1 d12) {
                this.f4569a = d12;
            }

            public final void a(InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                D1 d12 = this.f4569a;
                if (d12 != null) {
                    d12.b();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5692y interfaceC5692y) {
                a(interfaceC5692y);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<androidx.compose.ui.focus.E, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f4570a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f4571b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC5014e, Unit> f4572c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f4573d;

            /* JADX WARN: Multi-variable type inference failed */
            d(InterfaceC5730l0<Boolean> interfaceC5730l0, ShoppingListItem shoppingListItem, Function1<? super h.AbstractC5014e, Unit> function1, InterfaceC5730l0<String> interfaceC5730l02) {
                this.f4570a = interfaceC5730l0;
                this.f4571b = shoppingListItem;
                this.f4572c = function1;
                this.f4573d = interfaceC5730l02;
            }

            public final void a(androidx.compose.ui.focus.E it) {
                String itemDescription;
                Intrinsics.j(it, "it");
                if (this.f4570a.getValue().booleanValue() != it.a()) {
                    this.f4570a.setValue(Boolean.valueOf(it.a()));
                    if (it.a() || U.m(this.f4573d).length() <= 0) {
                        return;
                    }
                    String strM = U.m(this.f4573d);
                    mk.c cVarJ = this.f4571b.j();
                    if (cVarJ == null || (itemDescription = cVarJ.getName()) == null) {
                        itemDescription = this.f4571b.getItemDescription();
                    }
                    if (Intrinsics.e(strM, itemDescription)) {
                        return;
                    }
                    Function1<h.AbstractC5014e, Unit> function1 = this.f4572c;
                    ShoppingListItem shoppingListItem = this.f4571b;
                    function1.invoke(new h.AbstractC5014e.OnShoppingListItemChange(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : U.m(this.f4573d), (32511 & 32) != 0 ? shoppingListItem.quantity : 0, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : false, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : null), this.f4571b.getQuantity()));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
                a(e10);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f4574a;

            e(InterfaceC5730l0<String> interfaceC5730l0) {
                this.f4574a = interfaceC5730l0;
            }

            public final void a(String it) {
                Intrinsics.j(it, "it");
                U.p(this.f4574a, it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f4575a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f4576b;

            f(L1.h hVar, L1.h hVar2) {
                this.f4575a = hVar;
                this.f4576b = hVar2;
            }

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                float f10 = 12;
                D.a.a(constrainAs.getStart(), this.f4575a.getEnd(), H1.h.p(f10), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), this.f4576b.getStart(), H1.h.p(f10), 0.0f, 4, null);
                C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function1<C4039g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final g f4577a = new g();

            public final void a(C4039g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                C4039g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
                a(c4039g);
                return Unit.f142422a;
            }

            g() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Bq.a, Unit> f4578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f4579b;

            /* JADX WARN: Multi-variable type inference failed */
            h(Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem) {
                this.f4578a = function1;
                this.f4579b = shoppingListItem;
            }

            public final void a() {
                this.f4578a.invoke(new a.Remove(this.f4579b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class i implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f4580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f4581b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function1<r1.u, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f4582a;

                a(String str) {
                    this.f4582a = str;
                }

                public final void a(r1.u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    r1.s.g0(semantics, this.f4582a);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                    a(uVar);
                    return Unit.f142422a;
                }
            }

            i(LocalThemeScope localThemeScope, String str) {
                this.f4580a = localThemeScope;
                this.f4581b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-137124542, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingListItemView.kt:276)");
                }
                LocalThemeScope localThemeScope = this.f4580a;
                C.a.K k10 = C.a.K.f15330e;
                String str = this.f4581b;
                Ji.T adsColorSupportError = localThemeScope.getAdsColors().getAdsColorSupportError();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f4581b);
                String str2 = this.f4581b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new a(str2);
                    composer.t(objB);
                }
                composer.P();
                C16307b.b(localThemeScope, new q1.h.DrawableIcon(k10, str, null, null, 0.0f, adsColorSupportError, C16705m.d(companion, false, (Function1) objB, 1, null), 28, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class j implements Function1<Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f4583a;

            j(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f4583a = interfaceC5730l0;
            }

            public final void a(boolean z10) {
                U.r(this.f4583a, z10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                a(bool.booleanValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class k extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f4584f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(L1.A a10) {
                super(1);
                this.f4584f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f4584f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f4585f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f4586g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f4587h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f4588i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f4589j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f4590k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f4591l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function1 f4592m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0 f4593n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f4594o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ D1 f4595p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ Function1 f4596q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0 f4597r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0 f4598s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f4599t;

            public final void a(Composer composer, int i10) {
                L1.h hVar;
                L1.h hVar2;
                int i11;
                L1.n nVar;
                L1.h hVar3;
                int i12;
                Modifier.Companion companion;
                C5658d c5658d;
                Composer composer2;
                int i13;
                L1.h hVar4;
                Modifier.Companion companion2;
                C5658d c5658d2;
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
                Ji.T adsColorText01;
                Ji.T adsColorsDisabled;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f4586g.getHelpersHashCode();
                this.f4586g.i();
                L1.n nVar5 = this.f4586g;
                composer.startReplaceGroup(-1831288187);
                n.b bVarM = nVar5.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion4, this.f4588i.getAdsSpacing().getFive().getDp(), this.f4588i.getAdsSpacing().getTwo().getDp());
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objB == companion5.a()) {
                    objB = a.f4566a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar5.k(modifierJ, hVarA, (Function1) objB);
                C5658d c5658d3 = C5658d.f48555a;
                C5658d.m mVarH = c5658d3.h();
                e.Companion companion6 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion6.k(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
                InterfaceC5811g.Companion companion7 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion7.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion7.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion7.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion7.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion7.f());
                C14815g c14815g = C14815g.f139108a;
                if (this.f4589j) {
                    composer.startReplaceGroup(-1251576871);
                    hVar3 = hVarC;
                    i12 = 0;
                    i11 = helpersHashCode;
                    hVar = hVarE;
                    companion = companion4;
                    nVar = nVar5;
                    c5658d = c5658d3;
                    hVar2 = hVarD;
                    C13457y.a(C16190d.c(Aq.a.f1451a, composer, 0), C16193g.c(Aq.b.f1495p, composer, 0), null, null, null, 0.0f, null, composer, 0, 124);
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
                    c5658d = c5658d3;
                    composer.startReplaceGroup(-1251568349);
                    U.g(this.f4588i, null, this.f4590k, this.f4591l, C16193g.d(Aq.b.f1486g, new Object[]{U.m(this.f4593n)}, composer, 0), this.f4592m, composer, LocalThemeScope.f15770g, 1);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.v();
                C5658d.f fVarO = c5658d.o(H1.h.p(2));
                Modifier modifierK2 = androidx.compose.foundation.layout.D.k(companion, 0.0f, this.f4588i.getAdsSpacing().getFive().getDp(), 1, null);
                composer2.startReplaceGroup(-1633490746);
                boolean zV = composer2.V(hVarA) | composer2.V(hVar2);
                Object objB2 = composer2.B();
                if (zV || objB2 == companion5.a()) {
                    objB2 = new C0081b(hVarA, hVar2);
                    composer2.t(objB2);
                }
                composer2.P();
                L1.n nVar6 = nVar;
                L1.h hVar7 = hVar3;
                Modifier modifierK3 = nVar6.k(modifierK2, hVar7, (Function1) objB2);
                MeasurePolicy measurePolicyA2 = C5665k.a(fVarO, companion6.k(), composer2, 6);
                int iA2 = C5717f.a(composer2, i12);
                InterfaceC5742s interfaceC5742sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierK3);
                Function0<InterfaceC5811g> function0A2 = companion7.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA2, companion7.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion7.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion7.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion7.f());
                if ((this.f4591l.v() || this.f4591l.s() || this.f4591l.x()) && this.f4594o) {
                    composer2.startReplaceGroup(618208836);
                    LocalThemeScope localThemeScope = this.f4588i;
                    ri.j.h(localThemeScope, new q1.Label(null, U.q(this.f4597r) ? this.f4588i.getAdsColors().getAdsColorsDisabled() : this.f4588i.getAdsColors().getAdsColorText01(), null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getBody().getOne(), null, HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, null), U.m(this.f4593n), null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    composer2.P();
                    i13 = i11;
                    hVar4 = hVar2;
                    companion2 = companion;
                    c5658d2 = c5658d;
                    nVar2 = nVar6;
                    hVar5 = hVar7;
                } else {
                    composer2.startReplaceGroup(618804067);
                    String strM = U.m(this.f4593n);
                    KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zV2 = composer2.V(this.f4595p);
                    Object objB3 = composer2.B();
                    if (zV2 || objB3 == companion5.a()) {
                        objB3 = new c(this.f4595p);
                        composer2.t(objB3);
                    }
                    composer2.P();
                    C5693z c5693z = new C5693z((Function1) objB3, null, null, null, null, null, 62, null);
                    boolean z12 = !U.q(this.f4597r);
                    TextStyle textStyleC = TextStyle.c(this.f4588i.getAdsTypography().getBody().getOne().getStyle(), U.q(this.f4597r) ? this.f4588i.getAdsColors().getAdsColorsDisabled().getColor() : this.f4588i.getAdsColors().getAdsColorText01().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    composer2.startReplaceGroup(-1224400529);
                    boolean zV3 = composer2.V(this.f4593n) | composer2.D(this.f4591l) | composer2.V(this.f4596q);
                    Object objB4 = composer2.B();
                    if (zV3 || objB4 == companion5.a()) {
                        objB4 = new d(this.f4598s, this.f4591l, this.f4596q, this.f4593n);
                        composer2.t(objB4);
                    }
                    composer2.P();
                    Modifier modifierA = C5761d.a(companion, (Function1) objB4);
                    composer2.startReplaceGroup(5004770);
                    boolean zV4 = composer2.V(this.f4593n);
                    Object objB5 = composer2.B();
                    if (zV4 || objB5 == companion5.a()) {
                        objB5 = new e(this.f4593n);
                        composer2.t(objB5);
                    }
                    composer2.P();
                    c5658d2 = c5658d;
                    i13 = i11;
                    hVar4 = hVar2;
                    companion2 = companion;
                    nVar2 = nVar6;
                    hVar5 = hVar7;
                    C5673e.a(strM, (Function1) objB5, modifierA, z12, false, textStyleC, keyboardOptionsC, c5693z, false, 0, 0, null, null, null, null, null, composer, 0, 0, 65296);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.startReplaceGroup(1682598186);
                if (!this.f4594o || Gq.a.a(this.f4591l) == null) {
                    z10 = true;
                } else {
                    LocalThemeScope localThemeScope2 = this.f4588i;
                    Ji.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                    if (U.q(this.f4597r)) {
                        adsColorsDisabled = this.f4588i.getAdsColors().getAdsColorsDisabled();
                        z11 = true;
                    } else {
                        ProductFullDetails productDetails2 = this.f4591l.getProductDetails();
                        if (productDetails2 != null) {
                            z11 = true;
                            if (productDetails2.getIsSale()) {
                                adsColorText01 = this.f4588i.getAdsColors().getAdsColorSavings();
                            }
                            adsColorsDisabled = adsColorText01;
                        } else {
                            z11 = true;
                        }
                        adsColorText01 = this.f4588i.getAdsColors().getAdsColorText01();
                        adsColorsDisabled = adsColorText01;
                    }
                    z10 = z11;
                    ri.j.h(localThemeScope2, new q1.Label(null, adsColorsDisabled, null, null, 0, false, 0, eight, null, 381, null), C6408b.a(Gq.a.a(this.f4591l), composer2, AbstractC5607a.f45514b), null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
                MeasurePolicy measurePolicyA3 = C5665k.a(c5658d2.h(), companion6.k(), composer2, 0);
                int iA3 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierK4);
                Function0<InterfaceC5811g> function0A3 = companion7.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A3);
                } else {
                    composer2.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA3, companion7.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion7.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion7.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion7.f());
                composer2.startReplaceGroup(858694370);
                if (!this.f4594o || (productDetails = this.f4591l.getProductDetails()) == null || (listJ = productDetails.j()) == null || (imageA = Co.f.a(listJ)) == null || (url = imageA.getUrl()) == null || url.length() <= 0) {
                    nVar3 = nVar7;
                    hVar6 = hVar9;
                    companion3 = companion8;
                } else {
                    C15372h.a aVar = new C15372h.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    ProductFullDetails productDetails3 = this.f4591l.getProductDetails();
                    String url2 = (productDetails3 == null || (listJ3 = productDetails3.j()) == null || (imageA3 = Co.f.a(listJ3)) == null) ? null : imageA3.getUrl();
                    if (url2 == null) {
                        url2 = "";
                    }
                    C15372h c15372hC = aVar.f(url2).e(z10).c();
                    Z4.h hVarA2 = Z4.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    InterfaceC5784k interfaceC5784kE = InterfaceC5784k.INSTANCE.e();
                    ProductFullDetails productDetails4 = this.f4591l.getProductDetails();
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
                    C6197c.e(c15372hC, altText, hVarA2, androidx.compose.foundation.layout.J.v(companion8, H1.h.p(48)), null, null, null, interfaceC5784kE, 0.0f, null, 0, false, null, composer, 12585984, 0, 8048);
                    composer2 = composer;
                }
                composer2.P();
                composer2.v();
                Modifier modifierK5 = androidx.compose.foundation.layout.D.k(companion3, 0.0f, this.f4588i.getAdsSpacing().getFive().getDp(), 1, null);
                composer2.startReplaceGroup(1849434622);
                Object objB7 = composer2.B();
                if (objB7 == companion5.a()) {
                    objB7 = g.f4577a;
                    composer2.t(objB7);
                }
                composer2.P();
                Modifier modifierK6 = nVar3.k(modifierK5, hVar6, (Function1) objB7);
                MeasurePolicy measurePolicyA4 = C5665k.a(c5658d2.h(), companion6.k(), composer2, 0);
                int iA4 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR4 = composer2.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierK6);
                Function0<InterfaceC5811g> function0A4 = companion7.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A4);
                } else {
                    composer2.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer2);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyA4, companion7.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion7.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion7.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion7.f());
                if (this.f4589j) {
                    composer2.startReplaceGroup(1081409272);
                    float fP = H1.h.p(0);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV6 = composer2.V(this.f4592m) | composer2.D(this.f4591l);
                    Object objB8 = composer2.B();
                    if (zV6 || objB8 == companion5.a()) {
                        objB8 = new h(this.f4592m, this.f4591l);
                        composer2.t(objB8);
                    }
                    composer2.P();
                    C17985y.b((Function0) objB8, null, false, null, 0L, 0L, null, fP, null, ComposableLambdaKt.c(-137124542, true, new i(this.f4588i, this.f4599t), composer2, 54), composer, 817889280, 382);
                    composer.P();
                } else {
                    composer2.startReplaceGroup(1082236352);
                    boolean zQ = U.q(this.f4597r);
                    LocalThemeScope localThemeScope3 = this.f4588i;
                    ShoppingListItem shoppingListItem = this.f4591l;
                    composer2.startReplaceGroup(5004770);
                    Object objB9 = composer2.B();
                    if (objB9 == companion5.a()) {
                        objB9 = new j(this.f4597r);
                        composer2.t(objB9);
                    }
                    composer2.P();
                    U.i(localThemeScope3, shoppingListItem, zQ, (Function1) objB9, this.f4596q, composer, LocalThemeScope.f15770g | 3072);
                    composer.P();
                }
                composer.v();
                composer.P();
                if (this.f4586g.getHelpersHashCode() != i13) {
                    this.f4587h.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, InterfaceC5772o interfaceC5772o, ShoppingListItem shoppingListItem, Function1 function1, InterfaceC5730l0 interfaceC5730l0, boolean z11, D1 d12, Function1 function12, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, String str) {
                super(2);
                this.f4586g = nVar;
                this.f4587h = function0;
                this.f4588i = localThemeScope;
                this.f4589j = z10;
                this.f4590k = interfaceC5772o;
                this.f4591l = shoppingListItem;
                this.f4592m = function1;
                this.f4593n = interfaceC5730l0;
                this.f4594o = z11;
                this.f4595p = d12;
                this.f4596q = function12;
                this.f4597r = interfaceC5730l02;
                this.f4598s = interfaceC5730l03;
                this.f4599t = str;
                this.f4585f = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(ShoppingListItem shoppingListItem, LocalThemeScope localThemeScope, boolean z10, InterfaceC5772o interfaceC5772o, Function1<? super Bq.a, Unit> function1, InterfaceC5730l0<String> interfaceC5730l0, boolean z11, D1 d12, Function1<? super h.AbstractC5014e, Unit> function12, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, String str) {
            this.f4554a = shoppingListItem;
            this.f4555b = localThemeScope;
            this.f4556c = z10;
            this.f4557d = interfaceC5772o;
            this.f4558e = function1;
            this.f4559f = interfaceC5730l0;
            this.f4560g = z11;
            this.f4561h = d12;
            this.f4562i = function12;
            this.f4563j = interfaceC5730l02;
            this.f4564k = interfaceC5730l03;
            this.f4565l = str;
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
            ShoppingListItem shoppingListItem = this.f4554a;
            LocalThemeScope localThemeScope = this.f4555b;
            boolean z10 = this.f4556c;
            InterfaceC5772o interfaceC5772o = this.f4557d;
            Function1<Bq.a, Unit> function1 = this.f4558e;
            InterfaceC5730l0<String> interfaceC5730l0 = this.f4559f;
            boolean z11 = this.f4560g;
            D1 d12 = this.f4561h;
            Function1<h.AbstractC5014e, Unit> function12 = this.f4562i;
            InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f4563j;
            InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f4564k;
            String str = this.f4565l;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifier, false, new k(a10), 1, obj2), ComposableLambdaKt.composableLambda(composer, -819894182, true, new l(nVar, 0, pairH.b(), localThemeScope, z10, interfaceC5772o, shoppingListItem, function1, interfaceC5730l0, z11, d12, function12, interfaceC5730l02, interfaceC5730l03, str)), pairH.a(), composer, 48, 0);
            composer.U();
            C17917Z.a(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, obj2), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composer, 390, 8);
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
    public static final void g(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, androidx.compose.ui.focus.InterfaceC5772o r18, final Fq.ShoppingListItem r19, final java.lang.String r20, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.U.g(Ji.M, androidx.compose.ui.Modifier, androidx.compose.ui.focus.o, Fq.c, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, InterfaceC5772o interfaceC5772o, ShoppingListItem shoppingListItem, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, interfaceC5772o, shoppingListItem, str, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void i(final LocalThemeScope localThemeScope, final ShoppingListItem item, final boolean z10, final Function1<? super Boolean, Unit> onStepperVisibilityChanged, final Function1<? super h.AbstractC5014e, Unit> onAction, Composer composer, final int i10) {
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
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 383, null), C16193g.d(Aq.b.f1500u, new Object[]{Integer.valueOf(item.getQuantity())}, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
                int i12 = LocalThemeScope.f15770g | (i11 & 14);
                int i13 = i11 << 3;
                C3062t.o(localThemeScope, quantity, (Function1) objB, z10, onStepperVisibilityChanged, composerStartRestartGroup, i12 | (i13 & 7168) | (57344 & i13));
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
        function1.invoke(new h.AbstractC5014e.OnShoppingListItemChange(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : null, (32511 & 32) != 0 ? shoppingListItem.quantity : i10, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : false, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : null), shoppingListItem.getQuantity()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, boolean z10, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        i(localThemeScope, shoppingListItem, z10, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f142422a;
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
    public static final void l(final Ji.LocalThemeScope r29, final Fq.ShoppingListItem r30, androidx.compose.ui.Modifier r31, boolean r32, final boolean r33, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC5014e, kotlin.Unit> r34, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.U.l(Ji.M, Fq.c, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z10, Function1 function1, ShoppingListItem shoppingListItem) {
        if (z10) {
            function1.invoke(new h.AbstractC5014e.ShoppingListItemClicked(shoppingListItem));
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, Modifier modifier, boolean z10, boolean z11, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, shoppingListItem, modifier, z10, z11, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
            return Unit.f142422a;
        } catch (Throwable th2) {
            drawContext.g().i();
            drawContext.h(jB);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
