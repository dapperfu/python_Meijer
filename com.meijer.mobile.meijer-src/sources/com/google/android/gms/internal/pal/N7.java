package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class N7 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f83631a;

    /* renamed from: c, reason: collision with root package name */
    private O7 f83633c;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap f83632b = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private C10724ab f83634d = C10724ab.f83892b;

    public final N7 a(Object obj, Ed ed2) throws GeneralSecurityException {
        e(obj, ed2, true);
        return this;
    }

    public final N7 b(Object obj, Ed ed2) throws GeneralSecurityException {
        e(obj, ed2, false);
        return this;
    }

    private final N7 e(Object obj, Ed ed2, boolean z10) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.f83632b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (ed2.E() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentMap concurrentMap = this.f83632b;
        Integer numValueOf = Integer.valueOf(ed2.t());
        if (ed2.G() == 5) {
            numValueOf = null;
        }
        AbstractC11028t7 abstractC11028t7A = C10840ha.b().a(C10984qa.e(ed2.u().z(), ed2.u().y(), ed2.u().u(), ed2.G(), numValueOf), C10721a8.a());
        L7 s72 = abstractC11028t7A instanceof C10723aa ? new S7(ed2.u().z(), ed2.G(), null) : abstractC11028t7A.a();
        int iG = ed2.G() - 2;
        if (iG == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(ed2.t()).array();
        } else if (iG == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(ed2.t()).array();
        } else if (iG != 3) {
            if (iG != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(ed2.t()).array();
        } else {
            bArrArray = C10933n7.f84079a;
        }
        O7 o72 = new O7(obj, bArrArray, ed2.E(), ed2.G(), ed2.t(), abstractC11028t7A, s72);
        ArrayList arrayList = new ArrayList();
        arrayList.add(o72);
        Q7 q72 = new Q7(o72.d(), null);
        List list = (List) concurrentMap.put(q72, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(o72);
            concurrentMap.put(q72, Collections.unmodifiableList(arrayList2));
        }
        if (!z10) {
            return this;
        }
        if (this.f83633c != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.f83633c = o72;
        return this;
    }

    public final N7 c(C10724ab c10724ab) {
        if (this.f83632b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f83634d = c10724ab;
        return this;
    }

    public final V7 d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f83632b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        V7 v72 = new V7(concurrentMap, this.f83633c, this.f83634d, this.f83631a, null);
        this.f83632b = null;
        return v72;
    }

    /* synthetic */ N7(Class cls, M7 m72) {
        this.f83631a = cls;
    }
}
