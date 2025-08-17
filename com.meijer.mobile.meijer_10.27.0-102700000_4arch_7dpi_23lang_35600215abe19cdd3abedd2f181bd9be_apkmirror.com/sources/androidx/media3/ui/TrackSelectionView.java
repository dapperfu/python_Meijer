package androidx.media3.ui;

import Ce.L;
import a3.G;
import a3.H;
import a3.J;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import d3.C13466a;
import h4.C14347B;
import h4.C14355e;
import h4.C14376z;
import h4.InterfaceC14350E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f57518a;

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f57519b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckedTextView f57520c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckedTextView f57521d;

    /* renamed from: e, reason: collision with root package name */
    private final b f57522e;

    /* renamed from: f, reason: collision with root package name */
    private final List<J.a> f57523f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<G, H> f57524g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f57525h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f57526i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC14350E f57527j;

    /* renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f57528k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f57529l;

    /* renamed from: m, reason: collision with root package name */
    private Comparator<c> f57530m;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final J.a f57532a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57533b;

        public a3.t a() {
            return this.f57532a.b(this.f57533b);
        }

        public c(J.a aVar, int i10) {
            this.f57532a = aVar;
            this.f57533b = i10;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void d() {
        this.f57529l = false;
        this.f57524g.clear();
    }

    private void e() {
        this.f57529l = true;
        this.f57524g.clear();
    }

    private void f(View view) {
        this.f57529l = false;
        c cVar = (c) C13466a.e(view.getTag());
        G gA = cVar.f57532a.a();
        int i10 = cVar.f57533b;
        H h10 = this.f57524g.get(gA);
        if (h10 == null) {
            if (!this.f57526i && this.f57524g.size() > 0) {
                this.f57524g.clear();
            }
            this.f57524g.put(gA, new H(gA, L.y(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(h10.f43641b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f57532a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f57524g.remove(gA);
                return;
            } else {
                this.f57524g.put(gA, new H(gA, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f57524g.put(gA, new H(gA, L.y(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f57524g.put(gA, new H(gA, arrayList));
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f57518a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f57519b = layoutInflaterFrom;
        b bVar = new b();
        this.f57522e = bVar;
        this.f57527j = new C14355e(getResources());
        this.f57523f = new ArrayList();
        this.f57524g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f57520c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C14347B.f134276x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(C14376z.f134441a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f57521d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C14347B.f134275w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public static Map<G, H> b(Map<G, H> map, List<J.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            H h10 = map.get(list.get(i10).a());
            if (h10 != null && (z10 || map2.isEmpty())) {
                map2.put(h10.f43640a, h10);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f57520c) {
            e();
        } else if (view == this.f57521d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private boolean g(J.a aVar) {
        return this.f57525h && aVar.d();
    }

    private boolean h() {
        return this.f57526i && this.f57523f.size() > 1;
    }

    private void i() {
        this.f57520c.setChecked(this.f57529l);
        this.f57521d.setChecked(!this.f57529l && this.f57524g.size() == 0);
        for (int i10 = 0; i10 < this.f57528k.length; i10++) {
            H h10 = this.f57524g.get(this.f57523f.get(i10).a());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f57528k[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (h10 != null) {
                        this.f57528k[i10][i11].setChecked(h10.f43641b.contains(Integer.valueOf(((c) C13466a.e(checkedTextViewArr[i11].getTag())).f57533b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f57529l;
    }

    public Map<G, H> getOverrides() {
        return this.f57524g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f57525h != z10) {
            this.f57525h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f57526i != z10) {
            this.f57526i = z10;
            if (!z10 && this.f57524g.size() > 1) {
                Map<G, H> mapB = b(this.f57524g, this.f57523f, false);
                this.f57524g.clear();
                this.f57524g.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f57520c.setVisibility(z10 ? 0 : 8);
    }

    private void j() {
        int i10;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f57523f.isEmpty()) {
            this.f57520c.setEnabled(false);
            this.f57521d.setEnabled(false);
            return;
        }
        this.f57520c.setEnabled(true);
        this.f57521d.setEnabled(true);
        this.f57528k = new CheckedTextView[this.f57523f.size()][];
        boolean zH = h();
        for (int i11 = 0; i11 < this.f57523f.size(); i11++) {
            J.a aVar = this.f57523f.get(i11);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f57528k;
            int i12 = aVar.f43757a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            c[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < aVar.f43757a; i13++) {
                cVarArr[i13] = new c(aVar, i13);
            }
            Comparator<c> comparator = this.f57530m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                if (i14 == 0) {
                    addView(this.f57519b.inflate(C14376z.f134441a, (ViewGroup) this, false));
                }
                if (!zG && !zH) {
                    i10 = R.layout.simple_list_item_single_choice;
                } else {
                    i10 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f57519b.inflate(i10, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f57518a);
                checkedTextView.setText(this.f57527j.a(cVarArr[i14].a()));
                checkedTextView.setTag(cVarArr[i14]);
                if (aVar.h(i14)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f57522e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f57528k[i11][i14] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public void setTrackNameProvider(InterfaceC14350E interfaceC14350E) {
        this.f57527j = (InterfaceC14350E) C13466a.e(interfaceC14350E);
        j();
    }
}
