package l6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h6.C14478i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import l6.InterfaceC15458b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll6/b;", "d", "(Landroidx/compose/runtime/Composer;I)Ll6/b;", "a", "()Ll6/b;", "", "e", "(Ll6/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh6/i;", "composition", "Ll6/j;", "clipSpec", "", "speed", "c", "(Lh6/i;Ll6/j;F)F", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15460d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(C14478i c14478i, AbstractC15466j abstractC15466j, float f10) {
        if (f10 < 0.0f && c14478i == null) {
            return 1.0f;
        }
        if (c14478i == null) {
            return 0.0f;
        }
        if (f10 < 0.0f) {
            if (abstractC15466j != null) {
                return abstractC15466j.a(c14478i);
            }
            return 1.0f;
        }
        if (abstractC15466j != null) {
            return abstractC15466j.b(c14478i);
        }
        return 0.0f;
    }

    public static final InterfaceC15458b a() {
        return new C15459c();
    }

    public static final InterfaceC15458b d(Composer composer, int i10) {
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
        InterfaceC15458b interfaceC15458b = (InterfaceC15458b) objB;
        composer.U();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return interfaceC15458b;
    }

    public static final Object e(InterfaceC15458b interfaceC15458b, Continuation<? super Unit> continuation) {
        Object objB = InterfaceC15458b.a.b(interfaceC15458b, null, c(interfaceC15458b.E(), interfaceC15458b.G(), interfaceC15458b.y()), 1, false, continuation, 9, null);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f143329a;
    }
}
