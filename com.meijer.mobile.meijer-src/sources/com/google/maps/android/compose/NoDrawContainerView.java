package com.google.maps.android.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0014¨\u0006\u0012"}, d2 = {"Lcom/google/maps/android/compose/NoDrawContainerView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onLayout", "", "changed", "", "l", "", "t", "r", "b", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final class NoDrawContainerView extends ViewGroup implements FSDispatchDraw {
    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_ca59a2255f68bd8993cabee984deef37(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_ca59a2255f68bd8993cabee984deef37(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_ca59a2255f68bd8993cabee984deef37(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoDrawContainerView(Context context) {
        super(context);
        Intrinsics.j(context, "context");
    }
}
