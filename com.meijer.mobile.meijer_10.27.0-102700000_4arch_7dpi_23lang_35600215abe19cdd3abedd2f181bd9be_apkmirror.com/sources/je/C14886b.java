package je;

import ae.C5597b;
import ae.k;
import ae.l;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.d;
import androidx.core.view.ViewCompat;
import ie.C14718a;
import oe.C16025b;
import re.C16760h;
import ue.C17250a;

/* renamed from: je.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14886b extends c.a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f139570c = C5597b.f44505a;

    /* renamed from: d, reason: collision with root package name */
    private static final int f139571d = k.f44786b;

    /* renamed from: e, reason: collision with root package name */
    private static final int f139572e = C5597b.f44480B;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f139573a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f139574b;

    public C14886b(Context context) {
        this(context, 0);
    }

    public C14886b(Context context, int i10) {
        super(a(context), c(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f139570c;
        int i12 = f139571d;
        this.f139574b = C14887c.a(context2, i11, i12);
        int iC = C14718a.c(context2, C5597b.f44541s, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, l.f45271n3, i11, i12);
        int color = typedArrayObtainStyledAttributes.getColor(l.f45331s3, iC);
        typedArrayObtainStyledAttributes.recycle();
        C16760h c16760h = new C16760h(context2, null, i11, i12);
        c16760h.Q(context2);
        c16760h.b0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c16760h.Y(dimension);
            }
        }
        this.f139573a = c16760h;
    }

    private static int b(Context context) {
        TypedValue typedValueA = C16025b.a(context, f139572e);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int c(Context context, int i10) {
        return i10 == 0 ? b(context) : i10;
    }

    private static Context a(Context context) {
        int iB = b(context);
        Context contextC = C17250a.c(context, null, f139570c, f139571d);
        if (iB == 0) {
            return contextC;
        }
        return new d(contextC, iB);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C14886b setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (C14886b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C14886b setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C14886b setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C14886b setPositiveButtonIcon(Drawable drawable) {
        return (C14886b) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C14886b setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setSingleChoiceItems(i10, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C14886b setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setSingleChoiceItems(cursor, i10, str, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public C14886b setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setSingleChoiceItems(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C14886b setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setSingleChoiceItems(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C14886b setTitle(int i10) {
        return (C14886b) super.setTitle(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C14886b setTitle(CharSequence charSequence) {
        return (C14886b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public C14886b setView(int i10) {
        return (C14886b) super.setView(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C14886b setView(View view) {
        return (C14886b) super.setView(view);
    }

    @Override // androidx.appcompat.app.c.a
    public androidx.appcompat.app.c create() {
        androidx.appcompat.app.c cVarCreate = super.create();
        Window window = cVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f139573a;
        if (drawable instanceof C16760h) {
            ((C16760h) drawable).a0(ViewCompat.u(decorView));
        }
        window.setBackgroundDrawable(C14887c.b(this.f139573a, this.f139574b));
        decorView.setOnTouchListener(new ViewOnTouchListenerC14885a(cVarCreate, this.f139574b));
        return cVarCreate;
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C14886b setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C14886b setCancelable(boolean z10) {
        return (C14886b) super.setCancelable(z10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C14886b setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (C14886b) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C14886b setCustomTitle(View view) {
        return (C14886b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C14886b setIcon(int i10) {
        return (C14886b) super.setIcon(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C14886b setIcon(Drawable drawable) {
        return (C14886b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C14886b setIconAttribute(int i10) {
        return (C14886b) super.setIconAttribute(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C14886b setItems(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setItems(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C14886b setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C14886b setMessage(int i10) {
        return (C14886b) super.setMessage(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C14886b setMessage(CharSequence charSequence) {
        return (C14886b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C14886b setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C14886b) super.setMultiChoiceItems(i10, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C14886b setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C14886b) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C14886b setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C14886b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C14886b setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C14886b setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C14886b setNegativeButtonIcon(Drawable drawable) {
        return (C14886b) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C14886b setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setNeutralButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C14886b setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C14886b) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C14886b setNeutralButtonIcon(Drawable drawable) {
        return (C14886b) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C14886b setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (C14886b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C14886b setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (C14886b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C14886b setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (C14886b) super.setOnItemSelectedListener(onItemSelectedListener);
    }
}
