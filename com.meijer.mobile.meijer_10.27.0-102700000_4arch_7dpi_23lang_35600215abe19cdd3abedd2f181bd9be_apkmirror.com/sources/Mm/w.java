package Mm;

import Ji.LocalThemeScope;
import Rm.g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import zp.DigitalReceipt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001f²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "LRm/g$c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LLm/a;", "", "onAction", "d", "(LJi/M;LRm/g$c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "j$/time/YearMonth", "yearMonth", "", "", "Lzp/b;", "yearMonthReceipts", "LRm/g$b;", "yearMonthReceiptSummary", "", "k", "(Lj$/time/YearMonth;Ljava/util/Map;Ljava/util/Map;)Z", "j$/time/LocalDate", "receiptSinceDate", "g", "(LJi/M;Lj$/time/LocalDate;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "shouldShowReceipts", "Lzp/b$b;", "processingStatus", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.ReceiptsAndSavingsListViewState f19860b;

        a(LocalThemeScope localThemeScope, g.ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState) {
            this.f19859a = localThemeScope;
            this.f19860b = receiptsAndSavingsListViewState;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1442952024, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.digitalreceipts.ReceiptsAndSavingsList.<anonymous>.<anonymous>.<anonymous> (ReceiptsAndSavingsListCompose.kt:80)");
            }
            w.g(this.f19859a, this.f19860b.getReceiptsSinceDate(), null, composer, LocalThemeScope.f15770g, 2);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19861f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(YearMonth yearMonth) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f19862f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f19863g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f19862f = function1;
            this.f19863g = list;
        }

        public final Object a(int i10) {
            return this.f19862f.invoke(this.f19863g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f19864f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g.ReceiptsAndSavingsListViewState f19865g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19866h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f19867i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, g.ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f19864f = list;
            this.f19865g = receiptsAndSavingsListViewState;
            this.f19866h = localThemeScope;
            this.f19867i = function1;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            Composer composer2;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
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
            YearMonth yearMonth = (YearMonth) this.f19864f.get(i10);
            composer.startReplaceGroup(1313373745);
            if (w.k(yearMonth, this.f19865g.e(), this.f19865g.d())) {
                composer.startReplaceGroup(1313612661);
                boolean zE = Intrinsics.e(CollectionsKt.u0(this.f19865g.b()), yearMonth);
                List<DigitalReceipt> listM = this.f19865g.e().get(yearMonth);
                if (listM == null) {
                    listM = CollectionsKt.m();
                }
                composer2 = composer;
                s.j(this.f19866h, yearMonth, listM, null, zE, this.f19865g.d().get(yearMonth), this.f19867i, composer2, LocalThemeScope.f15770g, 4);
                composer2.P();
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(1314013770);
                s.j(this.f19866h, yearMonth, CollectionsKt.m(), null, Intrinsics.e(CollectionsKt.u0(this.f19865g.b()), yearMonth), null, this.f19867i, composer2, LocalThemeScope.f15770g | 384, 20);
                composer2.P();
            }
            composer2.P();
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r19, final Rm.g.ReceiptsAndSavingsListViewState r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function1<? super Lm.a, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.w.d(Ji.M, Rm.g$c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(g.ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        List<YearMonth> listB = receiptsAndSavingsListViewState.b();
        LazyColumn.i(listB.size(), null, new c(b.f19861f, listB), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(listB, receiptsAndSavingsListViewState, localThemeScope, function1)));
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1442952024, true, new a(localThemeScope, receiptsAndSavingsListViewState)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, g.ReceiptsAndSavingsListViewState receiptsAndSavingsListViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, receiptsAndSavingsListViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r27, final j$.time.LocalDate r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mm.w.g(Ji.M, j$.time.LocalDate, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, LocalDate localDate, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, localDate, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(YearMonth yearMonth, Map<YearMonth, ? extends List<DigitalReceipt>> map, Map<YearMonth, g.ReceiptSummary> map2) {
        if (map.containsKey(yearMonth) && map2.containsKey(yearMonth)) {
            return true;
        }
        return false;
    }
}
