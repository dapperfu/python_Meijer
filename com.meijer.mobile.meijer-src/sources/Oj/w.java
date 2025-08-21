package Oj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes8.dex */
public abstract class w extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialButton f24444A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f24445B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialToolbar f24446C;

    /* renamed from: D, reason: collision with root package name */
    public final TabLayout f24447D;

    /* renamed from: E, reason: collision with root package name */
    public final ViewPager f24448E;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f24449z;

    @Deprecated
    public static w N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w) androidx.databinding.p.i0(layoutInflater, Cj.m.f5001z, viewGroup, z10, obj);
    }

    protected w(Object obj, View view, int i10, Barrier barrier, MaterialButton materialButton, TextView textView, MaterialToolbar materialToolbar, TabLayout tabLayout, ViewPager viewPager) {
        super(obj, view, i10);
        this.f24449z = barrier;
        this.f24444A = materialButton;
        this.f24445B = textView;
        this.f24446C = materialToolbar;
        this.f24447D = tabLayout;
        this.f24448E = viewPager;
    }

    public static w M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
