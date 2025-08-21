package Nn;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListFavoritesView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4212b0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ShoppingListFavoritesView f21811A;

    /* renamed from: B, reason: collision with root package name */
    public final Spinner f21812B;

    /* renamed from: C, reason: collision with root package name */
    public final ProgressView f21813C;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialToolbar f21814z;

    @Deprecated
    public static AbstractC4212b0 N0(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC4212b0) androidx.databinding.p.i0(layoutInflater, com.meijer.mobile.meijer.V.f100167A, null, false, obj);
    }

    protected AbstractC4212b0(Object obj, View view, int i10, MaterialToolbar materialToolbar, ShoppingListFavoritesView shoppingListFavoritesView, Spinner spinner, ProgressView progressView) {
        super(obj, view, i10);
        this.f21814z = materialToolbar;
        this.f21811A = shoppingListFavoritesView;
        this.f21812B = spinner;
        this.f21813C = progressView;
    }

    public static AbstractC4212b0 M0(LayoutInflater layoutInflater) {
        return N0(layoutInflater, androidx.databinding.g.d());
    }
}
