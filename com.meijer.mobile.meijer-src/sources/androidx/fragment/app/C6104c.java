package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6104c implements Parcelable {
    public static final Parcelable.Creator<C6104c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final List<String> f55245a;

    /* renamed from: b, reason: collision with root package name */
    final List<C6103b> f55246b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator<C6104c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6104c createFromParcel(Parcel parcel) {
            return new C6104c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6104c[] newArray(int i10) {
            return new C6104c[i10];
        }

        a() {
        }
    }

    C6104c(List<String> list, List<C6103b> list2) {
        this.f55245a = list;
        this.f55246b = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    List<C6102a> a(FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap map2 = new HashMap(this.f55245a.size());
        for (String str : this.f55245a) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle bundleC = fragmentManager.getFragmentStore().C(str, null);
                if (bundleC != null) {
                    ClassLoader classLoader = fragmentManager.getHost().getContext().getClassLoader();
                    Fragment fragmentA = ((N) bundleC.getParcelable("state")).a(fragmentManager.getFragmentFactory(), classLoader);
                    fragmentA.mSavedFragmentState = bundleC;
                    if (bundleC.getBundle("savedInstanceState") == null) {
                        fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleC.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    fragmentA.setArguments(bundle);
                    map2.put(fragmentA.mWho, fragmentA);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C6103b> it = this.f55246b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f55245a);
        parcel.writeTypedList(this.f55246b);
    }

    C6104c(Parcel parcel) {
        this.f55245a = parcel.createStringArrayList();
        this.f55246b = parcel.createTypedArrayList(C6103b.CREATOR);
    }
}
