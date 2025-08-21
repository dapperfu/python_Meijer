package m0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.EnumC13937z;
import kotlin.InterfaceC15852K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16808b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm0/I;", "state", "", "reverseScrolling", "Ln0/K;", "a", "(Lm0/I;ZLandroidx/compose/runtime/Composer;I)Ln0/K;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15625K {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"m0/K$a", "Ln0/K;", "", "index", "", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr1/b;", "d", "()Lr1/b;", "", "f", "()F", "scrollOffset", "a", "maxScrollOffset", "e", "()I", "viewport", "c", "contentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: m0.K$a */
    public static final class a implements InterfaceC15852K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15623I f150319a;

        a(C15623I c15623i) {
            this.f150319a = c15623i;
        }

        @Override // kotlin.InterfaceC15852K
        public float a() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f150319a.p(), this.f150319a.q(), this.f150319a.e());
        }

        @Override // kotlin.InterfaceC15852K
        public Object b(int i10, Continuation<? super Unit> continuation) {
            Object objG = C15623I.G(this.f150319a, i10, 0, continuation, 2, null);
            return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
        }

        @Override // kotlin.InterfaceC15852K
        public int c() {
            return this.f150319a.u().d() + this.f150319a.u().getAfterContentPadding();
        }

        @Override // kotlin.InterfaceC15852K
        public C16808b d() {
            return new C16808b(-1, -1);
        }

        @Override // kotlin.InterfaceC15852K
        public int e() {
            return (int) (this.f150319a.u().getOrientation() == EnumC13937z.f131419a ? this.f150319a.u().a() & 4294967295L : this.f150319a.u().a() >> 32);
        }

        @Override // kotlin.InterfaceC15852K
        public float f() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f150319a.p(), this.f150319a.q());
        }
    }

    public static final InterfaceC15852K a(C15623I c15623i, boolean z10, Composer composer, int i10) {
        boolean z11;
        if (ComposerKt.M()) {
            ComposerKt.U(-1247008005, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z12 = false;
        if ((((i10 & 14) ^ 6) > 4 && composer.V(c15623i)) || (i10 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z12 = true;
        }
        boolean z13 = z11 | z12;
        Object objB = composer.B();
        if (z13 || objB == Composer.INSTANCE.a()) {
            objB = new a(c15623i);
            composer.t(objB);
        }
        a aVar = (a) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return aVar;
    }
}
