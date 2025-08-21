package Q0;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import j1.C14920a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LQ0/d;", "LQ0/l;", "Landroid/view/View;", "view", "LQ0/J;", "autofillTree", "<init>", "(Landroid/view/View;LQ0/J;)V", "a", "Landroid/view/View;", "d", "()Landroid/view/View;", "b", "LQ0/J;", "()LQ0/J;", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V", "rootAutofillId", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4647d implements InterfaceC4655l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final J autofillTree;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AutofillManager autofillManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AutofillId rootAutofillId;

    /* renamed from: a, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* renamed from: b, reason: from getter */
    public final J getAutofillTree() {
        return this.autofillTree;
    }

    /* renamed from: c, reason: from getter */
    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    /* renamed from: d, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public C4647d(View view, J j10) {
        AutofillId autofillIdA;
        this.view = view;
        this.autofillTree = j10;
        AutofillManager autofillManagerA = C4645b.a(view.getContext().getSystemService(C4644a.a()));
        if (autofillManagerA != null) {
            this.autofillManager = autofillManagerA;
            view.setImportantForAutofill(1);
            n1.b bVarA = n1.e.a(view);
            if (bVarA != null) {
                autofillIdA = bVarA.a();
            } else {
                autofillIdA = null;
            }
            if (autofillIdA != null) {
                this.rootAutofillId = autofillIdA;
                return;
            } else {
                C14920a.c("Required value was null.");
                throw new KotlinNothingValueException();
            }
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
