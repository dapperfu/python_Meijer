package Cj;

import ae.C5597b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LCj/z;", "Lou/a;", "LNj/j;", "<init>", "()V", "", "j", "()I", "Landroid/view/View;", "view", "P", "(Landroid/view/View;)LNj/j;", "binding", "position", "", "H", "(LNj/j;I)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class z extends AbstractC16177a<Nj.j> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Nj.p pVar, CompoundButton compoundButton, boolean z10) {
        if (!z10) {
            pVar.f22158n.setError((CharSequence) null);
            pVar.f22151g.setError((CharSequence) null);
            pVar.f22146b.setError((CharSequence) null);
            EnhancedTextInputLayoutView enhancedTextInputLayoutView = pVar.f22152h;
            enhancedTextInputLayoutView.setError((CharSequence) null);
            enhancedTextInputLayoutView.setText("");
            EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView, 0, null, null, null, null, 30, null);
            return;
        }
        pVar.f22158n.setError("Please select a state");
        pVar.f22151g.setError("Last name is required");
        pVar.f22151g.setText("Programmatically set text.");
        pVar.f22146b.setError("First name is required");
        final EnhancedTextInputLayoutView enhancedTextInputLayoutView2 = pVar.f22152h;
        enhancedTextInputLayoutView2.setError("This promo code has already been applied.");
        enhancedTextInputLayoutView2.setText("FREEFULFILLMENT");
        Context context = enhancedTextInputLayoutView2.getContext();
        Intrinsics.i(context, "getContext(...)");
        enhancedTextInputLayoutView2.b(-1, ColorStateList.valueOf(Bj.r.b(context, C5597b.f44537q, null, false, 6, null)), Z1.b.e(enhancedTextInputLayoutView2.getContext(), Bj.i.f2661I), enhancedTextInputLayoutView2.getContext().getString(Bj.o.f3036p0), new Function1() { // from class: Cj.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.J(enhancedTextInputLayoutView2, (View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(EnhancedTextInputLayoutView enhancedTextInputLayoutView, View view) {
        Intrinsics.j(view, "view");
        enhancedTextInputLayoutView.setText("");
        enhancedTextInputLayoutView.setError((CharSequence) null);
        EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView, 0, null, null, null, null, 30, null);
        final Snackbar snackbarR0 = Snackbar.r0(view, "Delete Promo Code Action", -1);
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Cj.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                z.K(snackbarR0, view2);
            }
        });
        snackbarR0.c0();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Nj.p pVar, CompoundButton compoundButton, boolean z10) {
        Iterator it = CollectionsKt.p(pVar.f22147c, pVar.f22148d, pVar.f22149e, pVar.f22150f, pVar.f22156l).iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Nj.p pVar, View view, boolean z10) {
        if (!z10) {
            EnhancedTextInputLayoutView.c(pVar.f22152h, 0, null, null, null, null, 30, null);
        } else {
            EnhancedTextInputLayoutView enhancedTextInputLayoutView = pVar.f22152h;
            EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView, -1, null, Z1.b.e(enhancedTextInputLayoutView.getContext(), Bj.i.f2788v), pVar.f22152h.getContext().getString(Bj.o.f3038q0), new Function1() { // from class: Cj.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return z.N((View) obj);
                }
            }, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(View it) {
        Intrinsics.j(it, "it");
        final Snackbar snackbarR0 = Snackbar.r0(it, "Submit Promo Code Action", -1);
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Cj.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.O(snackbarR0, view);
            }
        });
        snackbarR0.c0();
        return Unit.f142422a;
    }

    @Override // ou.AbstractC16177a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void u(Nj.j binding, int position) {
        Intrinsics.j(binding, "binding");
        final Nj.p pVar = binding.f22124b;
        pVar.f22149e.setError("Passwords must match");
        pVar.f22153i.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Cj.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                z.M(pVar, view, z10);
            }
        });
        pVar.f22157m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cj.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                z.I(pVar, compoundButton, z10);
            }
        });
        pVar.f22155k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cj.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                z.L(pVar, compoundButton, z10);
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(pVar.getRoot().getContext(), Bj.m.f2954x, pVar.getRoot().getContext().getResources().getStringArray(Bj.e.f2601f));
        pVar.f22154j.setInputType(0);
        pVar.f22154j.setAdapter(arrayAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Nj.j z(View view) {
        Intrinsics.j(view, "view");
        Nj.j jVarA = Nj.j.a(view);
        Intrinsics.i(jVarA, "bind(...)");
        return jVarA;
    }

    @Override // nu.h
    /* renamed from: j */
    public int getLayoutId() {
        return Bj.m.f2943m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Snackbar snackbar, View view) {
        snackbar.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Snackbar snackbar, View view) {
        snackbar.A();
    }
}
