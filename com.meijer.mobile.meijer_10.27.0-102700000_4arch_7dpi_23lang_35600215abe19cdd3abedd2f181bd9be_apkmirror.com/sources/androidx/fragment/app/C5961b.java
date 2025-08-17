package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.S;
import androidx.view.AbstractC6023l;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Map;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5961b implements Parcelable {
    public static final Parcelable.Creator<C5961b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int[] f54975a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<String> f54976b;

    /* renamed from: c, reason: collision with root package name */
    final int[] f54977c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f54978d;

    /* renamed from: e, reason: collision with root package name */
    final int f54979e;

    /* renamed from: f, reason: collision with root package name */
    final String f54980f;

    /* renamed from: g, reason: collision with root package name */
    final int f54981g;

    /* renamed from: h, reason: collision with root package name */
    final int f54982h;

    /* renamed from: i, reason: collision with root package name */
    final CharSequence f54983i;

    /* renamed from: j, reason: collision with root package name */
    final int f54984j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f54985k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList<String> f54986l;

    /* renamed from: m, reason: collision with root package name */
    final ArrayList<String> f54987m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f54988n;

    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator<C5961b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5961b createFromParcel(Parcel parcel) {
            return new C5961b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5961b[] newArray(int i10) {
            return new C5961b[i10];
        }

        a() {
        }
    }

    C5961b(C5960a c5960a) {
        int size = c5960a.f54907c.size();
        this.f54975a = new int[size * 6];
        if (!c5960a.f54913i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f54976b = new ArrayList<>(size);
        this.f54977c = new int[size];
        this.f54978d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            S.a aVar = c5960a.f54907c.get(i11);
            int i12 = i10 + 1;
            this.f54975a[i10] = aVar.f54924a;
            ArrayList<String> arrayList = this.f54976b;
            Fragment fragment = aVar.f54925b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f54975a;
            iArr[i12] = aVar.f54926c ? 1 : 0;
            iArr[i10 + 2] = aVar.f54927d;
            iArr[i10 + 3] = aVar.f54928e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f54929f;
            i10 += 6;
            iArr[i13] = aVar.f54930g;
            this.f54977c[i11] = aVar.f54931h.ordinal();
            this.f54978d[i11] = aVar.f54932i.ordinal();
        }
        this.f54979e = c5960a.f54912h;
        this.f54980f = c5960a.f54915k;
        this.f54981g = c5960a.f54971v;
        this.f54982h = c5960a.f54916l;
        this.f54983i = c5960a.f54917m;
        this.f54984j = c5960a.f54918n;
        this.f54985k = c5960a.f54919o;
        this.f54986l = c5960a.f54920p;
        this.f54987m = c5960a.f54921q;
        this.f54988n = c5960a.f54922r;
    }

    private void a(C5960a c5960a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f54975a.length) {
                c5960a.f54912h = this.f54979e;
                c5960a.f54915k = this.f54980f;
                c5960a.f54913i = true;
                c5960a.f54916l = this.f54982h;
                c5960a.f54917m = this.f54983i;
                c5960a.f54918n = this.f54984j;
                c5960a.f54919o = this.f54985k;
                c5960a.f54920p = this.f54986l;
                c5960a.f54921q = this.f54987m;
                c5960a.f54922r = this.f54988n;
                return;
            }
            S.a aVar = new S.a();
            int i12 = i10 + 1;
            aVar.f54924a = this.f54975a[i10];
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Instantiate " + c5960a + " op #" + i11 + " base fragment #" + this.f54975a[i12]);
            }
            aVar.f54931h = AbstractC6023l.b.values()[this.f54977c[i11]];
            aVar.f54932i = AbstractC6023l.b.values()[this.f54978d[i11]];
            int[] iArr = this.f54975a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f54926c = z10;
            int i14 = iArr[i13];
            aVar.f54927d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f54928e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f54929f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f54930g = i18;
            c5960a.f54908d = i14;
            c5960a.f54909e = i15;
            c5960a.f54910f = i17;
            c5960a.f54911g = i18;
            c5960a.f(aVar);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C5960a b(FragmentManager fragmentManager) {
        C5960a c5960a = new C5960a(fragmentManager);
        a(c5960a);
        c5960a.f54971v = this.f54981g;
        for (int i10 = 0; i10 < this.f54976b.size(); i10++) {
            String str = this.f54976b.get(i10);
            if (str != null) {
                c5960a.f54907c.get(i10).f54925b = fragmentManager.findActiveFragment(str);
            }
        }
        c5960a.y(1);
        return c5960a;
    }

    public C5960a c(FragmentManager fragmentManager, Map<String, Fragment> map) {
        C5960a c5960a = new C5960a(fragmentManager);
        a(c5960a);
        for (int i10 = 0; i10 < this.f54976b.size(); i10++) {
            String str = this.f54976b.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f54980f + " failed due to missing saved state for Fragment (" + str + ")");
                }
                c5960a.f54907c.get(i10).f54925b = fragment;
            }
        }
        return c5960a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f54975a);
        parcel.writeStringList(this.f54976b);
        parcel.writeIntArray(this.f54977c);
        parcel.writeIntArray(this.f54978d);
        parcel.writeInt(this.f54979e);
        parcel.writeString(this.f54980f);
        parcel.writeInt(this.f54981g);
        parcel.writeInt(this.f54982h);
        TextUtils.writeToParcel(this.f54983i, parcel, 0);
        parcel.writeInt(this.f54984j);
        TextUtils.writeToParcel(this.f54985k, parcel, 0);
        parcel.writeStringList(this.f54986l);
        parcel.writeStringList(this.f54987m);
        parcel.writeInt(this.f54988n ? 1 : 0);
    }

    C5961b(Parcel parcel) {
        this.f54975a = parcel.createIntArray();
        this.f54976b = parcel.createStringArrayList();
        this.f54977c = parcel.createIntArray();
        this.f54978d = parcel.createIntArray();
        this.f54979e = parcel.readInt();
        this.f54980f = parcel.readString();
        this.f54981g = parcel.readInt();
        this.f54982h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f54983i = (CharSequence) creator.createFromParcel(parcel);
        this.f54984j = parcel.readInt();
        this.f54985k = (CharSequence) creator.createFromParcel(parcel);
        this.f54986l = parcel.createStringArrayList();
        this.f54987m = parcel.createStringArrayList();
        this.f54988n = parcel.readInt() != 0;
    }
}
