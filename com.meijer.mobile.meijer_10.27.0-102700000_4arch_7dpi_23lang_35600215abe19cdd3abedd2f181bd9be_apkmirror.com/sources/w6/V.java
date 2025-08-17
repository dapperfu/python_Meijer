package w6;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.Observable;

/* loaded from: classes4.dex */
final class V extends Observable implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    private final int f165849a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f165850b;

    /* renamed from: c, reason: collision with root package name */
    private int f165851c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f165852d = false;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    V(int i10, boolean z10) {
        this.f165849a = i10;
        this.f165850b = z10;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (charSequence.length() - this.f165851c > 1) {
            this.f165852d = true;
        } else {
            this.f165852d = false;
        }
        setChanged();
        notifyObservers(new C17775B(SystemClock.uptimeMillis(), "2", this.f165849a, this.f165852d));
        this.f165851c = charSequence.length();
    }
}
