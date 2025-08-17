package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import i.C14584j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View implements FSDraw, FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    private int f46933a;

    /* renamed from: b, reason: collision with root package name */
    private int f46934b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<View> f46935c;

    /* renamed from: d, reason: collision with root package name */
    private LayoutInflater f46936d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_a3ef97675b3c5200e26589d5f044ced0(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_a3ef97675b3c5200e26589d5f044ced0(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_a3ef97675b3c5200e26589d5f044ced0(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setOnInflateListener(a aVar) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46933a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14584j.f136715F3, i10, 0);
        this.f46934b = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136730I3, -1);
        this.f46933a = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136725H3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(C14584j.f136720G3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f46934b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f46936d;
    }

    public int getLayoutResource() {
        return this.f46933a;
    }

    public void setInflatedId(int i10) {
        this.f46934b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f46936d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f46933a = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f46935c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f46933a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflaterFrom = this.f46936d;
                if (layoutInflaterFrom == null) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(this.f46933a, viewGroup, false);
                int i10 = this.f46934b;
                if (i10 != -1) {
                    viewInflate.setId(i10);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.f46935c = new WeakReference<>(viewInflate);
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }
}
