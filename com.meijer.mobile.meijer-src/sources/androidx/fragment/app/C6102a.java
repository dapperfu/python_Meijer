package androidx.fragment.app;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.S;
import androidx.view.AbstractC6165l;
import com.fullstory.FS;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6102a extends S implements FragmentManager.k, FragmentManager.q {

    /* renamed from: t, reason: collision with root package name */
    final FragmentManager f55193t;

    /* renamed from: u, reason: collision with root package name */
    boolean f55194u;

    /* renamed from: v, reason: collision with root package name */
    int f55195v;

    /* renamed from: w, reason: collision with root package name */
    boolean f55196w;

    C6102a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().getContext().getClassLoader() : null);
        this.f55195v = -1;
        this.f55196w = false;
        this.f55193t = fragmentManager;
    }

    public void B(String str, PrintWriter printWriter) {
        C(str, printWriter, true);
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean a(ArrayList<C6102a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f55137i) {
            return true;
        }
        this.f55193t.addBackStackState(this);
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
        if (this.f55194u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Y(FragmentManager.TAG));
            B("  ", printWriter);
            printWriter.close();
        }
        this.f55194u = true;
        if (this.f55137i) {
            this.f55195v = this.f55193t.allocBackStackIndex();
        } else {
            this.f55195v = -1;
        }
        if (z11) {
            this.f55193t.enqueueAction(this, z10);
        }
        return this.f55195v;
    }

    public void C(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f55139k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f55195v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f55194u);
            if (this.f55136h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f55136h));
            }
            if (this.f55132d != 0 || this.f55133e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f55132d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f55133e));
            }
            if (this.f55134f != 0 || this.f55135g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f55134f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f55135g));
            }
            if (this.f55140l != 0 || this.f55141m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f55140l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f55141m);
            }
            if (this.f55142n != 0 || this.f55143o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f55142n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f55143o);
            }
        }
        if (this.f55131c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f55131c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = this.f55131c.get(i10);
            switch (aVar.f55148a) {
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
                    str2 = "cmd=" + aVar.f55148a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f55149b);
            if (z10) {
                if (aVar.f55151d != 0 || aVar.f55152e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f55151d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f55152e));
                }
                if (aVar.f55153f != 0 || aVar.f55154g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f55153f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f55154g));
                }
            }
        }
    }

    void D() {
        int size = this.f55131c.size();
        for (int i10 = 0; i10 < size; i10++) {
            S.a aVar = this.f55131c.get(i10);
            Fragment fragment = aVar.f55149b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f55196w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f55136h);
                fragment.setSharedElementNames(this.f55144p, this.f55145q);
            }
            switch (aVar.f55148a) {
                case 1:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.setExitAnimationOrder(fragment, false);
                    this.f55193t.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f55148a);
                case 3:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.setExitAnimationOrder(fragment, false);
                    this.f55193t.showFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.setExitAnimationOrder(fragment, false);
                    this.f55193t.attachFragment(fragment);
                    break;
                case 8:
                    this.f55193t.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.f55193t.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.f55193t.setMaxLifecycle(fragment, aVar.f55156i);
                    break;
            }
        }
    }

    void E() {
        for (int size = this.f55131c.size() - 1; size >= 0; size--) {
            S.a aVar = this.f55131c.get(size);
            Fragment fragment = aVar.f55149b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f55196w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.reverseTransit(this.f55136h));
                fragment.setSharedElementNames(this.f55145q, this.f55144p);
            }
            switch (aVar.f55148a) {
                case 1:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.setExitAnimationOrder(fragment, true);
                    this.f55193t.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f55148a);
                case 3:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.addFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.showFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.setExitAnimationOrder(fragment, true);
                    this.f55193t.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f55151d, aVar.f55152e, aVar.f55153f, aVar.f55154g);
                    this.f55193t.setExitAnimationOrder(fragment, true);
                    this.f55193t.detachFragment(fragment);
                    break;
                case 8:
                    this.f55193t.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.f55193t.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.f55193t.setMaxLifecycle(fragment, aVar.f55155h);
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
            java.util.ArrayList<androidx.fragment.app.S$a> r5 = r0.f55131c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList<androidx.fragment.app.S$a> r5 = r0.f55131c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.S$a r5 = (androidx.fragment.app.S.a) r5
            int r6 = r5.f55148a
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
            java.util.ArrayList<androidx.fragment.app.S$a> r6 = r0.f55131c
            androidx.fragment.app.S$a r8 = new androidx.fragment.app.S$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f55150c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f55149b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f55149b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f55149b
            if (r5 != r3) goto Lbb
            java.util.ArrayList<androidx.fragment.app.S$a> r3 = r0.f55131c
            androidx.fragment.app.S$a r6 = new androidx.fragment.app.S$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f55149b
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
            java.util.ArrayList<androidx.fragment.app.S$a> r3 = r0.f55131c
            androidx.fragment.app.S$a r15 = new androidx.fragment.app.S$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.S$a r15 = new androidx.fragment.app.S$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f55151d
            r15.f55151d = r2
            int r2 = r5.f55153f
            r15.f55153f = r2
            int r2 = r5.f55152e
            r15.f55152e = r2
            int r2 = r5.f55154g
            r15.f55154g = r2
            java.util.ArrayList<androidx.fragment.app.S$a> r2 = r0.f55131c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.S$a> r2 = r0.f55131c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f55148a = r7
            r5.f55150c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f55149b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C6102a.F(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String G() {
        return this.f55139k;
    }

    public void H() {
        if (this.f55147s != null) {
            for (int i10 = 0; i10 < this.f55147s.size(); i10++) {
                this.f55147s.get(i10).run();
            }
            this.f55147s = null;
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
            java.util.ArrayList<androidx.fragment.app.S$a> r0 = r5.f55131c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.S$a> r2 = r5.f55131c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.S$a r2 = (androidx.fragment.app.S.a) r2
            int r3 = r2.f55148a
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
            androidx.lifecycle.l$b r3 = r2.f55155h
            r2.f55156i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f55149b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f55149b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f55149b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C6102a.I(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.S
    public S m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f55193t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.S
    public boolean p() {
        return this.f55131c.isEmpty();
    }

    @Override // androidx.fragment.app.S
    public S q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f55193t) {
            return super.q(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f55195v >= 0) {
            sb2.append(" #");
            sb2.append(this.f55195v);
        }
        if (this.f55139k != null) {
            sb2.append(" ");
            sb2.append(this.f55139k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.S
    public S w(Fragment fragment, AbstractC6165l.b bVar) {
        if (fragment.mFragmentManager != this.f55193t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f55193t);
        }
        if (bVar == AbstractC6165l.b.f55500b && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC6165l.b.f55499a) {
            return super.w(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    void y(int i10) {
        if (this.f55137i) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f55131c.size();
            for (int i11 = 0; i11 < size; i11++) {
                S.a aVar = this.f55131c.get(i11);
                Fragment fragment = aVar.f55149b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "Bump nesting of " + aVar.f55149b + " to " + aVar.f55149b.mBackStackNesting);
                    }
                }
            }
        }
    }

    void z() {
        int size = this.f55131c.size() - 1;
        while (size >= 0) {
            S.a aVar = this.f55131c.get(size);
            if (aVar.f55150c) {
                if (aVar.f55148a == 8) {
                    aVar.f55150c = false;
                    this.f55131c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f55149b.mContainerId;
                    aVar.f55148a = 2;
                    aVar.f55150c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        S.a aVar2 = this.f55131c.get(i11);
                        if (aVar2.f55150c && aVar2.f55149b.mContainerId == i10) {
                            this.f55131c.remove(i11);
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
        this.f55193t.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.S
    public void k() {
        n();
        this.f55193t.execSingleAction(this, true);
    }

    @Override // androidx.fragment.app.S
    void o(int i10, Fragment fragment, String str, int i11) {
        super.o(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f55193t;
    }

    C6102a(C6102a c6102a) {
        super(c6102a.f55193t.getFragmentFactory(), c6102a.f55193t.getHost() != null ? c6102a.f55193t.getHost().getContext().getClassLoader() : null, c6102a);
        this.f55195v = -1;
        this.f55196w = false;
        this.f55193t = c6102a.f55193t;
        this.f55194u = c6102a.f55194u;
        this.f55195v = c6102a.f55195v;
        this.f55196w = c6102a.f55196w;
    }
}
