package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/u0;", "Landroidx/compose/runtime/l1;", "Landroid/os/Parcelable;", "", "value", "<init>", "(J)V", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "c", "b", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.compose.runtime.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5889u0 extends MutableLongState implements Parcelable {

    @JvmField
    public static final Parcelable.Creator<C5889u0> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/runtime/u0$a", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/u0;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Landroidx/compose/runtime/u0;", "", "size", "", "b", "(I)[Landroidx/compose/runtime/u0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.u0$a */
    public static final class a implements Parcelable.Creator<C5889u0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5889u0 createFromParcel(Parcel parcel) {
            return new C5889u0(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5889u0[] newArray(int size) {
            return new C5889u0[size];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C5889u0(long j10) {
        super(j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeLong(c());
    }
}
