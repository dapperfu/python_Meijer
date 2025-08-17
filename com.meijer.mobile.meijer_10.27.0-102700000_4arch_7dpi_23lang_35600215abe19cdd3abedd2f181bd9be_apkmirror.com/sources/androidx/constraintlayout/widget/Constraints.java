package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    c f53108a;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public c getConstraintSet() {
        if (this.f53108a == null) {
            this.f53108a = new c();
        }
        this.f53108a.h(this);
        return this.f53108a;
    }

    public static class a extends ConstraintLayout.b {

        /* renamed from: A0, reason: collision with root package name */
        public float f53109A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f53110B0;

        /* renamed from: p0, reason: collision with root package name */
        public float f53111p0;

        /* renamed from: q0, reason: collision with root package name */
        public boolean f53112q0;

        /* renamed from: r0, reason: collision with root package name */
        public float f53113r0;

        /* renamed from: s0, reason: collision with root package name */
        public float f53114s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f53115t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f53116u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f53117v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f53118w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f53119x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f53120y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f53121z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f53111p0 = 1.0f;
            this.f53112q0 = false;
            this.f53113r0 = 0.0f;
            this.f53114s0 = 0.0f;
            this.f53115t0 = 0.0f;
            this.f53116u0 = 0.0f;
            this.f53117v0 = 1.0f;
            this.f53118w0 = 1.0f;
            this.f53119x0 = 0.0f;
            this.f53120y0 = 0.0f;
            this.f53121z0 = 0.0f;
            this.f53109A0 = 0.0f;
            this.f53110B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53111p0 = 1.0f;
            this.f53112q0 = false;
            this.f53113r0 = 0.0f;
            this.f53114s0 = 0.0f;
            this.f53115t0 = 0.0f;
            this.f53116u0 = 0.0f;
            this.f53117v0 = 1.0f;
            this.f53118w0 = 1.0f;
            this.f53119x0 = 0.0f;
            this.f53120y0 = 0.0f;
            this.f53121z0 = 0.0f;
            this.f53109A0 = 0.0f;
            this.f53110B0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53348N2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53354O2) {
                    this.f53111p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53111p0);
                } else if (index == f.f53420Z2) {
                    this.f53113r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53113r0);
                    this.f53112q0 = true;
                } else if (index == f.f53402W2) {
                    this.f53115t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53115t0);
                } else if (index == f.f53408X2) {
                    this.f53116u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53116u0);
                } else if (index == f.f53396V2) {
                    this.f53114s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53114s0);
                } else if (index == f.f53384T2) {
                    this.f53117v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53117v0);
                } else if (index == f.f53390U2) {
                    this.f53118w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53118w0);
                } else if (index == f.f53360P2) {
                    this.f53119x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53119x0);
                } else if (index == f.f53366Q2) {
                    this.f53120y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53120y0);
                } else if (index == f.f53372R2) {
                    this.f53121z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53121z0);
                } else if (index == f.f53378S2) {
                    this.f53109A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53109A0);
                } else if (index == f.f53414Y2) {
                    this.f53110B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53110B0);
                }
            }
        }
    }
}
