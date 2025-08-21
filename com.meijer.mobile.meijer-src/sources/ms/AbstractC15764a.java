package ms;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.g;
import androidx.databinding.p;
import ls.C15607c;

/* renamed from: ms.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC15764a extends p {

    /* renamed from: A, reason: collision with root package name */
    public final Button f151615A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f151616B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f151617C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f151618D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f151619E;

    /* renamed from: z, reason: collision with root package name */
    public final ContentLoadingProgressBar f151620z;

    @Deprecated
    public static AbstractC15764a N0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (AbstractC15764a) p.i0(layoutInflater, C15607c.f150176a, viewGroup, z10, obj);
    }

    protected AbstractC15764a(Object obj, View view, int i10, ContentLoadingProgressBar contentLoadingProgressBar, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f151620z = contentLoadingProgressBar;
        this.f151615A = button;
        this.f151616B = textView;
        this.f151617C = textView2;
        this.f151618D = textView3;
        this.f151619E = textView4;
    }

    public static AbstractC15764a M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return N0(layoutInflater, viewGroup, z10, g.d());
    }
}
