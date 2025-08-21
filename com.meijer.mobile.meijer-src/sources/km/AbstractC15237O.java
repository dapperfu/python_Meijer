package km;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bk.AbstractC6392a;
import fm.AbstractC14021c;
import gm.HomeMperksDecorator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import os.C16300i;
import os.C16312v;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0016\f\u0017\u0018\u0019\u000eB0\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lkm/O;", "", "Lbk/a;", "title", "Lkotlin/Function1;", "LKi/M;", "", "Lcom/meijer/mobile/home/ux/views/ComposableFun;", "Lkotlin/ExtensionFunctionType;", "screen", "<init>", "(Lbk/a;Lkotlin/jvm/functions/Function3;)V", "a", "Lbk/a;", "b", "()Lbk/a;", "setTitle", "(Lbk/a;)V", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "setScreen", "(Lkotlin/jvm/functions/Function3;)V", "d", "f", "c", "e", "Lkm/O$a;", "Lkm/O$b;", "Lkm/O$c;", "Lkm/O$d;", "Lkm/O$e;", "Lkm/O$f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: km.O, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC15237O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC6392a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Function3<? super LocalThemeScope, ? super Composer, ? super Integer, Unit> screen;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkm/O$a;", "Lkm/O;", "Lgm/b;", "mperksDecorator", "Lkotlin/Function1;", "Lfm/c;", "", "onAction", "<init>", "(Lgm/b;Lkotlin/jvm/functions/Function1;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.O$a */
    public static final class a extends AbstractC15237O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.O$a$a, reason: collision with other inner class name */
        static final class C2262a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeMperksDecorator f142767a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14021c, Unit> f142768b;

            /* JADX WARN: Multi-variable type inference failed */
            C2262a(HomeMperksDecorator homeMperksDecorator, Function1<? super AbstractC14021c, Unit> function1) {
                this.f142767a = homeMperksDecorator;
                this.f142768b = function1;
            }

            public final void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
                Intrinsics.j(localThemeScope, "<this>");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(localThemeScope) : composer.D(localThemeScope) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-455562711, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabItem.RedeemMperks.<init>.<anonymous> (HomeMperksTabItem.kt:42)");
                }
                C15236N.p(localThemeScope, this.f142767a, null, this.f142768b, composer, LocalThemeScope.f17314g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HomeMperksDecorator mperksDecorator, Function1<? super AbstractC14021c, Unit> onAction) {
            super(mperksDecorator.getAvailableRewardsTabTitle(), ComposableLambdaKt.composableLambdaInstance(-455562711, true, new C2262a(mperksDecorator, onAction)), null);
            Intrinsics.j(mperksDecorator, "mperksDecorator");
            Intrinsics.j(onAction, "onAction");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkm/O$b;", "Lkm/O;", "Lkotlin/Function0;", "", "onRetryClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.O$b */
    public static final class b extends AbstractC15237O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.O$b$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142769a;

            a(Function0<Unit> function0) {
                this.f142769a = function0;
            }

            public final void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
                Intrinsics.j(localThemeScope, "<this>");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(localThemeScope) : composer.D(localThemeScope) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1593558997, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabItem.RedeemMperksError.<init>.<anonymous> (HomeMperksTabItem.kt:73)");
                }
                C16300i.b(localThemeScope, null, this.f142769a, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> onRetryClicked) {
            super(AbstractC6392a.INSTANCE.d(Nr.g.f22690h, new Object[0]), ComposableLambdaKt.composableLambdaInstance(-1593558997, true, new a(onRetryClicked)), null);
            Intrinsics.j(onRetryClicked, "onRetryClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkm/O$c;", "Lkm/O;", "Lkotlin/Function0;", "", "onLearnMoreClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.O$c */
    public static final class c extends AbstractC15237O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.O$c$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142770a;

            a(Function0<Unit> function0) {
                this.f142770a = function0;
            }

            public final void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
                Intrinsics.j(localThemeScope, "<this>");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(localThemeScope) : composer.D(localThemeScope) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1337056554, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabItem.RedeemMperksUnAuth.<init>.<anonymous> (HomeMperksTabItem.kt:59)");
                }
                C16312v.h(localThemeScope, null, this.f142770a, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> onLearnMoreClicked) {
            super(AbstractC6392a.INSTANCE.d(Nr.g.f22690h, new Object[0]), ComposableLambdaKt.composableLambdaInstance(1337056554, true, new a(onLearnMoreClicked)), null);
            Intrinsics.j(onLearnMoreClicked, "onLearnMoreClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkm/O$d;", "Lkm/O;", "Lgm/b;", "mperksDecorator", "Lkotlin/Function1;", "Lfm/c;", "", "onAction", "<init>", "(Lgm/b;Lkotlin/jvm/functions/Function1;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.O$d */
    public static final class d extends AbstractC15237O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.O$d$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeMperksDecorator f142771a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC14021c, Unit> f142772b;

            /* JADX WARN: Multi-variable type inference failed */
            a(HomeMperksDecorator homeMperksDecorator, Function1<? super AbstractC14021c, Unit> function1) {
                this.f142771a = homeMperksDecorator;
                this.f142772b = function1;
            }

            public final void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
                Intrinsics.j(localThemeScope, "<this>");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(localThemeScope) : composer.D(localThemeScope) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(804827136, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabItem.YourMperks.<init>.<anonymous> (HomeMperksTabItem.kt:28)");
                }
                C15236N.x(localThemeScope, this.f142771a, null, this.f142772b, composer, LocalThemeScope.f17314g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HomeMperksDecorator mperksDecorator, Function1<? super AbstractC14021c, Unit> onAction) {
            super(mperksDecorator.getClippedRewardsTabTitle(), ComposableLambdaKt.composableLambdaInstance(804827136, true, new a(mperksDecorator, onAction)), null);
            Intrinsics.j(mperksDecorator, "mperksDecorator");
            Intrinsics.j(onAction, "onAction");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkm/O$e;", "Lkm/O;", "Lkotlin/Function0;", "", "onRetryClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.O$e */
    public static final class e extends AbstractC15237O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.O$e$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142773a;

            a(Function0<Unit> function0) {
                this.f142773a = function0;
            }

            public final void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
                Intrinsics.j(localThemeScope, "<this>");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(localThemeScope) : composer.D(localThemeScope) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1090601140, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabItem.YourMperksError.<init>.<anonymous> (HomeMperksTabItem.kt:66)");
                }
                C16300i.b(localThemeScope, null, this.f142773a, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<Unit> onRetryClicked) {
            super(AbstractC6392a.INSTANCE.d(Nr.g.f22652D0, new Object[0]), ComposableLambdaKt.composableLambdaInstance(1090601140, true, new a(onRetryClicked)), null);
            Intrinsics.j(onRetryClicked, "onRetryClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkm/O$f;", "Lkm/O;", "Lkotlin/Function0;", "", "onLearnMoreClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: km.O$f */
    public static final class f extends AbstractC15237O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: km.O$f$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f142774a;

            a(Function0<Unit> function0) {
                this.f142774a = function0;
            }

            public final void a(LocalThemeScope localThemeScope, Composer composer, int i10) {
                Intrinsics.j(localThemeScope, "<this>");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(localThemeScope) : composer.D(localThemeScope) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1353325119, i10, -1, "com.meijer.mobile.home.ux.views.HomeMperksTabItem.YourMperksUnAuth.<init>.<anonymous> (HomeMperksTabItem.kt:52)");
                }
                C16312v.k(localThemeScope, null, this.f142774a, composer, LocalThemeScope.f17314g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> onLearnMoreClicked) {
            super(AbstractC6392a.INSTANCE.d(Nr.g.f22652D0, new Object[0]), ComposableLambdaKt.composableLambdaInstance(-1353325119, true, new a(onLearnMoreClicked)), null);
            Intrinsics.j(onLearnMoreClicked, "onLearnMoreClicked");
        }
    }

    public /* synthetic */ AbstractC15237O(AbstractC6392a abstractC6392a, Function3 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6392a, function3);
    }

    private AbstractC15237O(AbstractC6392a abstractC6392a, Function3<? super LocalThemeScope, ? super Composer, ? super Integer, Unit> function3) {
        this.title = abstractC6392a;
        this.screen = function3;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> a() {
        return this.screen;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }
}
