package Cq;

import Bq.a;
import Co.Image;
import Co.ProductFullDetails;
import Fq.ShoppingListItem;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4009f;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.v;
import L1.x;
import P0.e;
import Pq.h;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
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
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14903g;
import java.util.List;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18051y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16335d;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;
import yr.C18370z;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001ai\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LFq/c;", "item", "", "isInEditMode", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "onSearchIconClicked", "LPq/h$e;", "onAction", "LBq/a;", "onShoppingListItemAction", "e", "(LKi/M;LFq/c;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "itemTitle", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f5422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f5423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f5424c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f5425d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Bq.a, Unit> f5426e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f5427f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f5428g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5429h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f5430i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<ShoppingListItem, Unit> f5431j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cq.K$a$a, reason: collision with other inner class name */
        static final class C0096a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0096a f5432a = new C0096a();

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

            C0096a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function1<Boolean, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f5433a = new b();

            public final void a(boolean z10) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                a(bool.booleanValue());
                return Unit.f143329a;
            }

            b() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final c f5434a = new c();

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

            c() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Bq.a, Unit> f5435a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5436b;

            /* JADX WARN: Multi-variable type inference failed */
            d(Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem) {
                this.f5435a = function1;
                this.f5436b = shoppingListItem;
            }

            public final void a() {
                this.f5435a.invoke(new a.Remove(this.f5436b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5437a;

            e(LocalThemeScope localThemeScope) {
                this.f5437a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1429693856, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemViewIterationThree.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingListItemViewIterationThree.kt:330)");
                }
                C16671b.b(this.f5437a, new q1.h.DrawableIcon(C.a.K.f16874e, C16338g.c(Aq.b.f1990n, composer, 0), null, InterfaceC5926k.INSTANCE.d(), 0.0f, this.f5437a.getAdsColors().getAdsColorSupportError(), null, 84, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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
        static final class f implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<Bq.a, Unit> f5438a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5439b;

            /* JADX WARN: Multi-variable type inference failed */
            f(Function1<? super Bq.a, Unit> function1, ShoppingListItem shoppingListItem) {
                this.f5438a = function1;
                this.f5439b = shoppingListItem;
            }

            public final void a() {
                this.f5438a.invoke(new a.Remove(this.f5439b));
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class g implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5440a;

            g(LocalThemeScope localThemeScope) {
                this.f5440a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1506573225, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemViewIterationThree.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingListItemViewIterationThree.kt:346)");
                }
                C16671b.b(this.f5440a, new q1.h.DrawableIcon(C.a.C3925k.f16891e, C16338g.c(Aq.b.f1990n, composer, 0), null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, null, 116, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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
        static final class i implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5442a;

            i(LocalThemeScope localThemeScope) {
                this.f5442a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1984536424, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemViewIterationThree.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingListItemViewIterationThree.kt:359)");
                }
                C16671b.b(this.f5442a, new q1.h.DrawableIcon(C.a.C0287a.f16877e, null, null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, null, 118, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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
        static final class j implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<ShoppingListItem, Unit> f5443a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5444b;

            /* JADX WARN: Multi-variable type inference failed */
            j(Function1<? super ShoppingListItem, Unit> function1, ShoppingListItem shoppingListItem) {
                this.f5443a = function1;
                this.f5444b = shoppingListItem;
            }

            public final void a() {
                this.f5443a.invoke(this.f5444b);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class k implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5445a;

            k(LocalThemeScope localThemeScope) {
                this.f5445a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1930462665, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemViewIterationThree.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShoppingListItemViewIterationThree.kt:373)");
                }
                C16671b.b(this.f5445a, new q1.h.DrawableIcon(C.a.B.f16864e, null, null, InterfaceC5926k.INSTANCE.d(), 0.0f, null, null, 118, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
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
        static final class l implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f5446a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f5447b;

            l(L1.h hVar, L1.h hVar2) {
                this.f5446a = hVar;
                this.f5447b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f5446a.getEnd(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f5447b.getStart(), 0.0f, 0.0f, 6, null);
                C4010g.e(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class m implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f5448a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f5449b;

            m(L1.h hVar, L1.h hVar2) {
                this.f5448a = hVar;
                this.f5449b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f5448a.getEnd(), 0.0f, 0.0f, 6, null);
                D.a.a(constrainAs.getEnd(), this.f5449b.getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
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
        static final class n implements Function1<InterfaceC5834y, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D1 f5450a;

            n(D1 d12) {
                this.f5450a = d12;
            }

            public final void a(InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                D1 d12 = this.f5450a;
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
        static final class o implements Function1<androidx.compose.ui.focus.E, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f5451a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5452b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<h.AbstractC4612e, Unit> f5453c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f5454d;

            /* JADX WARN: Multi-variable type inference failed */
            o(InterfaceC5872l0<Boolean> interfaceC5872l0, ShoppingListItem shoppingListItem, Function1<? super h.AbstractC4612e, Unit> function1, InterfaceC5872l0<String> interfaceC5872l02) {
                this.f5451a = interfaceC5872l0;
                this.f5452b = shoppingListItem;
                this.f5453c = function1;
                this.f5454d = interfaceC5872l02;
            }

            public final void a(androidx.compose.ui.focus.E it) {
                String itemDescription;
                Intrinsics.j(it, "it");
                if (this.f5451a.getValue().booleanValue() != it.a()) {
                    this.f5451a.setValue(Boolean.valueOf(it.a()));
                    if (it.a() || K.f(this.f5454d).length() <= 0) {
                        return;
                    }
                    String strF = K.f(this.f5454d);
                    nk.c cVarJ = this.f5452b.j();
                    if (cVarJ == null || (itemDescription = cVarJ.getName()) == null) {
                        itemDescription = this.f5452b.getItemDescription();
                    }
                    if (Intrinsics.e(strF, itemDescription)) {
                        return;
                    }
                    Function1<h.AbstractC4612e, Unit> function1 = this.f5453c;
                    ShoppingListItem shoppingListItem = this.f5452b;
                    function1.invoke(new h.AbstractC4612e.OnShoppingListItemChange(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : K.f(this.f5454d), (32511 & 32) != 0 ? shoppingListItem.quantity : 0, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : false, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : null), this.f5452b.getQuantity()));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.focus.E e10) {
                a(e10);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class p implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f5455a;

            p(InterfaceC5872l0<String> interfaceC5872l0) {
                this.f5455a = interfaceC5872l0;
            }

            public final void a(String it) {
                Intrinsics.j(it, "it");
                K.h(this.f5455a, it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class q implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f5456a;

            q(L1.h hVar) {
                this.f5456a = hVar;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f5456a.getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f5456a.getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class r implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f5457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L1.h f5458b;

            r(L1.h hVar, L1.h hVar2) {
                this.f5457a = hVar;
                this.f5458b = hVar2;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                D.a.a(constrainAs.getStart(), this.f5457a.getStart(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getTop(), this.f5458b.getBottom(), 0.0f, 0.0f, 6, null);
                x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class s extends Lambda implements Function1<r1.u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ L1.A f5459f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(L1.A a10) {
                super(1);
                this.f5459f = a10;
            }

            public final void a(r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                L1.C.a(semantics, this.f5459f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f5460f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L1.n f5461g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function0 f5462h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f5463i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f5464j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ShoppingListItem f5465k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f5466l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function1 f5467m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f5468n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ D1 f5469o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Function1 f5470p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f5471q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f5472r;

            public final void a(Composer composer, int i10) {
                L1.h hVar;
                L1.h hVar2;
                Modifier.Companion companion;
                int i11;
                L1.h hVar3;
                L1.h hVar4;
                C5800d c5800d;
                L1.h hVar5;
                Composer composer2;
                int i12;
                Modifier.Companion companion2;
                L1.h hVar6;
                L1.h hVar7;
                L1.n nVar;
                Composer composer3;
                Modifier.Companion companion3;
                L1.n nVar2;
                L1.h hVar8;
                L1.h hVar9;
                Modifier modifierM;
                Modifier modifier;
                Composer composer4;
                boolean z10;
                L1.h hVar10;
                int i13;
                List<Image> listJ;
                Image imageA;
                String url;
                List<Image> listJ2;
                Image imageA2;
                List<Image> listJ3;
                Image imageA3;
                if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                    composer.K();
                    return;
                }
                int helpersHashCode = this.f5461g.getHelpersHashCode();
                this.f5461g.i();
                L1.n nVar3 = this.f5461g;
                composer.startReplaceGroup(-1702827077);
                n.b bVarM = nVar3.m();
                L1.h hVarA = bVarM.a();
                L1.h hVarC = bVarM.c();
                L1.h hVarD = bVarM.d();
                L1.h hVarE = bVarM.e();
                L1.h hVarF = bVarM.f();
                L1.h hVarG = bVarM.g();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion5 = Composer.INSTANCE;
                if (objB == companion5.a()) {
                    objB = C0096a.f5432a;
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar3.k(companion4, hVarA, (Function1) objB);
                C5800d c5800d2 = C5800d.f48779a;
                C5800d.m mVarH = c5800d2.h();
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
                if (this.f5464j) {
                    composer.startReplaceGroup(1524442134);
                    companion = companion4;
                    hVar2 = hVarE;
                    i11 = helpersHashCode;
                    hVar4 = hVarF;
                    hVar = hVarD;
                    hVar3 = hVarG;
                    hVar5 = hVarC;
                    c5800d = c5800d2;
                    C13590y.a(C16335d.c(Aq.a.f1948a, composer, 0), C16338g.c(Aq.b.f1992p, composer, 0), androidx.compose.foundation.layout.D.m(companion4, 0.0f, 0.0f, this.f5463i.getAdsSpacing().getThree().getDp(), 0.0f, 11, null), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                    composer2 = composer;
                    composer2.P();
                } else {
                    hVar = hVarD;
                    hVar2 = hVarE;
                    companion = companion4;
                    i11 = helpersHashCode;
                    hVar3 = hVarG;
                    hVar4 = hVarF;
                    c5800d = c5800d2;
                    hVar5 = hVarC;
                    composer.startReplaceGroup(-643550766);
                    U.g(this.f5463i, null, this.f5466l, this.f5465k, C16338g.d(Aq.b.f1983g, new Object[]{K.f(this.f5468n)}, composer, 0), this.f5467m, composer, LocalThemeScope.f17314g, 1);
                    composer2 = composer;
                    composer2.P();
                }
                composer2.v();
                composer2.startReplaceGroup(-1633490746);
                boolean zV = composer2.V(hVarA) | composer2.V(hVar5);
                Object objB2 = composer2.B();
                if (zV || objB2 == companion5.a()) {
                    objB2 = new l(hVarA, hVar5);
                    composer2.t(objB2);
                }
                composer2.P();
                Modifier modifierK2 = nVar3.k(companion, hVar4, (Function1) objB2);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion6.k(), composer2, 0);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierK2);
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
                composer2.startReplaceGroup(-1522112696);
                ProductFullDetails productDetails = this.f5465k.getProductDetails();
                if (productDetails == null || (listJ = productDetails.j()) == null || (imageA = Co.f.a(listJ)) == null || (url = imageA.getUrl()) == null || url.length() <= 0) {
                    i12 = i11;
                    companion2 = companion;
                    hVar6 = hVar4;
                    hVar7 = hVar5;
                    nVar = nVar3;
                    composer3 = composer2;
                } else {
                    C15669h.a aVar = new C15669h.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    ProductFullDetails productDetails2 = this.f5465k.getProductDetails();
                    String url2 = (productDetails2 == null || (listJ3 = productDetails2.j()) == null || (imageA3 = Co.f.a(listJ3)) == null) ? null : imageA3.getUrl();
                    if (url2 == null) {
                        url2 = "";
                    }
                    C15669h c15669hC = aVar.f(url2).j(Aq.a.f1949b).e(true).c();
                    a5.h hVarA2 = a5.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    InterfaceC5926k interfaceC5926kE = InterfaceC5926k.INSTANCE.e();
                    ProductFullDetails productDetails3 = this.f5465k.getProductDetails();
                    Modifier.Companion companion8 = companion;
                    companion2 = companion8;
                    i12 = i11;
                    nVar = nVar3;
                    hVar6 = hVar4;
                    hVar7 = hVar5;
                    C6484c.e(c15669hC, (productDetails3 == null || (listJ2 = productDetails3.j()) == null || (imageA2 = Co.f.a(listJ2)) == null) ? null : imageA2.getAltText(), hVarA2, androidx.compose.foundation.layout.J.v(androidx.compose.foundation.layout.D.m(companion8, 0.0f, 0.0f, this.f5463i.getAdsSpacing().getFour().getDp(), 0.0f, 11, null), H1.h.p(48)), null, null, null, interfaceC5926kE, 0.0f, null, 0, false, null, composer, 12582912, 0, 8048);
                    composer3 = composer;
                }
                composer3.P();
                composer3.v();
                Modifier.Companion companion9 = companion2;
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion9, 0.0f, 0.0f, this.f5463i.getAdsSpacing().getFive().getDp(), 0.0f, 11, null);
                composer3.startReplaceGroup(-1633490746);
                L1.h hVar11 = hVar6;
                L1.h hVar12 = hVar3;
                boolean zV2 = composer3.V(hVar11) | composer3.V(hVar12);
                Object objB3 = composer3.B();
                if (zV2 || objB3 == companion5.a()) {
                    objB3 = new m(hVar11, hVar12);
                    composer3.t(objB3);
                }
                composer3.P();
                L1.n nVar4 = nVar;
                L1.h hVar13 = hVar7;
                Modifier modifierK3 = nVar4.k(modifierM2, hVar13, (Function1) objB3);
                MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.h(), companion6.k(), composer3, 0);
                int iA3 = C5859f.a(composer3, 0);
                InterfaceC5884s interfaceC5884sR3 = composer3.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer3, modifierK3);
                Function0<InterfaceC5953g> function0A3 = companion7.a();
                if (composer3.k() == null) {
                    C5859f.c();
                }
                composer3.F();
                if (composer3.getInserting()) {
                    composer3.I(function0A3);
                } else {
                    composer3.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer3);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyA3, companion7.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion7.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion7.f());
                if (!this.f5464j || this.f5465k.v()) {
                    companion3 = companion9;
                    nVar2 = nVar4;
                    hVar8 = hVar12;
                    hVar9 = hVar13;
                    composer3.startReplaceGroup(-1840746113);
                    LocalThemeScope localThemeScope = this.f5463i;
                    si.j.h(localThemeScope, new q1.Label(null, this.f5463i.getAdsColors().getAdsColorText01(), null, null, F1.t.INSTANCE.b(), false, 2, localThemeScope.getAdsTypography().getHeadings().getNine(), null, HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, null), K.f(this.f5468n), null, composer3, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    composer3.P();
                } else {
                    composer3.startReplaceGroup(-1840273859);
                    String strF = K.f(this.f5468n);
                    KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                    composer3.startReplaceGroup(5004770);
                    boolean zV3 = composer3.V(this.f5469o);
                    Object objB4 = composer3.B();
                    if (zV3 || objB4 == companion5.a()) {
                        objB4 = new n(this.f5469o);
                        composer3.t(objB4);
                    }
                    composer3.P();
                    C5835z c5835z = new C5835z((Function1) objB4, null, null, null, null, null, 62, null);
                    TextStyle textStyleC = TextStyle.c(this.f5463i.getAdsTypography().getHeadings().getNine().getStyle(), this.f5463i.getAdsColors().getAdsColorText01().getColor(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    Modifier modifierF = C18370z.f(companion9, "shopping_list_item_title", null, 2, null);
                    composer3.startReplaceGroup(-1224400529);
                    boolean zV4 = composer3.V(this.f5468n) | composer3.D(this.f5465k) | composer3.V(this.f5470p);
                    Object objB5 = composer3.B();
                    if (zV4 || objB5 == companion5.a()) {
                        objB5 = new o(this.f5471q, this.f5465k, this.f5470p, this.f5468n);
                        composer3.t(objB5);
                    }
                    composer3.P();
                    Modifier modifierA = C5903d.a(modifierF, (Function1) objB5);
                    composer3.startReplaceGroup(5004770);
                    boolean zV5 = composer3.V(this.f5468n);
                    Object objB6 = composer3.B();
                    if (zV5 || objB6 == companion5.a()) {
                        objB6 = new p(this.f5468n);
                        composer3.t(objB6);
                    }
                    composer3.P();
                    companion3 = companion9;
                    hVar9 = hVar13;
                    hVar8 = hVar12;
                    nVar2 = nVar4;
                    C5815e.a(strF, (Function1) objB6, modifierA, false, false, textStyleC, keyboardOptionsC, c5835z, false, 0, 0, null, null, null, null, null, composer, 0, 0, 65304);
                    composer3 = composer;
                    composer3.P();
                }
                composer3.v();
                composer3.startReplaceGroup(5004770);
                L1.h hVar14 = hVar9;
                boolean zV6 = composer3.V(hVar14);
                Object objB7 = composer3.B();
                if (zV6 || objB7 == companion5.a()) {
                    objB7 = new q(hVar14);
                    composer3.t(objB7);
                }
                composer3.P();
                L1.h hVar15 = hVar;
                L1.n nVar5 = nVar2;
                Modifier.Companion companion10 = companion3;
                Modifier modifierK4 = nVar5.k(companion10, hVar15, (Function1) objB7);
                if (!this.f5464j || this.f5465k.v()) {
                    modifierM = androidx.compose.foundation.layout.D.m(companion10, 0.0f, this.f5463i.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null);
                    modifier = companion10;
                } else {
                    modifierM = companion10;
                    modifier = modifierM;
                }
                Modifier modifierThen = modifierK4.then(modifierM);
                C5800d c5800d3 = c5800d;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d3.o(H1.h.p(8)), companion6.l(), composer3, 6);
                int iA4 = C5859f.a(composer3, 0);
                InterfaceC5884s interfaceC5884sR4 = composer3.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer3, modifierThen);
                Function0<InterfaceC5953g> function0A4 = companion7.a();
                if (composer3.k() == null) {
                    C5859f.c();
                }
                composer3.F();
                if (composer3.getInserting()) {
                    composer3.I(function0A4);
                } else {
                    composer3.s();
                }
                Composer composerA4 = androidx.compose.runtime.D1.a(composer3);
                androidx.compose.runtime.D1.c(composerA4, measurePolicyB, companion7.e());
                androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion7.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                androidx.compose.runtime.D1.c(composerA4, modifierE4, companion7.f());
                C14889J c14889j = C14889J.f139620a;
                composer3.startReplaceGroup(932973962);
                if (!this.f5464j) {
                    LocalThemeScope localThemeScope2 = this.f5463i;
                    si.j.h(localThemeScope2, new q1.Label(null, this.f5463i.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getDetail().getOne(), null, 381, null), C16338g.d(Aq.b.f1997u, new Object[]{Integer.valueOf(this.f5465k.getQuantity())}, composer3, 0), null, composer3, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                }
                composer3.P();
                composer3.startReplaceGroup(932987789);
                if (Gq.a.a(this.f5465k) == null || this.f5464j) {
                    composer4 = composer3;
                    z10 = true;
                } else {
                    Composer composer5 = composer3;
                    z10 = true;
                    C17983Z.a(androidx.compose.foundation.layout.J.w(modifier, H1.h.p(1), H1.h.p(20)), this.f5463i.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer5, 6, 12);
                    composer4 = composer5;
                }
                composer4.P();
                composer4.startReplaceGroup(932998934);
                if (Gq.a.a(this.f5465k) != null) {
                    LocalThemeScope localThemeScope3 = this.f5463i;
                    Ki.I one = localThemeScope3.getAdsTypography().getDetail().getOne();
                    ProductFullDetails productDetails4 = this.f5465k.getProductDetails();
                    si.j.h(localThemeScope3, new q1.Label(null, (productDetails4 == null || productDetails4.getIsSale() != z10) ? this.f5463i.getAdsColors().getAdsColorText01() : this.f5463i.getAdsColors().getAdsColorSavings(), null, null, 0, false, 0, one, null, 381, null), C13698b.a(Gq.a.a(this.f5465k), composer4, AbstractC6392a.f60445b), null, composer4, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                }
                composer4.P();
                composer4.v();
                composer4.startReplaceGroup(-1633490746);
                boolean zV7 = composer4.V(hVar14) | composer4.V(hVar15);
                Object objB8 = composer4.B();
                if (zV7 || objB8 == companion5.a()) {
                    objB8 = new r(hVar14, hVar15);
                    composer4.t(objB8);
                }
                composer4.P();
                L1.h hVar16 = hVar2;
                Modifier modifierF2 = C18370z.f(nVar5.k(modifier, hVar16, (Function1) objB8).then(this.f5464j ? androidx.compose.foundation.layout.D.m(modifier, 0.0f, this.f5463i.getAdsSpacing().getThree().getDp(), 0.0f, 0.0f, 13, null) : modifier), "shopping_list_item_quantity_stepper", null, 2, null);
                MeasurePolicy measurePolicyG = C5804h.g(companion6.o(), false);
                int iA5 = C5859f.a(composer4, 0);
                InterfaceC5884s interfaceC5884sR5 = composer4.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer4, modifierF2);
                Function0<InterfaceC5953g> function0A5 = companion7.a();
                if (composer4.k() == null) {
                    C5859f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A5);
                } else {
                    composer4.s();
                }
                Composer composerA5 = androidx.compose.runtime.D1.a(composer4);
                androidx.compose.runtime.D1.c(composerA5, measurePolicyG, companion7.e());
                androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion7.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                androidx.compose.runtime.D1.c(composerA5, modifierE5, companion7.f());
                C5806j c5806j = C5806j.f48836a;
                composer4.startReplaceGroup(1053947693);
                if (this.f5464j) {
                    LocalThemeScope localThemeScope4 = this.f5463i;
                    ShoppingListItem shoppingListItem = this.f5465k;
                    i13 = 1849434622;
                    composer4.startReplaceGroup(1849434622);
                    Object objB9 = composer4.B();
                    if (objB9 == companion5.a()) {
                        objB9 = b.f5433a;
                        composer4.t(objB9);
                    }
                    composer4.P();
                    hVar10 = hVar16;
                    U.i(localThemeScope4, shoppingListItem, true, (Function1) objB9, this.f5470p, composer, LocalThemeScope.f17314g | 3456);
                    composer4 = composer;
                } else {
                    hVar10 = hVar16;
                    i13 = 1849434622;
                }
                composer4.P();
                composer4.v();
                nVar5.f(new L1.h[]{hVar14, hVar15, hVar10}, C4009f.INSTANCE.b());
                composer4.startReplaceGroup(i13);
                Object objB10 = composer4.B();
                if (objB10 == companion5.a()) {
                    objB10 = c.f5434a;
                    composer4.t(objB10);
                }
                composer4.P();
                Modifier modifierV = androidx.compose.foundation.layout.J.v(nVar5.k(modifier, hVar8, (Function1) objB10), H1.h.p(40));
                MeasurePolicy measurePolicyA4 = C5807k.a(c5800d3.b(), companion6.g(), composer4, 54);
                int iA6 = C5859f.a(composer4, 0);
                InterfaceC5884s interfaceC5884sR6 = composer4.r();
                Modifier modifierE6 = androidx.compose.ui.b.e(composer4, modifierV);
                Function0<InterfaceC5953g> function0A6 = companion7.a();
                if (composer4.k() == null) {
                    C5859f.c();
                }
                composer4.F();
                if (composer4.getInserting()) {
                    composer4.I(function0A6);
                } else {
                    composer4.s();
                }
                Composer composerA6 = androidx.compose.runtime.D1.a(composer4);
                androidx.compose.runtime.D1.c(composerA6, measurePolicyA4, companion7.e());
                androidx.compose.runtime.D1.c(composerA6, interfaceC5884sR6, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B6 = companion7.b();
                if (composerA6.getInserting() || !Intrinsics.e(composerA6.B(), Integer.valueOf(iA6))) {
                    composerA6.t(Integer.valueOf(iA6));
                    composerA6.n(Integer.valueOf(iA6), function2B6);
                }
                androidx.compose.runtime.D1.c(composerA6, modifierE6, companion7.f());
                if (this.f5464j) {
                    composer4.startReplaceGroup(554322684);
                    composer4.startReplaceGroup(-1633490746);
                    boolean zV8 = composer4.V(this.f5467m) | composer4.D(this.f5465k);
                    Object objB11 = composer4.B();
                    if (zV8 || objB11 == companion5.a()) {
                        objB11 = new d(this.f5467m, this.f5465k);
                        composer4.t(objB11);
                    }
                    composer4.P();
                    C18051y.b((Function0) objB11, C18370z.f(modifier, "shopping_list_item_delete", null, 2, null), false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-1429693856, true, new e(this.f5463i), composer4, 54), composer, 805306368, 508);
                    composer.P();
                } else if (this.f5465k.getIsComplete()) {
                    composer4.startReplaceGroup(555162257);
                    composer4.startReplaceGroup(-1633490746);
                    boolean zV9 = composer4.V(this.f5467m) | composer4.D(this.f5465k);
                    Object objB12 = composer4.B();
                    if (zV9 || objB12 == companion5.a()) {
                        objB12 = new f(this.f5467m, this.f5465k);
                        composer4.t(objB12);
                    }
                    composer4.P();
                    C18051y.b((Function0) objB12, C18370z.f(modifier, "shopping_list_item_delete", null, 2, null), false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-1506573225, true, new g(this.f5463i), composer4, 54), composer, 805306368, 508);
                    composer.P();
                } else if (this.f5465k.v()) {
                    composer4.startReplaceGroup(555911961);
                    composer4.startReplaceGroup(i13);
                    Object objB13 = composer4.B();
                    if (objB13 == companion5.a()) {
                        objB13 = h.f5441a;
                        composer4.t(objB13);
                    }
                    composer4.P();
                    C18051y.b((Function0) objB13, null, false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-1984536424, true, new i(this.f5463i), composer4, 54), composer, 805306374, 510);
                    composer.P();
                } else {
                    composer4.startReplaceGroup(556431924);
                    composer4.startReplaceGroup(-1633490746);
                    boolean zV10 = composer4.V(this.f5472r) | composer4.D(this.f5465k);
                    Object objB14 = composer4.B();
                    if (zV10 || objB14 == companion5.a()) {
                        objB14 = new j(this.f5472r, this.f5465k);
                        composer4.t(objB14);
                    }
                    composer4.P();
                    C18051y.b((Function0) objB14, C18370z.f(modifier, "shopping_list_item_search", null, 2, null), false, null, 0L, 0L, null, 0.0f, null, ComposableLambdaKt.c(-1930462665, true, new k(this.f5463i), composer4, 54), composer, 805306368, 508);
                    composer.P();
                }
                composer.v();
                composer.P();
                if (this.f5461g.getHelpersHashCode() != i12) {
                    this.f5462h.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public t(L1.n nVar, int i10, Function0 function0, LocalThemeScope localThemeScope, boolean z10, ShoppingListItem shoppingListItem, InterfaceC5914o interfaceC5914o, Function1 function1, InterfaceC5872l0 interfaceC5872l0, D1 d12, Function1 function12, InterfaceC5872l0 interfaceC5872l02, Function1 function13) {
                super(2);
                this.f5461g = nVar;
                this.f5462h = function0;
                this.f5463i = localThemeScope;
                this.f5464j = z10;
                this.f5465k = shoppingListItem;
                this.f5466l = interfaceC5914o;
                this.f5467m = function1;
                this.f5468n = interfaceC5872l0;
                this.f5469o = d12;
                this.f5470p = function12;
                this.f5471q = interfaceC5872l02;
                this.f5472r = function13;
                this.f5460f = i10;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class h implements Function0<Unit> {

            /* renamed from: a, reason: collision with root package name */
            public static final h f5441a = new h();

            public final void a() {
            }

            h() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, boolean z10, ShoppingListItem shoppingListItem, InterfaceC5914o interfaceC5914o, Function1<? super Bq.a, Unit> function1, InterfaceC5872l0<String> interfaceC5872l0, D1 d12, Function1<? super h.AbstractC4612e, Unit> function12, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super ShoppingListItem, Unit> function13) {
            this.f5422a = localThemeScope;
            this.f5423b = z10;
            this.f5424c = shoppingListItem;
            this.f5425d = interfaceC5914o;
            this.f5426e = function1;
            this.f5427f = interfaceC5872l0;
            this.f5428g = d12;
            this.f5429h = function12;
            this.f5430i = interfaceC5872l02;
            this.f5431j = function13;
        }

        public final void a(Composer composer, int i10) {
            D1 d12;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-329227326, i10, -1, "com.meijer.mobile.shoppinglist.compose.ShoppingListItemViewIterationThree.<anonymous> (ShoppingListItemViewIterationThree.kt:114)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(Modifier.INSTANCE, this.f5422a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), this.f5422a.getAdsSpacing().getFive().getDp()), 0.0f, 1, null);
            LocalThemeScope localThemeScope = this.f5422a;
            boolean z10 = this.f5423b;
            ShoppingListItem shoppingListItem = this.f5424c;
            InterfaceC5914o interfaceC5914o = this.f5425d;
            Function1<Bq.a, Unit> function1 = this.f5426e;
            InterfaceC5872l0<String> interfaceC5872l0 = this.f5427f;
            D1 d13 = this.f5428g;
            Function1<h.AbstractC4612e, Unit> function12 = this.f5429h;
            InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f5430i;
            Function1<ShoppingListItem, Unit> function13 = this.f5431j;
            composer.startReplaceableGroup(-270267587);
            composer.startReplaceableGroup(-3687241);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composer.t(objB);
            }
            composer.U();
            L1.A a10 = (L1.A) objB;
            composer.startReplaceableGroup(-3687241);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composer.t(objB2);
            }
            composer.U();
            L1.n nVar = (L1.n) objB2;
            composer.startReplaceableGroup(-3687241);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                d12 = d13;
                InterfaceC5872l0 interfaceC5872l0E = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(interfaceC5872l0E);
                objB3 = interfaceC5872l0E;
            } else {
                d12 = d13;
            }
            composer.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composer, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierH, false, new s(a10), 1, null), ComposableLambdaKt.composableLambda(composer, -819894182, true, new t(nVar, 0, pairH.b(), localThemeScope, z10, shoppingListItem, interfaceC5914o, function1, interfaceC5872l0, d12, function12, interfaceC5872l02, function13)), pairH.a(), composer, 48, 0);
            composer.U();
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Cq/K$b", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements androidx.compose.runtime.E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f5473a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f5474b;

        public b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f5473a = view;
            this.f5474b = onGlobalLayoutListener;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            this.f5473a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f5474b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r32, final Fq.ShoppingListItem r33, final boolean r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super Fq.ShoppingListItem, kotlin.Unit> r36, final kotlin.jvm.functions.Function1<? super Pq.h.AbstractC4612e, kotlin.Unit> r37, final kotlin.jvm.functions.Function1<? super Bq.a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cq.K.e(Ki.M, Fq.c, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, ShoppingListItem shoppingListItem, boolean z10, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, shoppingListItem, z10, modifier, function1, function12, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1, ShoppingListItem shoppingListItem) {
        function1.invoke(new h.AbstractC4612e.ShoppingListItemClicked(shoppingListItem));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.E j(final View view, final InterfaceC5914o interfaceC5914o, androidx.compose.runtime.F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Cq.J
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                K.k(view, interfaceC5914o);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        return new b(view, onGlobalLayoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view, InterfaceC5914o interfaceC5914o) {
        view.getWindowVisibleDisplayFrame(new Rect());
        if (r6 - r0.bottom < view.getRootView().getHeight() * 0.15d) {
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
