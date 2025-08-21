package le;

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
import ce.C6503b;
import ce.k;
import ce.l;
import ke.C15121a;
import qe.C16633b;
import te.C17234h;
import we.C17867a;

/* renamed from: le.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15485b extends c.a {

    /* renamed from: c, reason: collision with root package name */
    private static final int f149584c = C6503b.f61520a;

    /* renamed from: d, reason: collision with root package name */
    private static final int f149585d = k.f61801b;

    /* renamed from: e, reason: collision with root package name */
    private static final int f149586e = C6503b.f61495B;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f149587a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f149588b;

    public C15485b(Context context) {
        this(context, 0);
    }

    public C15485b(Context context, int i10) {
        super(a(context), c(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f149584c;
        int i12 = f149585d;
        this.f149588b = C15486c.a(context2, i11, i12);
        int iC = C15121a.c(context2, C6503b.f61556s, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, l.f62286n3, i11, i12);
        int color = typedArrayObtainStyledAttributes.getColor(l.f62346s3, iC);
        typedArrayObtainStyledAttributes.recycle();
        C17234h c17234h = new C17234h(context2, null, i11, i12);
        c17234h.Q(context2);
        c17234h.b0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                c17234h.Y(dimension);
            }
        }
        this.f149587a = c17234h;
    }

    private static int b(Context context) {
        TypedValue typedValueA = C16633b.a(context, f149586e);
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
        Context contextC = C17867a.c(context, null, f149584c, f149585d);
        if (iB == 0) {
            return contextC;
        }
        return new d(contextC, iB);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public C15485b setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (C15485b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C15485b setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C15485b setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C15485b setPositiveButtonIcon(Drawable drawable) {
        return (C15485b) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C15485b setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setSingleChoiceItems(i10, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C15485b setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setSingleChoiceItems(cursor, i10, str, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public C15485b setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setSingleChoiceItems(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C15485b setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setSingleChoiceItems(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C15485b setTitle(int i10) {
        return (C15485b) super.setTitle(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C15485b setTitle(CharSequence charSequence) {
        return (C15485b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public C15485b setView(int i10) {
        return (C15485b) super.setView(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public C15485b setView(View view) {
        return (C15485b) super.setView(view);
    }

    @Override // androidx.appcompat.app.c.a
    public androidx.appcompat.app.c create() {
        androidx.appcompat.app.c cVarCreate = super.create();
        Window window = cVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f149587a;
        if (drawable instanceof C17234h) {
            ((C17234h) drawable).a0(ViewCompat.u(decorView));
        }
        window.setBackgroundDrawable(C15486c.b(this.f149587a, this.f149588b));
        decorView.setOnTouchListener(new ViewOnTouchListenerC15484a(cVarCreate, this.f149588b));
        return cVarCreate;
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C15485b setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C15485b setCancelable(boolean z10) {
        return (C15485b) super.setCancelable(z10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C15485b setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (C15485b) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C15485b setCustomTitle(View view) {
        return (C15485b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C15485b setIcon(int i10) {
        return (C15485b) super.setIcon(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C15485b setIcon(Drawable drawable) {
        return (C15485b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C15485b setIconAttribute(int i10) {
        return (C15485b) super.setIconAttribute(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C15485b setItems(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setItems(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C15485b setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C15485b setMessage(int i10) {
        return (C15485b) super.setMessage(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C15485b setMessage(CharSequence charSequence) {
        return (C15485b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C15485b setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C15485b) super.setMultiChoiceItems(i10, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C15485b setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C15485b) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C15485b setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (C15485b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C15485b setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C15485b setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C15485b setNegativeButtonIcon(Drawable drawable) {
        return (C15485b) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C15485b setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setNeutralButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C15485b setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C15485b) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C15485b setNeutralButtonIcon(Drawable drawable) {
        return (C15485b) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C15485b setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (C15485b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C15485b setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (C15485b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C15485b setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (C15485b) super.setOnItemSelectedListener(onItemSelectedListener);
    }
}
