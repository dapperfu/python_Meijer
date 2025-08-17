package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/c0;", "Landroidx/compose/ui/Modifier$b;", "LH1/d;", "", "parentData", "R", "(LH1/d;Ljava/lang/Object;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c0 extends Modifier.b {
    Object R(H1.d dVar, Object obj);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(c0 c0Var, Function1<? super Modifier.b, Boolean> function1) {
            return c0.super.all(function1);
        }

        @Deprecated
        public static boolean b(c0 c0Var, Function1<? super Modifier.b, Boolean> function1) {
            return c0.super.any(function1);
        }

        @Deprecated
        public static <R> R c(c0 c0Var, R r10, Function2<? super R, ? super Modifier.b, ? extends R> function2) {
            return (R) c0.super.foldIn(r10, function2);
        }

        @Deprecated
        public static Modifier d(c0 c0Var, Modifier modifier) {
            return c0.super.then(modifier);
        }
    }
}
