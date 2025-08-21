package Nn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4271o extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ViewPager2 f22158A;

    /* renamed from: B, reason: collision with root package name */
    public final AbstractC4269n1 f22159B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f22160C;

    /* renamed from: D, reason: collision with root package name */
    public final MaterialToolbar f22161D;

    /* renamed from: z, reason: collision with root package name */
    public final TabLayout f22162z;

    @Deprecated
    public static AbstractC4271o N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4271o) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100240h, null, false, obj);
    }

    protected AbstractC4271o(Object obj, View view, int i10, TabLayout tabLayout, ViewPager2 viewPager2, AbstractC4269n1 abstractC4269n1, ProgressView progressView, MaterialToolbar materialToolbar) {
        super(obj, view, i10);
        this.f22162z = tabLayout;
        this.f22158A = viewPager2;
        this.f22159B = abstractC4269n1;
        this.f22160C = progressView;
        this.f22161D = materialToolbar;
    }

    public static AbstractC4271o M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
