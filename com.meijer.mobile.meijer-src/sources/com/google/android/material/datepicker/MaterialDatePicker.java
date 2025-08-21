package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.S;
import ce.C6503b;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.x;
import j.C14879a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import le.ViewOnTouchListenerC15484a;
import p2.G;
import qe.C16633b;
import te.C17234h;

/* loaded from: classes4.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: E, reason: collision with root package name */
    static final Object f87668E = "CONFIRM_BUTTON_TAG";

    /* renamed from: F, reason: collision with root package name */
    static final Object f87669F = "CANCEL_BUTTON_TAG";

    /* renamed from: G, reason: collision with root package name */
    static final Object f87670G = "TOGGLE_BUTTON_TAG";

    /* renamed from: A, reason: collision with root package name */
    private Button f87671A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f87672B;

    /* renamed from: C, reason: collision with root package name */
    private CharSequence f87673C;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f87674D;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<j<? super S>> f87675a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f87676b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f87677c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f87678d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private int f87679e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f87680f;

    /* renamed from: g, reason: collision with root package name */
    private PickerFragment<S> f87681g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.material.datepicker.a f87682h;

    /* renamed from: i, reason: collision with root package name */
    private g f87683i;

    /* renamed from: j, reason: collision with root package name */
    private MaterialCalendar<S> f87684j;

    /* renamed from: k, reason: collision with root package name */
    private int f87685k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f87686l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87687m;

    /* renamed from: n, reason: collision with root package name */
    private int f87688n;

    /* renamed from: o, reason: collision with root package name */
    private int f87689o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f87690p;

    /* renamed from: q, reason: collision with root package name */
    private int f87691q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f87692r;

    /* renamed from: s, reason: collision with root package name */
    private int f87693s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f87694t;

    /* renamed from: u, reason: collision with root package name */
    private int f87695u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f87696v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f87697w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f87698x;

    /* renamed from: y, reason: collision with root package name */
    private CheckableImageButton f87699y;

    /* renamed from: z, reason: collision with root package name */
    private C17234h f87700z;

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f87675a.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(MaterialDatePicker.this.a1());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f87676b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    class c implements G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f87703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f87704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f87705c;

        c(int i10, View view, int i11) {
            this.f87703a = i10;
            this.f87704b = view;
            this.f87705c = i11;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            int i10 = jVar.f(j.n.i()).f61162b;
            if (this.f87703a >= 0) {
                this.f87704b.getLayoutParams().height = this.f87703a + i10;
                View view2 = this.f87704b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f87704b;
            view3.setPadding(view3.getPaddingLeft(), this.f87705c + i10, this.f87704b.getPaddingRight(), this.f87704b.getPaddingBottom());
            return jVar;
        }
    }

    class d extends n<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.n
        public void a(S s10) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.n1(materialDatePicker.V0());
            MaterialDatePicker.this.f87671A.setEnabled(MaterialDatePicker.this.M0().b3());
        }
    }

    public static /* synthetic */ void D0(MaterialDatePicker materialDatePicker, View view) {
        materialDatePicker.f87671A.setEnabled(materialDatePicker.M0().b3());
        materialDatePicker.f87699y.toggle();
        materialDatePicker.f87688n = materialDatePicker.f87688n == 1 ? 0 : 1;
        materialDatePicker.p1(materialDatePicker.f87699y);
        materialDatePicker.m1();
    }

    private static Drawable K0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C14879a.b(context, ce.e.f61661d));
        stateListDrawable.addState(new int[0], C14879a.b(context, ce.e.f61662e));
        return stateListDrawable;
    }

    private void L0(Window window) {
        if (this.f87672B) {
            return;
        }
        View viewFindViewById = requireView().findViewById(ce.f.f61707k);
        com.google.android.material.internal.e.a(window, true, x.e(viewFindViewById), null);
        ViewCompat.A0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f87672B = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.d<S> M0() {
        if (this.f87680f == null) {
            this.f87680f = (com.google.android.material.datepicker.d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f87680f;
    }

    private static CharSequence N0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private int g1(Context context) {
        int i10 = this.f87679e;
        return i10 != 0 ? i10 : M0().W0(context);
    }

    private void h1(Context context) {
        this.f87699y.setTag(f87670G);
        this.f87699y.setImageDrawable(K0(context));
        this.f87699y.setChecked(this.f87688n != 0);
        ViewCompat.m0(this.f87699y, null);
        p1(this.f87699y);
        this.f87699y.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker.D0(this.f87746a, view);
            }
        });
    }

    static boolean k1(Context context) {
        return l1(context, C6503b.f61517X);
    }

    static boolean l1(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C16633b.d(context, C6503b.f61498E, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void o1() {
        this.f87697w.setText((this.f87688n == 1 && j1()) ? this.f87674D : this.f87673C);
    }

    private void p1(CheckableImageButton checkableImageButton) {
        this.f87699y.setContentDescription(this.f87688n == 1 ? checkableImageButton.getContext().getString(ce.j.f61787z) : checkableImageButton.getContext().getString(ce.j.f61758B));
    }

    void n1(String str) {
        this.f87698x.setContentDescription(U0());
        this.f87698x.setText(str);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f87677c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), g1(requireContext()));
        Context context = dialog.getContext();
        this.f87687m = i1(context);
        this.f87700z = new C17234h(context, null, C6503b.f61498E, ce.k.f61794G);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ce.l.f62155c4, C6503b.f61498E, ce.k.f61794G);
        int color = typedArrayObtainStyledAttributes.getColor(ce.l.f62167d4, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f87700z.Q(context);
        this.f87700z.b0(ColorStateList.valueOf(color));
        this.f87700z.a0(ViewCompat.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f87687m ? ce.h.f61729D : ce.h.f61728C, viewGroup);
        Context context = viewInflate.getContext();
        g gVar = this.f87683i;
        if (gVar != null) {
            gVar.h(context);
        }
        if (this.f87687m) {
            viewInflate.findViewById(ce.f.f61672C).setLayoutParams(new LinearLayout.LayoutParams(Y0(context), -2));
        } else {
            viewInflate.findViewById(ce.f.f61673D).setLayoutParams(new LinearLayout.LayoutParams(Y0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(ce.f.f61679J);
        this.f87698x = textView;
        ViewCompat.o0(textView, 1);
        this.f87699y = (CheckableImageButton) viewInflate.findViewById(ce.f.f61680K);
        this.f87697w = (TextView) viewInflate.findViewById(ce.f.f61681L);
        h1(context);
        this.f87671A = (Button) viewInflate.findViewById(ce.f.f61702f);
        if (M0().b3()) {
            this.f87671A.setEnabled(true);
        } else {
            this.f87671A.setEnabled(false);
        }
        this.f87671A.setTag(f87668E);
        CharSequence charSequence = this.f87690p;
        if (charSequence != null) {
            this.f87671A.setText(charSequence);
        } else {
            int i10 = this.f87689o;
            if (i10 != 0) {
                this.f87671A.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f87692r;
        if (charSequence2 != null) {
            this.f87671A.setContentDescription(charSequence2);
        } else if (this.f87691q != 0) {
            this.f87671A.setContentDescription(getContext().getResources().getText(this.f87691q));
        }
        this.f87671A.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(ce.f.f61699c);
        button.setTag(f87669F);
        CharSequence charSequence3 = this.f87694t;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f87693s;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f87696v;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f87695u != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f87695u));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f87678d.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f87681g.v0();
        super.onStop();
    }

    private String U0() {
        return M0().S0(requireContext());
    }

    private static int Y0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ce.d.f61611c0);
        int i10 = k.o().f87750d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ce.d.f61615e0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ce.d.f61621h0));
    }

    static boolean i1(Context context) {
        return l1(context, R.attr.windowFullscreen);
    }

    private boolean j1() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private void m1() {
        int iG1 = g1(requireContext());
        MaterialTextInputPicker materialTextInputPickerG1 = MaterialCalendar.g1(M0(), iG1, this.f87682h, this.f87683i);
        this.f87684j = materialTextInputPickerG1;
        if (this.f87688n == 1) {
            materialTextInputPickerG1 = MaterialTextInputPicker.w0(M0(), iG1, this.f87682h);
        }
        this.f87681g = materialTextInputPickerG1;
        o1();
        n1(V0());
        S sBeginTransaction = getChildFragmentManager().beginTransaction();
        sBeginTransaction.r(ce.f.f61672C, this.f87681g);
        sBeginTransaction.j();
        this.f87681g.u0(new d());
    }

    public String V0() {
        return M0().T1(getContext());
    }

    public final S a1() {
        return M0().K();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f87679e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f87680f = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f87682h = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f87683i = (g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f87685k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f87686l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f87688n = bundle.getInt("INPUT_MODE_KEY");
        this.f87689o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f87690p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f87691q = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f87692r = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f87693s = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f87694t = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f87695u = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f87696v = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f87686l;
        if (text == null) {
            text = requireContext().getResources().getText(this.f87685k);
        }
        this.f87673C = text;
        this.f87674D = N0(text);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        k kVarN0;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f87679e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f87680f);
        a.b bVar = new a.b(this.f87682h);
        MaterialCalendar<S> materialCalendar = this.f87684j;
        if (materialCalendar == null) {
            kVarN0 = null;
        } else {
            kVarN0 = materialCalendar.N0();
        }
        if (kVarN0 != null) {
            bVar.b(kVarN0.f87752f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f87683i);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f87685k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f87686l);
        bundle.putInt("INPUT_MODE_KEY", this.f87688n);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f87689o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f87690p);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f87691q);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f87692r);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f87693s);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f87694t);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f87695u);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f87696v);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f87687m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f87700z);
            L0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(ce.d.f61619g0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f87700z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC15484a(requireDialog(), rect));
        }
        m1();
    }
}
