package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.meijer.mobile.widget.UnauthContentView;
import com.meijer.mobile.widget.UnauthFooterView;

/* loaded from: classes10.dex */
public abstract class D1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final View f21290A;

    /* renamed from: B, reason: collision with root package name */
    public final UnauthContentView f21291B;

    /* renamed from: C, reason: collision with root package name */
    public final ScrollView f21292C;

    /* renamed from: D, reason: collision with root package name */
    public final UnauthContentView f21293D;

    /* renamed from: E, reason: collision with root package name */
    public final UnauthContentView f21294E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f21295F;

    /* renamed from: G, reason: collision with root package name */
    public final UnauthFooterView f21296G;

    /* renamed from: z, reason: collision with root package name */
    public final UnauthContentView f21297z;

    @Deprecated
    public static D1 N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (D1) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100268q0, viewGroup, z10, obj);
    }

    protected D1(Object obj, View view, int i10, UnauthContentView unauthContentView, View view2, UnauthContentView unauthContentView2, ScrollView scrollView, UnauthContentView unauthContentView3, UnauthContentView unauthContentView4, ImageView imageView, UnauthFooterView unauthFooterView) {
        super(obj, view, i10);
        this.f21297z = unauthContentView;
        this.f21290A = view2;
        this.f21291B = unauthContentView2;
        this.f21292C = scrollView;
        this.f21293D = unauthContentView3;
        this.f21294E = unauthContentView4;
        this.f21295F = imageView;
        this.f21296G = unauthFooterView;
    }

    public static D1 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
