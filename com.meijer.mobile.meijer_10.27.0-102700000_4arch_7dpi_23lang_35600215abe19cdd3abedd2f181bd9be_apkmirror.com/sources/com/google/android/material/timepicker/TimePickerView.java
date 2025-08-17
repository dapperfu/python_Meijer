package com.google.android.material.timepicker;

import ae.f;
import ae.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes4.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    private final ClockFaceView f87962A;

    /* renamed from: B, reason: collision with root package name */
    private final MaterialButtonToggleGroup f87963B;

    /* renamed from: C, reason: collision with root package name */
    private final View.OnClickListener f87964C;

    /* renamed from: x, reason: collision with root package name */
    private final Chip f87965x;

    /* renamed from: y, reason: collision with root package name */
    private final Chip f87966y;

    /* renamed from: z, reason: collision with root package name */
    private final ClockHandView f87967z;

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
        final /* synthetic */ GestureDetector f87970a;

        c(GestureDetector gestureDetector) {
            this.f87970a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f87970a.onTouchEvent(motionEvent);
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
        this.f87964C = new a();
        LayoutInflater.from(context).inflate(h.f44733s, this);
        this.f87962A = (ClockFaceView) findViewById(f.f44694m);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(f.f44697p);
        this.f87963B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f87982a.getClass();
            }
        });
        this.f87965x = (Chip) findViewById(f.f44700s);
        this.f87966y = (Chip) findViewById(f.f44698q);
        this.f87967z = (ClockHandView) findViewById(f.f44695n);
        F();
        E();
    }

    private void E() {
        this.f87965x.setTag(f.f44668N, 12);
        this.f87966y.setTag(f.f44668N, 10);
        this.f87965x.setOnClickListener(this.f87964C);
        this.f87966y.setOnClickListener(this.f87964C);
        this.f87965x.setAccessibilityClassName("android.view.View");
        this.f87966y.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void F() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f87965x.setOnTouchListener(cVar);
        this.f87966y.setOnTouchListener(cVar);
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
            this.f87966y.sendAccessibilityEvent(8);
        }
    }
}
