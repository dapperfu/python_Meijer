package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import i.C14575a;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f87069g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    private boolean f87070d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f87071e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87072f;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, q2.y yVar) {
            super.g(view, yVar);
            yVar.n0(CheckableImageButton.this.a());
            yVar.o0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends AbstractC17751a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f87074c;

        class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }

            a() {
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f87074c = z10;
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f87074c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136509F);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87071e = true;
        this.f87072f = true;
        ViewCompat.m0(this, new a());
    }

    public boolean a() {
        return this.f87071e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f87070d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f87070d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f87069g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f87074c);
    }

    public void setCheckable(boolean z10) {
        if (this.f87071e != z10) {
            this.f87071e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f87071e || this.f87070d == z10) {
            return;
        }
        this.f87070d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.m.FLAG_MOVED);
    }

    public void setPressable(boolean z10) {
        this.f87072f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f87072f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f87070d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f87074c = this.f87070d;
        return bVar;
    }
}
