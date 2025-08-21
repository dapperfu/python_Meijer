package kotlin;

import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.z1;
import kotlin.C6443c;
import kotlin.C6446d0;
import kotlin.C6453j;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LV0/q0;", "targetValue", "Lc0/i;", "animationSpec", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/z1;", "a", "(JLc0/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Lc0/d0;", "Lc0/d0;", "colorDefaultSpring", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final C6446d0<C5489q0> f59845a = C6453j.j(0.0f, 0.0f, null, 7, null);

    public static final z1<C5489q0> a(long j10, InterfaceC6452i<C5489q0> interfaceC6452i, String str, Function1<? super C5489q0, Unit> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6452i = f59845a;
        }
        InterfaceC6452i<C5489q0> interfaceC6452i2 = interfaceC6452i;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super C5489q0, Unit> function12 = function1;
        if (ComposerKt.M()) {
            ComposerKt.U(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:60)");
        }
        boolean zV = composer.V(C5489q0.v(j10));
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = (o0) C6308h.a(C5489q0.INSTANCE).invoke(C5489q0.v(j10));
            composer.t(objB);
        }
        int i12 = i10 << 6;
        z1<C5489q0> z1VarE = C6443c.e(C5489q0.m(j10), (o0) objB, interfaceC6452i2, null, str2, function12, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarE;
    }
}
