package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR'\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0002\b\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/J;", "", "", "s", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "r", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface J {
    int getHeight();

    int getWidth();

    Map<AbstractC5916a, Integer> r();

    void s();

    default Function1<l0, Unit> t() {
        return null;
    }
}
