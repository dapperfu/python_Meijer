package kotlin;

import P0.e;
import V0.D1;
import androidx.compose.foundation.layout.C5797a;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001an\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c\"\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "action", "", "actionOnNewLine", "LV0/D1;", "shape", "LV0/q0;", "backgroundColor", "contentColor", "LH1/h;", "elevation", "content", "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLV0/D1;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lx0/k1;", "snackbarData", "actionColor", "d", "(Lx0/k1;Landroidx/compose/ui/Modifier;ZLV0/D1;JJJFLandroidx/compose/runtime/Composer;II)V", "e", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "text", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "b", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "f", "TextEndExtraSpacing", "g", "LongButtonVerticalOffset", "h", "SnackbarMinHeightOneLine", "i", "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18032p1 {

    /* renamed from: c, reason: collision with root package name */
    private static final float f169541c;

    /* renamed from: f, reason: collision with root package name */
    private static final float f169544f;

    /* renamed from: a, reason: collision with root package name */
    private static final float f169539a = H1.h.p(30);

    /* renamed from: b, reason: collision with root package name */
    private static final float f169540b = H1.h.p(16);

    /* renamed from: d, reason: collision with root package name */
    private static final float f169542d = H1.h.p(2);

    /* renamed from: e, reason: collision with root package name */
    private static final float f169543e = H1.h.p(6);

    /* renamed from: g, reason: collision with root package name */
    private static final float f169545g = H1.h.p(12);

    /* renamed from: h, reason: collision with root package name */
    private static final float f169546h = H1.h.p(48);

    /* renamed from: i, reason: collision with root package name */
    private static final float f169547i = H1.h.p(68);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.p1$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169548f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169549g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f169550h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f169548f = function2;
            this.f169549g = function22;
            this.f169550h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18032p1.a(this.f169548f, this.f169549g, composer, J0.a(this.f169550h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.p1$b */
    static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f169551a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f169552b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.p1$b$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f169553f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f169554g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ f0 f169555h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f169556i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f169557j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, int i10, f0 f0Var2, int i11, int i12) {
                super(1);
                this.f169553f = f0Var;
                this.f169554g = i10;
                this.f169555h = f0Var2;
                this.f169556i = i11;
                this.f169557j = i12;
            }

            public final void a(f0.a aVar) {
                f0.a.l(aVar, this.f169553f, 0, this.f169554g, 0.0f, 4, null);
                f0.a.l(aVar, this.f169555h, this.f169556i, this.f169557j, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        b(String str, String str2) {
            this.f169551a = str;
            this.f169552b = str2;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> list, long j10) {
            int iE0;
            int iMax;
            K k11 = k10;
            String str = this.f169551a;
            int size = list.size();
            int height = 0;
            int i10 = 0;
            while (i10 < size) {
                I i11 = list.get(i10);
                if (Intrinsics.e(C5937w.a(i11), str)) {
                    long j11 = j10;
                    f0 f0VarK0 = i11.k0(j11);
                    int iF = RangesKt.f((H1.b.l(j11) - f0VarK0.getWidth()) - k11.E0(C18032p1.f169544f), H1.b.n(j11));
                    String str2 = this.f169552b;
                    int size2 = list.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        I i13 = list.get(i12);
                        if (Intrinsics.e(C5937w.a(i13), str2)) {
                            f0 f0VarK02 = i13.k0(H1.b.d(j11, 0, iF, 0, 0, 9, null));
                            int iL0 = f0VarK02.l0(C5917b.a());
                            int iL02 = f0VarK02.l0(C5917b.b());
                            boolean z10 = true;
                            boolean z11 = (iL0 == Integer.MIN_VALUE || iL02 == Integer.MIN_VALUE) ? false : true;
                            if (iL0 != iL02 && z11) {
                                z10 = false;
                            }
                            int iL = H1.b.l(j10) - f0VarK0.getWidth();
                            if (z10) {
                                iMax = Math.max(k11.E0(C18032p1.f169546h), f0VarK0.getHeight());
                                iE0 = (iMax - f0VarK02.getHeight()) / 2;
                                int iL03 = f0VarK0.l0(C5917b.a());
                                if (iL03 != Integer.MIN_VALUE) {
                                    height = (iL0 + iE0) - iL03;
                                }
                            } else {
                                iE0 = k11.E0(C18032p1.f169539a) - iL0;
                                iMax = Math.max(k11.E0(C18032p1.f169547i), f0VarK02.getHeight() + iE0);
                                height = (iMax - f0VarK0.getHeight()) / 2;
                            }
                            return K.G0(k11, H1.b.l(j10), iMax, null, new a(f0VarK02, iE0, f0VarK0, iL, height), 4, null);
                        }
                        i12++;
                        k11 = k10;
                        j11 = j10;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                i10++;
                k11 = k10;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.p1$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169558f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169559g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f169560h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f169558f = function2;
            this.f169559g = function22;
            this.f169560h = i10;
        }

        public final void a(Composer composer, int i10) {
            C18032p1.b(this.f169558f, this.f169559g, composer, J0.a(this.f169560h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.p1$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169561f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169562g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f169563h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.p1$d$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f169564f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f169565g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f169566h;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.p1$d$a$a, reason: collision with other inner class name */
            static final class C2714a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f169567f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f169568g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f169569h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2714a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z10) {
                    super(2);
                    this.f169567f = function2;
                    this.f169568g = function22;
                    this.f169569h = z10;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(225114541, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:105)");
                    }
                    if (this.f169567f == null) {
                        composer.startReplaceGroup(1850968129);
                        C18032p1.e(this.f169568g, composer, 0);
                        composer.P();
                    } else if (this.f169569h) {
                        composer.startReplaceGroup(1850970222);
                        C18032p1.a(this.f169568g, this.f169567f, composer, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1850972359);
                        C18032p1.b(this.f169568g, this.f169567f, composer, 0);
                        composer.P();
                    }
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z10) {
                super(2);
                this.f169564f = function2;
                this.f169565g = function22;
                this.f169566h = z10;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1939362236, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:103)");
                }
                N1.a(C17943E0.f167967a.c(composer, 6).getBody2(), ComposableLambdaKt.c(225114541, true, new C2714a(this.f169564f, this.f169565g, this.f169566h), composer, 54), composer, 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z10) {
            super(2);
            this.f169561f = function2;
            this.f169562g = function22;
            this.f169563h = z10;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2084221700, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:102)");
            }
            r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.c(composer, 6))), ComposableLambdaKt.c(1939362236, true, new a(this.f169561f, this.f169562g, this.f169563h), composer, 54), composer, G0.f50200i | 48);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.p1$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169570f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169571g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f169572h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ D1 f169573i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f169574j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f169575k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f169576l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169577m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169578n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f169579o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, D1 d12, long j10, long j11, float f10, Function2<? super Composer, ? super Integer, Unit> function22, int i10, int i11) {
            super(2);
            this.f169570f = modifier;
            this.f169571g = function2;
            this.f169572h = z10;
            this.f169573i = d12;
            this.f169574j = j10;
            this.f169575k = j11;
            this.f169576l = f10;
            this.f169577m = function22;
            this.f169578n = i10;
            this.f169579o = i11;
        }

        public final void a(Composer composer, int i10) {
            C18032p1.c(this.f169570f, this.f169571g, this.f169572h, this.f169573i, this.f169574j, this.f169575k, this.f169576l, this.f169577m, composer, J0.a(this.f169578n | 1), this.f169579o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.p1$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC18017k1 f169580f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC18017k1 interfaceC18017k1) {
            super(2);
            this.f169580f = interfaceC18017k1;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-261845785, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:183)");
            }
            N1.b(this.f169580f.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.p1$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC18017k1 f169581f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f169582g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f169583h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ D1 f169584i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f169585j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f169586k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f169587l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f169588m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169589n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f169590o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC18017k1 interfaceC18017k1, Modifier modifier, boolean z10, D1 d12, long j10, long j11, long j12, float f10, int i10, int i11) {
            super(2);
            this.f169581f = interfaceC18017k1;
            this.f169582g = modifier;
            this.f169583h = z10;
            this.f169584i = d12;
            this.f169585j = j10;
            this.f169586k = j11;
            this.f169587l = j12;
            this.f169588m = f10;
            this.f169589n = i10;
            this.f169590o = i11;
        }

        public final void a(Composer composer, int i10) {
            C18032p1.d(this.f169581f, this.f169582g, this.f169583h, this.f169584i, this.f169585j, this.f169586k, this.f169587l, this.f169588m, composer, J0.a(this.f169589n | 1), this.f169590o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.p1$h */
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f169591f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC18017k1 f169592g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f169593h;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.p1$h$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC18017k1 f169594f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18017k1 interfaceC18017k1) {
                super(0);
                this.f169594f = interfaceC18017k1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f169594f.b();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/I;", "", "a", "(Lj0/I;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.p1$h$b */
        static final class b extends Lambda implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f169595f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f169595f = str;
            }

            public final void a(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
                if (!composer.p((i10 & 17) != 16, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-929149933, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:175)");
                }
                N1.b(this.f169595f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
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

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1843479216, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:172)");
            }
            InterfaceC18043u interfaceC18043uI = C18045v.f169801a.i(0L, this.f169591f, 0L, composer, 3072, 5);
            boolean zD = composer.D(this.f169592g);
            InterfaceC18017k1 interfaceC18017k1 = this.f169592g;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(interfaceC18017k1);
                composer.t(objB);
            }
            C18049x.d((Function0) objB, null, false, null, null, null, null, interfaceC18043uI, null, ComposableLambdaKt.c(-929149933, true, new b(this.f169593h), composer, 54), composer, 805306368, 382);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10, InterfaceC18017k1 interfaceC18017k1, String str) {
            super(2);
            this.f169591f = j10;
            this.f169592g = interfaceC18017k1;
            this.f169593h = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.p1$i */
    static final class i implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final i f169596a = new i();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.p1$i$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ArrayList<f0> f169597f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f169598g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList<f0> arrayList, int i10) {
                super(1);
                this.f169597f = arrayList;
                this.f169598g = i10;
            }

            public final void a(f0.a aVar) {
                ArrayList<f0> arrayList = this.f169597f;
                int i10 = this.f169598g;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = arrayList.get(i11);
                    f0.a.l(aVar, f0Var, 0, (i10 - f0Var.getHeight()) / 2, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z10 = false;
            int iL0 = Integer.MIN_VALUE;
            int iL02 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0VarK0 = list.get(i10).k0(j10);
                arrayList.add(f0VarK0);
                if (f0VarK0.l0(C5917b.a()) != Integer.MIN_VALUE && (iL0 == Integer.MIN_VALUE || f0VarK0.l0(C5917b.a()) < iL0)) {
                    iL0 = f0VarK0.l0(C5917b.a());
                }
                if (f0VarK0.l0(C5917b.b()) != Integer.MIN_VALUE && (iL02 == Integer.MIN_VALUE || f0VarK0.l0(C5917b.b()) > iL02)) {
                    iL02 = f0VarK0.l0(C5917b.b());
                }
                iMax = Math.max(iMax, f0VarK0.getHeight());
            }
            if (iL0 != Integer.MIN_VALUE && iL02 != Integer.MIN_VALUE) {
                z10 = true;
            }
            int iMax2 = Math.max(k10.E0((iL0 == iL02 || !z10) ? C18032p1.f169546h : C18032p1.f169547i), iMax);
            return K.G0(k10, H1.b.l(j10), iMax2, null, new a(arrayList, iMax2), 4, null);
        }

        i() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.p1$j */
    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169599f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f169600g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f169599f = function2;
            this.f169600g = i10;
        }

        public final void a(Composer composer, int i10) {
            C18032p1.e(this.f169599f, composer, J0.a(this.f169600g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    static {
        float f10 = 8;
        f169541c = H1.h.p(f10);
        f169544f = H1.h.p(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1229075900);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function22) ? 32 : 16;
        }
        if (composerStartRestartGroup.p((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            float f10 = f169540b;
            float f11 = f169541c;
            Modifier modifierM = D.m(modifierH, f10, 0.0f, f11, f169542d, 2, null);
            C5800d.m mVarH = C5800d.f48779a.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierM2 = D.m(C5797a.g(companion, f169539a, f169545g), 0.0f, 0.0f, f11, 0.0f, 11, null);
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM2);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.v();
            Modifier modifierC = c14903g.c(companion, companion2.j());
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyG2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(function2, function22, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-534813202);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function22) ? 32 : 16;
        }
        if (composerStartRestartGroup.p((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:312)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM = D.m(companion, f169540b, 0.0f, f169541c, 0.0f, 10, null);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new b("action", "text");
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicy, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            Modifier modifierK = D.k(C5937w.b(companion, "text"), 0.0f, f169543e, 1, null);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion3.o(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG, companion2.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.v();
            Modifier modifierB = C5937w.b(companion, "action");
            MeasurePolicy measurePolicyG2 = C5804h.g(companion3.o(), false);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            Function0<InterfaceC5953g> function0A3 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyG2, companion2.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion2.f());
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(function2, function22, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, boolean r29, V0.D1 r30, long r31, long r33, float r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18032p1.c(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, boolean, V0.D1, long, long, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(kotlin.InterfaceC18017k1 r27, androidx.compose.ui.Modifier r28, boolean r29, V0.D1 r30, long r31, long r33, long r35, float r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18032p1.d(x0.k1, androidx.compose.ui.Modifier, boolean, V0.D1, long, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(917397959);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:237)");
            }
            i iVar = i.f169596a;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, iVar, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            Modifier modifierJ = D.j(companion, f169540b, f169543e);
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierJ);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyG, companion2.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new j(function2, i10));
        }
    }
}
