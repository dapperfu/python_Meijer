package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import c3.C6350a;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import h4.C14351a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a, FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    private final List<z> f57326a;

    /* renamed from: b, reason: collision with root package name */
    private List<C6350a> f57327b;

    /* renamed from: c, reason: collision with root package name */
    private int f57328c;

    /* renamed from: d, reason: collision with root package name */
    private float f57329d;

    /* renamed from: e, reason: collision with root package name */
    private C14351a f57330e;

    /* renamed from: f, reason: collision with root package name */
    private float f57331f;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_5a2af70fb639d26e52eb8087984e640a(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_5a2af70fb639d26e52eb8087984e640a(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_5a2af70fb639d26e52eb8087984e640a(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57326a = new ArrayList();
        this.f57327b = Collections.EMPTY_LIST;
        this.f57328c = 0;
        this.f57329d = 0.0533f;
        this.f57330e = C14351a.f134350g;
        this.f57331f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<C6350a> list, C14351a c14351a, float f10, int i10, float f11) {
        this.f57327b = list;
        this.f57330e = c14351a;
        this.f57329d = f10;
        this.f57328c = i10;
        this.f57331f = f11;
        while (this.f57326a.size() < list.size()) {
            this.f57326a.add(new z(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C6350a> list = this.f57327b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float f10 = C.f(this.f57328c, this.f57329d, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C6350a c6350aB = list.get(i11);
            if (c6350aB.f61406p != Integer.MIN_VALUE) {
                c6350aB = b(c6350aB);
            }
            this.f57326a.get(i11).b(c6350aB, this.f57330e, f10, C.f(c6350aB.f61404n, c6350aB.f61405o, height, i10), this.f57331f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    private static C6350a b(C6350a c6350a) {
        C6350a.b bVarP = c6350a.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (c6350a.f61396f == 0) {
            bVarP.h(1.0f - c6350a.f61395e, 0);
        } else {
            bVarP.h((-c6350a.f61395e) - 1.0f, 1);
        }
        int i10 = c6350a.f61397g;
        if (i10 != 0) {
            if (i10 == 2) {
                bVarP.i(0);
            }
        } else {
            bVarP.i(2);
        }
        return bVarP.a();
    }
}
