package d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.InterfaceC13559a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f127615a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f127616b = null;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC13559a f127617c;

    class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }

        a() {
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    class BinderC1998b extends InterfaceC13559a.AbstractBinderC1996a {
        BinderC1998b() {
        }

        @Override // d.InterfaceC13559a
        public void n5(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f127616b;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f127619a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f127620b;

        c(int i10, Bundle bundle) {
            this.f127619a = i10;
            this.f127620b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f127619a, this.f127620b);
        }
    }

    protected void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f127617c == null) {
                    this.f127617c = new BinderC1998b();
                }
                parcel.writeStrongBinder(this.f127617c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b(Parcel parcel) {
        this.f127617c = InterfaceC13559a.AbstractBinderC1996a.K1(parcel.readStrongBinder());
    }
}
