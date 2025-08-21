package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import c3.C6476a;
import d3.P;
import h4.C14462a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final CanvasSubtitleOutput f57758a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f57759b;

    /* renamed from: c, reason: collision with root package name */
    private List<C6476a> f57760c;

    /* renamed from: d, reason: collision with root package name */
    private C14462a f57761d;

    /* renamed from: e, reason: collision with root package name */
    private float f57762e;

    /* renamed from: f, reason: collision with root package name */
    private int f57763f;

    /* renamed from: g, reason: collision with root package name */
    private float f57764g;

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
        static final /* synthetic */ int[] f57766a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f57766a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57766a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57766a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57760c = Collections.EMPTY_LIST;
        this.f57761d = C14462a.f134821g;
        this.f57762e = 0.0533f;
        this.f57763f = 0;
        this.f57764g = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f57758a = canvasSubtitleOutput;
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
        this.f57759b = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = a.f57766a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(C14462a c14462a) {
        int i10 = c14462a.f134825d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : P.F("-0.05em -0.05em 0.15em %s", C6240a.b(c14462a.f134826e)) : P.F("0.06em 0.08em 0.15em %s", C6240a.b(c14462a.f134826e)) : P.F("0.1em 0.12em 0.15em %s", C6240a.b(c14462a.f134826e)) : P.F("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C6240a.b(c14462a.f134826e));
    }

    private static String h(C6476a c6476a) {
        float f10 = c6476a.f61206q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = c6476a.f61205p;
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
    public void a(List<C6476a> list, C14462a c14462a, float f10, int i10, float f11) {
        this.f57761d = c14462a;
        this.f57762e = f10;
        this.f57763f = i10;
        this.f57764g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6476a c6476a = list.get(i11);
            if (c6476a.f61193d != null) {
                arrayList.add(c6476a);
            } else {
                arrayList2.add(c6476a);
            }
        }
        if (!this.f57760c.isEmpty() || !arrayList2.isEmpty()) {
            this.f57760c = arrayList2;
            i();
        }
        this.f57758a.a(arrayList, c14462a, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f57759b.destroy();
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
        if (z10 && !this.f57760c.isEmpty()) {
            i();
        }
    }
}
