package k6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import g6.C14209i;
import k6.InterfaceC15099b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk6/b;", "d", "(Landroidx/compose/runtime/Composer;I)Lk6/b;", "a", "()Lk6/b;", "", "e", "(Lk6/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg6/i;", "composition", "Lk6/j;", "clipSpec", "", "speed", "c", "(Lg6/i;Lk6/j;F)F", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15101d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(C14209i c14209i, AbstractC15107j abstractC15107j, float f10) {
        if (f10 < 0.0f && c14209i == null) {
            return 1.0f;
        }
        if (c14209i == null) {
            return 0.0f;
        }
        if (f10 < 0.0f) {
            if (abstractC15107j != null) {
                return abstractC15107j.a(c14209i);
            }
            return 1.0f;
        }
        if (abstractC15107j != null) {
            return abstractC15107j.b(c14209i);
        }
        return 0.0f;
    }

    public static final InterfaceC15099b a() {
        return new C15100c();
    }

    public static final InterfaceC15099b d(Composer composer, int i10) {
        composer.startReplaceableGroup(2024497114);
        if (ComposerKt.M()) {
            ComposerKt.U(2024497114, i10, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.startReplaceableGroup(-610207850);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = a();
            composer.t(objB);
        }
        InterfaceC15099b interfaceC15099b = (InterfaceC15099b) objB;
        composer.U();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return interfaceC15099b;
    }

    public static final Object e(InterfaceC15099b interfaceC15099b, Continuation<? super Unit> continuation) {
        Object objB = InterfaceC15099b.a.b(interfaceC15099b, null, c(interfaceC15099b.F(), interfaceC15099b.G(), interfaceC15099b.A()), 1, false, continuation, 9, null);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f142422a;
    }
}
