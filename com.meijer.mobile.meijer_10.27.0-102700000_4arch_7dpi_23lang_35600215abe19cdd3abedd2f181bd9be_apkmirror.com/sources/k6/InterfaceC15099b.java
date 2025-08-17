package k6;

import g6.C14209i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0080\u0001\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lk6/b;", "Lk6/h;", "Lg6/i;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "r", "(Lg6/i;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Lk6/j;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lk6/i;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "h", "(Lg6/i;IIZFLk6/j;FZLk6/i;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15099b extends InterfaceC15105h {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k6.b$a */
    public static final class a {
        public static /* synthetic */ Object a(InterfaceC15099b interfaceC15099b, C14209i c14209i, int i10, int i11, boolean z10, float f10, AbstractC15107j abstractC15107j, float f11, boolean z11, EnumC15106i enumC15106i, boolean z12, boolean z13, Continuation continuation, int i12, Object obj) {
            boolean z14;
            InterfaceC15099b interfaceC15099b2;
            Continuation continuation2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iE = (i12 & 2) != 0 ? interfaceC15099b.E() : i10;
            int iY = (i12 & 4) != 0 ? interfaceC15099b.y() : i11;
            boolean zX = (i12 & 8) != 0 ? interfaceC15099b.x() : z10;
            float fA = (i12 & 16) != 0 ? interfaceC15099b.A() : f10;
            AbstractC15107j abstractC15107jG = (i12 & 32) != 0 ? interfaceC15099b.G() : abstractC15107j;
            float fC = (i12 & 64) != 0 ? C15101d.c(c14209i, abstractC15107jG, fA) : f11;
            boolean z15 = (i12 & 128) != 0 ? false : z11;
            EnumC15106i enumC15106i2 = (i12 & 256) != 0 ? EnumC15106i.f141546a : enumC15106i;
            boolean z16 = (i12 & 512) != 0 ? false : z12;
            if ((i12 & 1024) != 0) {
                z14 = false;
                continuation2 = continuation;
                interfaceC15099b2 = interfaceC15099b;
            } else {
                z14 = z13;
                interfaceC15099b2 = interfaceC15099b;
                continuation2 = continuation;
            }
            return interfaceC15099b2.h(c14209i, iE, iY, zX, fA, abstractC15107jG, fC, z15, enumC15106i2, z16, z14, continuation2);
        }

        public static /* synthetic */ Object b(InterfaceC15099b interfaceC15099b, C14209i c14209i, float f10, int i10, boolean z10, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i11 & 1) != 0) {
                c14209i = interfaceC15099b.F();
            }
            if ((i11 & 2) != 0) {
                f10 = interfaceC15099b.C();
            }
            if ((i11 & 4) != 0) {
                i10 = interfaceC15099b.E();
            }
            if ((i11 & 8) != 0) {
                z10 = !(f10 == interfaceC15099b.C());
            }
            return interfaceC15099b.r(c14209i, f10, i10, z10, continuation);
        }
    }

    Object h(C14209i c14209i, int i10, int i11, boolean z10, float f10, AbstractC15107j abstractC15107j, float f11, boolean z11, EnumC15106i enumC15106i, boolean z12, boolean z13, Continuation<? super Unit> continuation);

    Object r(C14209i c14209i, float f10, int i10, boolean z10, Continuation<? super Unit> continuation);
}
