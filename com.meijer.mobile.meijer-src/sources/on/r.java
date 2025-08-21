package on;

import Hl.FlyBuyOrderDetail;
import Ki.C;
import Ki.LocalThemeScope;
import Rn.FlyBuyState;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import gj.PickupPerson;
import hj.OrderDetail;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jn.AbstractC15054a;
import jn.AbstractC15055b;
import ki.C15207z;
import ki.InterfaceC15154X;
import ki.InterfaceC15205y;
import ki.Q0;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18000f;
import kotlin.C6304d;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import on.r;
import p1.C16338g;
import sn.C17092h;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\u0011\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u000b\u001a\u001b\u0010\u0016\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001f\u0010\u000b\u001a]\u0010)\u001a\u00020\u0006*\u00020\u00002\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060'H\u0003¢\u0006\u0004\b)\u0010*\"\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060²\u0006\u000e\u0010/\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "toolbarTitle", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onUpPressed", "z", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "x", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "title", "message", "positiveButtonText", "", "visible", "p", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "K", "Lsn/h$e;", "viewState", "u", "(LKi/M;Lsn/h$e;Landroidx/compose/runtime/Composer;I)V", "r", "(Lsn/h$e;Landroidx/compose/runtime/Composer;I)V", "S", "(Lsn/h$e;)Ljava/lang/String;", "R", "G", "(LKi/M;ZLandroidx/compose/runtime/Composer;I)V", "I", "caption", "placeHolder", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "initialTextValue", "Lkotlin/Function1;", "onTextChanged", "B", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lsn/h;", "a", "Lsn/h;", "viewModel", "textState", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static C17092h f154998a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f154999a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155001c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f155002d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f155003e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: on.r$a$a, reason: collision with other inner class name */
        static final class C2401a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155004a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f155005b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f155006c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: on.r$a$a$a, reason: collision with other inner class name */
            static final class C2402a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f155007a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f155008b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f155009c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: on.r$a$a$a$a, reason: collision with other inner class name */
                static final class C2403a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f155010a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f155011b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f155012c;

                    C2403a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                        this.f155010a = localThemeScope;
                        this.f155011b = j1Var;
                        this.f155012c = str;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(267000639, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:138)");
                        }
                        si.j.h(this.f155010a, q1.Label.y(this.f155011b.getLabels().getEnabledLabel(), null, this.f155010a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, null, null, 509, null), this.f155012c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

                C2402a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, String str) {
                    this.f155007a = localThemeScope;
                    this.f155008b = interfaceC5872l0;
                    this.f155009c = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                    interfaceC5872l0.setValue(Boolean.FALSE);
                    return Unit.f143329a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(366862802, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog.<anonymous>.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:134)");
                    }
                    LocalThemeScope localThemeScope = this.f155007a;
                    q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                    composer.startReplaceGroup(5004770);
                    final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f155008b;
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: on.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return r.a.C2401a.C2402a.c(interfaceC5872l0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(267000639, true, new C2403a(this.f155007a, Assemble, this.f155009c), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C2401a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, String str) {
                this.f155004a = localThemeScope;
                this.f155005b = interfaceC5872l0;
                this.f155006c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1627614866, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:133)");
                }
                LocalThemeScope localThemeScope = this.f155004a;
                Ki.Q.e(localThemeScope, C15207z.f142557a, ComposableLambdaKt.c(366862802, true, new C2402a(localThemeScope, this.f155005b, this.f155006c), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15207z.f142558b << 3));
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155013a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f155014b;

            b(LocalThemeScope localThemeScope, String str) {
                this.f155013a = localThemeScope;
                this.f155014b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(257185329, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:121)");
                }
                si.j.h(this.f155013a, new q1.Label(null, null, null, null, 0, false, 0, this.f155013a.getAdsTypography().getBody().getTwo(), null, 383, null), this.f155014b, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155015a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f155016b;

            c(LocalThemeScope localThemeScope, String str) {
                this.f155015a = localThemeScope;
                this.f155016b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1977859470, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:127)");
                }
                si.j.h(this.f155015a, new q1.Label(null, null, null, null, 0, false, 0, this.f155015a.getAdsTypography().getBody().getTwo(), null, 383, null), this.f155016b, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(InterfaceC5872l0<Boolean> interfaceC5872l0, LocalThemeScope localThemeScope, String str, String str2, String str3) {
            this.f154999a = interfaceC5872l0;
            this.f155000b = localThemeScope;
            this.f155001c = str;
            this.f155002d = str2;
            this.f155003e = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
            interfaceC5872l0.setValue(Boolean.FALSE);
            return Unit.f143329a;
        }

        public final void b(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(553742630, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog.<anonymous> (FlyBuyCheckInScreen.kt:118)");
            }
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f154999a;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.a.c(interfaceC5872l0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C18000f.a((Function0) objB, ComposableLambdaKt.c(-1627614866, true, new C2401a(this.f155000b, this.f154999a, this.f155001c), composer, 54), null, null, ComposableLambdaKt.c(257185329, true, new b(this.f155000b, this.f155002d), composer, 54), ComposableLambdaKt.c(-1977859470, true, new c(this.f155000b, this.f155003e), composer, 54), null, 0L, 0L, null, composer, 221238, 972);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            b(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155017a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155018b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f155019c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155020a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f155021b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f155020a = localThemeScope;
                this.f155021b = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(400086128, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyCheckInScreen.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:85)");
                }
                Dr.g.g(this.f155020a, this.f155021b, null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        b(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f155017a = localThemeScope;
            this.f155018b = function0;
            this.f155019c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1482273072, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyCheckInScreen.<anonymous> (FlyBuyCheckInScreen.kt:83)");
            }
            Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
            C.f.d dVar = C.f.d.f17051e;
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100572N8, new Object[0]);
            LocalThemeScope localThemeScope = this.f155017a;
            Dr.g.f(localThemeScope, modifierH, null, null, ComposableLambdaKt.c(400086128, true, new a(localThemeScope, this.f155019c), composer, 54), this.f155018b, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24624 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 198);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155022a;

        c(LocalThemeScope localThemeScope) {
            this.f155022a = localThemeScope;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) throws Exception {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-604910121, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyCheckInScreen.<anonymous> (FlyBuyCheckInScreen.kt:92)");
            }
            r.x(this.f155022a, androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), composer, LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) throws Exception {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f155024b;

        d(LocalThemeScope localThemeScope, String str) {
            this.f155023a = localThemeScope;
            this.f155024b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-949450828, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.FlyBuyOutLinedTextField.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:395)");
            }
            si.j.h(this.f155023a, new q1.Label(null, null, null, null, 0, false, 0, this.f155023a.getAdsTypography().getBody().getOne(), null, 383, null), this.f155024b, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155025a;

        e(LocalThemeScope localThemeScope) {
            this.f155025a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-240440678, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.LoadingState.<anonymous> (FlyBuyCheckInScreen.kt:318)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.d(this.f155025a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f155026a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f155027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f155028b;

            a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f155027a = localThemeScope;
                this.f155028b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(573030007, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:341)");
                }
                LocalThemeScope localThemeScope = this.f155027a;
                q1.Label enabledLabel = this.f155028b.getLabels().getEnabledLabel();
                String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f100374D2, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, enabledLabel, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        f(LocalThemeScope localThemeScope) {
            this.f155026a = localThemeScope;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(884813514, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent.<anonymous>.<anonymous> (FlyBuyCheckInScreen.kt:333)");
            }
            LocalThemeScope localThemeScope = this.f155026a;
            float f10 = 16;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, H1.h.p(f10), H1.h.p(f10)), 0.0f, 1, null), false, null, 895, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: on.s
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.f.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(573030007, true, new a(this.f155026a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 3456 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() throws Exception {
            C17092h c17092h = r.f154998a;
            if (c17092h == null) {
                Intrinsics.x("viewModel");
                c17092h = null;
            }
            c17092h.x(C17092h.c.a.f161274a);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void B(final Ki.LocalThemeScope r64, final java.lang.String r65, final java.lang.String r66, androidx.compose.ui.Modifier r67, final androidx.compose.foundation.text.KeyboardOptions r68, androidx.compose.foundation.text.C5835z r69, final java.lang.String r70, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r71, androidx.compose.runtime.Composer r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.r.B(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Function1 function1, InterfaceC5872l0 interfaceC5872l0, String it) {
        Intrinsics.j(it, "it");
        D(interfaceC5872l0, it);
        function1.invoke(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, KeyboardOptions keyboardOptions, C5835z c5835z, String str3, Function1 function1, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, str, str2, modifier, keyboardOptions, c5835z, str3, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        G(localThemeScope, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        I(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void K(Ki.LocalThemeScope r46, androidx.compose.ui.Modifier r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.r.K(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(String parkingSpot) throws Exception {
        Intrinsics.j(parkingSpot, "parkingSpot");
        C17092h c17092h = f154998a;
        if (c17092h == null) {
            Intrinsics.x("viewModel");
            c17092h = null;
        }
        c17092h.x(new C17092h.c.UpdateParkingSpot(parkingSpot));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(String pickupName) throws Exception {
        Intrinsics.j(pickupName, "pickupName");
        C17092h c17092h = f154998a;
        if (c17092h == null) {
            Intrinsics.x("viewModel");
            c17092h = null;
        }
        c17092h.x(new C17092h.c.UpdatePickupUsername(pickupName));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
        Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
        InterfaceC5914o.l(interfaceC5914o, false, 1, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Exception {
        K(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void p(final LocalThemeScope localThemeScope, final String str, final String str2, final String str3, final boolean z10, Composer composer, final int i10) {
        int i11;
        String str4;
        String str5;
        String str6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1955778306);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            str4 = str;
            i11 |= composerStartRestartGroup.V(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i10 & 384) == 0) {
            str5 = str2;
            i11 |= composerStartRestartGroup.V(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i10 & 3072) == 0) {
            str6 = str3;
            i11 |= composerStartRestartGroup.V(str6) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            str6 = str3;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1955778306, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayAlertDialog (FlyBuyCheckInScreen.kt:114)");
            }
            G(localThemeScope, z10, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | ((i11 >> 9) & 112));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = t1.e(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composerStartRestartGroup.P();
            C6304d.f(((Boolean) interfaceC5872l0.getValue()).booleanValue(), null, null, null, null, ComposableLambdaKt.c(553742630, true, new a(interfaceC5872l0, localThemeScope, str6, str4, str5), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 30);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.q(localThemeScope, str, str2, str3, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, String str, String str2, String str3, boolean z10, int i10, Composer composer, int i11) {
        p(localThemeScope, str, str2, str3, z10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(int i10, AbstractC15054a vehicleColor) throws Exception {
        Intrinsics.j(vehicleColor, "vehicleColor");
        C17092h c17092h = f154998a;
        if (c17092h == null) {
            Intrinsics.x("viewModel");
            c17092h = null;
        }
        c17092h.x(new C17092h.c.UpdateVehicleColorPicker(vehicleColor));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(C17092h.ViewState viewState, int i10, Composer composer, int i11) {
        r(viewState, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(int i10, AbstractC15055b vehicleType) throws Exception {
        Intrinsics.j(vehicleType, "vehicleType");
        C17092h c17092h = f154998a;
        if (c17092h == null) {
            Intrinsics.x("viewModel");
            c17092h = null;
        }
        c17092h.x(new C17092h.c.UpdateVehicleDescriptionPicker(vehicleType));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, C17092h.ViewState viewState, int i10, Composer composer, int i11) {
        u(localThemeScope, viewState, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.r.x(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Exception {
        x(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(final Ki.LocalThemeScope r33, final java.lang.String r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.r.z(Ki.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String C(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    private static final void D(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final void G(final LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1944625008);
        if ((i10 & 6) == 0) {
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
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1944625008, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.LoadingState (FlyBuyCheckInScreen.kt:315)");
            }
            if (z10) {
                Ki.Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-240440678, true, new e(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.H(localThemeScope, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void I(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-981202576);
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
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-981202576, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.MainActionContent (FlyBuyCheckInScreen.kt:329)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            C17983Z.a(null, 0L, H1.h.p(1), 0.0f, composerStartRestartGroup, 384, 11);
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.d.f142547a, ComposableLambdaKt.c(884813514, true, new f(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (InterfaceC15205y.a.d.f142548b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.J(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String R(C17092h.ViewState viewState) throws Exception {
        String parkingSpot;
        Object next;
        FlyBuyState flyBuyState = viewState.getFlyBuyState();
        Object obj = null;
        if (flyBuyState == null || (parkingSpot = flyBuyState.getParkingSpot()) == null || viewState.getIsUpdatedParkingSpot()) {
            return null;
        }
        C17092h c17092h = f154998a;
        if (c17092h == null) {
            Intrinsics.x("viewModel");
            c17092h = null;
        }
        Iterator<T> it = viewState.j().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((AbstractC15054a) next).getIsChecked()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC15054a abstractC15054a = (AbstractC15054a) next;
        Iterator<T> it2 = viewState.k().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((AbstractC15055b) next2).getIsChecked()) {
                obj = next2;
                break;
            }
        }
        c17092h.x(new C17092h.c.SetIsUpdatedParkingSpot(true, parkingSpot, abstractC15054a, (AbstractC15055b) obj));
        return parkingSpot;
    }

    private static final String S(C17092h.ViewState viewState) throws Exception {
        OrderDetail currentOrderDetails;
        PickupPerson pickUpPerson;
        List<FlyBuyOrderDetail.FlyBuyOrder> listA;
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder;
        FlyBuyState flyBuyState = viewState.getFlyBuyState();
        C17092h c17092h = null;
        if (flyBuyState == null || (currentOrderDetails = flyBuyState.getCurrentOrderDetails()) == null || (pickUpPerson = currentOrderDetails.getPickUpPerson()) == null || viewState.getIsUpdatedName()) {
            return null;
        }
        String pickupName = viewState.getFlyBuyState().getPickupName();
        if (pickupName == null) {
            FlyBuyOrderDetail flyBuyOrder2 = viewState.getFlyBuyState().getFlyBuyOrder();
            if (flyBuyOrder2 != null && (listA = flyBuyOrder2.a()) != null && (flyBuyOrder = (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA)) != null) {
                pickupName = flyBuyOrder.getCustomerName();
            } else {
                pickupName = null;
            }
        }
        if (pickupName == null || pickupName.length() == 0) {
            pickupName = pickUpPerson.getFirstName() + ' ' + pickUpPerson.getLastName();
        }
        C17092h c17092h2 = f154998a;
        if (c17092h2 == null) {
            Intrinsics.x("viewModel");
        } else {
            c17092h = c17092h2;
        }
        c17092h.x(new C17092h.c.SetIsUpdatedName(true, pickupName));
        return pickupName;
    }

    private static final void r(final C17092h.ViewState viewState, Composer composer, final int i10) {
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1197751698);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(viewState)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1197751698, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayVehicleColorPicker (FlyBuyCheckInScreen.kt:269)");
            }
            List<AbstractC15054a> listJ = viewState.j();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: on.e
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.s(((Integer) obj).intValue(), (AbstractC15054a) obj2);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            c0.m(listJ, null, (Function2) objB, composerStartRestartGroup, 384, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.t(viewState, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void u(LocalThemeScope localThemeScope, final C17092h.ViewState viewState, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581531633);
        if ((i10 & 6) == 0) {
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
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(viewState)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1581531633, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.DisplayVehicleTypePicker (FlyBuyCheckInScreen.kt:261)");
            }
            List<AbstractC15055b> listK = viewState.k();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: on.m
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.v(((Integer) obj).intValue(), (AbstractC15055b) obj2);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            c0.r(localThemeScope2, listK, null, (Function2) objB, composerStartRestartGroup, LocalThemeScope.f17314g | 3072 | (i11 & 14), 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: on.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.w(localThemeScope2, viewState, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
