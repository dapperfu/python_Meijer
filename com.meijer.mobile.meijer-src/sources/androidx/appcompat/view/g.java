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
import androidx.appcompat.widget.C5790y;
import androidx.appcompat.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import f2.InterfaceMenuC13943a;
import i.C14587j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p2.AbstractC16344a;
import p2.C16391y;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class<?>[] f46308e;

    /* renamed from: f, reason: collision with root package name */
    static final Class<?>[] f46309f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f46310a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f46311b;

    /* renamed from: c, reason: collision with root package name */
    Context f46312c;

    /* renamed from: d, reason: collision with root package name */
    private Object f46313d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?>[] f46314c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f46315a;

        /* renamed from: b, reason: collision with root package name */
        private Method f46316b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.f46316b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f46316b.invoke(this.f46315a, menuItem)).booleanValue();
                }
                this.f46316b.invoke(this.f46315a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }

        public a(Object obj, String str) {
            this.f46315a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f46316b = cls.getMethod(str, f46314c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
    }

    private class b {

        /* renamed from: A, reason: collision with root package name */
        AbstractC16344a f46317A;

        /* renamed from: B, reason: collision with root package name */
        private CharSequence f46318B;

        /* renamed from: C, reason: collision with root package name */
        private CharSequence f46319C;

        /* renamed from: D, reason: collision with root package name */
        private ColorStateList f46320D = null;

        /* renamed from: E, reason: collision with root package name */
        private PorterDuff.Mode f46321E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f46323a;

        /* renamed from: b, reason: collision with root package name */
        private int f46324b;

        /* renamed from: c, reason: collision with root package name */
        private int f46325c;

        /* renamed from: d, reason: collision with root package name */
        private int f46326d;

        /* renamed from: e, reason: collision with root package name */
        private int f46327e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f46328f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f46329g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f46330h;

        /* renamed from: i, reason: collision with root package name */
        private int f46331i;

        /* renamed from: j, reason: collision with root package name */
        private int f46332j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f46333k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f46334l;

        /* renamed from: m, reason: collision with root package name */
        private int f46335m;

        /* renamed from: n, reason: collision with root package name */
        private char f46336n;

        /* renamed from: o, reason: collision with root package name */
        private int f46337o;

        /* renamed from: p, reason: collision with root package name */
        private char f46338p;

        /* renamed from: q, reason: collision with root package name */
        private int f46339q;

        /* renamed from: r, reason: collision with root package name */
        private int f46340r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f46341s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f46342t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f46343u;

        /* renamed from: v, reason: collision with root package name */
        private int f46344v;

        /* renamed from: w, reason: collision with root package name */
        private int f46345w;

        /* renamed from: x, reason: collision with root package name */
        private String f46346x;

        /* renamed from: y, reason: collision with root package name */
        private String f46347y;

        /* renamed from: z, reason: collision with root package name */
        private String f46348z;

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f46330h = true;
            i(this.f46323a.add(this.f46324b, this.f46331i, this.f46332j, this.f46333k));
        }

        public SubMenu b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            this.f46330h = true;
            SubMenu subMenuAddSubMenu = this.f46323a.addSubMenu(this.f46324b, this.f46331i, this.f46332j, this.f46333k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public void h() {
            this.f46324b = 0;
            this.f46325c = 0;
            this.f46326d = 0;
            this.f46327e = 0;
            this.f46328f = true;
            this.f46329g = true;
        }

        public b(Menu menu) {
            this.f46323a = menu;
            h();
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f46312c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                FS.log_w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            boolean z10 = false;
            menuItem.setChecked(this.f46341s).setVisible(this.f46342t).setEnabled(this.f46343u).setCheckable(this.f46340r >= 1).setTitleCondensed(this.f46334l).setIcon(this.f46335m);
            int i10 = this.f46344v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f46348z != null) {
                if (g.this.f46312c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f46348z));
            }
            if (this.f46340r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).t(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).h(true);
                }
            }
            String str = this.f46346x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f46308e, g.this.f46310a));
                z10 = true;
            }
            int i11 = this.f46345w;
            if (i11 > 0) {
                if (z10) {
                    FS.log_w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC16344a abstractC16344a = this.f46317A;
            if (abstractC16344a != null) {
                C16391y.a(menuItem, abstractC16344a);
            }
            C16391y.c(menuItem, this.f46318B);
            C16391y.g(menuItem, this.f46319C);
            C16391y.b(menuItem, this.f46336n, this.f46337o);
            C16391y.f(menuItem, this.f46338p, this.f46339q);
            PorterDuff.Mode mode = this.f46321E;
            if (mode != null) {
                C16391y.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f46320D;
            if (colorStateList != null) {
                C16391y.d(menuItem, colorStateList);
            }
        }

        public boolean d() {
            return this.f46330h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f46312c.obtainStyledAttributes(attributeSet, C14587j.f136668w1);
            this.f46324b = typedArrayObtainStyledAttributes.getResourceId(C14587j.f136678y1, 0);
            this.f46325c = typedArrayObtainStyledAttributes.getInt(C14587j.f136445A1, 0);
            this.f46326d = typedArrayObtainStyledAttributes.getInt(C14587j.f136450B1, 0);
            this.f46327e = typedArrayObtainStyledAttributes.getInt(C14587j.f136455C1, 0);
            this.f46328f = typedArrayObtainStyledAttributes.getBoolean(C14587j.f136683z1, true);
            this.f46329g = typedArrayObtainStyledAttributes.getBoolean(C14587j.f136673x1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            M mU = M.u(g.this.f46312c, attributeSet, C14587j.f136460D1);
            this.f46331i = mU.n(C14587j.f136475G1, 0);
            this.f46332j = (mU.k(C14587j.f136490J1, this.f46325c) & (-65536)) | (mU.k(C14587j.f136494K1, this.f46326d) & 65535);
            this.f46333k = mU.p(C14587j.f136498L1);
            this.f46334l = mU.p(C14587j.f136502M1);
            this.f46335m = mU.n(C14587j.f136465E1, 0);
            this.f46336n = c(mU.o(C14587j.f136506N1));
            this.f46337o = mU.k(C14587j.f136534U1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f46338p = c(mU.o(C14587j.f136510O1));
            this.f46339q = mU.k(C14587j.f136550Y1, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (mU.s(C14587j.f136514P1)) {
                this.f46340r = mU.a(C14587j.f136514P1, false) ? 1 : 0;
            } else {
                this.f46340r = this.f46327e;
            }
            this.f46341s = mU.a(C14587j.f136480H1, false);
            this.f46342t = mU.a(C14587j.f136485I1, this.f46328f);
            this.f46343u = mU.a(C14587j.f136470F1, this.f46329g);
            this.f46344v = mU.k(C14587j.f136554Z1, -1);
            this.f46348z = mU.o(C14587j.f136518Q1);
            this.f46345w = mU.n(C14587j.f136522R1, 0);
            this.f46346x = mU.o(C14587j.f136530T1);
            String strO = mU.o(C14587j.f136526S1);
            this.f46347y = strO;
            boolean z10 = strO != null;
            if (z10 && this.f46345w == 0 && this.f46346x == null) {
                this.f46317A = (AbstractC16344a) e(strO, g.f46309f, g.this.f46311b);
            } else {
                if (z10) {
                    FS.log_w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f46317A = null;
            }
            this.f46318B = mU.p(C14587j.f136538V1);
            this.f46319C = mU.p(C14587j.f136559a2);
            if (mU.s(C14587j.f136546X1)) {
                this.f46321E = C5790y.e(mU.k(C14587j.f136546X1, -1), this.f46321E);
            } else {
                this.f46321E = null;
            }
            if (mU.s(C14587j.f136542W1)) {
                this.f46320D = mU.c(C14587j.f136542W1);
            } else {
                this.f46320D = null;
            }
            mU.x();
            this.f46330h = false;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f46308e = clsArr;
        f46309f = clsArr;
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
                            AbstractC16344a abstractC16344a = bVar.f46317A;
                            if (abstractC16344a == null || !abstractC16344a.a()) {
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
        if (this.f46313d == null) {
            this.f46313d = a(this.f46312c);
        }
        return this.f46313d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC13943a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f46312c.getResources().getLayout(i10);
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
        this.f46312c = context;
        Object[] objArr = {context};
        this.f46310a = objArr;
        this.f46311b = objArr;
    }
}
