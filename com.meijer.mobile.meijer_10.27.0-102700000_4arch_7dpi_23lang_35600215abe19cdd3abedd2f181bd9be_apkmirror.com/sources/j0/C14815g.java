package j0;

import P0.e;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.Modifier;
import k0.C15086a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lj0/g;", "Lj0/f;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "LP0/e$b;", "alignment", "c", "(Landroidx/compose/ui/Modifier;LP0/e$b;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14815g implements InterfaceC14814f {

    /* renamed from: a, reason: collision with root package name */
    public static final C14815g f139108a = new C14815g();

    @Override // j0.InterfaceC14814f
    public Modifier a(Modifier modifier, float f10, boolean z10) {
        if (!(((double) f10) > 0.0d)) {
            C15086a.a("invalid weight; must be greater than zero");
        }
        return modifier.then(new LayoutWeightElement(RangesKt.j(f10, Float.MAX_VALUE), z10));
    }

    @Override // j0.InterfaceC14814f
    public Modifier c(Modifier modifier, e.b bVar) {
        return modifier.then(new HorizontalAlignElement(bVar));
    }

    private C14815g() {
    }
}
