package androidx.appcompat.widget;

import Z.n0;
import Z.o0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.LruCache;
import com.fullstory.FS;
import d2.C13595a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.C15428a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: i, reason: collision with root package name */
    private static D f46833i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, o0<ColorStateList>> f46835a;

    /* renamed from: b, reason: collision with root package name */
    private n0<String, b> f46836b;

    /* renamed from: c, reason: collision with root package name */
    private o0<String> f46837c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, Z.C<WeakReference<Drawable.ConstantState>>> f46838d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f46839e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46840f;

    /* renamed from: g, reason: collision with root package name */
    private c f46841g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f46832h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final a f46834j = new a(6);

    private static class a extends LruCache<Integer, PorterDuffColorFilter> {
        private static int l(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        public a(int i10) {
            super(i10);
        }

        PorterDuffColorFilter m(int i10, PorterDuff.Mode mode) {
            return d(Integer.valueOf(l(i10, mode)));
        }

        PorterDuffColorFilter n(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return f(Integer.valueOf(l(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(D d10, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            Z.C<WeakReference<Drawable.ConstantState>> c10 = this.f46838d.get(context);
            if (c10 == null) {
                c10 = new Z.C<>();
                this.f46838d.put(context, c10);
            }
            c10.i(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized Drawable h(Context context, long j10) {
        Z.C<WeakReference<Drawable.ConstantState>> c10 = this.f46838d.get(context);
        if (c10 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceD = c10.d(j10);
        if (weakReferenceD != null) {
            Drawable.ConstantState constantState = weakReferenceD.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c10.k(j10);
        }
        return null;
    }

    private static void o(D d10) {
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = e(context, i10);
            }
            if (drawableQ == null) {
                drawableQ = Z1.b.e(context, i10);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i10, z10, drawableQ);
            }
            if (drawableQ != null) {
                C5790y.b(drawableQ);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableQ;
    }

    synchronized ColorStateList l(Context context, int i10) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            c cVar = this.f46841g;
            colorStateListM = cVar == null ? null : cVar.b(context, i10);
            if (colorStateListM != null) {
                b(context, i10, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public synchronized void r(Context context) {
        Z.C<WeakReference<Drawable.ConstantState>> c10 = this.f46838d.get(context);
        if (c10 != null) {
            c10.a();
        }
    }

    synchronized Drawable s(Context context, X x10, int i10) {
        try {
            Drawable drawableQ = q(context, i10);
            if (drawableQ == null) {
                drawableQ = x10.a(i10);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i10, false, drawableQ);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(c cVar) {
        this.f46841g = cVar;
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f46835a == null) {
            this.f46835a = new WeakHashMap<>();
        }
        o0<ColorStateList> o0Var = this.f46835a.get(context);
        if (o0Var == null) {
            o0Var = new o0<>();
            this.f46835a.put(context, o0Var);
        }
        o0Var.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (this.f46840f) {
            return;
        }
        this.f46840f = true;
        Drawable drawableI = i(context, C15428a.f148937a);
        if (drawableI == null || !p(drawableI)) {
            this.f46840f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable e(Context context, int i10) throws Resources.NotFoundException {
        if (this.f46839e == null) {
            this.f46839e = new TypedValue();
        }
        TypedValue typedValue = this.f46839e;
        context.getResources().getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.f46841g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized D g() {
        try {
            if (f46833i == null) {
                D d10 = new D();
                f46833i = d10;
                o(d10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46833i;
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM;
        a aVar = f46834j;
        porterDuffColorFilterM = aVar.m(i10, mode);
        if (porterDuffColorFilterM == null) {
            porterDuffColorFilterM = new PorterDuffColorFilter(i10, mode);
            aVar.n(i10, mode, porterDuffColorFilterM);
        }
        return porterDuffColorFilterM;
    }

    private ColorStateList m(Context context, int i10) {
        o0<ColorStateList> o0Var;
        WeakHashMap<Context, o0<ColorStateList>> weakHashMap = this.f46835a;
        if (weakHashMap == null || (o0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return o0Var.e(i10);
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable q(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        n0<String, b> n0Var = this.f46836b;
        if (n0Var == null || n0Var.isEmpty()) {
            return null;
        }
        o0<String> o0Var = this.f46837c;
        if (o0Var != null) {
            String strE = o0Var.e(i10);
            if ("appcompat_skip_skip".equals(strE) || (strE != null && this.f46836b.get(strE) == null)) {
                return null;
            }
        } else {
            this.f46837c = new o0<>();
        }
        if (this.f46839e == null) {
            this.f46839e = new TypedValue();
        }
        TypedValue typedValue = this.f46839e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f46837c.a(i10, name);
                b bVar = this.f46836b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e10) {
                FS.log_e("ResourceManagerInternal", "Exception while inflating drawable", e10);
            }
        }
        if (drawableH == null) {
            this.f46837c.a(i10, "appcompat_skip_skip");
        }
        return drawableH;
    }

    PorterDuff.Mode n(int i10) {
        c cVar = this.f46841g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f46841g;
        return cVar != null && cVar.c(context, i10, drawable);
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i10);
        if (colorStateListL != null) {
            Drawable drawableR = C13595a.r(drawable.mutate());
            C13595a.o(drawableR, colorStateListL);
            PorterDuff.Mode modeN = n(i10);
            if (modeN != null) {
                C13595a.p(drawableR, modeN);
            }
            return drawableR;
        }
        c cVar = this.f46841g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, K k10, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = k10.f46909d;
            if (!z10 && !k10.f46908c) {
                drawable.clearColorFilter();
                return;
            }
            if (z10) {
                colorStateList = k10.f46906a;
            } else {
                colorStateList = null;
            }
            if (k10.f46908c) {
                mode = k10.f46907b;
            } else {
                mode = f46832h;
            }
            drawable.setColorFilter(f(colorStateList, mode, iArr));
            return;
        }
        FS.log_d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }
}
