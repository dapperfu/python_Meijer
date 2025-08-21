package Wj;

import Cj.f;
import Cj.h;
import Cj.i;
import Cj.r;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/android/material/snackbar/Snackbar;", "b", "(Lcom/google/android/material/snackbar/Snackbar;)Lcom/google/android/material/snackbar/Snackbar;", "c", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    public static final Snackbar b(Snackbar snackbar) {
        Intrinsics.j(snackbar, "<this>");
        Context contextE = snackbar.E();
        Intrinsics.i(contextE, "getContext(...)");
        snackbar.v0(r.b(contextE, f.f4649c, null, false, 6, null));
        View viewFindViewById = snackbar.K().findViewById(ce.f.f61685P);
        Intrinsics.h(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        textView.setGravity(16);
        textView.setCompoundDrawablesWithIntrinsicBounds(i.f4742U, 0, 0, 0);
        textView.setCompoundDrawablePadding(snackbar.E().getResources().getDimensionPixelOffset(h.f4681a));
        return snackbar;
    }

    public static final Snackbar c(final Snackbar snackbar) {
        Intrinsics.j(snackbar, "<this>");
        snackbar.u0(" ", new View.OnClickListener() { // from class: Wj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.d(snackbar, view);
            }
        });
        ((TextView) snackbar.K().findViewById(ce.f.f61684O)).setCompoundDrawablesRelativeWithIntrinsicBounds(i.f4780f, 0, 0, 0);
        return snackbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Snackbar snackbar, View view) {
        snackbar.A();
    }
}
