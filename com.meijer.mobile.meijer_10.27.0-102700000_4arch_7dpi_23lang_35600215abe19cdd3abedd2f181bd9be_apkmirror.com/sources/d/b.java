package d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.InterfaceC13426a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final boolean f126813a = false;

    /* renamed from: b, reason: collision with root package name */
    final Handler f126814b = null;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC13426a f126815c;

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
    class BinderC1993b extends InterfaceC13426a.AbstractBinderC1991a {
        BinderC1993b() {
        }

        @Override // d.InterfaceC13426a
        public void d5(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f126814b;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f126817a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f126818b;

        c(int i10, Bundle bundle) {
            this.f126817a = i10;
            this.f126818b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f126817a, this.f126818b);
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
                if (this.f126815c == null) {
                    this.f126815c = new BinderC1993b();
                }
                parcel.writeStrongBinder(this.f126815c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b(Parcel parcel) {
        this.f126815c = InterfaceC13426a.AbstractBinderC1991a.A1(parcel.readStrongBinder());
    }
}
