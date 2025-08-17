package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import c3.C6350a;
import d3.P;
import h4.C14351a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final CanvasSubtitleOutput f57534a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f57535b;

    /* renamed from: c, reason: collision with root package name */
    private List<C6350a> f57536c;

    /* renamed from: d, reason: collision with root package name */
    private C14351a f57537d;

    /* renamed from: e, reason: collision with root package name */
    private float f57538e;

    /* renamed from: f, reason: collision with root package name */
    private int f57539f;

    /* renamed from: g, reason: collision with root package name */
    private float f57540g;

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57542a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f57542a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57542a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57542a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57536c = Collections.EMPTY_LIST;
        this.f57537d = C14351a.f134350g;
        this.f57538e = 0.0533f;
        this.f57539f = 0;
        this.f57540g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f57534a = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.f57535b = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = a.f57542a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(C14351a c14351a) {
        int i10 = c14351a.f134354d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : P.F("-0.05em -0.05em 0.15em %s", C6098a.b(c14351a.f134355e)) : P.F("0.06em 0.08em 0.15em %s", C6098a.b(c14351a.f134355e)) : P.F("0.1em 0.12em 0.15em %s", C6098a.b(c14351a.f134355e)) : P.F("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C6098a.b(c14351a.f134355e));
    }

    private static String h(C6350a c6350a) {
        float f10 = c6350a.f61407q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = c6350a.f61406p;
        return P.F("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.i():void");
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<C6350a> list, C14351a c14351a, float f10, int i10, float f11) {
        this.f57537d = c14351a;
        this.f57538e = f10;
        this.f57539f = i10;
        this.f57540g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6350a c6350a = list.get(i11);
            if (c6350a.f61394d != null) {
                arrayList.add(c6350a);
            } else {
                arrayList2.add(c6350a);
            }
        }
        if (!this.f57536c.isEmpty() || !arrayList2.isEmpty()) {
            this.f57536c = arrayList2;
            i();
        }
        this.f57534a.a(arrayList, c14351a, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f57535b.destroy();
    }

    private String e(int i10, float f10) {
        float f11 = C.f(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (f11 == -3.4028235E38f) {
            return "unset";
        }
        return P.F("%.2fpx", Float.valueOf(f11 / getContext().getResources().getDisplayMetrics().density));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f57536c.isEmpty()) {
            i();
        }
    }
}
