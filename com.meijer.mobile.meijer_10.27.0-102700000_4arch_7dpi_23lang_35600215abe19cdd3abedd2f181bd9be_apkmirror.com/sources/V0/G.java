package V0;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0002\u000f\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"LV0/G;", "LV0/d1;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "d", "(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)J", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "a", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "b", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/view/ViewGroup;", "", "Ljava/lang/Object;", "lock", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "viewLayerContainer", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;", "componentCallback", "e", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class G implements InterfaceC5310d1 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f36402f = true;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup ownerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private DrawChildContainer viewLayerContainer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2 componentCallback = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LV0/G$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36407a = new b();

        private b() {
        }

        @JvmStatic
        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    private final long c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(view);
        }
        return -1L;
    }

    private final DrawChildContainer d(ViewGroup ownerView) {
        DrawChildContainer drawChildContainer = this.viewLayerContainer;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(ownerView.getContext());
        ownerView.addView(viewLayerContainer);
        this.viewLayerContainer = viewLayerContainer;
        return viewLayerContainer;
    }

    @Override // V0.InterfaceC5310d1
    public GraphicsLayer a() {
        androidx.compose.ui.graphics.layer.b eVar;
        GraphicsLayer graphicsLayer;
        synchronized (this.lock) {
            try {
                long jC = c(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    eVar = new androidx.compose.ui.graphics.layer.d(jC, null, null, 6, null);
                } else if (f36402f) {
                    try {
                        eVar = new androidx.compose.ui.graphics.layer.c(this.ownerView, jC, null, null, 12, null);
                    } catch (Throwable unused) {
                        f36402f = false;
                        eVar = new androidx.compose.ui.graphics.layer.e(d(this.ownerView), jC, null, null, 12, null);
                    }
                } else {
                    eVar = new androidx.compose.ui.graphics.layer.e(d(this.ownerView), jC, null, null, 12, null);
                }
                graphicsLayer = new GraphicsLayer(eVar, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return graphicsLayer;
    }

    @Override // V0.InterfaceC5310d1
    public void b(GraphicsLayer layer) {
        synchronized (this.lock) {
            layer.H();
            Unit unit = Unit.f142422a;
        }
    }

    public G(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
    }
}
