package kotlin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.AbstractC6165l;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010'\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&¨\u0006,"}, d2 = {"Li4/i;", "Landroid/os/Parcelable;", "Li4/h;", "entry", "<init>", "(Li4/h;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Li4/p;", "destination", "Landroidx/lifecycle/l$b;", "hostLifecycleState", "Li4/l;", "viewModel", "c", "(Landroid/content/Context;Li4/p;Landroidx/lifecycle/l$b;Li4/l;)Li4/h;", "", "describeContents", "()I", "parcel", "i", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "I", "destinationId", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "d", "getSavedState", "savedState", "e", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: i4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14668i implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bundle args;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    @JvmField
    public static final Parcelable.Creator<C14668i> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"i4/i$a", "Landroid/os/Parcelable$Creator;", "Li4/i;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Li4/i;", "", "size", "", "b", "(I)[Li4/i;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.i$a */
    public static final class a implements Parcelable.Creator<C14668i> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C14668i createFromParcel(Parcel inParcel) {
            Intrinsics.j(inParcel, "inParcel");
            return new C14668i(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C14668i[] newArray(int size) {
            return new C14668i[size];
        }

        a() {
        }
    }

    public C14668i(C14667h entry) {
        Intrinsics.j(entry, "entry");
        this.id = entry.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        this.destinationId = entry.getDestination().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        this.args = entry.c();
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        entry.i(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: a, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final C14667h c(Context context, C14675p destination, AbstractC6165l.b hostLifecycleState, C14671l viewModel) {
        Intrinsics.j(context, "context");
        Intrinsics.j(destination, "destination");
        Intrinsics.j(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C14667h.INSTANCE.a(context, destination, bundle, hostLifecycleState, viewModel, this.id, this.savedState);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Intrinsics.j(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public C14668i(Parcel inParcel) {
        Intrinsics.j(inParcel, "inParcel");
        String string = inParcel.readString();
        Intrinsics.g(string);
        this.id = string;
        this.destinationId = inParcel.readInt();
        this.args = inParcel.readBundle(C14668i.class.getClassLoader());
        Bundle bundle = inParcel.readBundle(C14668i.class.getClassLoader());
        Intrinsics.g(bundle);
        this.savedState = bundle;
    }
}
