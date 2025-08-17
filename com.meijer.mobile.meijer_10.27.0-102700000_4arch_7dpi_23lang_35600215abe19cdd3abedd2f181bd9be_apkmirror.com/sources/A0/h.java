package A0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.C5892t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "refreshing", "Lkotlin/Function0;", "", "onRefresh", "LH1/h;", "refreshThreshold", "refreshingOffset", "LA0/g;", "a", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)LA0/g;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f73f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f74g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f75h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f76i;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, boolean z10, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(0);
            this.f73f = gVar;
            this.f74g = z10;
            this.f75h = floatRef;
            this.f76i = floatRef2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f73f.t(this.f74g);
            this.f73f.v(this.f75h.f142832a);
            this.f73f.u(this.f76i.f142832a);
        }
    }

    public static final g a(boolean z10, Function0<Unit> function0, float f10, float f11, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            f10 = b.f12a.a();
        }
        if ((i11 & 8) != 0) {
            f11 = b.f12a.b();
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (H1.h.o(f10, H1.h.p(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = J.k(EmptyCoroutineContext.f142646a, composer);
            composer.t(objB);
        }
        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
        z1 z1VarP = o1.p(function0, composer, (i10 >> 3) & 14);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        H1.d dVar = (H1.d) composer.o(C5892t0.g());
        floatRef.f142832a = dVar.I1(f10);
        floatRef2.f142832a = dVar.I1(f11);
        boolean zV = composer.V(interfaceC16622O);
        Object objB2 = composer.B();
        if (zV || objB2 == companion.a()) {
            objB2 = new g(interfaceC16622O, z1VarP, floatRef2.f142832a, floatRef.f142832a);
            composer.t(objB2);
        }
        g gVar = (g) objB2;
        boolean zD = composer.D(gVar) | ((((i10 & 14) ^ 6) > 4 && composer.a(z10)) || (i10 & 6) == 4) | composer.b(floatRef.f142832a) | composer.b(floatRef2.f142832a);
        Object objB3 = composer.B();
        if (zD || objB3 == companion.a()) {
            objB3 = new a(gVar, z10, floatRef, floatRef2);
            composer.t(objB3);
        }
        J.i((Function0) objB3, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return gVar;
    }
}
