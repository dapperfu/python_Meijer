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
class C5962c implements Parcelable {
    public static final Parcelable.Creator<C5962c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final List<String> f55021a;

    /* renamed from: b, reason: collision with root package name */
    final List<C5961b> f55022b;

    /* renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator<C5962c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5962c createFromParcel(Parcel parcel) {
            return new C5962c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5962c[] newArray(int i10) {
            return new C5962c[i10];
        }

        a() {
        }
    }

    C5962c(List<String> list, List<C5961b> list2) {
        this.f55021a = list;
        this.f55022b = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    List<C5960a> a(FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap map2 = new HashMap(this.f55021a.size());
        for (String str : this.f55021a) {
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
        Iterator<C5961b> it = this.f55022b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f55021a);
        parcel.writeTypedList(this.f55022b);
    }

    C5962c(Parcel parcel) {
        this.f55021a = parcel.createStringArrayList();
        this.f55022b = parcel.createTypedArrayList(C5961b.CREATOR);
    }
}
