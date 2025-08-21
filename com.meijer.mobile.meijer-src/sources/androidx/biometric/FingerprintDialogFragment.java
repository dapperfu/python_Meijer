package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.InterfaceC6131E;
import androidx.view.f0;
import com.fullstory.FS;
import r.C16795b;
import r.C16796c;
import r.C16797d;

/* loaded from: classes.dex */
public class FingerprintDialogFragment extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    final Handler f47288a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    final Runnable f47289b = new a();

    /* renamed from: c, reason: collision with root package name */
    androidx.biometric.f f47290c;

    /* renamed from: d, reason: collision with root package name */
    private int f47291d;

    /* renamed from: e, reason: collision with root package name */
    private int f47292e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f47293f;

    /* renamed from: g, reason: collision with root package name */
    TextView f47294g;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FingerprintDialogFragment.this.J0();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            FingerprintDialogFragment.this.f47290c.h0(true);
        }
    }

    class c implements InterfaceC6131E<Integer> {
        c() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Integer num) {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            fingerprintDialogFragment.f47288a.removeCallbacks(fingerprintDialogFragment.f47289b);
            FingerprintDialogFragment.this.L0(num.intValue());
            FingerprintDialogFragment.this.M0(num.intValue());
            FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
            fingerprintDialogFragment2.f47288a.postDelayed(fingerprintDialogFragment2.f47289b, 2000L);
        }
    }

    class d implements InterfaceC6131E<CharSequence> {
        d() {
        }

        @Override // androidx.view.InterfaceC6131E
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(CharSequence charSequence) {
            FingerprintDialogFragment fingerprintDialogFragment = FingerprintDialogFragment.this;
            fingerprintDialogFragment.f47288a.removeCallbacks(fingerprintDialogFragment.f47289b);
            FingerprintDialogFragment.this.N0(charSequence);
            FingerprintDialogFragment fingerprintDialogFragment2 = FingerprintDialogFragment.this;
            fingerprintDialogFragment2.f47288a.postDelayed(fingerprintDialogFragment2.f47289b, 2000L);
        }
    }

    private static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    private static class f {
        static int a() {
            return C16795b.f159114a;
        }
    }

    private boolean K0(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    static FingerprintDialogFragment H0() {
        return new FingerprintDialogFragment();
    }

    void L0(int i10) {
        int iY;
        Drawable drawableE0;
        if (this.f47293f == null || (drawableE0 = E0((iY = this.f47290c.y()), i10)) == null) {
            return;
        }
        this.f47293f.setImageDrawable(drawableE0);
        if (K0(iY, i10)) {
            e.a(drawableE0);
        }
        this.f47290c.e0(i10);
    }

    void M0(int i10) {
        TextView textView = this.f47294g;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.f47291d : this.f47292e);
        }
    }

    void N0(CharSequence charSequence) {
        TextView textView = this.f47294g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        c.a aVar = new c.a(requireContext());
        aVar.setTitle(this.f47290c.F());
        View viewInflate = LayoutInflater.from(aVar.getContext()).inflate(r.f.f159122a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(r.e.f159121d);
        if (textView != null) {
            CharSequence charSequenceE = this.f47290c.E();
            if (TextUtils.isEmpty(charSequenceE)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceE);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(r.e.f159118a);
        if (textView2 != null) {
            CharSequence charSequenceW = this.f47290c.w();
            if (TextUtils.isEmpty(charSequenceW)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceW);
            }
        }
        this.f47293f = (ImageView) viewInflate.findViewById(r.e.f159120c);
        this.f47294g = (TextView) viewInflate.findViewById(r.e.f159119b);
        aVar.setNegativeButton(androidx.biometric.b.b(this.f47290c.m()) ? getString(r.g.f159123a) : this.f47290c.D(), new b());
        aVar.setView(viewInflate);
        androidx.appcompat.app.c cVarCreate = aVar.create();
        cVarCreate.setCanceledOnTouchOutside(false);
        return cVarCreate;
    }

    private void D0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        androidx.biometric.f fVar = (androidx.biometric.f) new f0(activity).a(androidx.biometric.f.class);
        this.f47290c = fVar;
        fVar.A().i(this, new c());
        this.f47290c.x().i(this, new d());
    }

    private Drawable E0(int i10, int i11) {
        int i12;
        Context context = getContext();
        if (context == null) {
            FS.log_w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i10 == 0 && i11 == 1) {
            i12 = C16797d.f159117b;
        } else if (i10 == 1 && i11 == 2) {
            i12 = C16797d.f159116a;
        } else if (i10 == 2 && i11 == 1) {
            i12 = C16797d.f159117b;
        } else {
            if (i10 != 1 || i11 != 3) {
                return null;
            }
            i12 = C16797d.f159117b;
        }
        return Z1.b.e(context, i12);
    }

    private int F0(int i10) throws Resources.NotFoundException {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context != null && activity != null) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(i10, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i10});
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            return color;
        }
        FS.log_w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
        return 0;
    }

    void J0() {
        Context context = getContext();
        if (context == null) {
            FS.log_w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f47290c.f0(1);
            this.f47290c.d0(context.getString(r.g.f159125c));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f47290c.b0(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int iC;
        super.onCreate(bundle);
        D0();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f47291d = F0(f.a());
        } else {
            Context context = getContext();
            if (context != null) {
                iC = Z1.b.c(context, C16796c.f159115a);
            } else {
                iC = 0;
            }
            this.f47291d = iC;
        }
        this.f47292e = F0(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f47288a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f47290c.e0(0);
        this.f47290c.f0(1);
        this.f47290c.d0(getString(r.g.f159125c));
    }
}
