package m;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15503a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private Locale f149503a;

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f149503a);
        }
        return null;
    }

    public C15503a(Context context) {
        this.f149503a = context.getResources().getConfiguration().locale;
    }
}
