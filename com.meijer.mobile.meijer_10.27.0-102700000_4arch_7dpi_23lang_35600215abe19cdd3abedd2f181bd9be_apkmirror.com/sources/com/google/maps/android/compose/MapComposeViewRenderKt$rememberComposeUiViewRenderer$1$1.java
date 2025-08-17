package com.google.maps.android.compose;

import android.view.View;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.ComposeUiViewRenderer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/google/maps/android/compose/MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "renderViewOnce", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "onAddedToWindow", "Lkotlin/Function0;", "startRenderingView", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 implements ComposeUiViewRenderer {
    final /* synthetic */ AbstractC5727k $compositionContext;
    final /* synthetic */ MapView $mapView;

    MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(MapView mapView, AbstractC5727k abstractC5727k) {
        this.$mapView = mapView;
        this.$compositionContext = abstractC5727k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderViewOnce$lambda$1$lambda$0(Function0 function0, View it) {
        Intrinsics.j(it, "it");
        function0.invoke();
        return Unit.f142422a;
    }

    @Override // com.google.maps.android.compose.ComposeUiViewRenderer
    public void renderViewOnce(AbstractComposeView view, final Function0<Unit> onAddedToWindow) {
        Intrinsics.j(view, "view");
        MapComposeViewRenderKt.renderComposeViewOnce(this.$mapView, view, onAddedToWindow != null ? new Function1() { // from class: com.google.maps.android.compose.A0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1.renderViewOnce$lambda$1$lambda$0(onAddedToWindow, (View) obj);
            }
        } : null, this.$compositionContext);
    }

    @Override // com.google.maps.android.compose.ComposeUiViewRenderer
    public ComposeUiViewRenderer.RenderHandle startRenderingView(AbstractComposeView view) {
        Intrinsics.j(view, "view");
        return MapComposeViewRenderKt.startRenderingComposeView(this.$mapView, view, this.$compositionContext);
    }
}
