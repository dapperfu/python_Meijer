package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import i.C14578a;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final C5779m f46737a;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136273M);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f46737a.g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        H.a(this, getContext());
        C5779m c5779m = new C5779m(this);
        this.f46737a = c5779m;
        c5779m.c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f46737a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f46737a.i();
    }
}
