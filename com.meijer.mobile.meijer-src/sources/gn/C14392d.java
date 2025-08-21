package gn;

import Bm.C3001k;
import H1.h;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import hn.C14544c;
import hn.EbtTransactionItemDecorator;
import hn.TransactionDecorator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import l0.w;
import p1.C16338g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0083\u0001\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lbk/a;", "header", "bottomButtonLabel", "", "showInformationMessage", "displayExtendedRangeInfo", "isDisplayEBTHistoryBottomSheet", "isDisplayCreditCardHistoryBottomSheet", "", "Lhn/c;", "creditCardList", "Lhn/d;", "ebtTransactionList", "Lkotlin/Function0;", "", "onCloseBottomSheet", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lbk/a;ZZZZLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gn.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14392d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.d$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f134351a;

        a(LocalThemeScope localThemeScope) {
            this.f134351a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1895532310, i10, -1, "com.meijer.mobile.meijer.activity.orders.compose.OrderDetailBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailBottomSheetContent.kt:105)");
            }
            C3001k.b(this.f134351a, null, C16338g.c(Y.f101235v5, composer, 0), null, composer, LocalThemeScope.f17314g, 5);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.d$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f134352a;

        b(LocalThemeScope localThemeScope) {
            this.f134352a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-661468023, i10, -1, "com.meijer.mobile.meijer.activity.orders.compose.OrderDetailBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailBottomSheetContent.kt:113)");
            }
            C3001k.b(this.f134352a, null, C16338g.c(Y.f101266wg, composer, 0), C16338g.c(Y.f101286xg, composer, 0), composer, LocalThemeScope.f17314g, 1);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: gn.d$c */
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f134353f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f134353f = list;
        }

        public final Object a(int i10) {
            this.f134353f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: gn.d$d, reason: collision with other inner class name */
    public static final class C2124d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f134354f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f134355g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f134356h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2124d(List list, LocalThemeScope localThemeScope, Modifier modifier) {
            super(4);
            this.f134354f = list;
            this.f134355g = localThemeScope;
            this.f134356h = modifier;
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
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            TransactionDecorator transactionDecorator = (TransactionDecorator) this.f134354f.get(i10);
            composer.startReplaceGroup(925545317);
            C14394f.b(this.f134355g, this.f134356h, transactionDecorator, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6));
            C17983Z.a(D.k(this.f134356h, h.p(8), 0.0f, 2, null), 0L, 0.0f, 0.0f, composer, 0, 14);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: gn.d$e */
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f134357f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f134357f = list;
        }

        public final Object a(int i10) {
            this.f134357f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: gn.d$f */
    public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f134358f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f134359g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f134360h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope, Modifier modifier) {
            super(4);
            this.f134358f = list;
            this.f134359g = localThemeScope;
            this.f134360h = modifier;
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
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            TransactionDecorator transactionDecorator = (TransactionDecorator) this.f134358f.get(i10);
            composer.startReplaceGroup(-2095920484);
            C14394f.b(this.f134359g, this.f134360h, transactionDecorator, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6));
            C17983Z.a(D.k(this.f134360h, h.p(8), 0.0f, 2, null), 0L, 0.0f, 0.0f, composer, 0, 14);
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r37, androidx.compose.ui.Modifier r38, bk.AbstractC6392a r39, bk.AbstractC6392a r40, final boolean r41, final boolean r42, final boolean r43, final boolean r44, java.util.List<hn.C14544c> r45, java.util.List<hn.EbtTransactionItemDecorator> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.C14392d.d(Ki.M, androidx.compose.ui.Modifier, bk.a, bk.a, boolean, boolean, boolean, boolean, java.util.List, java.util.List, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(boolean z10, List list, boolean z11, List list2, boolean z12, boolean z13, LocalThemeScope localThemeScope, Modifier modifier, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        if (z10) {
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(TransactionDecorator.INSTANCE.b((EbtTransactionItemDecorator) it.next()));
            }
            LazyColumn.i(arrayList.size(), null, new c(arrayList), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C2124d(arrayList, localThemeScope, modifier)));
        }
        if (z11) {
            List list4 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TransactionDecorator.INSTANCE.a((C14544c) it2.next()));
            }
            LazyColumn.i(arrayList2.size(), null, new e(arrayList2), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new f(arrayList2, localThemeScope, modifier)));
        }
        if (z12) {
            w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1895532310, true, new a(localThemeScope)), 3, null);
        }
        if (z13) {
            w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-661468023, true, new b(localThemeScope)), 3, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z10, boolean z11, boolean z12, boolean z13, List list, List list2, Function0 function0, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, modifier, abstractC6392a, abstractC6392a2, z10, z11, z12, z13, list, list2, function0, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
