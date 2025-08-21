package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import ce.f;
import ce.h;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes4.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    private final ClockFaceView f88802A;

    /* renamed from: B, reason: collision with root package name */
    private final MaterialButtonToggleGroup f88803B;

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f88804C;

    /* renamed from: x, reason: collision with root package name */
    private final Chip f88805x;

    /* renamed from: y, reason: collision with root package name */
    private final Chip f88806y;

    /* renamed from: z, reason: collision with root package name */
    private final ClockHandView f88807z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.C(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.D(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f88810a;

        c(GestureDetector gestureDetector) {
            this.f88810a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f88810a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f88804C = new a();
        LayoutInflater.from(context).inflate(h.f61748s, this);
        this.f88802A = (ClockFaceView) findViewById(f.f61709m);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(f.f61712p);
        this.f88803B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f88822a.getClass();
            }
        });
        this.f88805x = (Chip) findViewById(f.f61715s);
        this.f88806y = (Chip) findViewById(f.f61713q);
        this.f88807z = (ClockHandView) findViewById(f.f61710n);
        F();
        E();
    }

    private void E() {
        this.f88805x.setTag(f.f61683N, 12);
        this.f88806y.setTag(f.f61683N, 10);
        this.f88805x.setOnClickListener(this.f88804C);
        this.f88806y.setOnClickListener(this.f88804C);
        this.f88805x.setAccessibilityClassName("android.view.View");
        this.f88806y.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void F() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f88805x.setOnTouchListener(cVar);
        this.f88806y.setOnTouchListener(cVar);
    }

    static /* synthetic */ e C(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d D(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f88806y.sendAccessibilityEvent(8);
        }
    }
}
