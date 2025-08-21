package fn;

import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsListItem;
import dk.C13698b;
import j0.C14890K;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;
import yr.Q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u0010²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "orderOptionsListItem", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "onClick", "d", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/orderoptions/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isSelected", "isPrimaryAddress", "", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fn.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14042j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fn.j$a */
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f132122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderOptionsListItem f132123b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: fn.j$a$a, reason: collision with other inner class name */
        static final class C2096a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f132124a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderOptionsListItem f132125b;

            C2096a(LocalThemeScope localThemeScope, OrderOptionsListItem orderOptionsListItem) {
                this.f132124a = localThemeScope;
                this.f132125b = orderOptionsListItem;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1587446337, i10, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionsListItemView.<anonymous>.<anonymous> (OrderOptionsListItemView.kt:64)");
                }
                LocalThemeScope localThemeScope = this.f132124a;
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f132124a.getAdsTypography().getHeadings().getSeven(), null, 383, null);
                AbstractC6392a nameWithDistance = this.f132125b.getNameWithDistance();
                int i11 = AbstractC6392a.f60445b;
                String strA = C13698b.a(nameWithDistance, composer, i11);
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
                LocalThemeScope localThemeScope2 = this.f132124a;
                si.j.h(localThemeScope2, new q1.Label(null, this.f132124a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getOne(), null, 381, null), C13698b.a(this.f132125b.getAddressLine1(), composer, i11), null, composer, i12 | (i13 << 3), 4);
                LocalThemeScope localThemeScope3 = this.f132124a;
                si.j.h(localThemeScope3, new q1.Label(null, this.f132124a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 381, null), C13698b.a(this.f132125b.getAddressLine2(), composer, i11), null, composer, i12 | (i13 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                a(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, OrderOptionsListItem orderOptionsListItem) {
            this.f132122a = localThemeScope;
            this.f132123b = orderOptionsListItem;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-236060343, i11, -1, "com.meijer.mobile.meijer.activity.orderoptions.compose.OrderOptionsListItemView.<anonymous> (OrderOptionsListItemView.kt:63)");
            }
            LocalThemeScope localThemeScope = this.f132122a;
            q1.Column column = new q1.Column(null, null, null, 7, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1587446337, true, new C2096a(this.f132122a, this.f132123b), composer, 54);
            int i12 = LocalThemeScope.f17314g;
            C16453n.e(localThemeScope, column, composableLambdaC, composer, i12 | 384 | (q1.Column.f142240d << 3));
            C14890K.a(InterfaceC14888I.b(AdsRow, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
            if (this.f132123b.getIsSelected()) {
                C16671b.b(this.f132122a, new q1.h.DrawableIcon(C.f.m.f17063e, C16338g.c(Q.f171776j, composer, 0), null, null, 0.0f, null, null, 124, null), null, null, composer, i12 | (q1.h.DrawableIcon.f142322h << 3), 6);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsListItem r23, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.orderoptions.y.e, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.C14042j.d(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.orderoptions.s, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(OrderOptionsListItem orderOptionsListItem, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.t0(semantics, orderOptionsListItem.getIsSelected());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, OrderOptionsListItem orderOptionsListItem, Function1 function1, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, orderOptionsListItem, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function1 function1, OrderOptionsListItem orderOptionsListItem) {
        function1.invoke(orderOptionsListItem.getAction());
        return Unit.f143329a;
    }
}
