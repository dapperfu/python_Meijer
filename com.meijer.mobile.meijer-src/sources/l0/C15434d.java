package l0;

import kotlin.EnumC13937z;
import kotlin.InterfaceC15852K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16808b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll0/A;", "state", "", "isVertical", "Ln0/K;", "a", "(Ll0/A;Z)Ln0/K;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15434d {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"l0/d$a", "Ln0/K;", "", "index", "", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr1/b;", "d", "()Lr1/b;", "", "f", "()F", "scrollOffset", "a", "maxScrollOffset", "e", "()I", "viewport", "c", "contentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: l0.d$a */
    public static final class a implements InterfaceC15852K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15429A f149041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f149042b;

        a(C15429A c15429a, boolean z10) {
            this.f149041a = c15429a;
            this.f149042b = z10;
        }

        @Override // kotlin.InterfaceC15852K
        public float a() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f149041a.s(), this.f149041a.t(), this.f149041a.e());
        }

        @Override // kotlin.InterfaceC15852K
        public Object b(int i10, Continuation<? super Unit> continuation) {
            Object objJ = C15429A.J(this.f149041a, i10, 0, continuation, 2, null);
            return objJ == IntrinsicsKt.f() ? objJ : Unit.f143329a;
        }

        @Override // kotlin.InterfaceC15852K
        public int c() {
            return this.f149041a.x().d() + this.f149041a.x().getAfterContentPadding();
        }

        @Override // kotlin.InterfaceC15852K
        public C16808b d() {
            return this.f149042b ? new C16808b(-1, 1) : new C16808b(1, -1);
        }

        @Override // kotlin.InterfaceC15852K
        public int e() {
            return (int) (this.f149041a.x().getOrientation() == EnumC13937z.f131419a ? this.f149041a.x().a() & 4294967295L : this.f149041a.x().a() >> 32);
        }

        @Override // kotlin.InterfaceC15852K
        public float f() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f149041a.s(), this.f149041a.t());
        }
    }

    public static final InterfaceC15852K a(C15429A c15429a, boolean z10) {
        return new a(c15429a, z10);
    }
}
