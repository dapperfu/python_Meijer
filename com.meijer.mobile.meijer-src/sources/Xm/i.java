package Xm;

import V0.C5489q0;
import Ym.m;
import Ym.r;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.k;
import com.meijer.mobile.meijer.activity.find.filter.o;
import com.meijer.mobile.meijer.activity.find.filter.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17983Z;
import kotlin.C6304d;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import r1.C16819m;
import r1.CustomAccessibilityAction;
import r1.u;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "state", "", "i", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/k$b;Landroidx/compose/runtime/Composer;I)V", "", "LXm/j;", "listBodyItems", "", "animationVisibility", "o", "(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<s, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f42340a;

        a(s sVar) {
            this.f42340a = sVar;
        }

        public final void a(s it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1843511198, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.DisplayListBody.<anonymous>.<anonymous> (DisplayListBody.kt:49)");
            }
            Ym.h.c((s.HeaderItem) this.f42340a, composer, AbstractC6392a.f60445b);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(s sVar, Composer composer, Integer num) {
            a(sVar, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<s, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f42341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f42342b;

        b(o oVar, s sVar) {
            this.f42341a = oVar;
            this.f42342b = sVar;
        }

        public final void a(s it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1194160295, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.DisplayListBody.<anonymous>.<anonymous> (DisplayListBody.kt:62)");
            }
            m.e(this.f42341a, (s.SimpleSortItem) this.f42342b, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(s sVar, Composer composer, Integer num) {
            a(sVar, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<s, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f42343a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f42344b;

        c(o oVar, s sVar) {
            this.f42343a = oVar;
            this.f42344b = sVar;
        }

        public final void a(s it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2030955238, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.DisplayListBody.<anonymous>.<anonymous> (DisplayListBody.kt:79)");
            }
            Ym.e.e(this.f42343a, (s.DrillDownItem) this.f42344b, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(s sVar, Composer composer, Integer num) {
            a(sVar, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<s, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f42345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f42346b;

        d(o oVar, s sVar) {
            this.f42345a = oVar;
            this.f42346b = sVar;
        }

        public final void a(s it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1427217115, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.DisplayListBody.<anonymous>.<anonymous> (DisplayListBody.kt:93)");
            }
            r.e(this.f42345a, (s.SimpleFilterItem) this.f42346b, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(s sVar, Composer composer, Integer num) {
            a(sVar, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<u, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListBodyItem f42347a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function0<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ListBodyItem f42348a;

            a(ListBodyItem listBodyItem) {
                this.f42348a = listBodyItem;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return this.f42348a.a().invoke(this.f42348a.getItem());
            }
        }

        e(ListBodyItem listBodyItem) {
            this.f42347a = listBodyItem;
        }

        public final void a(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.h0(semantics, CollectionsKt.e(new CustomAccessibilityAction(this.f42347a.getSemanticName(), new a(this.f42347a))));
            r1.s.x0(semantics, this.f42347a.getSemanticName());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ListBodyItem f42349a;

        f(ListBodyItem listBodyItem) {
            this.f42349a = listBodyItem;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-995470629, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.StatelessListBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DisplayListBody.kt:148)");
            }
            this.f42349a.e().invoke(this.f42349a.getItem(), composer, 0);
            C17983Z.a(null, C5489q0.INSTANCE.f(), H1.h.p(1), 0.0f, composer, 432, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final g f42350f = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ListBodyItem listBodyItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f42351f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f42352g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, List list) {
            super(1);
            this.f42351f = function1;
            this.f42352g = list;
        }

        public final Object a(int i10) {
            return this.f42351f.invoke(this.f42352g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Xm.i$i, reason: collision with other inner class name */
    public static final class C0902i extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f42353f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f42354g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0902i(Function1 function1, List list) {
            super(1);
            this.f42353f = function1;
            this.f42354g = list;
        }

        public final Object a(int i10) {
            return this.f42353f.invoke(this.f42354g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class j extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f42355f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f42356g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List list, boolean z10) {
            super(4);
            this.f42355f = list;
            this.f42356g = z10;
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
            ListBodyItem listBodyItem = (ListBodyItem) this.f42355f.get(i10);
            composer.startReplaceGroup(1251327258);
            boolean z10 = this.f42356g;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(listBodyItem);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new e(listBodyItem);
                composer.t(objB);
            }
            composer.P();
            C6304d.f(z10, C16819m.d(companion, false, (Function1) objB, 1, null), null, null, null, ComposableLambdaKt.c(-995470629, true, new f(listBodyItem), composer, 54), composer, 196608, 28);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(s it) {
        Intrinsics.j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(s it) {
        Intrinsics.j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(s it) {
        Intrinsics.j(it, "it");
        return true;
    }

    public static final void i(final o filterViewModel, final k.SortAndFilterPageState state, Composer composer, final int i10) {
        ListBodyItem listBodyItem;
        ListBodyItem listBodyItem2;
        Intrinsics.j(filterViewModel, "filterViewModel");
        Intrinsics.j(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-410557254);
        int i11 = (i10 & 6) == 0 ? (composerStartRestartGroup.D(filterViewModel) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(state) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-410557254, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.DisplayListBody (DisplayListBody.kt:40)");
            }
            composerStartRestartGroup.startReplaceGroup(591479349);
            List<s> listD = state.d();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listD, 10));
            for (s sVar : listD) {
                if (sVar instanceof s.HeaderItem) {
                    composerStartRestartGroup.startReplaceGroup(1447145386);
                    s.HeaderItem headerItem = (s.HeaderItem) sVar;
                    String strA = ck.d.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()), headerItem.getTextItem());
                    String strA2 = ck.d.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()), headerItem.getTextItem());
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1843511198, true, new a(sVar), composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objB = composerStartRestartGroup.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Xm.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(i.j((s) obj));
                            }
                        };
                        composerStartRestartGroup.t(objB);
                    }
                    composerStartRestartGroup.P();
                    listBodyItem2 = new ListBodyItem(headerItem, strA, strA2, composableLambdaC, (Function1) objB);
                    composerStartRestartGroup.P();
                } else if (sVar instanceof s.SimpleSortItem) {
                    composerStartRestartGroup.startReplaceGroup(1447687917);
                    s.SimpleSortItem simpleSortItem = (s.SimpleSortItem) sVar;
                    String displayName = simpleSortItem.getSortItem().getDisplayName();
                    ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-1194160295, true, new b(filterViewModel, sVar), composerStartRestartGroup, 54);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objB2 = composerStartRestartGroup.B();
                    if (objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Xm.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(i.k((s) obj));
                            }
                        };
                        composerStartRestartGroup.t(objB2);
                    }
                    composerStartRestartGroup.P();
                    listBodyItem2 = new ListBodyItem(simpleSortItem, displayName, "", composableLambdaC2, (Function1) objB2);
                    composerStartRestartGroup.P();
                } else {
                    if (sVar instanceof s.DrillDownItem) {
                        composerStartRestartGroup.startReplaceGroup(1448380116);
                        s.DrillDownItem drillDownItem = (s.DrillDownItem) sVar;
                        String name = drillDownItem.getName();
                        composerStartRestartGroup.startReplaceGroup(-1200201329);
                        String string = null;
                        if (name == null) {
                            Integer nameRes = drillDownItem.getNameRes();
                            name = nameRes == null ? null : ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getString(nameRes.intValue());
                        }
                        composerStartRestartGroup.P();
                        String str = name == null ? "" : name;
                        String name2 = drillDownItem.getName();
                        composerStartRestartGroup.startReplaceGroup(-1200188565);
                        if (name2 == null) {
                            Integer nameRes2 = drillDownItem.getNameRes();
                            if (nameRes2 != null) {
                                string = ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getString(nameRes2.intValue());
                            }
                        } else {
                            string = name2;
                        }
                        composerStartRestartGroup.P();
                        String str2 = string == null ? "" : string;
                        ComposableLambda composableLambdaC3 = ComposableLambdaKt.c(-2030955238, true, new c(filterViewModel, sVar), composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objB3 = composerStartRestartGroup.B();
                        if (objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function1() { // from class: Xm.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(i.l((s) obj));
                                }
                            };
                            composerStartRestartGroup.t(objB3);
                        }
                        composerStartRestartGroup.P();
                        listBodyItem = new ListBodyItem(drillDownItem, str, str2, composableLambdaC3, (Function1) objB3);
                        composerStartRestartGroup.P();
                    } else {
                        if (!(sVar instanceof s.SimpleFilterItem)) {
                            composerStartRestartGroup.startReplaceGroup(-1200243583);
                            composerStartRestartGroup.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1449067510);
                        s.SimpleFilterItem simpleFilterItem = (s.SimpleFilterItem) sVar;
                        String displayName2 = simpleFilterItem.getFilterItem().getDisplayName();
                        String str3 = displayName2 == null ? "" : displayName2;
                        String displayName3 = simpleFilterItem.getFilterItem().getDisplayName();
                        String str4 = displayName3 == null ? "" : displayName3;
                        ComposableLambda composableLambdaC4 = ComposableLambdaKt.c(1427217115, true, new d(filterViewModel, sVar), composerStartRestartGroup, 54);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objB4 = composerStartRestartGroup.B();
                        if (objB4 == Composer.INSTANCE.a()) {
                            objB4 = new Function1() { // from class: Xm.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(i.m((s) obj));
                                }
                            };
                            composerStartRestartGroup.t(objB4);
                        }
                        composerStartRestartGroup.P();
                        listBodyItem = new ListBodyItem(simpleFilterItem, str3, str4, composableLambdaC4, (Function1) objB4);
                        composerStartRestartGroup.P();
                    }
                    listBodyItem2 = listBodyItem;
                }
                arrayList.add(listBodyItem2);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB5 = composerStartRestartGroup.B();
            if (objB5 == Composer.INSTANCE.a()) {
                objB5 = Boolean.TRUE;
                composerStartRestartGroup.t(objB5);
            }
            boolean zBooleanValue = ((Boolean) objB5).booleanValue();
            composerStartRestartGroup.P();
            o(arrayList, zBooleanValue, composerStartRestartGroup, 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Xm.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.n(filterViewModel, state, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(s it) {
        Intrinsics.j(it, "it");
        new j.SelectSort(((s.SimpleSortItem) it).getSortItem());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(o oVar, k.SortAndFilterPageState sortAndFilterPageState, int i10, Composer composer, int i11) {
        i(oVar, sortAndFilterPageState, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void o(final List<ListBodyItem> listBodyItems, final boolean z10, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(listBodyItems, "listBodyItems");
        Composer composerStartRestartGroup = composer.startRestartGroup(-441357575);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(listBodyItems) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-441357575, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.StatelessListBody (DisplayListBody.kt:127)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(listBodyItems) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Xm.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return i.p(listBodyItems, z10, (w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            C17983Z.a(null, C5489q0.INSTANCE.f(), H1.h.p(1), 0.0f, composerStartRestartGroup, 432, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Xm.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.r(listBodyItems, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list, boolean z10, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), new h(new Function1() { // from class: Xm.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.q((ListBodyItem) obj);
            }
        }, list), new C0902i(g.f42350f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new j(list, z10)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(ListBodyItem listBodyItem) {
        Intrinsics.j(listBodyItem, "listBodyItem");
        return listBodyItem.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(List list, boolean z10, int i10, Composer composer, int i11) {
        o(list, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
