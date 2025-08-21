package J2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f15392a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15393b;

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public static class a {
        public boolean a(Editable editable, int i10, KeyEvent keyEvent) {
            return androidx.emoji2.text.f.i(editable, i10, keyEvent);
        }
    }

    e(KeyListener keyListener, a aVar) {
        this.f15392a = keyListener;
        this.f15393b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f15392a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f15392a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f15393b.a(editable, i10, keyEvent) || this.f15392a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f15392a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f15392a.onKeyUp(view, editable, i10, keyEvent);
    }
}
