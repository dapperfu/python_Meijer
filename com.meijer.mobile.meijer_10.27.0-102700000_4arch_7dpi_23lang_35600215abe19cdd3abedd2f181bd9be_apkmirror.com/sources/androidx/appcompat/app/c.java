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
import i.C14575a;

/* loaded from: classes.dex */
public class c extends q implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    final AlertController f45954f;

    public static class a {

        /* renamed from: P, reason: collision with root package name */
        private final AlertController.b f45955P;
        private final int mTheme;

        public a(Context context) {
            this(context, c.k(context, 0));
        }

        public a setIcon(int i10) {
            this.f45955P.f45798c = i10;
            return this;
        }

        public a setItems(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45817v = bVar.f45796a.getResources().getTextArray(i10);
            this.f45955P.f45819x = onClickListener;
            return this;
        }

        public a setMessage(int i10) {
            AlertController.b bVar = this.f45955P;
            bVar.f45803h = bVar.f45796a.getText(i10);
            return this;
        }

        public a setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45817v = bVar.f45796a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f45955P;
            bVar2.f45789J = onMultiChoiceClickListener;
            bVar2.f45785F = zArr;
            bVar2.f45786G = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45807l = bVar.f45796a.getText(i10);
            this.f45955P.f45809n = onClickListener;
            return this;
        }

        public a setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45810o = bVar.f45796a.getText(i10);
            this.f45955P.f45812q = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45804i = bVar.f45796a.getText(i10);
            this.f45955P.f45806k = onClickListener;
            return this;
        }

        public a setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45817v = bVar.f45796a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.f45955P;
            bVar2.f45819x = onClickListener;
            bVar2.f45788I = i11;
            bVar2.f45787H = true;
            return this;
        }

        public a setTitle(int i10) {
            AlertController.b bVar = this.f45955P;
            bVar.f45801f = bVar.f45796a.getText(i10);
            return this;
        }

        public a setView(int i10) {
            AlertController.b bVar = this.f45955P;
            bVar.f45821z = null;
            bVar.f45820y = i10;
            bVar.f45784E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f45955P = new AlertController.b(new ContextThemeWrapper(context, c.k(context, i10)));
            this.mTheme = i10;
        }

        public c create() {
            c cVar = new c(this.f45955P.f45796a, this.mTheme);
            this.f45955P.a(cVar.f45954f);
            cVar.setCancelable(this.f45955P.f45813r);
            if (this.f45955P.f45813r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f45955P.f45814s);
            cVar.setOnDismissListener(this.f45955P.f45815t);
            DialogInterface.OnKeyListener onKeyListener = this.f45955P.f45816u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context getContext() {
            return this.f45955P.f45796a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45818w = listAdapter;
            bVar.f45819x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.f45955P.f45813r = z10;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.f45955P;
            bVar.f45790K = cursor;
            bVar.f45791L = str;
            bVar.f45819x = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f45955P.f45802g = view;
            return this;
        }

        public a setIcon(Drawable drawable) {
            this.f45955P.f45799d = drawable;
            return this;
        }

        public a setIconAttribute(int i10) {
            TypedValue typedValue = new TypedValue();
            this.f45955P.f45796a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f45955P.f45798c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z10) {
            this.f45955P.f45793N = z10;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f45955P.f45803h = charSequence;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.f45955P.f45808m = drawable;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.f45955P.f45811p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f45955P.f45814s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f45955P.f45815t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f45955P.f45794O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f45955P.f45816u = onKeyListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.f45955P.f45805j = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z10) {
            this.f45955P.f45795P = z10;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f45955P.f45801f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45817v = charSequenceArr;
            bVar.f45819x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45807l = charSequence;
            bVar.f45809n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45810o = charSequence;
            bVar.f45812q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45804i = charSequence;
            bVar.f45806k = onClickListener;
            return this;
        }

        public c show() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f45955P;
            bVar.f45821z = view;
            bVar.f45820y = 0;
            bVar.f45784E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45817v = charSequenceArr;
            bVar.f45789J = onMultiChoiceClickListener;
            bVar.f45785F = zArr;
            bVar.f45786G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45790K = cursor;
            bVar.f45819x = onClickListener;
            bVar.f45788I = i10;
            bVar.f45791L = str;
            bVar.f45787H = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.b bVar = this.f45955P;
            bVar.f45821z = view;
            bVar.f45820y = 0;
            bVar.f45784E = true;
            bVar.f45780A = i10;
            bVar.f45781B = i11;
            bVar.f45782C = i12;
            bVar.f45783D = i13;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45790K = cursor;
            bVar.f45789J = onMultiChoiceClickListener;
            bVar.f45792M = str;
            bVar.f45791L = str2;
            bVar.f45786G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45817v = charSequenceArr;
            bVar.f45819x = onClickListener;
            bVar.f45788I = i10;
            bVar.f45787H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f45955P;
            bVar.f45818w = listAdapter;
            bVar.f45819x = onClickListener;
            bVar.f45788I = i10;
            bVar.f45787H = true;
            return this;
        }
    }

    static int k(Context context, int i10) {
        if (((i10 >>> 24) & l3.f92484c) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C14575a.f136536o, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i10) {
        return this.f45954f.c(i10);
    }

    public ListView j() {
        return this.f45954f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f45954f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f45954f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    protected c(Context context, int i10) {
        super(context, k(context, i10));
        this.f45954f = new AlertController(getContext(), this, getWindow());
    }

    @Override // androidx.appcompat.app.q, androidx.view.q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45954f.f();
    }

    @Override // androidx.appcompat.app.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f45954f.q(charSequence);
    }
}
