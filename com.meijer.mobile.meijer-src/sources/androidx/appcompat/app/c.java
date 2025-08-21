package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.medallia.digital.mobilesdk.l3;
import i.C14578a;

/* loaded from: classes.dex */
public class c extends q implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    final AlertController f46178f;

    public static class a {

        /* renamed from: P, reason: collision with root package name */
        private final AlertController.b f46179P;
        private final int mTheme;

        public a(Context context) {
            this(context, c.k(context, 0));
        }

        public a setIcon(int i10) {
            this.f46179P.f46022c = i10;
            return this;
        }

        public a setItems(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46041v = bVar.f46020a.getResources().getTextArray(i10);
            this.f46179P.f46043x = onClickListener;
            return this;
        }

        public a setMessage(int i10) {
            AlertController.b bVar = this.f46179P;
            bVar.f46027h = bVar.f46020a.getText(i10);
            return this;
        }

        public a setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46041v = bVar.f46020a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f46179P;
            bVar2.f46013J = onMultiChoiceClickListener;
            bVar2.f46009F = zArr;
            bVar2.f46010G = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46031l = bVar.f46020a.getText(i10);
            this.f46179P.f46033n = onClickListener;
            return this;
        }

        public a setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46034o = bVar.f46020a.getText(i10);
            this.f46179P.f46036q = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46028i = bVar.f46020a.getText(i10);
            this.f46179P.f46030k = onClickListener;
            return this;
        }

        public a setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46041v = bVar.f46020a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f46179P;
            bVar2.f46043x = onClickListener;
            bVar2.f46012I = i11;
            bVar2.f46011H = true;
            return this;
        }

        public a setTitle(int i10) {
            AlertController.b bVar = this.f46179P;
            bVar.f46025f = bVar.f46020a.getText(i10);
            return this;
        }

        public a setView(int i10) {
            AlertController.b bVar = this.f46179P;
            bVar.f46045z = null;
            bVar.f46044y = i10;
            bVar.f46008E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f46179P = new AlertController.b(new ContextThemeWrapper(context, c.k(context, i10)));
            this.mTheme = i10;
        }

        public c create() {
            c cVar = new c(this.f46179P.f46020a, this.mTheme);
            this.f46179P.a(cVar.f46178f);
            cVar.setCancelable(this.f46179P.f46037r);
            if (this.f46179P.f46037r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f46179P.f46038s);
            cVar.setOnDismissListener(this.f46179P.f46039t);
            DialogInterface.OnKeyListener onKeyListener = this.f46179P.f46040u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context getContext() {
            return this.f46179P.f46020a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46042w = listAdapter;
            bVar.f46043x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.f46179P.f46037r = z10;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.f46179P;
            bVar.f46014K = cursor;
            bVar.f46015L = str;
            bVar.f46043x = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f46179P.f46026g = view;
            return this;
        }

        public a setIcon(Drawable drawable) {
            this.f46179P.f46023d = drawable;
            return this;
        }

        public a setIconAttribute(int i10) {
            TypedValue typedValue = new TypedValue();
            this.f46179P.f46020a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f46179P.f46022c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z10) {
            this.f46179P.f46017N = z10;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f46179P.f46027h = charSequence;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f46179P.f46032m = drawable;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f46179P.f46035p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f46179P.f46038s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f46179P.f46039t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f46179P.f46018O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f46179P.f46040u = onKeyListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f46179P.f46029j = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z10) {
            this.f46179P.f46019P = z10;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f46179P.f46025f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46041v = charSequenceArr;
            bVar.f46043x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46031l = charSequence;
            bVar.f46033n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46034o = charSequence;
            bVar.f46036q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46028i = charSequence;
            bVar.f46030k = onClickListener;
            return this;
        }

        public c show() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f46179P;
            bVar.f46045z = view;
            bVar.f46044y = 0;
            bVar.f46008E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46041v = charSequenceArr;
            bVar.f46013J = onMultiChoiceClickListener;
            bVar.f46009F = zArr;
            bVar.f46010G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46014K = cursor;
            bVar.f46043x = onClickListener;
            bVar.f46012I = i10;
            bVar.f46015L = str;
            bVar.f46011H = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.b bVar = this.f46179P;
            bVar.f46045z = view;
            bVar.f46044y = 0;
            bVar.f46008E = true;
            bVar.f46004A = i10;
            bVar.f46005B = i11;
            bVar.f46006C = i12;
            bVar.f46007D = i13;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46014K = cursor;
            bVar.f46013J = onMultiChoiceClickListener;
            bVar.f46016M = str;
            bVar.f46015L = str2;
            bVar.f46010G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46041v = charSequenceArr;
            bVar.f46043x = onClickListener;
            bVar.f46012I = i10;
            bVar.f46011H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f46179P;
            bVar.f46042w = listAdapter;
            bVar.f46043x = onClickListener;
            bVar.f46012I = i10;
            bVar.f46011H = true;
            return this;
        }
    }

    static int k(Context context, int i10) {
        if (((i10 >>> 24) & l3.f93323c) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C14578a.f136293o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i10) {
        return this.f46178f.c(i10);
    }

    public ListView j() {
        return this.f46178f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f46178f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f46178f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    protected c(Context context, int i10) {
        super(context, k(context, i10));
        this.f46178f = new AlertController(getContext(), this, getWindow());
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46178f.f();
    }

    @Override // androidx.appcompat.app.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f46178f.q(charSequence);
    }
}
