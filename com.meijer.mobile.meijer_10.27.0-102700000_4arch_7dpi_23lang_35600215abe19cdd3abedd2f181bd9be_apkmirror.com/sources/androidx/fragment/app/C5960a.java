package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.S;
import androidx.view.AbstractC6023l;
import com.fullstory.FS;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5960a extends S implements FragmentManager.k, FragmentManager.q {

    /* renamed from: t, reason: collision with root package name */
    final FragmentManager f54969t;

    /* renamed from: u, reason: collision with root package name */
    boolean f54970u;

    /* renamed from: v, reason: collision with root package name */
    int f54971v;

    /* renamed from: w, reason: collision with root package name */
    boolean f54972w;

    C5960a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().getContext().getClassLoader() : null);
        this.f54971v = -1;
        this.f54972w = false;
        this.f54969t = fragmentManager;
    }

    public void B(String str, PrintWriter printWriter) {
        C(str, printWriter, true);
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f54913i) {
            return true;
        }
        this.f54969t.addBackStackState(this);
        return true;
    }

    @Override // androidx.fragment.app.S
    public int h() {
        return A(false, true);
    }

    @Override // androidx.fragment.app.S
    public int i() {
        return A(true, true);
    }

    int A(boolean z10, boolean z11) {
        if (this.f54970u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y(FragmentManager.TAG));
            B("  ", printWriter);
            printWriter.close();
        }
        this.f54970u = true;
        if (this.f54913i) {
            this.f54971v = this.f54969t.allocBackStackIndex();
        } else {
            this.f54971v = -1;
        }
        if (z11) {
            this.f54969t.enqueueAction(this, z10);
        }
        return this.f54971v;
    }

    public void C(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f54915k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f54971v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f54970u);
            if (this.f54912h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f54912h));
            }
            if (this.f54908d != 0 || this.f54909e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f54908d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f54909e));
            }
            if (this.f54910f != 0 || this.f54911g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f54910f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f54911g));
            }
            if (this.f54916l != 0 || this.f54917m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f54916l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f54917m);
            }
            if (this.f54918n != 0 || this.f54919o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f54918n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f54919o);
            }
        }
        if (this.f54907c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f54907c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = this.f54907c.get(i10);
            switch (aVar.f54924a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f54924a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f54925b);
            if (z10) {
                if (aVar.f54927d != 0 || aVar.f54928e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f54927d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f54928e));
                }
                if (aVar.f54929f != 0 || aVar.f54930g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f54929f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f54930g));
                }
            }
        }
    }

    void D() {
        int size = this.f54907c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = this.f54907c.get(i10);
            Fragment fragment = aVar.f54925b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f54972w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f54912h);
                fragment.setSharedElementNames(this.f54920p, this.f54921q);
            }
            switch (aVar.f54924a) {
                case 1:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.setExitAnimationOrder(fragment, false);
                    this.f54969t.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f54924a);
                case 3:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.setExitAnimationOrder(fragment, false);
                    this.f54969t.showFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.setExitAnimationOrder(fragment, false);
                    this.f54969t.attachFragment(fragment);
                    break;
                case 8:
                    this.f54969t.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.f54969t.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.f54969t.setMaxLifecycle(fragment, aVar.f54932i);
                    break;
            }
        }
    }

    void E() {
        for (int size = this.f54907c.size() - 1; size >= 0; size--) {
            S.a aVar = this.f54907c.get(size);
            Fragment fragment = aVar.f54925b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f54972w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.reverseTransit(this.f54912h));
                fragment.setSharedElementNames(this.f54921q, this.f54920p);
            }
            switch (aVar.f54924a) {
                case 1:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.setExitAnimationOrder(fragment, true);
                    this.f54969t.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f54924a);
                case 3:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.addFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.showFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.setExitAnimationOrder(fragment, true);
                    this.f54969t.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f54927d, aVar.f54928e, aVar.f54929f, aVar.f54930g);
                    this.f54969t.setExitAnimationOrder(fragment, true);
                    this.f54969t.detachFragment(fragment);
                    break;
                case 8:
                    this.f54969t.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.f54969t.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.f54969t.setMaxLifecycle(fragment, aVar.f54931h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment F(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.S$a> r5 = r0.f54907c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList<androidx.fragment.app.S$a> r5 = r0.f54907c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.S$a r5 = (androidx.fragment.app.S.a) r5
            int r6 = r5.f54924a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList<androidx.fragment.app.S$a> r6 = r0.f54907c
            androidx.fragment.app.S$a r8 = new androidx.fragment.app.S$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f54926c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f54925b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f54925b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f54925b
            if (r5 != r3) goto Lbb
            java.util.ArrayList<androidx.fragment.app.S$a> r3 = r0.f54907c
            androidx.fragment.app.S$a r6 = new androidx.fragment.app.S$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f54925b
            int r8 = r6.mContainerId
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList<androidx.fragment.app.S$a> r3 = r0.f54907c
            androidx.fragment.app.S$a r15 = new androidx.fragment.app.S$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.S$a r15 = new androidx.fragment.app.S$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f54927d
            r15.f54927d = r2
            int r2 = r5.f54929f
            r15.f54929f = r2
            int r2 = r5.f54928e
            r15.f54928e = r2
            int r2 = r5.f54930g
            r15.f54930g = r2
            java.util.ArrayList<androidx.fragment.app.S$a> r2 = r0.f54907c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.S$a> r2 = r0.f54907c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f54924a = r7
            r5.f54926c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f54925b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5960a.F(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String G() {
        return this.f54915k;
    }

    public void H() {
        if (this.f54923s != null) {
            for (int i10 = 0; i10 < this.f54923s.size(); i10++) {
                this.f54923s.get(i10).run();
            }
            this.f54923s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment I(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.S$a> r0 = r5.f54907c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.S$a> r2 = r5.f54907c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.S$a r2 = (androidx.fragment.app.S.a) r2
            int r3 = r2.f54924a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.l$b r3 = r2.f54931h
            r2.f54932i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f54925b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f54925b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f54925b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5960a.I(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.S
    public S m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f54969t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.S
    public boolean p() {
        return this.f54907c.isEmpty();
    }

    @Override // androidx.fragment.app.S
    public S q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f54969t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f54971v >= 0) {
            sb2.append(" #");
            sb2.append(this.f54971v);
        }
        if (this.f54915k != null) {
            sb2.append(" ");
            sb2.append(this.f54915k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.S
    public S w(Fragment fragment, AbstractC6023l.b bVar) {
        if (fragment.mFragmentManager != this.f54969t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f54969t);
        }
        if (bVar == AbstractC6023l.b.f55276b && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC6023l.b.f55275a) {
            return super.w(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    void y(int i10) {
        if (this.f54913i) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f54907c.size();
            for (int i11 = 0; i11 < size; i11++) {
                S.a aVar = this.f54907c.get(i11);
                Fragment fragment = aVar.f54925b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Bump nesting of " + aVar.f54925b + " to " + aVar.f54925b.mBackStackNesting);
                    }
                }
            }
        }
    }

    void z() {
        int size = this.f54907c.size() - 1;
        while (size >= 0) {
            S.a aVar = this.f54907c.get(size);
            if (aVar.f54926c) {
                if (aVar.f54924a == 8) {
                    aVar.f54926c = false;
                    this.f54907c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f54925b.mContainerId;
                    aVar.f54924a = 2;
                    aVar.f54926c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        S.a aVar2 = this.f54907c.get(i11);
                        if (aVar2.f54926c && aVar2.f54925b.mContainerId == i10) {
                            this.f54907c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.S
    public void j() {
        n();
        this.f54969t.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.S
    public void k() {
        n();
        this.f54969t.execSingleAction(this, true);
    }

    @Override // androidx.fragment.app.S
    void o(int i10, Fragment fragment, String str, int i11) {
        super.o(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f54969t;
    }

    C5960a(C5960a c5960a) {
        super(c5960a.f54969t.getFragmentFactory(), c5960a.f54969t.getHost() != null ? c5960a.f54969t.getHost().getContext().getClassLoader() : null, c5960a);
        this.f54971v = -1;
        this.f54972w = false;
        this.f54969t = c5960a.f54969t;
        this.f54970u = c5960a.f54970u;
        this.f54971v = c5960a.f54971v;
        this.f54972w = c5960a.f54972w;
    }
}
