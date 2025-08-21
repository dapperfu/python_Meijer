package x6;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.Observable;

/* loaded from: classes4.dex */
final class V extends Observable implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final int f170494a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f170495b;

    /* renamed from: c, reason: collision with root package name */
    private int f170496c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f170497d = false;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    V(int i10, boolean z10) {
        this.f170494a = i10;
        this.f170495b = z10;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (charSequence.length() - this.f170496c > 1) {
            this.f170497d = true;
        } else {
            this.f170497d = false;
        }
        setChanged();
        notifyObservers(new C18096B(SystemClock.uptimeMillis(), "2", this.f170494a, this.f170497d));
        this.f170496c = charSequence.length();
    }
}
