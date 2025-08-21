package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import k4.c;

/* loaded from: classes4.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: O, reason: collision with root package name */
    private final Context f57888O;

    /* renamed from: P, reason: collision with root package name */
    private final ArrayAdapter f57889P;

    /* renamed from: Q, reason: collision with root package name */
    private Spinner f57890Q;

    /* renamed from: R, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f57891R;

    class a implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.Y()[i10].toString();
                if (string.equals(DropDownPreference.this.Z()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.b0(string);
            }
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f141424c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void d0() {
        this.f57889P.clear();
        if (W() != null) {
            for (CharSequence charSequence : W()) {
                this.f57889P.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void J() {
        this.f57890Q.performClick();
    }

    protected ArrayAdapter c0() {
        return new ArrayAdapter(this.f57888O, R.layout.simple_spinner_dropdown_item);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57891R = new a();
        this.f57888O = context;
        this.f57889P = c0();
        d0();
    }

    @Override // androidx.preference.Preference
    protected void H() {
        super.H();
        ArrayAdapter arrayAdapter = this.f57889P;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
