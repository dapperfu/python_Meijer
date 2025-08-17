package ms;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.g;
import androidx.databinding.p;
import ls.C15496c;

/* renamed from: ms.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15705a extends p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f150724A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f150725B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f150726C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f150727D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f150728E;

    /* renamed from: z, reason: collision with root package name */
    public final ContentLoadingProgressBar f150729z;

    @Deprecated
    public static AbstractC15705a M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC15705a) p.k0(layoutInflater, C15496c.f149338a, viewGroup, z10, obj);
    }

    protected AbstractC15705a(Object obj, View view, int i10, ContentLoadingProgressBar contentLoadingProgressBar, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f150729z = contentLoadingProgressBar;
        this.f150724A = button;
        this.f150725B = textView;
        this.f150726C = textView2;
        this.f150727D = textView3;
        this.f150728E = textView4;
    }

    public static AbstractC15705a K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, g.d());
    }
}
