package J2;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.a;
import o2.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f14531a;

    /* renamed from: b, reason: collision with root package name */
    private int f14532b = a.e.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    private int f14533c = 0;

    /* renamed from: J2.a$a, reason: collision with other inner class name */
    private static class C0230a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f14534a;

        /* renamed from: b, reason: collision with root package name */
        private final g f14535b;

        @Override // J2.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // J2.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f14534a, inputConnection, editorInfo);
        }

        @Override // J2.a.b
        void c(boolean z10) {
            this.f14535b.c(z10);
        }

        C0230a(EditText editText, boolean z10) {
            this.f14534a = editText;
            g gVar = new g(editText, z10);
            this.f14535b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(J2.b.getInstance());
        }
    }

    static class b {
        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }

        b() {
        }
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f14531a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f14531a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f14531a.c(z10);
    }

    public a(EditText editText, boolean z10) {
        i.h(editText, "editText cannot be null");
        this.f14531a = new C0230a(editText, z10);
    }
}
