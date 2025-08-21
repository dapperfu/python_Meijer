package ju;

import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes12.dex */
public class l extends i {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC15068c f141285b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC15068c f141286c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC15068c f141287d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<InterfaceC15068c> f141288e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f141289f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f141290g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f141291h;

    /* renamed from: i, reason: collision with root package name */
    private r f141292i;

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

    public void R(Collection<? extends InterfaceC15068c> collection) {
        T(collection, true);
    }

    public l(InterfaceC15068c interfaceC15068c, Collection<? extends InterfaceC15068c> collection) {
        this.f141288e = new ArrayList<>();
        this.f141289f = false;
        this.f141290g = true;
        this.f141291h = false;
        this.f141292i = new a();
        this.f141285b = interfaceC15068c;
        if (interfaceC15068c != null) {
            interfaceC15068c.c(this);
        }
        h(collection);
    }

    private int A() {
        return this.f141291h ? 1 : 0;
    }

    private int B() {
        InterfaceC15068c interfaceC15068c;
        if (!this.f141291h || (interfaceC15068c = this.f141287d) == null) {
            return 0;
        }
        return interfaceC15068c.a();
    }

    private void C() {
        if (this.f141290g || this.f141291h) {
            int iY = y() + B() + w();
            this.f141290g = false;
            this.f141291h = false;
            q(0, iY);
        }
    }

    private void D() {
        if (!this.f141291h || this.f141287d == null) {
            return;
        }
        this.f141291h = false;
        q(y(), this.f141287d.a());
    }

    private void P() {
        if (this.f141290g) {
            return;
        }
        this.f141290g = true;
        p(0, y());
        p(z(), w());
    }

    private void Q() {
        if (this.f141291h || this.f141287d == null) {
            return;
        }
        this.f141291h = true;
        p(y(), this.f141287d.a());
    }

    private int u() {
        return this.f141291h ? B() : f.b(this.f141288e);
    }

    private int v() {
        return (this.f141286c == null || !this.f141290g) ? 0 : 1;
    }

    private int x() {
        return (this.f141285b == null || !this.f141290g) ? 0 : 1;
    }

    protected boolean E() {
        return this.f141288e.isEmpty() || f.b(this.f141288e) == 0;
    }

    public void L() {
        InterfaceC15068c interfaceC15068c = this.f141286c;
        if (interfaceC15068c == null) {
            return;
        }
        interfaceC15068c.g(this);
        int iW = w();
        this.f141286c = null;
        I(iW);
    }

    public void M(InterfaceC15068c interfaceC15068c) {
        if (interfaceC15068c == null) {
            throw new NullPointerException("Footer can't be null.  Please use removeFooter() instead!");
        }
        InterfaceC15068c interfaceC15068c2 = this.f141286c;
        if (interfaceC15068c2 != null) {
            interfaceC15068c2.g(this);
        }
        int iW = w();
        this.f141286c = interfaceC15068c;
        interfaceC15068c.c(this);
        I(iW);
    }

    public void N(InterfaceC15068c interfaceC15068c) {
        if (interfaceC15068c == null) {
            throw new NullPointerException("Header can't be null.  Please use removeHeader() instead!");
        }
        InterfaceC15068c interfaceC15068c2 = this.f141285b;
        if (interfaceC15068c2 != null) {
            interfaceC15068c2.g(this);
        }
        int iY = y();
        this.f141285b = interfaceC15068c;
        interfaceC15068c.c(this);
        J(iY);
    }

    public void O(boolean z10) {
        if (this.f141289f == z10) {
            return;
        }
        this.f141289f = z10;
        K();
    }

    public void S(Collection<? extends InterfaceC15068c> collection, h.e eVar) {
        super.r(this.f141288e);
        this.f141288e.clear();
        this.f141288e.addAll(collection);
        super.h(collection);
        eVar.b(this.f141292i);
        K();
    }

    public void T(Collection<? extends InterfaceC15068c> collection, boolean z10) {
        S(collection, androidx.recyclerview.widget.h.c(new C15067b(new ArrayList(this.f141288e), collection), z10));
    }

    public void t() {
        if (this.f141288e.isEmpty()) {
            return;
        }
        r(new ArrayList(this.f141288e));
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
        return this.f141286c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y() {
        if (x() == 0) {
            return 0;
        }
        return this.f141285b.a();
    }

    private int z() {
        return u() + y();
    }

    protected void K() {
        if (E()) {
            if (this.f141289f) {
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

    @Override // ju.i, ju.InterfaceC15070e
    public void d(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        super.d(interfaceC15068c, i10, i11);
        K();
    }

    @Override // ju.i, ju.InterfaceC15070e
    public void f(InterfaceC15068c interfaceC15068c, int i10, int i11) {
        super.f(interfaceC15068c, i10, i11);
        K();
    }

    @Override // ju.i
    public void h(Collection<? extends InterfaceC15068c> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.h(collection);
        int iZ = z();
        this.f141288e.addAll(collection);
        p(iZ, f.b(collection));
        K();
    }

    @Override // ju.i
    public InterfaceC15068c i(int i10) {
        if (G() && i10 == 0) {
            return this.f141285b;
        }
        int iX = i10 - x();
        if (H() && iX == 0) {
            return this.f141287d;
        }
        int iA = iX - A();
        if (iA == this.f141288e.size()) {
            if (F()) {
                return this.f141286c;
            }
            throw new IndexOutOfBoundsException("Wanted group at position " + iA + " but there are only " + j() + " groups");
        }
        return this.f141288e.get(iA);
    }

    @Override // ju.i
    public int j() {
        return x() + v() + A() + this.f141288e.size();
    }

    @Override // ju.i
    public int m(InterfaceC15068c interfaceC15068c) {
        if (G() && interfaceC15068c == this.f141285b) {
            return 0;
        }
        int iX = x();
        if (H() && interfaceC15068c == this.f141287d) {
            return iX;
        }
        int iA = iX + A();
        int iIndexOf = this.f141288e.indexOf(interfaceC15068c);
        if (iIndexOf >= 0) {
            return iA + iIndexOf;
        }
        int size = iA + this.f141288e.size();
        if (F() && this.f141286c == interfaceC15068c) {
            return size;
        }
        return -1;
    }

    @Override // ju.i
    public void r(Collection<? extends InterfaceC15068c> collection) {
        if (collection.isEmpty()) {
            return;
        }
        super.r(collection);
        for (InterfaceC15068c interfaceC15068c : collection) {
            int iL = l(interfaceC15068c);
            this.f141288e.remove(interfaceC15068c);
            q(iL, interfaceC15068c.a());
        }
        K();
    }
}
