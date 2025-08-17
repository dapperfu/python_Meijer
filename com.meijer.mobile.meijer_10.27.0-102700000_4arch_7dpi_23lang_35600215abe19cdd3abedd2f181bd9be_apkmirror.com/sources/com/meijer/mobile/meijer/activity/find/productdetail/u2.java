package com.meijer.mobile.meijer.activity.find.productdetail;

import Co.ProductFullDetails;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.medallia.digital.mobilesdk.l3;
import java.util.List;
import ji.InterfaceC14920X;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0013\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\nH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "carouselTitle", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "loadingState", "", "Lvs/c;", "productList", "Lkotlin/Function2;", "LCo/h;", "", "", "onProductClicked", "Lkotlin/Function0;", "onRetryClicked", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "onEntryUpdate", "b", "(LJi/M;Landroidx/compose/ui/Modifier;ILcom/meijer/mobile/meijer/activity/find/viewmodel/r;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "productDecorator1", "productDecorator2", "c", "productDecorator3", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    private static final SuggestedProductCarouselDecorator f107799a = new SuggestedProductCarouselDecorator(new ProductFullDetails(null, "Cinnamon Chex", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -3, 268435455, null), "product1", "Cinnamon Chex", null, null, null, true, false, Co.l.f(null, null, 0.0d, "$3.47", 0.0d, null, 55, null), Co.l.f(null, null, 0.0d, "$3.97/ea", 0.0d, null, 55, null), Co.l.c(false, null, null, null, 0.0d, null, null, 0, 0.5d, l3.f92484c, null), null, 0.0d, false, false, null, null, null, false, null, 1046712, null);

    /* renamed from: b, reason: collision with root package name */
    private static final SuggestedProductCarouselDecorator f107800b = new SuggestedProductCarouselDecorator(new ProductFullDetails(null, "Banana", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -3, 268435455, null), "product2", "Banana", null, null, null, false, true, Co.l.f(null, null, 0.0d, "$1.26", 0.0d, null, 55, null), Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null), null, null, 0.0d, false, false, null, null, null, false, null, 1047608, null);

    /* renamed from: c, reason: collision with root package name */
    private static final SuggestedProductCarouselDecorator f107801c = new SuggestedProductCarouselDecorator(new ProductFullDetails(null, "Crispy Apple", 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -3, 268435455, null), "product3", "Crispy Apple", null, null, null, false, false, Co.l.f(null, null, 0.0d, "$2.99", 0.0d, null, 55, null), Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null), null, null, 0.0d, false, false, null, null, null, false, null, 1047736, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f107802a;

        a(LocalThemeScope localThemeScope) {
            this.f107802a = localThemeScope;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1807855292, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselSection.<anonymous>.<anonymous> (SuggestedProductCarouselSection.kt:59)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.d(this.f107802a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.meijer.mobile.meijer.activity.find.viewmodel.r.values().length];
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f108962c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f108961b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f108960a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.meijer.mobile.meijer.activity.find.viewmodel.r.f108963d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r31, androidx.compose.ui.Modifier r32, final int r33, final com.meijer.mobile.meijer.activity.find.viewmodel.r r34, java.util.List<? extends vs.InterfaceC17607c> r35, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super java.lang.String, kotlin.Unit> r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final kotlin.jvm.functions.Function2<? super Co.ProductFullDetails, ? super com.meijer.mobile.core.design.widget.stepperview.a, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.productdetail.u2.b(Ji.M, androidx.compose.ui.Modifier, int, com.meijer.mobile.meijer.activity.find.viewmodel.r, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, int i10, com.meijer.mobile.meijer.activity.find.viewmodel.r rVar, List list, Function2 function2, Function0 function0, Function2 function22, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, i10, rVar, list, function2, function0, function22, composer, androidx.compose.runtime.J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }
}
