package Dq;

import Bq.a;
import Co.ProductFullDetails;
import Dq.C3117a;
import Fq.ShoppingListItem;
import Ki.LocalThemeScope;
import Pq.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14890K;
import j0.InterfaceC14894O;
import j0.InterfaceC14902f;
import j0.V;
import j0.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C3117a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a f6405a = new C3117a();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC15433c, Composer, Integer, Unit> f6406b = ComposableLambdaKt.composableLambdaInstance(-1134365703, false, C0122a.f6408a);

    /* renamed from: c, reason: collision with root package name */
    private static Function3<LocalThemeScope, Composer, Integer, Unit> f6407c = ComposableLambdaKt.composableLambdaInstance(1316386604, false, b.f6409a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dq.a$a, reason: collision with other inner class name */
    static final class C0122a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0122a f6408a = new C0122a();

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1134365703, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ComposableSingletons$ShoppingDragDropListKt.lambda$-1134365703.<anonymous> (ShoppingDragDropList.kt:300)");
            }
            C14890K.a(androidx.compose.foundation.layout.J.h(V.a(Modifier.INSTANCE, W.c(InterfaceC14894O.INSTANCE, composer, 6)), 0.0f, 1, null), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        C0122a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Dq.a$b */
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6409a = new b();

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Dq.a$b$a, reason: collision with other inner class name */
        static final class C0123a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6411b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6412c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6413d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f6414e;

            C0123a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<String> interfaceC5872l04) {
                this.f6410a = localThemeScope;
                this.f6411b = interfaceC5872l0;
                this.f6412c = interfaceC5872l02;
                this.f6413d = interfaceC5872l03;
                this.f6414e = interfaceC5872l04;
            }

            public final void d(InterfaceC14902f AdsPreview, Composer composer, int i10) {
                Intrinsics.j(AdsPreview, "$this$AdsPreview");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-888082249, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ComposableSingletons$ShoppingDragDropListKt.lambda$1316386604.<anonymous>.<anonymous> (ShoppingDragDropList.kt:407)");
                }
                LocalThemeScope localThemeScope = this.f6410a;
                boolean zO = b.o(this.f6412c);
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f6412c;
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f6413d;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function1() { // from class: Dq.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C3117a.b.C0123a.e(interfaceC5872l0, interfaceC5872l02, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                Mi.h.o(localThemeScope, "ShoppingListIterationTwo", zO, null, (Function1) objB, composer, i11 | 24624, 4);
                LocalThemeScope localThemeScope2 = this.f6410a;
                boolean zS = b.s(this.f6413d);
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f6413d;
                final InterfaceC5872l0<Boolean> interfaceC5872l04 = this.f6412c;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: Dq.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C3117a.b.C0123a.f(interfaceC5872l03, interfaceC5872l04, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Mi.h.o(localThemeScope2, "ShoppingListIterationThree", zS, null, (Function1) objB2, composer, i11 | 24624, 4);
                LocalThemeScope localThemeScope3 = this.f6410a;
                boolean zBooleanValue = this.f6411b.getValue().booleanValue();
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Boolean> interfaceC5872l05 = this.f6411b;
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = new Function1() { // from class: Dq.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C3117a.b.C0123a.g(interfaceC5872l05, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                Mi.h.o(localThemeScope3, "Edit Mode", zBooleanValue, null, (Function1) objB3, composer, i11 | 24624, 4);
                Mi.h.h(this.f6410a, "Last Action", b.u(this.f6414e), null, composer, i11 | 48, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                d(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, boolean z10) {
                b.r(interfaceC5872l0, z10);
                b.t(interfaceC5872l02, false);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, boolean z10) {
                b.t(interfaceC5872l0, z10);
                b.r(interfaceC5872l02, false);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                interfaceC5872l0.setValue(Boolean.valueOf(z10));
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Dq.a$b$b, reason: collision with other inner class name */
        static final class C0124b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6415a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6416b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<List<ShoppingListItem>> f6417c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6418d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f6419e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f6420f;

            C0124b(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<Boolean> interfaceC5872l04, InterfaceC5872l0<String> interfaceC5872l05) {
                this.f6415a = localThemeScope;
                this.f6416b = interfaceC5872l0;
                this.f6417c = interfaceC5872l02;
                this.f6418d = interfaceC5872l03;
                this.f6419e = interfaceC5872l04;
                this.f6420f = interfaceC5872l05;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, Bq.a shoppingListAction) {
                String simpleName;
                int i10;
                Intrinsics.j(shoppingListAction, "shoppingListAction");
                if (shoppingListAction instanceof a.Remove) {
                    simpleName = shoppingListAction.getClass().getSimpleName() + ": " + ((a.Remove) shoppingListAction).getItem().getListItemId();
                } else if (shoppingListAction instanceof a.UpdateCompletion) {
                    List<ShoppingListItem> listP = b.p(interfaceC5872l0);
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
                    for (ShoppingListItem shoppingListItemA : listP) {
                        if (((a.UpdateCompletion) shoppingListAction).getItem().getListItemId() == shoppingListItemA.getListItemId()) {
                            shoppingListItemA = shoppingListItemA.a((32511 & 1) != 0 ? shoppingListItemA.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItemA.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItemA.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItemA.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItemA.itemDescription : null, (32511 & 32) != 0 ? shoppingListItemA.quantity : 0, (32511 & 64) != 0 ? shoppingListItemA.storeId : 0, (32511 & 128) != 0 ? shoppingListItemA.notes : null, (32511 & 256) != 0 ? shoppingListItemA.isComplete : !shoppingListItemA.getIsComplete(), (32511 & 512) != 0 ? shoppingListItemA.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItemA.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItemA.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItemA.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItemA.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItemA.productDetails : null);
                        }
                        arrayList.add(shoppingListItemA);
                    }
                    b.q(interfaceC5872l0, arrayList);
                    simpleName = shoppingListAction.getClass().getSimpleName() + ": " + ((a.UpdateCompletion) shoppingListAction).getItem().getListItemId();
                } else if (shoppingListAction instanceof a.MoveItem) {
                    List listM1 = CollectionsKt.m1(b.p(interfaceC5872l0));
                    Iterator it = listM1.iterator();
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        i10 = -1;
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        ShoppingListItem shoppingListItem = (ShoppingListItem) it.next();
                        ShoppingListItem itemOnBottom = ((a.MoveItem) shoppingListAction).getItemOnBottom();
                        if (itemOnBottom != null && shoppingListItem.getListItemId() == itemOnBottom.getListItemId()) {
                            break;
                        }
                        i12++;
                    }
                    Integer numValueOf = Integer.valueOf(i12);
                    if (numValueOf.intValue() == -1) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    Iterator it2 = listM1.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((ShoppingListItem) it2.next()).getListItemId() == ((a.MoveItem) shoppingListAction).getItemToMove().getListItemId()) {
                            i10 = i11;
                            break;
                        }
                        i11++;
                    }
                    C3124h.c(listM1, i10, iIntValue);
                    Unit unit = Unit.f143329a;
                    b.q(interfaceC5872l0, listM1);
                    simpleName = shoppingListAction.getClass().getSimpleName() + ": " + ((a.MoveItem) shoppingListAction).getItemToMove().getListItemId() + '}';
                } else {
                    if (!Intrinsics.e(shoppingListAction, a.f.f3629a) && !(shoppingListAction instanceof a.Add) && !(shoppingListAction instanceof a.AddItems) && !Intrinsics.e(shoppingListAction, a.d.f3627a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    simpleName = shoppingListAction.getClass().getSimpleName();
                    Intrinsics.g(simpleName);
                }
                b.v(interfaceC5872l02, simpleName);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(InterfaceC5872l0 interfaceC5872l0, ShoppingListItem it) {
                Intrinsics.j(it, "it");
                b.v(interfaceC5872l0, "IconSearch Clicked");
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, h.AbstractC4612e action) {
                String simpleName;
                Intrinsics.j(action, "action");
                if (Intrinsics.e(action, h.AbstractC4612e.c.f26378a)) {
                    simpleName = action.getClass().getSimpleName();
                    Intrinsics.i(simpleName, "getSimpleName(...)");
                } else if (Intrinsics.e(action, h.AbstractC4612e.b.f26377a)) {
                    simpleName = action.getClass().getSimpleName();
                    Intrinsics.i(simpleName, "getSimpleName(...)");
                } else if (action instanceof h.AbstractC4612e.OnShoppingListItemChange) {
                    List<ShoppingListItem> listP = b.p(interfaceC5872l0);
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
                    for (ShoppingListItem shoppingListItem : listP) {
                        h.AbstractC4612e.OnShoppingListItemChange onShoppingListItemChange = (h.AbstractC4612e.OnShoppingListItemChange) action;
                        if (onShoppingListItemChange.getShoppingListItem().getListItemId() == shoppingListItem.getListItemId()) {
                            shoppingListItem = onShoppingListItemChange.getShoppingListItem();
                        }
                        arrayList.add(shoppingListItem);
                    }
                    b.q(interfaceC5872l0, arrayList);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(action.getClass().getSimpleName());
                    sb2.append(": ");
                    h.AbstractC4612e.OnShoppingListItemChange onShoppingListItemChange2 = (h.AbstractC4612e.OnShoppingListItemChange) action;
                    sb2.append(onShoppingListItemChange2.getShoppingListItem().getListItemId());
                    sb2.append(' ');
                    sb2.append(onShoppingListItemChange2.getShoppingListItem().getQuantity());
                    simpleName = sb2.toString();
                } else if (action instanceof h.AbstractC4612e.ShoppingListItemClicked) {
                    simpleName = action.getClass().getSimpleName() + ": " + ((h.AbstractC4612e.ShoppingListItemClicked) action).getShoppingListItem().getListItemId();
                } else {
                    if (!Intrinsics.e(action, h.AbstractC4612e.a.f26376a) && !Intrinsics.e(action, h.AbstractC4612e.d.f26379a) && !Intrinsics.e(action, h.AbstractC4612e.C0483e.f26380a) && !(action instanceof h.AbstractC4612e.ShareList)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    simpleName = action.getClass().getSimpleName();
                    Intrinsics.g(simpleName);
                }
                b.v(interfaceC5872l02, simpleName);
                return Unit.f143329a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1961936794, i10, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ComposableSingletons$ShoppingDragDropListKt.lambda$1316386604.<anonymous>.<anonymous> (ShoppingDragDropList.kt:428)");
                }
                LocalThemeScope localThemeScope = this.f6415a;
                List listP = b.p(this.f6417c);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listP) {
                    if (!((ShoppingListItem) obj).getIsComplete()) {
                        arrayList.add(obj);
                    }
                }
                List listP2 = b.p(this.f6417c);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listP2) {
                    if (((ShoppingListItem) obj2).getIsComplete()) {
                        arrayList2.add(obj2);
                    }
                }
                InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f6416b;
                boolean zO = b.o(this.f6418d);
                boolean zS = b.s(this.f6419e);
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<String> interfaceC5872l02 = this.f6420f;
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = new Function1() { // from class: Dq.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return C3117a.b.C0124b.f(interfaceC5872l02, (ShoppingListItem) obj3);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l03 = this.f6417c;
                final InterfaceC5872l0<String> interfaceC5872l04 = this.f6420f;
                Object objB2 = composer.B();
                if (objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: Dq.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return C3117a.b.C0124b.g(interfaceC5872l03, interfaceC5872l04, (h.AbstractC4612e) obj3);
                        }
                    };
                    composer.t(objB2);
                }
                Function1 function12 = (Function1) objB2;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                final InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l05 = this.f6417c;
                final InterfaceC5872l0<String> interfaceC5872l06 = this.f6420f;
                Object objB3 = composer.B();
                if (objB3 == companion.a()) {
                    objB3 = new Function1() { // from class: Dq.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return C3117a.b.C0124b.e(interfaceC5872l05, interfaceC5872l06, (Bq.a) obj3);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                q.g(localThemeScope, null, arrayList, arrayList2, false, interfaceC5872l0, zO, zS, function1, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | 906190848, 6, 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            l(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void l(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1316386604, i11, -1, "com.meijer.mobile.shoppinglist.compose.dragdroplist.ComposableSingletons$ShoppingDragDropListKt.lambda$1316386604.<anonymous> (ShoppingDragDropList.kt:353)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.TRUE, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB3;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB4 = composer.B();
            if (objB4 == companion.a()) {
                objB4 = t1.e("No Action", null, 2, null);
                composer.t(objB4);
            }
            InterfaceC5872l0 interfaceC5872l04 = (InterfaceC5872l0) objB4;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB5 = composer.B();
            if (objB5 == companion.a()) {
                objB5 = t1.e(CollectionsKt.p(new ShoppingListItem(123L, 0, 0, "PartNumber", "Sample Item 1", 2, 0, null, false, false, null, null, null, 0L, null, 32710, null), new ShoppingListItem(1232L, 0, 0, null, "Sample Item 2", 2, 0, null, false, false, null, null, null, 0L, null, 32718, null), new ShoppingListItem(1235L, 0, 0, null, "Sample Item 3", 2, 0, null, false, false, null, null, null, 0L, null, 32718, null), new ShoppingListItem(1231L, 0, 0, null, "test item", 2, 0, null, true, false, null, null, null, 0L, null, 32462, null), new ShoppingListItem(4011L, 0, 0, "4011", "Bananas", 2, 0, null, false, false, null, null, null, 0L, new ProductFullDetails("4011", null, 158, false, false, false, "<p>Bananas are one of the healthiest foods to munch on for breakfast.</p>", null, null, null, false, false, false, false, false, false, false, Co.l.f("USD", "LB", 0.265d, "$0.27", 0.5d, null, 32, null), false, null, null, false, null, false, 0, null, 0.0d, null, false, null, "https://stg.meijer.com/shop/en/p/4011", null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1073872966, 268435455, null), 16070, null)), null, 2, null);
                composer.t(objB5);
            }
            composer.P();
            Mi.h.f(AdsTheme, ComposableLambdaKt.c(-888082249, true, new C0123a(AdsTheme, interfaceC5872l03, interfaceC5872l0, interfaceC5872l02, interfaceC5872l04), composer, 54), ComposableLambdaKt.c(-1961936794, true, new C0124b(AdsTheme, interfaceC5872l03, (InterfaceC5872l0) objB5, interfaceC5872l0, interfaceC5872l02, interfaceC5872l04), composer, 54), composer, LocalThemeScope.f17314g | 432 | (i11 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<ShoppingListItem> p(InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(InterfaceC5872l0<List<ShoppingListItem>> interfaceC5872l0, List<ShoppingListItem> list) {
            interfaceC5872l0.setValue(list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String u(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    public final Function3<InterfaceC15433c, Composer, Integer, Unit> a() {
        return f6406b;
    }
}
