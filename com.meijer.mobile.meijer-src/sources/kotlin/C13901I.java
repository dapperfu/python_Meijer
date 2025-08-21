package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Lf0/H;", "a", "(Lkotlin/jvm/functions/Function1;)Lf0/H;", "b", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lf0/H;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.I, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13901I {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f0.I$a */
    static final class a extends Lambda implements Function1<Float, Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Float>> f130972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(z1<? extends Function1<? super Float, Float>> z1Var) {
            super(1);
            this.f130972f = z1Var;
        }

        public final Float b(float f10) {
            return this.f130972f.getValue().invoke(Float.valueOf(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    public static final InterfaceC13900H a(Function1<? super Float, Float> function1) {
        return new C13923l(function1);
    }

    public static final InterfaceC13900H b(Function1<? super Float, Float> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-180460798, i10, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:159)");
        }
        z1 z1VarP = o1.p(function1, composer, i10 & 14);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = a(new a(z1VarP));
            composer.t(objB);
        }
        InterfaceC13900H interfaceC13900H = (InterfaceC13900H) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC13900H;
    }
}
