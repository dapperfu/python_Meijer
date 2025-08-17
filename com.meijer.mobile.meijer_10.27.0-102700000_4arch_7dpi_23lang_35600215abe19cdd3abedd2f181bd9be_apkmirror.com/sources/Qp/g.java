package Qp;

import H1.h;
import Ji.LocalThemeScope;
import Qp.g;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import eq.Asset;
import eq.C13729d;
import j0.InterfaceC14794C;
import java.util.ArrayList;
import java.util.List;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.w;
import mq.y;
import tv.P;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Lmq/y;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "n", "(LJi/M;Lmq/y;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lmq/y$c;", "viewState", "Lkotlin/Function1;", "Lmq/y$b;", "sendEvent", "f", "(LJi/M;Lmq/y$c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31223a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f31224b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.b, Unit> f31225c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super y.b, Unit> function1) {
            this.f31223a = localThemeScope;
            this.f31224b = viewState;
            this.f31225c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(y.b.e.f150497a);
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1270816573, i10, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQContent.<anonymous> (ShopAndScanFAQScreen.kt:56)");
            }
            LocalThemeScope localThemeScope = this.f31223a;
            AbstractC5607a appBarTitle = this.f31224b.getAppBarTitle();
            Asset navigationIcon = this.f31224b.getNavigationIcon();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f31225c);
            final Function1<y.b, Unit> function1 = this.f31225c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Qp.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13729d.d(localThemeScope, appBarTitle, navigationIcon, null, (Function0) objB, null, composer, 196608 | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31226a;

        b(LocalThemeScope localThemeScope) {
            this.f31226a = localThemeScope;
        }

        public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) throws Resources.NotFoundException {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-524728662, i10, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQContent.<anonymous> (ShopAndScanFAQScreen.kt:65)");
            }
            g.h(this.f31226a, D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) throws Resources.NotFoundException {
            a(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Qp/g$c", "", "", "question", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qp.g$c, reason: from toString */
    public static final /* data */ class FAQItem {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String question;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String answer;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FAQItem)) {
                return false;
            }
            FAQItem fAQItem = (FAQItem) other;
            return Intrinsics.e(this.question, fAQItem.question) && Intrinsics.e(this.answer, fAQItem.answer);
        }

        public FAQItem(String question, String answer) {
            Intrinsics.j(question, "question");
            Intrinsics.j(answer, "answer");
            this.question = question;
            this.answer = answer;
        }

        /* renamed from: a, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        /* renamed from: b, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + this.answer.hashCode();
        }

        public String toString() {
            return "FAQItem(question=" + this.question + ", answer=" + this.answer + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f31229f = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FAQItem fAQItem) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f31230f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f31231g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, List list) {
            super(1);
            this.f31230f = function1;
            this.f31231g = list;
        }

        public final Object a(int i10) {
            return this.f31230f.invoke(this.f31231g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f31232f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f31233g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope) {
            super(4);
            this.f31232f = list;
            this.f31233g = localThemeScope;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
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
            FAQItem fAQItem = (FAQItem) this.f31232f.get(i10);
            composer.startReplaceGroup(448814581);
            g.l(this.f31233g, null, fAQItem.getQuestion(), composer, 0, 1);
            g.i(this.f31233g, null, fAQItem.getAnswer(), composer, 0, 1);
            C17917Z.a(null, this.f31233g.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composer, 0, 13);
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

    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void f(final Ji.LocalThemeScope r33, final mq.y.ViewState r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super mq.y.b, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qp.g.f(Ji.M, mq.y$c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, y.ViewState viewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, viewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(LocalThemeScope localThemeScope, Modifier modifier, String str, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-1277821062);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.M()) {
            ComposerKt.U(-1277821062, i10, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQContentComponent.FAQAnswer (ShopAndScanFAQScreen.kt:93)");
        }
        float f10 = 16;
        N1.b(str, D.m(modifier2, h.p(f10), 0.0f, h.p(f10), h.p(17), 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getBodyCompact().getOne().getStyle(), composer, (i10 >> 3) & 14, 0, 65532);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    private static final void j(final LocalThemeScope localThemeScope, Modifier modifier, final List<FAQItem> list, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-2022188499);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-2022188499, i10, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQContentComponent.FAQList (ShopAndScanFAQScreen.kt:115)");
        }
        C5658d.m mVarH = C5658d.f48555a.h();
        composer.startReplaceGroup(-1633490746);
        boolean zD = composer.D(list) | composer.D(localThemeScope);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            objB = new Function1() { // from class: Qp.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g.k(list, localThemeScope, (w) obj);
                }
            };
            composer.t(objB);
        }
        composer.P();
        C15342b.a(modifier, null, null, false, mVarH, null, null, false, null, (Function1) objB, composer, (i10 & 14) | 24576, 494);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(List list, LocalThemeScope localThemeScope, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new e(d.f31229f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new f(list, localThemeScope)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(LocalThemeScope localThemeScope, Modifier modifier, String str, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(1454105682);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.M()) {
            ComposerKt.U(1454105682, i10, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQContentComponent.FAQQuestion (ShopAndScanFAQScreen.kt:75)");
        }
        float f10 = 16;
        N1.b(str, D.l(modifier2, h.p(f10), h.p(f10), h.p(f10), h.p(8)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, localThemeScope.getAdsTypography().getHeadings().getSeven().getStyle(), composer, (i10 >> 3) & 14, 0, 65532);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        h(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void n(LocalThemeScope localThemeScope, final y viewModel, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        LocalThemeScope localThemeScope2;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1755007137);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(viewModel) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1755007137, i12, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQScreen (ShopAndScanFAQScreen.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = viewModel.y().b();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            y.ViewState viewStateO = o(o1.b((P) objB, null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Qp.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.p(viewModel, (y.b) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            f(localThemeScope2, viewStateO, modifier3, (Function1) objB2, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (AbstractC5607a.f45514b << 3) | (i12 & 896), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            final LocalThemeScope localThemeScope3 = localThemeScope2;
            t0L.a(new Function2() { // from class: Qp.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.q(localThemeScope3, viewModel, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(y yVar, y.b event) {
        Intrinsics.j(event, "event");
        yVar.A(event);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, y yVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, yVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) throws Resources.NotFoundException {
        int i12;
        boolean zD;
        int i13;
        int i14;
        final LocalThemeScope localThemeScope2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1274490400);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1274490400, i12, -1, "com.meijer.mobile.shopandscan.activity.general.screens.FAQContentComponent (ShopAndScanFAQScreen.kt:70)");
            }
            Resources resources = ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getResources();
            String[] stringArray = resources.getStringArray(com.meijer.mobile.shopandscan.a.f116754b);
            Intrinsics.i(stringArray, "getStringArray(...)");
            String[] stringArray2 = resources.getStringArray(com.meijer.mobile.shopandscan.a.f116753a);
            Intrinsics.i(stringArray2, "getStringArray(...)");
            ArrayList arrayList = new ArrayList(stringArray.length);
            int length = stringArray.length;
            int i16 = 0;
            int i17 = 0;
            while (i16 < length) {
                String str = stringArray[i16];
                int i18 = i17 + 1;
                Intrinsics.g(str);
                String str2 = stringArray2[i17];
                Intrinsics.i(str2, "get(...)");
                arrayList.add(new FAQItem(str, str2));
                i16++;
                i17 = i18;
            }
            localThemeScope2 = localThemeScope;
            j(localThemeScope2, modifier2, arrayList, composerStartRestartGroup, (i12 >> 3) & 14, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qp.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.m(localThemeScope2, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final y.ViewState o(z1<y.ViewState> z1Var) {
        return z1Var.getValue();
    }
}
