package nu;

import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes11.dex */
public class l extends i {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC15948c f152835b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC15948c f152836c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC15948c f152837d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<InterfaceC15948c> f152838e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f152839f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f152840g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f152841h;

    /* renamed from: i, reason: collision with root package name */
    private r f152842i;

    class a implements r {
        a() {
        }

        @Override // androidx.recyclerview.widget.r
        public void a(int i10, int i11) {
            l lVar = l.this;
            lVar.p(lVar.y() + i10, i11);
        }

        @Override // androidx.recyclerview.widget.r
        public void b(int i10, int i11) {
            l lVar = l.this;
            lVar.q(lVar.y() + i10, i11);
        }

        @Override // androidx.recyclerview.widget.r
        public void c(int i10, int i11, Object obj) {
            l lVar = l.this;
            lVar.o(lVar.y() + i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.r
        public void d(int i10, int i11) {
            int iY = l.this.y();
            l.this.n(i10 + iY, iY + i11);
        }
    }

    public l() {
        this(null, new ArrayList());
    }

    public void R(Collection<? extends InterfaceC15948c> collection) {
        T(collection, true);
    }

    public l(InterfaceC15948c interfaceC15948c, Collection<? extends InterfaceC15948c> collection) {
        this.f152838e = new ArrayList<>();
        this.f152839f = false;
        this.f152840g = true;
        this.f152841h = false;
        this.f152842i = new a();
        this.f152835b = interfaceC15948c;
        if (interfaceC15948c != null) {
            interfaceC15948c.c(this);
        }
        h(collection);
    }

    private int A() {
        return this.f152841h ? 1 : 0;
    }

    private int B() {
        InterfaceC15948c interfaceC15948c;
        if (!this.f152841h || (interfaceC15948c = this.f152837d) == null) {
            return 0;
        }
        return interfaceC15948c.a();
    }

    private void C() {
        if (this.f152840g || this.f152841h) {
            int iY = y() + B() + w();
            this.f152840g = false;
            this.f152841h = false;
            q(0, iY);
        }
    }

    private void D() {
        if (!this.f152841h || this.f152837d == null) {
            return;
        }
        this.f152841h = false;
        q(y(), this.f152837d.a());
    }

    private void P() {
        if (this.f152840g) {
            return;
        }
        this.f152840g = true;
        p(0, y());
        p(z(), w());
    }

    private void Q() {
        if (this.f152841h || this.f152837d == null) {
            return;
        }
        this.f152841h = true;
        p(y(), this.f152837d.a());
    }

    private int u() {
        return this.f152841h ? B() : f.b(this.f152838e);
    }

    private int v() {
        return (this.f152836c == null || !this.f152840g) ? 0 : 1;
    }

    private int x() {
        return (this.f152835b == null || !this.f152840g) ? 0 : 1;
    }

    protected boolean E() {
        return this.f152838e.isEmpty() || f.b(this.f152838e) == 0;
    }

    public void L() {
        InterfaceC15948c interfaceC15948c = this.f152836c;
        if (interfaceC15948c == null) {
            return;
        }
        interfaceC15948c.f(this);
        int iW = w();
        this.f152836c = null;
        I(iW);
    }

    public void M(InterfaceC15948c interfaceC15948c) {
        if (interfaceC15948c == null) {
            throw new NullPointerException("Footer can't be null.  Please use removeFooter() instead!");
        }
        InterfaceC15948c interfaceC15948c2 = this.f152836c;
        if (interfaceC15948c2 != null) {
            interfaceC15948c2.f(this);
        }
        int iW = w();
        this.f152836c = interfaceC15948c;
        interfaceC15948c.c(this);
        I(iW);
    }

    public void N(InterfaceC15948c interfaceC15948c) {
        if (interfaceC15948c == null) {
            throw new NullPointerException("Header can't be null.  Please use removeHeader() instead!");
        }
        InterfaceC15948c interfaceC15948c2 = this.f152835b;
        if (interfaceC15948c2 != null) {
            interfaceC15948c2.f(this);
        }
        int iY = y();
        this.f152835b = interfaceC15948c;
        interfaceC15948c.c(this);
        J(iY);
    }

    public void O(boolean z10) {
        if (this.f152839f == z10) {
            return;
        }
        this.f152839f = z10;
        K();
    }

    public void S(Collection<? extends InterfaceC15948c> collection, h.e eVar) {
        super.r(this.f152838e);
        this.f152838e.clear();
        this.f152838e.addAll(collection);
        super.h(collection);
        eVar.b(this.f152842i);
        K();
    }

    public void T(Collection<? extends InterfaceC15948c> collection, boolean z10) {
        S(collection, androidx.recyclerview.widget.h.c(new C15947b(new ArrayList(this.f152838e), collection), z10));
    }

    public void t() {
        if (this.f152838e.isEmpty()) {
            return;
        }
        r(new ArrayList(this.f152838e));
    }

    private boolean F() {
        if (v() > 0) {
            return true;
        }
        return false;
    }

    private boolean G() {
        if (x() > 0) {
            return true;
        }
        return false;
    }

    private boolean H() {
        if (A() > 0) {
            return true;
        }
        return false;
    }

    private void I(int i10) {
        int iW = w();
        if (i10 > 0) {
            q(z(), i10);
        }
        if (iW > 0) {
            p(z(), iW);
        }
    }

    private void J(int i10) {
        int iY = y();
        if (i10 > 0) {
            q(0, i10);
        }
        if (iY > 0) {
            p(0, iY);
        }
    }

    private int w() {
        if (v() == 0) {
            return 0;
        }
        return this.f152836c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y() {
        if (x() == 0) {
            return 0;
        }
        return this.f152835b.a();
    }

    private int z() {
        return u() + y();
    }

    protected void K() {
        if (E()) {
            if (this.f152839f) {
                C();
                return;
            } else {
                Q();
                P();
                return;
            }
        }
        D();
        P();
    }

    @Override // nu.i, nu.InterfaceC15950e
    public void d(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        super.d(interfaceC15948c, i10, i11);
        K();
    }

    @Override // nu.i, nu.InterfaceC15950e
    public void g(InterfaceC15948c interfaceC15948c, int i10, int i11) {
        super.g(interfaceC15948c, i10, i11);
        K();
    }

    @Override // nu.i
    public void h(Collection<? extends InterfaceC15948c> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.h(collection);
        int iZ = z();
        this.f152838e.addAll(collection);
        p(iZ, f.b(collection));
        K();
    }

    @Override // nu.i
    public InterfaceC15948c i(int i10) {
        if (G() && i10 == 0) {
            return this.f152835b;
        }
        int iX = i10 - x();
        if (H() && iX == 0) {
            return this.f152837d;
        }
        int iA = iX - A();
        if (iA == this.f152838e.size()) {
            if (F()) {
                return this.f152836c;
            }
            throw new IndexOutOfBoundsException("Wanted group at position " + iA + " but there are only " + j() + " groups");
        }
        return this.f152838e.get(iA);
    }

    @Override // nu.i
    public int j() {
        return x() + v() + A() + this.f152838e.size();
    }

    @Override // nu.i
    public int m(InterfaceC15948c interfaceC15948c) {
        if (G() && interfaceC15948c == this.f152835b) {
            return 0;
        }
        int iX = x();
        if (H() && interfaceC15948c == this.f152837d) {
            return iX;
        }
        int iA = iX + A();
        int iIndexOf = this.f152838e.indexOf(interfaceC15948c);
        if (iIndexOf >= 0) {
            return iA + iIndexOf;
        }
        int size = iA + this.f152838e.size();
        if (F() && this.f152836c == interfaceC15948c) {
            return size;
        }
        return -1;
    }

    @Override // nu.i
    public void r(Collection<? extends InterfaceC15948c> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.r(collection);
        for (InterfaceC15948c interfaceC15948c : collection) {
            int iL = l(interfaceC15948c);
            this.f152838e.remove(interfaceC15948c);
            q(iL, interfaceC15948c.a());
        }
        K();
    }
}
