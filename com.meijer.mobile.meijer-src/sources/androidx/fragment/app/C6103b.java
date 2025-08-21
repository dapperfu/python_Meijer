package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.S;
import androidx.view.AbstractC6165l;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6103b implements Parcelable {
    public static final Parcelable.Creator<C6103b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f55199a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<String> f55200b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f55201c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f55202d;

    /* renamed from: e, reason: collision with root package name */
    final int f55203e;

    /* renamed from: f, reason: collision with root package name */
    final String f55204f;

    /* renamed from: g, reason: collision with root package name */
    final int f55205g;

    /* renamed from: h, reason: collision with root package name */
    final int f55206h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f55207i;

    /* renamed from: j, reason: collision with root package name */
    final int f55208j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f55209k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList<String> f55210l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList<String> f55211m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f55212n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator<C6103b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6103b createFromParcel(Parcel parcel) {
            return new C6103b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C6103b[] newArray(int i10) {
            return new C6103b[i10];
        }

        a() {
        }
    }

    C6103b(C6102a c6102a) {
        int size = c6102a.f55131c.size();
        this.f55199a = new int[size * 6];
        if (!c6102a.f55137i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f55200b = new ArrayList<>(size);
        this.f55201c = new int[size];
        this.f55202d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            S.a aVar = c6102a.f55131c.get(i11);
            int i12 = i10 + 1;
            this.f55199a[i10] = aVar.f55148a;
            ArrayList<String> arrayList = this.f55200b;
            Fragment fragment = aVar.f55149b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f55199a;
            iArr[i12] = aVar.f55150c ? 1 : 0;
            iArr[i10 + 2] = aVar.f55151d;
            iArr[i10 + 3] = aVar.f55152e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f55153f;
            i10 += 6;
            iArr[i13] = aVar.f55154g;
            this.f55201c[i11] = aVar.f55155h.ordinal();
            this.f55202d[i11] = aVar.f55156i.ordinal();
        }
        this.f55203e = c6102a.f55136h;
        this.f55204f = c6102a.f55139k;
        this.f55205g = c6102a.f55195v;
        this.f55206h = c6102a.f55140l;
        this.f55207i = c6102a.f55141m;
        this.f55208j = c6102a.f55142n;
        this.f55209k = c6102a.f55143o;
        this.f55210l = c6102a.f55144p;
        this.f55211m = c6102a.f55145q;
        this.f55212n = c6102a.f55146r;
    }

    private void a(C6102a c6102a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f55199a.length) {
                c6102a.f55136h = this.f55203e;
                c6102a.f55139k = this.f55204f;
                c6102a.f55137i = true;
                c6102a.f55140l = this.f55206h;
                c6102a.f55141m = this.f55207i;
                c6102a.f55142n = this.f55208j;
                c6102a.f55143o = this.f55209k;
                c6102a.f55144p = this.f55210l;
                c6102a.f55145q = this.f55211m;
                c6102a.f55146r = this.f55212n;
                return;
            }
            S.a aVar = new S.a();
            int i12 = i10 + 1;
            aVar.f55148a = this.f55199a[i10];
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Instantiate " + c6102a + " op #" + i11 + " base fragment #" + this.f55199a[i12]);
            }
            aVar.f55155h = AbstractC6165l.b.values()[this.f55201c[i11]];
            aVar.f55156i = AbstractC6165l.b.values()[this.f55202d[i11]];
            int[] iArr = this.f55199a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f55150c = z10;
            int i14 = iArr[i13];
            aVar.f55151d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f55152e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f55153f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f55154g = i18;
            c6102a.f55132d = i14;
            c6102a.f55133e = i15;
            c6102a.f55134f = i17;
            c6102a.f55135g = i18;
            c6102a.f(aVar);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C6102a b(FragmentManager fragmentManager) {
        C6102a c6102a = new C6102a(fragmentManager);
        a(c6102a);
        c6102a.f55195v = this.f55205g;
        for (int i10 = 0; i10 < this.f55200b.size(); i10++) {
            String str = this.f55200b.get(i10);
            if (str != null) {
                c6102a.f55131c.get(i10).f55149b = fragmentManager.findActiveFragment(str);
            }
        }
        c6102a.y(1);
        return c6102a;
    }

    public C6102a c(FragmentManager fragmentManager, Map<String, Fragment> map) {
        C6102a c6102a = new C6102a(fragmentManager);
        a(c6102a);
        for (int i10 = 0; i10 < this.f55200b.size(); i10++) {
            String str = this.f55200b.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f55204f + " failed due to missing saved state for Fragment (" + str + ")");
                }
                c6102a.f55131c.get(i10).f55149b = fragment;
            }
        }
        return c6102a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f55199a);
        parcel.writeStringList(this.f55200b);
        parcel.writeIntArray(this.f55201c);
        parcel.writeIntArray(this.f55202d);
        parcel.writeInt(this.f55203e);
        parcel.writeString(this.f55204f);
        parcel.writeInt(this.f55205g);
        parcel.writeInt(this.f55206h);
        TextUtils.writeToParcel(this.f55207i, parcel, 0);
        parcel.writeInt(this.f55208j);
        TextUtils.writeToParcel(this.f55209k, parcel, 0);
        parcel.writeStringList(this.f55210l);
        parcel.writeStringList(this.f55211m);
        parcel.writeInt(this.f55212n ? 1 : 0);
    }

    C6103b(Parcel parcel) {
        this.f55199a = parcel.createIntArray();
        this.f55200b = parcel.createStringArrayList();
        this.f55201c = parcel.createIntArray();
        this.f55202d = parcel.createIntArray();
        this.f55203e = parcel.readInt();
        this.f55204f = parcel.readString();
        this.f55205g = parcel.readInt();
        this.f55206h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f55207i = (CharSequence) creator.createFromParcel(parcel);
        this.f55208j = parcel.readInt();
        this.f55209k = (CharSequence) creator.createFromParcel(parcel);
        this.f55210l = parcel.createStringArrayList();
        this.f55211m = parcel.createStringArrayList();
        this.f55212n = parcel.readInt() != 0;
    }
}
