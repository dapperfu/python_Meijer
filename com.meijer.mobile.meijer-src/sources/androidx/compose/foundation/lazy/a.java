package androidx.compose.foundation.lazy;

import H1.n;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.ui.Modifier;
import com.google.android.gms.common.api.a;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJC\u0010\u0016\u001a\u00020\n*\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/a;", "Ll0/c;", "<init>", "()V", "", "width", "height", "", "i", "(II)V", "Landroidx/compose/ui/Modifier;", "", "fraction", "g", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "e", "d", "Lc0/F;", "fadeInSpec", "LH1/n;", "placementSpec", "fadeOutSpec", "h", "(Landroidx/compose/ui/Modifier;Lc0/F;Lc0/F;Lc0/F;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/j0;", "a", "Landroidx/compose/runtime/j0;", "maxWidthState", "b", "maxHeightState", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements InterfaceC15433c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5868j0 maxWidthState = C5844c1.a(a.e.API_PRIORITY_OTHER);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5868j0 maxHeightState = C5844c1.a(a.e.API_PRIORITY_OTHER);

    @Override // l0.InterfaceC15433c
    public Modifier d(Modifier modifier, float f10) {
        return modifier.then(new ParentSizeElement(f10, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // l0.InterfaceC15433c
    public Modifier e(Modifier modifier, float f10) {
        return modifier.then(new ParentSizeElement(f10, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    @Override // l0.InterfaceC15433c
    public Modifier g(Modifier modifier, float f10) {
        return modifier.then(new ParentSizeElement(f10, this.maxWidthState, this.maxHeightState, "fillParentMaxSize"));
    }

    @Override // l0.InterfaceC15433c
    public Modifier h(Modifier modifier, InterfaceC6419F<Float> interfaceC6419F, InterfaceC6419F<n> interfaceC6419F2, InterfaceC6419F<Float> interfaceC6419F3) {
        return (interfaceC6419F == null && interfaceC6419F2 == null && interfaceC6419F3 == null) ? modifier : modifier.then(new LazyLayoutAnimateItemElement(interfaceC6419F, interfaceC6419F2, interfaceC6419F3));
    }

    public final void i(int width, int height) {
        this.maxWidthState.i(width);
        this.maxHeightState.i(height);
    }
}
