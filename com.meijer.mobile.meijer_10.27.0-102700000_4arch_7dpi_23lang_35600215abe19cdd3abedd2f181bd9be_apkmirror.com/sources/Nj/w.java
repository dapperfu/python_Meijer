package Nj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes7.dex */
public abstract class w extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialButton f22199A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f22200B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialToolbar f22201C;

    /* renamed from: D, reason: collision with root package name */
    public final TabLayout f22202D;

    /* renamed from: E, reason: collision with root package name */
    public final ViewPager f22203E;

    /* renamed from: z, reason: collision with root package name */
    public final Barrier f22204z;

    @Deprecated
    public static w M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w) androidx.databinding.p.k0(layoutInflater, Bj.m.f2956z, viewGroup, z10, obj);
    }

    protected w(Object obj, View view, int i10, Barrier barrier, MaterialButton materialButton, TextView textView, MaterialToolbar materialToolbar, TabLayout tabLayout, ViewPager viewPager) {
        super(obj, view, i10);
        this.f22204z = barrier;
        this.f22199A = materialButton;
        this.f22200B = textView;
        this.f22201C = materialToolbar;
        this.f22202D = tabLayout;
        this.f22203E = viewPager;
    }

    public static w K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
