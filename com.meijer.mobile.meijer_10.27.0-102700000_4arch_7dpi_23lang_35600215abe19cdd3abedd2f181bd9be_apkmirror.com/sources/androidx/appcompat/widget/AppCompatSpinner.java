package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.fullstory.FS;
import i.C14575a;
import j.C14791a;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    private static final int[] f46514i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    private final C5626b f46515a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46516b;

    /* renamed from: c, reason: collision with root package name */
    private A f46517c;

    /* renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f46518d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46519e;

    /* renamed from: f, reason: collision with root package name */
    private h f46520f;

    /* renamed from: g, reason: collision with root package name */
    int f46521g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f46522h;

    class a extends A {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f46523j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f46523j = fVar;
        }

        @Override // androidx.appcompat.widget.A
        public ShowableListMenu d() {
            return this.f46523j;
        }

        @Override // androidx.appcompat.widget.A
        public boolean e() {
            if (AppCompatSpinner.this.getInternalPopup().b()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.c f46526a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f46527b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f46528c;

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public int m() {
            return 0;
        }

        d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public boolean b() {
            androidx.appcompat.app.c cVar = this.f46526a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void c(Drawable drawable) {
            FS.log_e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f46526a;
            if (cVar != null) {
                cVar.dismiss();
                this.f46526a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void f(int i10) {
            FS.log_e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public CharSequence g() {
            return this.f46528c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void i(CharSequence charSequence) {
            this.f46528c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void j(int i10) {
            FS.log_e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void k(int i10) {
            FS.log_e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void l(int i10, int i11) {
            if (this.f46527b == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f46528c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c cVarCreate = aVar.setSingleChoiceItems(this.f46527b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f46526a = cVarCreate;
            ListView listViewJ = cVarCreate.j();
            listViewJ.setTextDirection(i10);
            listViewJ.setTextAlignment(i11);
            this.f46526a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void n(ListAdapter listAdapter) {
            this.f46527b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f46527b.getItemId(i10));
            }
            dismiss();
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f46530a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f46531b;

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f46531b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f46531b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f46530a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f46530a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f46531b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof I) {
                    I i10 = (I) spinnerAdapter;
                    if (i10.getDropDownViewTheme() == null) {
                        i10.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }
    }

    class f extends B implements h {

        /* renamed from: I, reason: collision with root package name */
        private CharSequence f46532I;

        /* renamed from: J, reason: collision with root package name */
        ListAdapter f46533J;

        /* renamed from: K, reason: collision with root package name */
        private final Rect f46534K;

        /* renamed from: L, reason: collision with root package name */
        private int f46535L;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f46537a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f46537a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.f46533J.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.U(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.S();
                    f.super.a();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f46540a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f46540a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f46540a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f46534K = new Rect();
            C(AppCompatSpinner.this);
            I(true);
            O(0);
            K(new a(AppCompatSpinner.this));
        }

        public int T() {
            return this.f46535L;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public CharSequence g() {
            return this.f46532I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void i(CharSequence charSequence) {
            this.f46532I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void k(int i10) {
            this.f46535L = i10;
        }

        void S() {
            int i10;
            int iT;
            Drawable drawableH = h();
            if (drawableH != null) {
                drawableH.getPadding(AppCompatSpinner.this.f46522h);
                if (Y.b(AppCompatSpinner.this)) {
                    i10 = AppCompatSpinner.this.f46522h.right;
                } else {
                    i10 = -AppCompatSpinner.this.f46522h.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f46522h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f46521g;
            if (i11 == -2) {
                int iA = appCompatSpinner.a((SpinnerAdapter) this.f46533J, h());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f46522h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                E(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i11);
            }
            if (Y.b(AppCompatSpinner.this)) {
                iT = i10 + (((width - paddingRight) - y()) - T());
            } else {
                iT = i10 + paddingLeft + T();
            }
            f(iT);
        }

        boolean U(View view) {
            if (view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f46534K)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.h
        public void l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            S();
            H(2);
            super.a();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            listView.setTextDirection(i10);
            listView.setTextAlignment(i11);
            P(AppCompatSpinner.this.getSelectedItemPosition());
            if (!zB && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                J(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.B, androidx.appcompat.widget.AppCompatSpinner.h
        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.f46533J = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        boolean f46542a;

        class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }

            a() {
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f46542a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f46542a ? (byte) 1 : (byte) 0);
        }
    }

    interface h {
        boolean b();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i10);

        CharSequence g();

        Drawable h();

        void i(CharSequence charSequence);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        void n(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136517N);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f46522h);
        Rect rect = this.f46522h;
        return iMax2 + rect.left + rect.right;
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!o2.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    void b() {
        this.f46520f.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f46520f;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f46520f;
        return hVar != null ? hVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f46520f != null ? this.f46521g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f46520f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f46520f;
        return hVar != null ? hVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f46516b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f46520f;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            return c5626b.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            return c5626b.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f46542a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f46520f;
        gVar.f46542a = hVar != null && hVar.b();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        A a10 = this.f46517c;
        if (a10 == null || !a10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f46520f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f46519e) {
            this.f46518d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f46520f != null) {
            Context context = this.f46516b;
            if (context == null) {
                context = getContext();
            }
            this.f46520f.n(new e(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f46520f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.k(i10);
            this.f46520f.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f46520f;
        if (hVar != null) {
            hVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f46520f != null) {
            this.f46521g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f46520f;
        if (hVar != null) {
            hVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f46520f;
        if (hVar != null) {
            hVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            c5626b.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            c5626b.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            c5626b.b();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f46520f;
        if (hVar != null && hVar.b()) {
            this.f46520f.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f46520f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            c5626b.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5626b c5626b = this.f46515a;
        if (c5626b != null) {
            c5626b.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C14791a.b(getPopupContext(), i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
