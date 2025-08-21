package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    c f53332a;

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
        if (this.f53332a == null) {
            this.f53332a = new c();
        }
        this.f53332a.h(this);
        return this.f53332a;
    }

    public static class a extends ConstraintLayout.b {

        /* renamed from: A0, reason: collision with root package name */
        public float f53333A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f53334B0;

        /* renamed from: p0, reason: collision with root package name */
        public float f53335p0;

        /* renamed from: q0, reason: collision with root package name */
        public boolean f53336q0;

        /* renamed from: r0, reason: collision with root package name */
        public float f53337r0;

        /* renamed from: s0, reason: collision with root package name */
        public float f53338s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f53339t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f53340u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f53341v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f53342w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f53343x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f53344y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f53345z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f53335p0 = 1.0f;
            this.f53336q0 = false;
            this.f53337r0 = 0.0f;
            this.f53338s0 = 0.0f;
            this.f53339t0 = 0.0f;
            this.f53340u0 = 0.0f;
            this.f53341v0 = 1.0f;
            this.f53342w0 = 1.0f;
            this.f53343x0 = 0.0f;
            this.f53344y0 = 0.0f;
            this.f53345z0 = 0.0f;
            this.f53333A0 = 0.0f;
            this.f53334B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53335p0 = 1.0f;
            this.f53336q0 = false;
            this.f53337r0 = 0.0f;
            this.f53338s0 = 0.0f;
            this.f53339t0 = 0.0f;
            this.f53340u0 = 0.0f;
            this.f53341v0 = 1.0f;
            this.f53342w0 = 1.0f;
            this.f53343x0 = 0.0f;
            this.f53344y0 = 0.0f;
            this.f53345z0 = 0.0f;
            this.f53333A0 = 0.0f;
            this.f53334B0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53572N2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53578O2) {
                    this.f53335p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53335p0);
                } else if (index == f.f53644Z2) {
                    this.f53337r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53337r0);
                    this.f53336q0 = true;
                } else if (index == f.f53626W2) {
                    this.f53339t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53339t0);
                } else if (index == f.f53632X2) {
                    this.f53340u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53340u0);
                } else if (index == f.f53620V2) {
                    this.f53338s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53338s0);
                } else if (index == f.f53608T2) {
                    this.f53341v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53341v0);
                } else if (index == f.f53614U2) {
                    this.f53342w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53342w0);
                } else if (index == f.f53584P2) {
                    this.f53343x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53343x0);
                } else if (index == f.f53590Q2) {
                    this.f53344y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53344y0);
                } else if (index == f.f53596R2) {
                    this.f53345z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53345z0);
                } else if (index == f.f53602S2) {
                    this.f53333A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53333A0);
                } else if (index == f.f53638Y2) {
                    this.f53334B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f53334B0);
                }
            }
        }
    }
}
