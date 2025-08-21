package km;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import dk.C13698b;
import java.util.List;
import ki.q1;
import km.C15239Q;
import kotlin.A1;
import kotlin.AbstractC16037C;
import kotlin.C1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\n*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKi/M;", "", "Lkm/O;", "items", "Lo0/C;", "pagerState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "", "onTabClick", "b", "(LKi/M;Ljava/util/List;Lo0/C;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: km.Q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15239Q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.Q$a */
    static final class a implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f142784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142785b;

        a(AbstractC16037C abstractC16037C, LocalThemeScope localThemeScope) {
            this.f142784a = abstractC16037C;
            this.f142785b = localThemeScope;
        }

        public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
            Intrinsics.j(tabPositions, "tabPositions");
            if (ComposerKt.M()) {
                ComposerKt.U(-501446789, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabs.<anonymous> (HomeMperksTabs.kt:47)");
            }
            C1 c12 = C1.f167869a;
            c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(this.f142784a.v())), 0.0f, this.f142785b.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, C1.f167873e << 9, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            a(list, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: km.Q$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<AbstractC15237O> f142786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f142787b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142788c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f142789d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f142790e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.views.HomeMperksTabsKt$HomeMperksTabs$2$1$1$1$1", f = "HomeMperksTabs.kt", l = {75}, m = "invokeSuspend")
        /* renamed from: km.Q$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f142791a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f142792b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f142793c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC16037C abstractC16037C, int i10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f142792b = abstractC16037C;
                this.f142793c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f142792b, this.f142793c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f142791a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    AbstractC16037C abstractC16037C = this.f142792b;
                    int i11 = this.f142793c;
                    this.f142791a = 1;
                    if (AbstractC16037C.n(abstractC16037C, i11, 0.0f, null, this, 6, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.Q$b$b, reason: collision with other inner class name */
        static final class C2263b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f142794a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f142795b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f142796c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC15237O f142797d;

            C2263b(LocalThemeScope localThemeScope, AbstractC16037C abstractC16037C, int i10, AbstractC15237O abstractC15237O) {
                this.f142794a = localThemeScope;
                this.f142795b = abstractC16037C;
                this.f142796c = i10;
                this.f142797d = abstractC15237O;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1872811, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabs.<anonymous>.<anonymous>.<anonymous> (HomeMperksTabs.kt:59)");
                }
                LocalThemeScope localThemeScope = this.f142794a;
                si.j.h(localThemeScope, new q1.Label(null, this.f142795b.v() == this.f142796c ? this.f142794a.getAdsColors().getAdsColorText03() : this.f142794a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C13698b.a(this.f142797d.getTitle(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends AbstractC15237O> list, AbstractC16037C abstractC16037C, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1, InterfaceC15783O interfaceC15783O) {
            this.f142786a = list;
            this.f142787b = abstractC16037C;
            this.f142788c = localThemeScope;
            this.f142789d = function1;
            this.f142790e = interfaceC15783O;
        }

        public final void b(Composer composer, int i10) {
            Composer composer2 = composer;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2062793083, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabs.<anonymous> (HomeMperksTabs.kt:56)");
            }
            List<AbstractC15237O> list = this.f142786a;
            final AbstractC16037C abstractC16037C = this.f142787b;
            LocalThemeScope localThemeScope = this.f142788c;
            final Function1<Integer, Unit> function1 = this.f142789d;
            final InterfaceC15783O interfaceC15783O = this.f142790e;
            final int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.w();
                }
                AbstractC15237O abstractC15237O = (AbstractC15237O) obj;
                boolean z10 = abstractC16037C.v() == i11;
                long color = localThemeScope.getAdsColors().getAdsColorText03().getColor();
                long color2 = localThemeScope.getAdsColors().getAdsColorText01().getColor();
                composer2.startReplaceGroup(-1224400529);
                boolean zV = composer2.V(function1) | composer2.d(i11) | composer2.D(interfaceC15783O) | composer2.V(abstractC16037C);
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: km.S
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15239Q.b.c(function1, i11, interfaceC15783O, abstractC16037C);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                A1.b(z10, (Function0) objB, null, false, ComposableLambdaKt.c(1872811, true, new C2263b(localThemeScope, abstractC16037C, i11, abstractC15237O), composer2, 54), null, null, color, color2, composer2, 24576, 108);
                composer2 = composer;
                i11 = i12;
                interfaceC15783O = interfaceC15783O;
                localThemeScope = localThemeScope;
                function1 = function1;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1, int i10, InterfaceC15783O interfaceC15783O, AbstractC16037C abstractC16037C) {
            function1.invoke(Integer.valueOf(i10));
            C15809k.d(interfaceC15783O, null, null, new a(abstractC16037C, i10, null), 3, null);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r20, final java.util.List<? extends km.AbstractC15237O> r21, final kotlin.AbstractC16037C r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.C15239Q.b(Ki.M, java.util.List, o0.C, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, List list, AbstractC16037C abstractC16037C, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, list, abstractC16037C, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
