package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.platform.O0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\n\u0010\u000bR(\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/a;", "Landroidx/compose/ui/Modifier$b;", "Landroidx/compose/ui/platform/O0;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "factory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "c", "Lkotlin/jvm/functions/Function3;", "b", "()Lkotlin/jvm/functions/Function3;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
class a extends O0 implements Modifier.b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function3<Modifier, Composer, Integer, Modifier> factory;

    public final Function3<Modifier, Composer, Integer, Modifier> b() {
        return this.factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function1<? super N0, Unit> function1, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> function3) {
        super(function1);
        this.factory = function3;
    }
}
