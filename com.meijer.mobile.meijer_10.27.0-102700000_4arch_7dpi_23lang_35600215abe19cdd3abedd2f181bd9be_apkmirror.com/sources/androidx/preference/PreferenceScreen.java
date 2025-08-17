package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import b2.C6190k;
import k4.c;

/* loaded from: classes4.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: L, reason: collision with root package name */
    private boolean f57719L;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C6190k.a(context, c.f141234f, R.attr.preferenceScreenStyle));
        this.f57719L = true;
    }

    @Override // androidx.preference.Preference
    protected void J() {
        if (o() == null && m() == null && W() != 0) {
            z();
            throw null;
        }
    }
}
