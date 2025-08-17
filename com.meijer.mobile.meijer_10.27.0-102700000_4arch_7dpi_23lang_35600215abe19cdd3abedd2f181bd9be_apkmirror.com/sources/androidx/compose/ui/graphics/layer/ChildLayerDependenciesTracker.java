package androidx.compose.ui.graphics.layer;

import V0.C5325i1;
import Z.X;
import Z.k0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.fullstory.instrumentation.frameworks.compose.FSComposeChildLayerDependenciesTracker;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "onDependencyRemoved", "Lkotlin/Function0;", "block", "withTracking", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "graphicsLayer", "", "i", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "a", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "dependency", "b", "oldDependency", "LZ/X;", "c", "LZ/X;", "dependenciesSet", "d", "oldDependenciesSet", "trackingInProgress", "Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ChildLayerDependenciesTracker implements FSComposeChildLayerDependenciesTracker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer dependency;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer oldDependency;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private X<GraphicsLayer> dependenciesSet;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private X<GraphicsLayer> oldDependenciesSet;
    private boolean trackingInProgress;

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeChildLayerDependenciesTracker
    /* renamed from: _fsGetTrackingInProgress, reason: from getter */
    public final boolean getTrackingInProgress() {
        return this.trackingInProgress;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeChildLayerDependenciesTracker
    public void _fsWithTracking(Consumer consumer, Runnable runnable) {
        withTracking(FullStoryAnnotationsKt.__consumerToFunction1(consumer), FullStoryAnnotationsKt.__runnableToFunction0(runnable));
    }

    public final boolean i(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            C5325i1.a("Only add dependencies during a tracking");
        }
        X<GraphicsLayer> x10 = this.dependenciesSet;
        if (x10 != null) {
            Intrinsics.g(x10);
            x10.h(graphicsLayer);
        } else if (this.dependency != null) {
            X<GraphicsLayer> xA = k0.a();
            GraphicsLayer graphicsLayer2 = this.dependency;
            Intrinsics.g(graphicsLayer2);
            xA.h(graphicsLayer2);
            xA.h(graphicsLayer);
            this.dependenciesSet = xA;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        X<GraphicsLayer> x11 = this.oldDependenciesSet;
        if (x11 != null) {
            Intrinsics.g(x11);
            return !x11.y(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void withTracking(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = b(r0)
            g(r0, r2)
            Z.X r2 = a(r0)
            if (r2 == 0) goto L2a
            boolean r3 = r2.e()
            if (r3 == 0) goto L2a
            Z.X r3 = c(r0)
            if (r3 != 0) goto L24
            Z.X r3 = Z.k0.a()
            f(r0, r3)
        L24:
            r3.i(r2)
            r2.m()
        L2a:
            r2 = 1
            h(r0, r2)
            r19.invoke()
            r2 = 0
            h(r0, r2)
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = d(r0)
            if (r3 == 0) goto L3e
            r1.invoke(r3)
        L3e:
            Z.X r3 = c(r0)
            if (r3 == 0) goto L8f
            boolean r4 = r3.e()
            if (r4 == 0) goto L8f
            java.lang.Object[] r4 = r3.elements
            long[] r5 = r3.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L8c
            r7 = r2
        L54:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L87
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r2
        L6e:
            if (r12 >= r10) goto L85
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L81
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            r1.invoke(r13)
        L81:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L6e
        L85:
            if (r10 != r11) goto L8c
        L87:
            if (r7 == r6) goto L8c
            int r7 = r7 + 1
            goto L54
        L8c:
            r3.m()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.withTracking(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }
}
