package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.ComposeUiViewRenderer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "", "onAddedToWindow", "Landroidx/compose/runtime/k;", "parentContext", "renderComposeViewOnce", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/k;)V", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "startRenderingComposeView", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/k;)Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Lcom/google/maps/android/compose/NoDrawContainerView;", "ensureContainerView", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/NoDrawContainerView;", "Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "rememberComposeUiViewRenderer", "(Landroidx/compose/runtime/Composer;I)Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MapComposeViewRenderKt {
    private static final NoDrawContainerView ensureContainerView(MapView mapView) {
        NoDrawContainerView noDrawContainerView = (NoDrawContainerView) mapView.findViewById(R.id.maps_compose_nodraw_container_view);
        if (noDrawContainerView != null) {
            return noDrawContainerView;
        }
        Context context = mapView.getContext();
        Intrinsics.i(context, "getContext(...)");
        NoDrawContainerView noDrawContainerView2 = new NoDrawContainerView(context);
        noDrawContainerView2.setId(R.id.maps_compose_nodraw_container_view);
        mapView.addView(noDrawContainerView2);
        return noDrawContainerView2;
    }

    public static final void renderComposeViewOnce(MapView mapView, AbstractComposeView view, Function1<? super View, Unit> function1, AbstractC5869k parentContext) {
        Intrinsics.j(mapView, "<this>");
        Intrinsics.j(view, "view");
        Intrinsics.j(parentContext, "parentContext");
        ComposeUiViewRenderer.RenderHandle renderHandleStartRenderingComposeView = startRenderingComposeView(mapView, view, parentContext);
        if (function1 != null) {
            try {
                function1.invoke(view);
                Unit unit = Unit.f143329a;
            } finally {
            }
        }
        CloseableKt.a(renderHandleStartRenderingComposeView, null);
    }

    public static /* synthetic */ void renderComposeViewOnce$default(MapView mapView, AbstractComposeView abstractComposeView, Function1 function1, AbstractC5869k abstractC5869k, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        renderComposeViewOnce(mapView, abstractComposeView, function1, abstractC5869k);
    }

    public static final ComposeUiViewRenderer.RenderHandle startRenderingComposeView(MapView mapView, final AbstractComposeView view, AbstractC5869k parentContext) {
        Intrinsics.j(mapView, "<this>");
        Intrinsics.j(view, "view");
        Intrinsics.j(parentContext, "parentContext");
        final NoDrawContainerView noDrawContainerViewEnsureContainerView = ensureContainerView(mapView);
        noDrawContainerViewEnsureContainerView.addView(view);
        view.setParentCompositionContext(parentContext);
        return new ComposeUiViewRenderer.RenderHandle() { // from class: com.google.maps.android.compose.MapComposeViewRenderKt.startRenderingComposeView.2
            @Override // com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle
            public void dispose() {
                noDrawContainerViewEnsureContainerView.removeView(view);
            }

            @Override // com.google.maps.android.compose.ComposeUiViewRenderer.RenderHandle, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
            }
        };
    }

    public static final ComposeUiViewRenderer rememberComposeUiViewRenderer(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(124209494, i10, -1, "com.google.maps.android.compose.rememberComposeUiViewRenderer (MapComposeViewRender.kt:70)");
        }
        Applier<?> applierK = composer.k();
        Intrinsics.h(applierK, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
        MapView mapView = ((MapApplier) applierK).getMapView();
        AbstractC5869k abstractC5869kD = C5859f.d(composer, 0);
        boolean zV = composer.V(abstractC5869kD);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            objB = new MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1(mapView, abstractC5869kD);
            composer.t(objB);
        }
        MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1 = (MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return mapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1;
    }
}
