package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes4.dex */
class h extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final int f87742d;

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f87743a;

    /* renamed from: b, reason: collision with root package name */
    private final int f87744b;

    /* renamed from: c, reason: collision with root package name */
    private final int f87745c;

    public h() {
        Calendar calendarI = q.i();
        this.f87743a = calendarI;
        this.f87744b = calendarI.getMaximum(7);
        this.f87745c = calendarI.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ce.h.f61751v, viewGroup, false);
        }
        this.f87743a.set(7, b(i10));
        textView.setText(this.f87743a.getDisplayName(7, f87742d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ce.j.f61781t), this.f87743a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    static {
        f87742d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    private int b(int i10) {
        int i11 = i10 + this.f87745c;
        int i12 = this.f87744b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f87744b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f87744b;
    }

    public h(int i10) {
        Calendar calendarI = q.i();
        this.f87743a = calendarI;
        this.f87744b = calendarI.getMaximum(7);
        this.f87745c = i10;
    }
}
