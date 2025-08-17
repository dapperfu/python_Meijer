package ne;

import ae.C5597b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.view.C5614b;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import r2.C16709a;

/* renamed from: ne.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC15791a<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f151214a;

    /* renamed from: b, reason: collision with root package name */
    protected final V f151215b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f151216c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f151217d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f151218e;

    /* renamed from: f, reason: collision with root package name */
    private C5614b f151219f;

    public float a(float f10) {
        return this.f151214a.getInterpolation(f10);
    }

    protected C5614b b() {
        if (this.f151219f == null) {
            FS.log_w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C5614b c5614b = this.f151219f;
        this.f151219f = null;
        return c5614b;
    }

    public C5614b c() {
        C5614b c5614b = this.f151219f;
        this.f151219f = null;
        return c5614b;
    }

    protected void d(C5614b c5614b) {
        this.f151219f = c5614b;
    }

    protected C5614b e(C5614b c5614b) {
        if (this.f151219f == null) {
            FS.log_w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C5614b c5614b2 = this.f151219f;
        this.f151219f = c5614b;
        return c5614b2;
    }

    public AbstractC15791a(V v10) {
        this.f151215b = v10;
        Context context = v10.getContext();
        this.f151214a = i.g(context, C5597b.f44499U, C16709a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f151216c = i.f(context, C5597b.f44489K, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        this.f151217d = i.f(context, C5597b.f44493O, BinsView.TOTE_WIDTH_DP);
        this.f151218e = i.f(context, C5597b.f44492N, 100);
    }
}
