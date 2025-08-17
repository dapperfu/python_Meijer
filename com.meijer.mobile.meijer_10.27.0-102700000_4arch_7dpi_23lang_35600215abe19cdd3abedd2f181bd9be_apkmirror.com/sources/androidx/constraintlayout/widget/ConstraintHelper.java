package androidx.constraintlayout.widget;

import V1.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fullstory.FS;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* renamed from: a, reason: collision with root package name */
    protected int[] f53000a;

    /* renamed from: b, reason: collision with root package name */
    protected int f53001b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f53002c;

    /* renamed from: d, reason: collision with root package name */
    protected i f53003d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f53004e;

    /* renamed from: f, reason: collision with root package name */
    protected String f53005f;

    /* renamed from: g, reason: collision with root package name */
    private View[] f53006g;

    /* renamed from: h, reason: collision with root package name */
    private HashMap<Integer, String> f53007h;

    public ConstraintHelper(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f53000a = new int[32];
        this.f53004e = false;
        this.f53006g = null;
        this.f53007h = new HashMap<>();
        this.f53002c = context;
        g(null);
    }

    private int e(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f53002c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void h(V1.e eVar, boolean z10) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setReferencedIds(int[] iArr) {
        this.f53005f = null;
        this.f53001b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    private void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f53002c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f53007h.put(Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        FS.log_w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f53425a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53558t1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f53005f = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f53000a, this.f53001b);
    }

    public void m() {
        if (this.f53003d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f53085n0 = (V1.e) this.f53003d;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f53004e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f53005f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f53001b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f53001b + 1;
        int[] iArr = this.f53000a;
        if (i11 > iArr.length) {
            this.f53000a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f53000a;
        int i12 = this.f53001b;
        iArr2[i12] = i10;
        this.f53001b = i12 + 1;
    }

    private int f(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objN = constraintLayout.n(0, str);
            if (objN instanceof Integer) {
                iE = ((Integer) objN).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = e.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iE == 0) {
            return this.f53002c.getResources().getIdentifier(str, PreferencesHelper.PREF_ID, this.f53002c.getPackageName());
        }
        return iE;
    }

    protected void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    protected void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f53001b; i10++) {
            View viewP = constraintLayout.p(this.f53000a[i10]);
            if (viewP != null) {
                viewP.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewP.setTranslationZ(viewP.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void l(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f53005f);
        }
        i iVar = this.f53003d;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i10 = 0; i10 < this.f53001b; i10++) {
            int i11 = this.f53000a[i10];
            View viewP = constraintLayout.p(i11);
            if (viewP == null && (iE = e(constraintLayout, (str = this.f53007h.get(Integer.valueOf(i11))))) != 0) {
                this.f53000a[i10] = iE;
                this.f53007h.put(Integer.valueOf(iE), str);
                viewP = constraintLayout.p(iE);
            }
            if (viewP != null) {
                this.f53003d.b(constraintLayout.q(viewP));
            }
        }
        this.f53003d.a(constraintLayout.f53010c);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f53005f;
        if (str != null) {
            setIds(str);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f53000a = new int[32];
        this.f53004e = false;
        this.f53006g = null;
        this.f53007h = new HashMap<>();
        this.f53002c = context;
        g(attributeSet);
    }
}
