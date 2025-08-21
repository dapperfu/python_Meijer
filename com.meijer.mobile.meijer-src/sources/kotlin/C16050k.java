package kotlin;

import H1.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C6034t0;
import f1.InterfaceC13938a;
import g0.C14289g;
import g0.C14291i;
import i0.C14592e;
import kotlin.C6453j;
import kotlin.E0;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13906N;
import kotlin.InterfaceC6452i;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0003\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lo0/k;", "", "<init>", "()V", "Lo0/C;", "state", "Lo0/A;", "pagerSnapDistance", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "snapAnimationSpec", "snapPositionalThreshold", "Lf0/N;", "a", "(Lo0/C;Lo0/A;Lc0/y;Lc0/i;FLandroidx/compose/runtime/Composer;II)Lf0/N;", "Lf0/z;", "orientation", "Lf1/a;", "b", "(Lo0/C;Lf0/z;Landroidx/compose/runtime/Composer;I)Lf1/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16050k {

    /* renamed from: a, reason: collision with root package name */
    public static final C16050k f153464a = new C16050k();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "flingVelocity", "lowerBound", "upperBound", "a", "(FFF)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.k$a */
    static final class a extends Lambda implements Function3<Float, Float, Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153465f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ t f153466g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f153467h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC16037C abstractC16037C, t tVar, float f10) {
            super(3);
            this.f153465f = abstractC16037C;
            this.f153466g = tVar;
            this.f153467h = f10;
        }

        public final Float a(float f10, float f11, float f12) {
            return Float.valueOf(C14289g.c(this.f153465f, this.f153466g, this.f153467h, f10, f11, f12));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11, Float f12) {
            return a(f10.floatValue(), f11.floatValue(), f12.floatValue());
        }
    }

    public final InterfaceC13906N a(AbstractC16037C abstractC16037C, InterfaceC16035A interfaceC16035A, InterfaceC6468y<Float> interfaceC6468y, InterfaceC6452i<Float> interfaceC6452i, float f10, Composer composer, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            interfaceC16035A = InterfaceC16035A.INSTANCE.a(1);
        }
        if ((i11 & 4) != 0) {
            interfaceC6468y = y.b(composer, 0);
        }
        if ((i11 & 8) != 0) {
            interfaceC6452i = C6453j.j(0.0f, 400.0f, Float.valueOf(E0.b(IntCompanionObject.f143731a)), 1, null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f10 && f10 <= 1.0f)) {
            C14592e.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10);
        }
        Object obj = (H1.d) composer.o(C6034t0.g());
        t tVar = (t) composer.o(C6034t0.m());
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(abstractC16037C)) || (i10 & 6) == 4) | composer.V(interfaceC6468y) | composer.V(interfaceC6452i);
        if ((((i10 & 112) ^ 48) <= 32 || !composer.V(interfaceC16035A)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean zV2 = zV | z10 | composer.V(obj) | composer.V(tVar);
        Object objB = composer.B();
        if (zV2 || objB == Composer.INSTANCE.a()) {
            objB = C14291i.l(C14289g.a(abstractC16037C, interfaceC16035A, new a(abstractC16037C, tVar, f10)), interfaceC6468y, interfaceC6452i);
            composer.t(objB);
        }
        InterfaceC13906N interfaceC13906N = (InterfaceC13906N) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC13906N;
    }

    private C16050k() {
    }

    public final InterfaceC13938a b(AbstractC16037C abstractC16037C, EnumC13937z enumC13937z, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z11 = false;
        if ((((i10 & 14) ^ 6) > 4 && composer.V(abstractC16037C)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && composer.V(enumC13937z)) || (i10 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = z10 | z11;
        Object objB = composer.B();
        if (z12 || objB == Composer.INSTANCE.a()) {
            objB = new C16040a(abstractC16037C, enumC13937z);
            composer.t(objB);
        }
        C16040a c16040a = (C16040a) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c16040a;
    }
}
