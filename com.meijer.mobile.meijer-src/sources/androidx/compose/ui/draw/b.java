package androidx.compose.ui.draw;

import T0.i;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u000b\u0010\u0007\u001a&\u0010\r\u001a\u00020\f2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "onDraw", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "LT0/d;", "LT0/i;", "onBuildDrawCache", "c", "LT0/c;", "a", "(Lkotlin/jvm/functions/Function1;)LT0/c;", "LX0/c;", "d", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static final T0.c a(Function1<? super T0.d, i> function1) {
        return new a(new T0.d(), function1);
    }

    public static final Modifier b(Modifier modifier, Function1<? super X0.f, Unit> function1) {
        return modifier.then(new DrawBehindElement(function1));
    }

    public static final Modifier c(Modifier modifier, Function1<? super T0.d, i> function1) {
        return modifier.then(new DrawWithCacheElement(function1));
    }

    public static final Modifier d(Modifier modifier, Function1<? super X0.c, Unit> function1) {
        return modifier.then(new DrawWithContentElement(function1));
    }
}
