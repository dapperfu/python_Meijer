package Dj;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ku.AbstractC15424a;
import le.C15485b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LDj/j;", "Lku/a;", "LOj/d;", "", "layoutId", "<init>", "(I)V", "j", "()I", "Landroid/view/View;", "view", "T", "(Landroid/view/View;)LOj/d;", "binding", "position", "", "J", "(LOj/d;I)V", "e", "I", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Dj.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3116j extends AbstractC15424a<Oj.d> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int layoutId;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(MaterialButton materialButton, View view) {
        new C15485b(materialButton.getContext()).setTitle("Dialog Title").setCancelable(true).setMessage("This is the dialog message. Are you sure you want to read it?").setPositiveButton("YES", new DialogInterface.OnClickListener() { // from class: Dj.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C3116j.L(dialogInterface, i10);
            }
        }).setNegativeButton("NO", new DialogInterface.OnClickListener() { // from class: Dj.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C3116j.M(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Oj.d dVar, CompoundButton compoundButton, boolean z10) {
        Iterator it = CollectionsKt.p(dVar.f24337e, dVar.f24338f, dVar.f24336d, dVar.f24339g).iterator();
        while (it.hasNext()) {
            ((MaterialButton) it.next()).setEnabled(z10);
        }
    }

    @Override // ku.AbstractC15424a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void u(final Oj.d binding, int position) {
        Intrinsics.j(binding, "binding");
        MaterialButton materialButton = binding.f24337e;
        materialButton.setEnabled(binding.f24335c.isChecked());
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: Dj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3116j.O(binding, view);
            }
        });
        MaterialButton materialButton2 = binding.f24338f;
        materialButton2.setEnabled(binding.f24335c.isChecked());
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: Dj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3116j.Q(binding, view);
            }
        });
        MaterialButton materialButton3 = binding.f24336d;
        materialButton3.setEnabled(binding.f24335c.isChecked());
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: Dj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3116j.S(binding, view);
            }
        });
        final MaterialButton materialButton4 = binding.f24339g;
        materialButton4.setOnClickListener(new View.OnClickListener() { // from class: Dj.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3116j.K(materialButton4, view);
            }
        });
        binding.f24335c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                C3116j.N(binding, compoundButton, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Oj.d z(View view) {
        Intrinsics.j(view, "view");
        Oj.d dVarA = Oj.d.a(view);
        Intrinsics.i(dVarA, "bind(...)");
        return dVarA;
    }

    @Override // ju.h
    /* renamed from: j, reason: from getter */
    public int getLayoutId() {
        return this.layoutId;
    }

    public C3116j(int i10) {
        this.layoutId = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Oj.d dVar, View view) {
        final Snackbar snackbarR0 = Snackbar.r0(dVar.getRoot(), "Single-line message with action", 0);
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Dj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3116j.P(snackbarR0, view2);
            }
        });
        snackbarR0.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Snackbar snackbar, View view) {
        snackbar.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Oj.d dVar, View view) {
        final Snackbar snackbarR0 = Snackbar.r0(dVar.getRoot(), "Two-line message with action. Two-line message with action.", 0);
        snackbarR0.u0("Longer Action Text", new View.OnClickListener() { // from class: Dj.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3116j.R(snackbarR0, view2);
            }
        });
        snackbarR0.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Snackbar snackbar, View view) {
        snackbar.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Oj.d dVar, View view) {
        ExpandableCardView root = dVar.getRoot();
        Intrinsics.h(view, "null cannot be cast to non-null type android.widget.Button");
        Snackbar.r0(root, ((Button) view).getText(), 0).c0();
    }
}
