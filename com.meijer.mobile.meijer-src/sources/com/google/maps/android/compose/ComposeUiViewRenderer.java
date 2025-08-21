package com.google.maps.android.compose;

import androidx.compose.ui.platform.AbstractComposeView;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/ComposeUiViewRenderer;", "", "renderViewOnce", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "onAddedToWindow", "Lkotlin/Function0;", "startRenderingView", "Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "RenderHandle", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ComposeUiViewRenderer {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/ComposeUiViewRenderer$RenderHandle;", "Ljava/io/Closeable;", "dispose", "", "close", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RenderHandle extends Closeable {
        void dispose();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static void close(RenderHandle renderHandle) {
                RenderHandle.super.close();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        default void close() {
            dispose();
        }
    }

    void renderViewOnce(AbstractComposeView view, Function0<Unit> onAddedToWindow);

    RenderHandle startRenderingView(AbstractComposeView view);
}
