package A0;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001as\u0010\u0012\u001a\u00020\u0000*\u00020\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u000721\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier;", "LA0/g;", "state", "", "enabled", "b", "(Landroidx/compose/ui/Modifier;LA0/g;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onPull", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "onRelease", "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {
        a(Object obj) {
            super(1, obj, g.class, "onPull", "onPull$material_release(F)F", 0);
        }

        public final Float a(float f10) {
            return Float.valueOf(((g) this.receiver).q(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends AdaptedFunctionReference implements Function2<Float, Continuation<? super Float>, Object>, SuspendFunction {
        b(Object obj) {
            super(2, obj, g.class, "onRelease", "onRelease$material_release(F)F", 4);
        }

        public final Object a(float f10, Continuation<? super Float> continuation) {
            return e.e((g) this.f143708a, f10, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f10, Continuation<? super Float> continuation) {
            return a(f10.floatValue(), continuation);
        }
    }

    public static final Modifier b(Modifier modifier, g gVar, boolean z10) {
        return c(modifier, new a(gVar), new b(gVar), z10);
    }

    public static final Modifier c(Modifier modifier, Function1<? super Float, Float> function1, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> function2, boolean z10) {
        return androidx.compose.ui.input.nestedscroll.a.b(modifier, new f(function1, function2, z10), null, 2, null);
    }

    public static /* synthetic */ Modifier d(Modifier modifier, g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return b(modifier, gVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object e(g gVar, float f10, Continuation continuation) {
        return Boxing.c(gVar.r(f10));
    }
}
