package com.google.maps.android.compose;

import Md.C4110c;
import Od.C4466n;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/compose/ComposeInfoWindowAdapter;", "LMd/c$b;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lkotlin/Function1;", "LOd/n;", "Lcom/google/maps/android/compose/MarkerNode;", "markerNodeFinder", "<init>", "(Lcom/google/android/gms/maps/MapView;Lkotlin/jvm/functions/Function1;)V", "marker", "Landroid/view/View;", "getInfoContents", "(LOd/n;)Landroid/view/View;", "getInfoWindow", "Lcom/google/android/gms/maps/MapView;", "Lkotlin/jvm/functions/Function1;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposeInfoWindowAdapter implements C4110c.b {
    public static final int $stable = 8;
    private final MapView mapView;
    private final Function1<C4466n, MarkerNode> markerNodeFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeInfoWindowAdapter(MapView mapView, Function1<? super C4466n, MarkerNode> markerNodeFinder) {
        Intrinsics.j(mapView, "mapView");
        Intrinsics.j(markerNodeFinder, "markerNodeFinder");
        this.mapView = mapView;
        this.markerNodeFinder = markerNodeFinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInfoContents$lambda$1$lambda$0(Function3 function3, C4466n c4466n, Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1508359207, i10, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoContents.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:49)");
            }
            function3.invoke(c4466n, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInfoWindow$lambda$3$lambda$2(Function3 function3, C4466n c4466n, Composer composer, int i10) {
        if ((i10 & 3) == 2 && composer.j()) {
            composer.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-742372995, i10, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoWindow.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:62)");
            }
            function3.invoke(c4466n, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        return Unit.f143329a;
    }

    @Override // Md.C4110c.b
    public View getInfoContents(final C4466n marker) {
        final Function3<C4466n, Composer, Integer, Unit> infoContent;
        Intrinsics.j(marker, "marker");
        MarkerNode markerNodeInvoke = this.markerNodeFinder.invoke(marker);
        if (markerNodeInvoke == null || (infoContent = markerNodeInvoke.getInfoContent()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        Intrinsics.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1508359207, true, new Function2() { // from class: com.google.maps.android.compose.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComposeInfoWindowAdapter.getInfoContents$lambda$1$lambda$0(infoContent, marker, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        MapComposeViewRenderKt.renderComposeViewOnce$default(this.mapView, composeView, null, markerNodeInvoke.getCompositionContext(), 2, null);
        return composeView;
    }

    @Override // Md.C4110c.b
    public View getInfoWindow(final C4466n marker) {
        final Function3<C4466n, Composer, Integer, Unit> infoWindow;
        Intrinsics.j(marker, "marker");
        MarkerNode markerNodeInvoke = this.markerNodeFinder.invoke(marker);
        if (markerNodeInvoke == null || (infoWindow = markerNodeInvoke.getInfoWindow()) == null) {
            return null;
        }
        Context context = this.mapView.getContext();
        Intrinsics.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-742372995, true, new Function2() { // from class: com.google.maps.android.compose.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComposeInfoWindowAdapter.getInfoWindow$lambda$3$lambda$2(infoWindow, marker, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        MapComposeViewRenderKt.renderComposeViewOnce$default(this.mapView, composeView, null, markerNodeInvoke.getCompositionContext(), 2, null);
        return composeView;
    }
}
