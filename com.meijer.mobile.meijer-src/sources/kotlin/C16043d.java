package kotlin;

import kotlin.EnumC13937z;
import kotlin.InterfaceC15852K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16808b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo0/C;", "state", "", "isVertical", "Ln0/K;", "a", "(Lo0/C;Z)Ln0/K;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16043d {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"o0/d$a", "Ln0/K;", "", "index", "", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lr1/b;", "d", "()Lr1/b;", "", "f", "()F", "scrollOffset", "a", "maxScrollOffset", "e", "()I", "viewport", "c", "contentPadding", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: o0.d$a */
    public static final class a implements InterfaceC15852K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f153443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f153444b;

        a(AbstractC16037C abstractC16037C, boolean z10) {
            this.f153443a = abstractC16037C;
            this.f153444b = z10;
        }

        @Override // kotlin.InterfaceC15852K
        public float a() {
            return C16038D.g(this.f153443a.C(), this.f153443a.H());
        }

        @Override // kotlin.InterfaceC15852K
        public Object b(int i10, Continuation<? super Unit> continuation) {
            Object objD0 = AbstractC16037C.d0(this.f153443a, i10, 0.0f, continuation, 2, null);
            return objD0 == IntrinsicsKt.f() ? objD0 : Unit.f143329a;
        }

        @Override // kotlin.InterfaceC15852K
        public int c() {
            return this.f153443a.C().d() + this.f153443a.C().getAfterContentPadding();
        }

        @Override // kotlin.InterfaceC15852K
        public C16808b d() {
            return this.f153444b ? new C16808b(this.f153443a.H(), 1) : new C16808b(1, this.f153443a.H());
        }

        @Override // kotlin.InterfaceC15852K
        public int e() {
            return (int) (this.f153443a.C().getOrientation() == EnumC13937z.f131419a ? this.f153443a.C().a() & 4294967295L : this.f153443a.C().a() >> 32);
        }

        @Override // kotlin.InterfaceC15852K
        public float f() {
            return C16063x.a(this.f153443a);
        }
    }

    public static final InterfaceC15852K a(AbstractC16037C abstractC16037C, boolean z10) {
        return new a(abstractC16037C, z10);
    }
}
