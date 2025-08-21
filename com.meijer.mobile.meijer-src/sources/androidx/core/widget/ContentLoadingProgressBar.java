package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    long f54232a;

    /* renamed from: b, reason: collision with root package name */
    boolean f54233b;

    /* renamed from: c, reason: collision with root package name */
    boolean f54234c;

    /* renamed from: d, reason: collision with root package name */
    boolean f54235d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f54236e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f54237f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f54232a = -1L;
        this.f54233b = false;
        this.f54234c = false;
        this.f54235d = false;
        this.f54236e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.b(this.f54303a);
            }
        };
        this.f54237f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.a(this.f54304a);
            }
        };
    }

    public static /* synthetic */ void a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f54234c = false;
        if (contentLoadingProgressBar.f54235d) {
            return;
        }
        contentLoadingProgressBar.f54232a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f54233b = false;
        contentLoadingProgressBar.f54232a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    private void c() {
        removeCallbacks(this.f54236e);
        removeCallbacks(this.f54237f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }
}
