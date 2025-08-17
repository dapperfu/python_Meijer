package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import c3.C6350a;
import h4.C14351a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private List<C6350a> f57508a;

    /* renamed from: b, reason: collision with root package name */
    private C14351a f57509b;

    /* renamed from: c, reason: collision with root package name */
    private int f57510c;

    /* renamed from: d, reason: collision with root package name */
    private float f57511d;

    /* renamed from: e, reason: collision with root package name */
    private float f57512e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f57513f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f57514g;

    /* renamed from: h, reason: collision with root package name */
    private int f57515h;

    /* renamed from: i, reason: collision with root package name */
    private a f57516i;

    /* renamed from: j, reason: collision with root package name */
    private View f57517j;

    interface a {
        void a(List<C6350a> list, C14351a c14351a, float f10, int i10, float f11);
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    private void c(int i10, float f10) {
        this.f57510c = i10;
        this.f57511d = f10;
        f();
    }

    private void f() {
        this.f57516i.a(getCuesWithStylingPreferencesApplied(), this.f57509b, this.f57511d, this.f57510c, this.f57512e);
    }

    private List<C6350a> getCuesWithStylingPreferencesApplied() {
        if (this.f57513f && this.f57514g) {
            return this.f57508a;
        }
        ArrayList arrayList = new ArrayList(this.f57508a.size());
        for (int i10 = 0; i10 < this.f57508a.size(); i10++) {
            arrayList.add(a(this.f57508a.get(i10)));
        }
        return arrayList;
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f57517j);
        View view = this.f57517j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).g();
        }
        this.f57517j = t10;
        this.f57516i = t10;
        addView(t10);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f57514g = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f57513f = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f57512e = f10;
        f();
    }

    public void setCues(List<C6350a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f57508a = list;
        f();
    }

    public void setStyle(C14351a c14351a) {
        this.f57509b = c14351a;
        f();
    }

    public void setViewType(int i10) {
        if (this.f57515h == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f57515h = i10;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57508a = Collections.EMPTY_LIST;
        this.f57509b = C14351a.f134350g;
        this.f57510c = 0;
        this.f57511d = 0.0533f;
        this.f57512e = 0.08f;
        this.f57513f = true;
        this.f57514g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f57516i = canvasSubtitleOutput;
        this.f57517j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f57515h = 1;
    }

    private C6350a a(C6350a c6350a) {
        C6350a.b bVarA = c6350a.a();
        if (!this.f57513f) {
            C.c(bVarA);
        } else if (!this.f57514g) {
            C.d(bVarA);
        }
        return bVarA.a();
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C14351a getUserCaptionStyle() {
        if (isInEditMode()) {
            return C14351a.f134350g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return C14351a.a(captioningManager.getUserStyle());
        }
        return C14351a.f134350g;
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }
}
