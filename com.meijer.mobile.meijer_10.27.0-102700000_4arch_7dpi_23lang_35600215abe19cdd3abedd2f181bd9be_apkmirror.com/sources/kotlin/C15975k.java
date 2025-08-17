package kotlin;

import H1.t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.C5892t0;
import f1.InterfaceC13828a;
import g0.C14160g;
import g0.C14162i;
import i0.C14589e;
import kotlin.C6327j;
import kotlin.E0;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13796N;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
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
public final class C15975k {

    /* renamed from: a, reason: collision with root package name */
    public static final C15975k f153019a = new C15975k();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0005\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "flingVelocity", "lowerBound", "upperBound", "a", "(FFF)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.k$a */
    static final class a extends Lambda implements Function3<Float, Float, Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC15962C f153020f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ t f153021g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f153022h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC15962C abstractC15962C, t tVar, float f10) {
            super(3);
            this.f153020f = abstractC15962C;
            this.f153021g = tVar;
            this.f153022h = f10;
        }

        public final Float a(float f10, float f11, float f12) {
            return Float.valueOf(C14160g.c(this.f153020f, this.f153021g, this.f153022h, f10, f11, f12));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11, Float f12) {
            return a(f10.floatValue(), f11.floatValue(), f12.floatValue());
        }
    }

    public final InterfaceC13796N a(AbstractC15962C abstractC15962C, InterfaceC15960A interfaceC15960A, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i, float f10, Composer composer, int i10, int i11) {
        boolean z10 = true;
        if ((i11 & 2) != 0) {
            interfaceC15960A = InterfaceC15960A.INSTANCE.a(1);
        }
        if ((i11 & 4) != 0) {
            interfaceC6342y = y.b(composer, 0);
        }
        if ((i11 & 8) != 0) {
            interfaceC6326i = C6327j.j(0.0f, 400.0f, Float.valueOf(E0.b(IntCompanionObject.f142824a)), 1, null);
        }
        if ((i11 & 16) != 0) {
            f10 = 0.5f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1559769181, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f10 && f10 <= 1.0f)) {
            C14589e.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f10);
        }
        Object obj = (H1.d) composer.o(C5892t0.g());
        t tVar = (t) composer.o(C5892t0.m());
        boolean zV = ((((i10 & 14) ^ 6) > 4 && composer.V(abstractC15962C)) || (i10 & 6) == 4) | composer.V(interfaceC6342y) | composer.V(interfaceC6326i);
        if ((((i10 & 112) ^ 48) <= 32 || !composer.V(interfaceC15960A)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean zV2 = zV | z10 | composer.V(obj) | composer.V(tVar);
        Object objB = composer.B();
        if (zV2 || objB == Composer.INSTANCE.a()) {
            objB = C14162i.l(C14160g.a(abstractC15962C, interfaceC15960A, new a(abstractC15962C, tVar, f10)), interfaceC6342y, interfaceC6326i);
            composer.t(objB);
        }
        InterfaceC13796N interfaceC13796N = (InterfaceC13796N) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC13796N;
    }

    private C15975k() {
    }

    public final InterfaceC13828a b(AbstractC15962C abstractC15962C, EnumC13827z enumC13827z, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(877583120, i10, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z11 = false;
        if ((((i10 & 14) ^ 6) > 4 && composer.V(abstractC15962C)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && composer.V(enumC13827z)) || (i10 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = z10 | z11;
        Object objB = composer.B();
        if (z12 || objB == Composer.INSTANCE.a()) {
            objB = new C15965a(abstractC15962C, enumC13827z);
            composer.t(objB);
        }
        C15965a c15965a = (C15965a) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c15965a;
    }
}
