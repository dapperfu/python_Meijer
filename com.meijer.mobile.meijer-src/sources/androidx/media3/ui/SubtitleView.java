package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import c3.C6476a;
import h4.C14462a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private List<C6476a> f57732a;

    /* renamed from: b, reason: collision with root package name */
    private C14462a f57733b;

    /* renamed from: c, reason: collision with root package name */
    private int f57734c;

    /* renamed from: d, reason: collision with root package name */
    private float f57735d;

    /* renamed from: e, reason: collision with root package name */
    private float f57736e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f57737f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f57738g;

    /* renamed from: h, reason: collision with root package name */
    private int f57739h;

    /* renamed from: i, reason: collision with root package name */
    private a f57740i;

    /* renamed from: j, reason: collision with root package name */
    private View f57741j;

    interface a {
        void a(List<C6476a> list, C14462a c14462a, float f10, int i10, float f11);
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    private void c(int i10, float f10) {
        this.f57734c = i10;
        this.f57735d = f10;
        f();
    }

    private void f() {
        this.f57740i.a(getCuesWithStylingPreferencesApplied(), this.f57733b, this.f57735d, this.f57734c, this.f57736e);
    }

    private List<C6476a> getCuesWithStylingPreferencesApplied() {
        if (this.f57737f && this.f57738g) {
            return this.f57732a;
        }
        ArrayList arrayList = new ArrayList(this.f57732a.size());
        for (int i10 = 0; i10 < this.f57732a.size(); i10++) {
            arrayList.add(a(this.f57732a.get(i10)));
        }
        return arrayList;
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f57741j);
        View view = this.f57741j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).g();
        }
        this.f57741j = t10;
        this.f57740i = t10;
        addView(t10);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f57738g = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f57737f = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f57736e = f10;
        f();
    }

    public void setCues(List<C6476a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f57732a = list;
        f();
    }

    public void setStyle(C14462a c14462a) {
        this.f57733b = c14462a;
        f();
    }

    public void setViewType(int i10) {
        if (this.f57739h == i10) {
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
        this.f57739h = i10;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57732a = Collections.EMPTY_LIST;
        this.f57733b = C14462a.f134821g;
        this.f57734c = 0;
        this.f57735d = 0.0533f;
        this.f57736e = 0.08f;
        this.f57737f = true;
        this.f57738g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f57740i = canvasSubtitleOutput;
        this.f57741j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f57739h = 1;
    }

    private C6476a a(C6476a c6476a) {
        C6476a.b bVarA = c6476a.a();
        if (!this.f57737f) {
            C.c(bVarA);
        } else if (!this.f57738g) {
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

    private C14462a getUserCaptionStyle() {
        if (isInEditMode()) {
            return C14462a.f134821g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return C14462a.a(captioningManager.getUserStyle());
        }
        return C14462a.f134821g;
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
