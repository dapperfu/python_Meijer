package jm;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import em.AbstractC13689c;
import fm.HomeMperksDecorator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import os.C16158i;
import os.C16170v;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0016\f\u0017\u0018\u0019\u000eB0\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R7\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Ljm/O;", "", "Lak/a;", "title", "Lkotlin/Function1;", "LJi/M;", "", "Lcom/meijer/mobile/home/ux/views/ComposableFun;", "Lkotlin/ExtensionFunctionType;", "screen", "<init>", "(Lak/a;Lkotlin/jvm/functions/Function3;)V", "a", "Lak/a;", "b", "()Lak/a;", "setTitle", "(Lak/a;)V", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;", "setScreen", "(Lkotlin/jvm/functions/Function3;)V", "d", "f", "c", "e", "Ljm/O$a;", "Ljm/O$b;", "Ljm/O$c;", "Ljm/O$d;", "Ljm/O$e;", "Ljm/O$f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jm.O, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC15003O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Function3<? super LocalThemeScope, ? super Composer, ? super Integer, Unit> screen;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljm/O$a;", "Ljm/O;", "Lfm/b;", "mperksDecorator", "Lkotlin/Function1;", "Lem/c;", "", "onAction", "<init>", "(Lfm/b;Lkotlin/jvm/functions/Function1;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.O$a */
    public static final class a extends AbstractC15003O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.O$a$a, reason: collision with other inner class name */
        static final class C2223a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeMperksDecorator f140512a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC13689c, Unit> f140513b;

            /* JADX WARN: Multi-variable type inference failed */
            C2223a(HomeMperksDecorator homeMperksDecorator, Function1<? super AbstractC13689c, Unit> function1) {
                this.f140512a = homeMperksDecorator;
                this.f140513b = function1;
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
                C15002N.p(localThemeScope, this.f140512a, null, this.f140513b, composer, LocalThemeScope.f15770g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HomeMperksDecorator mperksDecorator, Function1<? super AbstractC13689c, Unit> onAction) {
            super(mperksDecorator.getAvailableRewardsTabTitle(), ComposableLambdaKt.composableLambdaInstance(-455562711, true, new C2223a(mperksDecorator, onAction)), null);
            Intrinsics.j(mperksDecorator, "mperksDecorator");
            Intrinsics.j(onAction, "onAction");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljm/O$b;", "Ljm/O;", "Lkotlin/Function0;", "", "onRetryClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.O$b */
    public static final class b extends AbstractC15003O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.O$b$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f140514a;

            a(Function0<Unit> function0) {
                this.f140514a = function0;
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
                C16158i.b(localThemeScope, null, this.f140514a, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<Unit> onRetryClicked) {
            super(AbstractC5607a.INSTANCE.d(Nr.g.f22734h, new Object[0]), ComposableLambdaKt.composableLambdaInstance(-1593558997, true, new a(onRetryClicked)), null);
            Intrinsics.j(onRetryClicked, "onRetryClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljm/O$c;", "Ljm/O;", "Lkotlin/Function0;", "", "onLearnMoreClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.O$c */
    public static final class c extends AbstractC15003O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.O$c$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f140515a;

            a(Function0<Unit> function0) {
                this.f140515a = function0;
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
                C16170v.h(localThemeScope, null, this.f140515a, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> onLearnMoreClicked) {
            super(AbstractC5607a.INSTANCE.d(Nr.g.f22734h, new Object[0]), ComposableLambdaKt.composableLambdaInstance(1337056554, true, new a(onLearnMoreClicked)), null);
            Intrinsics.j(onLearnMoreClicked, "onLearnMoreClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljm/O$d;", "Ljm/O;", "Lfm/b;", "mperksDecorator", "Lkotlin/Function1;", "Lem/c;", "", "onAction", "<init>", "(Lfm/b;Lkotlin/jvm/functions/Function1;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.O$d */
    public static final class d extends AbstractC15003O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.O$d$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HomeMperksDecorator f140516a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC13689c, Unit> f140517b;

            /* JADX WARN: Multi-variable type inference failed */
            a(HomeMperksDecorator homeMperksDecorator, Function1<? super AbstractC13689c, Unit> function1) {
                this.f140516a = homeMperksDecorator;
                this.f140517b = function1;
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
                C15002N.x(localThemeScope, this.f140516a, null, this.f140517b, composer, LocalThemeScope.f15770g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HomeMperksDecorator mperksDecorator, Function1<? super AbstractC13689c, Unit> onAction) {
            super(mperksDecorator.getClippedRewardsTabTitle(), ComposableLambdaKt.composableLambdaInstance(804827136, true, new a(mperksDecorator, onAction)), null);
            Intrinsics.j(mperksDecorator, "mperksDecorator");
            Intrinsics.j(onAction, "onAction");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljm/O$e;", "Ljm/O;", "Lkotlin/Function0;", "", "onRetryClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.O$e */
    public static final class e extends AbstractC15003O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.O$e$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f140518a;

            a(Function0<Unit> function0) {
                this.f140518a = function0;
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
                C16158i.b(localThemeScope, null, this.f140518a, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0<Unit> onRetryClicked) {
            super(AbstractC5607a.INSTANCE.d(Nr.g.f22696D0, new Object[0]), ComposableLambdaKt.composableLambdaInstance(1090601140, true, new a(onRetryClicked)), null);
            Intrinsics.j(onRetryClicked, "onRetryClicked");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljm/O$f;", "Ljm/O;", "Lkotlin/Function0;", "", "onLearnMoreClicked", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jm.O$f */
    public static final class f extends AbstractC15003O {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jm.O$f$a */
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f140519a;

            a(Function0<Unit> function0) {
                this.f140519a = function0;
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
                C16170v.k(localThemeScope, null, this.f140519a, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> onLearnMoreClicked) {
            super(AbstractC5607a.INSTANCE.d(Nr.g.f22696D0, new Object[0]), ComposableLambdaKt.composableLambdaInstance(-1353325119, true, new a(onLearnMoreClicked)), null);
            Intrinsics.j(onLearnMoreClicked, "onLearnMoreClicked");
        }
    }

    public /* synthetic */ AbstractC15003O(AbstractC5607a abstractC5607a, Function3 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, function3);
    }

    private AbstractC15003O(AbstractC5607a abstractC5607a, Function3<? super LocalThemeScope, ? super Composer, ? super Integer, Unit> function3) {
        this.title = abstractC5607a;
        this.screen = function3;
    }

    public final Function3<LocalThemeScope, Composer, Integer, Unit> a() {
        return this.screen;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }
}
