package pd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import id.C14720c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import md.AbstractC15707a;
import md.C15708b;
import od.C16110f;

/* renamed from: pd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16418a extends AbstractC15707a {
    public static final Parcelable.Creator<C16418a> CREATOR = new f();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f156314e = new Comparator() { // from class: pd.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C14720c c14720c = (C14720c) obj;
            C14720c c14720c2 = (C14720c) obj2;
            Parcelable.Creator<C16418a> creator = C16418a.CREATOR;
            return !c14720c.getName().equals(c14720c2.getName()) ? c14720c.getName().compareTo(c14720c2.getName()) : (c14720c.B() > c14720c2.B() ? 1 : (c14720c.B() == c14720c2.B() ? 0 : -1));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f156315a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f156316b;

    /* renamed from: c, reason: collision with root package name */
    private final String f156317c;

    /* renamed from: d, reason: collision with root package name */
    private final String f156318d;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C16418a)) {
            return false;
        }
        C16418a c16418a = (C16418a) obj;
        return this.f156316b == c16418a.f156316b && C6660q.a(this.f156315a, c16418a.f156315a) && C6660q.a(this.f156317c, c16418a.f156317c) && C6660q.a(this.f156318d, c16418a.f156318d);
    }

    static C16418a b0(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f156314e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((com.google.android.gms.common.api.f) it.next()).a());
        }
        return new C16418a(new ArrayList(treeSet), z10, null, null);
    }

    public List<C14720c> T() {
        return this.f156315a;
    }

    public final int hashCode() {
        return C6660q.b(Boolean.valueOf(this.f156316b), this.f156315a, this.f156317c, this.f156318d);
    }

    public C16418a(List list, boolean z10, String str, String str2) {
        com.google.android.gms.common.internal.r.l(list);
        this.f156315a = list;
        this.f156316b = z10;
        this.f156317c = str;
        this.f156318d = str2;
    }

    public static C16418a B(C16110f c16110f) {
        return b0(c16110f.a(), true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 1, T(), false);
        C15708b.c(parcel, 2, this.f156316b);
        C15708b.w(parcel, 3, this.f156317c, false);
        C15708b.w(parcel, 4, this.f156318d, false);
        C15708b.b(parcel, iA);
    }
}
