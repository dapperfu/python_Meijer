package Mn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Mn.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC4266o extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ViewPager2 f20826A;

    /* renamed from: B, reason: collision with root package name */
    public final AbstractC4264n1 f20827B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f20828C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialToolbar f20829D;

    /* renamed from: z, reason: collision with root package name */
    public final TabLayout f20830z;

    @Deprecated
    public static AbstractC4266o M0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4266o) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99384h, null, false, obj);
    }

    protected AbstractC4266o(Object obj, View view, int i10, TabLayout tabLayout, ViewPager2 viewPager2, AbstractC4264n1 abstractC4264n1, ProgressView progressView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f20830z = tabLayout;
        this.f20826A = viewPager2;
        this.f20827B = abstractC4264n1;
        this.f20828C = progressView;
        this.f20829D = materialToolbar;
    }

    public static AbstractC4266o K0(LayoutInflater layoutInflater) {
        return M0(layoutInflater, androidx.databinding.g.d());
    }
}
