package nd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import gd.C14244c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kd.AbstractC15136a;
import kd.C15137b;
import md.C15600f;

/* renamed from: nd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15790a extends AbstractC15136a {
    public static final Parcelable.Creator<C15790a> CREATOR = new f();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f151183e = new Comparator() { // from class: nd.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C14244c c14244c = (C14244c) obj;
            C14244c c14244c2 = (C14244c) obj2;
            Parcelable.Creator<C15790a> creator = C15790a.CREATOR;
            return !c14244c.getName().equals(c14244c2.getName()) ? c14244c.getName().compareTo(c14244c2.getName()) : (c14244c.B() > c14244c2.B() ? 1 : (c14244c.B() == c14244c2.B() ? 0 : -1));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f151184a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f151185b;

    /* renamed from: c, reason: collision with root package name */
    private final String f151186c;

    /* renamed from: d, reason: collision with root package name */
    private final String f151187d;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C15790a)) {
            return false;
        }
        C15790a c15790a = (C15790a) obj;
        return this.f151185b == c15790a.f151185b && C6535q.a(this.f151184a, c15790a.f151184a) && C6535q.a(this.f151186c, c15790a.f151186c) && C6535q.a(this.f151187d, c15790a.f151187d);
    }

    static C15790a c0(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f151183e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((com.google.android.gms.common.api.f) it.next()).a());
        }
        return new C15790a(new ArrayList(treeSet), z10, null, null);
    }

    public List<C14244c> T() {
        return this.f151184a;
    }

    public final int hashCode() {
        return C6535q.b(Boolean.valueOf(this.f151185b), this.f151184a, this.f151186c, this.f151187d);
    }

    public C15790a(List list, boolean z10, String str, String str2) {
        com.google.android.gms.common.internal.r.l(list);
        this.f151184a = list;
        this.f151185b = z10;
        this.f151186c = str;
        this.f151187d = str2;
    }

    public static C15790a B(C15600f c15600f) {
        return c0(c15600f.a(), true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 1, T(), false);
        C15137b.c(parcel, 2, this.f151185b);
        C15137b.w(parcel, 3, this.f151186c, false);
        C15137b.w(parcel, 4, this.f151187d, false);
        C15137b.b(parcel, iA);
    }
}
