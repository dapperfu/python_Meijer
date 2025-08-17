package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    long f54008a;

    /* renamed from: b, reason: collision with root package name */
    boolean f54009b;

    /* renamed from: c, reason: collision with root package name */
    boolean f54010c;

    /* renamed from: d, reason: collision with root package name */
    boolean f54011d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f54012e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f54013f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f54008a = -1L;
        this.f54009b = false;
        this.f54010c = false;
        this.f54011d = false;
        this.f54012e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.b(this.f54079a);
            }
        };
        this.f54013f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.a(this.f54080a);
            }
        };
    }

    public static /* synthetic */ void a(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f54010c = false;
        if (contentLoadingProgressBar.f54011d) {
            return;
        }
        contentLoadingProgressBar.f54008a = System.currentTimeMillis();
        contentLoadingProgressBar.setVisibility(0);
    }

    public static /* synthetic */ void b(ContentLoadingProgressBar contentLoadingProgressBar) {
        contentLoadingProgressBar.f54009b = false;
        contentLoadingProgressBar.f54008a = -1L;
        contentLoadingProgressBar.setVisibility(8);
    }

    private void c() {
        removeCallbacks(this.f54012e);
        removeCallbacks(this.f54013f);
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
