package Si;

import Ji.LocalThemeScope;
import Si.o;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14810b;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0085\u0001\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\t2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0018\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a]\u0010\u001a\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001as\u0010\u001c\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ac\u0010\u001e\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LJi/M;", "", "titleLabel", "Lji/q1$j;", "titleTemplate", "Lji/q1$s;", "toggleButtonTemplate", "Lji/q1$n;", "rowTemplate", "", "checked", "enabled", "Landroidx/compose/ui/Modifier;", "modifier", "descriptionTemplate", "descriptionLabel", "showDivider", "Lkotlin/Function1;", "", "onContainerClick", "E", "(LJi/M;Ljava/lang/String;Lji/q1$j;Lji/q1$s;Lji/q1$n;ZZLandroidx/compose/ui/Modifier;Lji/q1$j;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lji/q1$s$b;", "Lkotlin/Function0;", "w", "(LJi/M;Ljava/lang/String;Lji/q1$j;Lji/q1$s$b;Lji/q1$n;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "A", "Lji/q1$s$a;", "s", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lji/q1$j;Ljava/lang/String;Lji/q1$j;Lji/q1$s$a;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "o", "(LJi/M;Ljava/lang/String;Lji/q1$j;Lji/q1$s$a;Lji/q1$n;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33725a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.Row f33726b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1.Label f33727c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33728d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.s.Checkbox f33729e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f33730f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f33731g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Si.o$a$a, reason: collision with other inner class name */
        static final class C0754a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33732a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Label f33733b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f33734c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q1.s.Checkbox f33735d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f33736e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f33737f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Si.o$a$a$a, reason: collision with other inner class name */
            static final class C0755a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33738a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q1.Label f33739b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f33740c;

                C0755a(LocalThemeScope localThemeScope, q1.Label label, String str) {
                    this.f33738a = localThemeScope;
                    this.f33739b = label;
                    this.f33740c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(584329669, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxGroupItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:339)");
                    }
                    ri.j.h(this.f33738a, q1.Label.y(this.f33739b, Modifier.INSTANCE, null, null, null, 0, false, 0, null, null, 510, null), this.f33740c, null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Si.o$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33741a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q1.s.Checkbox f33742b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f33743c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f33744d;

                b(LocalThemeScope localThemeScope, q1.s.Checkbox checkbox, boolean z10, boolean z11) {
                    this.f33741a = localThemeScope;
                    this.f33742b = checkbox;
                    this.f33743c = z10;
                    this.f33744d = z11;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(u semantics) {
                    Intrinsics.j(semantics, "$this$semantics");
                    s.A(semantics);
                    return Unit.f142422a;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1621312698, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxGroupItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:345)");
                    }
                    LocalThemeScope localThemeScope = this.f33741a;
                    q1.s.Checkbox checkbox = this.f33742b;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Si.p
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return o.a.C0754a.b.c((u) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    vi.s.b(localThemeScope, q1.s.Checkbox.y(checkbox, C16705m.d(companion, false, (Function1) objB, 1, null), false, null, null, 14, null), this.f33743c, this.f33744d, false, null, composer, 0, 24);
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

            C0754a(LocalThemeScope localThemeScope, q1.Label label, String str, q1.s.Checkbox checkbox, boolean z10, boolean z11) {
                this.f33732a = localThemeScope;
                this.f33733b = label;
                this.f33734c = str;
                this.f33735d = checkbox;
                this.f33736e = z10;
                this.f33737f = z11;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(759954172, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxGroupItem.<anonymous>.<anonymous> (LoadingUtils.kt:337)");
                }
                kotlin.g.h(ComposableLambdaKt.c(584329669, true, new C0755a(this.f33732a, this.f33733b, this.f33734c), composer, 54), ComposableLambdaKt.c(-1621312698, true, new b(this.f33732a, this.f33735d, this.f33736e, this.f33737f), composer, 54), 0.0f, composer, 54, 4);
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

        a(LocalThemeScope localThemeScope, q1.Row row, q1.Label label, String str, q1.s.Checkbox checkbox, boolean z10, boolean z11) {
            this.f33725a = localThemeScope;
            this.f33726b = row;
            this.f33727c = label;
            this.f33728d = str;
            this.f33729e = checkbox;
            this.f33730f = z10;
            this.f33731g = z11;
        }

        public final void a(InterfaceC14810b RippleScope, Composer composer, int i10) {
            Intrinsics.j(RippleScope, "$this$RippleScope");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1400953156, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxGroupItem.<anonymous> (LoadingUtils.kt:334)");
            }
            C16088n.i(this.f33725a, q1.Row.y(this.f33726b, Modifier.INSTANCE, null, null, 6, null), ComposableLambdaKt.c(759954172, true, new C0754a(this.f33725a, this.f33727c, this.f33728d, this.f33729e, this.f33730f, this.f33731g), composer, 54), composer, 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.Label f33746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.Label f33749e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1.s.Checkbox f33750f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f33751g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f33752h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33753a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Label f33754b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f33755c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f33756d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ q1.Label f33757e;

            a(LocalThemeScope localThemeScope, q1.Label label, String str, String str2, q1.Label label2) {
                this.f33753a = localThemeScope;
                this.f33754b = label;
                this.f33755c = str;
                this.f33756d = str2;
                this.f33757e = label2;
            }

            public final void a(Composer composer, int i10) {
                q1.Label label;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-432094182, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxMenuItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:269)");
                }
                ri.j.h(this.f33753a, this.f33754b, this.f33755c, null, composer, 0, 4);
                String str = this.f33756d;
                if (str != null && str.length() != 0 && (label = this.f33757e) != null) {
                    ri.j.h(this.f33753a, label, this.f33756d, null, composer, 0, 4);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Si.o$b$b, reason: collision with other inner class name */
        static final class C0756b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33758a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.s.Checkbox f33759b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f33760c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f33761d;

            C0756b(LocalThemeScope localThemeScope, q1.s.Checkbox checkbox, boolean z10, boolean z11) {
                this.f33758a = localThemeScope;
                this.f33759b = checkbox;
                this.f33760c = z10;
                this.f33761d = z11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                s.A(semantics);
                return Unit.f142422a;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1139140601, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxMenuItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:278)");
                }
                LocalThemeScope localThemeScope = this.f33758a;
                q1.s.Checkbox checkbox = this.f33759b;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Si.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return o.b.C0756b.c((u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                vi.s.b(localThemeScope, q1.s.Checkbox.y(checkbox, C16705m.d(companion, false, (Function1) objB, 1, null), false, null, null, 14, null), this.f33760c, this.f33761d, false, null, composer, 0, 24);
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

        b(LocalThemeScope localThemeScope, q1.Label label, String str, String str2, q1.Label label2, q1.s.Checkbox checkbox, boolean z10, boolean z11) {
            this.f33745a = localThemeScope;
            this.f33746b = label;
            this.f33747c = str;
            this.f33748d = str2;
            this.f33749e = label2;
            this.f33750f = checkbox;
            this.f33751g = z10;
            this.f33752h = z11;
        }

        public final void a(InterfaceC14810b RippleScope, Composer composer, int i10) {
            Intrinsics.j(RippleScope, "$this$RippleScope");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(714398339, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.CheckBoxMenuItem.<anonymous>.<anonymous> (LoadingUtils.kt:267)");
            }
            kotlin.g.h(ComposableLambdaKt.c(-432094182, true, new a(this.f33745a, this.f33746b, this.f33747c, this.f33748d, this.f33749e), composer, 54), ComposableLambdaKt.c(1139140601, true, new C0756b(this.f33745a, this.f33750f, this.f33751g, this.f33752h), composer, 54), 0.0f, composer, 54, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33762a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.Row f33763b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1.Label f33764c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33765d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.s.RadioButton f33766e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f33767f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f33768g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33769a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Label f33770b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f33771c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q1.s.RadioButton f33772d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f33773e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f33774f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Si.o$c$a$a, reason: collision with other inner class name */
            static final class C0757a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33775a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q1.Label f33776b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f33777c;

                C0757a(LocalThemeScope localThemeScope, q1.Label label, String str) {
                    this.f33775a = localThemeScope;
                    this.f33776b = label;
                    this.f33777c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-752392316, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonGroupItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:132)");
                    }
                    ri.j.h(this.f33775a, q1.Label.y(this.f33776b, Modifier.INSTANCE, null, null, null, 0, false, 0, null, null, 510, null), this.f33777c, null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33778a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q1.s.RadioButton f33779b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f33780c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f33781d;

                b(LocalThemeScope localThemeScope, q1.s.RadioButton radioButton, boolean z10, boolean z11) {
                    this.f33778a = localThemeScope;
                    this.f33779b = radioButton;
                    this.f33780c = z10;
                    this.f33781d = z11;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-649915323, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonGroupItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:138)");
                    }
                    vi.s.b(this.f33778a, q1.s.RadioButton.y(this.f33779b, Modifier.INSTANCE, false, null, null, 14, null), this.f33780c, this.f33781d, false, null, composer, 0, 24);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, q1.Label label, String str, q1.s.RadioButton radioButton, boolean z10, boolean z11) {
                this.f33769a = localThemeScope;
                this.f33770b = label;
                this.f33771c = str;
                this.f33772d = radioButton;
                this.f33773e = z10;
                this.f33774f = z11;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1010119547, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonGroupItem.<anonymous>.<anonymous> (LoadingUtils.kt:130)");
                }
                kotlin.g.h(ComposableLambdaKt.c(-752392316, true, new C0757a(this.f33769a, this.f33770b, this.f33771c), composer, 54), ComposableLambdaKt.c(-649915323, true, new b(this.f33769a, this.f33772d, this.f33773e, this.f33774f), composer, 54), 0.0f, composer, 54, 4);
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

        c(LocalThemeScope localThemeScope, q1.Row row, q1.Label label, String str, q1.s.RadioButton radioButton, boolean z10, boolean z11) {
            this.f33762a = localThemeScope;
            this.f33763b = row;
            this.f33764c = label;
            this.f33765d = str;
            this.f33766e = radioButton;
            this.f33767f = z10;
            this.f33768g = z11;
        }

        public final void a(InterfaceC14810b RippleScope, Composer composer, int i10) {
            Intrinsics.j(RippleScope, "$this$RippleScope");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1580691653, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonGroupItem.<anonymous> (LoadingUtils.kt:127)");
            }
            C16088n.i(this.f33762a, q1.Row.y(this.f33763b, Modifier.INSTANCE, null, null, 6, null), ComposableLambdaKt.c(1010119547, true, new a(this.f33762a, this.f33764c, this.f33765d, this.f33766e, this.f33767f, this.f33768g), composer, 54), composer, 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.Row f33783b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1.Label f33784c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f33785d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.s.RadioButton f33786e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f33787f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f33788g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33789a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ q1.Label f33790b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f33791c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ q1.s.RadioButton f33792d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f33793e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f33794f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Si.o$d$a$a, reason: collision with other inner class name */
            static final class C0758a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33795a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q1.Label f33796b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f33797c;

                C0758a(LocalThemeScope localThemeScope, q1.Label label, String str) {
                    this.f33795a = localThemeScope;
                    this.f33796b = label;
                    this.f33797c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-962729714, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonMenuItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:200)");
                    }
                    ri.j.h(this.f33795a, q1.Label.y(this.f33796b, Modifier.INSTANCE, null, null, null, 0, false, 0, null, null, 510, null), this.f33797c, null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f33798a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ q1.s.RadioButton f33799b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ boolean f33800c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f33801d;

                b(LocalThemeScope localThemeScope, q1.s.RadioButton radioButton, boolean z10, boolean z11) {
                    this.f33798a = localThemeScope;
                    this.f33799b = radioButton;
                    this.f33800c = z10;
                    this.f33801d = z11;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1621565101, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonMenuItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:206)");
                    }
                    vi.s.b(this.f33798a, q1.s.RadioButton.y(this.f33799b, Modifier.INSTANCE, false, null, null, 14, null), this.f33800c, this.f33801d, false, null, composer, 0, 24);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, q1.Label label, String str, q1.s.RadioButton radioButton, boolean z10, boolean z11) {
                this.f33789a = localThemeScope;
                this.f33790b = label;
                this.f33791c = str;
                this.f33792d = radioButton;
                this.f33793e = z10;
                this.f33794f = z11;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1831391305, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonMenuItem.<anonymous>.<anonymous>.<anonymous> (LoadingUtils.kt:198)");
                }
                kotlin.g.h(ComposableLambdaKt.c(-962729714, true, new C0758a(this.f33789a, this.f33790b, this.f33791c), composer, 54), ComposableLambdaKt.c(1621565101, true, new b(this.f33789a, this.f33792d, this.f33793e, this.f33794f), composer, 54), 0.0f, composer, 54, 4);
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

        d(LocalThemeScope localThemeScope, q1.Row row, q1.Label label, String str, q1.s.RadioButton radioButton, boolean z10, boolean z11) {
            this.f33782a = localThemeScope;
            this.f33783b = row;
            this.f33784c = label;
            this.f33785d = str;
            this.f33786e = radioButton;
            this.f33787f = z10;
            this.f33788g = z11;
        }

        public final void a(InterfaceC14810b RippleScope, Composer composer, int i10) {
            Intrinsics.j(RippleScope, "$this$RippleScope");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(330808311, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.RadioButtonMenuItem.<anonymous>.<anonymous> (LoadingUtils.kt:195)");
            }
            C16088n.i(this.f33782a, q1.Row.y(this.f33783b, Modifier.INSTANCE, null, null, 6, null), ComposableLambdaKt.c(-1831391305, true, new a(this.f33782a, this.f33784c, this.f33785d, this.f33786e, this.f33787f, this.f33788g), composer, 54), composer, 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
            a(interfaceC14810b, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1.s f33803b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f33804c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f33805d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1.Label f33806e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f33807f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f33808g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q1.Label f33809h;

        e(LocalThemeScope localThemeScope, q1.s sVar, boolean z10, boolean z11, q1.Label label, String str, String str2, q1.Label label2) {
            this.f33802a = localThemeScope;
            this.f33803b = sVar;
            this.f33804c = z10;
            this.f33805d = z11;
            this.f33806e = label;
            this.f33807f = str;
            this.f33808g = str2;
            this.f33809h = label2;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-309447189, i10, -1, "com.meijer.mobile.androidacres.showcase.utils.ToggleButtonListItemEnd.<anonymous>.<anonymous> (LoadingUtils.kt:65)");
            }
            LocalThemeScope localThemeScope = this.f33802a;
            q1.Label label = this.f33806e;
            String str = this.f33807f;
            String str2 = this.f33808g;
            q1.Label label2 = this.f33809h;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            ri.j.h(localThemeScope, label, str, null, composer, 0, 4);
            composer.startReplaceGroup(1345633981);
            if (str2 != null && str2.length() != 0 && label2 != null) {
                ri.j.h(localThemeScope, label2, str2, null, composer, 0, 4);
            }
            composer.P();
            composer.v();
            C14802K.a(J.z(companion, this.f33802a.getAdsSpacing().getFive().getDp()), composer, 0);
            vi.s.b(this.f33802a, this.f33803b, this.f33804c, this.f33805d, false, null, composer, 0, 24);
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[PHI: r19
      0x0121: PHI (r19v11 int) = (r19v0 int), (r19v6 int), (r19v7 int) binds: [B:94:0x011f, B:104:0x013c, B:103:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(Ji.LocalThemeScope r30, final java.lang.String r31, final ji.q1.Label r32, final ji.q1.s r33, final ji.q1.Row r34, final boolean r35, final boolean r36, androidx.compose.ui.Modifier r37, ji.q1.Label r38, java.lang.String r39, boolean r40, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.o.E(Ji.M, java.lang.String, ji.q1$j, ji.q1$s, ji.q1$n, boolean, boolean, androidx.compose.ui.Modifier, ji.q1$j, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final Ji.LocalThemeScope r20, final java.lang.String r21, final ji.q1.Label r22, final ji.q1.s.RadioButton r23, final ji.q1.Row r24, final boolean r25, final boolean r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.o.A(Ji.M, java.lang.String, ji.q1$j, ji.q1$s$b, ji.q1$n, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(LocalThemeScope localThemeScope, String str, q1.Label label, q1.s.RadioButton radioButton, q1.Row row, boolean z10, boolean z11, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        A(localThemeScope, str, label, radioButton, row, z10, z11, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, String str, q1.Label label, q1.s sVar, q1.Row row, boolean z10, boolean z11, Modifier modifier, q1.Label label2, String str2, boolean z12, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        E(localThemeScope, str, label, sVar, row, z10, z11, modifier, label2, str2, z12, function1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r20, final java.lang.String r21, final ji.q1.Label r22, final ji.q1.s.Checkbox r23, final ji.q1.Row r24, final boolean r25, final boolean r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.o.o(Ji.M, java.lang.String, ji.q1$j, ji.q1$s$a, ji.q1$n, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, String str, q1.Label label, q1.s.Checkbox checkbox, q1.Row row, boolean z10, boolean z11, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, str, label, checkbox, row, z10, z11, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[PHI: r15
      0x00bf: PHI (r15v21 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:62:0x00bd, B:72:0x00d7, B:71:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ji.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final java.lang.String r25, final ji.q1.Label r26, java.lang.String r27, ji.q1.Label r28, final ji.q1.s.Checkbox r29, final boolean r30, final boolean r31, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.o.s(Ji.M, androidx.compose.ui.Modifier, java.lang.String, ji.q1$j, java.lang.String, ji.q1$j, ji.q1$s$a, boolean, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, Modifier modifier, String str, q1.Label label, String str2, q1.Label label2, q1.s.Checkbox checkbox, boolean z10, boolean z11, Function1 function1, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, str, label, str2, label2, checkbox, z10, z11, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final Ji.LocalThemeScope r20, final java.lang.String r21, final ji.q1.Label r22, final ji.q1.s.RadioButton r23, final ji.q1.Row r24, final boolean r25, final boolean r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Si.o.w(Ji.M, java.lang.String, ji.q1$j, ji.q1$s$b, ji.q1$n, boolean, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, String str, q1.Label label, q1.s.RadioButton radioButton, q1.Row row, boolean z10, boolean z11, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        w(localThemeScope, str, label, radioButton, row, z10, z11, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }
}
