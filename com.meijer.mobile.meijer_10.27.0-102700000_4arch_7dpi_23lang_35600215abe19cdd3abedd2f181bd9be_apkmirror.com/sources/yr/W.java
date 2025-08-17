package yr;

import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import j0.InterfaceC14800I;
import ji.C14949n;
import ji.j1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15343c;
import ni.E0;
import pi.C16307b;
import r1.C16705m;
import yr.W;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\u000e\u0010\u0002\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "rating", "Landroidx/compose/ui/Modifier;", "modifier", "maxStars", "Lkotlin/Function1;", "", "onRatingChanged", "c", "(LJi/M;ILandroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class W {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f171034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f171035b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f171036c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171037d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f171038e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: yr.W$a$a, reason: collision with other inner class name */
        static final class C2754a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f171039a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f171040b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f171041c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f171042d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f171043e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f171044f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: yr.W$a$a$a, reason: collision with other inner class name */
            static final class C2755a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f171045a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f171046b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f171047c;

                C2755a(LocalThemeScope localThemeScope, boolean z10, String str) {
                    this.f171045a = localThemeScope;
                    this.f171046b = z10;
                    this.f171047c = str;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1323020802, i10, -1, "com.meijer.mobile.ui.common.RatingBarComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RatingBarComposable.kt:75)");
                    }
                    C16307b.b(this.f171045a, new q1.h.DrawableIcon(this.f171046b ? C.j.x.f15599d : C.j.B.f15568d, this.f171047c, null, null, 0.0f, null, null, 124, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C2754a(LocalThemeScope localThemeScope, String str, int i10, int i11, Function1<? super Integer, Unit> function1, boolean z10) {
                this.f171039a = localThemeScope;
                this.f171040b = str;
                this.f171041c = i10;
                this.f171042d = i11;
                this.f171043e = function1;
                this.f171044f = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(String str, int i10, int i11, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                r1.s.t0(semantics, i10 == i11);
                return Unit.f142422a;
            }

            public final void c(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1558364431, i10, -1, "com.meijer.mobile.ui.common.RatingBarComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RatingBarComposable.kt:63)");
                }
                LocalThemeScope localThemeScope = this.f171039a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean zV = composer.V(this.f171040b) | composer.d(this.f171041c) | composer.d(this.f171042d);
                final String str = this.f171040b;
                final int i11 = this.f171041c;
                final int i12 = this.f171042d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: yr.U
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W.a.C2754a.d(str, i11, i12, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                float f10 = 48;
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.z(C16705m.d(companion, false, (Function1) objB, 1, null), H1.h.p(f10)), H1.h.p(f10)), false, null, 895, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(this.f171043e) | composer.d(this.f171042d);
                final Function1<Integer, Unit> function1 = this.f171043e;
                final int i13 = this.f171042d;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: yr.V
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W.a.C2754a.e(function1, i13);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB2, ComposableLambdaKt.c(1323020802, true, new C2755a(this.f171039a, this.f171044f, this.f171040b), composer, 54), composer, (q1.d.StandardButton.f139974k << 3) | LocalThemeScope.f15770g | 3072);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                c(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function1 function1, int i10) {
                function1.invoke(Integer.valueOf(i10));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, int i12, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1) {
            this.f171034a = i10;
            this.f171035b = i11;
            this.f171036c = i12;
            this.f171037d = localThemeScope;
            this.f171038e = function1;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(74333683, i10, -1, "com.meijer.mobile.ui.common.RatingBarComposable.<anonymous>.<anonymous>.<anonymous> (RatingBarComposable.kt:54)");
            }
            int i11 = this.f171034a;
            int i12 = this.f171035b;
            boolean z10 = i11 >= i12;
            String strA = C6408b.a(AbstractC5607a.INSTANCE.d(Q.f170978U, Integer.valueOf(i12), Integer.valueOf(this.f171036c)), composer, AbstractC5607a.f45514b);
            LocalThemeScope localThemeScope = this.f171037d;
            Ji.Q.e(localThemeScope, C14949n.f139910a, ComposableLambdaKt.c(1558364431, true, new C2754a(localThemeScope, strA, this.f171034a, this.f171035b, this.f171038e, z10), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14949n.f139911b << 3));
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r20, final int r21, androidx.compose.ui.Modifier r22, int r23, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.W.c(Ji.M, int, androidx.compose.ui.Modifier, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(int i10, int i11, LocalThemeScope localThemeScope, Function1 function1, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        if (1 <= i10) {
            int i12 = 1;
            while (true) {
                int i13 = i11;
                LocalThemeScope localThemeScope2 = localThemeScope;
                Function1 function12 = function1;
                l0.w wVar = LazyRow;
                l0.w.g(wVar, Integer.valueOf(i12), null, ComposableLambdaKt.composableLambdaInstance(74333683, true, new a(i13, i12, i10, localThemeScope2, function12)), 2, null);
                if (i12 == i10) {
                    break;
                }
                i12++;
                function1 = function12;
                LazyRow = wVar;
                localThemeScope = localThemeScope2;
                i11 = i13;
            }
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, int i10, Modifier modifier, int i11, Function1 function1, int i12, int i13, Composer composer, int i14) {
        c(localThemeScope, i10, modifier, i11, function1, composer, J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }
}
