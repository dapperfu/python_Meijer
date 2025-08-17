package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes7.dex */
public class MDGifView extends View {
    private static final long DEFAULT_MOVIE_VIEW_DURATION = 1000;
    private int currentAnimationTime;
    boolean isPaused;
    private boolean isVisible;
    private Movie movie;
    private float movieLeft;
    private int movieMeasuredMovieHeight;
    private int movieMeasuredMovieWidth;
    private float movieScale;
    private long movieStart;
    private float movieTop;

    public MDGifView(Context context) {
        super(context);
        this.movie = null;
        this.movieStart = 0L;
        this.currentAnimationTime = 0;
        this.movieLeft = 0.0f;
        this.movieTop = 0.0f;
        this.movieScale = 0.0f;
        this.movieMeasuredMovieWidth = 0;
        this.movieMeasuredMovieHeight = 0;
        this.isPaused = false;
        this.isVisible = true;
    }

    private void drawMovieFrame(Canvas canvas) {
        this.movie.setTime(this.currentAnimationTime);
        canvas.save();
        float f10 = this.movieScale;
        canvas.scale(f10, f10);
        Movie movie = this.movie;
        float f11 = this.movieLeft;
        float f12 = this.movieScale;
        movie.draw(canvas, f11 / f12, this.movieTop / f12);
        canvas.restore();
    }

    private void invalidateView() {
        if (this.isVisible) {
            postInvalidateOnAnimation();
        }
    }

    private void setViewAttributes(Context context, AttributeSet attributeSet, int i10) {
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MDGifView, i10, R.style.Widget_MDGifView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MDGifView_gif, -1);
        this.isPaused = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MDGifView_paused, false);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != -1) {
            this.movie = Movie.decodeStream(getResources().openRawResource(resourceId));
        }
    }

    private void updateAnimationTime() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.movieStart == 0) {
            this.movieStart = jUptimeMillis;
        }
        long jDuration = this.movie.duration();
        if (jDuration == 0) {
            jDuration = 1000;
        }
        this.currentAnimationTime = (int) ((jUptimeMillis - this.movieStart) % jDuration);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.movie != null) {
            if (this.isPaused) {
                drawMovieFrame(canvas);
                return;
            }
            updateAnimationTime();
            drawMovieFrame(canvas);
            invalidateView();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.movieLeft = (getWidth() - this.movieMeasuredMovieWidth) / 2.0f;
        this.movieTop = (getHeight() - this.movieMeasuredMovieHeight) / 2.0f;
        this.isVisible = getVisibility() == 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth;
        int suggestedMinimumHeight;
        int size;
        int size2;
        Movie movie = this.movie;
        if (movie != null) {
            int iWidth = movie.width();
            int iHeight = this.movie.height();
            float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (((float) View.MeasureSpec.getMode(i11)) == 0.0f || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
            this.movieScale = fMax;
            suggestedMinimumWidth = (int) (iWidth * fMax);
            this.movieMeasuredMovieWidth = suggestedMinimumWidth;
            suggestedMinimumHeight = (int) (iHeight * fMax);
            this.movieMeasuredMovieHeight = suggestedMinimumHeight;
        } else {
            suggestedMinimumWidth = getSuggestedMinimumWidth();
            suggestedMinimumHeight = getSuggestedMinimumHeight();
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        this.isVisible = i10 == 1;
        invalidateView();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.isVisible = i10 == 0;
        invalidateView();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.isVisible = i10 == 0;
        invalidateView();
    }

    void play() {
        if (this.isPaused) {
            this.isPaused = false;
            this.movieStart = SystemClock.uptimeMillis() - this.currentAnimationTime;
            invalidate();
        }
    }

    public void setGifImageUri(Uri uri) {
        try {
            this.movie = Movie.decodeStream(getContext().getContentResolver().openInputStream(uri));
            requestLayout();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public MDGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.movie = null;
        this.movieStart = 0L;
        this.currentAnimationTime = 0;
        this.movieLeft = 0.0f;
        this.movieTop = 0.0f;
        this.movieScale = 0.0f;
        this.movieMeasuredMovieWidth = 0;
        this.movieMeasuredMovieHeight = 0;
        this.isPaused = false;
        this.isVisible = true;
        setViewAttributes(context, attributeSet, -1);
    }

    public MDGifView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.movie = null;
        this.movieStart = 0L;
        this.currentAnimationTime = 0;
        this.movieLeft = 0.0f;
        this.movieTop = 0.0f;
        this.movieScale = 0.0f;
        this.movieMeasuredMovieWidth = 0;
        this.movieMeasuredMovieHeight = 0;
        this.isPaused = false;
        this.isVisible = true;
        setViewAttributes(context, attributeSet, i10);
    }
}
