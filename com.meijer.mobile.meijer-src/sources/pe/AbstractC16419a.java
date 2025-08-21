package pe;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.view.C5756b;
import ce.C6503b;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import r2.C16823a;

/* renamed from: pe.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16419a<V extends View> {

    /* renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f156345a;

    /* renamed from: b, reason: collision with root package name */
    protected final V f156346b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f156347c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f156348d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f156349e;

    /* renamed from: f, reason: collision with root package name */
    private C5756b f156350f;

    public float a(float f10) {
        return this.f156345a.getInterpolation(f10);
    }

    protected C5756b b() {
        if (this.f156350f == null) {
            FS.log_w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C5756b c5756b = this.f156350f;
        this.f156350f = null;
        return c5756b;
    }

    public C5756b c() {
        C5756b c5756b = this.f156350f;
        this.f156350f = null;
        return c5756b;
    }

    protected void d(C5756b c5756b) {
        this.f156350f = c5756b;
    }

    protected C5756b e(C5756b c5756b) {
        if (this.f156350f == null) {
            FS.log_w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C5756b c5756b2 = this.f156350f;
        this.f156350f = c5756b;
        return c5756b2;
    }

    public AbstractC16419a(V v10) {
        this.f156346b = v10;
        Context context = v10.getContext();
        this.f156345a = i.g(context, C6503b.f61514U, C16823a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f156347c = i.f(context, C6503b.f61504K, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        this.f156348d = i.f(context, C6503b.f61508O, BinsView.TOTE_WIDTH_DP);
        this.f156349e = i.f(context, C6503b.f61507N, 100);
    }
}
