package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.C5648y;
import androidx.appcompat.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import f2.InterfaceMenuC13833a;
import i.C14584j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p2.AbstractC16199a;
import p2.C16246y;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f46084e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f46085f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f46086a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f46087b;

    /* renamed from: c, reason: collision with root package name */
    Context f46088c;

    /* renamed from: d, reason: collision with root package name */
    private Object f46089d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f46090c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f46091a;

        /* renamed from: b, reason: collision with root package name */
        private Method f46092b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f46092b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f46092b.invoke(this.f46091a, menuItem)).booleanValue();
                }
                this.f46092b.invoke(this.f46091a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        public a(Object obj, String str) {
            this.f46091a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f46092b = cls.getMethod(str, f46090c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC16199a f46093A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f46094B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f46095C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f46096D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f46097E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f46099a;

        /* renamed from: b, reason: collision with root package name */
        private int f46100b;

        /* renamed from: c, reason: collision with root package name */
        private int f46101c;

        /* renamed from: d, reason: collision with root package name */
        private int f46102d;

        /* renamed from: e, reason: collision with root package name */
        private int f46103e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f46104f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f46105g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f46106h;

        /* renamed from: i, reason: collision with root package name */
        private int f46107i;

        /* renamed from: j, reason: collision with root package name */
        private int f46108j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f46109k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f46110l;

        /* renamed from: m, reason: collision with root package name */
        private int f46111m;

        /* renamed from: n, reason: collision with root package name */
        private char f46112n;

        /* renamed from: o, reason: collision with root package name */
        private int f46113o;

        /* renamed from: p, reason: collision with root package name */
        private char f46114p;

        /* renamed from: q, reason: collision with root package name */
        private int f46115q;

        /* renamed from: r, reason: collision with root package name */
        private int f46116r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f46117s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f46118t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f46119u;

        /* renamed from: v, reason: collision with root package name */
        private int f46120v;

        /* renamed from: w, reason: collision with root package name */
        private int f46121w;

        /* renamed from: x, reason: collision with root package name */
        private String f46122x;

        /* renamed from: y, reason: collision with root package name */
        private String f46123y;

        /* renamed from: z, reason: collision with root package name */
        private String f46124z;

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f46106h = true;
            i(this.f46099a.add(this.f46100b, this.f46107i, this.f46108j, this.f46109k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f46106h = true;
            SubMenu subMenuAddSubMenu = this.f46099a.addSubMenu(this.f46100b, this.f46107i, this.f46108j, this.f46109k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public void h() {
            this.f46100b = 0;
            this.f46101c = 0;
            this.f46102d = 0;
            this.f46103e = 0;
            this.f46104f = true;
            this.f46105g = true;
        }

        public b(Menu menu) {
            this.f46099a = menu;
            h();
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f46088c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                FS.log_w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f46117s).setVisible(this.f46118t).setEnabled(this.f46119u).setCheckable(this.f46116r >= 1).setTitleCondensed(this.f46110l).setIcon(this.f46111m);
            int i10 = this.f46120v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f46124z != null) {
                if (g.this.f46088c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f46124z));
            }
            if (this.f46116r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).t(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).h(true);
                }
            }
            String str = this.f46122x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f46084e, g.this.f46086a));
                z10 = true;
            }
            int i11 = this.f46121w;
            if (i11 > 0) {
                if (z10) {
                    FS.log_w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC16199a abstractC16199a = this.f46093A;
            if (abstractC16199a != null) {
                C16246y.a(menuItem, abstractC16199a);
            }
            C16246y.c(menuItem, this.f46094B);
            C16246y.g(menuItem, this.f46095C);
            C16246y.b(menuItem, this.f46112n, this.f46113o);
            C16246y.f(menuItem, this.f46114p, this.f46115q);
            PorterDuff.Mode mode = this.f46097E;
            if (mode != null) {
                C16246y.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f46096D;
            if (colorStateList != null) {
                C16246y.d(menuItem, colorStateList);
            }
        }

        public boolean d() {
            return this.f46106h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f46088c.obtainStyledAttributes(attributeSet, C14584j.f136911w1);
            this.f46100b = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136921y1, 0);
            this.f46101c = typedArrayObtainStyledAttributes.getInt(C14584j.f136688A1, 0);
            this.f46102d = typedArrayObtainStyledAttributes.getInt(C14584j.f136693B1, 0);
            this.f46103e = typedArrayObtainStyledAttributes.getInt(C14584j.f136698C1, 0);
            this.f46104f = typedArrayObtainStyledAttributes.getBoolean(C14584j.f136926z1, true);
            this.f46105g = typedArrayObtainStyledAttributes.getBoolean(C14584j.f136916x1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            M mU = M.u(g.this.f46088c, attributeSet, C14584j.f136703D1);
            this.f46107i = mU.n(C14584j.f136718G1, 0);
            this.f46108j = (mU.k(C14584j.f136733J1, this.f46101c) & (-65536)) | (mU.k(C14584j.f136737K1, this.f46102d) & 65535);
            this.f46109k = mU.p(C14584j.f136741L1);
            this.f46110l = mU.p(C14584j.f136745M1);
            this.f46111m = mU.n(C14584j.f136708E1, 0);
            this.f46112n = c(mU.o(C14584j.f136749N1));
            this.f46113o = mU.k(C14584j.f136777U1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f46114p = c(mU.o(C14584j.f136753O1));
            this.f46115q = mU.k(C14584j.f136793Y1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (mU.s(C14584j.f136757P1)) {
                this.f46116r = mU.a(C14584j.f136757P1, false) ? 1 : 0;
            } else {
                this.f46116r = this.f46103e;
            }
            this.f46117s = mU.a(C14584j.f136723H1, false);
            this.f46118t = mU.a(C14584j.f136728I1, this.f46104f);
            this.f46119u = mU.a(C14584j.f136713F1, this.f46105g);
            this.f46120v = mU.k(C14584j.f136797Z1, -1);
            this.f46124z = mU.o(C14584j.f136761Q1);
            this.f46121w = mU.n(C14584j.f136765R1, 0);
            this.f46122x = mU.o(C14584j.f136773T1);
            String strO = mU.o(C14584j.f136769S1);
            this.f46123y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f46121w == 0 && this.f46122x == null) {
                this.f46093A = (AbstractC16199a) e(strO, g.f46085f, g.this.f46087b);
            } else {
                if (z10) {
                    FS.log_w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f46093A = null;
            }
            this.f46094B = mU.p(C14584j.f136781V1);
            this.f46095C = mU.p(C14584j.f136802a2);
            if (mU.s(C14584j.f136789X1)) {
                this.f46097E = C5648y.e(mU.k(C14584j.f136789X1, -1), this.f46097E);
            } else {
                this.f46097E = null;
            }
            if (mU.s(C14584j.f136785W1)) {
                this.f46096D = mU.c(C14584j.f136785W1);
            } else {
                this.f46096D = null;
            }
            mU.x();
            this.f46106h = false;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f46084e = clsArr;
        f46085f = clsArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC16199a abstractC16199a = bVar.f46093A;
                            if (abstractC16199a == null || !abstractC16199a.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f46089d == null) {
            this.f46089d = a(this.f46088c);
        }
        return this.f46089d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC13833a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f46088c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.f) {
                    androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) menu;
                    if (fVar.H()) {
                        fVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.f) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.f) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }

    public g(Context context) {
        super(context);
        this.f46088c = context;
        Object[] objArr = {context};
        this.f46086a = objArr;
        this.f46087b = objArr;
    }
}
