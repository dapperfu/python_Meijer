package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f46600a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f46601b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f46602c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f46603d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f46604e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f46605f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f46606g;

    /* renamed from: h, reason: collision with root package name */
    private a f46607h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f46606g.set(i10, i11, i12, i13);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f46604e == null) {
            this.f46604e = new TypedValue();
        }
        return this.f46604e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f46605f == null) {
            this.f46605f = new TypedValue();
        }
        return this.f46605f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f46602c == null) {
            this.f46602c = new TypedValue();
        }
        return this.f46602c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f46603d == null) {
            this.f46603d = new TypedValue();
        }
        return this.f46603d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f46600a == null) {
            this.f46600a = new TypedValue();
        }
        return this.f46600a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f46601b == null) {
            this.f46601b = new TypedValue();
        }
        return this.f46601b;
    }

    public void setAttachListener(a aVar) {
        this.f46607h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46606g = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f46607h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f46607h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }
}
