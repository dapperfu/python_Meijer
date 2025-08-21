package androidx.compose.ui.draw;

import V0.InterfaceC5453d1;
import Z.T;
import Z.d0;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/draw/f;", "LV0/d1;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "a", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "b", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "d", "LZ/T;", "LZ/T;", "allocatedGraphicsLayers", "value", "LV0/d1;", "c", "()LV0/d1;", "e", "(LV0/d1;)V", "graphicsContext", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class f implements InterfaceC5453d1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private T<GraphicsLayer> allocatedGraphicsLayers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5453d1 graphicsContext;

    @Override // V0.InterfaceC5453d1
    public GraphicsLayer a() {
        InterfaceC5453d1 interfaceC5453d1 = this.graphicsContext;
        if (!(interfaceC5453d1 != null)) {
            C14920a.b("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayerA = interfaceC5453d1.a();
        T<GraphicsLayer> t10 = this.allocatedGraphicsLayers;
        if (t10 == null) {
            this.allocatedGraphicsLayers = d0.g(graphicsLayerA);
            return graphicsLayerA;
        }
        t10.n(graphicsLayerA);
        return graphicsLayerA;
    }

    @Override // V0.InterfaceC5453d1
    public void b(GraphicsLayer layer) {
        InterfaceC5453d1 interfaceC5453d1 = this.graphicsContext;
        if (interfaceC5453d1 != null) {
            interfaceC5453d1.b(layer);
        }
    }

    /* renamed from: c, reason: from getter */
    public final InterfaceC5453d1 getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void d() {
        T<GraphicsLayer> t10 = this.allocatedGraphicsLayers;
        if (t10 != null) {
            Object[] objArr = t10.content;
            int i10 = t10._size;
            for (int i11 = 0; i11 < i10; i11++) {
                b((GraphicsLayer) objArr[i11]);
            }
            t10.t();
        }
    }

    public final void e(InterfaceC5453d1 interfaceC5453d1) {
        d();
        this.graphicsContext = interfaceC5453d1;
    }
}
