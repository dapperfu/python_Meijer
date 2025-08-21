package Pr;

import Ki.C;
import Ki.LocalThemeScope;
import Pr.C4629i;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import el.SpecialOffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001ak\u0010\u000f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lel/b;", "couponItems", "", "totalCouponsCount", "Lkotlin/Function1;", "LPk/a;", "", "onCouponClicked", "onCouponActionButtonClicked", "Lkotlin/Function0;", "onViewAllSpecialOffersClicked", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pr.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C4629i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pr.i$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26780b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26781c;

        a(LocalThemeScope localThemeScope, int i10, Function0<Unit> function0) {
            this.f26779a = localThemeScope;
            this.f26780b = i10;
            this.f26781c = function0;
        }

        public final void b(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-257228880, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponHorizontalCarouselView.<anonymous>.<anonymous>.<anonymous> (CouponHorizontalCarouselView.kt:57)");
            }
            LocalThemeScope localThemeScope = this.f26779a;
            C.b.g.f fVar = C.b.g.f.f17002e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Nr.g.f22691h0, Integer.valueOf(this.f26780b));
            Ki.T adsColorBrandPrimary = this.f26779a.getAdsColors().getAdsColorBrandPrimary();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f26781c);
            final Function0<Unit> function0 = this.f26781c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pr.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4629i.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Gj.b.b(localThemeScope, fVar, abstractC6392aD, adsColorBrandPrimary, null, (Function0) objB, composer, LocalThemeScope.f17314g | (C.b.g.f.f17003f << 3) | (AbstractC6392a.f60445b << 6) | (Ki.T.f17342b << 9), 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            b(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Pr.i$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f26782f = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(SpecialOffer specialOffer) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Pr.i$c */
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f26783f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f26784g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, List list) {
            super(1);
            this.f26783f = function1;
            this.f26784g = list;
        }

        public final Object a(int i10) {
            return this.f26783f.invoke(this.f26784g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    /* renamed from: Pr.i$d */
    public static final class d extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f26785f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26786g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f26787h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1 f26788i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, LocalThemeScope localThemeScope, Function1 function1, Function1 function12) {
            super(4);
            this.f26785f = list;
            this.f26786g = localThemeScope;
            this.f26787h = function1;
            this.f26788i = function12;
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
            SpecialOffer specialOffer = (SpecialOffer) this.f26785f.get(i10);
            composer.startReplaceGroup(1090258019);
            LocalThemeScope localThemeScope = this.f26786g;
            F.c(localThemeScope, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 11, null), specialOffer, this.f26787h, this.f26788i, composer, LocalThemeScope.f17314g, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final java.util.List<el.SpecialOffer> r24, int r25, final kotlin.jvm.functions.Function1<? super Pk.Coupon, kotlin.Unit> r26, final kotlin.jvm.functions.Function1<? super Pk.Coupon, kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.C4629i.c(Ki.M, androidx.compose.ui.Modifier, java.util.List, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(List list, int i10, LocalThemeScope localThemeScope, Function1 function1, Function1 function12, Function0 function0, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new c(b.f26782f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new d(list, localThemeScope, function1, function12)));
        if (i10 > 3) {
            l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-257228880, true, new a(localThemeScope, i10, function0)), 3, null);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, List list, int i10, Function1 function1, Function1 function12, Function0 function0, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, list, i10, function1, function12, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
