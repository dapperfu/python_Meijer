package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.c;
import i.C14578a;

/* loaded from: classes.dex */
public class q extends androidx.view.q implements d {

    /* renamed from: d, reason: collision with root package name */
    private f f46198d;

    /* renamed from: e, reason: collision with root package name */
    private final c.a f46199e;

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.view.q, android.app.Dialog
    public void setContentView(int i10) {
        c();
        e().J(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().R(charSequence);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C14578a.f136261A, typedValue, true);
        return typedValue.resourceId;
    }

    public f e() {
        if (this.f46198d == null) {
            this.f46198d = f.k(this, this);
        }
        return this.f46198d;
    }

    public q(Context context, int i10) {
        super(context, f(context, i10));
        this.f46199e = new c.a() { // from class: androidx.appcompat.app.p
            @Override // androidx.core.view.c.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f46197a.g(keyEvent);
            }
        };
        f fVarE = e();
        fVarE.Q(f(context, i10));
        fVarE.z(null);
    }

    @Override // androidx.view.q, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.c.e(this.f46199e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) e().l(i10);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().I(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().w();
    }

    @Override // androidx.view.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().z(bundle);
    }

    @Override // androidx.view.q, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().F();
    }

    @Override // androidx.view.q, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().K(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().R(getContext().getString(i10));
    }

    @Override // androidx.view.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().L(view, layoutParams);
    }
}
