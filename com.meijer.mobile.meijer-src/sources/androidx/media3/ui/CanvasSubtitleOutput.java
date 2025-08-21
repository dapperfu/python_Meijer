package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import c3.C6476a;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import h4.C14462a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a, FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    private final List<z> f57550a;

    /* renamed from: b, reason: collision with root package name */
    private List<C6476a> f57551b;

    /* renamed from: c, reason: collision with root package name */
    private int f57552c;

    /* renamed from: d, reason: collision with root package name */
    private float f57553d;

    /* renamed from: e, reason: collision with root package name */
    private C14462a f57554e;

    /* renamed from: f, reason: collision with root package name */
    private float f57555f;

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
        this.f57550a = new ArrayList();
        this.f57551b = Collections.EMPTY_LIST;
        this.f57552c = 0;
        this.f57553d = 0.0533f;
        this.f57554e = C14462a.f134821g;
        this.f57555f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<C6476a> list, C14462a c14462a, float f10, int i10, float f11) {
        this.f57551b = list;
        this.f57554e = c14462a;
        this.f57553d = f10;
        this.f57552c = i10;
        this.f57555f = f11;
        while (this.f57550a.size() < list.size()) {
            this.f57550a.add(new z(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C6476a> list = this.f57551b;
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
        float f10 = C.f(this.f57552c, this.f57553d, height, i10);
        if (f10 <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C6476a c6476aB = list.get(i11);
            if (c6476aB.f61205p != Integer.MIN_VALUE) {
                c6476aB = b(c6476aB);
            }
            this.f57550a.get(i11).b(c6476aB, this.f57554e, f10, C.f(c6476aB.f61203n, c6476aB.f61204o, height, i10), this.f57555f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    private static C6476a b(C6476a c6476a) {
        C6476a.b bVarP = c6476a.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p(null);
        if (c6476a.f61195f == 0) {
            bVarP.h(1.0f - c6476a.f61194e, 0);
        } else {
            bVarP.h((-c6476a.f61194e) - 1.0f, 1);
        }
        int i10 = c6476a.f61196g;
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
