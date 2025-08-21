package l6;

import h6.C14478i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0080\u0001\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll6/b;", "Ll6/h;", "Lh6/i;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "F", "(Lh6/i;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Ll6/j;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Ll6/i;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "j", "(Lh6/i;IIZFLl6/j;FZLl6/i;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15458b extends InterfaceC15464h {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l6.b$a */
    public static final class a {
        public static /* synthetic */ Object a(InterfaceC15458b interfaceC15458b, C14478i c14478i, int i10, int i11, boolean z10, float f10, AbstractC15466j abstractC15466j, float f11, boolean z11, EnumC15465i enumC15465i, boolean z12, boolean z13, Continuation continuation, int i12, Object obj) {
            boolean z14;
            InterfaceC15458b interfaceC15458b2;
            Continuation continuation2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iC = (i12 & 2) != 0 ? interfaceC15458b.C() : i10;
            int iX = (i12 & 4) != 0 ? interfaceC15458b.x() : i11;
            boolean zV = (i12 & 8) != 0 ? interfaceC15458b.v() : z10;
            float fY = (i12 & 16) != 0 ? interfaceC15458b.y() : f10;
            AbstractC15466j abstractC15466jG = (i12 & 32) != 0 ? interfaceC15458b.G() : abstractC15466j;
            float fC = (i12 & 64) != 0 ? C15460d.c(c14478i, abstractC15466jG, fY) : f11;
            boolean z15 = (i12 & 128) != 0 ? false : z11;
            EnumC15465i enumC15465i2 = (i12 & 256) != 0 ? EnumC15465i.f149443a : enumC15465i;
            boolean z16 = (i12 & 512) != 0 ? false : z12;
            if ((i12 & 1024) != 0) {
                z14 = false;
                continuation2 = continuation;
                interfaceC15458b2 = interfaceC15458b;
            } else {
                z14 = z13;
                interfaceC15458b2 = interfaceC15458b;
                continuation2 = continuation;
            }
            return interfaceC15458b2.j(c14478i, iC, iX, zV, fY, abstractC15466jG, fC, z15, enumC15465i2, z16, z14, continuation2);
        }

        public static /* synthetic */ Object b(InterfaceC15458b interfaceC15458b, C14478i c14478i, float f10, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i11 & 1) != 0) {
                c14478i = interfaceC15458b.E();
            }
            if ((i11 & 2) != 0) {
                f10 = interfaceC15458b.B();
            }
            if ((i11 & 4) != 0) {
                i10 = interfaceC15458b.C();
            }
            if ((i11 & 8) != 0) {
                z10 = !(f10 == interfaceC15458b.B());
            }
            return interfaceC15458b.F(c14478i, f10, i10, z10, continuation);
        }
    }

    Object F(C14478i c14478i, float f10, int i10, boolean z10, Continuation<? super Unit> continuation);

    Object j(C14478i c14478i, int i10, int i11, boolean z10, float f10, AbstractC15466j abstractC15466j, float f11, boolean z11, EnumC15465i enumC15465i, boolean z12, boolean z13, Continuation<? super Unit> continuation);
}
