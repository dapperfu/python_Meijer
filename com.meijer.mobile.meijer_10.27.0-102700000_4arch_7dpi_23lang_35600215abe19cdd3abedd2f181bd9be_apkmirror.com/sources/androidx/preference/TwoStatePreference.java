package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes4.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    protected boolean f57742D;

    /* renamed from: E, reason: collision with root package name */
    private CharSequence f57743E;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f57744F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f57745G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f57746H;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    protected Object L(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    @Override // androidx.preference.Preference
    public boolean T() {
        return (this.f57746H ? this.f57742D : !this.f57742D) || super.T();
    }

    public boolean V() {
        return this.f57742D;
    }

    public void W(boolean z10) {
        boolean z11 = this.f57742D != z10;
        if (z11 || !this.f57745G) {
            this.f57742D = z10;
            this.f57745G = true;
            P(z10);
            if (z11) {
                I(T());
                H();
            }
        }
    }

    public void X(boolean z10) {
        this.f57746H = z10;
    }

    public void Y(CharSequence charSequence) {
        this.f57744F = charSequence;
        if (V()) {
            return;
        }
        H();
    }

    public void Z(CharSequence charSequence) {
        this.f57743E = charSequence;
        if (V()) {
            H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a0(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f57742D
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f57743E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f57743E
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f57742D
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f57744F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f57744F
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.B()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.a0(android.view.View):void");
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    protected void J() {
        super.J();
        boolean z10 = !V();
        if (a(Boolean.valueOf(z10))) {
            W(z10);
        }
    }
}
