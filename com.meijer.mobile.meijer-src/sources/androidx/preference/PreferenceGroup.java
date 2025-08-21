package androidx.preference;

import Z.n0;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import b2.C6330k;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import k4.g;

/* loaded from: classes4.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: D, reason: collision with root package name */
    final n0<String, Long> f57934D;

    /* renamed from: E, reason: collision with root package name */
    private final Handler f57935E;

    /* renamed from: F, reason: collision with root package name */
    private List<Preference> f57936F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f57937G;

    /* renamed from: H, reason: collision with root package name */
    private int f57938H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f57939I;

    /* renamed from: J, reason: collision with root package name */
    private int f57940J;

    /* renamed from: K, reason: collision with root package name */
    private final Runnable f57941K;

    class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f57934D.clear();
            }
        }

        a() {
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57934D = new n0<>();
        this.f57935E = new Handler();
        this.f57937G = true;
        this.f57938H = 0;
        this.f57939I = false;
        this.f57940J = a.e.API_PRIORITY_OTHER;
        this.f57941K = new a();
        this.f57936F = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141527e1, i10, i11);
        int i12 = g.f141533g1;
        this.f57937G = C6330k.b(typedArrayObtainStyledAttributes, i12, i12, true);
        if (typedArrayObtainStyledAttributes.hasValue(g.f141530f1)) {
            int i13 = g.f141530f1;
            X(C6330k.d(typedArrayObtainStyledAttributes, i13, i13, a.e.API_PRIORITY_OTHER));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference V(int i10) {
        return this.f57936F.get(i10);
    }

    public int W() {
        return this.f57936F.size();
    }

    @Override // androidx.preference.Preference
    public void I(boolean z10) {
        super.I(z10);
        int iW = W();
        for (int i10 = 0; i10 < iW; i10++) {
            V(i10).M(this, z10);
        }
    }

    public void X(int i10) {
        if (i10 != Integer.MAX_VALUE && !E()) {
            FS.log_e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f57940J = i10;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
