package com.google.android.material.datepicker;

import ae.C5597b;
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
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.x;
import j.C14791a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.ViewOnTouchListenerC14885a;
import oe.C16025b;
import p2.G;
import re.C16760h;

/* loaded from: classes4.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: E, reason: collision with root package name */
    static final Object f86828E = "CONFIRM_BUTTON_TAG";

    /* renamed from: F, reason: collision with root package name */
    static final Object f86829F = "CANCEL_BUTTON_TAG";

    /* renamed from: G, reason: collision with root package name */
    static final Object f86830G = "TOGGLE_BUTTON_TAG";

    /* renamed from: A, reason: collision with root package name */
    private Button f86831A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f86832B;

    /* renamed from: C, reason: collision with root package name */
    private CharSequence f86833C;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f86834D;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<j<? super S>> f86835a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<View.OnClickListener> f86836b = new LinkedHashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f86837c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f86838d = new LinkedHashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private int f86839e;

    /* renamed from: f, reason: collision with root package name */
    private com.google.android.material.datepicker.d<S> f86840f;

    /* renamed from: g, reason: collision with root package name */
    private PickerFragment<S> f86841g;

    /* renamed from: h, reason: collision with root package name */
    private com.google.android.material.datepicker.a f86842h;

    /* renamed from: i, reason: collision with root package name */
    private g f86843i;

    /* renamed from: j, reason: collision with root package name */
    private MaterialCalendar<S> f86844j;

    /* renamed from: k, reason: collision with root package name */
    private int f86845k;

    /* renamed from: l, reason: collision with root package name */
    private CharSequence f86846l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f86847m;

    /* renamed from: n, reason: collision with root package name */
    private int f86848n;

    /* renamed from: o, reason: collision with root package name */
    private int f86849o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f86850p;

    /* renamed from: q, reason: collision with root package name */
    private int f86851q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f86852r;

    /* renamed from: s, reason: collision with root package name */
    private int f86853s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f86854t;

    /* renamed from: u, reason: collision with root package name */
    private int f86855u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f86856v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f86857w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f86858x;

    /* renamed from: y, reason: collision with root package name */
    private CheckableImageButton f86859y;

    /* renamed from: z, reason: collision with root package name */
    private C16760h f86860z;

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f86835a.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(MaterialDatePicker.this.Z0());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f86836b.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    class c implements G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f86863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f86864b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f86865c;

        c(int i10, View view, int i11) {
            this.f86863a = i10;
            this.f86864b = view;
            this.f86865c = i11;
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            int i10 = jVar.f(j.n.i()).f61363b;
            if (this.f86863a >= 0) {
                this.f86864b.getLayoutParams().height = this.f86863a + i10;
                View view2 = this.f86864b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f86864b;
            view3.setPadding(view3.getPaddingLeft(), this.f86865c + i10, this.f86864b.getPaddingRight(), this.f86864b.getPaddingBottom());
            return jVar;
        }
    }

    class d extends n<S> {
        d() {
        }

        @Override // com.google.android.material.datepicker.n
        public void a(S s10) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.n1(materialDatePicker.X0());
            MaterialDatePicker.this.f86831A.setEnabled(MaterialDatePicker.this.L0().d3());
        }
    }

    public static /* synthetic */ void A0(MaterialDatePicker materialDatePicker, View view) {
        materialDatePicker.f86831A.setEnabled(materialDatePicker.L0().d3());
        materialDatePicker.f86859y.toggle();
        materialDatePicker.f86848n = materialDatePicker.f86848n == 1 ? 0 : 1;
        materialDatePicker.p1(materialDatePicker.f86859y);
        materialDatePicker.m1();
    }

    private static Drawable J0(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C14791a.b(context, ae.e.f44646d));
        stateListDrawable.addState(new int[0], C14791a.b(context, ae.e.f44647e));
        return stateListDrawable;
    }

    private void K0(Window window) {
        if (this.f86832B) {
            return;
        }
        View viewFindViewById = requireView().findViewById(ae.f.f44692k);
        com.google.android.material.internal.e.a(window, true, x.e(viewFindViewById), null);
        ViewCompat.A0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f86832B = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.d<S> L0() {
        if (this.f86840f == null) {
            this.f86840f = (com.google.android.material.datepicker.d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f86840f;
    }

    private static CharSequence O0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private int g1(Context context) {
        int i10 = this.f86839e;
        return i10 != 0 ? i10 : L0().X0(context);
    }

    private void h1(Context context) {
        this.f86859y.setTag(f86830G);
        this.f86859y.setImageDrawable(J0(context));
        this.f86859y.setChecked(this.f86848n != 0);
        ViewCompat.m0(this.f86859y, null);
        p1(this.f86859y);
        this.f86859y.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker.A0(this.f86906a, view);
            }
        });
    }

    static boolean k1(Context context) {
        return l1(context, C5597b.f44502X);
    }

    static boolean l1(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C16025b.d(context, C5597b.f44483E, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void o1() {
        this.f86857w.setText((this.f86848n == 1 && j1()) ? this.f86834D : this.f86833C);
    }

    private void p1(CheckableImageButton checkableImageButton) {
        this.f86859y.setContentDescription(this.f86848n == 1 ? checkableImageButton.getContext().getString(ae.j.f44772z) : checkableImageButton.getContext().getString(ae.j.f44743B));
    }

    void n1(String str) {
        this.f86858x.setContentDescription(T0());
        this.f86858x.setText(str);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f86837c.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), g1(requireContext()));
        Context context = dialog.getContext();
        this.f86847m = i1(context);
        this.f86860z = new C16760h(context, null, C5597b.f44483E, ae.k.f44779G);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ae.l.f45140c4, C5597b.f44483E, ae.k.f44779G);
        int color = typedArrayObtainStyledAttributes.getColor(ae.l.f45152d4, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f86860z.Q(context);
        this.f86860z.b0(ColorStateList.valueOf(color));
        this.f86860z.a0(ViewCompat.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f86847m ? ae.h.f44714D : ae.h.f44713C, viewGroup);
        Context context = viewInflate.getContext();
        g gVar = this.f86843i;
        if (gVar != null) {
            gVar.h(context);
        }
        if (this.f86847m) {
            viewInflate.findViewById(ae.f.f44657C).setLayoutParams(new LinearLayout.LayoutParams(Y0(context), -2));
        } else {
            viewInflate.findViewById(ae.f.f44658D).setLayoutParams(new LinearLayout.LayoutParams(Y0(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(ae.f.f44664J);
        this.f86858x = textView;
        ViewCompat.o0(textView, 1);
        this.f86859y = (CheckableImageButton) viewInflate.findViewById(ae.f.f44665K);
        this.f86857w = (TextView) viewInflate.findViewById(ae.f.f44666L);
        h1(context);
        this.f86831A = (Button) viewInflate.findViewById(ae.f.f44687f);
        if (L0().d3()) {
            this.f86831A.setEnabled(true);
        } else {
            this.f86831A.setEnabled(false);
        }
        this.f86831A.setTag(f86828E);
        CharSequence charSequence = this.f86850p;
        if (charSequence != null) {
            this.f86831A.setText(charSequence);
        } else {
            int i10 = this.f86849o;
            if (i10 != 0) {
                this.f86831A.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f86852r;
        if (charSequence2 != null) {
            this.f86831A.setContentDescription(charSequence2);
        } else if (this.f86851q != 0) {
            this.f86831A.setContentDescription(getContext().getResources().getText(this.f86851q));
        }
        this.f86831A.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(ae.f.f44684c);
        button.setTag(f86829F);
        CharSequence charSequence3 = this.f86854t;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f86853s;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f86856v;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f86855u != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f86855u));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f86838d.iterator();
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
        this.f86841g.s0();
        super.onStop();
    }

    private String T0() {
        return L0().U0(requireContext());
    }

    private static int Y0(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ae.d.f44596c0);
        int i10 = k.o().f86910d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ae.d.f44600e0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(ae.d.f44606h0));
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
        MaterialTextInputPicker materialTextInputPickerG1 = MaterialCalendar.g1(L0(), iG1, this.f86842h, this.f86843i);
        this.f86844j = materialTextInputPickerG1;
        if (this.f86848n == 1) {
            materialTextInputPickerG1 = MaterialTextInputPicker.t0(L0(), iG1, this.f86842h);
        }
        this.f86841g = materialTextInputPickerG1;
        o1();
        n1(X0());
        S sBeginTransaction = getChildFragmentManager().beginTransaction();
        sBeginTransaction.r(ae.f.f44657C, this.f86841g);
        sBeginTransaction.j();
        this.f86841g.r0(new d());
    }

    public String X0() {
        return L0().T1(getContext());
    }

    public final S Z0() {
        return L0().K();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f86839e = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f86840f = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f86842h = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f86843i = (g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f86845k = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f86846l = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f86848n = bundle.getInt("INPUT_MODE_KEY");
        this.f86849o = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f86850p = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f86851q = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f86852r = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f86853s = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f86854t = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f86855u = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f86856v = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f86846l;
        if (text == null) {
            text = requireContext().getResources().getText(this.f86845k);
        }
        this.f86833C = text;
        this.f86834D = O0(text);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        k kVarO0;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f86839e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f86840f);
        a.b bVar = new a.b(this.f86842h);
        MaterialCalendar<S> materialCalendar = this.f86844j;
        if (materialCalendar == null) {
            kVarO0 = null;
        } else {
            kVarO0 = materialCalendar.O0();
        }
        if (kVarO0 != null) {
            bVar.b(kVarO0.f86912f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f86843i);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f86845k);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f86846l);
        bundle.putInt("INPUT_MODE_KEY", this.f86848n);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f86849o);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f86850p);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f86851q);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f86852r);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f86853s);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f86854t);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f86855u);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f86856v);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() throws Resources.NotFoundException {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f86847m) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f86860z);
            K0(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(ae.d.f44604g0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f86860z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC14885a(requireDialog(), rect));
        }
        m1();
    }
}
