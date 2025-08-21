package Dj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import ce.C6503b;
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
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LDj/z;", "Lku/a;", "LOj/j;", "<init>", "()V", "", "j", "()I", "Landroid/view/View;", "view", "P", "(Landroid/view/View;)LOj/j;", "binding", "position", "", "H", "(LOj/j;I)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class z extends AbstractC15424a<Oj.j> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Oj.p pVar, CompoundButton compoundButton, boolean z10) {
        if (!z10) {
            pVar.f24403n.setError((CharSequence) null);
            pVar.f24396g.setError((CharSequence) null);
            pVar.f24391b.setError((CharSequence) null);
            EnhancedTextInputLayoutView enhancedTextInputLayoutView = pVar.f24397h;
            enhancedTextInputLayoutView.setError((CharSequence) null);
            enhancedTextInputLayoutView.setText("");
            EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView, 0, null, null, null, null, 30, null);
            return;
        }
        pVar.f24403n.setError("Please select a state");
        pVar.f24396g.setError("Last name is required");
        pVar.f24396g.setText("Programmatically set text.");
        pVar.f24391b.setError("First name is required");
        final EnhancedTextInputLayoutView enhancedTextInputLayoutView2 = pVar.f24397h;
        enhancedTextInputLayoutView2.setError("This promo code has already been applied.");
        enhancedTextInputLayoutView2.setText("FREEFULFILLMENT");
        Context context = enhancedTextInputLayoutView2.getContext();
        Intrinsics.i(context, "getContext(...)");
        enhancedTextInputLayoutView2.b(-1, ColorStateList.valueOf(Cj.r.b(context, C6503b.f61552q, null, false, 6, null)), Z1.b.e(enhancedTextInputLayoutView2.getContext(), Cj.i.f4706I), enhancedTextInputLayoutView2.getContext().getString(Cj.o.f5081p0), new Function1() { // from class: Dj.v
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
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Dj.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                z.K(snackbarR0, view2);
            }
        });
        snackbarR0.c0();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Oj.p pVar, CompoundButton compoundButton, boolean z10) {
        Iterator it = CollectionsKt.p(pVar.f24392c, pVar.f24393d, pVar.f24394e, pVar.f24395f, pVar.f24401l).iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Oj.p pVar, View view, boolean z10) {
        if (!z10) {
            EnhancedTextInputLayoutView.c(pVar.f24397h, 0, null, null, null, null, 30, null);
        } else {
            EnhancedTextInputLayoutView enhancedTextInputLayoutView = pVar.f24397h;
            EnhancedTextInputLayoutView.c(enhancedTextInputLayoutView, -1, null, Z1.b.e(enhancedTextInputLayoutView.getContext(), Cj.i.f4833v), pVar.f24397h.getContext().getString(Cj.o.f5083q0), new Function1() { // from class: Dj.w
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
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Dj.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.O(snackbarR0, view);
            }
        });
        snackbarR0.c0();
        return Unit.f143329a;
    }

    @Override // ku.AbstractC15424a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void u(Oj.j binding, int position) {
        Intrinsics.j(binding, "binding");
        final Oj.p pVar = binding.f24369b;
        pVar.f24394e.setError("Passwords must match");
        pVar.f24398i.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Dj.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                z.M(pVar, view, z10);
            }
        });
        pVar.f24402m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                z.I(pVar, compoundButton, z10);
            }
        });
        pVar.f24400k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                z.L(pVar, compoundButton, z10);
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(pVar.getRoot().getContext(), Cj.m.f4999x, pVar.getRoot().getContext().getResources().getStringArray(Cj.e.f4646f));
        pVar.f24399j.setInputType(0);
        pVar.f24399j.setAdapter(arrayAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public Oj.j z(View view) {
        Intrinsics.j(view, "view");
        Oj.j jVarA = Oj.j.a(view);
        Intrinsics.i(jVarA, "bind(...)");
        return jVarA;
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return Cj.m.f4988m;
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
