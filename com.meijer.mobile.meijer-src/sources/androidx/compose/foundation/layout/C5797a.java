package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.C5932q;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "LH1/h;", "before", "after", "e", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/a;FF)Landroidx/compose/ui/Modifier;", "top", "bottom", "g", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "c", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/a;FFLandroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "d", "(Landroidx/compose/ui/layout/a;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5797a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    static final class C1009a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5916a f48765f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48766g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f48767h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48768i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f48769j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ f0 f48770k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f48771l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1009a(AbstractC5916a abstractC5916a, float f10, int i10, int i11, int i12, f0 f0Var, int i13) {
            super(1);
            this.f48765f = abstractC5916a;
            this.f48766g = f10;
            this.f48767h = i10;
            this.f48768i = i11;
            this.f48769j = i12;
            this.f48770k = f0Var;
            this.f48771l = i13;
        }

        public final void a(f0.a aVar) {
            int width;
            if (C5797a.d(this.f48765f)) {
                width = 0;
            } else {
                width = !H1.h.u(this.f48766g, H1.h.INSTANCE.c()) ? this.f48767h : (this.f48768i - this.f48769j) - this.f48770k.getWidth();
            }
            f0.a.l(aVar, this.f48770k, width, C5797a.d(this.f48765f) ? !H1.h.u(this.f48766g, H1.h.INSTANCE.c()) ? this.f48767h : (this.f48771l - this.f48769j) - this.f48770k.getHeight() : 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.a$b */
    public static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5916a f48772f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f48773g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f48774h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC5916a abstractC5916a, float f10, float f11) {
            super(1);
            this.f48772f = abstractC5916a;
            this.f48773g = f10;
            this.f48774h = f11;
        }

        public final void a(N0 n02) {
            n02.b("paddingFrom");
            n02.getProperties().c("alignmentLine", this.f48772f);
            n02.getProperties().c("before", H1.h.l(this.f48773g));
            n02.getProperties().c("after", H1.h.l(this.f48774h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AbstractC5916a abstractC5916a) {
        return abstractC5916a instanceof C5932q;
    }

    public static final Modifier e(Modifier modifier, AbstractC5916a abstractC5916a, float f10, float f11) {
        return modifier.then(new AlignmentLineOffsetDpElement(abstractC5916a, f10, f11, L0.b() ? new b(abstractC5916a, f10, f11) : L0.a(), null));
    }

    public static /* synthetic */ Modifier f(Modifier modifier, AbstractC5916a abstractC5916a, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = H1.h.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            f11 = H1.h.INSTANCE.c();
        }
        return e(modifier, abstractC5916a, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.J c(androidx.compose.ui.layout.K k10, AbstractC5916a abstractC5916a, float f10, float f11, androidx.compose.ui.layout.I i10, long j10) {
        long jD;
        int width;
        int iL;
        int iE0;
        int iE02;
        int iMax;
        int height;
        if (d(abstractC5916a)) {
            jD = H1.b.d(j10, 0, 0, 0, 0, 11, null);
        } else {
            jD = H1.b.d(j10, 0, 0, 0, 0, 14, null);
        }
        f0 f0VarK0 = i10.k0(jD);
        int iL0 = f0VarK0.l0(abstractC5916a);
        if (iL0 == Integer.MIN_VALUE) {
            iL0 = 0;
        }
        if (d(abstractC5916a)) {
            width = f0VarK0.getHeight();
        } else {
            width = f0VarK0.getWidth();
        }
        if (d(abstractC5916a)) {
            iL = H1.b.k(j10);
        } else {
            iL = H1.b.l(j10);
        }
        if (!Float.isNaN(f10)) {
            iE0 = k10.E0(f10);
        } else {
            iE0 = 0;
        }
        int i11 = iL - width;
        int iO = RangesKt.o(iE0 - iL0, 0, i11);
        if (!Float.isNaN(f11)) {
            iE02 = k10.E0(f11);
        } else {
            iE02 = 0;
        }
        int iO2 = RangesKt.o((iE02 - width) + iL0, 0, i11 - iO);
        if (d(abstractC5916a)) {
            iMax = f0VarK0.getWidth();
        } else {
            iMax = Math.max(f0VarK0.getWidth() + iO + iO2, H1.b.n(j10));
        }
        int i12 = iMax;
        if (d(abstractC5916a)) {
            height = Math.max(f0VarK0.getHeight() + iO + iO2, H1.b.m(j10));
        } else {
            height = f0VarK0.getHeight();
        }
        int i13 = height;
        return androidx.compose.ui.layout.K.G0(k10, i12, i13, null, new C1009a(abstractC5916a, f10, iO, i12, iO2, f0VarK0, i13), 4, null);
    }

    public static final Modifier g(Modifier modifier, float f10, float f11) {
        Modifier modifierF;
        Modifier modifierF2;
        if (!Float.isNaN(f10)) {
            modifierF = f(Modifier.INSTANCE, C5917b.a(), f10, 0.0f, 4, null);
        } else {
            modifierF = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifier.then(modifierF);
        if (!Float.isNaN(f11)) {
            modifierF2 = f(Modifier.INSTANCE, C5917b.b(), 0.0f, f11, 2, null);
        } else {
            modifierF2 = Modifier.INSTANCE;
        }
        return modifierThen.then(modifierF2);
    }
}
