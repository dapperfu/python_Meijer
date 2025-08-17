package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.meijer.mobile.widget.UnauthContentView;
import com.meijer.mobile.widget.UnauthFooterView;

/* loaded from: classes9.dex */
public abstract class D1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f19958A;

    /* renamed from: B, reason: collision with root package name */
    public final UnauthContentView f19959B;

    /* renamed from: C, reason: collision with root package name */
    public final ScrollView f19960C;

    /* renamed from: D, reason: collision with root package name */
    public final UnauthContentView f19961D;

    /* renamed from: E, reason: collision with root package name */
    public final UnauthContentView f19962E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f19963F;

    /* renamed from: G, reason: collision with root package name */
    public final UnauthFooterView f19964G;

    /* renamed from: z, reason: collision with root package name */
    public final UnauthContentView f19965z;

    @Deprecated
    public static D1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (D1) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99412q0, viewGroup, z10, obj);
    }

    protected D1(Object obj, View view, int i10, UnauthContentView unauthContentView, View view2, UnauthContentView unauthContentView2, ScrollView scrollView, UnauthContentView unauthContentView3, UnauthContentView unauthContentView4, ImageView imageView, UnauthFooterView unauthFooterView) {
        super(obj, view, i10);
        this.f19965z = unauthContentView;
        this.f19958A = view2;
        this.f19959B = unauthContentView2;
        this.f19960C = scrollView;
        this.f19961D = unauthContentView3;
        this.f19962E = unauthContentView4;
        this.f19963F = imageView;
        this.f19964G = unauthFooterView;
    }

    public static D1 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
